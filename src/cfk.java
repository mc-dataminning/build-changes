import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class cfk<T extends cto> extends ceq {
   private static final int a = 20;
   private static final float b = 1.0F;
   private final T c;
   private int d;

   public cfk(T $$0) {
      this.c = $$0;
      this.a(EnumSet.of(ceq.a.a));
   }

   @Override
   public boolean b() {
      return this.c.f() == null && !this.c.cX() && this.c.gI() && !this.c.gF().a() && !a(this.c.dV()).c(this.c.dv());
   }

   @Override
   public boolean c() {
      return this.c.gI() && !this.c.gF().a() && !a(this.c.dV()).c(this.c.dv());
   }

   @Override
   public void a() {
      if (this.c.gI()) {
         ctn $$0 = this.c.gF();
         if (this.c.af > this.d) {
            this.d = this.c.af + 20;
            this.a($$0);
         }

         if (!this.c.gq()) {
            ffq $$1 = cin.a(this.c, 15, 4, ffq.c($$0.q()), (float) (Math.PI / 2));
            if ($$1 != null) {
               this.c.O().a($$1.d, $$1.e, $$1.f, 1.0);
            }
         }
      }
   }

   private void a(ctn $$0) {
      if ($$0.r()) {
         ars $$1 = a(this.c.dV());
         Set<cto> $$2 = Sets.newHashSet();
         List<cto> $$3 = $$1.a(cto.class, this.c.cR().g(16.0), $$0x -> !$$0x.gI() && ctp.a($$0x));
         $$2.addAll($$3);

         for (cto $$4 : $$2) {
            $$0.a($$1, $$0.j(), $$4, null, true);
         }
      }
   }
}
