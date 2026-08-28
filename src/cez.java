import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class cez<T extends ctd> extends cef {
   private static final int a = 20;
   private static final float b = 1.0F;
   private final T c;
   private int d;

   public cez(T $$0) {
      this.c = $$0;
      this.a(EnumSet.of(cef.a.a));
   }

   @Override
   public boolean b() {
      return this.c.f() == null && !this.c.cW() && this.c.gH() && !this.c.gE().a() && !a(this.c.dU()).c(this.c.du());
   }

   @Override
   public boolean c() {
      return this.c.gH() && !this.c.gE().a() && !a(this.c.dU()).c(this.c.du());
   }

   @Override
   public void a() {
      if (this.c.gH()) {
         ctc $$0 = this.c.gE();
         if (this.c.af > this.d) {
            this.d = this.c.af + 20;
            this.a($$0);
         }

         if (!this.c.gp()) {
            ffc $$1 = cic.a(this.c, 15, 4, ffc.c($$0.q()), (float) (Math.PI / 2));
            if ($$1 != null) {
               this.c.O().a($$1.d, $$1.e, $$1.f, 1.0);
            }
         }
      }
   }

   private void a(ctc $$0) {
      if ($$0.r()) {
         arq $$1 = a(this.c.dU());
         Set<ctd> $$2 = Sets.newHashSet();
         List<ctd> $$3 = $$1.a(ctd.class, this.c.cQ().g(16.0), $$0x -> !$$0x.gH() && cte.a($$0x));
         $$2.addAll($$3);

         for (ctd $$4 : $$2) {
            $$0.a($$1, $$0.j(), $$4, null, true);
         }
      }
   }
}
