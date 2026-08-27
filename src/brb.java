import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class brb<T extends cdi> extends bqh {
   private static final int a = 20;
   private static final float b = 1.0F;
   private final T c;
   private int d;

   public brb(T $$0) {
      this.c = $$0;
      this.a(EnumSet.of(bqh.a.a));
   }

   @Override
   public boolean a() {
      return this.c.q() == null && !this.c.cO() && this.c.gt() && !this.c.gs().a() && !((akt)this.c.dL()).b(this.c.dl());
   }

   @Override
   public boolean b() {
      return this.c.gt() && !this.c.gs().a() && this.c.dL() instanceof akt && !((akt)this.c.dL()).b(this.c.dl());
   }

   @Override
   public void e() {
      if (this.c.gt()) {
         cdh $$0 = this.c.gs();
         if (this.c.ah > this.d) {
            this.d = this.c.ah + 20;
            this.a($$0);
         }

         if (!this.c.ga()) {
            ehh $$1 = buc.a(this.c, 15, 4, ehh.c($$0.t()), (float) (Math.PI / 2));
            if ($$1 != null) {
               this.c.L().a($$1.c, $$1.d, $$1.e, 1.0);
            }
         }
      }
   }

   private void a(cdh $$0) {
      if ($$0.v()) {
         Set<cdi> $$1 = Sets.newHashSet();
         List<cdi> $$2 = this.c.dL().a(cdi.class, this.c.cG().g(16.0), $$1x -> !$$1x.gt() && cdj.a($$1x, $$0));
         $$1.addAll($$2);

         for (cdi $$3 : $$1) {
            $$0.a($$0.k(), $$3, null, true);
         }
      }
   }
}
