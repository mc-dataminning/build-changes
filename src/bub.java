import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class bub<T extends cgr> extends bth {
   private static final int a = 20;
   private static final float b = 1.0F;
   private final T c;
   private int d;

   public bub(T $$0) {
      this.c = $$0;
      this.a(EnumSet.of(bth.a.a));
   }

   @Override
   public boolean a() {
      return this.c.q() == null && !this.c.cO() && this.c.gt() && !this.c.gs().a() && !((and)this.c.dM()).c(this.c.dm());
   }

   @Override
   public boolean b() {
      return this.c.gt() && !this.c.gs().a() && this.c.dM() instanceof and && !((and)this.c.dM()).c(this.c.dm());
   }

   @Override
   public void e() {
      if (this.c.gt()) {
         cgq $$0 = this.c.gs();
         if (this.c.ah > this.d) {
            this.d = this.c.ah + 20;
            this.a($$0);
         }

         if (!this.c.ga()) {
            elt $$1 = bxd.a(this.c, 15, 4, elt.c($$0.t()), (float) (Math.PI / 2));
            if ($$1 != null) {
               this.c.N().a($$1.c, $$1.d, $$1.e, 1.0);
            }
         }
      }
   }

   private void a(cgq $$0) {
      if ($$0.v()) {
         Set<cgr> $$1 = Sets.newHashSet();
         List<cgr> $$2 = this.c.dM().a(cgr.class, this.c.cH().g(16.0), $$1x -> !$$1x.gt() && cgs.a($$1x, $$0));
         $$1.addAll($$2);

         for (cgr $$3 : $$1) {
            $$0.a($$0.k(), $$3, null, true);
         }
      }
   }
}
