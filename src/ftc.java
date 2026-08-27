import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class ftc {
   public final Int2ObjectMap<ggs> a = new Int2ObjectOpenHashMap(256);
   private final Int2ObjectMap<ggl> b = new Int2ObjectOpenHashMap(256);
   private final ggr c;

   public ftc(ggr $$0) {
      this.c = $$0;
   }

   public ggl a(cmx $$0) {
      ggl $$1 = this.a($$0.d());
      return $$1 == null ? this.c.a() : $$1;
   }

   @Nullable
   public ggl a(cms $$0) {
      return (ggl)this.b.get(b($$0));
   }

   private static int b(cms $$0) {
      return cms.a($$0);
   }

   public void a(cms $$0, ggs $$1) {
      this.a.put(b($$0), $$1);
   }

   public ggr a() {
      return this.c;
   }

   public void b() {
      this.b.clear();
      ObjectIterator var1 = this.a.entrySet().iterator();

      while (var1.hasNext()) {
         Entry<Integer, ggs> $$0 = (Entry<Integer, ggs>)var1.next();
         this.b.put($$0.getKey(), this.c.a($$0.getValue()));
      }
   }
}
