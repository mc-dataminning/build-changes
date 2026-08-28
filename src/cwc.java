import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class cwc {
   private final Map<all, cwc.a> a = Maps.newHashMap();
   private int b;

   public boolean a(cwf $$0) {
      return this.a($$0, 0.0F) > 0.0F;
   }

   public float a(cwf $$0, float $$1) {
      all $$2 = this.b($$0);
      cwc.a $$3 = this.a.get($$2);
      if ($$3 != null) {
         float $$4 = (float)($$3.b - $$3.a);
         float $$5 = (float)$$3.b - ((float)this.b + $$1);
         return azn.a($$5 / $$4, 0.0F, 1.0F);
      } else {
         return 0.0F;
      }
   }

   public void a() {
      this.b++;
      if (!this.a.isEmpty()) {
         Iterator<Entry<all, cwc.a>> $$0 = this.a.entrySet().iterator();

         while ($$0.hasNext()) {
            Entry<all, cwc.a> $$1 = $$0.next();
            if ($$1.getValue().b <= this.b) {
               $$0.remove();
               this.b($$1.getKey());
            }
         }
      }
   }

   public all b(cwf $$0) {
      czk $$1 = $$0.a(ku.z);
      all $$2 = lz.g.b($$0.h());
      return $$1 == null ? $$2 : $$1.c().orElse($$2);
   }

   public void a(cwf $$0, int $$1) {
      this.a(this.b($$0), $$1);
   }

   public void a(all $$0, int $$1) {
      this.a.put($$0, new cwc.a(this.b, this.b + $$1));
      this.b($$0, $$1);
   }

   public void a(all $$0) {
      this.a.remove($$0);
      this.b($$0);
   }

   protected void b(all $$0, int $$1) {
   }

   protected void b(all $$0) {
   }

   static record a(int a, int b) {
   }
}
