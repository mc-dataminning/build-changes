import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public class fob extends fod {
   private static final wz a = wz.c("multiplayer.downloadingTerrain");
   private static final long b = 30000L;
   private final long c;
   private final BooleanSupplier r;
   private final fob.a s;
   @Nullable
   private gql u;

   public fob(BooleanSupplier $$0, fob.a $$1) {
      super(fgg.a);
      this.r = $$0;
      this.s = $$1;
      this.c = System.currentTimeMillis();
   }

   @Override
   public boolean aJ_() {
      return false;
   }

   @Override
   protected boolean aS_() {
      return false;
   }

   @Override
   public void a(fhz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.o, a, this.m / 2, this.n / 2 - 50, 16777215);
   }

   @Override
   public void b(fhz $$0, int $$1, int $$2, float $$3) {
      switch (this.s) {
         case a:
            $$0.a(0, 0, -90, $$0.a(), $$0.b(), this.m());
            break;
         case b:
            $$0.b(gfh.u(), 0, 0, this.m, this.n, 0);
            break;
         case c:
            this.a($$0, $$3);
            this.a($$3);
            this.a($$0);
      }
   }

   private gql m() {
      if (this.u != null) {
         return this.u;
      } else {
         this.u = this.l.ao().a().a(dga.ed.o());
         return this.u;
      }
   }

   @Override
   public void e() {
      if (this.r.getAsBoolean() || System.currentTimeMillis() > this.c + 30000L) {
         this.d();
      }
   }

   @Override
   public void d() {
      this.l.aV().c(wz.c("narrator.ready_to_play"));
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
