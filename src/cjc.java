import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cjc extends ciz implements bup<ji<cjd>> {
   private static final akk<ji<cjd>> g = ako.a(cjc.class, akm.A);
   private static final ale<cjd> h = cje.a;
   public static final MapCodec<ji<cjd>> e = lp.l.r().fieldOf("variant");
   public static final Codec<ji<cjd>> f = e.codec();

   private static ji<cjd> s() {
      return lp.l.g(h);
   }

   public cjc(bta<? extends cjc> $$0, dby $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(ako.a $$0) {
      $$0.a(g, s());
   }

   @Override
   public void a(akk<?> $$0) {
      if (g.equals($$0)) {
         this.y();
      }
   }

   public void b(ji<cjd> $$0) {
      this.ao.a(g, $$0);
   }

   public ji<cjd> p() {
      return this.ao.a(g);
   }

   public static Optional<cjc> a(dby $$0, iz $$1, je $$2) {
      cjc $$3 = new cjc($$0, $$1);
      List<ji<cjd>> $$4 = new ArrayList<>();
      lp.l.c(awz.a).forEach($$4::add);
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
            int $$5 = $$4.stream().mapToInt(cjc::c).max().orElse(0);
            $$4.removeIf($$1x -> c($$1x) < $$5);
            Optional<ji<cjd>> $$6 = ac.b($$4, $$3.ah);
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

   private static int c(ji<cjd> $$0) {
      return $$0.a().a() * $$0.a().b();
   }

   private cjc(dby $$0, iz $$1) {
      super(bta.av, $$0, $$1);
   }

   public cjc(dby $$0, iz $$1, je $$2, ji<cjd> $$3) {
      this($$0, $$1);
      this.b($$3);
      this.a($$2);
   }

   @Override
   public void b(us $$0) {
      a($$0, this.p());
      $$0.a("facing", (byte)this.d.e());
      super.b($$0);
   }

   @Override
   public void a(us $$0) {
      ji<cjd> $$1 = f.parse(vg.a, $$0).result().orElseGet(cjc::s);
      this.b($$1);
      this.d = je.b($$0.f("facing"));
      super.a($$0);
      this.a(this.d);
   }

   public static void a(us $$0, ji<cjd> $$1) {
      f.encodeStart(vg.a, $$1).ifSuccess($$1x -> $$0.a((us)$$1x));
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
   public void b(@Nullable bsu $$0) {
      if (this.dP().ab().b(dbu.i)) {
         this.a(awa.sp, 1.0F, 1.0F);
         if ($$0 instanceof cmx $$1 && $$1.fP()) {
            return;
         }

         this.a(cus.pZ);
      }
   }

   @Override
   public void C() {
      this.a(awa.sq, 1.0F, 1.0F);
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
   public evr do() {
      return evr.a(this.c);
   }

   @Override
   public zw<aci> dl() {
      return new acj(this, this.d.d(), this.D());
   }

   @Override
   public void a(acj $$0) {
      super.a($$0);
      this.a(je.a($$0.p()));
   }

   @Override
   public cup dC() {
      return new cup(cus.pZ);
   }
}
