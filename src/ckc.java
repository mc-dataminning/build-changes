import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class ckc extends cjz implements bvm<jo<ckd>> {
   private static final akh<jo<ckd>> h = akl.a(ckc.class, akj.A);
   public static final MapCodec<jo<ckd>> e = ckd.c.fieldOf("variant");
   public static final Codec<jo<ckd>> f = e.codec();
   public static final float g = 0.0625F;

   public ckc(bty<? extends ckc> $$0, dej $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akl.a $$0) {
      $$0.a(h, this.dU().e(lw.X).a().orElseThrow());
   }

   @Override
   public void a(akh<?> $$0) {
      if (h.equals($$0)) {
         this.m();
      }
   }

   public void b(jo<ckd> $$0) {
      this.am.a(h, $$0);
   }

   public jo<ckd> t() {
      return this.am.a(h);
   }

   public static Optional<ckc> a(dej $$0, jf $$1, jk $$2) {
      ckc $$3 = new ckc($$0, $$1);
      List<jo<ckd>> $$4 = new ArrayList<>();
      $$0.G_().e(lw.X).c(axf.a).forEach($$4::add);
      if ($$4.isEmpty()) {
         return Optional.empty();
      } else {
         $$3.a($$2);
         $$4.removeIf($$1x -> {
            $$3.b($$1x);
            return !$$3.o();
         });
         if ($$4.isEmpty()) {
            return Optional.empty();
         } else {
            int $$5 = $$4.stream().mapToInt(ckc::c).max().orElse(0);
            $$4.removeIf($$1x -> c($$1x) < $$5);
            Optional<jo<ckd>> $$6 = ad.b($$4, $$3.af);
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

   private static int c(jo<ckd> $$0) {
      return $$0.a().a();
   }

   private ckc(dej $$0, jf $$1) {
      super(bty.av, $$0, $$1);
   }

   public ckc(dej $$0, jf $$1, jk $$2, jo<ckd> $$3) {
      this($$0, $$1);
      this.b($$3);
      this.a($$2);
   }

   @Override
   public void b(ug $$0) {
      f.encodeStart(this.dU().a(uu.a), this.t()).ifSuccess($$1 -> $$0.a((ug)$$1));
      $$0.a("facing", (byte)this.d.e());
      super.b($$0);
   }

   @Override
   public void a(ug $$0) {
      f.parse(this.dU().a(uu.a), $$0).ifSuccess(this::b);
      this.d = jk.b($$0.f("facing"));
      super.a($$0);
      this.a(this.d);
   }

   @Override
   protected eyr a(jf $$0, jk $$1) {
      float $$2 = 0.46875F;
      eyw $$3 = eyw.b($$0).a($$1, -0.46875);
      ckd $$4 = this.t().a();
      double $$5 = this.b($$4.b());
      double $$6 = this.b($$4.c());
      jk $$7 = $$1.i();
      eyw $$8 = $$3.a($$7, $$5).a(jk.b, $$6);
      jk.a $$9 = $$1.o();
      double $$10 = $$9 == jk.a.a ? 0.0625 : (double)$$4.b();
      double $$11 = (double)$$4.c();
      double $$12 = $$9 == jk.a.c ? 0.0625 : (double)$$4.b();
      return eyr.a($$8, $$10, $$11, $$12);
   }

   private double b(int $$0) {
      return $$0 % 2 == 0 ? 0.5 : 0.0;
   }

   @Override
   public void b(@Nullable btr $$0) {
      if (this.dS().ac().b(def.i)) {
         this.a(awg.st, 1.0F, 1.0F);
         if ($$0 instanceof cnx $$1 && $$1.fR()) {
            return;
         }

         this.a(cvw.qa);
      }
   }

   @Override
   public void B() {
      this.a(awg.su, 1.0F, 1.0F);
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
   public eyw dr() {
      return eyw.a(this.b);
   }

   @Override
   public zl<aca> a(ari $$0) {
      return new acb(this, this.d.d(), this.q());
   }

   @Override
   public void a(acb $$0) {
      super.a($$0);
      this.a(jk.a($$0.p()));
   }

   @Override
   public cvs dF() {
      return new cvs(cvw.qa);
   }
}
