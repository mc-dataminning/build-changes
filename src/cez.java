import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cez extends cew implements bqo<il<cfa>> {
   private static final aim<il<cfa>> f = aiq.a(cez.class, aio.y);
   private static final ajg<cfa> g = cfb.a;
   public static final String e = "variant";

   private static il<cfa> r() {
      return ki.l.g(g);
   }

   public cez(bpd<? extends cez> $$0, cxb $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(aiq.a $$0) {
      $$0.a(f, r());
   }

   @Override
   public void a(aim<?> $$0) {
      if (f.equals($$0)) {
         this.y();
      }
   }

   public void a(il<cfa> $$0) {
      this.an.a(f, $$0);
   }

   public il<cfa> p() {
      return this.an.a(f);
   }

   public static Optional<cez> a(cxb $$0, ib $$1, ih $$2) {
      cez $$3 = new cez($$0, $$1);
      List<il<cfa>> $$4 = new ArrayList<>();
      ki.l.c(auw.a).forEach($$4::add);
      if ($$4.isEmpty()) {
         return Optional.empty();
      } else {
         $$3.a($$2);
         $$4.removeIf($$1x -> {
            $$3.a($$1x);
            return !$$3.z();
         });
         if ($$4.isEmpty()) {
            return Optional.empty();
         } else {
            int $$5 = $$4.stream().mapToInt(cez::c).max().orElse(0);
            $$4.removeIf($$1x -> c($$1x) < $$5);
            Optional<il<cfa>> $$6 = ac.b($$4, $$3.ag);
            if ($$6.isEmpty()) {
               return Optional.empty();
            } else {
               $$3.a($$6.get());
               $$3.a($$2);
               return Optional.of($$3);
            }
         }
      }
   }

   private static int c(il<cfa> $$0) {
      return $$0.a().a() * $$0.a().b();
   }

   private cez(cxb $$0, ib $$1) {
      super(bpd.av, $$0, $$1);
   }

   public cez(cxb $$0, ib $$1, ih $$2, il<cfa> $$3) {
      this($$0, $$1);
      this.a($$3);
      this.a($$2);
   }

   @Override
   public void b(ta $$0) {
      a($$0, this.p());
      $$0.a("facing", (byte)this.d.e());
      super.b($$0);
   }

   @Override
   public void a(ta $$0) {
      il<cfa> $$1 = c($$0).orElseGet(cez::r);
      this.a($$1);
      this.d = ih.b($$0.f("facing"));
      super.a($$0);
      this.a(this.d);
   }

   public static void a(ta $$0, il<cfa> $$1) {
      $$0.a("variant", $$1.e().orElse(g).a().toString());
   }

   public static Optional<il<cfa>> c(ta $$0) {
      return Optional.ofNullable(ajh.a($$0.l("variant"))).map($$0x -> ajg.a(kj.R, $$0x)).flatMap(ki.l::b);
   }

   @Override
   public int A() {
      return this.p().a().a();
   }

   @Override
   public int B() {
      return this.p().a().b();
   }

   @Override
   public void b(@Nullable box $$0) {
      if (this.dM().Z().b(cwx.i)) {
         this.a(aty.rT, 1.0F, 1.0F);
         if ($$0 instanceof ciu $$1 && $$1.fM()) {
            return;
         }

         this.a(cqp.pY);
      }
   }

   @Override
   public void C() {
      this.a(aty.rU, 1.0F, 1.0F);
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
   public ept dl() {
      return ept.a(this.c);
   }

   @Override
   public yb<aam> di() {
      return new aan(this, this.d.d(), this.D());
   }

   @Override
   public void a(aan $$0) {
      super.a($$0);
      this.a(ih.a($$0.p()));
   }

   @Override
   public cqm dz() {
      return new cqm(cqp.pY);
   }
}
