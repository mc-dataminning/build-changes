import com.google.common.collect.ImmutableList;

public class ftk<T extends bsp> extends fsq<T> {
   public static final String a = "red_thing";
   private final fwv b;
   private final fwv f;
   private final fwv g;
   private final fwv h;
   private final fwv i;
   private final fwv j;
   private final fwv k;
   private final fwv l;

   public ftk(fwv $$0) {
      this.b = $$0.b("head");
      this.k = $$0.b("beak");
      this.l = $$0.b("red_thing");
      this.f = $$0.b("body");
      this.g = $$0.b("right_leg");
      this.h = $$0.b("left_leg");
      this.i = $$0.b("right_wing");
      this.j = $$0.b("left_wing");
   }

   public static fxb c() {
      fxd $$0 = new fxd();
      fxe $$1 = $$0.a();
      int $$2 = 16;
      $$1.a("head", fxa.c().a(0, 0).a(-2.0F, -6.0F, -2.0F, 4.0F, 6.0F, 3.0F), fwx.a(0.0F, 15.0F, -4.0F));
      $$1.a("beak", fxa.c().a(14, 0).a(-2.0F, -4.0F, -4.0F, 4.0F, 2.0F, 2.0F), fwx.a(0.0F, 15.0F, -4.0F));
      $$1.a("red_thing", fxa.c().a(14, 4).a(-1.0F, -2.0F, -3.0F, 2.0F, 2.0F, 2.0F), fwx.a(0.0F, 15.0F, -4.0F));
      $$1.a("body", fxa.c().a(0, 9).a(-3.0F, -4.0F, -3.0F, 6.0F, 8.0F, 6.0F), fwx.a(0.0F, 16.0F, 0.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      fxa $$3 = fxa.c().a(26, 0).a(-1.0F, 0.0F, -3.0F, 3.0F, 5.0F, 3.0F);
      $$1.a("right_leg", $$3, fwx.a(-2.0F, 19.0F, 1.0F));
      $$1.a("left_leg", $$3, fwx.a(1.0F, 19.0F, 1.0F));
      $$1.a("right_wing", fxa.c().a(24, 13).a(0.0F, 0.0F, -3.0F, 1.0F, 4.0F, 6.0F), fwx.a(-4.0F, 13.0F, 0.0F));
      $$1.a("left_wing", fxa.c().a(24, 13).a(-1.0F, 0.0F, -3.0F, 1.0F, 4.0F, 6.0F), fwx.a(4.0F, 13.0F, 0.0F));
      return fxb.a($$0, 64, 32);
   }

   @Override
   protected Iterable<fwv> a() {
      return ImmutableList.of(this.b, this.k, this.l);
   }

   @Override
   protected Iterable<fwv> b() {
      return ImmutableList.of(this.f, this.g, this.h, this.i, this.j);
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.b.e = $$5 * (float) (Math.PI / 180.0);
      this.b.f = $$4 * (float) (Math.PI / 180.0);
      this.k.e = this.b.e;
      this.k.f = this.b.f;
      this.l.e = this.b.e;
      this.l.f = this.b.f;
      this.g.e = ayu.b($$1 * 0.6662F) * 1.4F * $$2;
      this.h.e = ayu.b($$1 * 0.6662F + (float) Math.PI) * 1.4F * $$2;
      this.i.g = $$3;
      this.j.g = -$$3;
   }
}
