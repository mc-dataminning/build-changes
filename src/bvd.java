import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bvd extends bvj<cfg> {
   private static final int c = 3;
   private static final int d = 60;
   private static final int e = 110;
   private final btb<? extends cfg> f;
   private final float g;
   private final int h;
   private static final int i = 2;
   private long j;

   public bvd(btb<? extends cfg> $$0) {
      this($$0, 1.0F, 2);
   }

   public bvd(btb<? extends cfg> $$0, float $$1, int $$2) {
      super(ImmutableMap.of(ccu.h, ccv.a, ccu.r, ccv.b, ccu.m, ccv.c, ccu.n, ccv.c, ccu.Z, ccv.b), 110);
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
   }

   protected boolean a(arf $$0, cfg $$1) {
      return $$1.gu() && this.c($$1).isPresent();
   }

   protected void a(arf $$0, cfg $$1, long $$2) {
      cfg $$3 = this.c($$1).get();
      $$1.dS().a(ccu.r, $$3);
      $$3.dS().a(ccu.r, $$1);
      bvl.a($$1, (btq)$$3, this.g, this.h);
      int $$4 = 60 + $$1.el().a(50);
      this.j = $$2 + (long)$$4;
   }

   protected boolean b(arf $$0, cfg $$1, long $$2) {
      if (!this.b($$1)) {
         return false;
      } else {
         cfg $$3 = this.a($$1);
         return $$3.bD() && $$1.a($$3) && bvl.a($$1.dS(), $$3) && $$2 <= this.j && !$$1.gn() && !$$3.gn();
      }
   }

   protected void c(arf $$0, cfg $$1, long $$2) {
      cfg $$3 = this.a($$1);
      bvl.a($$1, (btq)$$3, this.g, this.h);
      if ($$1.a($$3, 3.0)) {
         if ($$2 >= this.j) {
            $$1.a($$0, $$3);
            $$1.dS().b(ccu.r);
            $$3.dS().b(ccu.r);
         }
      }
   }

   protected void d(arf $$0, cfg $$1, long $$2) {
      $$1.dS().b(ccu.r);
      $$1.dS().b(ccu.m);
      $$1.dS().b(ccu.n);
      this.j = 0L;
   }

   private cfg a(cfg $$0) {
      return (cfg)$$0.dS().c(ccu.r).get();
   }

   private boolean b(cfg $$0) {
      bus<?> $$1 = $$0.dS();
      return $$1.a(ccu.r) && $$1.c(ccu.r).get().ak() == this.f;
   }

   private Optional<? extends cfg> c(cfg $$0) {
      return $$0.dS().c(ccu.h).get().a($$1 -> {
         if ($$1.ak() == this.f && $$1 instanceof cfg $$2 && $$0.a($$2) && !$$2.gn()) {
            return true;
         }

         return false;
      }).map(cfg.class::cast);
   }
}
