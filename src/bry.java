import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class bry<T extends cef> extends bre {
   private static final int a = 20;
   private static final float b = 1.0F;
   private final T c;
   private int d;

   public bry(T $$0) {
      this.c = $$0;
      this.a(EnumSet.of(bre.a.a));
   }

   @Override
   public boolean a() {
      return this.c.q() == null && !this.c.cO() && this.c.gt() && !this.c.gs().a() && !((alq)this.c.dL()).b(this.c.dl());
   }

   @Override
   public boolean b() {
      return this.c.gt() && !this.c.gs().a() && this.c.dL() instanceof alq && !((alq)this.c.dL()).b(this.c.dl());
   }

   @Override
   public void e() {
      if (this.c.gt()) {
         cee $$0 = this.c.gs();
         if (this.c.ah > this.d) {
            this.d = this.c.ah + 20;
            this.a($$0);
         }

         if (!this.c.ga()) {
            eif $$1 = buz.a(this.c, 15, 4, eif.c($$0.t()), (float) (Math.PI / 2));
            if ($$1 != null) {
               this.c.L().a($$1.c, $$1.d, $$1.e, 1.0);
            }
         }
      }
   }

   private void a(cee $$0) {
      if ($$0.v()) {
         Set<cef> $$1 = Sets.newHashSet();
         List<cef> $$2 = this.c.dL().a(cef.class, this.c.cG().g(16.0), $$1x -> !$$1x.gt() && ceg.a($$1x, $$0));
         $$1.addAll($$2);

         for (cef $$3 : $$1) {
            $$0.a($$0.k(), $$3, null, true);
         }
      }
   }
}
