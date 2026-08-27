import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class byo extends byl implements bkk<he<byp>> {
   private static final aef<he<byp>> f = aei.a(byo.class, aeh.y);
   private static final aey<byp> g = byq.a;
   public static final String e = "variant";

   private static he<byp> s() {
      return jb.m.f(g);
   }

   public byo(bja<? extends byo> $$0, cqb $$1) {
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

   public void a(he<byp> $$0) {
      this.an.b(f, $$0);
   }

   public he<byp> q() {
      return this.an.b(f);
   }

   public static Optional<byo> a(cqb $$0, gw $$1, ha $$2) {
      byo $$3 = new byo($$0, $$1);
      List<he<byp>> $$4 = new ArrayList<>();
      jb.m.c(aqe.a).forEach($$4::add);
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
            int $$5 = $$4.stream().mapToInt(byo::b).max().orElse(0);
            $$4.removeIf($$1x -> b($$1x) < $$5);
            Optional<he<byp>> $$6 = ac.b($$4, $$3.ag);
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

   private static int b(he<byp> $$0) {
      return $$0.a().a() * $$0.a().b();
   }

   private byo(cqb $$0, gw $$1) {
      super(bja.ar, $$0, $$1);
   }

   public byo(cqb $$0, gw $$1, ha $$2, he<byp> $$3) {
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
      he<byp> $$1 = c($$0).orElseGet(byo::s);
      this.a($$1);
      this.d = ha.b($$0.f("facing"));
      super.a($$0);
      this.a(this.d);
   }

   public static void a(qw $$0, he<byp> $$1) {
      $$0.a("variant", $$1.e().orElse(g).a().toString());
   }

   public static Optional<he<byp>> c(qw $$0) {
      return Optional.ofNullable(aez.a($$0.l("variant"))).map($$0x -> aey.a(jc.Q, $$0x)).flatMap(jb.m::b);
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
   public void a(@Nullable biw $$0) {
      if (this.dL().X().b(cpx.h)) {
         this.a(apg.qI, 1.0F, 1.0F);
         if ($$0 instanceof cca $$1 && $$1.fT().d) {
            return;
         }

         this.a(cjo.pl);
      }
   }

   @Override
   public void C() {
      this.a(apg.qJ, 1.0F, 1.0F);
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
   public ehh dk() {
      return ehh.a(this.c);
   }

   @Override
   public ve<wx> di() {
      return new wy(this, this.d.d(), this.E());
   }

   @Override
   public void a(wy $$0) {
      super.a($$0);
      this.a(ha.a($$0.o()));
   }

   @Override
   public cjl dy() {
      return new cjl(cjo.pl);
   }
}
