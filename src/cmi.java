import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cmi extends cmf {
   private static final akg<js<cmj>> e = akk.a(cmi.class, aki.B);
   private static final Codec<js<cmj>> f = cmj.c.fieldOf("variant").codec();
   public static final float d = 0.0625F;

   public cmi(bwb<? extends cmi> $$0, dhp $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akk.a $$0) {
      $$0.a(e, this.dX().f(me.X).a().orElseThrow());
   }

   @Override
   public void a(akg<?> $$0) {
      if (e.equals($$0)) {
         this.f();
      }
   }

   private void b(js<cmj> $$0) {
      this.al.a(e, $$0);
   }

   public js<cmj> m() {
      return this.al.a(e);
   }

   @Nullable
   @Override
   public <T> T a(kw<? extends T> $$0) {
      return $$0 == kx.aG ? b((kw<T>)$$0, this.m()) : super.a($$0);
   }

   @Override
   protected void a(kr $$0) {
      this.a($$0, kx.aG);
      super.a($$0);
   }

   @Override
   protected <T> boolean d(kw<T> $$0, T $$1) {
      if ($$0 == kx.aG) {
         this.b(b(kx.aG, $$1));
         return true;
      } else {
         return super.d($$0, $$1);
      }
   }

   public static Optional<cmi> a(dhp $$0, jj $$1, jo $$2) {
      cmi $$3 = new cmi($$0, $$1);
      List<js<cmj>> $$4 = new ArrayList<>();
      $$0.F_().f(me.X).c(axj.a).forEach($$4::add);
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
            int $$5 = $$4.stream().mapToInt(cmi::c).max().orElse(0);
            $$4.removeIf($$1x -> c($$1x) < $$5);
            Optional<js<cmj>> $$6 = af.b($$4, $$3.ae);
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

   private static int c(js<cmj> $$0) {
      return $$0.a().a();
   }

   private cmi(dhp $$0, jj $$1) {
      super(bwb.aK, $$0, $$1);
   }

   public cmi(dhp $$0, jj $$1, jo $$2, js<cmj> $$3) {
      this($$0, $$1);
      this.b($$3);
      this.a($$2);
   }

   @Override
   public void b(tw $$0) {
      f.encodeStart(this.dX().a(uk.a), this.m()).ifSuccess($$1 -> $$0.a((tw)$$1));
      $$0.a("facing", (byte)this.c.e());
      super.b($$0);
   }

   @Override
   public void a(tw $$0) {
      f.parse(this.dX().a(uk.a), $$0).ifSuccess(this::b);
      this.c = jo.b($$0.f("facing"));
      super.a($$0);
      this.a(this.c);
   }

   @Override
   protected fcp a(jj $$0, jo $$1) {
      float $$2 = 0.46875F;
      fcu $$3 = fcu.b($$0).a($$1, -0.46875);
      cmj $$4 = this.m().a();
      double $$5 = this.b($$4.b());
      double $$6 = this.b($$4.c());
      jo $$7 = $$1.i();
      fcu $$8 = $$3.a($$7, $$5).a(jo.b, $$6);
      jo.a $$9 = $$1.o();
      double $$10 = $$9 == jo.a.a ? 0.0625 : (double)$$4.b();
      double $$11 = (double)$$4.c();
      double $$12 = $$9 == jo.a.c ? 0.0625 : (double)$$4.b();
      return fcp.a($$8, $$10, $$11, $$12);
   }

   private double b(int $$0) {
      return $$0 % 2 == 0 ? 0.5 : 0.0;
   }

   @Override
   public void a(arn $$0, @Nullable bvs $$1) {
      if ($$0.O().c(dhl.i)) {
         this.a(awk.ta, 1.0F, 1.0F);
         if ($$1 instanceof cqi $$2 && $$2.fU()) {
            return;
         }

         this.a($$0, cyc.qI);
      }
   }

   @Override
   public void v() {
      this.a(awk.tb, 1.0F, 1.0F);
   }

   @Override
   public void b(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.a_($$0, $$1, $$2);
   }

   @Override
   public fcu du() {
      return fcu.a(this.a);
   }

   @Override
   public zc<abr> a(arl $$0) {
      return new abs(this, this.c.d(), this.j());
   }

   @Override
   public void a(abs $$0) {
      super.a($$0);
      this.a(jo.a($$0.p()));
   }

   @Override
   public cxy dI() {
      return new cxy(cyc.qI);
   }
}
