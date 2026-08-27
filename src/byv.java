import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class byv<T extends clx> extends byb {
   private static final int a = 20;
   private static final float b = 1.0F;
   private final T c;
   private int d;

   public byv(T $$0) {
      this.c = $$0;
      this.a(EnumSet.of(byb.a.a));
   }

   @Override
   public boolean a() {
      return this.c.p() == null && !this.c.cP() && this.c.gE() && !this.c.gD().a() && !((aqe)this.c.dN()).c(this.c.dn());
   }

   @Override
   public boolean b() {
      return this.c.gE() && !this.c.gD().a() && this.c.dN() instanceof aqe && !((aqe)this.c.dN()).c(this.c.dn());
   }

   @Override
   public void e() {
      if (this.c.gE()) {
         clw $$0 = this.c.gD();
         if (this.c.ai > this.d) {
            this.d = this.c.ai + 20;
            this.a($$0);
         }

         if (!this.c.gl()) {
            etf $$1 = cby.a(this.c, 15, 4, etf.c($$0.s()), (float) (Math.PI / 2));
            if ($$1 != null) {
               this.c.K().a($$1.c, $$1.d, $$1.e, 1.0);
            }
         }
      }
   }

   private void a(clw $$0) {
      if ($$0.u()) {
         Set<clx> $$1 = Sets.newHashSet();
         List<clx> $$2 = this.c.dN().a(clx.class, this.c.cI().g(16.0), $$1x -> !$$1x.gE() && cly.a($$1x, $$0));
         $$1.addAll($$2);

         for (clx $$3 : $$1) {
            $$0.a($$0.k(), $$3, null, true);
         }
      }
   }
}
