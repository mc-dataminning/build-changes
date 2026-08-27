import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;

public class fhc extends fim<cfs> implements fkh {
   private static final String a = "left_paddle";
   private static final String b = "right_paddle";
   private static final String f = "water_patch";
   private static final String g = "bottom";
   private static final String h = "back";
   private static final String i = "front";
   private static final String j = "right";
   private static final String k = "left";
   private final fkt l;
   private final fkt m;
   private final fkt n;
   private final ImmutableList<fkt> o;

   public fhc(fkt $$0) {
      this.l = $$0.b("left_paddle");
      this.m = $$0.b("right_paddle");
      this.n = $$0.b("water_patch");
      this.o = this.a($$0).build();
   }

   protected Builder<fkt> a(fkt $$0) {
      Builder<fkt> $$1 = new Builder();
      $$1.add(new fkt[]{$$0.b("bottom"), $$0.b("back"), $$0.b("front"), $$0.b("right"), $$0.b("left"), this.l, this.m});
      return $$1;
   }

   public static void a(flc $$0) {
      int $$1 = 32;
      int $$2 = 6;
      int $$3 = 20;
      int $$4 = 4;
      int $$5 = 28;
      $$0.a("bottom", fky.c().a(0, 0).a(-14.0F, -9.0F, -3.0F, 28.0F, 16.0F, 3.0F), fkv.a(0.0F, 3.0F, 1.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      $$0.a("back", fky.c().a(0, 19).a(-13.0F, -7.0F, -1.0F, 18.0F, 6.0F, 2.0F), fkv.a(-15.0F, 4.0F, 4.0F, 0.0F, (float) (Math.PI * 3.0 / 2.0), 0.0F));
      $$0.a("front", fky.c().a(0, 27).a(-8.0F, -7.0F, -1.0F, 16.0F, 6.0F, 2.0F), fkv.a(15.0F, 4.0F, 0.0F, 0.0F, (float) (Math.PI / 2), 0.0F));
      $$0.a("right", fky.c().a(0, 35).a(-14.0F, -7.0F, -1.0F, 28.0F, 6.0F, 2.0F), fkv.a(0.0F, 4.0F, -9.0F, 0.0F, (float) Math.PI, 0.0F));
      $$0.a("left", fky.c().a(0, 43).a(-14.0F, -7.0F, -1.0F, 28.0F, 6.0F, 2.0F), fkv.a(0.0F, 4.0F, 9.0F));
      int $$6 = 20;
      int $$7 = 7;
      int $$8 = 6;
      float $$9 = -5.0F;
      $$0.a(
         "left_paddle",
         fky.c().a(62, 0).a(-1.0F, 0.0F, -5.0F, 2.0F, 2.0F, 18.0F).a(-1.001F, -3.0F, 8.0F, 1.0F, 6.0F, 7.0F),
         fkv.a(3.0F, -5.0F, 9.0F, 0.0F, 0.0F, (float) (Math.PI / 16))
      );
      $$0.a(
         "right_paddle",
         fky.c().a(62, 20).a(-1.0F, 0.0F, -5.0F, 2.0F, 2.0F, 18.0F).a(0.001F, -3.0F, 8.0F, 1.0F, 6.0F, 7.0F),
         fkv.a(3.0F, -5.0F, -9.0F, 0.0F, (float) Math.PI, (float) (Math.PI / 16))
      );
      $$0.a("water_patch", fky.c().a(0, 0).a(-14.0F, -9.0F, -3.0F, 28.0F, 16.0F, 3.0F), fkv.a(0.0F, -3.0F, 1.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
   }

   public static fkz a() {
      flb $$0 = new flb();
      flc $$1 = $$0.a();
      a($$1);
      return fkz.a($$0, 128, 64);
   }

   public void a(cfs $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      a($$0, 0, this.l, $$1);
      a($$0, 1, this.m, $$1);
   }

   public ImmutableList<fkt> b() {
      return this.o;
   }

   @Override
   public fkt c() {
      return this.n;
   }

   private static void a(cfs $$0, int $$1, fkt $$2, float $$3) {
      float $$4 = $$0.a($$1, $$3);
      $$2.e = atq.b((float) (-Math.PI / 3), (float) (-Math.PI / 12), (atq.a(-$$4) + 1.0F) / 2.0F);
      $$2.f = atq.b((float) (-Math.PI / 4), (float) (Math.PI / 4), (atq.a(-$$4 + 1.0F) + 1.0F) / 2.0F);
      if ($$1 == 1) {
         $$2.f = (float) Math.PI - $$2.f;
      }
   }
}
