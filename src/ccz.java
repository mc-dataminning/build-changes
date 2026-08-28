import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class ccz<T extends cqi> extends ccf {
   private static final int a = 20;
   private static final float b = 1.0F;
   private final T c;
   private int d;

   public ccz(T $$0) {
      this.c = $$0;
      this.a(EnumSet.of(ccf.a.a));
   }

   @Override
   public boolean b() {
      return this.c.aa_() == null && !this.c.cY() && this.c.gD() && !this.c.gA().a() && !((arp)this.c.dV()).c(this.c.dv());
   }

   @Override
   public boolean c() {
      return this.c.gD() && !this.c.gA().a() && this.c.dV() instanceof arp && !((arp)this.c.dV()).c(this.c.dv());
   }

   @Override
   public void a() {
      if (this.c.gD()) {
         cqh $$0 = this.c.gA();
         if (this.c.af > this.d) {
            this.d = this.c.af + 20;
            this.a($$0);
         }

         if (!this.c.gi()) {
            ezy $$1 = cgc.a(this.c, 15, 4, ezy.c($$0.s()), (float) (Math.PI / 2));
            if ($$1 != null) {
               this.c.L().a($$1.d, $$1.e, $$1.f, 1.0);
            }
         }
      }
   }

   private void a(cqh $$0) {
      if ($$0.u()) {
         Set<cqi> $$1 = Sets.newHashSet();
         List<cqi> $$2 = this.c.dV().a(cqi.class, this.c.cR().g(16.0), $$1x -> !$$1x.gD() && cqj.a($$1x, $$0));
         $$1.addAll($$2);

         for (cqi $$3 : $$1) {
            $$0.a($$0.k(), $$3, null, true);
         }
      }
   }
}
