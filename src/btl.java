import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class btl<T extends cga> extends bsr {
   private static final int a = 20;
   private static final float b = 1.0F;
   private final T c;
   private int d;

   public btl(T $$0) {
      this.c = $$0;
      this.a(EnumSet.of(bsr.a.a));
   }

   @Override
   public boolean a() {
      return this.c.q() == null && !this.c.cO() && this.c.gt() && !this.c.gs().a() && !((amp)this.c.dM()).b(this.c.dm());
   }

   @Override
   public boolean b() {
      return this.c.gt() && !this.c.gs().a() && this.c.dM() instanceof amp && !((amp)this.c.dM()).b(this.c.dm());
   }

   @Override
   public void e() {
      if (this.c.gt()) {
         cfz $$0 = this.c.gs();
         if (this.c.ah > this.d) {
            this.d = this.c.ah + 20;
            this.a($$0);
         }

         if (!this.c.ga()) {
            elb $$1 = bwn.a(this.c, 15, 4, elb.c($$0.t()), (float) (Math.PI / 2));
            if ($$1 != null) {
               this.c.N().a($$1.c, $$1.d, $$1.e, 1.0);
            }
         }
      }
   }

   private void a(cfz $$0) {
      if ($$0.v()) {
         Set<cga> $$1 = Sets.newHashSet();
         List<cga> $$2 = this.c.dM().a(cga.class, this.c.cH().g(16.0), $$1x -> !$$1x.gt() && cgb.a($$1x, $$0));
         $$1.addAll($$2);

         for (cga $$3 : $$1) {
            $$0.a($$0.k(), $$3, null, true);
         }
      }
   }
}
