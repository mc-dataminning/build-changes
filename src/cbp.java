import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cbp extends cbm implements bnj<ih<cbq>> {
   private static final agm<ih<cbq>> f = agp.a(cbp.class, ago.y);
   private static final ahf<cbq> g = cbr.a;
   public static final String e = "variant";

   private static ih<cbq> s() {
      return kd.l.f(g);
   }

   public cbp(blz<? extends cbp> $$0, ctp $$1) {
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

   public void a(ih<cbq> $$0) {
      this.an.b(f, $$0);
   }

   public ih<cbq> q() {
      return this.an.b(f);
   }

   public static Optional<cbp> a(ctp $$0, hx $$1, ic $$2) {
      cbp $$3 = new cbp($$0, $$1);
      List<ih<cbq>> $$4 = new ArrayList<>();
      kd.l.c(asq.a).forEach($$4::add);
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
            int $$5 = $$4.stream().mapToInt(cbp::b).max().orElse(0);
            $$4.removeIf($$1x -> b($$1x) < $$5);
            Optional<ih<cbq>> $$6 = ac.b($$4, $$3.ag);
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

   private static int b(ih<cbq> $$0) {
      return $$0.a().a() * $$0.a().b();
   }

   private cbp(ctp $$0, hx $$1) {
      super(blz.as, $$0, $$1);
   }

   public cbp(ctp $$0, hx $$1, ic $$2, ih<cbq> $$3) {
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
      ih<cbq> $$1 = c($$0).orElseGet(cbp::s);
      this.a($$1);
      this.d = ic.b($$0.f("facing"));
      super.a($$0);
      this.a(this.d);
   }

   public static void a(sn $$0, ih<cbq> $$1) {
      $$0.a("variant", $$1.e().orElse(g).a().toString());
   }

   public static Optional<ih<cbq>> c(sn $$0) {
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
   public void a(@Nullable blv $$0) {
      if (this.dM().Z().b(ctl.i)) {
         this.a(ars.rw, 1.0F, 1.0F);
         if ($$0 instanceof cfi $$1 && $$1.fT().d) {
            return;
         }

         this.a(cnb.pW);
      }
   }

   @Override
   public void D() {
      this.a(ars.rx, 1.0F, 1.0F);
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
   public elt dl() {
      return elt.a(this.c);
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
   public cmy dz() {
      return new cmy(cnb.pW);
   }
}
