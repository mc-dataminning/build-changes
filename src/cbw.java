import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cbw extends cbt implements bnm<ih<cbx>> {
   private static final agn<ih<cbx>> f = agq.a(cbw.class, agp.y);
   private static final ahg<cbx> g = cby.a;
   public static final String e = "variant";

   private static ih<cbx> s() {
      return kd.l.f(g);
   }

   public cbw(bmc<? extends cbw> $$0, ctx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void c_() {
      this.an.a(f, s());
   }

   @Override
   public void a(agn<?> $$0) {
      if (f.equals($$0)) {
         this.z();
      }
   }

   public void a(ih<cbx> $$0) {
      this.an.b(f, $$0);
   }

   public ih<cbx> q() {
      return this.an.b(f);
   }

   public static Optional<cbw> a(ctx $$0, hx $$1, ic $$2) {
      cbw $$3 = new cbw($$0, $$1);
      List<ih<cbx>> $$4 = new ArrayList<>();
      kd.l.c(asr.a).forEach($$4::add);
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
            int $$5 = $$4.stream().mapToInt(cbw::c).max().orElse(0);
            $$4.removeIf($$1x -> c($$1x) < $$5);
            Optional<ih<cbx>> $$6 = ac.b($$4, $$3.ag);
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

   private static int c(ih<cbx> $$0) {
      return $$0.a().a() * $$0.a().b();
   }

   private cbw(ctx $$0, hx $$1) {
      super(bmc.at, $$0, $$1);
   }

   public cbw(ctx $$0, hx $$1, ic $$2, ih<cbx> $$3) {
      this($$0, $$1);
      this.a($$3);
      this.a($$2);
   }

   @Override
   public void b(so $$0) {
      a($$0, this.q());
      $$0.a("facing", (byte)this.d.e());
      super.b($$0);
   }

   @Override
   public void a(so $$0) {
      ih<cbx> $$1 = c($$0).orElseGet(cbw::s);
      this.a($$1);
      this.d = ic.b($$0.f("facing"));
      super.a($$0);
      this.a(this.d);
   }

   public static void a(so $$0, ih<cbx> $$1) {
      $$0.a("variant", $$1.e().orElse(g).a().toString());
   }

   public static Optional<ih<cbx>> c(so $$0) {
      return Optional.ofNullable(ahh.a($$0.l("variant"))).map($$0x -> ahg.a(ke.R, $$0x)).flatMap(kd.l::b);
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
   public void a(@Nullable blw $$0) {
      if (this.dL().Z().b(ctt.i)) {
         this.a(art.rL, 1.0F, 1.0F);
         if ($$0 instanceof cfq $$1 && $$1.fT().d) {
            return;
         }

         this.a(cnj.pY);
      }
   }

   @Override
   public void D() {
      this.a(art.rM, 1.0F, 1.0F);
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
   public emc dk() {
      return emc.a(this.c);
   }

   @Override
   public xg<zb> di() {
      return new zc(this, this.d.d(), this.E());
   }

   @Override
   public void a(zc $$0) {
      super.a($$0);
      this.a(ic.a($$0.o()));
   }

   @Override
   public cng dy() {
      return new cng(cnj.pY);
   }
}
