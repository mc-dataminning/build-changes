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

public class dkr {
   private static final Int2ObjectMap<dkr> d = new Int2ObjectOpenHashMap();
   public static final dkr a = a(new dkr(1, $$0 -> new asz(new GZIPInputStream($$0)), $$0 -> new BufferedOutputStream(new GZIPOutputStream($$0))));
   public static final dkr b = a(new dkr(2, $$0 -> new asz(new InflaterInputStream($$0)), $$0 -> new BufferedOutputStream(new DeflaterOutputStream($$0))));
   public static final dkr c = a(new dkr(3, $$0 -> $$0, $$0 -> $$0));
   private final int e;
   private final dkr.a<InputStream> f;
   private final dkr.a<OutputStream> g;

   private dkr(int $$0, dkr.a<InputStream> $$1, dkr.a<OutputStream> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   private static dkr a(dkr $$0) {
      d.put($$0.e, $$0);
      return $$0;
   }

   @Nullable
   public static dkr a(int $$0) {
      return (dkr)d.get($$0);
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
