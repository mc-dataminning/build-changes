import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class ces<T extends cso> extends cdy {
   private static final int a = 20;
   private static final float b = 1.0F;
   private final T c;
   private int d;

   public ces(T $$0) {
      this.c = $$0;
      this.a(EnumSet.of(cdy.a.a));
   }

   @Override
   public boolean b() {
      return this.c.f() == null && !this.c.cX() && this.c.gE() && !this.c.gB().a() && !a(this.c.dV()).c(this.c.dv());
   }

   @Override
   public boolean c() {
      return this.c.gE() && !this.c.gB().a() && !a(this.c.dV()).c(this.c.dv());
   }

   @Override
   public void a() {
      if (this.c.gE()) {
         csn $$0 = this.c.gB();
         if (this.c.af > this.d) {
            this.d = this.c.af + 20;
            this.a($$0);
         }

         if (!this.c.gm()) {
            fei $$1 = chv.a(this.c, 15, 4, fei.c($$0.q()), (float) (Math.PI / 2));
            if ($$1 != null) {
               this.c.O().a($$1.d, $$1.e, $$1.f, 1.0);
            }
         }
      }
   }

   private void a(csn $$0) {
      if ($$0.r()) {
         arq $$1 = a(this.c.dV());
         Set<cso> $$2 = Sets.newHashSet();
         List<cso> $$3 = $$1.a(cso.class, this.c.cR().g(16.0), $$0x -> !$$0x.gE() && csp.a($$0x));
         $$2.addAll($$3);

         for (cso $$4 : $$2) {
            $$0.a($$1, $$0.j(), $$4, null, true);
         }
      }
   }
}
