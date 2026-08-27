import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class bqm<T extends cct> extends bps {
   private static final int a = 20;
   private static final float b = 1.0F;
   private final T c;
   private int d;

   public bqm(T $$0) {
      this.c = $$0;
      this.a(EnumSet.of(bps.a.a));
   }

   @Override
   public boolean a() {
      return this.c.j() == null && !this.c.cO() && this.c.go() && !this.c.gn().a() && !((aki)this.c.dK()).b(this.c.dk());
   }

   @Override
   public boolean b() {
      return this.c.go() && !this.c.gn().a() && this.c.dK() instanceof aki && !((aki)this.c.dK()).b(this.c.dk());
   }

   @Override
   public void e() {
      if (this.c.go()) {
         ccs $$0 = this.c.gn();
         if (this.c.ah > this.d) {
            this.d = this.c.ah + 20;
            this.a($$0);
         }

         if (!this.c.fV()) {
            ehf $$1 = btn.a(this.c, 15, 4, ehf.c($$0.t()), (float) (Math.PI / 2));
            if ($$1 != null) {
               this.c.H().a($$1.c, $$1.d, $$1.e, 1.0);
            }
         }
      }
   }

   private void a(ccs $$0) {
      if ($$0.v()) {
         Set<cct> $$1 = Sets.newHashSet();
         List<cct> $$2 = this.c.dK().a(cct.class, this.c.cG().g(16.0), $$1x -> !$$1x.go() && ccu.a($$1x, $$0));
         $$1.addAll($$2);

         for (cct $$3 : $$1) {
            $$0.a($$0.k(), $$3, null, true);
         }
      }
   }
}
