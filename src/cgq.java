import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cgq extends cgn implements bsd<iv<cgr>> {
   private static final ajk<iv<cgr>> g = ajo.a(cgq.class, ajm.A);
   private static final ake<cgr> h = cgs.a;
   public static final MapCodec<iv<cgr>> e = lc.l.r().fieldOf("variant");
   public static final Codec<iv<cgr>> f = e.codec();

   private static iv<cgr> r() {
      return lc.l.g(h);
   }

   public cgq(bqr<? extends cgq> $$0, czu $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(ajo.a $$0) {
      $$0.a(g, r());
   }

   @Override
   public void a(ajk<?> $$0) {
      if (g.equals($$0)) {
         this.y();
      }
   }

   public void b(iv<cgr> $$0) {
      this.ao.a(g, $$0);
   }

   public iv<cgr> p() {
      return this.ao.a(g);
   }

   public static Optional<cgq> a(czu $$0, im $$1, ir $$2) {
      cgq $$3 = new cgq($$0, $$1);
      List<iv<cgr>> $$4 = new ArrayList<>();
      lc.l.c(avx.a).forEach($$4::add);
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
            int $$5 = $$4.stream().mapToInt(cgq::c).max().orElse(0);
            $$4.removeIf($$1x -> c($$1x) < $$5);
            Optional<iv<cgr>> $$6 = ac.b($$4, $$3.ah);
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

   private static int c(iv<cgr> $$0) {
      return $$0.a().a() * $$0.a().b();
   }

   private cgq(czu $$0, im $$1) {
      super(bqr.au, $$0, $$1);
   }

   public cgq(czu $$0, im $$1, ir $$2, iv<cgr> $$3) {
      this($$0, $$1);
      this.b($$3);
      this.a($$2);
   }

   @Override
   public void b(ty $$0) {
      a($$0, this.p());
      $$0.a("facing", (byte)this.d.e());
      super.b($$0);
   }

   @Override
   public void a(ty $$0) {
      iv<cgr> $$1 = f.parse(um.a, $$0).result().orElseGet(cgq::r);
      this.b($$1);
      this.d = ir.b($$0.f("facing"));
      super.a($$0);
      this.a(this.d);
   }

   public static void a(ty $$0, iv<cgr> $$1) {
      f.encodeStart(um.a, $$1).result().ifPresent($$1x -> $$0.a((ty)$$1x));
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
   public void b(@Nullable bql $$0) {
      if (this.dN().aa().b(czq.i)) {
         this.a(auz.sd, 1.0F, 1.0F);
         if ($$0 instanceof ckl $$1 && $$1.fN()) {
            return;
         }

         this.a(csg.pZ);
      }
   }

   @Override
   public void C() {
      this.a(auz.se, 1.0F, 1.0F);
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
   public etf dm() {
      return etf.a(this.c);
   }

   @Override
   public yz<abk> dj() {
      return new abl(this, this.d.d(), this.D());
   }

   @Override
   public void a(abl $$0) {
      super.a($$0);
      this.a(ir.a($$0.p()));
   }

   @Override
   public csd dA() {
      return new csd(csg.pZ);
   }
}
