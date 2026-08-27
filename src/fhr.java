import com.google.common.collect.ImmutableList;

public class fhr<T extends bll> extends fgs<T> {
   private final fkt a;
   private final fkt b;

   public fhr(fkt $$0) {
      this.b = $$0.b("left_wing");
      this.a = $$0.b("right_wing");
   }

   public static fkz c() {
      flb $$0 = new flb();
      flc $$1 = $$0.a();
      fkx $$2 = new fkx(1.0F);
      $$1.a(
         "left_wing",
         fky.c().a(22, 0).a(-10.0F, 0.0F, 0.0F, 10.0F, 20.0F, 2.0F, $$2),
         fkv.a(5.0F, 0.0F, 0.0F, (float) (Math.PI / 12), 0.0F, (float) (-Math.PI / 12))
      );
      $$1.a(
         "right_wing",
         fky.c().a(22, 0).a().a(0.0F, 0.0F, 0.0F, 10.0F, 20.0F, 2.0F, $$2),
         fkv.a(-5.0F, 0.0F, 0.0F, (float) (Math.PI / 12), 0.0F, (float) (Math.PI / 12))
      );
      return fkz.a($$0, 64, 32);
   }

   @Override
   protected Iterable<fkt> a() {
      return ImmutableList.of();
   }

   @Override
   protected Iterable<fkt> b() {
      return ImmutableList.of(this.b, this.a);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = (float) (Math.PI / 12);
      float $$7 = (float) (-Math.PI / 12);
      float $$8 = 0.0F;
      float $$9 = 0.0F;
      if ($$0.fx()) {
         float $$10 = 1.0F;
         ejz $$11 = $$0.dq();
         if ($$11.d < 0.0) {
            ejz $$12 = $$11.d();
            $$10 = 1.0F - (float)Math.pow(-$$12.d, 1.5);
         }

         $$6 = $$10 * (float) (Math.PI / 9) + (1.0F - $$10) * $$6;
         $$7 = $$10 * (float) (-Math.PI / 2) + (1.0F - $$10) * $$7;
      } else if ($$0.bX()) {
         $$6 = (float) (Math.PI * 2.0 / 9.0);
         $$7 = (float) (-Math.PI / 4);
         $$8 = 3.0F;
         $$9 = 0.08726646F;
      }

      this.b.c = $$8;
      if ($$0 instanceof fpy $$13) {
         $$13.c = $$13.c + ($$6 - $$13.c) * 0.1F;
         $$13.d = $$13.d + ($$9 - $$13.d) * 0.1F;
         $$13.e = $$13.e + ($$7 - $$13.e) * 0.1F;
         this.b.e = $$13.c;
         this.b.f = $$13.d;
         this.b.g = $$13.e;
      } else {
         this.b.e = $$6;
         this.b.g = $$7;
         this.b.f = $$9;
      }

      this.a.f = -this.b.f;
      this.a.c = this.b.c;
      this.a.e = this.b.e;
      this.a.g = -this.b.g;
   }
}
