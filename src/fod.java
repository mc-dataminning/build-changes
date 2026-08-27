import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class fod {
   public final Int2ObjectMap<gbo> a = new Int2ObjectOpenHashMap(256);
   private final Int2ObjectMap<gbh> b = new Int2ObjectOpenHashMap(256);
   private final gbn c;

   public fod(gbn $$0) {
      this.c = $$0;
   }

   public gbh a(cjh $$0) {
      gbh $$1 = this.a($$0.d());
      return $$1 == null ? this.c.a() : $$1;
   }

   @Nullable
   public gbh a(cjc $$0) {
      return (gbh)this.b.get(b($$0));
   }

   private static int b(cjc $$0) {
      return cjc.a($$0);
   }

   public void a(cjc $$0, gbo $$1) {
      this.a.put(b($$0), $$1);
   }

   public gbn a() {
      return this.c;
   }

   public void b() {
      this.b.clear();
      ObjectIterator var1 = this.a.entrySet().iterator();

      while (var1.hasNext()) {
         Entry<Integer, gbo> $$0 = (Entry<Integer, gbo>)var1.next();
         this.b.put($$0.getKey(), this.c.a($$0.getValue()));
      }
   }
}
