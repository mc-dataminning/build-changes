import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class bsn<T extends ceu> extends brt {
   private static final int a = 20;
   private static final float b = 1.0F;
   private final T c;
   private int d;

   public bsn(T $$0) {
      this.c = $$0;
      this.a(EnumSet.of(brt.a.a));
   }

   @Override
   public boolean a() {
      return this.c.q() == null && !this.c.cO() && this.c.gt() && !this.c.gs().a() && !((ama)this.c.dL()).b(this.c.dl());
   }

   @Override
   public boolean b() {
      return this.c.gt() && !this.c.gs().a() && this.c.dL() instanceof ama && !((ama)this.c.dL()).b(this.c.dl());
   }

   @Override
   public void e() {
      if (this.c.gt()) {
         cet $$0 = this.c.gs();
         if (this.c.ah > this.d) {
            this.d = this.c.ah + 20;
            this.a($$0);
         }

         if (!this.c.ga()) {
            eji $$1 = bvo.a(this.c, 15, 4, eji.c($$0.t()), (float) (Math.PI / 2));
            if ($$1 != null) {
               this.c.L().a($$1.c, $$1.d, $$1.e, 1.0);
            }
         }
      }
   }

   private void a(cet $$0) {
      if ($$0.v()) {
         Set<ceu> $$1 = Sets.newHashSet();
         List<ceu> $$2 = this.c.dL().a(ceu.class, this.c.cG().g(16.0), $$1x -> !$$1x.gt() && cev.a($$1x, $$0));
         $$1.addAll($$2);

         for (ceu $$3 : $$1) {
            $$0.a($$0.k(), $$3, null, true);
         }
      }
   }
}
