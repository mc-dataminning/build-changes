import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class bsv<T extends cfc> extends bsb {
   private static final int a = 20;
   private static final float b = 1.0F;
   private final T c;
   private int d;

   public bsv(T $$0) {
      this.c = $$0;
      this.a(EnumSet.of(bsb.a.a));
   }

   @Override
   public boolean a() {
      return this.c.q() == null && !this.c.cP() && this.c.gu() && !this.c.gt().a() && !((ame)this.c.dN()).b(this.c.dn());
   }

   @Override
   public boolean b() {
      return this.c.gu() && !this.c.gt().a() && this.c.dN() instanceof ame && !((ame)this.c.dN()).b(this.c.dn());
   }

   @Override
   public void e() {
      if (this.c.gu()) {
         cfb $$0 = this.c.gt();
         if (this.c.ah > this.d) {
            this.d = this.c.ah + 20;
            this.a($$0);
         }

         if (!this.c.gb()) {
            eju $$1 = bvw.a(this.c, 15, 4, eju.c($$0.t()), (float) (Math.PI / 2));
            if ($$1 != null) {
               this.c.N().a($$1.c, $$1.d, $$1.e, 1.0);
            }
         }
      }
   }

   private void a(cfb $$0) {
      if ($$0.v()) {
         Set<cfc> $$1 = Sets.newHashSet();
         List<cfc> $$2 = this.c.dN().a(cfc.class, this.c.cH().g(16.0), $$1x -> !$$1x.gu() && cfd.a($$1x, $$0));
         $$1.addAll($$2);

         for (cfc $$3 : $$1) {
            $$0.a($$0.k(), $$3, null, true);
         }
      }
   }
}
