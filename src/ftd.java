import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;

public class ftd extends fsj<cmi> {
   private static final String a = "left_paddle";
   private static final String b = "right_paddle";
   private static final String f = "bottom";
   private final fur g;
   private final fur h;
   private final ImmutableList<fur> i;

   public ftd(fur $$0) {
      this.g = $$0.b("left_paddle");
      this.h = $$0.b("right_paddle");
      this.i = this.a($$0).build();
   }

   protected Builder<fur> a(fur $$0) {
      Builder<fur> $$1 = new Builder();
      $$1.add(new fur[]{$$0.b("bottom"), this.g, this.h});
      return $$1;
   }

   public static void a(fva $$0) {
      $$0.a(
         "bottom",
         fuw.c().a(0, 0).a(-14.0F, -11.0F, -4.0F, 28.0F, 20.0F, 4.0F).a(0, 0).a(-14.0F, -9.0F, -8.0F, 28.0F, 16.0F, 4.0F),
         fut.a(0.0F, -2.1F, 1.0F, 1.5708F, 0.0F, 0.0F)
      );
      int $$1 = 20;
      int $$2 = 7;
      int $$3 = 6;
      float $$4 = -5.0F;
      $$0.a(
         "left_paddle",
         fuw.c().a(0, 24).a(-1.0F, 0.0F, -5.0F, 2.0F, 2.0F, 18.0F).a(-1.001F, -3.0F, 8.0F, 1.0F, 6.0F, 7.0F),
         fut.a(3.0F, -4.0F, 9.0F, 0.0F, 0.0F, (float) (Math.PI / 16))
      );
      $$0.a(
         "right_paddle",
         fuw.c().a(40, 24).a(-1.0F, 0.0F, -5.0F, 2.0F, 2.0F, 18.0F).a(0.001F, -3.0F, 8.0F, 1.0F, 6.0F, 7.0F),
         fut.a(3.0F, -4.0F, -9.0F, 0.0F, (float) Math.PI, (float) (Math.PI / 16))
      );
   }

   public static fux b() {
      fuz $$0 = new fuz();
      fva $$1 = $$0.a();
      a($$1);
      return fux.a($$0, 128, 64);
   }

   public void a(cmi $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      a($$0, 0, this.g, $$1);
      a($$0, 1, this.h, $$1);
   }

   public ImmutableList<fur> c() {
      return this.i;
   }

   private static void a(cmi $$0, int $$1, fur $$2, float $$3) {
      float $$4 = $$0.a($$1, $$3);
      $$2.e = axw.b((float) (-Math.PI / 3), (float) (-Math.PI / 12), (axw.a(-$$4) + 1.0F) / 2.0F);
      $$2.f = axw.b((float) (-Math.PI / 4), (float) (Math.PI / 4), (axw.a(-$$4 + 1.0F) + 1.0F) / 2.0F);
      if ($$1 == 1) {
         $$2.f = (float) Math.PI - $$2.f;
      }
   }
}
