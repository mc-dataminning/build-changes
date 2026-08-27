import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;

public class fgf extends fge {
   private static final String a = "right_body_stick";
   private static final String b = "left_body_stick";
   private static final String w = "shoulder_stick";
   private static final String x = "base_plate";
   private final fkb y;
   private final fkb z;
   private final fkb A;
   private final fkb B;

   public fgf(fkb $$0) {
      super($$0);
      this.y = $$0.b("right_body_stick");
      this.z = $$0.b("left_body_stick");
      this.A = $$0.b("shoulder_stick");
      this.B = $$0.b("base_plate");
      this.l.k = false;
   }

   public static fkh c() {
      fkj $$0 = fhp.a(fkf.a, 0.0F);
      fkk $$1 = $$0.a();
      $$1.a("head", fkg.c().a(0, 0).a(-1.0F, -7.0F, -1.0F, 2.0F, 7.0F, 2.0F), fkd.a(0.0F, 1.0F, 0.0F));
      $$1.a("body", fkg.c().a(0, 26).a(-6.0F, 0.0F, -1.5F, 12.0F, 3.0F, 3.0F), fkd.a);
      $$1.a("right_arm", fkg.c().a(24, 0).a(-2.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), fkd.a(-5.0F, 2.0F, 0.0F));
      $$1.a("left_arm", fkg.c().a(32, 16).a().a(0.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), fkd.a(5.0F, 2.0F, 0.0F));
      $$1.a("right_leg", fkg.c().a(8, 0).a(-1.0F, 0.0F, -1.0F, 2.0F, 11.0F, 2.0F), fkd.a(-1.9F, 12.0F, 0.0F));
      $$1.a("left_leg", fkg.c().a(40, 16).a().a(-1.0F, 0.0F, -1.0F, 2.0F, 11.0F, 2.0F), fkd.a(1.9F, 12.0F, 0.0F));
      $$1.a("right_body_stick", fkg.c().a(16, 0).a(-3.0F, 3.0F, -1.0F, 2.0F, 7.0F, 2.0F), fkd.a);
      $$1.a("left_body_stick", fkg.c().a(48, 16).a(1.0F, 3.0F, -1.0F, 2.0F, 7.0F, 2.0F), fkd.a);
      $$1.a("shoulder_stick", fkg.c().a(0, 48).a(-4.0F, 10.0F, -1.0F, 8.0F, 2.0F, 2.0F), fkd.a);
      $$1.a("base_plate", fkg.c().a(0, 32).a(-6.0F, 11.0F, -6.0F, 12.0F, 1.0F, 12.0F), fkd.a(0.0F, 12.0F, 0.0F));
      return fkh.a($$0, 64, 64);
   }

   public void a(bzv $$0, float $$1, float $$2, float $$3) {
      this.B.e = 0.0F;
      this.B.f = (float) (Math.PI / 180.0) * -ati.j($$3, $$0.N, $$0.dB());
      this.B.g = 0.0F;
   }

   @Override
   public void a(bzv $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      this.o.k = $$0.t();
      this.n.k = $$0.t();
      this.B.k = !$$0.w();
      this.y.e = (float) (Math.PI / 180.0) * $$0.A().b();
      this.y.f = (float) (Math.PI / 180.0) * $$0.A().c();
      this.y.g = (float) (Math.PI / 180.0) * $$0.A().d();
      this.z.e = (float) (Math.PI / 180.0) * $$0.A().b();
      this.z.f = (float) (Math.PI / 180.0) * $$0.A().c();
      this.z.g = (float) (Math.PI / 180.0) * $$0.A().d();
      this.A.e = (float) (Math.PI / 180.0) * $$0.A().b();
      this.A.f = (float) (Math.PI / 180.0) * $$0.A().c();
      this.A.g = (float) (Math.PI / 180.0) * $$0.A().d();
   }

   @Override
   protected Iterable<fkb> b() {
      return Iterables.concat(super.b(), ImmutableList.of(this.y, this.z, this.A, this.B));
   }

   @Override
   public void a(bks $$0, enk $$1) {
      fkb $$2 = this.a($$0);
      boolean $$3 = $$2.k;
      $$2.k = true;
      super.a($$0, $$1);
      $$2.k = $$3;
   }
}
