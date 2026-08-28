import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public class fnh extends fnj {
   private static final wu a = wu.c("multiplayer.downloadingTerrain");
   private static final long b = 30000L;
   private final long c;
   private final BooleanSupplier q;
   private final fnh.a r;
   @Nullable
   private gpo s;

   public fnh(BooleanSupplier $$0, fnh.a $$1) {
      super(ffl.a);
      this.q = $$0;
      this.r = $$1;
      this.c = System.currentTimeMillis();
   }

   @Override
   public boolean aF_() {
      return false;
   }

   @Override
   protected boolean aO_() {
      return false;
   }

   @Override
   public void a(fhf $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.o, a, this.m / 2, this.n / 2 - 50, 16777215);
   }

   @Override
   public void b(fhf $$0, int $$1, int $$2, float $$3) {
      switch (this.r) {
         case a:
            $$0.a(0, 0, -90, $$0.a(), $$0.b(), this.m());
            break;
         case b:
            $$0.b(gel.u(), 0, 0, this.m, this.n, 0);
            break;
         case c:
            this.a($$0, $$3);
            this.a($$3);
            this.a($$0);
      }
   }

   private gpo m() {
      if (this.s != null) {
         return this.s;
      } else {
         this.s = this.l.ao().a().a(dfj.ed.o());
         return this.s;
      }
   }

   @Override
   public void e() {
      if (this.q.getAsBoolean() || System.currentTimeMillis() > this.c + 30000L) {
         this.d();
      }
   }

   @Override
   public void d() {
      this.l.aX().c(wu.c("narrator.ready_to_play"));
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
