import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public class frn extends frp {
   private static final xl a = xl.c("multiplayer.downloadingTerrain");
   private static final long b = 30000L;
   private final long c;
   private final BooleanSupplier d;
   private final frn.a s;
   @Nullable
   private gyt u;

   public frn(BooleanSupplier $$0, frn.a $$1) {
      super(fjo.a);
      this.d = $$0;
      this.s = $$1;
      this.c = ae.c();
   }

   @Override
   public boolean aH_() {
      return false;
   }

   @Override
   protected boolean aR_() {
      return false;
   }

   @Override
   public void a(flj $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, a, this.n / 2, this.o / 2 - 50, -1);
   }

   @Override
   public void b(flj $$0, int $$1, int $$2, float $$3) {
      switch (this.s) {
         case a:
            $$0.a(gjh::A, this.m(), 0, 0, $$0.a(), $$0.b());
            break;
         case b:
            $$0.b(gjh.t(), 0, 0, this.n, this.o, 0);
            break;
         case c:
            this.a($$0, $$3);
            this.r();
            this.a($$0);
      }
   }

   private gyt m() {
      if (this.u != null) {
         return this.u;
      } else {
         this.u = this.m.ap().a().a(dil.ed.m());
         return this.u;
      }
   }

   @Override
   public void e() {
      if (this.d.getAsBoolean() || ae.c() > this.c + 30000L) {
         this.aP_();
      }
   }

   @Override
   public void aP_() {
      this.m.aZ().c(xl.c("narrator.ready_to_play"));
      super.aP_();
   }

   @Override
   public boolean k() {
      return false;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
