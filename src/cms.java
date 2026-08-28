import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cms extends cmp {
   private static final akh<je<cmt>> e = akl.a(cms.class, akj.B);
   public static final float d = 0.0625F;

   public cms(bwj<? extends cms> $$0, dip $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akl.a $$0) {
      $$0.a(e, cta.b(this.dX(), mg.aX));
   }

   @Override
   public void a(akh<?> $$0) {
      if (e.equals($$0)) {
         this.f();
      }
   }

   private void b(je<cmt> $$0) {
      this.al.a(e, $$0);
   }

   public je<cmt> m() {
      return this.al.a(e);
   }

   @Nullable
   @Override
   public <T> T a(ki<? extends T> $$0) {
      return $$0 == kj.aJ ? c((ki<T>)$$0, this.m()) : super.a($$0);
   }

   @Override
   protected void a(ke $$0) {
      this.a($$0, kj.aJ);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(ki<T> $$0, T $$1) {
      if ($$0 == kj.aJ) {
         this.b(c(kj.aJ, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   public static Optional<cms> a(dip $$0, iu $$1, ja $$2) {
      cms $$3 = new cms($$0, $$1);
      List<je<cmt>> $$4 = new ArrayList<>();
      $$0.F_().f(mg.aX).c(axj.a).forEach($$4::add);
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
            int $$5 = $$4.stream().mapToInt(cms::c).max().orElse(0);
            $$4.removeIf($$1x -> c($$1x) < $$5);
            Optional<je<cmt>> $$6 = af.b($$4, $$3.ae);
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

   private static int c(je<cmt> $$0) {
      return $$0.a().a();
   }

   private cms(dip $$0, iu $$1) {
      super(bwj.aK, $$0, $$1);
   }

   public cms(dip $$0, iu $$1, ja $$2, je<cmt> $$3) {
      this($$0, $$1);
      this.b($$3);
      this.a($$2);
   }

   @Override
   public void b(tx $$0) {
      $$0.a("facing", (byte)this.c.e());
      super.b($$0);
      cta.a($$0, this.m());
   }

   @Override
   public void a(tx $$0) {
      this.c = ja.b($$0.f("facing"));
      super.a($$0);
      this.a(this.c);
      cta.a($$0, this.dX(), mg.aX).ifPresent(this::b);
   }

   @Override
   protected fdr a(iu $$0, ja $$1) {
      float $$2 = 0.46875F;
      fdw $$3 = fdw.b($$0).a($$1, -0.46875);
      cmt $$4 = this.m().a();
      double $$5 = this.b($$4.b());
      double $$6 = this.b($$4.c());
      ja $$7 = $$1.i();
      fdw $$8 = $$3.a($$7, $$5).a(ja.b, $$6);
      ja.a $$9 = $$1.o();
      double $$10 = $$9 == ja.a.a ? 0.0625 : (double)$$4.b();
      double $$11 = (double)$$4.c();
      double $$12 = $$9 == ja.a.c ? 0.0625 : (double)$$4.b();
      return fdr.a($$8, $$10, $$11, $$12);
   }

   private double b(int $$0) {
      return $$0 % 2 == 0 ? 0.5 : 0.0;
   }

   @Override
   public void a(aro $$0, @Nullable bwa $$1) {
      if ($$0.O().c(dil.i)) {
         this.a(awl.ta, 1.0F, 1.0F);
         if ($$1 instanceof cqs $$2 && $$2.fU()) {
            return;
         }

         this.a($$0, cyw.qI);
      }
   }

   @Override
   public void v() {
      this.a(awl.tb, 1.0F, 1.0F);
   }

   @Override
   public void b(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.a_($$0, $$1, $$2);
   }

   @Override
   public fdw du() {
      return fdw.a(this.a);
   }

   @Override
   public zd<abs> a(arm $$0) {
      return new abt(this, this.c.d(), this.j());
   }

   @Override
   public void a(abt $$0) {
      super.a($$0);
      this.a(ja.a($$0.p()));
   }

   @Override
   public cys dI() {
      return new cys(cyw.qI);
   }
}
