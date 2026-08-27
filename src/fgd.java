import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import java.util.List;

public class fgd<T extends bjb> extends ffl<T> {
   private static final String a = "ear";
   private static final String A = "cloak";
   private static final String B = "left_sleeve";
   private static final String C = "right_sleeve";
   private static final String D = "left_pants";
   private static final String E = "right_pants";
   private final List<fhx> F;
   public final fhx b;
   public final fhx w;
   public final fhx x;
   public final fhx y;
   public final fhx z;
   private final fhx G;
   private final fhx H;
   private final boolean I;

   public fgd(fhx $$0, boolean $$1) {
      super($$0, foh::i);
      this.I = $$1;
      this.H = $$0.b("ear");
      this.G = $$0.b("cloak");
      this.b = $$0.b("left_sleeve");
      this.w = $$0.b("right_sleeve");
      this.x = $$0.b("left_pants");
      this.y = $$0.b("right_pants");
      this.z = $$0.b("jacket");
      this.F = $$0.e().filter($$0x -> !$$0x.d()).collect(ImmutableList.toImmutableList());
   }

   public static fif a(fib $$0, boolean $$1) {
      fif $$2 = ffl.a($$0, 0.0F);
      fig $$3 = $$2.a();
      $$3.a("ear", fic.c().a(24, 0).a(-3.0F, -6.0F, -1.0F, 6.0F, 6.0F, 1.0F, $$0), fhz.a);
      $$3.a("cloak", fic.c().a(0, 0).a(-5.0F, 0.0F, -1.0F, 10.0F, 16.0F, 1.0F, $$0, 1.0F, 0.5F), fhz.a(0.0F, 0.0F, 0.0F));
      float $$4 = 0.25F;
      if ($$1) {
         $$3.a("left_arm", fic.c().a(32, 48).a(-1.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, $$0), fhz.a(5.0F, 2.5F, 0.0F));
         $$3.a("right_arm", fic.c().a(40, 16).a(-2.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, $$0), fhz.a(-5.0F, 2.5F, 0.0F));
         $$3.a("left_sleeve", fic.c().a(48, 48).a(-1.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, $$0.a(0.25F)), fhz.a(5.0F, 2.5F, 0.0F));
         $$3.a("right_sleeve", fic.c().a(40, 32).a(-2.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, $$0.a(0.25F)), fhz.a(-5.0F, 2.5F, 0.0F));
      } else {
         $$3.a("left_arm", fic.c().a(32, 48).a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), fhz.a(5.0F, 2.0F, 0.0F));
         $$3.a("left_sleeve", fic.c().a(48, 48).a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.25F)), fhz.a(5.0F, 2.0F, 0.0F));
         $$3.a("right_sleeve", fic.c().a(40, 32).a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.25F)), fhz.a(-5.0F, 2.0F, 0.0F));
      }

      $$3.a("left_leg", fic.c().a(16, 48).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), fhz.a(1.9F, 12.0F, 0.0F));
      $$3.a("left_pants", fic.c().a(0, 48).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.25F)), fhz.a(1.9F, 12.0F, 0.0F));
      $$3.a("right_pants", fic.c().a(0, 32).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.25F)), fhz.a(-1.9F, 12.0F, 0.0F));
      $$3.a("jacket", fic.c().a(16, 32).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0.a(0.25F)), fhz.a);
      return $$2;
   }

   @Override
   protected Iterable<fhx> b() {
      return Iterables.concat(super.b(), ImmutableList.of(this.x, this.y, this.b, this.w, this.z));
   }

   public void a(elk $$0, elo $$1, int $$2, int $$3) {
      this.H.a(this.k);
      this.H.b = 0.0F;
      this.H.c = 0.0F;
      this.H.a($$0, $$1, $$2, $$3);
   }

   public void b(elk $$0, elo $$1, int $$2, int $$3) {
      this.G.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      this.x.a(this.q);
      this.y.a(this.p);
      this.b.a(this.o);
      this.w.a(this.n);
      this.z.a(this.m);
      if ($$0.c(biq.e).b()) {
         if ($$0.bW()) {
            this.G.d = 1.4F;
            this.G.c = 1.85F;
         } else {
            this.G.d = 0.0F;
            this.G.c = 0.0F;
         }
      } else if ($$0.bW()) {
         this.G.d = 0.3F;
         this.G.c = 0.8F;
      } else {
         this.G.d = -1.1F;
         this.G.c = -0.85F;
      }
   }

   @Override
   public void c_(boolean $$0) {
      super.c_($$0);
      this.b.k = $$0;
      this.w.k = $$0;
      this.x.k = $$0;
      this.y.k = $$0;
      this.z.k = $$0;
      this.G.k = $$0;
      this.H.k = $$0;
   }

   @Override
   public void a(biv $$0, elk $$1) {
      fhx $$2 = this.a($$0);
      if (this.I) {
         float $$3 = 0.5F * (float)($$0 == biv.b ? 1 : -1);
         $$2.b += $$3;
         $$2.a($$1);
         $$2.b -= $$3;
      } else {
         $$2.a($$1);
      }
   }

   public fhx a(arx $$0) {
      return this.F.get($$0.a(this.F.size()));
   }
}
