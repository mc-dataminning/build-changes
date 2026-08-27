import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class bxz extends bxw implements bjv<hf<bya>> {
   private static final adx<hf<bya>> f = aea.a(bxz.class, adz.y);
   private static final aeo<bya> g = byb.a;
   public static final String e = "variant";

   private static hf<bya> m() {
      return jc.m.f(g);
   }

   public bxz(bik<? extends bxz> $$0, cpk $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a_() {
      this.an.a(f, m());
   }

   @Override
   public void a(adx<?> $$0) {
      if (f.equals($$0)) {
         this.s();
      }
   }

   public void a(hf<bya> $$0) {
      this.an.b(f, $$0);
   }

   public hf<bya> j() {
      return this.an.b(f);
   }

   public static Optional<bxz> a(cpk $$0, gv $$1, hb $$2) {
      bxz $$3 = new bxz($$0, $$1);
      List<hf<bya>> $$4 = new ArrayList<>();
      jc.m.c(aps.a).forEach($$4::add);
      if ($$4.isEmpty()) {
         return Optional.empty();
      } else {
         $$3.a($$2);
         $$4.removeIf($$1x -> {
            $$3.a($$1x);
            return !$$3.t();
         });
         if ($$4.isEmpty()) {
            return Optional.empty();
         } else {
            int $$5 = $$4.stream().mapToInt(bxz::b).max().orElse(0);
            $$4.removeIf($$1x -> b($$1x) < $$5);
            Optional<hf<bya>> $$6 = ac.b($$4, $$3.ag);
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

   private static int b(hf<bya> $$0) {
      return $$0.a().a() * $$0.a().b();
   }

   private bxz(cpk $$0, gv $$1) {
      super(bik.ar, $$0, $$1);
   }

   public bxz(cpk $$0, gv $$1, hb $$2, hf<bya> $$3) {
      this($$0, $$1);
      this.a($$3);
      this.a($$2);
   }

   @Override
   public void b(qs $$0) {
      a($$0, this.j());
      $$0.a("facing", (byte)this.d.e());
      super.b($$0);
   }

   @Override
   public void a(qs $$0) {
      hf<bya> $$1 = c($$0).orElseGet(bxz::m);
      this.a($$1);
      this.d = hb.b($$0.f("facing"));
      super.a($$0);
      this.a(this.d);
   }

   public static void a(qs $$0, hf<bya> $$1) {
      $$0.a("variant", $$1.e().orElse(g).a().toString());
   }

   public static Optional<hf<bya>> c(qs $$0) {
      return Optional.ofNullable(aep.a($$0.l("variant"))).map($$0x -> aeo.a(jd.P, $$0x)).flatMap(jc.m::b);
   }

   @Override
   public int v() {
      return this.j().a().a();
   }

   @Override
   public int w() {
      return this.j().a().b();
   }

   @Override
   public void a(@Nullable big $$0) {
      if (this.dK().X().b(cpg.h)) {
         this.a(aou.qI, 1.0F, 1.0F);
         if ($$0 instanceof cbl $$1 && $$1.fR().d) {
            return;
         }

         this.a(ciz.pl);
      }
   }

   @Override
   public void x() {
      this.a(aou.qJ, 1.0F, 1.0F);
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
   public ehf dj() {
      return ehf.a(this.c);
   }

   @Override
   public uw<wo> U() {
      return new wp(this, this.d.d(), this.y());
   }

   @Override
   public void a(wp $$0) {
      super.a($$0);
      this.a(hb.a($$0.o()));
   }

   @Override
   public ciw dx() {
      return new ciw(ciz.pl);
   }
}
