import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class ccs<T extends cqb> extends cby {
   private static final int a = 20;
   private static final float b = 1.0F;
   private final T c;
   private int d;

   public ccs(T $$0) {
      this.c = $$0;
      this.a(EnumSet.of(cby.a.a));
   }

   @Override
   public boolean b() {
      return this.c.m() == null && !this.c.cZ() && this.c.gL() && !this.c.gI().a() && !((arn)this.c.dX()).c(this.c.dx());
   }

   @Override
   public boolean c() {
      return this.c.gL() && !this.c.gI().a() && this.c.dX() instanceof arn && !((arn)this.c.dX()).c(this.c.dx());
   }

   @Override
   public void a() {
      if (this.c.gL()) {
         cqa $$0 = this.c.gI();
         if (this.c.ag > this.d) {
            this.d = this.c.ag + 20;
            this.a($$0);
         }

         if (!this.c.gq()) {
            ezn $$1 = cfv.a(this.c, 15, 4, ezn.c($$0.s()), (float) (Math.PI / 2));
            if ($$1 != null) {
               this.c.P().a($$1.d, $$1.e, $$1.f, 1.0);
            }
         }
      }
   }

   private void a(cqa $$0) {
      if ($$0.u()) {
         Set<cqb> $$1 = Sets.newHashSet();
         List<cqb> $$2 = this.c.dX().a(cqb.class, this.c.cS().g(16.0), $$1x -> !$$1x.gL() && cqc.a($$1x, $$0));
         $$1.addAll($$2);

         for (cqb $$3 : $$1) {
            $$0.a($$0.k(), $$3, null, true);
         }
      }
   }
}
