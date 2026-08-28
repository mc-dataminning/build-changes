import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cnc extends cmz {
   private static final akj<je<cnd>> e = akn.a(cnc.class, akl.D);
   public static final float d = 0.0625F;

   public cnc(bwo<? extends cnc> $$0, dja $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akn.a $$0) {
      $$0.a(e, ctl.b(this.dX(), mg.aZ));
   }

   @Override
   public void a(akj<?> $$0) {
      if (e.equals($$0)) {
         this.f();
      }
   }

   private void b(je<cnd> $$0) {
      this.al.a(e, $$0);
   }

   public je<cnd> m() {
      return this.al.a(e);
   }

   @Nullable
   @Override
   public <T> T a(ki<? extends T> $$0) {
      return $$0 == kj.aL ? c((ki<T>)$$0, this.m()) : super.a($$0);
   }

   @Override
   protected void a(ke $$0) {
      this.a($$0, kj.aL);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(ki<T> $$0, T $$1) {
      if ($$0 == kj.aL) {
         this.b(c(kj.aL, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   public static Optional<cnc> a(dja $$0, iu $$1, ja $$2) {
      cnc $$3 = new cnc($$0, $$1);
      List<je<cnd>> $$4 = new ArrayList<>();
      $$0.F_().f(mg.aZ).c(axl.a).forEach($$4::add);
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
            int $$5 = $$4.stream().mapToInt(cnc::c).max().orElse(0);
            $$4.removeIf($$1x -> c($$1x) < $$5);
            Optional<je<cnd>> $$6 = af.b($$4, $$3.ae);
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

   private static int c(je<cnd> $$0) {
      return $$0.a().a();
   }

   private cnc(dja $$0, iu $$1) {
      super(bwo.aK, $$0, $$1);
   }

   public cnc(dja $$0, iu $$1, ja $$2, je<cnd> $$3) {
      this($$0, $$1);
      this.b($$3);
      this.a($$2);
   }

   @Override
   public void b(tz $$0) {
      $$0.a("facing", (byte)this.c.e());
      super.b($$0);
      ctl.a($$0, this.m());
   }

   @Override
   public void a(tz $$0) {
      this.c = ja.b($$0.f("facing"));
      super.a($$0);
      this.a(this.c);
      ctl.a($$0, this.dX(), mg.aZ).ifPresent(this::b);
   }

   @Override
   protected fel a(iu $$0, ja $$1) {
      float $$2 = 0.46875F;
      feq $$3 = feq.b($$0).a($$1, -0.46875);
      cnd $$4 = this.m().a();
      double $$5 = this.b($$4.b());
      double $$6 = this.b($$4.c());
      ja $$7 = $$1.i();
      feq $$8 = $$3.a($$7, $$5).a(ja.b, $$6);
      ja.a $$9 = $$1.o();
      double $$10 = $$9 == ja.a.a ? 0.0625 : (double)$$4.b();
      double $$11 = (double)$$4.c();
      double $$12 = $$9 == ja.a.c ? 0.0625 : (double)$$4.b();
      return fel.a($$8, $$10, $$11, $$12);
   }

   private double b(int $$0) {
      return $$0 % 2 == 0 ? 0.5 : 0.0;
   }

   @Override
   public void a(arq $$0, @Nullable bwf $$1) {
      if ($$0.O().c(diw.j)) {
         this.a(awn.te, 1.0F, 1.0F);
         if ($$1 instanceof crc $$2 && $$2.fV()) {
            return;
         }

         this.a($$0, czh.qN);
      }
   }

   @Override
   public void v() {
      this.a(awn.tf, 1.0F, 1.0F);
   }

   @Override
   public void b(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.a_($$0, $$1, $$2);
   }

   @Override
   public feq du() {
      return feq.a(this.a);
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
   public czd dI() {
      return new czd(czh.qN);
   }
}
