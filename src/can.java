import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class can extends cak implements bmj<ig<cao>> {
   private static final afs<ig<cao>> f = afv.a(can.class, afu.y);
   private static final agl<cao> g = cap.a;
   public static final String e = "variant";

   private static ig<cao> s() {
      return kc.m.f(g);
   }

   public can(bkz<? extends can> $$0, csf $$1) {
      super($$0, $$1);
   }

   @Override
   protected void c_() {
      this.an.a(f, s());
   }

   @Override
   public void a(afs<?> $$0) {
      if (f.equals($$0)) {
         this.z();
      }
   }

   public void a(ig<cao> $$0) {
      this.an.b(f, $$0);
   }

   public ig<cao> q() {
      return this.an.b(f);
   }

   public static Optional<can> a(csf $$0, hx $$1, ib $$2) {
      can $$3 = new can($$0, $$1);
      List<ig<cao>> $$4 = new ArrayList<>();
      kc.m.c(art.a).forEach($$4::add);
      if ($$4.isEmpty()) {
         return Optional.empty();
      } else {
         $$3.a($$2);
         $$4.removeIf($$1x -> {
            $$3.a($$1x);
            return !$$3.A();
         });
         if ($$4.isEmpty()) {
            return Optional.empty();
         } else {
            int $$5 = $$4.stream().mapToInt(can::b).max().orElse(0);
            $$4.removeIf($$1x -> b($$1x) < $$5);
            Optional<ig<cao>> $$6 = ac.b($$4, $$3.ag);
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

   private static int b(ig<cao> $$0) {
      return $$0.a().a() * $$0.a().b();
   }

   private can(csf $$0, hx $$1) {
      super(bkz.ar, $$0, $$1);
   }

   public can(csf $$0, hx $$1, ib $$2, ig<cao> $$3) {
      this($$0, $$1);
      this.a($$3);
      this.a($$2);
   }

   @Override
   public void b(sd $$0) {
      a($$0, this.q());
      $$0.a("facing", (byte)this.d.e());
      super.b($$0);
   }

   @Override
   public void a(sd $$0) {
      ig<cao> $$1 = c($$0).orElseGet(can::s);
      this.a($$1);
      this.d = ib.b($$0.f("facing"));
      super.a($$0);
      this.a(this.d);
   }

   public static void a(sd $$0, ig<cao> $$1) {
      $$0.a("variant", $$1.e().orElse(g).a().toString());
   }

   public static Optional<ig<cao>> c(sd $$0) {
      return Optional.ofNullable(agm.a($$0.l("variant"))).map($$0x -> agl.a(kd.Q, $$0x)).flatMap(kc.m::b);
   }

   @Override
   public int B() {
      return this.q().a().a();
   }

   @Override
   public int C() {
      return this.q().a().b();
   }

   @Override
   public void a(@Nullable bkv $$0) {
      if (this.dN().Y().b(csb.i)) {
         this.a(aqv.rc, 1.0F, 1.0F);
         if ($$0 instanceof cdz $$1 && $$1.fU().d) {
            return;
         }

         this.a(clr.pW);
      }
   }

   @Override
   public void D() {
      this.a(aqv.rd, 1.0F, 1.0F);
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
   public ejz dm() {
      return ejz.a(this.c);
   }

   @Override
   public wo<yh> dk() {
      return new yi(this, this.d.d(), this.E());
   }

   @Override
   public void a(yi $$0) {
      super.a($$0);
      this.a(ib.a($$0.o()));
   }

   @Override
   public clo dA() {
      return new clo(clr.pW);
   }
}
