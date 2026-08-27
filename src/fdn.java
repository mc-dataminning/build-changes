import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;

public class fdn extends fdm {
   private static final String a = "right_body_stick";
   private static final String b = "left_body_stick";
   private static final String w = "shoulder_stick";
   private static final String x = "base_plate";
   private final fhj y;
   private final fhj z;
   private final fhj A;
   private final fhj B;

   public fdn(fhj $$0) {
      super($$0);
      this.y = $$0.b("right_body_stick");
      this.z = $$0.b("left_body_stick");
      this.A = $$0.b("shoulder_stick");
      this.B = $$0.b("base_plate");
      this.l.k = false;
   }

   public static fhp c() {
      fhr $$0 = fex.a(fhn.a, 0.0F);
      fhs $$1 = $$0.a();
      $$1.a("head", fho.c().a(0, 0).a(-1.0F, -7.0F, -1.0F, 2.0F, 7.0F, 2.0F), fhl.a(0.0F, 1.0F, 0.0F));
      $$1.a("body", fho.c().a(0, 26).a(-6.0F, 0.0F, -1.5F, 12.0F, 3.0F, 3.0F), fhl.a);
      $$1.a("right_arm", fho.c().a(24, 0).a(-2.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), fhl.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", fho.c().a(32, 16).a().a(0.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), fhl.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", fho.c().a(8, 0).a(-1.0F, 0.0F, -1.0F, 2.0F, 11.0F, 2.0F), fhl.a(-1.9F, 12.0F, 0.0F));
      $$1.a("left_leg", fho.c().a(40, 16).a().a(-1.0F, 0.0F, -1.0F, 2.0F, 11.0F, 2.0F), fhl.a(1.9F, 12.0F, 0.0F));
      $$1.a("right_body_stick", fho.c().a(16, 0).a(-3.0F, 3.0F, -1.0F, 2.0F, 7.0F, 2.0F), fhl.a);
      $$1.a("left_body_stick", fho.c().a(48, 16).a(1.0F, 3.0F, -1.0F, 2.0F, 7.0F, 2.0F), fhl.a);
      $$1.a("shoulder_stick", fho.c().a(0, 48).a(-4.0F, 10.0F, -1.0F, 8.0F, 2.0F, 2.0F), fhl.a);
      $$1.a("base_plate", fho.c().a(0, 32).a(-6.0F, 11.0F, -6.0F, 12.0F, 1.0F, 12.0F), fhl.a(0.0F, 12.0F, 0.0F));
      return fhp.a($$0, 64, 64);
   }

   public void a(bxu $$0, float $$1, float $$2, float $$3) {
      this.B.e = 0.0F;
      this.B.f = (float) (Math.PI / 180.0) * -aro.j($$3, $$0.N, $$0.dA());
      this.B.g = 0.0F;
   }

   @Override
   public void a(bxu $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      this.o.k = $$0.q();
      this.n.k = $$0.q();
      this.B.k = !$$0.r();
      this.y.e = (float) (Math.PI / 180.0) * $$0.x().b();
      this.y.f = (float) (Math.PI / 180.0) * $$0.x().c();
      this.y.g = (float) (Math.PI / 180.0) * $$0.x().d();
      this.z.e = (float) (Math.PI / 180.0) * $$0.x().b();
      this.z.f = (float) (Math.PI / 180.0) * $$0.x().c();
      this.z.g = (float) (Math.PI / 180.0) * $$0.x().d();
      this.A.e = (float) (Math.PI / 180.0) * $$0.x().b();
      this.A.f = (float) (Math.PI / 180.0) * $$0.x().c();
      this.A.g = (float) (Math.PI / 180.0) * $$0.x().d();
   }

   @Override
   protected Iterable<fhj> b() {
      return Iterables.concat(super.b(), ImmutableList.of(this.y, this.z, this.A, this.B));
   }

   @Override
   public void a(biq $$0, elh $$1) {
      fhj $$2 = this.a($$0);
      boolean $$3 = $$2.k;
      $$2.k = true;
      super.a($$0, $$1);
      $$2.k = $$3;
   }
}
