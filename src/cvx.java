import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class cvx {
   public static final Codec<cvx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cqk.a.optionalFieldOf("buy", cqk.h).forGetter($$0x -> $$0x.c),
               cqk.a.optionalFieldOf("buyB", cqk.h).forGetter($$0x -> $$0x.d),
               cqk.a.optionalFieldOf("sell", cqk.h).forGetter($$0x -> $$0x.e),
               Codec.INT.optionalFieldOf("uses", 0).forGetter($$0x -> $$0x.f),
               Codec.INT.optionalFieldOf("maxUses", 4).forGetter($$0x -> $$0x.g),
               Codec.BOOL.optionalFieldOf("rewardExp", true).forGetter($$0x -> $$0x.h),
               Codec.INT.optionalFieldOf("specialPrice", 0).forGetter($$0x -> $$0x.i),
               Codec.INT.optionalFieldOf("demand", 0).forGetter($$0x -> $$0x.j),
               Codec.FLOAT.optionalFieldOf("priceMultiplier", 0.0F).forGetter($$0x -> $$0x.k),
               Codec.INT.optionalFieldOf("xp", 1).forGetter($$0x -> $$0x.l),
               Codec.BOOL.optionalFieldOf("ignore_tags", false).forGetter($$0x -> $$0x.m)
            )
            .apply($$0, cvx::new)
   );
   public static final xs<vf, cvx> b = xs.a(cvx::a, cvx::a);
   private final cqk c;
   private final cqk d;
   private final cqk e;
   private int f;
   private final int g;
   private final boolean h;
   private int i;
   private int j;
   private final float k;
   private final int l;
   private final boolean m;

   private cvx(cqk $$0, cqk $$1, cqk $$2, int $$3, int $$4, boolean $$5, int $$6, int $$7, float $$8, int $$9, boolean $$10) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
      this.h = $$5;
      this.i = $$6;
      this.j = $$7;
      this.k = $$8;
      this.l = $$9;
      this.m = $$10;
   }

   public cvx(cqk $$0, cqk $$1, int $$2, int $$3, float $$4) {
      this($$0, cqk.h, $$1, $$2, $$3, $$4);
   }

   public cvx(cqk $$0, cqk $$1, cqk $$2, int $$3, int $$4, float $$5) {
      this($$0, $$1, $$2, 0, $$3, $$4, $$5);
   }

   public cvx(cqk $$0, cqk $$1, cqk $$2, int $$3, int $$4, int $$5, float $$6) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, 0);
   }

   public cvx(cqk $$0, cqk $$1, cqk $$2, int $$3, int $$4, int $$5, float $$6, int $$7) {
      this($$0, $$1, $$2, $$3, $$4, true, 0, $$7, $$6, $$5, false);
   }

   public cvx(cqk $$0, cqk $$1, cqk $$2, int $$3, int $$4, int $$5, float $$6, int $$7, boolean $$8) {
      this($$0, $$1, $$2, $$3, $$4, true, 0, $$7, $$6, $$5, $$8);
   }

   private cvx(cvx $$0) {
      this($$0.c.q(), $$0.d.q(), $$0.e.q(), $$0.f, $$0.g, $$0.h, $$0.i, $$0.j, $$0.k, $$0.l, $$0.m);
   }

   public cqk a() {
      return this.c;
   }

   public cqk b() {
      if (this.c.b()) {
         return cqk.h;
      } else {
         int $$0 = this.c.M();
         int $$1 = Math.max(0, aww.d((float)($$0 * this.j) * this.k));
         return this.c.c(aww.a($$0 + $$1 + this.i, 1, this.c.d().n()));
      }
   }

   public cqk c() {
      return this.d;
   }

   public cqk d() {
      return this.e;
   }

   public void e() {
      this.j = this.j + this.f - (this.g - this.f);
   }

   public cqk f() {
      return this.e.q();
   }

   public int g() {
      return this.f;
   }

   public void h() {
      this.f = 0;
   }

   public int i() {
      return this.g;
   }

   public void j() {
      this.f++;
   }

   public int k() {
      return this.j;
   }

   public boolean l() {
      return this.m;
   }

   public void a(int $$0) {
      this.i += $$0;
   }

   public void m() {
      this.i = 0;
   }

   public int n() {
      return this.i;
   }

   public void b(int $$0) {
      this.i = $$0;
   }

   public float o() {
      return this.k;
   }

   public int p() {
      return this.l;
   }

   public boolean q() {
      return this.f >= this.g;
   }

   public void r() {
      this.f = this.g;
   }

   public boolean s() {
      return this.f > 0;
   }

   public boolean t() {
      return this.h;
   }

   public boolean a(cqk $$0, cqk $$1) {
      return a($$0, this.b(), this.m) && $$0.M() >= this.b().M() && a($$1, this.d, this.m) && $$1.M() >= this.d.M();
   }

   public static boolean a(cqk $$0, cqk $$1, boolean $$2) {
      if ($$1.b() && $$0.b()) {
         return true;
      } else {
         cqk $$3 = $$0.q();
         cqk $$4 = $$1.q();
         if ($$3.d().p()) {
            $$3.b($$3.l());
         }

         return $$2 ? cqk.b($$3, $$4) : cqk.b($$3, $$4) && (!$$4.v() || $$3.v() && tp.a($$4.w(), $$3.w(), false));
      }
   }

   public boolean b(cqk $$0, cqk $$1) {
      if (!this.a($$0, $$1)) {
         return false;
      } else {
         $$0.h(this.b().M());
         if (!this.c().b()) {
            $$1.h(this.c().M());
         }

         return true;
      }
   }

   public cvx u() {
      return new cvx(this);
   }

   private static void a(vf $$0, cvx $$1) {
      cqk.f.encode($$0, $$1.a());
      cqk.f.encode($$0, $$1.d());
      cqk.f.encode($$0, $$1.c());
      $$0.a($$1.q());
      $$0.p($$1.g());
      $$0.p($$1.i());
      $$0.p($$1.p());
      $$0.p($$1.n());
      $$0.a($$1.o());
      $$0.p($$1.k());
      $$0.a($$1.l());
   }

   public static cvx a(vf $$0) {
      cqk $$1 = cqk.f.decode($$0);
      cqk $$2 = cqk.f.decode($$0);
      cqk $$3 = cqk.f.decode($$0);
      boolean $$4 = $$0.readBoolean();
      int $$5 = $$0.readInt();
      int $$6 = $$0.readInt();
      int $$7 = $$0.readInt();
      int $$8 = $$0.readInt();
      float $$9 = $$0.readFloat();
      int $$10 = $$0.readInt();
      boolean $$11 = $$0.readBoolean();
      cvx $$12 = new cvx($$1, $$3, $$2, $$5, $$6, $$7, $$9, $$10, $$11);
      if ($$4) {
         $$12.r();
      }

      $$12.b($$8);
      return $$12;
   }
}
