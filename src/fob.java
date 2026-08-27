import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class fob {
   public final Int2ObjectMap<gbm> a = new Int2ObjectOpenHashMap(256);
   private final Int2ObjectMap<gbf> b = new Int2ObjectOpenHashMap(256);
   private final gbl c;

   public fob(gbl $$0) {
      this.c = $$0;
   }

   public gbf a(cjf $$0) {
      gbf $$1 = this.a($$0.d());
      return $$1 == null ? this.c.a() : $$1;
   }

   @Nullable
   public gbf a(cja $$0) {
      return (gbf)this.b.get(b($$0));
   }

   private static int b(cja $$0) {
      return cja.a($$0);
   }

   public void a(cja $$0, gbm $$1) {
      this.a.put(b($$0), $$1);
   }

   public gbl a() {
      return this.c;
   }

   public void b() {
      this.b.clear();
      ObjectIterator var1 = this.a.entrySet().iterator();

      while (var1.hasNext()) {
         Entry<Integer, gbm> $$0 = (Entry<Integer, gbm>)var1.next();
         this.b.put($$0.getKey(), this.c.a($$0.getValue()));
      }
   }
}
