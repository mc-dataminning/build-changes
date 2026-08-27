import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;

public class fjb extends fih<cfn> {
   private static final String a = "left_paddle";
   private static final String b = "right_paddle";
   private static final String f = "bottom";
   private final fko g;
   private final fko h;
   private final ImmutableList<fko> i;

   public fjb(fko $$0) {
      this.g = $$0.b("left_paddle");
      this.h = $$0.b("right_paddle");
      this.i = this.a($$0).build();
   }

   protected Builder<fko> a(fko $$0) {
      Builder<fko> $$1 = new Builder();
      $$1.add(new fko[]{$$0.b("bottom"), this.g, this.h});
      return $$1;
   }

   public static void a(fkx $$0) {
      $$0.a(
         "bottom",
         fkt.c().a(0, 0).a(-14.0F, -11.0F, -4.0F, 28.0F, 20.0F, 4.0F).a(0, 0).a(-14.0F, -9.0F, -8.0F, 28.0F, 16.0F, 4.0F),
         fkq.a(0.0F, -2.1F, 1.0F, 1.5708F, 0.0F, 0.0F)
      );
      int $$1 = 20;
      int $$2 = 7;
      int $$3 = 6;
      float $$4 = -5.0F;
      $$0.a(
         "left_paddle",
         fkt.c().a(0, 24).a(-1.0F, 0.0F, -5.0F, 2.0F, 2.0F, 18.0F).a(-1.001F, -3.0F, 8.0F, 1.0F, 6.0F, 7.0F),
         fkq.a(3.0F, -4.0F, 9.0F, 0.0F, 0.0F, (float) (Math.PI / 16))
      );
      $$0.a(
         "right_paddle",
         fkt.c().a(40, 24).a(-1.0F, 0.0F, -5.0F, 2.0F, 2.0F, 18.0F).a(0.001F, -3.0F, 8.0F, 1.0F, 6.0F, 7.0F),
         fkq.a(3.0F, -4.0F, -9.0F, 0.0F, (float) Math.PI, (float) (Math.PI / 16))
      );
   }

   public static fku b() {
      fkw $$0 = new fkw();
      fkx $$1 = $$0.a();
      a($$1);
      return fku.a($$0, 128, 64);
   }

   public void a(cfn $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      a($$0, 0, this.g, $$1);
      a($$0, 1, this.h, $$1);
   }

   public ImmutableList<fko> c() {
      return this.i;
   }

   private static void a(cfn $$0, int $$1, fko $$2, float $$3) {
      float $$4 = $$0.a($$1, $$3);
      $$2.e = atm.b((float) (-Math.PI / 3), (float) (-Math.PI / 12), (atm.a(-$$4) + 1.0F) / 2.0F);
      $$2.f = atm.b((float) (-Math.PI / 4), (float) (Math.PI / 4), (atm.a(-$$4 + 1.0F) + 1.0F) / 2.0F);
      if ($$1 == 1) {
         $$2.f = (float) Math.PI - $$2.f;
      }
   }
}
