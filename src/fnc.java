import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;

public class fnc extends fne {
   private static final xp a = xp.c("multiplayer.downloadingTerrain");
   private static final long b = 30000L;
   private final long c;
   private final BooleanSupplier d;
   private final fnc.a r;
   @Nullable
   private gpa s;

   public fnc(BooleanSupplier $$0, fnc.a $$1) {
      super(fey.a);
      this.d = $$0;
      this.r = $$1;
      this.c = System.currentTimeMillis();
   }

   @Override
   public boolean aC_() {
      return false;
   }

   @Override
   protected boolean aL_() {
      return false;
   }

   @Override
   public void a(fgs $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, a, this.n / 2, this.o / 2 - 50, 16777215);
   }

   @Override
   public void b(fgs $$0, int $$1, int $$2, float $$3) {
      switch (this.r) {
         case a:
            $$0.a(0, 0, -90, $$0.a(), $$0.b(), this.m());
            break;
         case b:
            $$0.b(gdx.u(), 0, 0, this.n, this.o, 0);
            break;
         case c:
            this.a($$0, $$3);
            this.a($$3);
            this.a($$0);
      }
   }

   private gpa m() {
      if (this.s != null) {
         return this.s;
      } else {
         this.s = this.m.ao().a().a(dfc.ed.o());
         return this.s;
      }
   }

   @Override
   public void e() {
      if (this.d.getAsBoolean() || System.currentTimeMillis() > this.c + 30000L) {
         this.d();
      }
   }

   @Override
   public void d() {
      this.m.aX().c(xp.c("narrator.ready_to_play"));
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
