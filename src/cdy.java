import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class cdy<T extends crl> extends cde {
   private static final int a = 20;
   private static final float b = 1.0F;
   private final T c;
   private int d;

   public cdy(T $$0) {
      this.c = $$0;
      this.a(EnumSet.of(cde.a.a));
   }

   @Override
   public boolean b() {
      return this.c.O_() == null && !this.c.cY() && this.c.gE() && !this.c.gB().a() && !((ash)this.c.dW()).c(this.c.dw());
   }

   @Override
   public boolean c() {
      return this.c.gE() && !this.c.gB().a() && this.c.dW() instanceof ash && !((ash)this.c.dW()).c(this.c.dw());
   }

   @Override
   public void a() {
      if (this.c.gE()) {
         crk $$0 = this.c.gB();
         if (this.c.af > this.d) {
            this.d = this.c.af + 20;
            this.a($$0);
         }

         if (!this.c.gk()) {
            fby $$1 = chb.a(this.c, 15, 4, fby.c($$0.s()), (float) (Math.PI / 2));
            if ($$1 != null) {
               this.c.L().a($$1.d, $$1.e, $$1.f, 1.0);
            }
         }
      }
   }

   private void a(crk $$0) {
      if ($$0.u()) {
         Set<crl> $$1 = Sets.newHashSet();
         List<crl> $$2 = this.c.dW().a(crl.class, this.c.cR().g(16.0), $$1x -> !$$1x.gE() && crm.a($$1x, $$0));
         $$1.addAll($$2);

         for (crl $$3 : $$1) {
            $$0.a($$0.k(), $$3, null, true);
         }
      }
   }
}
