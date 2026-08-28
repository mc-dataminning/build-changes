import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class cfm<T extends ctq> extends ces {
   private static final int a = 20;
   private static final float b = 1.0F;
   private final T c;
   private int d;

   public cfm(T $$0) {
      this.c = $$0;
      this.a(EnumSet.of(ces.a.a));
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
         ctp $$0 = this.c.gF();
         if (this.c.af > this.d) {
            this.d = this.c.af + 20;
            this.a($$0);
         }

         if (!this.c.gq()) {
            ffs $$1 = cip.a(this.c, 15, 4, ffs.c($$0.q()), (float) (Math.PI / 2));
            if ($$1 != null) {
               this.c.O().a($$1.d, $$1.e, $$1.f, 1.0);
            }
         }
      }
   }

   private void a(ctp $$0) {
      if ($$0.r()) {
         aru $$1 = a(this.c.dV());
         Set<ctq> $$2 = Sets.newHashSet();
         List<ctq> $$3 = $$1.a(ctq.class, this.c.cR().g(16.0), $$0x -> !$$0x.gI() && ctr.a($$0x));
         $$2.addAll($$3);

         for (ctq $$4 : $$2) {
            $$0.a($$1, $$0.j(), $$4, null, true);
         }
      }
   }
}
