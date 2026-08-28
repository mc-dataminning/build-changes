import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dmb extends dmr implements duc {
   public static final ebk b = ebj.I;
   private static final ffw a = dmr.b(12.0, 0.0, 4.0);

   protected dmb(eas.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected abstract MapCodec<? extends dmb> a();

   protected void a(eat $$0, diq $$1, dkb $$2, azv $$3, iv $$4) {
      if (!d($$0, $$1, $$4)) {
         $$2.a($$4, this, 60 + $$3.a(40));
      }
   }

   protected static boolean d(eat $$0, diq $$1, iv $$2) {
      if ($$0.c(b)) {
         return true;
      } else {
         for (jb $$3 : jb.values()) {
            if ($$1.b_($$2.a($$3)).a(axh.a)) {
               return true;
            }
         }

         return false;
      }
   }

   @Nullable
   @Override
   public eat a(ddg $$0) {
      exa $$1 = $$0.q().b_($$0.a());
      return this.m().b(b, Boolean.valueOf($$1.a(axh.a) && $$1.e() == 8));
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return a;
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, exb.c, exb.c.a($$1));
      }

      return $$4 == jb.a && !this.a($$0, $$1, $$3) ? dmt.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(eat $$0, djp $$1, iv $$2) {
      iv $$3 = $$2.e();
      return $$1.a_($$3).c($$1, $$3, jb.b);
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(b);
   }

   @Override
   protected exa b_(eat $$0) {
      return $$0.c(b) ? exb.c.a(false) : super.b_($$0);
   }
}
