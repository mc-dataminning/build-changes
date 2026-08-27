import org.joml.Quaternionf;
import org.joml.Vector3f;

public class fqn implements fqg<ddj> {
   public static final gbk a = new gbk(fzf.e, new aey("entity/conduit/base"));
   public static final gbk b = new gbk(fzf.e, new aey("entity/conduit/cage"));
   public static final gbk c = new gbk(fzf.e, new aey("entity/conduit/wind"));
   public static final gbk d = new gbk(fzf.e, new aey("entity/conduit/wind_vertical"));
   public static final gbk e = new gbk(fzf.e, new aey("entity/conduit/open_eye"));
   public static final gbk f = new gbk(fzf.e, new aey("entity/conduit/closed_eye"));
   private final fie g;
   private final fie h;
   private final fie i;
   private final fie j;
   private final fqf k;

   public fqn(fqh.a $$0) {
      this.k = $$0.a();
      this.g = $$0.a(fid.x);
      this.h = $$0.a(fid.z);
      this.i = $$0.a(fid.y);
      this.j = $$0.a(fid.w);
   }

   public static fik b() {
      fim $$0 = new fim();
      fin $$1 = $$0.a();
      $$1.a("eye", fij.c().a(0, 0).a(-4.0F, -4.0F, 0.0F, 8.0F, 8.0F, 0.0F, new fii(0.01F)), fig.a);
      return fik.a($$0, 16, 16);
   }

   public static fik c() {
      fim $$0 = new fim();
      fin $$1 = $$0.a();
      $$1.a("wind", fij.c().a(0, 0).a(-8.0F, -8.0F, -8.0F, 16.0F, 16.0F, 16.0F), fig.a);
      return fik.a($$0, 64, 32);
   }

   public static fik d() {
      fim $$0 = new fim();
      fin $$1 = $$0.a();
      $$1.a("shell", fij.c().a(0, 0).a(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F), fig.a);
      return fik.a($$0, 32, 16);
   }

   public static fik e() {
      fim $$0 = new fim();
      fin $$1 = $$0.a();
      $$1.a("shell", fij.c().a(0, 0).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F), fig.a);
      return fik.a($$0, 32, 16);
   }

   public void a(ddj $$0, float $$1, elr $$2, fog $$3, int $$4, int $$5) {
      float $$6 = (float)$$0.a + $$1;
      if (!$$0.d()) {
         float $$7 = $$0.a(0.0F);
         elv $$8 = a.a($$3, foo::c);
         $$2.a();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.a(new Quaternionf().rotationY($$7 * (float) (Math.PI / 180.0)));
         this.i.a($$2, $$8, $$4, $$5);
         $$2.b();
      } else {
         float $$9 = $$0.a($$1) * (180.0F / (float)Math.PI);
         float $$10 = ary.a($$6 * 0.1F) / 2.0F + 0.5F;
         $$10 = $$10 * $$10 + $$10;
         $$2.a();
         $$2.a(0.5F, 0.3F + $$10 * 0.2F, 0.5F);
         Vector3f $$11 = new Vector3f(0.5F, 1.0F, 0.5F).normalize();
         $$2.a(new Quaternionf().rotationAxis($$9 * (float) (Math.PI / 180.0), $$11));
         this.j.a($$2, b.a($$3, foo::e), $$4, $$5);
         $$2.b();
         int $$12 = $$0.a / 66 % 3;
         $$2.a();
         $$2.a(0.5F, 0.5F, 0.5F);
         if ($$12 == 1) {
            $$2.a(new Quaternionf().rotationX((float) (Math.PI / 2)));
         } else if ($$12 == 2) {
            $$2.a(new Quaternionf().rotationZ((float) (Math.PI / 2)));
         }

         elv $$13 = ($$12 == 1 ? d : c).a($$3, foo::e);
         this.h.a($$2, $$13, $$4, $$5);
         $$2.b();
         $$2.a();
         $$2.a(0.5F, 0.5F, 0.5F);
         $$2.b(0.875F, 0.875F, 0.875F);
         $$2.a(new Quaternionf().rotationXYZ((float) Math.PI, 0.0F, (float) Math.PI));
         this.h.a($$2, $$13, $$4, $$5);
         $$2.b();
         eqi $$14 = this.k.b;
         $$2.a();
         $$2.a(0.5F, 0.3F + $$10 * 0.2F, 0.5F);
         $$2.b(0.5F, 0.5F, 0.5F);
         float $$15 = -$$14.e();
         $$2.a(new Quaternionf().rotationYXZ($$15 * (float) (Math.PI / 180.0), $$14.d() * (float) (Math.PI / 180.0), (float) Math.PI));
         float $$16 = 1.3333334F;
         $$2.b(1.3333334F, 1.3333334F, 1.3333334F);
         this.g.a($$2, ($$0.f() ? e : f).a($$3, foo::e), $$4, $$5);
         $$2.b();
      }
   }
}
