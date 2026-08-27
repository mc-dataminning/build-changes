import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import java.util.List;

public class fpi<T extends bpo> extends fop<T> {
   private static final String a = "ear";
   private static final String A = "cloak";
   private static final String B = "left_sleeve";
   private static final String C = "right_sleeve";
   private static final String D = "left_pants";
   private static final String E = "right_pants";
   private final List<frd> F;
   public final frd b;
   public final frd w;
   public final frd x;
   public final frd y;
   public final frd z;
   private final frd G;
   private final frd H;
   private final boolean I;

   public fpi(frd $$0, boolean $$1) {
      super($$0, fxy::i);
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

   public static frl a(frh $$0, boolean $$1) {
      frl $$2 = fop.a($$0, 0.0F);
      frm $$3 = $$2.a();
      $$3.a("ear", fri.c().a(24, 0).a(-3.0F, -6.0F, -1.0F, 6.0F, 6.0F, 1.0F, $$0), frf.a);
      $$3.a("cloak", fri.c().a(0, 0).a(-5.0F, 0.0F, -1.0F, 10.0F, 16.0F, 1.0F, $$0, 1.0F, 0.5F), frf.a(0.0F, 0.0F, 0.0F));
      float $$4 = 0.25F;
      if ($$1) {
         $$3.a("left_arm", fri.c().a(32, 48).a(-1.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, $$0), frf.a(5.0F, 2.5F, 0.0F));
         $$3.a("right_arm", fri.c().a(40, 16).a(-2.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, $$0), frf.a(-5.0F, 2.5F, 0.0F));
         $$3.a("left_sleeve", fri.c().a(48, 48).a(-1.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, $$0.a(0.25F)), frf.a(5.0F, 2.5F, 0.0F));
         $$3.a("right_sleeve", fri.c().a(40, 32).a(-2.0F, -2.0F, -2.0F, 3.0F, 12.0F, 4.0F, $$0.a(0.25F)), frf.a(-5.0F, 2.5F, 0.0F));
      } else {
         $$3.a("left_arm", fri.c().a(32, 48).a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), frf.a(5.0F, 2.0F, 0.0F));
         $$3.a("left_sleeve", fri.c().a(48, 48).a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.25F)), frf.a(5.0F, 2.0F, 0.0F));
         $$3.a("right_sleeve", fri.c().a(40, 32).a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.25F)), frf.a(-5.0F, 2.0F, 0.0F));
      }

      $$3.a("left_leg", fri.c().a(16, 48).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), frf.a(1.9F, 12.0F, 0.0F));
      $$3.a("left_pants", fri.c().a(0, 48).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.25F)), frf.a(1.9F, 12.0F, 0.0F));
      $$3.a("right_pants", fri.c().a(0, 32).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0.a(0.25F)), frf.a(-1.9F, 12.0F, 0.0F));
      $$3.a("jacket", fri.c().a(16, 32).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0.a(0.25F)), frf.a);
      return $$2;
   }

   @Override
   protected Iterable<frd> b() {
      return Iterables.concat(super.b(), ImmutableList.of(this.x, this.y, this.b, this.w, this.z));
   }

   public void a(etz $$0, eud $$1, int $$2, int $$3) {
      this.H.a(this.k);
      this.H.b = 0.0F;
      this.H.c = 0.0F;
      this.H.a($$0, $$1, $$2, $$3);
   }

   public void b(etz $$0, eud $$1, int $$2, int $$3) {
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
      if ($$0.d(bpd.e).b()) {
         if ($$0.bX()) {
            this.G.d = 1.4F;
            this.G.c = 1.85F;
         } else {
            this.G.d = 0.0F;
            this.G.c = 0.0F;
         }
      } else if ($$0.bX()) {
         this.G.d = 0.3F;
         this.G.c = 0.8F;
      } else {
         this.G.d = -1.1F;
         this.G.c = -0.85F;
      }
   }

   @Override
   public void b_(boolean $$0) {
      super.b_($$0);
      this.b.k = $$0;
      this.w.k = $$0;
      this.x.k = $$0;
      this.y.k = $$0;
      this.z.k = $$0;
      this.G.k = $$0;
      this.H.k = $$0;
   }

   @Override
   public void a(bpi $$0, etz $$1) {
      frd $$2 = this.a($$0);
      if (this.I) {
         float $$3 = 0.5F * (float)($$0 == bpi.b ? 1 : -1);
         $$2.b += $$3;
         $$2.a($$1);
         $$2.b -= $$3;
      } else {
         $$2.a($$1);
      }
   }

   public frd a(axd $$0) {
      return this.F.get($$0.a(this.F.size()));
   }
}
