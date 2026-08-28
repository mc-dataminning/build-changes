import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public class ftp extends ftr {
   private static final xk a = xk.c("multiplayer.downloadingTerrain");
   private static final long b = 30000L;
   private final long c;
   private final BooleanSupplier d;
   private final ftp.a s;
   @Nullable
   private hbg u;

   public ftp(BooleanSupplier $$0, ftp.a $$1) {
      super(flq.a);
      this.d = $$0;
      this.s = $$1;
      this.c = ae.c();
   }

   @Override
   public boolean aH_() {
      return false;
   }

   @Override
   protected boolean aS_() {
      return false;
   }

   @Override
   public void a(fnl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, a, this.n / 2, this.o / 2 - 50, -1);
   }

   @Override
   public void b(fnl $$0, int $$1, int $$2, float $$3) {
      switch (this.s) {
         case a:
            $$0.a(glq::G, this.l(), 0, 0, $$0.a(), $$0.b());
            break;
         case b:
            $$0.b(glq.t(), 0, 0, this.n, this.o, 0);
            break;
         case c:
            this.a($$0, $$3);
            this.q();
            this.a($$0);
      }
   }

   private hbg l() {
      if (this.u != null) {
         return this.u;
      } else {
         this.u = this.m.ap().a().a(dkf.eq.m());
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
      this.m.aZ().c(xk.c("narrator.ready_to_play"));
      super.aP_();
   }

   @Override
   public boolean j() {
      return false;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
