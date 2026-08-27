import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class fsf {
   public final Int2ObjectMap<gfw> a = new Int2ObjectOpenHashMap(256);
   private final Int2ObjectMap<gfp> b = new Int2ObjectOpenHashMap(256);
   private final gfv c;

   public fsf(gfv $$0) {
      this.c = $$0;
   }

   public gfp a(cmh $$0) {
      gfp $$1 = this.a($$0.d());
      return $$1 == null ? this.c.a() : $$1;
   }

   @Nullable
   public gfp a(cmc $$0) {
      return (gfp)this.b.get(b($$0));
   }

   private static int b(cmc $$0) {
      return cmc.a($$0);
   }

   public void a(cmc $$0, gfw $$1) {
      this.a.put(b($$0), $$1);
   }

   public gfv a() {
      return this.c;
   }

   public void b() {
      this.b.clear();
      ObjectIterator var1 = this.a.entrySet().iterator();

      while (var1.hasNext()) {
         Entry<Integer, gfw> $$0 = (Entry<Integer, gfw>)var1.next();
         this.b.put($$0.getKey(), this.c.a($$0.getValue()));
      }
   }
}
