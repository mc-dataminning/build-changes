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

public class dop {
   private static final Logger f = LogUtils.getLogger();
   private static final Int2ObjectMap<dop> g = new Int2ObjectOpenHashMap();
   private static final Object2ObjectMap<String, dop> h = new Object2ObjectOpenHashMap();
   public static final dop a = a(new dop(1, null, $$0 -> new avr(new GZIPInputStream($$0)), $$0 -> new BufferedOutputStream(new GZIPOutputStream($$0))));
   public static final dop b = a(
      new dop(2, "deflate", $$0 -> new avr(new InflaterInputStream($$0)), $$0 -> new BufferedOutputStream(new DeflaterOutputStream($$0)))
   );
   public static final dop c = a(new dop(3, null, $$0 -> $$0, $$0 -> $$0));
   public static final dop d = a(
      new dop(4, "lz4", $$0 -> new avr(new LZ4BlockInputStream($$0)), $$0 -> new BufferedOutputStream(new LZ4BlockOutputStream($$0)))
   );
   public static final dop e = b;
   private static volatile dop i = e;
   private final int j;
   @Nullable
   private final String k;
   private final dop.a<InputStream> l;
   private final dop.a<OutputStream> m;

   private dop(int $$0, @Nullable String $$1, dop.a<InputStream> $$2, dop.a<OutputStream> $$3) {
      this.j = $$0;
      this.k = $$1;
      this.l = $$2;
      this.m = $$3;
   }

   private static dop a(dop $$0) {
      g.put($$0.j, $$0);
      if ($$0.k != null) {
         h.put($$0.k, $$0);
      }

      return $$0;
   }

   @Nullable
   public static dop a(int $$0) {
      return (dop)g.get($$0);
   }

   public static void a(String $$0) {
      dop $$1 = (dop)h.get($$0);
      if ($$1 != null) {
         i = $$1;
      } else {
         f.error("Invalid `region-file-compression` value `{}` in server.properties. Please use one of: {}", $$0, String.join(", ", h.keySet()));
      }
   }

   public static dop a() {
      return i;
   }

   public static boolean b(int $$0) {
      return g.containsKey($$0);
   }

   public int b() {
      return this.j;
   }

   public OutputStream a(OutputStream $$0) throws IOException {
      return this.m.wrap($$0);
   }

   public InputStream a(InputStream $$0) throws IOException {
      return this.l.wrap($$0);
   }

   @FunctionalInterface
   interface a<O> {
      O wrap(O var1) throws IOException;
   }
}
