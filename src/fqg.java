import org.joml.Quaternionf;
import org.joml.Vector3f;

public class fqg implements fpz<ddc> {
   public static final gbd a = new gbd(fyy.e, new aeu("entity/conduit/base"));
   public static final gbd b = new gbd(fyy.e, new aeu("entity/conduit/cage"));
   public static final gbd c = new gbd(fyy.e, new aeu("entity/conduit/wind"));
   public static final gbd d = new gbd(fyy.e, new aeu("entity/conduit/wind_vertical"));
   public static final gbd e = new gbd(fyy.e, new aeu("entity/conduit/open_eye"));
   public static final gbd f = new gbd(fyy.e, new aeu("entity/conduit/closed_eye"));
   private final fhx g;
   private final fhx h;
   private final fhx i;
   private final fhx j;
   private final fpy k;

   public fqg(fqa.a $$0) {
      this.k = $$0.a();
      this.g = $$0.a(fhw.x);
      this.h = $$0.a(fhw.z);
      this.i = $$0.a(fhw.y);
      this.j = $$0.a(fhw.w);
   }

   public static fid b() {
      fif $$0 = new fif();
      fig $$1 = $$0.a();
      $$1.a("eye", fic.c().a(0, 0).a(-4.0F, -4.0F, 0.0F, 8.0F, 8.0F, 0.0F, new fib(0.01F)), fhz.a);
      return fid.a($$0, 16, 16);
   }

   public static fid c() {
      fif $$0 = new fif();
      fig $$1 = $$0.a();
      $$1.a("wind", fic.c().a(0, 0).a(-8.0F, -8.0F, -8.0F, 16.0F, 16.0F, 16.0F), fhz.a);
      return fid.a($$0, 64, 32);
   }

   public static fid d() {
      fif $$0 = new fif();
      fig $$1 = $$0.a();
      $$1.a("shell", fic.c().a(0, 0).a(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F), fhz.a);
      return fid.a($$0, 32, 16);
   }

   public static fid e() {
      fif $$0 = new fif();
      fig $$1 = $$0.a();
      $$1.a("shell", fic.c().a(0, 0).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F), fhz.a);
      return fid.a($$0, 32, 16);
   }

   public void a(ddc $$0, float $$1, elk $$2, fnz $$3, int $$4, int $$5) {
      float $$6 = (float)$$0.a + $$1;
      if (!$$0.d()) {
         float $$7 = $$0.a(0.0F);
         elo $$8 = a.a($$3, foh::c);
         $$2.a();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(new Quaternionf().rotationY($$7 * (float) (Math.PI / 180.0)));
         this.i.a($$2, $$8, $$4, $$5);
         $$2.b();
      } else {
         float $$9 = $$0.a($$1) * (180.0F / (float)Math.PI);
         float $$10 = ars.a($$6 * 0.1F) / 2.0F + 0.5F;
         $$10 = $$10 * $$10 + $$10;
         $$2.a();
         $$2.a(0.5F, 0.3F + $$10 * 0.2F, 0.5F);
         Vector3f $$11 = new Vector3f(0.5F, 1.0F, 0.5F).normalize();
         $$2.a(new Quaternionf().rotationAxis($$9 * (float) (Math.PI / 180.0), $$11));
         this.j.a($$2, b.a($$3, foh::e), $$4, $$5);
         $$2.b();
         int $$12 = $$0.a / 66 % 3;
         $$2.a();
         $$2.a(0.5F, 0.5F, 0.5F);
         if ($$12 == 1) {
            $$2.a(new Quaternionf().rotationX((float) (Math.PI / 2)));
         } else if ($$12 == 2) {
            $$2.a(new Quaternionf().rotationZ((float) (Math.PI / 2)));
         }

         elo $$13 = ($$12 == 1 ? d : c).a($$3, foh::e);
         this.h.a($$2, $$13, $$4, $$5);
         $$2.b();
         $$2.a();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.b(0.875F, 0.875F, 0.875F);
         $$2.a(new Quaternionf().rotationXYZ((float) Math.PI, 0.0F, (float) Math.PI));
         this.h.a($$2, $$13, $$4, $$5);
         $$2.b();
         eqb $$14 = this.k.b;
         $$2.a();
         $$2.a(0.5F, 0.3F + $$10 * 0.2F, 0.5F);
         $$2.b(0.5F, 0.5F, 0.5F);
         float $$15 = -$$14.e();
         $$2.a(new Quaternionf().rotationYXZ($$15 * (float) (Math.PI / 180.0), $$14.d() * (float) (Math.PI / 180.0), (float) Math.PI));
         float $$16 = 1.3333334F;
         $$2.b(1.3333334F, 1.3333334F, 1.3333334F);
         this.g.a($$2, ($$0.f() ? e : f).a($$3, foh::e), $$4, $$5);
         $$2.b();
      }
   }
}
