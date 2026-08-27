import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class bua<T extends cgq> extends btg {
   private static final int a = 20;
   private static final float b = 1.0F;
   private final T c;
   private int d;

   public bua(T $$0) {
      this.c = $$0;
      this.a(EnumSet.of(btg.a.a));
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
         cgp $$0 = this.c.gs();
         if (this.c.ah > this.d) {
            this.d = this.c.ah + 20;
            this.a($$0);
         }

         if (!this.c.ga()) {
            els $$1 = bxc.a(this.c, 15, 4, els.c($$0.t()), (float) (Math.PI / 2));
            if ($$1 != null) {
               this.c.N().a($$1.c, $$1.d, $$1.e, 1.0);
            }
         }
      }
   }

   private void a(cgp $$0) {
      if ($$0.v()) {
         Set<cgq> $$1 = Sets.newHashSet();
         List<cgq> $$2 = this.c.dM().a(cgq.class, this.c.cH().g(16.0), $$1x -> !$$1x.gt() && cgr.a($$1x, $$0));
         $$1.addAll($$2);

         for (cgq $$3 : $$1) {
            $$0.a($$0.k(), $$3, null, true);
         }
      }
   }
}
