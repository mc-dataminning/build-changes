import org.joml.Quaternionf;
import org.joml.Vector3f;

public class frh implements fra<dej> {
   public static final gce a = new gce(fzz.e, new afw("entity/conduit/base"));
   public static final gce b = new gce(fzz.e, new afw("entity/conduit/cage"));
   public static final gce c = new gce(fzz.e, new afw("entity/conduit/wind"));
   public static final gce d = new gce(fzz.e, new afw("entity/conduit/wind_vertical"));
   public static final gce e = new gce(fzz.e, new afw("entity/conduit/open_eye"));
   public static final gce f = new gce(fzz.e, new afw("entity/conduit/closed_eye"));
   private final fiw g;
   private final fiw h;
   private final fiw i;
   private final fiw j;
   private final fqz k;

   public frh(frb.a $$0) {
      this.k = $$0.a();
      this.g = $$0.a(fiv.x);
      this.h = $$0.a(fiv.z);
      this.i = $$0.a(fiv.y);
      this.j = $$0.a(fiv.w);
   }

   public static fjc b() {
      fje $$0 = new fje();
      fjf $$1 = $$0.a();
      $$1.a("eye", fjb.c().a(0, 0).a(-4.0F, -4.0F, 0.0F, 8.0F, 8.0F, 0.0F, new fja(0.01F)), fiy.a);
      return fjc.a($$0, 16, 16);
   }

   public static fjc c() {
      fje $$0 = new fje();
      fjf $$1 = $$0.a();
      $$1.a("wind", fjb.c().a(0, 0).a(-8.0F, -8.0F, -8.0F, 16.0F, 16.0F, 16.0F), fiy.a);
      return fjc.a($$0, 64, 32);
   }

   public static fjc d() {
      fje $$0 = new fje();
      fjf $$1 = $$0.a();
      $$1.a("shell", fjb.c().a(0, 0).a(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F), fiy.a);
      return fjc.a($$0, 32, 16);
   }

   public static fjc e() {
      fje $$0 = new fje();
      fjf $$1 = $$0.a();
      $$1.a("shell", fjb.c().a(0, 0).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F), fiy.a);
      return fjc.a($$0, 32, 16);
   }

   public void a(dej $$0, float $$1, emh $$2, fpb $$3, int $$4, int $$5) {
      float $$6 = (float)$$0.a + $$1;
      if (!$$0.d()) {
         float $$7 = $$0.a(0.0F);
         eml $$8 = a.a($$3, fpj::c);
         $$2.a();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(new Quaternionf().rotationY($$7 * (float) (Math.PI / 180.0)));
         this.i.a($$2, $$8, $$4, $$5);
         $$2.b();
      } else {
         float $$9 = $$0.a($$1) * (180.0F / (float)Math.PI);
         float $$10 = asy.a($$6 * 0.1F) / 2.0F + 0.5F;
         $$10 = $$10 * $$10 + $$10;
         $$2.a();
         $$2.a(0.5F, 0.3F + $$10 * 0.2F, 0.5F);
         Vector3f $$11 = new Vector3f(0.5F, 1.0F, 0.5F).normalize();
         $$2.a(new Quaternionf().rotationAxis($$9 * (float) (Math.PI / 180.0), $$11));
         this.j.a($$2, b.a($$3, fpj::e), $$4, $$5);
         $$2.b();
         int $$12 = $$0.a / 66 % 3;
         $$2.a();
         $$2.a(0.5F, 0.5F, 0.5F);
         if ($$12 == 1) {
            $$2.a(new Quaternionf().rotationX((float) (Math.PI / 2)));
         } else if ($$12 == 2) {
            $$2.a(new Quaternionf().rotationZ((float) (Math.PI / 2)));
         }

         eml $$13 = ($$12 == 1 ? d : c).a($$3, fpj::e);
         this.h.a($$2, $$13, $$4, $$5);
         $$2.b();
         $$2.a();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.b(0.875F, 0.875F, 0.875F);
         $$2.a(new Quaternionf().rotationXYZ((float) Math.PI, 0.0F, (float) Math.PI));
         this.h.a($$2, $$13, $$4, $$5);
         $$2.b();
         eqz $$14 = this.k.b;
         $$2.a();
         $$2.a(0.5F, 0.3F + $$10 * 0.2F, 0.5F);
         $$2.b(0.5F, 0.5F, 0.5F);
         float $$15 = -$$14.e();
         $$2.a(new Quaternionf().rotationYXZ($$15 * (float) (Math.PI / 180.0), $$14.d() * (float) (Math.PI / 180.0), (float) Math.PI));
         float $$16 = 1.3333334F;
         $$2.b(1.3333334F, 1.3333334F, 1.3333334F);
         this.g.a($$2, ($$0.f() ? e : f).a($$3, fpj::e), $$4, $$5);
         $$2.b();
      }
   }
}
