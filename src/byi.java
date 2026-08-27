import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class byi extends byf implements bke<he<byj>> {
   private static final aee<he<byj>> f = aeh.a(byi.class, aeg.y);
   private static final aev<byj> g = byk.a;
   public static final String e = "variant";

   private static he<byj> s() {
      return jb.m.f(g);
   }

   public byi(biu<? extends byi> $$0, cpv $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a_() {
      this.an.a(f, s());
   }

   @Override
   public void a(aee<?> $$0) {
      if (f.equals($$0)) {
         this.y();
      }
   }

   public void a(he<byj> $$0) {
      this.an.b(f, $$0);
   }

   public he<byj> q() {
      return this.an.b(f);
   }

   public static Optional<byi> a(cpv $$0, gw $$1, ha $$2) {
      byi $$3 = new byi($$0, $$1);
      List<he<byj>> $$4 = new ArrayList<>();
      jb.m.c(aqb.a).forEach($$4::add);
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
            Optional<he<byj>> $$6 = ac.b($$4, $$3.ag);
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

   private static int b(he<byj> $$0) {
      return $$0.a().a() * $$0.a().b();
   }

   private byi(cpv $$0, gw $$1) {
      super(biu.ar, $$0, $$1);
   }

   public byi(cpv $$0, gw $$1, ha $$2, he<byj> $$3) {
      this($$0, $$1);
      this.a($$3);
      this.a($$2);
   }

   @Override
   public void b(qw $$0) {
      a($$0, this.q());
      $$0.a("facing", (byte)this.d.e());
      super.b($$0);
   }

   @Override
   public void a(qw $$0) {
      he<byj> $$1 = c($$0).orElseGet(byi::s);
      this.a($$1);
      this.d = ha.b($$0.f("facing"));
      super.a($$0);
      this.a(this.d);
   }

   public static void a(qw $$0, he<byj> $$1) {
      $$0.a("variant", $$1.e().orElse(g).a().toString());
   }

   public static Optional<he<byj>> c(qw $$0) {
      return Optional.ofNullable(aew.a($$0.l("variant"))).map($$0x -> aev.a(jc.P, $$0x)).flatMap(jb.m::b);
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
         this.a(apd.qI, 1.0F, 1.0F);
         if ($$0 instanceof cbu $$1 && $$1.fS().d) {
            return;
         }

         this.a(cji.pl);
      }
   }

   @Override
   public void C() {
      this.a(apd.qJ, 1.0F, 1.0F);
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
   public vd<ww> di() {
      return new wx(this, this.d.d(), this.E());
   }

   @Override
   public void a(wx $$0) {
      super.a($$0);
      this.a(ha.a($$0.o()));
   }

   @Override
   public cjf dy() {
      return new cjf(cji.pl);
   }
}
