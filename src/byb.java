import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class byb extends bxy implements bjx<he<byc>> {
   private static final adz<he<byc>> f = aec.a(byb.class, aeb.y);
   private static final aeq<byc> g = byd.a;
   public static final String e = "variant";

   private static he<byc> m() {
      return jb.m.f(g);
   }

   public byb(bim<? extends byb> $$0, cpm $$1) {
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

   public void a(he<byc> $$0) {
      this.an.b(f, $$0);
   }

   public he<byc> j() {
      return this.an.b(f);
   }

   public static Optional<byb> a(cpm $$0, gu $$1, ha $$2) {
      byb $$3 = new byb($$0, $$1);
      List<he<byc>> $$4 = new ArrayList<>();
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
            int $$5 = $$4.stream().mapToInt(byb::b).max().orElse(0);
            $$4.removeIf($$1x -> b($$1x) < $$5);
            Optional<he<byc>> $$6 = ac.b($$4, $$3.ag);
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

   private static int b(he<byc> $$0) {
      return $$0.a().a() * $$0.a().b();
   }

   private byb(cpm $$0, gu $$1) {
      super(bim.ar, $$0, $$1);
   }

   public byb(cpm $$0, gu $$1, ha $$2, he<byc> $$3) {
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
      he<byc> $$1 = c($$0).orElseGet(byb::m);
      this.a($$1);
      this.d = ha.b($$0.f("facing"));
      super.a($$0);
      this.a(this.d);
   }

   public static void a(qr $$0, he<byc> $$1) {
      $$0.a("variant", $$1.e().orElse(g).a().toString());
   }

   public static Optional<he<byc>> c(qr $$0) {
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
      if (this.dK().X().b(cpi.h)) {
         this.a(aow.qI, 1.0F, 1.0F);
         if ($$0 instanceof cbn $$1 && $$1.fR().d) {
            return;
         }

         this.a(cjb.pl);
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
   public ehe dj() {
      return ehe.a(this.c);
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
   public ciy dx() {
      return new ciy(cjb.pl);
   }
}
