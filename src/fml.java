import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;

public class fml extends fnw<cjv> implements fps {
   private static final String a = "left_paddle";
   private static final String b = "right_paddle";
   private static final String f = "water_patch";
   private static final String g = "bottom";
   private static final String h = "back";
   private static final String i = "front";
   private static final String j = "right";
   private static final String k = "left";
   private final fqf l;
   private final fqf m;
   private final fqf n;
   private final ImmutableList<fqf> o;

   public fml(fqf $$0) {
      this.l = $$0.b("left_paddle");
      this.m = $$0.b("right_paddle");
      this.n = $$0.b("water_patch");
      this.o = this.a($$0).build();
   }

   protected Builder<fqf> a(fqf $$0) {
      Builder<fqf> $$1 = new Builder();
      $$1.add(new fqf[]{$$0.b("bottom"), $$0.b("back"), $$0.b("front"), $$0.b("right"), $$0.b("left"), this.l, this.m});
      return $$1;
   }

   public static void a(fqo $$0) {
      int $$1 = 32;
      int $$2 = 6;
      int $$3 = 20;
      int $$4 = 4;
      int $$5 = 28;
      $$0.a("bottom", fqk.c().a(0, 0).a(-14.0F, -9.0F, -3.0F, 28.0F, 16.0F, 3.0F), fqh.a(0.0F, 3.0F, 1.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      $$0.a("back", fqk.c().a(0, 19).a(-13.0F, -7.0F, -1.0F, 18.0F, 6.0F, 2.0F), fqh.a(-15.0F, 4.0F, 4.0F, 0.0F, (float) (Math.PI * 3.0 / 2.0), 0.0F));
      $$0.a("front", fqk.c().a(0, 27).a(-8.0F, -7.0F, -1.0F, 16.0F, 6.0F, 2.0F), fqh.a(15.0F, 4.0F, 0.0F, 0.0F, (float) (Math.PI / 2), 0.0F));
      $$0.a("right", fqk.c().a(0, 35).a(-14.0F, -7.0F, -1.0F, 28.0F, 6.0F, 2.0F), fqh.a(0.0F, 4.0F, -9.0F, 0.0F, (float) Math.PI, 0.0F));
      $$0.a("left", fqk.c().a(0, 43).a(-14.0F, -7.0F, -1.0F, 28.0F, 6.0F, 2.0F), fqh.a(0.0F, 4.0F, 9.0F));
      int $$6 = 20;
      int $$7 = 7;
      int $$8 = 6;
      float $$9 = -5.0F;
      $$0.a(
         "left_paddle",
         fqk.c().a(62, 0).a(-1.0F, 0.0F, -5.0F, 2.0F, 2.0F, 18.0F).a(-1.001F, -3.0F, 8.0F, 1.0F, 6.0F, 7.0F),
         fqh.a(3.0F, -5.0F, 9.0F, 0.0F, 0.0F, (float) (Math.PI / 16))
      );
      $$0.a(
         "right_paddle",
         fqk.c().a(62, 20).a(-1.0F, 0.0F, -5.0F, 2.0F, 2.0F, 18.0F).a(0.001F, -3.0F, 8.0F, 1.0F, 6.0F, 7.0F),
         fqh.a(3.0F, -5.0F, -9.0F, 0.0F, (float) Math.PI, (float) (Math.PI / 16))
      );
      $$0.a("water_patch", fqk.c().a(0, 0).a(-14.0F, -9.0F, -3.0F, 28.0F, 16.0F, 3.0F), fqh.a(0.0F, -3.0F, 1.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
   }

   public static fql a() {
      fqn $$0 = new fqn();
      fqo $$1 = $$0.a();
      a($$1);
      return fql.a($$0, 128, 64);
   }

   public void a(cjv $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      a($$0, 0, this.l, $$1);
      a($$0, 1, this.m, $$1);
   }

   public ImmutableList<fqf> b() {
      return this.o;
   }

   @Override
   public fqf c() {
      return this.n;
   }

   private static void a(cjv $$0, int $$1, fqf $$2, float $$3) {
      float $$4 = $$0.a($$1, $$3);
      $$2.e = awm.b((float) (-Math.PI / 3), (float) (-Math.PI / 12), (awm.a(-$$4) + 1.0F) / 2.0F);
      $$2.f = awm.b((float) (-Math.PI / 4), (float) (Math.PI / 4), (awm.a(-$$4 + 1.0F) + 1.0F) / 2.0F);
      if ($$1 == 1) {
         $$2.f = (float) Math.PI - $$2.f;
      }
   }
}
