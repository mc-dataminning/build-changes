import com.google.common.collect.ImmutableList;

public class fgi<T extends bil> extends fdw<T> {
   protected final fhx a;
   protected final fhx b;
   protected final fhx f;
   protected final fhx g;
   protected final fhx h;
   protected final fhx i;

   protected fgi(fhx $$0, boolean $$1, float $$2, float $$3, float $$4, float $$5, int $$6) {
      super($$1, $$2, $$3, $$4, $$5, (float)$$6);
      this.a = $$0.b("head");
      this.b = $$0.b("body");
      this.f = $$0.b("right_hind_leg");
      this.g = $$0.b("left_hind_leg");
      this.h = $$0.b("right_front_leg");
      this.i = $$0.b("left_front_leg");
   }

   public static fif a(int $$0, fib $$1) {
      fif $$2 = new fif();
      fig $$3 = $$2.a();
      $$3.a("head", fic.c().a(0, 0).a(-4.0F, -4.0F, -8.0F, 8.0F, 8.0F, 8.0F, $$1), fhz.a(0.0F, (float)(18 - $$0), -6.0F));
      $$3.a("body", fic.c().a(28, 8).a(-5.0F, -10.0F, -7.0F, 10.0F, 16.0F, 8.0F, $$1), fhz.a(0.0F, (float)(17 - $$0), 2.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      fic $$4 = fic.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, (float)$$0, 4.0F, $$1);
      $$3.a("right_hind_leg", $$4, fhz.a(-3.0F, (float)(24 - $$0), 7.0F));
      $$3.a("left_hind_leg", $$4, fhz.a(3.0F, (float)(24 - $$0), 7.0F));
      $$3.a("right_front_leg", $$4, fhz.a(-3.0F, (float)(24 - $$0), -5.0F));
      $$3.a("left_front_leg", $$4, fhz.a(3.0F, (float)(24 - $$0), -5.0F));
      return $$2;
   }

   @Override
   protected Iterable<fhx> a() {
      return ImmutableList.of(this.a);
   }

   @Override
   protected Iterable<fhx> b() {
      return ImmutableList.of(this.b, this.f, this.g, this.h, this.i);
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a.e = $$5 * (float) (Math.PI / 180.0);
      this.a.f = $$4 * (float) (Math.PI / 180.0);
      this.f.e = ars.b($$1 * 0.6662F) * 1.4F * $$2;
      this.g.e = ars.b($$1 * 0.6662F + (float) Math.PI) * 1.4F * $$2;
      this.h.e = ars.b($$1 * 0.6662F + (float) Math.PI) * 1.4F * $$2;
      this.i.e = ars.b($$1 * 0.6662F) * 1.4F * $$2;
   }
}
