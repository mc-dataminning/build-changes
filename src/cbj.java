import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cbj extends cbg implements bnd<ih<cbk>> {
   private static final agj<ih<cbk>> f = agm.a(cbj.class, agl.y);
   private static final ahc<cbk> g = cbl.a;
   public static final String e = "variant";

   private static ih<cbk> s() {
      return kd.l.f(g);
   }

   public cbj(blt<? extends cbj> $$0, cti $$1) {
      super($$0, $$1);
   }

   @Override
   protected void c_() {
      this.an.a(f, s());
   }

   @Override
   public void a(agj<?> $$0) {
      if (f.equals($$0)) {
         this.z();
      }
   }

   public void a(ih<cbk> $$0) {
      this.an.b(f, $$0);
   }

   public ih<cbk> q() {
      return this.an.b(f);
   }

   public static Optional<cbj> a(cti $$0, hx $$1, ic $$2) {
      cbj $$3 = new cbj($$0, $$1);
      List<ih<cbk>> $$4 = new ArrayList<>();
      kd.l.c(ask.a).forEach($$4::add);
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
            int $$5 = $$4.stream().mapToInt(cbj::b).max().orElse(0);
            $$4.removeIf($$1x -> b($$1x) < $$5);
            Optional<ih<cbk>> $$6 = ac.b($$4, $$3.ag);
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

   private static int b(ih<cbk> $$0) {
      return $$0.a().a() * $$0.a().b();
   }

   private cbj(cti $$0, hx $$1) {
      super(blt.as, $$0, $$1);
   }

   public cbj(cti $$0, hx $$1, ic $$2, ih<cbk> $$3) {
      this($$0, $$1);
      this.a($$3);
      this.a($$2);
   }

   @Override
   public void b(sl $$0) {
      a($$0, this.q());
      $$0.a("facing", (byte)this.d.e());
      super.b($$0);
   }

   @Override
   public void a(sl $$0) {
      ih<cbk> $$1 = c($$0).orElseGet(cbj::s);
      this.a($$1);
      this.d = ic.b($$0.f("facing"));
      super.a($$0);
      this.a(this.d);
   }

   public static void a(sl $$0, ih<cbk> $$1) {
      $$0.a("variant", $$1.e().orElse(g).a().toString());
   }

   public static Optional<ih<cbk>> c(sl $$0) {
      return Optional.ofNullable(ahd.a($$0.l("variant"))).map($$0x -> ahc.a(ke.R, $$0x)).flatMap(kd.l::b);
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
   public void a(@Nullable blp $$0) {
      if (this.dM().Z().b(cte.i)) {
         this.a(arm.rw, 1.0F, 1.0F);
         if ($$0 instanceof cfb $$1 && $$1.fT().d) {
            return;
         }

         this.a(cmu.pW);
      }
   }

   @Override
   public void D() {
      this.a(arm.rx, 1.0F, 1.0F);
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
   public elm dl() {
      return elm.a(this.c);
   }

   @Override
   public xd<yx> dj() {
      return new yy(this, this.d.d(), this.E());
   }

   @Override
   public void a(yy $$0) {
      super.a($$0);
      this.a(ic.a($$0.o()));
   }

   @Override
   public cmr dz() {
      return new cmr(cmu.pW);
   }
}
