import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cju extends cjr implements bve<jn<cjv>> {
   private static final akg<jn<cjv>> h = akk.a(cju.class, aki.A);
   public static final MapCodec<jn<cjv>> e = cjv.c.fieldOf("variant");
   public static final Codec<jn<cjv>> f = e.codec();
   public static final float g = 0.0625F;

   public cju(btq<? extends cju> $$0, dds $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akk.a $$0) {
      $$0.a(h, this.dU().d(lv.X).a().orElseThrow());
   }

   @Override
   public void a(akg<?> $$0) {
      if (h.equals($$0)) {
         this.m();
      }
   }

   public void b(jn<cjv> $$0) {
      this.am.a(h, $$0);
   }

   public jn<cjv> t() {
      return this.am.a(h);
   }

   public static Optional<cju> a(dds $$0, je $$1, jj $$2) {
      cju $$3 = new cju($$0, $$1);
      List<jn<cjv>> $$4 = new ArrayList<>();
      $$0.F_().d(lv.X).b(axc.a).forEach($$4::add);
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
            int $$5 = $$4.stream().mapToInt(cju::c).max().orElse(0);
            $$4.removeIf($$1x -> c($$1x) < $$5);
            Optional<jn<cjv>> $$6 = ad.b($$4, $$3.af);
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

   private static int c(jn<cjv> $$0) {
      return $$0.a().a();
   }

   private cju(dds $$0, je $$1) {
      super(btq.av, $$0, $$1);
   }

   public cju(dds $$0, je $$1, jj $$2, jn<cjv> $$3) {
      this($$0, $$1);
      this.b($$3);
      this.a($$2);
   }

   @Override
   public void b(uf $$0) {
      f.encodeStart(this.dU().a(ut.a), this.t()).ifSuccess($$1 -> $$0.a((uf)$$1));
      $$0.a("facing", (byte)this.d.e());
      super.b($$0);
   }

   @Override
   public void a(uf $$0) {
      f.parse(this.dU().a(ut.a), $$0).ifSuccess(this::b);
      this.d = jj.b($$0.f("facing"));
      super.a($$0);
      this.a(this.d);
   }

   @Override
   protected exz a(je $$0, jj $$1) {
      float $$2 = 0.46875F;
      eye $$3 = eye.b($$0).a($$1, -0.46875);
      cjv $$4 = this.t().a();
      double $$5 = this.b($$4.b());
      double $$6 = this.b($$4.c());
      jj $$7 = $$1.i();
      eye $$8 = $$3.a($$7, $$5).a(jj.b, $$6);
      jj.a $$9 = $$1.o();
      double $$10 = $$9 == jj.a.a ? 0.0625 : (double)$$4.b();
      double $$11 = (double)$$4.c();
      double $$12 = $$9 == jj.a.c ? 0.0625 : (double)$$4.b();
      return exz.a($$8, $$10, $$11, $$12);
   }

   private double b(int $$0) {
      return $$0 % 2 == 0 ? 0.5 : 0.0;
   }

   @Override
   public void b(@Nullable btj $$0) {
      if (this.dS().ac().b(ddo.i)) {
         this.a(awd.st, 1.0F, 1.0F);
         if ($$0 instanceof cnp $$1 && $$1.fP()) {
            return;
         }

         this.a(cvo.qa);
      }
   }

   @Override
   public void B() {
      this.a(awd.su, 1.0F, 1.0F);
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
   public eye dr() {
      return eye.a(this.b);
   }

   @Override
   public zk<abz> a(arf $$0) {
      return new aca(this, this.d.d(), this.q());
   }

   @Override
   public void a(aca $$0) {
      super.a($$0);
      this.a(jj.a($$0.p()));
   }

   @Override
   public cvl dF() {
      return new cvl(cvo.qa);
   }
}
