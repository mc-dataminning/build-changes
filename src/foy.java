import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class foy {
   public final Int2ObjectMap<gci> a = new Int2ObjectOpenHashMap(256);
   private final Int2ObjectMap<gcb> b = new Int2ObjectOpenHashMap(256);
   private final gch c;

   public foy(gch $$0) {
      this.c = $$0;
   }

   public gcb a(ckj $$0) {
      gcb $$1 = this.a($$0.d());
      return $$1 == null ? this.c.a() : $$1;
   }

   @Nullable
   public gcb a(cke $$0) {
      return (gcb)this.b.get(b($$0));
   }

   private static int b(cke $$0) {
      return cke.a($$0);
   }

   public void a(cke $$0, gci $$1) {
      this.a.put(b($$0), $$1);
   }

   public gch a() {
      return this.c;
   }

   public void b() {
      this.b.clear();
      ObjectIterator var1 = this.a.entrySet().iterator();

      while (var1.hasNext()) {
         Entry<Integer, gci> $$0 = (Entry<Integer, gci>)var1.next();
         this.b.put($$0.getKey(), this.c.a($$0.getValue()));
      }
   }
}
