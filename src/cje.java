import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cje extends cjb implements bur<ji<cjf>> {
   private static final akk<ji<cjf>> g = ako.a(cje.class, akm.A);
   private static final ale<cjf> h = cjg.a;
   public static final MapCodec<ji<cjf>> e = lp.l.r().fieldOf("variant");
   public static final Codec<ji<cjf>> f = e.codec();

   private static ji<cjf> s() {
      return lp.l.g(h);
   }

   public cje(btc<? extends cje> $$0, dca $$1) {
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

   public void b(ji<cjf> $$0) {
      this.ao.a(g, $$0);
   }

   public ji<cjf> p() {
      return this.ao.a(g);
   }

   public static Optional<cje> a(dca $$0, iz $$1, je $$2) {
      cje $$3 = new cje($$0, $$1);
      List<ji<cjf>> $$4 = new ArrayList<>();
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
            int $$5 = $$4.stream().mapToInt(cje::c).max().orElse(0);
            $$4.removeIf($$1x -> c($$1x) < $$5);
            Optional<ji<cjf>> $$6 = ac.b($$4, $$3.ah);
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

   private static int c(ji<cjf> $$0) {
      return $$0.a().a() * $$0.a().b();
   }

   private cje(dca $$0, iz $$1) {
      super(btc.av, $$0, $$1);
   }

   public cje(dca $$0, iz $$1, je $$2, ji<cjf> $$3) {
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
      ji<cjf> $$1 = f.parse(vg.a, $$0).result().orElseGet(cje::s);
      this.b($$1);
      this.d = je.b($$0.f("facing"));
      super.a($$0);
      this.a(this.d);
   }

   public static void a(us $$0, ji<cjf> $$1) {
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
   public void b(@Nullable bsw $$0) {
      if (this.dP().ab().b(dbw.i)) {
         this.a(awa.sp, 1.0F, 1.0F);
         if ($$0 instanceof cmz $$1 && $$1.fP()) {
            return;
         }

         this.a(cuu.pZ);
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
   public evt do() {
      return evt.a(this.c);
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
   public cur dC() {
      return new cur(cuu.pZ);
   }
}
