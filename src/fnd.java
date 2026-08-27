import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class fnd {
   public final Int2ObjectMap<gao> a = new Int2ObjectOpenHashMap(256);
   private final Int2ObjectMap<gah> b = new Int2ObjectOpenHashMap(256);
   private final gan c;

   public fnd(gan $$0) {
      this.c = $$0;
   }

   public gah a(ciw $$0) {
      gah $$1 = this.a($$0.d());
      return $$1 == null ? this.c.a() : $$1;
   }

   @Nullable
   public gah a(cir $$0) {
      return (gah)this.b.get(b($$0));
   }

   private static int b(cir $$0) {
      return cir.a($$0);
   }

   public void a(cir $$0, gao $$1) {
      this.a.put(b($$0), $$1);
   }

   public gan a() {
      return this.c;
   }

   public void b() {
      this.b.clear();
      ObjectIterator var1 = this.a.entrySet().iterator();

      while (var1.hasNext()) {
         Entry<Integer, gao> $$0 = (Entry<Integer, gao>)var1.next();
         this.b.put($$0.getKey(), this.c.a($$0.getValue()));
      }
   }
}
