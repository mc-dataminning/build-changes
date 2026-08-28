import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class ccy<T extends cql> extends cce {
   private static final int a = 20;
   private static final float b = 1.0F;
   private final T c;
   private int d;

   public ccy(T $$0) {
      this.c = $$0;
      this.a(EnumSet.of(cce.a.a));
   }

   @Override
   public boolean b() {
      return this.c.O_() == null && !this.c.cY() && this.c.gF() && !this.c.gC().a() && !((arc)this.c.dW()).c(this.c.dw());
   }

   @Override
   public boolean c() {
      return this.c.gF() && !this.c.gC().a() && this.c.dW() instanceof arc && !((arc)this.c.dW()).c(this.c.dw());
   }

   @Override
   public void a() {
      if (this.c.gF()) {
         cqk $$0 = this.c.gC();
         if (this.c.af > this.d) {
            this.d = this.c.af + 20;
            this.a($$0);
         }

         if (!this.c.gl()) {
            fba $$1 = cgb.a(this.c, 15, 4, fba.c($$0.s()), (float) (Math.PI / 2));
            if ($$1 != null) {
               this.c.L().a($$1.d, $$1.e, $$1.f, 1.0);
            }
         }
      }
   }

   private void a(cqk $$0) {
      if ($$0.u()) {
         Set<cql> $$1 = Sets.newHashSet();
         List<cql> $$2 = this.c.dW().a(cql.class, this.c.cR().g(16.0), $$1x -> !$$1x.gF() && cqm.a($$1x, $$0));
         $$1.addAll($$2);

         for (cql $$3 : $$1) {
            $$0.a($$0.k(), $$3, null, true);
         }
      }
   }
}
