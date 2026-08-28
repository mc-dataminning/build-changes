import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class cdp<T extends crc> extends ccv {
   private static final int a = 20;
   private static final float b = 1.0F;
   private final T c;
   private int d;

   public cdp(T $$0) {
      this.c = $$0;
      this.a(EnumSet.of(ccv.a.a));
   }

   @Override
   public boolean b() {
      return this.c.O_() == null && !this.c.cY() && this.c.gE() && !this.c.gB().a() && !((arx)this.c.dW()).c(this.c.dw());
   }

   @Override
   public boolean c() {
      return this.c.gE() && !this.c.gB().a() && this.c.dW() instanceof arx && !((arx)this.c.dW()).c(this.c.dw());
   }

   @Override
   public void a() {
      if (this.c.gE()) {
         crb $$0 = this.c.gB();
         if (this.c.af > this.d) {
            this.d = this.c.af + 20;
            this.a($$0);
         }

         if (!this.c.gk()) {
            fbr $$1 = cgs.a(this.c, 15, 4, fbr.c($$0.s()), (float) (Math.PI / 2));
            if ($$1 != null) {
               this.c.L().a($$1.d, $$1.e, $$1.f, 1.0);
            }
         }
      }
   }

   private void a(crb $$0) {
      if ($$0.u()) {
         Set<crc> $$1 = Sets.newHashSet();
         List<crc> $$2 = this.c.dW().a(crc.class, this.c.cR().g(16.0), $$1x -> !$$1x.gE() && crd.a($$1x, $$0));
         $$1.addAll($$2);

         for (crc $$3 : $$1) {
            $$0.a($$0.k(), $$3, null, true);
         }
      }
   }
}
