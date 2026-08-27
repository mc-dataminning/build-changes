import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cdr extends cdo implements bph<ij<cds>> {
   private static final aie<ij<cds>> f = aih.a(cdr.class, aig.y);
   private static final aix<cds> g = cdt.a;
   public static final String e = "variant";

   private static ij<cds> s() {
      return kf.l.f(g);
   }

   public cdr(bnw<? extends cdr> $$0, cvr $$1) {
      super($$0, $$1);
   }

   @Override
   protected void c_() {
      this.am.a(f, s());
   }

   @Override
   public void a(aie<?> $$0) {
      if (f.equals($$0)) {
         this.z();
      }
   }

   public void a(ij<cds> $$0) {
      this.am.b(f, $$0);
   }

   public ij<cds> q() {
      return this.am.b(f);
   }

   public static Optional<cdr> a(cvr $$0, hz $$1, ie $$2) {
      cdr $$3 = new cdr($$0, $$1);
      List<ij<cds>> $$4 = new ArrayList<>();
      kf.l.c(auj.a).forEach($$4::add);
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
            int $$5 = $$4.stream().mapToInt(cdr::c).max().orElse(0);
            $$4.removeIf($$1x -> c($$1x) < $$5);
            Optional<ij<cds>> $$6 = ac.b($$4, $$3.af);
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

   private static int c(ij<cds> $$0) {
      return $$0.a().a() * $$0.a().b();
   }

   private cdr(cvr $$0, hz $$1) {
      super(bnw.at, $$0, $$1);
   }

   public cdr(cvr $$0, hz $$1, ie $$2, ij<cds> $$3) {
      this($$0, $$1);
      this.a($$3);
      this.a($$2);
   }

   @Override
   public void b(sw $$0) {
      a($$0, this.q());
      $$0.a("facing", (byte)this.d.e());
      super.b($$0);
   }

   @Override
   public void a(sw $$0) {
      ij<cds> $$1 = c($$0).orElseGet(cdr::s);
      this.a($$1);
      this.d = ie.b($$0.f("facing"));
      super.a($$0);
      this.a(this.d);
   }

   public static void a(sw $$0, ij<cds> $$1) {
      $$0.a("variant", $$1.e().orElse(g).a().toString());
   }

   public static Optional<ij<cds>> c(sw $$0) {
      return Optional.ofNullable(aiy.a($$0.l("variant"))).map($$0x -> aix.a(kg.R, $$0x)).flatMap(kf.l::b);
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
   public void a(@Nullable bnq $$0) {
      if (this.dM().Z().b(cvn.i)) {
         this.a(atl.rM, 1.0F, 1.0F);
         if ($$0 instanceof chl $$1 && $$1.fU().d) {
            return;
         }

         this.a(cpg.pY);
      }
   }

   @Override
   public void D() {
      this.a(atl.rN, 1.0F, 1.0F);
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
   public enz dl() {
      return enz.a(this.c);
   }

   @Override
   public xx<aag> di() {
      return new aah(this, this.d.d(), this.E());
   }

   @Override
   public void a(aah $$0) {
      super.a($$0);
      this.a(ie.a($$0.p()));
   }

   @Override
   public cpd dz() {
      return new cpd(cpg.pY);
   }
}
