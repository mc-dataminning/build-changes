import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class ckl extends cki implements bvv<jp<ckm>> {
   private static final akk<jp<ckm>> h = ako.a(ckl.class, akm.A);
   public static final MapCodec<jp<ckm>> e = ckm.c.fieldOf("variant");
   public static final Codec<jp<ckm>> f = e.codec();
   public static final float g = 0.0625F;

   public ckl(bug<? extends ckl> $$0, dev $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(ako.a $$0) {
      $$0.a(h, this.dZ().e(ly.X).a().orElseThrow());
   }

   @Override
   public void a(akk<?> $$0) {
      if (h.equals($$0)) {
         this.m();
      }
   }

   public void b(jp<ckm> $$0) {
      this.am.a(h, $$0);
   }

   public jp<ckm> t() {
      return this.am.a(h);
   }

   public static Optional<ckl> a(dev $$0, jg $$1, jl $$2) {
      ckl $$3 = new ckl($$0, $$1);
      List<jp<ckm>> $$4 = new ArrayList<>();
      $$0.H_().e(ly.X).c(axj.a).forEach($$4::add);
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
            int $$5 = $$4.stream().mapToInt(ckl::c).max().orElse(0);
            $$4.removeIf($$1x -> c($$1x) < $$5);
            Optional<jp<ckm>> $$6 = ad.b($$4, $$3.af);
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

   private static int c(jp<ckm> $$0) {
      return $$0.a().a();
   }

   private ckl(dev $$0, jg $$1) {
      super(bug.av, $$0, $$1);
   }

   public ckl(dev $$0, jg $$1, jl $$2, jp<ckm> $$3) {
      this($$0, $$1);
      this.b($$3);
      this.a($$2);
   }

   @Override
   public void b(uj $$0) {
      f.encodeStart(this.dZ().a(ux.a), this.t()).ifSuccess($$1 -> $$0.a((uj)$$1));
      $$0.a("facing", (byte)this.d.e());
      super.b($$0);
   }

   @Override
   public void a(uj $$0) {
      f.parse(this.dZ().a(ux.a), $$0).ifSuccess(this::b);
      this.d = jl.b($$0.f("facing"));
      super.a($$0);
      this.a(this.d);
   }

   @Override
   protected ezc a(jg $$0, jl $$1) {
      float $$2 = 0.46875F;
      ezh $$3 = ezh.b($$0).a($$1, -0.46875);
      ckm $$4 = this.t().a();
      double $$5 = this.b($$4.b());
      double $$6 = this.b($$4.c());
      jl $$7 = $$1.i();
      ezh $$8 = $$3.a($$7, $$5).a(jl.b, $$6);
      jl.a $$9 = $$1.o();
      double $$10 = $$9 == jl.a.a ? 0.0625 : (double)$$4.b();
      double $$11 = (double)$$4.c();
      double $$12 = $$9 == jl.a.c ? 0.0625 : (double)$$4.b();
      return ezc.a($$8, $$10, $$11, $$12);
   }

   private double b(int $$0) {
      return $$0 % 2 == 0 ? 0.5 : 0.0;
   }

   @Override
   public void b(@Nullable btz $$0) {
      if (this.dX().ac().b(der.i)) {
         this.a(awk.sr, 1.0F, 1.0F);
         if ($$0 instanceof coh $$1 && $$1.fX()) {
            return;
         }

         this.a(cwb.qa);
      }
   }

   @Override
   public void B() {
      this.a(awk.ss, 1.0F, 1.0F);
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
   public ezh dw() {
      return ezh.a(this.b);
   }

   @Override
   public zo<acd> a(arl $$0) {
      return new ace(this, this.d.d(), this.q());
   }

   @Override
   public void a(ace $$0) {
      super.a($$0);
      this.a(jl.a($$0.p()));
   }

   @Override
   public cvx dK() {
      return new cvx(cwb.qa);
   }
}
