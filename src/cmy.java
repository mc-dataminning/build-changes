import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cmy extends cmv {
   private static final akj<je<cmz>> e = akn.a(cmy.class, akl.C);
   public static final float d = 0.0625F;

   public cmy(bwm<? extends cmy> $$0, div $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akn.a $$0) {
      $$0.a(e, ctg.b(this.dX(), mg.aY));
   }

   @Override
   public void a(akj<?> $$0) {
      if (e.equals($$0)) {
         this.f();
      }
   }

   private void b(je<cmz> $$0) {
      this.al.a(e, $$0);
   }

   public je<cmz> m() {
      return this.al.a(e);
   }

   @Nullable
   @Override
   public <T> T a(ki<? extends T> $$0) {
      return $$0 == kj.aK ? c((ki<T>)$$0, this.m()) : super.a($$0);
   }

   @Override
   protected void a(ke $$0) {
      this.a($$0, kj.aK);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(ki<T> $$0, T $$1) {
      if ($$0 == kj.aK) {
         this.b(c(kj.aK, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   public static Optional<cmy> a(div $$0, iu $$1, ja $$2) {
      cmy $$3 = new cmy($$0, $$1);
      List<je<cmz>> $$4 = new ArrayList<>();
      $$0.F_().f(mg.aY).c(axl.a).forEach($$4::add);
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
            int $$5 = $$4.stream().mapToInt(cmy::c).max().orElse(0);
            $$4.removeIf($$1x -> c($$1x) < $$5);
            Optional<je<cmz>> $$6 = af.b($$4, $$3.ae);
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

   private static int c(je<cmz> $$0) {
      return $$0.a().a();
   }

   private cmy(div $$0, iu $$1) {
      super(bwm.aK, $$0, $$1);
   }

   public cmy(div $$0, iu $$1, ja $$2, je<cmz> $$3) {
      this($$0, $$1);
      this.b($$3);
      this.a($$2);
   }

   @Override
   public void b(tz $$0) {
      $$0.a("facing", (byte)this.c.e());
      super.b($$0);
      ctg.a($$0, this.m());
   }

   @Override
   public void a(tz $$0) {
      this.c = ja.b($$0.f("facing"));
      super.a($$0);
      this.a(this.c);
      ctg.a($$0, this.dX(), mg.aY).ifPresent(this::b);
   }

   @Override
   protected fed a(iu $$0, ja $$1) {
      float $$2 = 0.46875F;
      fei $$3 = fei.b($$0).a($$1, -0.46875);
      cmz $$4 = this.m().a();
      double $$5 = this.b($$4.b());
      double $$6 = this.b($$4.c());
      ja $$7 = $$1.i();
      fei $$8 = $$3.a($$7, $$5).a(ja.b, $$6);
      ja.a $$9 = $$1.o();
      double $$10 = $$9 == ja.a.a ? 0.0625 : (double)$$4.b();
      double $$11 = (double)$$4.c();
      double $$12 = $$9 == ja.a.c ? 0.0625 : (double)$$4.b();
      return fed.a($$8, $$10, $$11, $$12);
   }

   private double b(int $$0) {
      return $$0 % 2 == 0 ? 0.5 : 0.0;
   }

   @Override
   public void a(arq $$0, @Nullable bwd $$1) {
      if ($$0.O().c(dir.i)) {
         this.a(awn.tb, 1.0F, 1.0F);
         if ($$1 instanceof cqy $$2 && $$2.fU()) {
            return;
         }

         this.a($$0, czc.qK);
      }
   }

   @Override
   public void v() {
      this.a(awn.tc, 1.0F, 1.0F);
   }

   @Override
   public void b(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.a_($$0, $$1, $$2);
   }

   @Override
   public fei du() {
      return fei.a(this.a);
   }

   @Override
   public zf<abu> a(aro $$0) {
      return new abv(this, this.c.d(), this.j());
   }

   @Override
   public void a(abv $$0) {
      super.a($$0);
      this.a(ja.a($$0.p()));
   }

   @Override
   public cyy dI() {
      return new cyy(czc.qK);
   }
}
