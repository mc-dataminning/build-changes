import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cln extends clk implements bwx<jq<clo>> {
   private static final aks<jq<clo>> g = akw.a(cln.class, aku.A);
   public static final MapCodec<jq<clo>> d = clo.c.fieldOf("variant");
   public static final Codec<jq<clo>> e = d.codec();
   public static final float f = 0.0625F;

   public cln(bvi<? extends cln> $$0, dgz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akw.a $$0) {
      $$0.a(g, this.dY().e(mb.X).a().orElseThrow());
   }

   @Override
   public void a(aks<?> $$0) {
      if (g.equals($$0)) {
         this.l();
      }
   }

   public void b(jq<clo> $$0) {
      this.al.a(g, $$0);
   }

   public jq<clo> s() {
      return this.al.a(g);
   }

   public static Optional<cln> a(dgz $$0, jh $$1, jm $$2) {
      cln $$3 = new cln($$0, $$1);
      List<jq<clo>> $$4 = new ArrayList<>();
      $$0.K_().e(mb.X).c(axu.a).forEach($$4::add);
      if ($$4.isEmpty()) {
         return Optional.empty();
      } else {
         $$3.a($$2);
         $$4.removeIf($$1x -> {
            $$3.b($$1x);
            return !$$3.m();
         });
         if ($$4.isEmpty()) {
            return Optional.empty();
         } else {
            int $$5 = $$4.stream().mapToInt(cln::c).max().orElse(0);
            $$4.removeIf($$1x -> c($$1x) < $$5);
            Optional<jq<clo>> $$6 = ae.b($$4, $$3.ae);
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

   private static int c(jq<clo> $$0) {
      return $$0.a().a();
   }

   private cln(dgz $$0, jh $$1) {
      super(bvi.aL, $$0, $$1);
   }

   public cln(dgz $$0, jh $$1, jm $$2, jq<clo> $$3) {
      this($$0, $$1);
      this.b($$3);
      this.a($$2);
   }

   @Override
   public void b(um $$0) {
      e.encodeStart(this.dY().a(va.a), this.s()).ifSuccess($$1 -> $$0.a((um)$$1));
      $$0.a("facing", (byte)this.c.e());
      super.b($$0);
   }

   @Override
   public void a(um $$0) {
      e.parse(this.dY().a(va.a), $$0).ifSuccess(this::b);
      this.c = jm.b($$0.f("facing"));
      super.a($$0);
      this.a(this.c);
   }

   @Override
   protected fbm a(jh $$0, jm $$1) {
      float $$2 = 0.46875F;
      fbr $$3 = fbr.b($$0).a($$1, -0.46875);
      clo $$4 = this.s().a();
      double $$5 = this.b($$4.b());
      double $$6 = this.b($$4.c());
      jm $$7 = $$1.i();
      fbr $$8 = $$3.a($$7, $$5).a(jm.b, $$6);
      jm.a $$9 = $$1.o();
      double $$10 = $$9 == jm.a.a ? 0.0625 : (double)$$4.b();
      double $$11 = (double)$$4.c();
      double $$12 = $$9 == jm.a.c ? 0.0625 : (double)$$4.b();
      return fbm.a($$8, $$10, $$11, $$12);
   }

   private double b(int $$0) {
      return $$0 % 2 == 0 ? 0.5 : 0.0;
   }

   @Override
   public void a(arx $$0, @Nullable bvb $$1) {
      if ($$0.O().b(dgv.i)) {
         this.a(awv.sQ, 1.0F, 1.0F);
         if ($$1 instanceof cpo $$2 && $$2.fV()) {
            return;
         }

         this.a($$0, cxk.qE);
      }
   }

   @Override
   public void z() {
      this.a(awv.sR, 1.0F, 1.0F);
   }

   @Override
   public void b(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.a_($$0, $$1, $$2);
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      this.a_($$0, $$1, $$2);
   }

   @Override
   public fbr dv() {
      return fbr.a(this.a);
   }

   @Override
   public zr<acg> a(arv $$0) {
      return new ach(this, this.c.d(), this.p());
   }

   @Override
   public void a(ach $$0) {
      super.a($$0);
      this.a(jm.a($$0.p()));
   }

   @Override
   public cxg dJ() {
      return new cxg(cxk.qE);
   }
}
