import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class cfy extends cfv implements brn<il<cfz>> {
   private static final aiy<il<cfz>> g = ajc.a(cfy.class, aja.y);
   private static final ajs<cfz> h = cga.a;
   public static final MapCodec<il<cfz>> e = kr.l.r().fieldOf("variant");
   public static final Codec<il<cfz>> f = e.codec();

   private static il<cfz> r() {
      return kr.l.g(h);
   }

   public cfy(bqb<? extends cfy> $$0, cyx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(ajc.a $$0) {
      $$0.a(g, r());
   }

   @Override
   public void a(aiy<?> $$0) {
      if (g.equals($$0)) {
         this.y();
      }
   }

   public void b(il<cfz> $$0) {
      this.an.a(g, $$0);
   }

   public il<cfz> p() {
      return this.an.a(g);
   }

   public static Optional<cfy> a(cyx $$0, ib $$1, ih $$2) {
      cfy $$3 = new cfy($$0, $$1);
      List<il<cfz>> $$4 = new ArrayList<>();
      kr.l.c(avl.a).forEach($$4::add);
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
            int $$5 = $$4.stream().mapToInt(cfy::c).max().orElse(0);
            $$4.removeIf($$1x -> c($$1x) < $$5);
            Optional<il<cfz>> $$6 = ac.b($$4, $$3.ag);
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

   private static int c(il<cfz> $$0) {
      return $$0.a().a() * $$0.a().b();
   }

   private cfy(cyx $$0, ib $$1) {
      super(bqb.au, $$0, $$1);
   }

   public cfy(cyx $$0, ib $$1, ih $$2, il<cfz> $$3) {
      this($$0, $$1);
      this.b($$3);
      this.a($$2);
   }

   @Override
   public void b(tm $$0) {
      a($$0, this.p());
      $$0.a("facing", (byte)this.d.e());
      super.b($$0);
   }

   @Override
   public void a(tm $$0) {
      il<cfz> $$1 = f.parse(ua.a, $$0).result().orElseGet(cfy::r);
      this.b($$1);
      this.d = ih.b($$0.f("facing"));
      super.a($$0);
      this.a(this.d);
   }

   public static void a(tm $$0, il<cfz> $$1) {
      f.encodeStart(ua.a, $$1).result().ifPresent($$1x -> $$0.a((tm)$$1x));
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
   public void b(@Nullable bpv $$0) {
      if (this.dM().aa().b(cyt.i)) {
         this.a(aum.rW, 1.0F, 1.0F);
         if ($$0 instanceof cjt $$1 && $$1.fM()) {
            return;
         }

         this.a(crm.pY);
      }
   }

   @Override
   public void C() {
      this.a(aum.rX, 1.0F, 1.0F);
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
   public esa dl() {
      return esa.a(this.c);
   }

   @Override
   public yn<aay> di() {
      return new aaz(this, this.d.d(), this.D());
   }

   @Override
   public void a(aaz $$0) {
      super.a($$0);
      this.a(ih.a($$0.p()));
   }

   @Override
   public crj dz() {
      return new crj(crm.pY);
   }
}
