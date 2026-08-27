import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class fqr {
   public final Int2ObjectMap<gec> a = new Int2ObjectOpenHashMap(256);
   private final Int2ObjectMap<gdv> b = new Int2ObjectOpenHashMap(256);
   private final geb c;

   public fqr(geb $$0) {
      this.c = $$0;
   }

   public gdv a(clj $$0) {
      gdv $$1 = this.a($$0.d());
      return $$1 == null ? this.c.a() : $$1;
   }

   @Nullable
   public gdv a(cle $$0) {
      return (gdv)this.b.get(b($$0));
   }

   private static int b(cle $$0) {
      return cle.a($$0);
   }

   public void a(cle $$0, gec $$1) {
      this.a.put(b($$0), $$1);
   }

   public geb a() {
      return this.c;
   }

   public void b() {
      this.b.clear();
      ObjectIterator var1 = this.a.entrySet().iterator();

      while (var1.hasNext()) {
         Entry<Integer, gec> $$0 = (Entry<Integer, gec>)var1.next();
         this.b.put($$0.getKey(), this.c.a($$0.getValue()));
      }
   }
}
