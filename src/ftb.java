import org.joml.Quaternionf;
import org.joml.Vector3f;

public class ftb implements fsu<dfp> {
   public static final gdy a = new gdy(gbt.e, new agi("entity/conduit/base"));
   public static final gdy b = new gdy(gbt.e, new agi("entity/conduit/cage"));
   public static final gdy c = new gdy(gbt.e, new agi("entity/conduit/wind"));
   public static final gdy d = new gdy(gbt.e, new agi("entity/conduit/wind_vertical"));
   public static final gdy e = new gdy(gbt.e, new agi("entity/conduit/open_eye"));
   public static final gdy f = new gdy(gbt.e, new agi("entity/conduit/closed_eye"));
   private final fko g;
   private final fko h;
   private final fko i;
   private final fko j;
   private final fst k;

   public ftb(fsv.a $$0) {
      this.k = $$0.a();
      this.g = $$0.a(fkn.x);
      this.h = $$0.a(fkn.z);
      this.i = $$0.a(fkn.y);
      this.j = $$0.a(fkn.w);
   }

   public static fku b() {
      fkw $$0 = new fkw();
      fkx $$1 = $$0.a();
      $$1.a("eye", fkt.c().a(0, 0).a(-4.0F, -4.0F, 0.0F, 8.0F, 8.0F, 0.0F, new fks(0.01F)), fkq.a);
      return fku.a($$0, 16, 16);
   }

   public static fku c() {
      fkw $$0 = new fkw();
      fkx $$1 = $$0.a();
      $$1.a("wind", fkt.c().a(0, 0).a(-8.0F, -8.0F, -8.0F, 16.0F, 16.0F, 16.0F), fkq.a);
      return fku.a($$0, 64, 32);
   }

   public static fku d() {
      fkw $$0 = new fkw();
      fkx $$1 = $$0.a();
      $$1.a("shell", fkt.c().a(0, 0).a(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F), fkq.a);
      return fku.a($$0, 32, 16);
   }

   public static fku e() {
      fkw $$0 = new fkw();
      fkx $$1 = $$0.a();
      $$1.a("shell", fkt.c().a(0, 0).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F), fkq.a);
      return fku.a($$0, 32, 16);
   }

   public void a(dfp $$0, float $$1, enw $$2, fqu $$3, int $$4, int $$5) {
      float $$6 = (float)$$0.a + $$1;
      if (!$$0.d()) {
         float $$7 = $$0.a(0.0F);
         eoa $$8 = a.a($$3, frc::c);
         $$2.a();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(new Quaternionf().rotationY($$7 * (float) (Math.PI / 180.0)));
         this.i.a($$2, $$8, $$4, $$5);
         $$2.b();
      } else {
         float $$9 = $$0.a($$1) * (180.0F / (float)Math.PI);
         float $$10 = atm.a($$6 * 0.1F) / 2.0F + 0.5F;
         $$10 = $$10 * $$10 + $$10;
         $$2.a();
         $$2.a(0.5F, 0.3F + $$10 * 0.2F, 0.5F);
         Vector3f $$11 = new Vector3f(0.5F, 1.0F, 0.5F).normalize();
         $$2.a(new Quaternionf().rotationAxis($$9 * (float) (Math.PI / 180.0), $$11));
         this.j.a($$2, b.a($$3, frc::e), $$4, $$5);
         $$2.b();
         int $$12 = $$0.a / 66 % 3;
         $$2.a();
         $$2.a(0.5F, 0.5F, 0.5F);
         if ($$12 == 1) {
            $$2.a(new Quaternionf().rotationX((float) (Math.PI / 2)));
         } else if ($$12 == 2) {
            $$2.a(new Quaternionf().rotationZ((float) (Math.PI / 2)));
         }

         eoa $$13 = ($$12 == 1 ? d : c).a($$3, frc::e);
         this.h.a($$2, $$13, $$4, $$5);
         $$2.b();
         $$2.a();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.b(0.875F, 0.875F, 0.875F);
         $$2.a(new Quaternionf().rotationXYZ((float) Math.PI, 0.0F, (float) Math.PI));
         this.h.a($$2, $$13, $$4, $$5);
         $$2.b();
         eso $$14 = this.k.b;
         $$2.a();
         $$2.a(0.5F, 0.3F + $$10 * 0.2F, 0.5F);
         $$2.b(0.5F, 0.5F, 0.5F);
         float $$15 = -$$14.e();
         $$2.a(new Quaternionf().rotationYXZ($$15 * (float) (Math.PI / 180.0), $$14.d() * (float) (Math.PI / 180.0), (float) Math.PI));
         float $$16 = 1.3333334F;
         $$2.b(1.3333334F, 1.3333334F, 1.3333334F);
         this.g.a($$2, ($$0.f() ? e : f).a($$3, frc::e), $$4, $$5);
         $$2.b();
      }
   }
}
