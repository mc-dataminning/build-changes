import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class caz extends caw implements bmt<ie<cba>> {
   private static final afz<ie<cba>> f = agc.a(caz.class, agb.y);
   private static final ags<cba> g = cbb.a;
   public static final String e = "variant";

   private static ie<cba> s() {
      return kb.l.f(g);
   }

   public caz(blj<? extends caz> $$0, csy $$1) {
      super($$0, $$1);
   }

   @Override
   protected void c_() {
      this.an.a(f, s());
   }

   @Override
   public void a(afz<?> $$0) {
      if (f.equals($$0)) {
         this.z();
      }
   }

   public void a(ie<cba> $$0) {
      this.an.b(f, $$0);
   }

   public ie<cba> q() {
      return this.an.b(f);
   }

   public static Optional<caz> a(csy $$0, hv $$1, ia $$2) {
      caz $$3 = new caz($$0, $$1);
      List<ie<cba>> $$4 = new ArrayList<>();
      kb.l.c(asa.a).forEach($$4::add);
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
            int $$5 = $$4.stream().mapToInt(caz::b).max().orElse(0);
            $$4.removeIf($$1x -> b($$1x) < $$5);
            Optional<ie<cba>> $$6 = ac.b($$4, $$3.ag);
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

   private static int b(ie<cba> $$0) {
      return $$0.a().a() * $$0.a().b();
   }

   private caz(csy $$0, hv $$1) {
      super(blj.as, $$0, $$1);
   }

   public caz(csy $$0, hv $$1, ia $$2, ie<cba> $$3) {
      this($$0, $$1);
      this.a($$3);
      this.a($$2);
   }

   @Override
   public void b(sj $$0) {
      a($$0, this.q());
      $$0.a("facing", (byte)this.d.e());
      super.b($$0);
   }

   @Override
   public void a(sj $$0) {
      ie<cba> $$1 = c($$0).orElseGet(caz::s);
      this.a($$1);
      this.d = ia.b($$0.f("facing"));
      super.a($$0);
      this.a(this.d);
   }

   public static void a(sj $$0, ie<cba> $$1) {
      $$0.a("variant", $$1.e().orElse(g).a().toString());
   }

   public static Optional<ie<cba>> c(sj $$0) {
      return Optional.ofNullable(agt.a($$0.l("variant"))).map($$0x -> ags.a(kc.R, $$0x)).flatMap(kb.l::b);
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
   public void a(@Nullable blf $$0) {
      if (this.dM().Y().b(csu.i)) {
         this.a(arc.rw, 1.0F, 1.0F);
         if ($$0 instanceof cer $$1 && $$1.fT().d) {
            return;
         }

         this.a(cmk.pW);
      }
   }

   @Override
   public void D() {
      this.a(arc.rx, 1.0F, 1.0F);
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
   public elb dl() {
      return elb.a(this.c);
   }

   @Override
   public wu<yo> dj() {
      return new yp(this, this.d.d(), this.E());
   }

   @Override
   public void a(yp $$0) {
      super.a($$0);
      this.a(ia.a($$0.o()));
   }

   @Override
   public cmh dz() {
      return new cmh(cmk.pW);
   }
}
