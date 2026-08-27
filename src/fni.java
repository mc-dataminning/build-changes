import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class fni {
   public final Int2ObjectMap<gat> a = new Int2ObjectOpenHashMap(256);
   private final Int2ObjectMap<gam> b = new Int2ObjectOpenHashMap(256);
   private final gas c;

   public fni(gas $$0) {
      this.c = $$0;
   }

   public gam a(ciy $$0) {
      gam $$1 = this.a($$0.d());
      return $$1 == null ? this.c.a() : $$1;
   }

   @Nullable
   public gam a(cit $$0) {
      return (gam)this.b.get(b($$0));
   }

   private static int b(cit $$0) {
      return cit.a($$0);
   }

   public void a(cit $$0, gat $$1) {
      this.a.put(b($$0), $$1);
   }

   public gas a() {
      return this.c;
   }

   public void b() {
      this.b.clear();
      ObjectIterator var1 = this.a.entrySet().iterator();

      while (var1.hasNext()) {
         Entry<Integer, gat> $$0 = (Entry<Integer, gat>)var1.next();
         this.b.put($$0.getKey(), this.c.a($$0.getValue()));
      }
   }
}
