import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class ftq {
   public final Int2ObjectMap<ghi> a = new Int2ObjectOpenHashMap(256);
   private final Int2ObjectMap<ghb> b = new Int2ObjectOpenHashMap(256);
   private final ghh c;

   public ftq(ghh $$0) {
      this.c = $$0;
   }

   public ghb a(cng $$0) {
      ghb $$1 = this.a($$0.d());
      return $$1 == null ? this.c.a() : $$1;
   }

   @Nullable
   public ghb a(cnb $$0) {
      return (ghb)this.b.get(b($$0));
   }

   private static int b(cnb $$0) {
      return cnb.a($$0);
   }

   public void a(cnb $$0, ghi $$1) {
      this.a.put(b($$0), $$1);
   }

   public ghh a() {
      return this.c;
   }

   public void b() {
      this.b.clear();
      ObjectIterator var1 = this.a.entrySet().iterator();

      while (var1.hasNext()) {
         Entry<Integer, ghi> $$0 = (Entry<Integer, ghi>)var1.next();
         this.b.put($$0.getKey(), this.c.a($$0.getValue()));
      }
   }
}
