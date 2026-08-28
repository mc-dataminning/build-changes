import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cja extends cix implements bum<jm<cjb>> {
   private static final ajv<jm<cjb>> h = ajz.a(cja.class, ajx.A);
   public static final MapCodec<jm<cjb>> e = cjb.c.fieldOf("variant");
   public static final Codec<jm<cjb>> f = e.codec();
   public static final float g = 0.0625F;

   public cja(bsw<? extends cja> $$0, dcu $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(ajz.a $$0) {
      $$0.a(h, this.dS().d(lu.X).a().orElseThrow());
   }

   @Override
   public void a(ajv<?> $$0) {
      if (h.equals($$0)) {
         this.p();
      }
   }

   public void b(jm<cjb> $$0) {
      this.ao.a(h, $$0);
   }

   public jm<cjb> v() {
      return this.ao.a(h);
   }

   public static Optional<cja> a(dcu $$0, jd $$1, ji $$2) {
      cja $$3 = new cja($$0, $$1);
      List<jm<cjb>> $$4 = new ArrayList<>();
      $$0.H_().d(lu.X).c(awn.a).forEach($$4::add);
      if ($$4.isEmpty()) {
         return Optional.empty();
      } else {
         $$3.a($$2);
         $$4.removeIf($$1x -> {
            $$3.b($$1x);
            return !$$3.s();
         });
         if ($$4.isEmpty()) {
            return Optional.empty();
         } else {
            int $$5 = $$4.stream().mapToInt(cja::c).max().orElse(0);
            $$4.removeIf($$1x -> c($$1x) < $$5);
            Optional<jm<cjb>> $$6 = ad.b($$4, $$3.ah);
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

   private static int c(jm<cjb> $$0) {
      return $$0.a().a();
   }

   private cja(dcu $$0, jd $$1) {
      super(bsw.av, $$0, $$1);
   }

   public cja(dcu $$0, jd $$1, ji $$2, jm<cjb> $$3) {
      this($$0, $$1);
      this.b($$3);
      this.a($$2);
   }

   @Override
   public void b(ua $$0) {
      f.encodeStart(this.dS().a(uo.a), this.v()).ifSuccess($$1 -> $$0.a((ua)$$1));
      $$0.a("facing", (byte)this.d.e());
      super.b($$0);
   }

   @Override
   public void a(ua $$0) {
      f.parse(this.dS().a(uo.a), $$0).ifSuccess(this::b);
      this.d = ji.b($$0.f("facing"));
      super.a($$0);
      this.a(this.d);
   }

   @Override
   protected ewr a(jd $$0, ji $$1) {
      float $$2 = 0.46875F;
      eww $$3 = eww.b($$0).a($$1, -0.46875);
      cjb $$4 = this.v().a();
      double $$5 = this.b($$4.b());
      double $$6 = this.b($$4.c());
      ji $$7 = $$1.i();
      eww $$8 = $$3.a($$7, $$5).a(ji.b, $$6);
      ji.a $$9 = $$1.o();
      double $$10 = $$9 == ji.a.a ? 0.0625 : (double)$$4.b();
      double $$11 = (double)$$4.c();
      double $$12 = $$9 == ji.a.c ? 0.0625 : (double)$$4.b();
      return ewr.a($$8, $$10, $$11, $$12);
   }

   private double b(int $$0) {
      return $$0 % 2 == 0 ? 0.5 : 0.0;
   }

   @Override
   public void b(@Nullable bsq $$0) {
      if (this.dQ().ab().b(dcq.i)) {
         this.a(avo.ss, 1.0F, 1.0F);
         if ($$0 instanceof cmv $$1 && $$1.fM()) {
            return;
         }

         this.a(cur.pZ);
      }
   }

   @Override
   public void C() {
      this.a(avo.st, 1.0F, 1.0F);
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
   public eww dp() {
      return eww.a(this.b);
   }

   @Override
   public zf<abt> dm() {
      return new abu(this, this.d.d(), this.t());
   }

   @Override
   public void a(abu $$0) {
      super.a($$0);
      this.a(ji.a($$0.p()));
   }

   @Override
   public cuo dD() {
      return new cuo(cur.pZ);
   }
}
