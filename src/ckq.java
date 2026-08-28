import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class ckq extends ckn implements bwa<jq<ckr>> {
   private static final akl<jq<ckr>> h = akp.a(ckq.class, akn.A);
   public static final MapCodec<jq<ckr>> e = ckr.c.fieldOf("variant");
   public static final Codec<jq<ckr>> f = e.codec();
   public static final float g = 0.0625F;

   public ckq(bul<? extends ckq> $$0, dfb $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akp.a $$0) {
      $$0.a(h, this.dZ().e(lz.X).a().orElseThrow());
   }

   @Override
   public void a(akl<?> $$0) {
      if (h.equals($$0)) {
         this.m();
      }
   }

   public void b(jq<ckr> $$0) {
      this.am.a(h, $$0);
   }

   public jq<ckr> t() {
      return this.am.a(h);
   }

   public static Optional<ckq> a(dfb $$0, jh $$1, jm $$2) {
      ckq $$3 = new ckq($$0, $$1);
      List<jq<ckr>> $$4 = new ArrayList<>();
      $$0.H_().e(lz.X).c(axk.a).forEach($$4::add);
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
            int $$5 = $$4.stream().mapToInt(ckq::c).max().orElse(0);
            $$4.removeIf($$1x -> c($$1x) < $$5);
            Optional<jq<ckr>> $$6 = ae.b($$4, $$3.af);
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

   private static int c(jq<ckr> $$0) {
      return $$0.a().a();
   }

   private ckq(dfb $$0, jh $$1) {
      super(bul.av, $$0, $$1);
   }

   public ckq(dfb $$0, jh $$1, jm $$2, jq<ckr> $$3) {
      this($$0, $$1);
      this.b($$3);
      this.a($$2);
   }

   @Override
   public void b(uk $$0) {
      f.encodeStart(this.dZ().a(uy.a), this.t()).ifSuccess($$1 -> $$0.a((uk)$$1));
      $$0.a("facing", (byte)this.d.e());
      super.b($$0);
   }

   @Override
   public void a(uk $$0) {
      f.parse(this.dZ().a(uy.a), $$0).ifSuccess(this::b);
      this.d = jm.b($$0.f("facing"));
      super.a($$0);
      this.a(this.d);
   }

   @Override
   protected ezi a(jh $$0, jm $$1) {
      float $$2 = 0.46875F;
      ezn $$3 = ezn.b($$0).a($$1, -0.46875);
      ckr $$4 = this.t().a();
      double $$5 = this.b($$4.b());
      double $$6 = this.b($$4.c());
      jm $$7 = $$1.i();
      ezn $$8 = $$3.a($$7, $$5).a(jm.b, $$6);
      jm.a $$9 = $$1.o();
      double $$10 = $$9 == jm.a.a ? 0.0625 : (double)$$4.b();
      double $$11 = (double)$$4.c();
      double $$12 = $$9 == jm.a.c ? 0.0625 : (double)$$4.b();
      return ezi.a($$8, $$10, $$11, $$12);
   }

   private double b(int $$0) {
      return $$0 % 2 == 0 ? 0.5 : 0.0;
   }

   @Override
   public void b(@Nullable bue $$0) {
      if (this.dX().ac().b(dex.i)) {
         this.a(awl.sr, 1.0F, 1.0F);
         if ($$0 instanceof com $$1 && $$1.fX()) {
            return;
         }

         this.a(cwf.qa);
      }
   }

   @Override
   public void B() {
      this.a(awl.ss, 1.0F, 1.0F);
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
   public ezn dw() {
      return ezn.a(this.b);
   }

   @Override
   public zp<ace> a(arm $$0) {
      return new acf(this, this.d.d(), this.q());
   }

   @Override
   public void a(acf $$0) {
      super.a($$0);
      this.a(jm.a($$0.p()));
   }

   @Override
   public cwb dK() {
      return new cwb(cwf.qa);
   }
}
