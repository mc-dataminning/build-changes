import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class bzr<T extends cmt> extends byx {
   private static final int a = 20;
   private static final float b = 1.0F;
   private final T c;
   private int d;

   public bzr(T $$0) {
      this.c = $$0;
      this.a(EnumSet.of(byx.a.a));
   }

   @Override
   public boolean a() {
      return this.c.p() == null && !this.c.cP() && this.c.gE() && !this.c.gD().a() && !((aqh)this.c.dN()).c(this.c.dn());
   }

   @Override
   public boolean b() {
      return this.c.gE() && !this.c.gD().a() && this.c.dN() instanceof aqh && !((aqh)this.c.dN()).c(this.c.dn());
   }

   @Override
   public void e() {
      if (this.c.gE()) {
         cms $$0 = this.c.gD();
         if (this.c.ai > this.d) {
            this.d = this.c.ai + 20;
            this.a($$0);
         }

         if (!this.c.gl()) {
            etp $$1 = ccu.a(this.c, 15, 4, etp.c($$0.s()), (float) (Math.PI / 2));
            if ($$1 != null) {
               this.c.K().a($$1.c, $$1.d, $$1.e, 1.0);
            }
         }
      }
   }

   private void a(cms $$0) {
      if ($$0.u()) {
         Set<cmt> $$1 = Sets.newHashSet();
         List<cmt> $$2 = this.c.dN().a(cmt.class, this.c.cI().g(16.0), $$1x -> !$$1x.gE() && cmu.a($$1x, $$0));
         $$1.addAll($$2);

         for (cmt $$3 : $$1) {
            $$0.a($$0.k(), $$3, null, true);
         }
      }
   }
}
