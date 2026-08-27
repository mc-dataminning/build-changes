import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class byd extends bya implements bjz<hg<bye>> {
   private static final aec<hg<bye>> f = aef.a(byd.class, aee.y);
   private static final aet<bye> g = byf.a;
   public static final String e = "variant";

   private static hg<bye> m() {
      return jd.m.f(g);
   }

   public byd(bip<? extends byd> $$0, cpq $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a_() {
      this.an.a(f, m());
   }

   @Override
   public void a(aec<?> $$0) {
      if (f.equals($$0)) {
         this.s();
      }
   }

   public void a(hg<bye> $$0) {
      this.an.b(f, $$0);
   }

   public hg<bye> j() {
      return this.an.b(f);
   }

   public static Optional<byd> a(cpq $$0, gw $$1, hc $$2) {
      byd $$3 = new byd($$0, $$1);
      List<hg<bye>> $$4 = new ArrayList<>();
      jd.m.c(apx.a).forEach($$4::add);
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
            int $$5 = $$4.stream().mapToInt(byd::b).max().orElse(0);
            $$4.removeIf($$1x -> b($$1x) < $$5);
            Optional<hg<bye>> $$6 = ac.b($$4, $$3.ag);
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

   private static int b(hg<bye> $$0) {
      return $$0.a().a() * $$0.a().b();
   }

   private byd(cpq $$0, gw $$1) {
      super(bip.ar, $$0, $$1);
   }

   public byd(cpq $$0, gw $$1, hc $$2, hg<bye> $$3) {
      this($$0, $$1);
      this.a($$3);
      this.a($$2);
   }

   @Override
   public void b(qu $$0) {
      a($$0, this.j());
      $$0.a("facing", (byte)this.d.e());
      super.b($$0);
   }

   @Override
   public void a(qu $$0) {
      hg<bye> $$1 = c($$0).orElseGet(byd::m);
      this.a($$1);
      this.d = hc.b($$0.f("facing"));
      super.a($$0);
      this.a(this.d);
   }

   public static void a(qu $$0, hg<bye> $$1) {
      $$0.a("variant", $$1.e().orElse(g).a().toString());
   }

   public static Optional<hg<bye>> c(qu $$0) {
      return Optional.ofNullable(aeu.a($$0.l("variant"))).map($$0x -> aet.a(je.P, $$0x)).flatMap(jd.m::b);
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
   public void a(@Nullable bil $$0) {
      if (this.dK().X().b(cpm.h)) {
         this.a(aoz.qI, 1.0F, 1.0F);
         if ($$0 instanceof cbp $$1 && $$1.fR().d) {
            return;
         }

         this.a(cjd.pl);
      }
   }

   @Override
   public void x() {
      this.a(aoz.qJ, 1.0F, 1.0F);
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
   public ehi dj() {
      return ehi.a(this.c);
   }

   @Override
   public va<ws> U() {
      return new wt(this, this.d.d(), this.y());
   }

   @Override
   public void a(wt $$0) {
      super.a($$0);
      this.a(hc.a($$0.o()));
   }

   @Override
   public cja dx() {
      return new cja(cjd.pl);
   }
}
