import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class bqv<T extends cdc> extends bqb {
   private static final int a = 20;
   private static final float b = 1.0F;
   private final T c;
   private int d;

   public bqv(T $$0) {
      this.c = $$0;
      this.a(EnumSet.of(bqb.a.a));
   }

   @Override
   public boolean a() {
      return this.c.q() == null && !this.c.cO() && this.c.gs() && !this.c.gr().a() && !((akq)this.c.dL()).b(this.c.dl());
   }

   @Override
   public boolean b() {
      return this.c.gs() && !this.c.gr().a() && this.c.dL() instanceof akq && !((akq)this.c.dL()).b(this.c.dl());
   }

   @Override
   public void e() {
      if (this.c.gs()) {
         cdb $$0 = this.c.gr();
         if (this.c.ah > this.d) {
            this.d = this.c.ah + 20;
            this.a($$0);
         }

         if (!this.c.fZ()) {
            ehn $$1 = btw.a(this.c, 15, 4, ehn.c($$0.t()), (float) (Math.PI / 2));
            if ($$1 != null) {
               this.c.L().a($$1.c, $$1.d, $$1.e, 1.0);
            }
         }
      }
   }

   private void a(cdb $$0) {
      if ($$0.v()) {
         Set<cdc> $$1 = Sets.newHashSet();
         List<cdc> $$2 = this.c.dL().a(cdc.class, this.c.cG().g(16.0), $$1x -> !$$1x.gs() && cdd.a($$1x, $$0));
         $$1.addAll($$2);

         for (cdc $$3 : $$1) {
            $$0.a($$0.k(), $$3, null, true);
         }
      }
   }
}
