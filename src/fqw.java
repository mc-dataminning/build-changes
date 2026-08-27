import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class fqw {
   public final Int2ObjectMap<geh> a = new Int2ObjectOpenHashMap(256);
   private final Int2ObjectMap<gea> b = new Int2ObjectOpenHashMap(256);
   private final geg c;

   public fqw(geg $$0) {
      this.c = $$0;
   }

   public gea a(clo $$0) {
      gea $$1 = this.a($$0.d());
      return $$1 == null ? this.c.a() : $$1;
   }

   @Nullable
   public gea a(clj $$0) {
      return (gea)this.b.get(b($$0));
   }

   private static int b(clj $$0) {
      return clj.a($$0);
   }

   public void a(clj $$0, geh $$1) {
      this.a.put(b($$0), $$1);
   }

   public geg a() {
      return this.c;
   }

   public void b() {
      this.b.clear();
      ObjectIterator var1 = this.a.entrySet().iterator();

      while (var1.hasNext()) {
         Entry<Integer, geh> $$0 = (Entry<Integer, geh>)var1.next();
         this.b.put($$0.getKey(), this.c.a($$0.getValue()));
      }
   }
}
