import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class fqe {
   public final Int2ObjectMap<gdp> a = new Int2ObjectOpenHashMap(256);
   private final Int2ObjectMap<gdi> b = new Int2ObjectOpenHashMap(256);
   private final gdo c;

   public fqe(gdo $$0) {
      this.c = $$0;
   }

   public gdi a(clb $$0) {
      gdi $$1 = this.a($$0.d());
      return $$1 == null ? this.c.a() : $$1;
   }

   @Nullable
   public gdi a(ckw $$0) {
      return (gdi)this.b.get(b($$0));
   }

   private static int b(ckw $$0) {
      return ckw.a($$0);
   }

   public void a(ckw $$0, gdp $$1) {
      this.a.put(b($$0), $$1);
   }

   public gdo a() {
      return this.c;
   }

   public void b() {
      this.b.clear();
      ObjectIterator var1 = this.a.entrySet().iterator();

      while (var1.hasNext()) {
         Entry<Integer, gdp> $$0 = (Entry<Integer, gdp>)var1.next();
         this.b.put($$0.getKey(), this.c.a($$0.getValue()));
      }
   }
}
