import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class bta<T extends cfh> extends bsg {
   private static final int a = 20;
   private static final float b = 1.0F;
   private final T c;
   private int d;

   public bta(T $$0) {
      this.c = $$0;
      this.a(EnumSet.of(bsg.a.a));
   }

   @Override
   public boolean a() {
      return this.c.q() == null && !this.c.cP() && this.c.gu() && !this.c.gt().a() && !((ami)this.c.dN()).b(this.c.dn());
   }

   @Override
   public boolean b() {
      return this.c.gu() && !this.c.gt().a() && this.c.dN() instanceof ami && !((ami)this.c.dN()).b(this.c.dn());
   }

   @Override
   public void e() {
      if (this.c.gu()) {
         cfg $$0 = this.c.gt();
         if (this.c.ah > this.d) {
            this.d = this.c.ah + 20;
            this.a($$0);
         }

         if (!this.c.gb()) {
            ejz $$1 = bwb.a(this.c, 15, 4, ejz.c($$0.t()), (float) (Math.PI / 2));
            if ($$1 != null) {
               this.c.N().a($$1.c, $$1.d, $$1.e, 1.0);
            }
         }
      }
   }

   private void a(cfg $$0) {
      if ($$0.v()) {
         Set<cfh> $$1 = Sets.newHashSet();
         List<cfh> $$2 = this.c.dN().a(cfh.class, this.c.cH().g(16.0), $$1x -> !$$1x.gu() && cfi.a($$1x, $$0));
         $$1.addAll($$2);

         for (cfh $$3 : $$1) {
            $$0.a($$0.k(), $$3, null, true);
         }
      }
   }
}
