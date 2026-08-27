import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class bzl extends bzi implements blh<ib<bzm>> {
   private static final afc<ib<bzm>> f = aff.a(bzl.class, afe.y);
   private static final afv<bzm> g = bzn.a;
   public static final String e = "variant";

   private static ib<bzm> s() {
      return jy.m.f(g);
   }

   public bzl(bjx<? extends bzl> $$0, cqz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void b_() {
      this.an.a(f, s());
   }

   @Override
   public void a(afc<?> $$0) {
      if (f.equals($$0)) {
         this.y();
      }
   }

   public void a(ib<bzm> $$0) {
      this.an.b(f, $$0);
   }

   public ib<bzm> q() {
      return this.an.b(f);
   }

   public static Optional<bzl> a(cqz $$0, ht $$1, hx $$2) {
      bzl $$3 = new bzl($$0, $$1);
      List<ib<bzm>> $$4 = new ArrayList<>();
      jy.m.c(arb.a).forEach($$4::add);
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
            int $$5 = $$4.stream().mapToInt(bzl::b).max().orElse(0);
            $$4.removeIf($$1x -> b($$1x) < $$5);
            Optional<ib<bzm>> $$6 = ac.b($$4, $$3.ag);
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

   private static int b(ib<bzm> $$0) {
      return $$0.a().a() * $$0.a().b();
   }

   private bzl(cqz $$0, ht $$1) {
      super(bjx.ar, $$0, $$1);
   }

   public bzl(cqz $$0, ht $$1, hx $$2, ib<bzm> $$3) {
      this($$0, $$1);
      this.a($$3);
      this.a($$2);
   }

   @Override
   public void b(rt $$0) {
      a($$0, this.q());
      $$0.a("facing", (byte)this.d.e());
      super.b($$0);
   }

   @Override
   public void a(rt $$0) {
      ib<bzm> $$1 = c($$0).orElseGet(bzl::s);
      this.a($$1);
      this.d = hx.b($$0.f("facing"));
      super.a($$0);
      this.a(this.d);
   }

   public static void a(rt $$0, ib<bzm> $$1) {
      $$0.a("variant", $$1.e().orElse(g).a().toString());
   }

   public static Optional<ib<bzm>> c(rt $$0) {
      return Optional.ofNullable(afw.a($$0.l("variant"))).map($$0x -> afv.a(jz.Q, $$0x)).flatMap(jy.m::b);
   }

   @Override
   public int A() {
      return this.q().a().a();
   }

   @Override
   public int B() {
      return this.q().a().b();
   }

   @Override
   public void a(@Nullable bjt $$0) {
      if (this.dL().X().b(cqv.h)) {
         this.a(aqd.qK, 1.0F, 1.0F);
         if ($$0 instanceof ccx $$1 && $$1.fT().d) {
            return;
         }

         this.a(ckm.pl);
      }
   }

   @Override
   public void C() {
      this.a(aqd.qL, 1.0F, 1.0F);
   }

   @Override
   public void b(double $$0, double $$1, double $$2, float $$3, float $$4) {
      this.e($$0, $$1, $$2);
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      this.e($$0, $$1, $$2);
   }

   @Override
   public eif dk() {
      return eif.a(this.c);
   }

   @Override
   public wb<xu> di() {
      return new xv(this, this.d.d(), this.E());
   }

   @Override
   public void a(xv $$0) {
      super.a($$0);
      this.a(hx.a($$0.o()));
   }

   @Override
   public ckj dy() {
      return new ckj(ckm.pl);
   }
}
