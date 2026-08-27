import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cai extends caf implements bme<ib<caj>> {
   private static final afo<ib<caj>> f = afr.a(cai.class, afq.y);
   private static final agh<caj> g = cak.a;
   public static final String e = "variant";

   private static ib<caj> s() {
      return jy.m.f(g);
   }

   public cai(bku<? extends cai> $$0, csa $$1) {
      super($$0, $$1);
   }

   @Override
   protected void b_() {
      this.an.a(f, s());
   }

   @Override
   public void a(afo<?> $$0) {
      if (f.equals($$0)) {
         this.z();
      }
   }

   public void a(ib<caj> $$0) {
      this.an.b(f, $$0);
   }

   public ib<caj> q() {
      return this.an.b(f);
   }

   public static Optional<cai> a(csa $$0, ht $$1, hx $$2) {
      cai $$3 = new cai($$0, $$1);
      List<ib<caj>> $$4 = new ArrayList<>();
      jy.m.c(arp.a).forEach($$4::add);
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
            int $$5 = $$4.stream().mapToInt(cai::b).max().orElse(0);
            $$4.removeIf($$1x -> b($$1x) < $$5);
            Optional<ib<caj>> $$6 = ac.b($$4, $$3.ag);
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

   private static int b(ib<caj> $$0) {
      return $$0.a().a() * $$0.a().b();
   }

   private cai(csa $$0, ht $$1) {
      super(bku.ar, $$0, $$1);
   }

   public cai(csa $$0, ht $$1, hx $$2, ib<caj> $$3) {
      this($$0, $$1);
      this.a($$3);
      this.a($$2);
   }

   @Override
   public void b(rz $$0) {
      a($$0, this.q());
      $$0.a("facing", (byte)this.d.e());
      super.b($$0);
   }

   @Override
   public void a(rz $$0) {
      ib<caj> $$1 = c($$0).orElseGet(cai::s);
      this.a($$1);
      this.d = hx.b($$0.f("facing"));
      super.a($$0);
      this.a(this.d);
   }

   public static void a(rz $$0, ib<caj> $$1) {
      $$0.a("variant", $$1.e().orElse(g).a().toString());
   }

   public static Optional<ib<caj>> c(rz $$0) {
      return Optional.ofNullable(agi.a($$0.l("variant"))).map($$0x -> agh.a(jz.Q, $$0x)).flatMap(jy.m::b);
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
   public void a(@Nullable bkq $$0) {
      if (this.dN().Y().b(crw.i)) {
         this.a(aqr.rc, 1.0F, 1.0F);
         if ($$0 instanceof cdu $$1 && $$1.fU().d) {
            return;
         }

         this.a(clm.pW);
      }
   }

   @Override
   public void D() {
      this.a(aqr.rd, 1.0F, 1.0F);
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
   public eju dm() {
      return eju.a(this.c);
   }

   @Override
   public wk<yd> dk() {
      return new ye(this, this.d.d(), this.E());
   }

   @Override
   public void a(ye $$0) {
      super.a($$0);
      this.a(hx.a($$0.o()));
   }

   @Override
   public clj dA() {
      return new clj(clm.pW);
   }
}
