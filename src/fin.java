import com.google.common.collect.ImmutableList;

public class fin<T extends byu> extends fhu<T> {
   private final fkt a;
   private final fkt b;
   private final fkt f;
   private final fkt g;
   private final fkt h;
   private final fkt i;
   private final fkt j;
   private final fkt k;

   public fin(fkt $$0) {
      this.a = $$0.b("head");
      this.b = $$0.b("body");
      this.j = $$0.b("right_chest");
      this.k = $$0.b("left_chest");
      this.f = $$0.b("right_hind_leg");
      this.g = $$0.b("left_hind_leg");
      this.h = $$0.b("right_front_leg");
      this.i = $$0.b("left_front_leg");
   }

   public static fkz a(fkx $$0) {
      flb $$1 = new flb();
      flc $$2 = $$1.a();
      $$2.a(
         "head",
         fky.c()
            .a(0, 0)
            .a(-2.0F, -14.0F, -10.0F, 4.0F, 4.0F, 9.0F, $$0)
            .a(0, 14)
            .a("neck", -4.0F, -16.0F, -6.0F, 8.0F, 18.0F, 6.0F, $$0)
            .a(17, 0)
            .a("ear", -4.0F, -19.0F, -4.0F, 3.0F, 3.0F, 2.0F, $$0)
            .a(17, 0)
            .a("ear", 1.0F, -19.0F, -4.0F, 3.0F, 3.0F, 2.0F, $$0),
         fkv.a(0.0F, 7.0F, -6.0F)
      );
      $$2.a("body", fky.c().a(29, 0).a(-6.0F, -10.0F, -7.0F, 12.0F, 18.0F, 10.0F, $$0), fkv.a(0.0F, 5.0F, 2.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      $$2.a("right_chest", fky.c().a(45, 28).a(-3.0F, 0.0F, 0.0F, 8.0F, 8.0F, 3.0F, $$0), fkv.a(-8.5F, 3.0F, 3.0F, 0.0F, (float) (Math.PI / 2), 0.0F));
      $$2.a("left_chest", fky.c().a(45, 41).a(-3.0F, 0.0F, 0.0F, 8.0F, 8.0F, 3.0F, $$0), fkv.a(5.5F, 3.0F, 3.0F, 0.0F, (float) (Math.PI / 2), 0.0F));
      int $$3 = 4;
      int $$4 = 14;
      fky $$5 = fky.c().a(29, 29).a(-2.0F, 0.0F, -2.0F, 4.0F, 14.0F, 4.0F, $$0);
      $$2.a("right_hind_leg", $$5, fkv.a(-3.5F, 10.0F, 6.0F));
      $$2.a("left_hind_leg", $$5, fkv.a(3.5F, 10.0F, 6.0F));
      $$2.a("right_front_leg", $$5, fkv.a(-3.5F, 10.0F, -5.0F));
      $$2.a("left_front_leg", $$5, fkv.a(3.5F, 10.0F, -5.0F));
      return fkz.a($$1, 128, 64);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a.e = $$5 * (float) (Math.PI / 180.0);
      this.a.f = $$4 * (float) (Math.PI / 180.0);
      this.f.e = atq.b($$1 * 0.6662F) * 1.4F * $$2;
      this.g.e = atq.b($$1 * 0.6662F + (float) Math.PI) * 1.4F * $$2;
      this.h.e = atq.b($$1 * 0.6662F + (float) Math.PI) * 1.4F * $$2;
      this.i.e = atq.b($$1 * 0.6662F) * 1.4F * $$2;
      boolean $$6 = !$$0.o_() && $$0.w();
      this.j.k = $$6;
      this.k.k = $$6;
   }

   @Override
   public void a(eob $$0, eof $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      if (this.e) {
         float $$8 = 2.0F;
         $$0.a();
         float $$9 = 0.7F;
         $$0.b(0.71428573F, 0.64935064F, 0.7936508F);
         $$0.a(0.0F, 1.3125F, 0.22F);
         this.a.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
         $$0.b();
         $$0.a();
         float $$10 = 1.1F;
         $$0.b(0.625F, 0.45454544F, 0.45454544F);
         $$0.a(0.0F, 2.0625F, 0.0F);
         this.b.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
         $$0.b();
         $$0.a();
         $$0.b(0.45454544F, 0.41322312F, 0.45454544F);
         $$0.a(0.0F, 2.0625F, 0.0F);
         ImmutableList.of(this.f, this.g, this.h, this.i, this.j, this.k).forEach($$8x -> $$8x.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
         $$0.b();
      } else {
         ImmutableList.of(this.a, this.b, this.f, this.g, this.h, this.i, this.j, this.k).forEach($$8x -> $$8x.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
      }
   }
}
