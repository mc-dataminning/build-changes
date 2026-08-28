import com.google.common.collect.ImmutableList;

public class ftx<T extends bsd> extends ftd<T> {
   public static final String a = "red_thing";
   private final fxi b;
   private final fxi f;
   private final fxi g;
   private final fxi h;
   private final fxi i;
   private final fxi j;
   private final fxi k;
   private final fxi l;

   public ftx(fxi $$0) {
      this.b = $$0.b("head");
      this.k = $$0.b("beak");
      this.l = $$0.b("red_thing");
      this.f = $$0.b("body");
      this.g = $$0.b("right_leg");
      this.h = $$0.b("left_leg");
      this.i = $$0.b("right_wing");
      this.j = $$0.b("left_wing");
   }

   public static fxo c() {
      fxq $$0 = new fxq();
      fxr $$1 = $$0.a();
      int $$2 = 16;
      $$1.a("head", fxn.c().a(0, 0).a(-2.0F, -6.0F, -2.0F, 4.0F, 6.0F, 3.0F), fxk.a(0.0F, 15.0F, -4.0F));
      $$1.a("beak", fxn.c().a(14, 0).a(-2.0F, -4.0F, -4.0F, 4.0F, 2.0F, 2.0F), fxk.a(0.0F, 15.0F, -4.0F));
      $$1.a("red_thing", fxn.c().a(14, 4).a(-1.0F, -2.0F, -3.0F, 2.0F, 2.0F, 2.0F), fxk.a(0.0F, 15.0F, -4.0F));
      $$1.a("body", fxn.c().a(0, 9).a(-3.0F, -4.0F, -3.0F, 6.0F, 8.0F, 6.0F), fxk.a(0.0F, 16.0F, 0.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      fxn $$3 = fxn.c().a(26, 0).a(-1.0F, 0.0F, -3.0F, 3.0F, 5.0F, 3.0F);
      $$1.a("right_leg", $$3, fxk.a(-2.0F, 19.0F, 1.0F));
      $$1.a("left_leg", $$3, fxk.a(1.0F, 19.0F, 1.0F));
      $$1.a("right_wing", fxn.c().a(24, 13).a(0.0F, 0.0F, -3.0F, 1.0F, 4.0F, 6.0F), fxk.a(-4.0F, 13.0F, 0.0F));
      $$1.a("left_wing", fxn.c().a(24, 13).a(-1.0F, 0.0F, -3.0F, 1.0F, 4.0F, 6.0F), fxk.a(4.0F, 13.0F, 0.0F));
      return fxo.a($$0, 64, 32);
   }

   @Override
   protected Iterable<fxi> a() {
      return ImmutableList.of(this.b, this.k, this.l);
   }

   @Override
   protected Iterable<fxi> b() {
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
      this.g.e = aye.b($$1 * 0.6662F) * 1.4F * $$2;
      this.h.e = aye.b($$1 * 0.6662F + (float) Math.PI) * 1.4F * $$2;
      this.i.g = $$3;
      this.j.g = -$$3;
   }
}
