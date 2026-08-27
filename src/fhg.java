import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;

public class fhg<T extends bvn> extends fgi<T> {
   private static final String j = "egg_belly";
   private final fhx k;

   public fhg(fhx $$0) {
      super($$0, true, 120.0F, 0.0F, 9.0F, 6.0F, 120);
      this.k = $$0.b("egg_belly");
   }

   public static fid c() {
      fif $$0 = new fif();
      fig $$1 = $$0.a();
      $$1.a("head", fic.c().a(3, 0).a(-3.0F, -1.0F, -3.0F, 6.0F, 5.0F, 6.0F), fhz.a(0.0F, 19.0F, -10.0F));
      $$1.a(
         "body",
         fic.c().a(7, 37).a("shell", -9.5F, 3.0F, -10.0F, 19.0F, 20.0F, 6.0F).a(31, 1).a("belly", -5.5F, 3.0F, -13.0F, 11.0F, 18.0F, 3.0F),
         fhz.a(0.0F, 11.0F, -10.0F, (float) (Math.PI / 2), 0.0F, 0.0F)
      );
      $$1.a("egg_belly", fic.c().a(70, 33).a(-4.5F, 3.0F, -14.0F, 9.0F, 18.0F, 1.0F), fhz.a(0.0F, 11.0F, -10.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      int $$2 = 1;
      $$1.a("right_hind_leg", fic.c().a(1, 23).a(-2.0F, 0.0F, 0.0F, 4.0F, 1.0F, 10.0F), fhz.a(-3.5F, 22.0F, 11.0F));
      $$1.a("left_hind_leg", fic.c().a(1, 12).a(-2.0F, 0.0F, 0.0F, 4.0F, 1.0F, 10.0F), fhz.a(3.5F, 22.0F, 11.0F));
      $$1.a("right_front_leg", fic.c().a(27, 30).a(-13.0F, 0.0F, -2.0F, 13.0F, 1.0F, 5.0F), fhz.a(-5.0F, 21.0F, -4.0F));
      $$1.a("left_front_leg", fic.c().a(27, 24).a(0.0F, 0.0F, -2.0F, 13.0F, 1.0F, 5.0F), fhz.a(5.0F, 21.0F, -4.0F));
      return fid.a($$0, 128, 64);
   }

   @Override
   protected Iterable<fhx> b() {
      return Iterables.concat(super.b(), ImmutableList.of(this.k));
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      this.f.e = ars.b($$1 * 0.6662F * 0.6F) * 0.5F * $$2;
      this.g.e = ars.b($$1 * 0.6662F * 0.6F + (float) Math.PI) * 0.5F * $$2;
      this.h.g = ars.b($$1 * 0.6662F * 0.6F + (float) Math.PI) * 0.5F * $$2;
      this.i.g = ars.b($$1 * 0.6662F * 0.6F) * 0.5F * $$2;
      this.h.e = 0.0F;
      this.i.e = 0.0F;
      this.h.f = 0.0F;
      this.i.f = 0.0F;
      this.f.f = 0.0F;
      this.g.f = 0.0F;
      if (!$$0.aX() && $$0.aA()) {
         float $$6 = $$0.q() ? 4.0F : 1.0F;
         float $$7 = $$0.q() ? 2.0F : 1.0F;
         float $$8 = 5.0F;
         this.h.f = ars.b($$6 * $$1 * 5.0F + (float) Math.PI) * 8.0F * $$2 * $$7;
         this.h.g = 0.0F;
         this.i.f = ars.b($$6 * $$1 * 5.0F) * 8.0F * $$2 * $$7;
         this.i.g = 0.0F;
         this.f.f = ars.b($$1 * 5.0F + (float) Math.PI) * 3.0F * $$2;
         this.f.e = 0.0F;
         this.g.f = ars.b($$1 * 5.0F) * 3.0F * $$2;
         this.g.e = 0.0F;
      }

      this.k.k = !this.e && $$0.p();
   }

   @Override
   public void a(elk $$0, elo $$1, int $$2, int $$3, float $$4, float $$5, float $$6, float $$7) {
      boolean $$8 = this.k.k;
      if ($$8) {
         $$0.a();
         $$0.a(0.0F, -0.08F, 0.0F);
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      if ($$8) {
         $$0.b();
      }
   }
}
