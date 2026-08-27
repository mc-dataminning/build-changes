import com.google.common.collect.ImmutableList;

public class fsm<T extends cft> extends fqw<T> {
   private static final float g = 2.1816616F;
   private static final float h = (float) (Math.PI / 3);
   private static final float i = (float) (Math.PI / 4);
   private static final float j = (float) (Math.PI / 6);
   private static final float k = (float) (Math.PI / 12);
   protected static final String a = "head_parts";
   private static final String l = "left_hind_baby_leg";
   private static final String m = "right_hind_baby_leg";
   private static final String n = "left_front_baby_leg";
   private static final String o = "right_front_baby_leg";
   private static final String p = "saddle";
   private static final String q = "left_saddle_mouth";
   private static final String r = "left_saddle_line";
   private static final String s = "right_saddle_mouth";
   private static final String t = "right_saddle_line";
   private static final String u = "head_saddle";
   private static final String w = "mouth_saddle_wrap";
   protected final fvb b;
   protected final fvb f;
   private final fvb x;
   private final fvb y;
   private final fvb z;
   private final fvb A;
   private final fvb B;
   private final fvb C;
   private final fvb D;
   private final fvb E;
   private final fvb F;
   private final fvb[] G;
   private final fvb[] H;

   public fsm(fvb $$0) {
      super(true, 16.2F, 1.36F, 2.7272F, 2.0F, 20.0F);
      this.b = $$0.b("body");
      this.f = $$0.b("head_parts");
      this.x = $$0.b("right_hind_leg");
      this.y = $$0.b("left_hind_leg");
      this.z = $$0.b("right_front_leg");
      this.A = $$0.b("left_front_leg");
      this.B = $$0.b("right_hind_baby_leg");
      this.C = $$0.b("left_hind_baby_leg");
      this.D = $$0.b("right_front_baby_leg");
      this.E = $$0.b("left_front_baby_leg");
      this.F = this.b.b("tail");
      fvb $$1 = this.b.b("saddle");
      fvb $$2 = this.f.b("left_saddle_mouth");
      fvb $$3 = this.f.b("right_saddle_mouth");
      fvb $$4 = this.f.b("left_saddle_line");
      fvb $$5 = this.f.b("right_saddle_line");
      fvb $$6 = this.f.b("head_saddle");
      fvb $$7 = this.f.b("mouth_saddle_wrap");
      this.G = new fvb[]{$$1, $$2, $$3, $$6, $$7};
      this.H = new fvb[]{$$4, $$5};
   }

   public static fvj a(fvf $$0) {
      fvj $$1 = new fvj();
      fvk $$2 = $$1.a();
      fvk $$3 = $$2.a("body", fvg.c().a(0, 32).a(-5.0F, -8.0F, -17.0F, 10.0F, 10.0F, 22.0F, new fvf(0.05F)), fvd.a(0.0F, 11.0F, 5.0F));
      fvk $$4 = $$2.a("head_parts", fvg.c().a(0, 35).a(-2.05F, -6.0F, -2.0F, 4.0F, 12.0F, 7.0F), fvd.a(0.0F, 4.0F, -12.0F, (float) (Math.PI / 6), 0.0F, 0.0F));
      fvk $$5 = $$4.a("head", fvg.c().a(0, 13).a(-3.0F, -11.0F, -2.0F, 6.0F, 5.0F, 7.0F, $$0), fvd.a);
      $$4.a("mane", fvg.c().a(56, 36).a(-1.0F, -11.0F, 5.01F, 2.0F, 16.0F, 2.0F, $$0), fvd.a);
      $$4.a("upper_mouth", fvg.c().a(0, 25).a(-2.0F, -11.0F, -7.0F, 4.0F, 5.0F, 5.0F, $$0), fvd.a);
      $$2.a("left_hind_leg", fvg.c().a(48, 21).a().a(-3.0F, -1.01F, -1.0F, 4.0F, 11.0F, 4.0F, $$0), fvd.a(4.0F, 14.0F, 7.0F));
      $$2.a("right_hind_leg", fvg.c().a(48, 21).a(-1.0F, -1.01F, -1.0F, 4.0F, 11.0F, 4.0F, $$0), fvd.a(-4.0F, 14.0F, 7.0F));
      $$2.a("left_front_leg", fvg.c().a(48, 21).a().a(-3.0F, -1.01F, -1.9F, 4.0F, 11.0F, 4.0F, $$0), fvd.a(4.0F, 14.0F, -12.0F));
      $$2.a("right_front_leg", fvg.c().a(48, 21).a(-1.0F, -1.01F, -1.9F, 4.0F, 11.0F, 4.0F, $$0), fvd.a(-4.0F, 14.0F, -12.0F));
      fvf $$6 = $$0.a(0.0F, 5.5F, 0.0F);
      $$2.a("left_hind_baby_leg", fvg.c().a(48, 21).a().a(-3.0F, -1.01F, -1.0F, 4.0F, 11.0F, 4.0F, $$6), fvd.a(4.0F, 14.0F, 7.0F));
      $$2.a("right_hind_baby_leg", fvg.c().a(48, 21).a(-1.0F, -1.01F, -1.0F, 4.0F, 11.0F, 4.0F, $$6), fvd.a(-4.0F, 14.0F, 7.0F));
      $$2.a("left_front_baby_leg", fvg.c().a(48, 21).a().a(-3.0F, -1.01F, -1.9F, 4.0F, 11.0F, 4.0F, $$6), fvd.a(4.0F, 14.0F, -12.0F));
      $$2.a("right_front_baby_leg", fvg.c().a(48, 21).a(-1.0F, -1.01F, -1.9F, 4.0F, 11.0F, 4.0F, $$6), fvd.a(-4.0F, 14.0F, -12.0F));
      $$3.a("tail", fvg.c().a(42, 36).a(-1.5F, 0.0F, 0.0F, 3.0F, 14.0F, 4.0F, $$0), fvd.a(0.0F, -5.0F, 2.0F, (float) (Math.PI / 6), 0.0F, 0.0F));
      $$3.a("saddle", fvg.c().a(26, 0).a(-5.0F, -8.0F, -9.0F, 10.0F, 9.0F, 9.0F, new fvf(0.5F)), fvd.a);
      $$4.a("left_saddle_mouth", fvg.c().a(29, 5).a(2.0F, -9.0F, -6.0F, 1.0F, 2.0F, 2.0F, $$0), fvd.a);
      $$4.a("right_saddle_mouth", fvg.c().a(29, 5).a(-3.0F, -9.0F, -6.0F, 1.0F, 2.0F, 2.0F, $$0), fvd.a);
      $$4.a("left_saddle_line", fvg.c().a(32, 2).a(3.1F, -6.0F, -8.0F, 0.0F, 3.0F, 16.0F), fvd.b((float) (-Math.PI / 6), 0.0F, 0.0F));
      $$4.a("right_saddle_line", fvg.c().a(32, 2).a(-3.1F, -6.0F, -8.0F, 0.0F, 3.0F, 16.0F), fvd.b((float) (-Math.PI / 6), 0.0F, 0.0F));
      $$4.a("head_saddle", fvg.c().a(1, 1).a(-3.0F, -11.0F, -1.9F, 6.0F, 5.0F, 6.0F, new fvf(0.22F)), fvd.a);
      $$4.a("mouth_saddle_wrap", fvg.c().a(19, 0).a(-2.0F, -11.0F, -4.0F, 4.0F, 5.0F, 2.0F, new fvf(0.2F)), fvd.a);
      $$5.a("left_ear", fvg.c().a(19, 16).a(0.55F, -13.0F, 4.0F, 2.0F, 3.0F, 1.0F, new fvf(-0.001F)), fvd.a);
      $$5.a("right_ear", fvg.c().a(19, 16).a(-2.55F, -13.0F, 4.0F, 2.0F, 3.0F, 1.0F, new fvf(-0.001F)), fvd.a);
      return $$1;
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      boolean $$6 = $$0.i();
      boolean $$7 = $$0.bQ();

      for (fvb $$8 : this.G) {
         $$8.k = $$6;
      }

      for (fvb $$9 : this.H) {
         $$9.k = $$7 && $$6;
      }

      this.b.c = 11.0F;
   }

   @Override
   public Iterable<fvb> a() {
      return ImmutableList.of(this.f);
   }

   @Override
   protected Iterable<fvb> b() {
      return ImmutableList.of(this.b, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E);
   }

   public void a(T $$0, float $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = axz.j($$3, $$0.ba, $$0.aZ);
      float $$5 = axz.j($$3, $$0.bc, $$0.bb);
      float $$6 = axz.i($$3, $$0.P, $$0.dF());
      float $$7 = $$5 - $$4;
      float $$8 = $$6 * (float) (Math.PI / 180.0);
      if ($$7 > 20.0F) {
         $$7 = 20.0F;
      }

      if ($$7 < -20.0F) {
         $$7 = -20.0F;
      }

      if ($$2 > 0.2F) {
         $$8 += axz.b($$1 * 0.8F) * 0.15F * $$2;
      }

      float $$9 = $$0.G($$3);
      float $$10 = $$0.H($$3);
      float $$11 = 1.0F - $$10;
      float $$12 = $$0.I($$3);
      boolean $$13 = $$0.cp != 0;
      float $$14 = (float)$$0.ai + $$3;
      this.f.c = 4.0F;
      this.f.d = -12.0F;
      this.b.e = 0.0F;
      this.f.e = (float) (Math.PI / 6) + $$8;
      this.f.f = $$7 * (float) (Math.PI / 180.0);
      float $$15 = $$0.bc() ? 0.2F : 1.0F;
      float $$16 = axz.b($$15 * $$1 * 0.6662F + (float) Math.PI);
      float $$17 = $$16 * 0.8F * $$2;
      float $$18 = (1.0F - Math.max($$10, $$9)) * ((float) (Math.PI / 6) + $$8 + $$12 * axz.a($$14) * 0.05F);
      this.f.e = $$10 * ((float) (Math.PI / 12) + $$8) + $$9 * (2.1816616F + axz.a($$14) * 0.05F) + $$18;
      this.f.f = $$10 * $$7 * (float) (Math.PI / 180.0) + (1.0F - Math.max($$10, $$9)) * this.f.f;
      this.f.c = $$10 * -4.0F + $$9 * 11.0F + (1.0F - Math.max($$10, $$9)) * this.f.c;
      this.f.d = $$10 * -4.0F + $$9 * -12.0F + (1.0F - Math.max($$10, $$9)) * this.f.d;
      this.b.e = $$10 * (float) (-Math.PI / 4) + $$11 * this.b.e;
      float $$19 = (float) (Math.PI / 12) * $$10;
      float $$20 = axz.b($$14 * 0.6F + (float) Math.PI);
      this.A.c = 2.0F * $$10 + 14.0F * $$11;
      this.A.d = -6.0F * $$10 - 10.0F * $$11;
      this.z.c = this.A.c;
      this.z.d = this.A.d;
      float $$21 = ((float) (-Math.PI / 3) + $$20) * $$10 + $$17 * $$11;
      float $$22 = ((float) (-Math.PI / 3) - $$20) * $$10 - $$17 * $$11;
      this.y.e = $$19 - $$16 * 0.5F * $$2 * $$11;
      this.x.e = $$19 + $$16 * 0.5F * $$2 * $$11;
      this.A.e = $$21;
      this.z.e = $$22;
      this.F.e = (float) (Math.PI / 6) + $$2 * 0.75F;
      this.F.c = -5.0F + $$2;
      this.F.d = 2.0F + $$2 * 2.0F;
      if ($$13) {
         this.F.f = axz.b($$14 * 0.7F);
      } else {
         this.F.f = 0.0F;
      }

      this.B.c = this.x.c;
      this.B.d = this.x.d;
      this.B.e = this.x.e;
      this.C.c = this.y.c;
      this.C.d = this.y.d;
      this.C.e = this.y.e;
      this.D.c = this.z.c;
      this.D.d = this.z.d;
      this.D.e = this.z.e;
      this.E.c = this.A.c;
      this.E.d = this.A.d;
      this.E.e = this.A.e;
      boolean $$23 = $$0.p_();
      this.x.k = !$$23;
      this.y.k = !$$23;
      this.z.k = !$$23;
      this.A.k = !$$23;
      this.B.k = $$23;
      this.C.k = $$23;
      this.D.k = $$23;
      this.E.k = $$23;
      this.b.c = $$23 ? 10.8F : 0.0F;
   }
}
