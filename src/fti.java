import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;

public class fti extends fuu<cox> implements fwp {
   private static final String a = "left_paddle";
   private static final String b = "right_paddle";
   private static final String f = "water_patch";
   private static final String g = "bottom";
   private static final String h = "back";
   private static final String i = "front";
   private static final String j = "right";
   private static final String k = "left";
   private final fxc l;
   private final fxc m;
   private final fxc n;
   private final ImmutableList<fxc> o;

   public fti(fxc $$0) {
      this.l = $$0.b("left_paddle");
      this.m = $$0.b("right_paddle");
      this.n = $$0.b("water_patch");
      this.o = this.a($$0).build();
   }

   protected Builder<fxc> a(fxc $$0) {
      Builder<fxc> $$1 = new Builder();
      $$1.add(new fxc[]{$$0.b("bottom"), $$0.b("back"), $$0.b("front"), $$0.b("right"), $$0.b("left"), this.l, this.m});
      return $$1;
   }

   public static void a(fxl $$0) {
      int $$1 = 32;
      int $$2 = 6;
      int $$3 = 20;
      int $$4 = 4;
      int $$5 = 28;
      $$0.a("bottom", fxh.c().a(0, 0).a(-14.0F, -9.0F, -3.0F, 28.0F, 16.0F, 3.0F), fxe.a(0.0F, 3.0F, 1.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      $$0.a("back", fxh.c().a(0, 19).a(-13.0F, -7.0F, -1.0F, 18.0F, 6.0F, 2.0F), fxe.a(-15.0F, 4.0F, 4.0F, 0.0F, (float) (Math.PI * 3.0 / 2.0), 0.0F));
      $$0.a("front", fxh.c().a(0, 27).a(-8.0F, -7.0F, -1.0F, 16.0F, 6.0F, 2.0F), fxe.a(15.0F, 4.0F, 0.0F, 0.0F, (float) (Math.PI / 2), 0.0F));
      $$0.a("right", fxh.c().a(0, 35).a(-14.0F, -7.0F, -1.0F, 28.0F, 6.0F, 2.0F), fxe.a(0.0F, 4.0F, -9.0F, 0.0F, (float) Math.PI, 0.0F));
      $$0.a("left", fxh.c().a(0, 43).a(-14.0F, -7.0F, -1.0F, 28.0F, 6.0F, 2.0F), fxe.a(0.0F, 4.0F, 9.0F));
      int $$6 = 20;
      int $$7 = 7;
      int $$8 = 6;
      float $$9 = -5.0F;
      $$0.a(
         "left_paddle",
         fxh.c().a(62, 0).a(-1.0F, 0.0F, -5.0F, 2.0F, 2.0F, 18.0F).a(-1.001F, -3.0F, 8.0F, 1.0F, 6.0F, 7.0F),
         fxe.a(3.0F, -5.0F, 9.0F, 0.0F, 0.0F, (float) (Math.PI / 16))
      );
      $$0.a(
         "right_paddle",
         fxh.c().a(62, 20).a(-1.0F, 0.0F, -5.0F, 2.0F, 2.0F, 18.0F).a(0.001F, -3.0F, 8.0F, 1.0F, 6.0F, 7.0F),
         fxe.a(3.0F, -5.0F, -9.0F, 0.0F, (float) Math.PI, (float) (Math.PI / 16))
      );
      $$0.a("water_patch", fxh.c().a(0, 0).a(-14.0F, -9.0F, -3.0F, 28.0F, 16.0F, 3.0F), fxe.a(0.0F, -3.0F, 1.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
   }

   public static fxi a() {
      fxk $$0 = new fxk();
      fxl $$1 = $$0.a();
      a($$1);
      return fxi.a($$0, 128, 64);
   }

   public void a(cox $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      a($$0, 0, this.l, $$1);
      a($$0, 1, this.m, $$1);
   }

   public ImmutableList<fxc> b() {
      return this.o;
   }

   @Override
   public fxc c() {
      return this.n;
   }

   private static void a(cox $$0, int $$1, fxc $$2, float $$3) {
      float $$4 = $$0.a($$1, $$3);
      $$2.e = ayz.b((float) (-Math.PI / 3), (float) (-Math.PI / 12), (ayz.a(-$$4) + 1.0F) / 2.0F);
      $$2.f = ayz.b((float) (-Math.PI / 4), (float) (Math.PI / 4), (ayz.a(-$$4 + 1.0F) + 1.0F) / 2.0F);
      if ($$1 == 1) {
         $$2.f = (float) Math.PI - $$2.f;
      }
   }
}
