import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqn extends dmr implements duc {
   public static final MapCodec<dqn> a = b(dqn::new);
   private static final ebk b = ebj.I;
   private static final ffw c = dmr.b(12.0, 10.0, 16.0);

   @Override
   public MapCodec<dqn> a() {
      return a;
   }

   protected dqn(eas.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(b);
   }

   @Override
   protected exa b_(eat $$0) {
      return $$0.c(b) ? exb.c.a(false) : super.b_($$0);
   }

   @Nullable
   @Override
   public eat a(ddg $$0) {
      eat $$1 = super.a($$0);
      if ($$1 != null) {
         exa $$2 = $$0.q().b_($$0.a());
         return $$1.b(b, Boolean.valueOf($$2.a() == exb.c));
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(eat $$0, djp $$1, iv $$2) {
      iv $$3 = $$2.d();
      eat $$4 = $$1.a_($$3);
      return $$4.c($$1, $$3, jb.a);
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return c;
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      if ($$4 == jb.b && !this.a($$0, $$1, $$3)) {
         return dmt.a.m();
      } else {
         if ($$0.c(b)) {
            $$2.a($$3, exb.c, exb.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
