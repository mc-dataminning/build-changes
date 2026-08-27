import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class ftd {
   public final Int2ObjectMap<ggt> a = new Int2ObjectOpenHashMap(256);
   private final Int2ObjectMap<ggm> b = new Int2ObjectOpenHashMap(256);
   private final ggs c;

   public ftd(ggs $$0) {
      this.c = $$0;
   }

   public ggm a(cmx $$0) {
      ggm $$1 = this.a($$0.d());
      return $$1 == null ? this.c.a() : $$1;
   }

   @Nullable
   public ggm a(cms $$0) {
      return (ggm)this.b.get(b($$0));
   }

   private static int b(cms $$0) {
      return cms.a($$0);
   }

   public void a(cms $$0, ggt $$1) {
      this.a.put(b($$0), $$1);
   }

   public ggs a() {
      return this.c;
   }

   public void b() {
      this.b.clear();
      ObjectIterator var1 = this.a.entrySet().iterator();

      while (var1.hasNext()) {
         Entry<Integer, ggt> $$0 = (Entry<Integer, ggt>)var1.next();
         this.b.put($$0.getKey(), this.c.a($$0.getValue()));
      }
   }
}
