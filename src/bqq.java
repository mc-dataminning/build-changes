import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class bqq<T extends ccx> extends bpw {
   private static final int a = 20;
   private static final float b = 1.0F;
   private final T c;
   private int d;

   public bqq(T $$0) {
      this.c = $$0;
      this.a(EnumSet.of(bpw.a.a));
   }

   @Override
   public boolean a() {
      return this.c.j() == null && !this.c.cO() && this.c.gp() && !this.c.go().a() && !((akn)this.c.dK()).b(this.c.dk());
   }

   @Override
   public boolean b() {
      return this.c.gp() && !this.c.go().a() && this.c.dK() instanceof akn && !((akn)this.c.dK()).b(this.c.dk());
   }

   @Override
   public void e() {
      if (this.c.gp()) {
         ccw $$0 = this.c.go();
         if (this.c.ah > this.d) {
            this.d = this.c.ah + 20;
            this.a($$0);
         }

         if (!this.c.fW()) {
            ehi $$1 = btr.a(this.c, 15, 4, ehi.c($$0.t()), (float) (Math.PI / 2));
            if ($$1 != null) {
               this.c.H().a($$1.c, $$1.d, $$1.e, 1.0);
            }
         }
      }
   }

   private void a(ccw $$0) {
      if ($$0.v()) {
         Set<ccx> $$1 = Sets.newHashSet();
         List<ccx> $$2 = this.c.dK().a(ccx.class, this.c.cG().g(16.0), $$1x -> !$$1x.gp() && ccy.a($$1x, $$0));
         $$1.addAll($$2);

         for (ccx $$3 : $$1) {
            $$0.a($$0.k(), $$3, null, true);
         }
      }
   }
}
