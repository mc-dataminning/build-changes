import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cgf extends cgc implements brs<in<cgg>> {
   private static final aja<in<cgg>> g = aje.a(cgf.class, ajc.z);
   private static final aju<cgg> h = cgh.a;
   public static final MapCodec<in<cgg>> e = kt.l.r().fieldOf("variant");
   public static final Codec<in<cgg>> f = e.codec();

   private static in<cgg> r() {
      return kt.l.g(h);
   }

   public cgf(bqg<? extends cgf> $$0, czg $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(aje.a $$0) {
      $$0.a(g, r());
   }

   @Override
   public void a(aja<?> $$0) {
      if (g.equals($$0)) {
         this.y();
      }
   }

   public void b(in<cgg> $$0) {
      this.an.a(g, $$0);
   }

   public in<cgg> p() {
      return this.an.a(g);
   }

   public static Optional<cgf> a(czg $$0, id $$1, ij $$2) {
      cgf $$3 = new cgf($$0, $$1);
      List<in<cgg>> $$4 = new ArrayList<>();
      kt.l.c(avn.a).forEach($$4::add);
      if ($$4.isEmpty()) {
         return Optional.empty();
      } else {
         $$3.a($$2);
         $$4.removeIf($$1x -> {
            $$3.b($$1x);
            return !$$3.z();
         });
         if ($$4.isEmpty()) {
            return Optional.empty();
         } else {
            int $$5 = $$4.stream().mapToInt(cgf::c).max().orElse(0);
            $$4.removeIf($$1x -> c($$1x) < $$5);
            Optional<in<cgg>> $$6 = ac.b($$4, $$3.ag);
            if ($$6.isEmpty()) {
               return Optional.empty();
            } else {
               $$3.b($$6.get());
               $$3.a($$2);
               return Optional.of($$3);
            }
         }
      }
   }

   private static int c(in<cgg> $$0) {
      return $$0.a().a() * $$0.a().b();
   }

   private cgf(czg $$0, id $$1) {
      super(bqg.au, $$0, $$1);
   }

   public cgf(czg $$0, id $$1, ij $$2, in<cgg> $$3) {
      this($$0, $$1);
      this.b($$3);
      this.a($$2);
   }

   @Override
   public void b(to $$0) {
      a($$0, this.p());
      $$0.a("facing", (byte)this.d.e());
      super.b($$0);
   }

   @Override
   public void a(to $$0) {
      in<cgg> $$1 = f.parse(uc.a, $$0).result().orElseGet(cgf::r);
      this.b($$1);
      this.d = ij.b($$0.f("facing"));
      super.a($$0);
      this.a(this.d);
   }

   public static void a(to $$0, in<cgg> $$1) {
      f.encodeStart(uc.a, $$1).result().ifPresent($$1x -> $$0.a((to)$$1x));
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
   public void b(@Nullable bqa $$0) {
      if (this.dM().aa().b(czc.i)) {
         this.a(auo.rW, 1.0F, 1.0F);
         if ($$0 instanceof cka $$1 && $$1.fM()) {
            return;
         }

         this.a(crv.pY);
      }
   }

   @Override
   public void C() {
      this.a(auo.rX, 1.0F, 1.0F);
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
   public esj dl() {
      return esj.a(this.c);
   }

   @Override
   public yp<aba> di() {
      return new abb(this, this.d.d(), this.D());
   }

   @Override
   public void a(abb $$0) {
      super.a($$0);
      this.a(ij.a($$0.p()));
   }

   @Override
   public crs dz() {
      return new crs(crv.pY);
   }
}
