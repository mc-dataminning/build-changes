import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class cxv {
   private final Map<ald, cxv.a> a = Maps.newHashMap();
   private int b;

   public boolean a(cxy $$0) {
      return this.a($$0, 0.0F) > 0.0F;
   }

   public float a(cxy $$0, float $$1) {
      ald $$2 = this.b($$0);
      cxv.a $$3 = this.a.get($$2);
      if ($$3 != null) {
         float $$4 = (float)($$3.b - $$3.a);
         float $$5 = (float)$$3.b - ((float)this.b + $$1);
         return azk.a($$5 / $$4, 0.0F, 1.0F);
      } else {
         return 0.0F;
      }
   }

   public void a() {
      this.b++;
      if (!this.a.isEmpty()) {
         Iterator<Entry<ald, cxv.a>> $$0 = this.a.entrySet().iterator();

         while ($$0.hasNext()) {
            Entry<ald, cxv.a> $$1 = $$0.next();
            if ($$1.getValue().b <= this.b) {
               $$0.remove();
               this.b($$1.getKey());
            }
         }
      }
   }

   public ald b(cxy $$0) {
      dba $$1 = $$0.a(kx.z);
      ald $$2 = md.g.b($$0.h());
      return $$1 == null ? $$2 : $$1.c().orElse($$2);
   }

   public void a(cxy $$0, int $$1) {
      this.a(this.b($$0), $$1);
   }

   public void a(ald $$0, int $$1) {
      this.a.put($$0, new cxv.a(this.b, this.b + $$1));
      this.b($$0, $$1);
   }

   public void a(ald $$0) {
      this.a.remove($$0);
      this.b($$0);
   }

   protected void b(ald $$0, int $$1) {
   }

   protected void b(ald $$0) {
   }

   static record a(int a, int b) {
   }
}
