import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cix extends ciu implements buk<ji<ciy>> {
   private static final akg<ji<ciy>> g = akk.a(cix.class, aki.A);
   private static final ala<ciy> h = ciz.a;
   public static final MapCodec<ji<ciy>> e = lp.l.r().fieldOf("variant");
   public static final Codec<ji<ciy>> f = e.codec();

   private static ji<ciy> s() {
      return lp.l.g(h);
   }

   public cix(bsv<? extends cix> $$0, dbt $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akk.a $$0) {
      $$0.a(g, s());
   }

   @Override
   public void a(akg<?> $$0) {
      if (g.equals($$0)) {
         this.y();
      }
   }

   public void b(ji<ciy> $$0) {
      this.ao.a(g, $$0);
   }

   public ji<ciy> p() {
      return this.ao.a(g);
   }

   public static Optional<cix> a(dbt $$0, iz $$1, je $$2) {
      cix $$3 = new cix($$0, $$1);
      List<ji<ciy>> $$4 = new ArrayList<>();
      lp.l.c(awv.a).forEach($$4::add);
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
            int $$5 = $$4.stream().mapToInt(cix::c).max().orElse(0);
            $$4.removeIf($$1x -> c($$1x) < $$5);
            Optional<ji<ciy>> $$6 = ac.b($$4, $$3.ah);
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

   private static int c(ji<ciy> $$0) {
      return $$0.a().a() * $$0.a().b();
   }

   private cix(dbt $$0, iz $$1) {
      super(bsv.av, $$0, $$1);
   }

   public cix(dbt $$0, iz $$1, je $$2, ji<ciy> $$3) {
      this($$0, $$1);
      this.b($$3);
      this.a($$2);
   }

   @Override
   public void b(ur $$0) {
      a($$0, this.p());
      $$0.a("facing", (byte)this.d.e());
      super.b($$0);
   }

   @Override
   public void a(ur $$0) {
      ji<ciy> $$1 = f.parse(vf.a, $$0).result().orElseGet(cix::s);
      this.b($$1);
      this.d = je.b($$0.f("facing"));
      super.a($$0);
      this.a(this.d);
   }

   public static void a(ur $$0, ji<ciy> $$1) {
      f.encodeStart(vf.a, $$1).ifSuccess($$1x -> $$0.a((ur)$$1x));
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
   public void b(@Nullable bsp $$0) {
      if (this.dP().ab().b(dbp.i)) {
         this.a(avw.sp, 1.0F, 1.0F);
         if ($$0 instanceof cms $$1 && $$1.fP()) {
            return;
         }

         this.a(cun.pZ);
      }
   }

   @Override
   public void C() {
      this.a(avw.sq, 1.0F, 1.0F);
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
   public evm do() {
      return evm.a(this.c);
   }

   @Override
   public zs<ace> dl() {
      return new acf(this, this.d.d(), this.D());
   }

   @Override
   public void a(acf $$0) {
      super.a($$0);
      this.a(je.a($$0.p()));
   }

   @Override
   public cuk dC() {
      return new cuk(cun.pZ);
   }
}
