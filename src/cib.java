import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cib extends chy implements btn<ja<cic>> {
   private static final ajy<ja<cic>> g = akc.a(cib.class, aka.A);
   private static final aks<cic> h = cid.a;
   public static final MapCodec<ja<cic>> e = lh.l.r().fieldOf("variant");
   public static final Codec<ja<cic>> f = e.codec();

   private static ja<cic> r() {
      return lh.l.g(h);
   }

   public cib(bsb<? extends cib> $$0, dca $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akc.a $$0) {
      $$0.a(g, r());
   }

   @Override
   public void a(ajy<?> $$0) {
      if (g.equals($$0)) {
         this.y();
      }
   }

   public void b(ja<cic> $$0) {
      this.as.a(g, $$0);
   }

   public ja<cic> p() {
      return this.as.a(g);
   }

   public static Optional<cib> a(dca $$0, ir $$1, iw $$2) {
      cib $$3 = new cib($$0, $$1);
      List<ja<cic>> $$4 = new ArrayList<>();
      lh.l.c(awn.a).forEach($$4::add);
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
            int $$5 = $$4.stream().mapToInt(cib::c).max().orElse(0);
            $$4.removeIf($$1x -> c($$1x) < $$5);
            Optional<ja<cic>> $$6 = ad.b($$4, $$3.al);
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

   private static int c(ja<cic> $$0) {
      return $$0.a().a() * $$0.a().b();
   }

   private cib(dca $$0, ir $$1) {
      super(bsb.aw, $$0, $$1);
   }

   public cib(dca $$0, ir $$1, iw $$2, ja<cic> $$3) {
      this($$0, $$1);
      this.b($$3);
      this.a($$2);
   }

   @Override
   public void b(uk $$0) {
      a($$0, this.p());
      $$0.a("facing", (byte)this.d.e());
      super.b($$0);
   }

   @Override
   public void a(uk $$0) {
      ja<cic> $$1 = f.parse(uy.a, $$0).result().orElseGet(cib::r);
      this.b($$1);
      this.d = iw.b($$0.f("facing"));
      super.a($$0);
      this.a(this.d);
   }

   public static void a(uk $$0, ja<cic> $$1) {
      f.encodeStart(uy.a, $$1).result().ifPresent($$1x -> $$0.a((uk)$$1x));
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
   public void b(@Nullable brv $$0) {
      if (this.dU().ab().b(dbw.i)) {
         this.a(avo.sN, 1.0F, 1.0F);
         if ($$0 instanceof cly $$1 && $$1.fY()) {
            return;
         }

         this.a(cuk.ru);
      }
   }

   @Override
   public void C() {
      this.a(avo.sO, 1.0F, 1.0F);
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
   public ewu dt() {
      return ewu.a(this.c);
   }

   @Override
   public zl<abw> dq() {
      return new abx(this, this.d.d(), this.D());
   }

   @Override
   public void a(abx $$0) {
      super.a($$0);
      this.a(iw.a($$0.p()));
   }

   @Override
   public cuh dH() {
      return new cuh(cuk.ru);
   }
}
