import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cey extends cev implements bqn<il<cez>> {
   private static final aim<il<cez>> f = aiq.a(cey.class, aio.y);
   private static final ajg<cez> g = cfa.a;
   public static final String e = "variant";

   private static il<cez> r() {
      return ki.l.g(g);
   }

   public cey(bpc<? extends cey> $$0, cwz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(aiq.a $$0) {
      $$0.a(f, r());
   }

   @Override
   public void a(aim<?> $$0) {
      if (f.equals($$0)) {
         this.y();
      }
   }

   public void a(il<cez> $$0) {
      this.an.a(f, $$0);
   }

   public il<cez> p() {
      return this.an.a(f);
   }

   public static Optional<cey> a(cwz $$0, ib $$1, ih $$2) {
      cey $$3 = new cey($$0, $$1);
      List<il<cez>> $$4 = new ArrayList<>();
      ki.l.c(auw.a).forEach($$4::add);
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
            int $$5 = $$4.stream().mapToInt(cey::c).max().orElse(0);
            $$4.removeIf($$1x -> c($$1x) < $$5);
            Optional<il<cez>> $$6 = ac.b($$4, $$3.ag);
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

   private static int c(il<cez> $$0) {
      return $$0.a().a() * $$0.a().b();
   }

   private cey(cwz $$0, ib $$1) {
      super(bpc.au, $$0, $$1);
   }

   public cey(cwz $$0, ib $$1, ih $$2, il<cez> $$3) {
      this($$0, $$1);
      this.a($$3);
      this.a($$2);
   }

   @Override
   public void b(ta $$0) {
      a($$0, this.p());
      $$0.a("facing", (byte)this.d.e());
      super.b($$0);
   }

   @Override
   public void a(ta $$0) {
      il<cez> $$1 = c($$0).orElseGet(cey::r);
      this.a($$1);
      this.d = ih.b($$0.f("facing"));
      super.a($$0);
      this.a(this.d);
   }

   public static void a(ta $$0, il<cez> $$1) {
      $$0.a("variant", $$1.e().orElse(g).a().toString());
   }

   public static Optional<il<cez>> c(ta $$0) {
      return Optional.ofNullable(ajh.a($$0.l("variant"))).map($$0x -> ajg.a(kj.R, $$0x)).flatMap(ki.l::b);
   }

   @Override
   public int A() {
      return this.p().a().a();
   }

   @Override
   public int B() {
      return this.p().a().b();
   }

   @Override
   public void b(@Nullable bow $$0) {
      if (this.dM().Z().b(cwv.i)) {
         this.a(aty.rP, 1.0F, 1.0F);
         if ($$0 instanceof cis $$1 && $$1.fM()) {
            return;
         }

         this.a(cqn.pY);
      }
   }

   @Override
   public void C() {
      this.a(aty.rQ, 1.0F, 1.0F);
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
   public epr dl() {
      return epr.a(this.c);
   }

   @Override
   public yb<aam> di() {
      return new aan(this, this.d.d(), this.D());
   }

   @Override
   public void a(aan $$0) {
      super.a($$0);
      this.a(ih.a($$0.p()));
   }

   @Override
   public cqk dz() {
      return new cqk(cqn.pY);
   }
}
