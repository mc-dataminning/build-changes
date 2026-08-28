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

public class eei {
   private static final Logger g = LogUtils.getLogger();
   private static final Int2ObjectMap<eei> h = new Int2ObjectOpenHashMap();
   private static final Object2ObjectMap<String, eei> i = new Object2ObjectOpenHashMap();
   public static final eei a = a(new eei(1, null, $$0 -> new ayv(new GZIPInputStream($$0)), $$0 -> new BufferedOutputStream(new GZIPOutputStream($$0))));
   public static final eei b = a(
      new eei(2, "deflate", $$0 -> new ayv(new InflaterInputStream($$0)), $$0 -> new BufferedOutputStream(new DeflaterOutputStream($$0)))
   );
   public static final eei c = a(new eei(3, "none", ayv::new, BufferedOutputStream::new));
   public static final eei d = a(
      new eei(4, "lz4", $$0 -> new ayv(new LZ4BlockInputStream($$0)), $$0 -> new BufferedOutputStream(new LZ4BlockOutputStream($$0)))
   );
   public static final eei e = a(new eei(127, null, $$0 -> {
      throw new UnsupportedOperationException();
   }, $$0 -> {
      throw new UnsupportedOperationException();
   }));
   public static final eei f = b;
   private static volatile eei j = f;
   private final int k;
   @Nullable
   private final String l;
   private final eei.a<InputStream> m;
   private final eei.a<OutputStream> n;

   private eei(int $$0, @Nullable String $$1, eei.a<InputStream> $$2, eei.a<OutputStream> $$3) {
      this.k = $$0;
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
   }

   private static eei a(eei $$0) {
      h.put($$0.k, $$0);
      if ($$0.l != null) {
         i.put($$0.l, $$0);
      }

      return $$0;
   }

   @Nullable
   public static eei a(int $$0) {
      return (eei)h.get($$0);
   }

   public static void a(String $$0) {
      eei $$1 = (eei)i.get($$0);
      if ($$1 != null) {
         j = $$1;
      } else {
         g.error("Invalid `region-file-compression` value `{}` in server.properties. Please use one of: {}", $$0, String.join(", ", i.keySet()));
      }
   }

   public static eei a() {
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
