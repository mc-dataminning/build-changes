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

public class dvp {
   private static final Logger g = LogUtils.getLogger();
   private static final Int2ObjectMap<dvp> h = new Int2ObjectOpenHashMap();
   private static final Object2ObjectMap<String, dvp> i = new Object2ObjectOpenHashMap();
   public static final dvp a = a(new dvp(1, null, $$0 -> new ayi(new GZIPInputStream($$0)), $$0 -> new BufferedOutputStream(new GZIPOutputStream($$0))));
   public static final dvp b = a(
      new dvp(2, "deflate", $$0 -> new ayi(new InflaterInputStream($$0)), $$0 -> new BufferedOutputStream(new DeflaterOutputStream($$0)))
   );
   public static final dvp c = a(new dvp(3, "none", ayi::new, BufferedOutputStream::new));
   public static final dvp d = a(
      new dvp(4, "lz4", $$0 -> new ayi(new LZ4BlockInputStream($$0)), $$0 -> new BufferedOutputStream(new LZ4BlockOutputStream($$0)))
   );
   public static final dvp e = a(new dvp(127, null, $$0 -> {
      throw new UnsupportedOperationException();
   }, $$0 -> {
      throw new UnsupportedOperationException();
   }));
   public static final dvp f = b;
   private static volatile dvp j = f;
   private final int k;
   @Nullable
   private final String l;
   private final dvp.a<InputStream> m;
   private final dvp.a<OutputStream> n;

   private dvp(int $$0, @Nullable String $$1, dvp.a<InputStream> $$2, dvp.a<OutputStream> $$3) {
      this.k = $$0;
      this.l = $$1;
      this.m = $$2;
      this.n = $$3;
   }

   private static dvp a(dvp $$0) {
      h.put($$0.k, $$0);
      if ($$0.l != null) {
         i.put($$0.l, $$0);
      }

      return $$0;
   }

   @Nullable
   public static dvp a(int $$0) {
      return (dvp)h.get($$0);
   }

   public static void a(String $$0) {
      dvp $$1 = (dvp)i.get($$0);
      if ($$1 != null) {
         j = $$1;
      } else {
         g.error("Invalid `region-file-compression` value `{}` in server.properties. Please use one of: {}", $$0, String.join(", ", i.keySet()));
      }
   }

   public static dvp a() {
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
