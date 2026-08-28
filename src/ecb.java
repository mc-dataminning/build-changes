import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import java.util.zip.InflaterInputStream;
import javax.annotation.Nullable;
import net.jpountz.lz4.LZ4BlockInputStream;
import net.jpountz.lz4.LZ4BlockOutputStream;
import org.slf4j.Logger;

public class ecb {
   private static final Logger g = LogUtils.getLogger();
   private static final Int2ObjectMap<ecb> h = new Int2ObjectOpenHashMap();
   private static final Object2ObjectMap<String, ecb> i = new Object2ObjectOpenHashMap();
   public static final ecb a = a(new ecb(1, null, $$0 -> new ayt(new GZIPInputStream($$0)), $$0 -> new BufferedOutputStream(new GZIPOutputStream($$0))));
   public static final ecb b = a(
      new ecb(2, "deflate", $$0 -> new ayt(new InflaterInputStream($$0)), $$0 -> new BufferedOutputStream(new DeflaterOutputStream($$0)))
   );
   public static final ecb c = a(new ecb(3, "none", ayt::new, BufferedOutputStream::new));
   public static final ecb d = a(
      new ecb(4, "lz4", $$0 -> new ayt(new LZ4BlockInputStream($$0)), $$0 -> new BufferedOutputStream(new LZ4BlockOutputStream($$0)))
   );
   public static final ecb e = a(new ecb(127, null, $$0 -> {
      throw new UnsupportedOperationException();
   }, $$0 -> {
      throw new UnsupportedOperationException();
   }));
   public static final ecb f = b;
   private static volatile ecb j = f;
   private final int k;
   @Nullable
   private final String l;
   private final ecb.a<InputStream> m;
   private final ecb.a<OutputStream> n;

   private ecb(int $$0, @Nullable String $$1, ecb.a<InputStream> $$2, ecb.a<OutputStream> $$3) {
      this.k = $$0;
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
   }

   private static ecb a(ecb $$0) {
      h.put($$0.k, $$0);
      if ($$0.l != null) {
         i.put($$0.l, $$0);
      }

      return $$0;
   }

   @Nullable
   public static ecb a(int $$0) {
      return (ecb)h.get($$0);
   }

   public static void a(String $$0) {
      ecb $$1 = (ecb)i.get($$0);
      if ($$1 != null) {
         j = $$1;
      } else {
         g.error("Invalid `region-file-compression` value `{}` in server.properties. Please use one of: {}", $$0, String.join(", ", i.keySet()));
      }
   }

   public static ecb a() {
      return j;
   }

   public static boolean b(int $$0) {
      return h.containsKey($$0);
   }

   public int b() {
      return this.k;
   }

   public OutputStream a(OutputStream $$0) throws IOException {
      return this.n.wrap($$0);
   }

   public InputStream a(InputStream $$0) throws IOException {
      return this.m.wrap($$0);
   }

   @FunctionalInterface
   interface a<O> {
      O wrap(O var1) throws IOException;
   }
}
