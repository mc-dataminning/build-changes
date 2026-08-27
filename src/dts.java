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

public class dts {
   private static final Logger g = LogUtils.getLogger();
   private static final Int2ObjectMap<dts> h = new Int2ObjectOpenHashMap();
   private static final Object2ObjectMap<String, dts> i = new Object2ObjectOpenHashMap();
   public static final dts a = a(new dts(1, null, $$0 -> new axi(new GZIPInputStream($$0)), $$0 -> new BufferedOutputStream(new GZIPOutputStream($$0))));
   public static final dts b = a(
      new dts(2, "deflate", $$0 -> new axi(new InflaterInputStream($$0)), $$0 -> new BufferedOutputStream(new DeflaterOutputStream($$0)))
   );
   public static final dts c = a(new dts(3, "none", axi::new, BufferedOutputStream::new));
   public static final dts d = a(
      new dts(4, "lz4", $$0 -> new axi(new LZ4BlockInputStream($$0)), $$0 -> new BufferedOutputStream(new LZ4BlockOutputStream($$0)))
   );
   public static final dts e = a(new dts(127, null, $$0 -> {
      throw new UnsupportedOperationException();
   }, $$0 -> {
      throw new UnsupportedOperationException();
   }));
   public static final dts f = b;
   private static volatile dts j = f;
   private final int k;
   @Nullable
   private final String l;
   private final dts.a<InputStream> m;
   private final dts.a<OutputStream> n;

   private dts(int $$0, @Nullable String $$1, dts.a<InputStream> $$2, dts.a<OutputStream> $$3) {
      this.k = $$0;
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
   }

   private static dts a(dts $$0) {
      h.put($$0.k, $$0);
      if ($$0.l != null) {
         i.put($$0.l, $$0);
      }

      return $$0;
   }

   @Nullable
   public static dts a(int $$0) {
      return (dts)h.get($$0);
   }

   public static void a(String $$0) {
      dts $$1 = (dts)i.get($$0);
      if ($$1 != null) {
         j = $$1;
      } else {
         g.error("Invalid `region-file-compression` value `{}` in server.properties. Please use one of: {}", $$0, String.join(", ", i.keySet()));
      }
   }

   public static dts a() {
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
