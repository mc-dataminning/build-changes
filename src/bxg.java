import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class bxg<T extends ckg> extends bwm {
   private static final int a = 20;
   private static final float b = 1.0F;
   private final T c;
   private int d;

   public bxg(T $$0) {
      this.c = $$0;
      this.a(EnumSet.of(bwm.a.a));
   }

   @Override
   public boolean a() {
      return this.c.p() == null && !this.c.cO() && this.c.gC() && !this.c.gB().a() && !((apf)this.c.dM()).c(this.c.dm());
   }

   @Override
   public boolean b() {
      return this.c.gC() && !this.c.gB().a() && this.c.dM() instanceof apf && !((apf)this.c.dM()).c(this.c.dm());
   }

   @Override
   public void e() {
      if (this.c.gC()) {
         ckf $$0 = this.c.gB();
         if (this.c.ah > this.d) {
            this.d = this.c.ah + 20;
            this.a($$0);
         }

         if (!this.c.gj()) {
            ept $$1 = caj.a(this.c, 15, 4, ept.c($$0.t()), (float) (Math.PI / 2));
            if ($$1 != null) {
               this.c.K().a($$1.c, $$1.d, $$1.e, 1.0);
            }
         }
      }
   }

   private void a(ckf $$0) {
      if ($$0.v()) {
         Set<ckg> $$1 = Sets.newHashSet();
         List<ckg> $$2 = this.c.dM().a(ckg.class, this.c.cH().g(16.0), $$1x -> !$$1x.gC() && ckh.a($$1x, $$0));
         $$1.addAll($$2);

         for (ckg $$3 : $$1) {
            $$0.a($$0.k(), $$3, null, true);
         }
      }
   }
}
