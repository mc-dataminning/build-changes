import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class byk extends byh implements bkg<hg<byl>> {
   private static final aeg<hg<byl>> f = aej.a(byk.class, aei.y);
   private static final aex<byl> g = bym.a;
   public static final String e = "variant";

   private static hg<byl> s() {
      return jd.m.f(g);
   }

   public byk(biw<? extends byk> $$0, cpx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a_() {
      this.an.a(f, s());
   }

   @Override
   public void a(aeg<?> $$0) {
      if (f.equals($$0)) {
         this.y();
      }
   }

   public void a(hg<byl> $$0) {
      this.an.b(f, $$0);
   }

   public hg<byl> q() {
      return this.an.b(f);
   }

   public static Optional<byk> a(cpx $$0, gw $$1, hc $$2) {
      byk $$3 = new byk($$0, $$1);
      List<hg<byl>> $$4 = new ArrayList<>();
      jd.m.c(aqd.a).forEach($$4::add);
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
            int $$5 = $$4.stream().mapToInt(byk::b).max().orElse(0);
            $$4.removeIf($$1x -> b($$1x) < $$5);
            Optional<hg<byl>> $$6 = ac.b($$4, $$3.ag);
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

   private static int b(hg<byl> $$0) {
      return $$0.a().a() * $$0.a().b();
   }

   private byk(cpx $$0, gw $$1) {
      super(biw.ar, $$0, $$1);
   }

   public byk(cpx $$0, gw $$1, hc $$2, hg<byl> $$3) {
      this($$0, $$1);
      this.a($$3);
      this.a($$2);
   }

   @Override
   public void b(qy $$0) {
      a($$0, this.q());
      $$0.a("facing", (byte)this.d.e());
      super.b($$0);
   }

   @Override
   public void a(qy $$0) {
      hg<byl> $$1 = c($$0).orElseGet(byk::s);
      this.a($$1);
      this.d = hc.b($$0.f("facing"));
      super.a($$0);
      this.a(this.d);
   }

   public static void a(qy $$0, hg<byl> $$1) {
      $$0.a("variant", $$1.e().orElse(g).a().toString());
   }

   public static Optional<hg<byl>> c(qy $$0) {
      return Optional.ofNullable(aey.a($$0.l("variant"))).map($$0x -> aex.a(je.P, $$0x)).flatMap(jd.m::b);
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
   public void a(@Nullable bis $$0) {
      if (this.dL().X().b(cpt.h)) {
         this.a(apf.qI, 1.0F, 1.0F);
         if ($$0 instanceof cbw $$1 && $$1.fS().d) {
            return;
         }

         this.a(cjk.pl);
      }
   }

   @Override
   public void C() {
      this.a(apf.qJ, 1.0F, 1.0F);
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
   public ehp dk() {
      return ehp.a(this.c);
   }

   @Override
   public vf<wy> di() {
      return new wz(this, this.d.d(), this.E());
   }

   @Override
   public void a(wz $$0) {
      super.a($$0);
      this.a(hc.a($$0.o()));
   }

   @Override
   public cjh dy() {
      return new cjh(cjk.pl);
   }
}
