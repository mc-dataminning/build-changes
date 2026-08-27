import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class bya extends bxx implements bjw<he<byb>> {
   private static final adz<he<byb>> f = aec.a(bya.class, aeb.y);
   private static final aeq<byb> g = byc.a;
   public static final String e = "variant";

   private static he<byb> m() {
      return jb.m.f(g);
   }

   public bya(bim<? extends bya> $$0, cpl $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a_() {
      this.an.a(f, m());
   }

   @Override
   public void a(adz<?> $$0) {
      if (f.equals($$0)) {
         this.s();
      }
   }

   public void a(he<byb> $$0) {
      this.an.b(f, $$0);
   }

   public he<byb> j() {
      return this.an.b(f);
   }

   public static Optional<bya> a(cpl $$0, gu $$1, ha $$2) {
      bya $$3 = new bya($$0, $$1);
      List<he<byb>> $$4 = new ArrayList<>();
      jb.m.c(apu.a).forEach($$4::add);
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
            int $$5 = $$4.stream().mapToInt(bya::b).max().orElse(0);
            $$4.removeIf($$1x -> b($$1x) < $$5);
            Optional<he<byb>> $$6 = ac.b($$4, $$3.ag);
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

   private static int b(he<byb> $$0) {
      return $$0.a().a() * $$0.a().b();
   }

   private bya(cpl $$0, gu $$1) {
      super(bim.ar, $$0, $$1);
   }

   public bya(cpl $$0, gu $$1, ha $$2, he<byb> $$3) {
      this($$0, $$1);
      this.a($$3);
      this.a($$2);
   }

   @Override
   public void b(qr $$0) {
      a($$0, this.j());
      $$0.a("facing", (byte)this.d.e());
      super.b($$0);
   }

   @Override
   public void a(qr $$0) {
      he<byb> $$1 = c($$0).orElseGet(bya::m);
      this.a($$1);
      this.d = ha.b($$0.f("facing"));
      super.a($$0);
      this.a(this.d);
   }

   public static void a(qr $$0, he<byb> $$1) {
      $$0.a("variant", $$1.e().orElse(g).a().toString());
   }

   public static Optional<he<byb>> c(qr $$0) {
      return Optional.ofNullable(aer.a($$0.l("variant"))).map($$0x -> aeq.a(jc.P, $$0x)).flatMap(jb.m::b);
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
   public void a(@Nullable bii $$0) {
      if (this.dK().X().b(cph.h)) {
         this.a(aow.qI, 1.0F, 1.0F);
         if ($$0 instanceof cbm $$1 && $$1.fR().d) {
            return;
         }

         this.a(cja.pl);
      }
   }

   @Override
   public void x() {
      this.a(aow.qJ, 1.0F, 1.0F);
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
   public ehd dj() {
      return ehd.a(this.c);
   }

   @Override
   public ux<wp> U() {
      return new wq(this, this.d.d(), this.y());
   }

   @Override
   public void a(wq $$0) {
      super.a($$0);
      this.a(ha.a($$0.o()));
   }

   @Override
   public cix dx() {
      return new cix(cja.pl);
   }
}
