import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class clr extends clo implements bwy<jr<cls>> {
   private static final ajx<jr<cls>> g = akb.a(clr.class, ajz.B);
   public static final MapCodec<jr<cls>> d = cls.c.fieldOf("variant");
   public static final Codec<jr<cls>> e = d.codec();
   public static final float f = 0.0625F;

   public clr(bvi<? extends clr> $$0, dgz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akb.a $$0) {
      $$0.a(g, this.dW().e(mc.X).a().orElseThrow());
   }

   @Override
   public void a(ajx<?> $$0) {
      if (g.equals($$0)) {
         this.f();
      }
   }

   public void b(jr<cls> $$0) {
      this.al.a(g, $$0);
   }

   public jr<cls> m() {
      return this.al.a(g);
   }

   public static Optional<clr> a(dgz $$0, ji $$1, jn $$2) {
      clr $$3 = new clr($$0, $$1);
      List<jr<cls>> $$4 = new ArrayList<>();
      $$0.F_().e(mc.X).c(awz.a).forEach($$4::add);
      if ($$4.isEmpty()) {
         return Optional.empty();
      } else {
         $$3.a($$2);
         $$4.removeIf($$1x -> {
            $$3.b($$1x);
            return !$$3.g();
         });
         if ($$4.isEmpty()) {
            return Optional.empty();
         } else {
            int $$5 = $$4.stream().mapToInt(clr::c).max().orElse(0);
            $$4.removeIf($$1x -> c($$1x) < $$5);
            Optional<jr<cls>> $$6 = af.b($$4, $$3.ae);
            if ($$6.isEmpty()) {
               return Optional.empty();
            } else {
               $$3.b($$6.get());
               $$3.a($$2);
               return Optional.of($$3);
            }
         }
      }
   }

   private static int c(jr<cls> $$0) {
      return $$0.a().a();
   }

   private clr(dgz $$0, ji $$1) {
      super(bvi.aK, $$0, $$1);
   }

   public clr(dgz $$0, ji $$1, jn $$2, jr<cls> $$3) {
      this($$0, $$1);
      this.b($$3);
      this.a($$2);
   }

   @Override
   public void b(tq $$0) {
      e.encodeStart(this.dW().a(ue.a), this.m()).ifSuccess($$1 -> $$0.a((tq)$$1));
      $$0.a("facing", (byte)this.c.e());
      super.b($$0);
   }

   @Override
   public void a(tq $$0) {
      e.parse(this.dW().a(ue.a), $$0).ifSuccess(this::b);
      this.c = jn.b($$0.f("facing"));
      super.a($$0);
      this.a(this.c);
   }

   @Override
   protected fbs a(ji $$0, jn $$1) {
      float $$2 = 0.46875F;
      fbx $$3 = fbx.b($$0).a($$1, -0.46875);
      cls $$4 = this.m().a();
      double $$5 = this.b($$4.b());
      double $$6 = this.b($$4.c());
      jn $$7 = $$1.i();
      fbx $$8 = $$3.a($$7, $$5).a(jn.b, $$6);
      jn.a $$9 = $$1.o();
      double $$10 = $$9 == jn.a.a ? 0.0625 : (double)$$4.b();
      double $$11 = (double)$$4.c();
      double $$12 = $$9 == jn.a.c ? 0.0625 : (double)$$4.b();
      return fbs.a($$8, $$10, $$11, $$12);
   }

   private double b(int $$0) {
      return $$0 % 2 == 0 ? 0.5 : 0.0;
   }

   @Override
   public void a(ard $$0, @Nullable bva $$1) {
      if ($$0.O().b(dgv.i)) {
         this.a(awa.ta, 1.0F, 1.0F);
         if ($$1 instanceof cpr $$2 && $$2.fX()) {
            return;
         }

         this.a($$0, cxl.qG);
      }
   }

   @Override
   public void v() {
      this.a(awa.tb, 1.0F, 1.0F);
   }

   @Override
   public void b(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.a_($$0, $$1, $$2);
   }

   @Override
   public fbx dt() {
      return fbx.a(this.a);
   }

   @Override
   public yw<abl> a(arb $$0) {
      return new abm(this, this.c.d(), this.j());
   }

   @Override
   public void a(abm $$0) {
      super.a($$0);
      this.a(jn.a($$0.p()));
   }

   @Override
   public cxh dH() {
      return new cxh(cxl.qG);
   }
}
