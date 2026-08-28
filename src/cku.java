import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cku extends ckr implements bwe<jq<ckv>> {
   private static final ako<jq<ckv>> h = aks.a(cku.class, akq.A);
   public static final MapCodec<jq<ckv>> e = ckv.c.fieldOf("variant");
   public static final Codec<jq<ckv>> f = e.codec();
   public static final float g = 0.0625F;

   public cku(bup<? extends cku> $$0, dff $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(aks.a $$0) {
      $$0.a(h, this.ea().e(ma.X).a().orElseThrow());
   }

   @Override
   public void a(ako<?> $$0) {
      if (h.equals($$0)) {
         this.m();
      }
   }

   public void b(jq<ckv> $$0) {
      this.am.a(h, $$0);
   }

   public jq<ckv> t() {
      return this.am.a(h);
   }

   public static Optional<cku> a(dff $$0, jh $$1, jm $$2) {
      cku $$3 = new cku($$0, $$1);
      List<jq<ckv>> $$4 = new ArrayList<>();
      $$0.H_().e(ma.X).c(axn.a).forEach($$4::add);
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
            int $$5 = $$4.stream().mapToInt(cku::c).max().orElse(0);
            $$4.removeIf($$1x -> c($$1x) < $$5);
            Optional<jq<ckv>> $$6 = ae.b($$4, $$3.af);
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

   private static int c(jq<ckv> $$0) {
      return $$0.a().a();
   }

   private cku(dff $$0, jh $$1) {
      super(bup.av, $$0, $$1);
   }

   public cku(dff $$0, jh $$1, jm $$2, jq<ckv> $$3) {
      this($$0, $$1);
      this.b($$3);
      this.a($$2);
   }

   @Override
   public void b(un $$0) {
      f.encodeStart(this.ea().a(vb.a), this.t()).ifSuccess($$1 -> $$0.a((un)$$1));
      $$0.a("facing", (byte)this.d.e());
      super.b($$0);
   }

   @Override
   public void a(un $$0) {
      f.parse(this.ea().a(vb.a), $$0).ifSuccess(this::b);
      this.d = jm.b($$0.f("facing"));
      super.a($$0);
      this.a(this.d);
   }

   @Override
   protected ezm a(jh $$0, jm $$1) {
      float $$2 = 0.46875F;
      ezr $$3 = ezr.b($$0).a($$1, -0.46875);
      ckv $$4 = this.t().a();
      double $$5 = this.b($$4.b());
      double $$6 = this.b($$4.c());
      jm $$7 = $$1.i();
      ezr $$8 = $$3.a($$7, $$5).a(jm.b, $$6);
      jm.a $$9 = $$1.o();
      double $$10 = $$9 == jm.a.a ? 0.0625 : (double)$$4.b();
      double $$11 = (double)$$4.c();
      double $$12 = $$9 == jm.a.c ? 0.0625 : (double)$$4.b();
      return ezm.a($$8, $$10, $$11, $$12);
   }

   private double b(int $$0) {
      return $$0 % 2 == 0 ? 0.5 : 0.0;
   }

   @Override
   public void b(@Nullable bui $$0) {
      if (this.dY().ac().b(dfb.i)) {
         this.a(awo.sr, 1.0F, 1.0F);
         if ($$0 instanceof cor $$1 && $$1.fY()) {
            return;
         }

         this.a(cwj.qa);
      }
   }

   @Override
   public void B() {
      this.a(awo.ss, 1.0F, 1.0F);
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
   public ezr dx() {
      return ezr.a(this.b);
   }

   @Override
   public zs<ach> a(arp $$0) {
      return new aci(this, this.d.d(), this.q());
   }

   @Override
   public void a(aci $$0) {
      super.a($$0);
      this.a(jm.a($$0.p()));
   }

   @Override
   public cwf dL() {
      return new cwf(cwj.qa);
   }
}
