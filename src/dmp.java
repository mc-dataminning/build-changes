import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Optional;

public class dmp extends dqs implements dmu, duc {
   public static final MapCodec<dmp> a = b(dmp::new);
   private static final ebk b = ebj.I;
   private static final Map<jb, ffw> c = fft.c(dmr.b(6.0, 0.0, 16.0).a(0.0, 0.0, 0.25).d());

   @Override
   public MapCodec<dmp> a() {
      return a;
   }

   protected dmp(eas.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(false)).b(e, jb.c));
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return c.get($$0.c(e));
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(b, e);
   }

   @Override
   protected exa b_(eat $$0) {
      return $$0.c(b) ? exb.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(eat $$0, djp $$1, iv $$2) {
      iv $$3 = $$2.e();
      eat $$4 = $$1.a_($$3);
      eat $$5 = $$1.a_($$2.d());
      return ($$4.a(this) || $$4.a(axc.bB)) && ($$5.a(this) || $$5.a(dmt.tn));
   }

   protected static boolean a(djn $$0, iv $$1, exa $$2, jb $$3) {
      eat $$4 = dmt.to.m().b(b, Boolean.valueOf($$2.a(exb.c))).b(e, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      if (($$4 == jb.a || $$4 == jb.b) && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      if ($$0.c(b)) {
         $$2.a($$3, exb.c, exb.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(eat $$0, arq $$1, iv $$2, azv $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean a(djp $$0, iv $$1, eat $$2) {
      Optional<iv> $$3 = m.a($$0, $$1, $$2.b(), jb.b, dmt.tn);
      if ($$3.isEmpty()) {
         return false;
      } else {
         iv $$4 = $$3.get().d();
         eat $$5 = $$0.a_($$4);
         return dmo.a((djo)$$0, $$4, $$5);
      }
   }

   @Override
   public boolean a(djm $$0, azv $$1, iv $$2, eat $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iv $$2, eat $$3) {
      Optional<iv> $$4 = m.a($$0, $$2, $$3.b(), jb.b, dmt.tn);
      if (!$$4.isEmpty()) {
         iv $$5 = $$4.get();
         iv $$6 = $$5.d();
         jb $$7 = $$3.c(e);
         a($$0, $$5, $$0.b_($$5), $$7);
         dmo.a($$0, $$6, $$0.b_($$6), $$7);
      }
   }

   @Override
   protected czn a(djp $$0, iv $$1, eat $$2, boolean $$3) {
      return new czn(dmt.tn);
   }
}
