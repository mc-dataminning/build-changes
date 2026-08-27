import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;

public class fcr extends fbx<cah> {
   private static final String a = "left_paddle";
   private static final String b = "right_paddle";
   private static final String f = "bottom";
   private final fee g;
   private final fee h;
   private final ImmutableList<fee> i;

   public fcr(fee $$0) {
      this.g = $$0.b("left_paddle");
      this.h = $$0.b("right_paddle");
      this.i = this.a($$0).build();
   }

   protected Builder<fee> a(fee $$0) {
      Builder<fee> $$1 = new Builder();
      $$1.add(new fee[]{$$0.b("bottom"), this.g, this.h});
      return $$1;
   }

   public static void a(fen $$0) {
      $$0.a(
         "bottom",
         fej.c().a(0, 0).a(-14.0F, -11.0F, -4.0F, 28.0F, 20.0F, 4.0F).a(0, 0).a(-14.0F, -9.0F, -8.0F, 28.0F, 16.0F, 4.0F),
         feg.a(0.0F, -2.0F, 1.0F, 1.5708F, 0.0F, 0.0F)
      );
      int $$1 = 20;
      int $$2 = 7;
      int $$3 = 6;
      float $$4 = -5.0F;
      $$0.a(
         "left_paddle",
         fej.c().a(0, 24).a(-1.0F, 0.0F, -5.0F, 2.0F, 2.0F, 18.0F).a(-1.001F, -3.0F, 8.0F, 1.0F, 6.0F, 7.0F),
         feg.a(3.0F, -4.0F, 9.0F, 0.0F, 0.0F, (float) (Math.PI / 16))
      );
      $$0.a(
         "right_paddle",
         fej.c().a(40, 24).a(-1.0F, 0.0F, -5.0F, 2.0F, 2.0F, 18.0F).a(0.001F, -3.0F, 8.0F, 1.0F, 6.0F, 7.0F),
         feg.a(3.0F, -4.0F, -9.0F, 0.0F, (float) Math.PI, (float) (Math.PI / 16))
      );
   }

   public static fek b() {
      fem $$0 = new fem();
      fen $$1 = $$0.a();
      a($$1);
      return fek.a($$0, 128, 64);
   }

   public void a(cah $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      a($$0, 0, this.g, $$1);
      a($$0, 1, this.h, $$1);
   }

   public ImmutableList<fee> c() {
      return this.i;
   }

   private static void a(cah $$0, int $$1, fee $$2, float $$3) {
      float $$4 = $$0.a($$1, $$3);
      $$2.e = apa.b((float) (-Math.PI / 3), (float) (-Math.PI / 12), (apa.a(-$$4) + 1.0F) / 2.0F);
      $$2.f = apa.b((float) (-Math.PI / 4), (float) (Math.PI / 4), (apa.a(-$$4 + 1.0F) + 1.0F) / 2.0F);
      if ($$1 == 1) {
         $$2.f = (float) Math.PI - $$2.f;
      }
   }
}
