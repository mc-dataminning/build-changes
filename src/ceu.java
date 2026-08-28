import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class ceu<T extends cst> extends cea {
   private static final int a = 20;
   private static final float b = 1.0F;
   private final T c;
   private int d;

   public ceu(T $$0) {
      this.c = $$0;
      this.a(EnumSet.of(cea.a.a));
   }

   @Override
   public boolean b() {
      return this.c.f() == null && !this.c.cX() && this.c.gF() && !this.c.gC().a() && !a(this.c.dV()).c(this.c.dv());
   }

   @Override
   public boolean c() {
      return this.c.gF() && !this.c.gC().a() && !a(this.c.dV()).c(this.c.dv());
   }

   @Override
   public void a() {
      if (this.c.gF()) {
         css $$0 = this.c.gC();
         if (this.c.af > this.d) {
            this.d = this.c.af + 20;
            this.a($$0);
         }

         if (!this.c.gn()) {
            feq $$1 = chx.a(this.c, 15, 4, feq.c($$0.q()), (float) (Math.PI / 2));
            if ($$1 != null) {
               this.c.O().a($$1.d, $$1.e, $$1.f, 1.0);
            }
         }
      }
   }

   private void a(css $$0) {
      if ($$0.r()) {
         arq $$1 = a(this.c.dV());
         Set<cst> $$2 = Sets.newHashSet();
         List<cst> $$3 = $$1.a(cst.class, this.c.cR().g(16.0), $$0x -> !$$0x.gF() && csu.a($$0x));
         $$2.addAll($$3);

         for (cst $$4 : $$2) {
            $$0.a($$1, $$0.j(), $$4, null, true);
         }
      }
   }
}
