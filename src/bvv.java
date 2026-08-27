import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class bvv<T extends cir> extends bvb {
   private static final int a = 20;
   private static final float b = 1.0F;
   private final T c;
   private int d;

   public bvv(T $$0) {
      this.c = $$0;
      this.a(EnumSet.of(bvb.a.a));
   }

   @Override
   public boolean a() {
      return this.c.q() == null && !this.c.cO() && this.c.gv() && !this.c.gu().a() && !((aov)this.c.dM()).c(this.c.dm());
   }

   @Override
   public boolean b() {
      return this.c.gv() && !this.c.gu().a() && this.c.dM() instanceof aov && !((aov)this.c.dM()).c(this.c.dm());
   }

   @Override
   public void e() {
      if (this.c.gv()) {
         ciq $$0 = this.c.gu();
         if (this.c.ag > this.d) {
            this.d = this.c.ag + 20;
            this.a($$0);
         }

         if (!this.c.gc()) {
            ens $$1 = byy.a(this.c, 15, 4, ens.c($$0.t()), (float) (Math.PI / 2));
            if ($$1 != null) {
               this.c.N().a($$1.c, $$1.d, $$1.e, 1.0);
            }
         }
      }
   }

   private void a(ciq $$0) {
      if ($$0.v()) {
         Set<cir> $$1 = Sets.newHashSet();
         List<cir> $$2 = this.c.dM().a(cir.class, this.c.cH().g(16.0), $$1x -> !$$1x.gv() && cis.a($$1x, $$0));
         $$1.addAll($$2);

         for (cir $$3 : $$1) {
            $$0.a($$0.k(), $$3, null, true);
         }
      }
   }
}
