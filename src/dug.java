import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dug extends dpa implements dmu, duc {
   public static final MapCodec<dug> c = b(dug::new);
   private static final ebk e = ebj.I;
   public static final ebr<jb> d = ebj.T;
   private static final ffw f = dmr.b(12.0, 0.0, 13.0);

   @Override
   public MapCodec<dug> a() {
      return c;
   }

   public dug(eas.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, ebp.b).b(e, Boolean.valueOf(false)).b(d, jb.c));
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return f;
   }

   @Override
   protected boolean b(eat $$0, diq $$1, iv $$2) {
      return $$0.a(axc.bA) || $$1.b_($$2.d()).a(exb.c) && super.b($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public eat a(ddg $$0) {
      eat $$1 = super.a($$0);
      return $$1 != null ? b($$0.q(), $$0.a(), $$1.b(d, $$0.g().g())) : null;
   }

   @Override
   public void a(djm $$0, iv $$1, eat $$2, bxj $$3, czn $$4) {
      if (!$$0.w_()) {
         iv $$5 = $$1.d();
         eat $$6 = dpa.b($$0, $$5, this.m().b(b, ebp.a).b(d, $$2.c(d)));
         $$0.a($$5, $$6, 3);
      }
   }

   @Override
   protected exa b_(eat $$0) {
      return $$0.c(e) ? exb.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(eat $$0, djp $$1, iv $$2) {
      if ($$0.c(b) == ebp.a) {
         return super.a($$0, $$1, $$2);
      } else {
         iv $$3 = $$2.e();
         eat $$4 = $$1.a_($$3);
         return this.b($$4, $$1, $$3);
      }
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      if ($$0.c(e)) {
         $$2.a($$3, exb.c, exb.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(b, e, d);
   }

   @Override
   public boolean a(djp $$0, iv $$1, eat $$2) {
      return true;
   }

   @Override
   public boolean a(djm $$0, azv $$1, iv $$2, eat $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iv $$2, eat $$3) {
      if ($$3.c(dpa.b) == ebp.b) {
         iv $$4 = $$2.d();
         $$0.a($$4, $$0.b_($$4).g(), 18);
         dmo.a($$0, $$1, $$2, $$3.c(d));
      } else {
         iv $$5 = $$2.e();
         this.a($$0, $$1, $$5, $$0.a_($$5));
      }
   }

   @Override
   protected eat a(eat $$0, dtl $$1) {
      return $$0.b(d, $$1.a($$0.c(d)));
   }

   @Override
   protected eat a(eat $$0, dru $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected float aq_() {
      return 0.1F;
   }
}
