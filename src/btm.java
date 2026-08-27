import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class btm extends bts<cdp> {
   private static final int c = 3;
   private static final int d = 60;
   private static final int e = 110;
   private final brn<? extends cdp> f;
   private final float g;
   private final int h;
   private static final int i = 2;
   private long j;

   public btm(brn<? extends cdp> $$0) {
      this($$0, 1.0F, 2);
   }

   public btm(brn<? extends cdp> $$0, float $$1, int $$2) {
      super(ImmutableMap.of(cbd.h, cbe.a, cbd.r, cbe.b, cbd.m, cbe.c, cbd.n, cbe.c, cbd.Z, cbe.b), 110);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
   }

   protected boolean a(aqh $$0, cdp $$1) {
      return $$1.gt() && this.c($$1).isPresent();
   }

   protected void a(aqh $$0, cdp $$1, long $$2) {
      cdp $$3 = this.c($$1).get();
      $$1.dQ().a(cbd.r, $$3);
      $$3.dQ().a(cbd.r, $$1);
      btu.a($$1, (bsa)$$3, this.g, this.h);
      int $$4 = 60 + $$1.ej().a(50);
      this.j = $$2 + (long)$$4;
   }

   protected boolean b(aqh $$0, cdp $$1, long $$2) {
      if (!this.b($$1)) {
         return false;
      } else {
         cdp $$3 = this.a($$1);
         return $$3.bB() && $$1.a($$3) && btu.a($$1.dQ(), $$3) && $$2 <= this.j && !$$1.gm() && !$$3.gm();
      }
   }

   protected void c(aqh $$0, cdp $$1, long $$2) {
      cdp $$3 = this.a($$1);
      btu.a($$1, (bsa)$$3, this.g, this.h);
      if ($$1.a($$3, 3.0)) {
         if ($$2 >= this.j) {
            $$1.a($$0, $$3);
            $$1.dQ().b(cbd.r);
            $$3.dQ().b(cbd.r);
         }
      }
   }

   protected void d(aqh $$0, cdp $$1, long $$2) {
      $$1.dQ().b(cbd.r);
      $$1.dQ().b(cbd.m);
      $$1.dQ().b(cbd.n);
      this.j = 0L;
   }

   private cdp a(cdp $$0) {
      return (cdp)$$0.dQ().c(cbd.r).get();
   }

   private boolean b(cdp $$0) {
      btb<?> $$1 = $$0.dQ();
      return $$1.a(cbd.r) && $$1.c(cbd.r).get().ai() == this.f;
   }

   private Optional<? extends cdp> c(cdp $$0) {
      return $$0.dQ().c(cbd.h).get().a($$1 -> {
         if ($$1.ai() == this.f && $$1 instanceof cdp $$2 && $$0.a($$2) && !$$2.gm()) {
            return true;
         }

         return false;
      }).map(cdp.class::cast);
   }
}
