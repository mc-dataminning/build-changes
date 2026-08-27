import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

class fqp {
   private final Map<gu, dcl> a;
   @Nullable
   private final List<dho<dez>> b;
   private final boolean c;
   private final dhg d;

   fqp(dhg $$0) {
      this.d = $$0;
      this.c = $$0.F().af();
      this.a = ImmutableMap.copyOf($$0.G());
      if ($$0 instanceof dhc) {
         this.b = null;
      } else {
         dhh[] $$1 = $$0.d();
         this.b = new ArrayList<>($$1.length);

         for (dhh $$2 : $$1) {
            this.b.add($$2.c() ? null : $$2.h().d());
         }
      }
   }

   @Nullable
   public dcl a(gu $$0) {
      return this.a.get($$0);
   }

   public dez b(gu $$0) {
      int $$1 = $$0.u();
      int $$2 = $$0.v();
      int $$3 = $$0.w();
      if (this.c) {
         dez $$4 = null;
         if ($$2 == 60) {
            $$4 = csm.hW.n();
         }

         if ($$2 == 70) {
            $$4 = djz.a($$1, $$3);
         }

         return $$4 == null ? csm.a.n() : $$4;
      } else if (this.b == null) {
         return csm.a.n();
      } else {
         try {
            int $$5 = this.d.e($$2);
            if ($$5 >= 0 && $$5 < this.b.size()) {
               dho<dez> $$6 = this.b.get($$5);
               if ($$6 != null) {
                  return $$6.a($$1 & 15, $$2 & 15, $$3 & 15);
               }
            }

            return csm.a.n();
         } catch (Throwable var8) {
            o $$8 = o.a(var8, "Getting block state");
            p $$9 = $$8.a("Block being got");
            $$9.a("Location", () -> p.a(this.d, $$1, $$2, $$3));
            throw new y($$8);
         }
      }
   }
}
