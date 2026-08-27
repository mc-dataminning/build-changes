import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class fnx {
   public final Int2ObjectMap<gbi> a = new Int2ObjectOpenHashMap(256);
   private final Int2ObjectMap<gbb> b = new Int2ObjectOpenHashMap(256);
   private final gbh c;

   public fnx(gbh $$0) {
      this.c = $$0;
   }

   public gbb a(cjl $$0) {
      gbb $$1 = this.a($$0.d());
      return $$1 == null ? this.c.a() : $$1;
   }

   @Nullable
   public gbb a(cjg $$0) {
      return (gbb)this.b.get(b($$0));
   }

   private static int b(cjg $$0) {
      return cjg.a($$0);
   }

   public void a(cjg $$0, gbi $$1) {
      this.a.put(b($$0), $$1);
   }

   public gbh a() {
      return this.c;
   }

   public void b() {
      this.b.clear();
      ObjectIterator var1 = this.a.entrySet().iterator();

      while (var1.hasNext()) {
         Entry<Integer, gbi> $$0 = (Entry<Integer, gbi>)var1.next();
         this.b.put($$0.getKey(), this.c.a($$0.getValue()));
      }
   }
}
