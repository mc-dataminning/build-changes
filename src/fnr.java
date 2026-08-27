import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class fnr {
   public final Int2ObjectMap<gbc> a = new Int2ObjectOpenHashMap(256);
   private final Int2ObjectMap<gav> b = new Int2ObjectOpenHashMap(256);
   private final gbb c;

   public fnr(gbb $$0) {
      this.c = $$0;
   }

   public gav a(cix $$0) {
      gav $$1 = this.a($$0.d());
      return $$1 == null ? this.c.a() : $$1;
   }

   @Nullable
   public gav a(cis $$0) {
      return (gav)this.b.get(b($$0));
   }

   private static int b(cis $$0) {
      return cis.a($$0);
   }

   public void a(cis $$0, gbc $$1) {
      this.a.put(b($$0), $$1);
   }

   public gbb a() {
      return this.c;
   }

   public void b() {
      this.b.clear();
      ObjectIterator var1 = this.a.entrySet().iterator();

      while (var1.hasNext()) {
         Entry<Integer, gbc> $$0 = (Entry<Integer, gbc>)var1.next();
         this.b.put($$0.getKey(), this.c.a($$0.getValue()));
      }
   }
}
