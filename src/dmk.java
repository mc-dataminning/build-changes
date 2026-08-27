import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import java.util.zip.InflaterInputStream;
import javax.annotation.Nullable;

public class dmk {
   private static final Int2ObjectMap<dmk> d = new Int2ObjectOpenHashMap();
   public static final dmk a = a(new dmk(1, $$0 -> new atw(new GZIPInputStream($$0)), $$0 -> new BufferedOutputStream(new GZIPOutputStream($$0))));
   public static final dmk b = a(new dmk(2, $$0 -> new atw(new InflaterInputStream($$0)), $$0 -> new BufferedOutputStream(new DeflaterOutputStream($$0))));
   public static final dmk c = a(new dmk(3, $$0 -> $$0, $$0 -> $$0));
   private final int e;
   private final dmk.a<InputStream> f;
   private final dmk.a<OutputStream> g;

   private dmk(int $$0, dmk.a<InputStream> $$1, dmk.a<OutputStream> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   private static dmk a(dmk $$0) {
      d.put($$0.e, $$0);
      return $$0;
   }

   @Nullable
   public static dmk a(int $$0) {
      return (dmk)d.get($$0);
   }

   public static boolean b(int $$0) {
      return d.containsKey($$0);
   }

   public int a() {
      return this.e;
   }

   public OutputStream a(OutputStream $$0) throws IOException {
      return this.g.wrap($$0);
   }

   public InputStream a(InputStream $$0) throws IOException {
      return this.f.wrap($$0);
   }

   @FunctionalInterface
   interface a<O> {
      O wrap(O var1) throws IOException;
   }
}
