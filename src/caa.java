import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class caa extends bzx implements blw<ib<cab>> {
   private static final afm<ib<cab>> f = afp.a(caa.class, afo.y);
   private static final agf<cab> g = cac.a;
   public static final String e = "variant";

   private static ib<cab> s() {
      return jy.m.f(g);
   }

   public caa(bkm<? extends caa> $$0, crs $$1) {
      super($$0, $$1);
   }

   @Override
   protected void b_() {
      this.an.a(f, s());
   }

   @Override
   public void a(afm<?> $$0) {
      if (f.equals($$0)) {
         this.y();
      }
   }

   public void a(ib<cab> $$0) {
      this.an.b(f, $$0);
   }

   public ib<cab> q() {
      return this.an.b(f);
   }

   public static Optional<caa> a(crs $$0, ht $$1, hx $$2) {
      caa $$3 = new caa($$0, $$1);
      List<ib<cab>> $$4 = new ArrayList<>();
      jy.m.c(arl.a).forEach($$4::add);
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
            int $$5 = $$4.stream().mapToInt(caa::b).max().orElse(0);
            $$4.removeIf($$1x -> b($$1x) < $$5);
            Optional<ib<cab>> $$6 = ac.b($$4, $$3.ag);
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

   private static int b(ib<cab> $$0) {
      return $$0.a().a() * $$0.a().b();
   }

   private caa(crs $$0, ht $$1) {
      super(bkm.ar, $$0, $$1);
   }

   public caa(crs $$0, ht $$1, hx $$2, ib<cab> $$3) {
      this($$0, $$1);
      this.a($$3);
      this.a($$2);
   }

   @Override
   public void b(rz $$0) {
      a($$0, this.q());
      $$0.a("facing", (byte)this.d.e());
      super.b($$0);
   }

   @Override
   public void a(rz $$0) {
      ib<cab> $$1 = c($$0).orElseGet(caa::s);
      this.a($$1);
      this.d = hx.b($$0.f("facing"));
      super.a($$0);
      this.a(this.d);
   }

   public static void a(rz $$0, ib<cab> $$1) {
      $$0.a("variant", $$1.e().orElse(g).a().toString());
   }

   public static Optional<ib<cab>> c(rz $$0) {
      return Optional.ofNullable(agg.a($$0.l("variant"))).map($$0x -> agf.a(jz.Q, $$0x)).flatMap(jy.m::b);
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
   public void a(@Nullable bki $$0) {
      if (this.dL().X().b(cro.i)) {
         this.a(aqn.qM, 1.0F, 1.0F);
         if ($$0 instanceof cdm $$1 && $$1.fT().d) {
            return;
         }

         this.a(cle.pl);
      }
   }

   @Override
   public void C() {
      this.a(aqn.qN, 1.0F, 1.0F);
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
   public eji dk() {
      return eji.a(this.c);
   }

   @Override
   public wk<yd> di() {
      return new ye(this, this.d.d(), this.E());
   }

   @Override
   public void a(ye $$0) {
      super.a($$0);
      this.a(hx.a($$0.o()));
   }

   @Override
   public clb dy() {
      return new clb(cle.pl);
   }
}
