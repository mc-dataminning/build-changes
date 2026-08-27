import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cbo extends cbl implements bni<ih<cbp>> {
   private static final agm<ih<cbp>> f = agp.a(cbo.class, ago.y);
   private static final ahf<cbp> g = cbq.a;
   public static final String e = "variant";

   private static ih<cbp> s() {
      return kd.l.f(g);
   }

   public cbo(bly<? extends cbo> $$0, cto $$1) {
      super($$0, $$1);
   }

   @Override
   protected void c_() {
      this.an.a(f, s());
   }

   @Override
   public void a(agm<?> $$0) {
      if (f.equals($$0)) {
         this.z();
      }
   }

   public void a(ih<cbp> $$0) {
      this.an.b(f, $$0);
   }

   public ih<cbp> q() {
      return this.an.b(f);
   }

   public static Optional<cbo> a(cto $$0, hx $$1, ic $$2) {
      cbo $$3 = new cbo($$0, $$1);
      List<ih<cbp>> $$4 = new ArrayList<>();
      kd.l.c(asp.a).forEach($$4::add);
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
            int $$5 = $$4.stream().mapToInt(cbo::b).max().orElse(0);
            $$4.removeIf($$1x -> b($$1x) < $$5);
            Optional<ih<cbp>> $$6 = ac.b($$4, $$3.ag);
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

   private static int b(ih<cbp> $$0) {
      return $$0.a().a() * $$0.a().b();
   }

   private cbo(cto $$0, hx $$1) {
      super(bly.as, $$0, $$1);
   }

   public cbo(cto $$0, hx $$1, ic $$2, ih<cbp> $$3) {
      this($$0, $$1);
      this.a($$3);
      this.a($$2);
   }

   @Override
   public void b(sn $$0) {
      a($$0, this.q());
      $$0.a("facing", (byte)this.d.e());
      super.b($$0);
   }

   @Override
   public void a(sn $$0) {
      ih<cbp> $$1 = c($$0).orElseGet(cbo::s);
      this.a($$1);
      this.d = ic.b($$0.f("facing"));
      super.a($$0);
      this.a(this.d);
   }

   public static void a(sn $$0, ih<cbp> $$1) {
      $$0.a("variant", $$1.e().orElse(g).a().toString());
   }

   public static Optional<ih<cbp>> c(sn $$0) {
      return Optional.ofNullable(ahg.a($$0.l("variant"))).map($$0x -> ahf.a(ke.R, $$0x)).flatMap(kd.l::b);
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
   public void a(@Nullable blu $$0) {
      if (this.dM().Z().b(ctk.i)) {
         this.a(arr.rw, 1.0F, 1.0F);
         if ($$0 instanceof cfh $$1 && $$1.fT().d) {
            return;
         }

         this.a(cna.pW);
      }
   }

   @Override
   public void D() {
      this.a(arr.rx, 1.0F, 1.0F);
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
   public els dl() {
      return els.a(this.c);
   }

   @Override
   public xf<za> dj() {
      return new zb(this, this.d.d(), this.E());
   }

   @Override
   public void a(zb $$0) {
      super.a($$0);
      this.a(ic.a($$0.o()));
   }

   @Override
   public cmx dz() {
      return new cmx(cna.pW);
   }
}
