import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class byi extends byf implements bke<hg<byj>> {
   private static final aef<hg<byj>> f = aei.a(byi.class, aeh.y);
   private static final aew<byj> g = byk.a;
   public static final String e = "variant";

   private static hg<byj> s() {
      return jd.m.f(g);
   }

   public byi(biu<? extends byi> $$0, cpv $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a_() {
      this.an.a(f, s());
   }

   @Override
   public void a(aef<?> $$0) {
      if (f.equals($$0)) {
         this.y();
      }
   }

   public void a(hg<byj> $$0) {
      this.an.b(f, $$0);
   }

   public hg<byj> q() {
      return this.an.b(f);
   }

   public static Optional<byi> a(cpv $$0, gw $$1, hc $$2) {
      byi $$3 = new byi($$0, $$1);
      List<hg<byj>> $$4 = new ArrayList<>();
      jd.m.c(aqc.a).forEach($$4::add);
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
            int $$5 = $$4.stream().mapToInt(byi::b).max().orElse(0);
            $$4.removeIf($$1x -> b($$1x) < $$5);
            Optional<hg<byj>> $$6 = ac.b($$4, $$3.ag);
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

   private static int b(hg<byj> $$0) {
      return $$0.a().a() * $$0.a().b();
   }

   private byi(cpv $$0, gw $$1) {
      super(biu.ar, $$0, $$1);
   }

   public byi(cpv $$0, gw $$1, hc $$2, hg<byj> $$3) {
      this($$0, $$1);
      this.a($$3);
      this.a($$2);
   }

   @Override
   public void b(qx $$0) {
      a($$0, this.q());
      $$0.a("facing", (byte)this.d.e());
      super.b($$0);
   }

   @Override
   public void a(qx $$0) {
      hg<byj> $$1 = c($$0).orElseGet(byi::s);
      this.a($$1);
      this.d = hc.b($$0.f("facing"));
      super.a($$0);
      this.a(this.d);
   }

   public static void a(qx $$0, hg<byj> $$1) {
      $$0.a("variant", $$1.e().orElse(g).a().toString());
   }

   public static Optional<hg<byj>> c(qx $$0) {
      return Optional.ofNullable(aex.a($$0.l("variant"))).map($$0x -> aew.a(je.P, $$0x)).flatMap(jd.m::b);
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
   public void a(@Nullable biq $$0) {
      if (this.dL().X().b(cpr.h)) {
         this.a(ape.qI, 1.0F, 1.0F);
         if ($$0 instanceof cbu $$1 && $$1.fS().d) {
            return;
         }

         this.a(cji.pl);
      }
   }

   @Override
   public void C() {
      this.a(ape.qJ, 1.0F, 1.0F);
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
   public ehn dk() {
      return ehn.a(this.c);
   }

   @Override
   public vd<ww> V() {
      return new wx(this, this.d.d(), this.E());
   }

   @Override
   public void a(wx $$0) {
      super.a($$0);
      this.a(hc.a($$0.o()));
   }

   @Override
   public cjf dy() {
      return new cjf(cji.pl);
   }
}
