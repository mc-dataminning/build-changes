import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class ceg extends ced implements bpw<il<ceh>> {
   private static final aii<il<ceh>> f = ail.a(ceg.class, aik.y);
   private static final ajb<ceh> g = cei.a;
   public static final String e = "variant";

   private static il<ceh> s() {
      return kh.l.f(g);
   }

   public ceg(bol<? extends ceg> $$0, cwe $$1) {
      super($$0, $$1);
   }

   @Override
   protected void c_() {
      this.am.a(f, s());
   }

   @Override
   public void a(aii<?> $$0) {
      if (f.equals($$0)) {
         this.z();
      }
   }

   public void a(il<ceh> $$0) {
      this.am.b(f, $$0);
   }

   public il<ceh> q() {
      return this.am.b(f);
   }

   public static Optional<ceg> a(cwe $$0, ib $$1, ih $$2) {
      ceg $$3 = new ceg($$0, $$1);
      List<il<ceh>> $$4 = new ArrayList<>();
      kh.l.c(aun.a).forEach($$4::add);
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
            int $$5 = $$4.stream().mapToInt(ceg::c).max().orElse(0);
            $$4.removeIf($$1x -> c($$1x) < $$5);
            Optional<il<ceh>> $$6 = ac.b($$4, $$3.af);
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

   private static int c(il<ceh> $$0) {
      return $$0.a().a() * $$0.a().b();
   }

   private ceg(cwe $$0, ib $$1) {
      super(bol.at, $$0, $$1);
   }

   public ceg(cwe $$0, ib $$1, ih $$2, il<ceh> $$3) {
      this($$0, $$1);
      this.a($$3);
      this.a($$2);
   }

   @Override
   public void b(sy $$0) {
      a($$0, this.q());
      $$0.a("facing", (byte)this.d.e());
      super.b($$0);
   }

   @Override
   public void a(sy $$0) {
      il<ceh> $$1 = c($$0).orElseGet(ceg::s);
      this.a($$1);
      this.d = ih.b($$0.f("facing"));
      super.a($$0);
      this.a(this.d);
   }

   public static void a(sy $$0, il<ceh> $$1) {
      $$0.a("variant", $$1.e().orElse(g).a().toString());
   }

   public static Optional<il<ceh>> c(sy $$0) {
      return Optional.ofNullable(ajc.a($$0.l("variant"))).map($$0x -> ajb.a(ki.R, $$0x)).flatMap(kh.l::b);
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
   public void a(@Nullable bof $$0) {
      if (this.dJ().Z().b(cwa.i)) {
         this.a(atp.rM, 1.0F, 1.0F);
         if ($$0 instanceof cia $$1 && $$1.fW().d) {
            return;
         }

         this.a(cpt.pY);
      }
   }

   @Override
   public void D() {
      this.a(atp.rN, 1.0F, 1.0F);
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
   public eov di() {
      return eov.a(this.c);
   }

   @Override
   public xz<aai> df() {
      return new aaj(this, this.d.d(), this.E());
   }

   @Override
   public void a(aaj $$0) {
      super.a($$0);
      this.a(ih.a($$0.p()));
   }

   @Override
   public cpq dw() {
      return new cpq(cpt.pY);
   }
}
