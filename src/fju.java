import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class fju {
   public final Int2ObjectMap<fwy> a = new Int2ObjectOpenHashMap(256);
   private final Int2ObjectMap<fwr> b = new Int2ObjectOpenHashMap(256);
   private final fwx c;

   public fju(fwx $$0) {
      this.c = $$0;
   }

   public fwr a(cfz $$0) {
      fwr $$1 = this.a($$0.d());
      return $$1 == null ? this.c.a() : $$1;
   }

   @Nullable
   public fwr a(cfu $$0) {
      return (fwr)this.b.get(b($$0));
   }

   private static int b(cfu $$0) {
      return cfu.a($$0);
   }

   public void a(cfu $$0, fwy $$1) {
      this.a.put(b($$0), $$1);
   }

   public fwx a() {
      return this.c;
   }

   public void b() {
      this.b.clear();
      ObjectIterator var1 = this.a.entrySet().iterator();

      while (var1.hasNext()) {
         Entry<Integer, fwy> $$0 = (Entry<Integer, fwy>)var1.next();
         this.b.put($$0.getKey(), this.c.a($$0.getValue()));
      }
   }
}
