import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class fnw {
   public final Int2ObjectMap<gbh> a = new Int2ObjectOpenHashMap(256);
   private final Int2ObjectMap<gba> b = new Int2ObjectOpenHashMap(256);
   private final gbg c;

   public fnw(gbg $$0) {
      this.c = $$0;
   }

   public gba a(cja $$0) {
      gba $$1 = this.a($$0.d());
      return $$1 == null ? this.c.a() : $$1;
   }

   @Nullable
   public gba a(civ $$0) {
      return (gba)this.b.get(b($$0));
   }

   private static int b(civ $$0) {
      return civ.a($$0);
   }

   public void a(civ $$0, gbh $$1) {
      this.a.put(b($$0), $$1);
   }

   public gbg a() {
      return this.c;
   }

   public void b() {
      this.b.clear();
      ObjectIterator var1 = this.a.entrySet().iterator();

      while (var1.hasNext()) {
         Entry<Integer, gbh> $$0 = (Entry<Integer, gbh>)var1.next();
         this.b.put($$0.getKey(), this.c.a($$0.getValue()));
      }
   }
}
