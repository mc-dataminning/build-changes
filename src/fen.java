import com.google.common.collect.ImmutableList;

public class fen<T extends bil> extends fdw<T> {
   public static final String a = "red_thing";
   private final fhx b;
   private final fhx f;
   private final fhx g;
   private final fhx h;
   private final fhx i;
   private final fhx j;
   private final fhx k;
   private final fhx l;

   public fen(fhx $$0) {
      this.b = $$0.b("head");
      this.k = $$0.b("beak");
      this.l = $$0.b("red_thing");
      this.f = $$0.b("body");
      this.g = $$0.b("right_leg");
      this.h = $$0.b("left_leg");
      this.i = $$0.b("right_wing");
      this.j = $$0.b("left_wing");
   }

   public static fid c() {
      fif $$0 = new fif();
      fig $$1 = $$0.a();
      int $$2 = 16;
      $$1.a("head", fic.c().a(0, 0).a(-2.0F, -6.0F, -2.0F, 4.0F, 6.0F, 3.0F), fhz.a(0.0F, 15.0F, -4.0F));
      $$1.a("beak", fic.c().a(14, 0).a(-2.0F, -4.0F, -4.0F, 4.0F, 2.0F, 2.0F), fhz.a(0.0F, 15.0F, -4.0F));
      $$1.a("red_thing", fic.c().a(14, 4).a(-1.0F, -2.0F, -3.0F, 2.0F, 2.0F, 2.0F), fhz.a(0.0F, 15.0F, -4.0F));
      $$1.a("body", fic.c().a(0, 9).a(-3.0F, -4.0F, -3.0F, 6.0F, 8.0F, 6.0F), fhz.a(0.0F, 16.0F, 0.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      fic $$3 = fic.c().a(26, 0).a(-1.0F, 0.0F, -3.0F, 3.0F, 5.0F, 3.0F);
      $$1.a("right_leg", $$3, fhz.a(-2.0F, 19.0F, 1.0F));
      $$1.a("left_leg", $$3, fhz.a(1.0F, 19.0F, 1.0F));
      $$1.a("right_wing", fic.c().a(24, 13).a(0.0F, 0.0F, -3.0F, 1.0F, 4.0F, 6.0F), fhz.a(-4.0F, 13.0F, 0.0F));
      $$1.a("left_wing", fic.c().a(24, 13).a(-1.0F, 0.0F, -3.0F, 1.0F, 4.0F, 6.0F), fhz.a(4.0F, 13.0F, 0.0F));
      return fid.a($$0, 64, 32);
   }

   @Override
   protected Iterable<fhx> a() {
      return ImmutableList.of(this.b, this.k, this.l);
   }

   @Override
   protected Iterable<fhx> b() {
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
      this.g.e = ars.b($$1 * 0.6662F) * 1.4F * $$2;
      this.h.e = ars.b($$1 * 0.6662F + (float) Math.PI) * 1.4F * $$2;
      this.i.g = $$3;
      this.j.g = -$$3;
   }
}
