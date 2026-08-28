import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public class fqq extends fqs {
   private static final xh a = xh.c("multiplayer.downloadingTerrain");
   private static final long b = 30000L;
   private final long c;
   private final BooleanSupplier d;
   private final fqq.a s;
   @Nullable
   private gxs u;

   public fqq(BooleanSupplier $$0, fqq.a $$1) {
      super(fir.a);
      this.d = $$0;
      this.s = $$1;
      this.c = ad.c();
   }

   @Override
   public boolean aI_() {
      return false;
   }

   @Override
   protected boolean aR_() {
      return false;
   }

   @Override
   public void a(fkm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, a, this.n / 2, this.o / 2 - 50, -1);
   }

   @Override
   public void b(fkm $$0, int $$1, int $$2, float $$3) {
      switch (this.s) {
         case a:
            $$0.a(gig::A, this.m(), 0, 0, $$0.a(), $$0.b());
            break;
         case b:
            $$0.b(gig.t(), 0, 0, this.n, this.o, 0);
            break;
         case c:
            this.a($$0, $$3);
            this.r();
            this.a($$0);
      }
   }

   private gxs m() {
      if (this.u != null) {
         return this.u;
      } else {
         this.u = this.m.ap().a().a(dia.ed.m());
         return this.u;
      }
   }

   @Override
   public void e() {
      if (this.d.getAsBoolean() || ad.c() > this.c + 30000L) {
         this.d();
      }
   }

   @Override
   public void d() {
      this.m.ba().c(xh.c("narrator.ready_to_play"));
      super.d();
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
