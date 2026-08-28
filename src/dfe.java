import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dfe {
   public static final Codec<dfe> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dfc.a.fieldOf("buy").forGetter($$0x -> $$0x.c),
               dfc.a.lenientOptionalFieldOf("buyB").forGetter($$0x -> $$0x.d),
               cwo.a.fieldOf("sell").forGetter($$0x -> $$0x.e),
               Codec.INT.lenientOptionalFieldOf("uses", 0).forGetter($$0x -> $$0x.f),
               Codec.INT.lenientOptionalFieldOf("maxUses", 4).forGetter($$0x -> $$0x.g),
               Codec.BOOL.lenientOptionalFieldOf("rewardExp", true).forGetter($$0x -> $$0x.h),
               Codec.INT.lenientOptionalFieldOf("specialPrice", 0).forGetter($$0x -> $$0x.i),
               Codec.INT.lenientOptionalFieldOf("demand", 0).forGetter($$0x -> $$0x.j),
               Codec.FLOAT.lenientOptionalFieldOf("priceMultiplier", 0.0F).forGetter($$0x -> $$0x.k),
               Codec.INT.lenientOptionalFieldOf("xp", 1).forGetter($$0x -> $$0x.l)
            )
            .apply($$0, dfe::new)
   );
   public static final yn<wa, dfe> b = yn.a(dfe::a, dfe::a);
   private final dfc c;
   private final Optional<dfc> d;
   private final cwo e;
   private int f;
   private final int g;
   private final boolean h;
   private int i;
   private int j;
   private final float k;
   private final int l;

   private dfe(dfc $$0, Optional<dfc> $$1, cwo $$2, int $$3, int $$4, boolean $$5, int $$6, int $$7, float $$8, int $$9) {
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
   }

   public dfe(dfc $$0, cwo $$1, int $$2, int $$3, float $$4) {
      this($$0, Optional.empty(), $$1, $$2, $$3, $$4);
   }

   public dfe(dfc $$0, Optional<dfc> $$1, cwo $$2, int $$3, int $$4, float $$5) {
      this($$0, $$1, $$2, 0, $$3, $$4, $$5);
   }

   public dfe(dfc $$0, Optional<dfc> $$1, cwo $$2, int $$3, int $$4, int $$5, float $$6) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, 0);
   }

   public dfe(dfc $$0, Optional<dfc> $$1, cwo $$2, int $$3, int $$4, int $$5, float $$6, int $$7) {
      this($$0, $$1, $$2, $$3, $$4, true, 0, $$7, $$6, $$5);
   }

   private dfe(dfe $$0) {
      this($$0.c, $$0.d, $$0.e.v(), $$0.f, $$0.g, $$0.h, $$0.i, $$0.j, $$0.k, $$0.l);
   }

   public cwo a() {
      return this.c.d();
   }

   public cwo b() {
      return this.c.d().c(this.a(this.c));
   }

   private int a(dfc $$0) {
      int $$1 = $$0.b();
      int $$2 = Math.max(0, ayz.d((float)($$1 * this.j) * this.k));
      return ayz.a($$1 + $$2 + this.i, 1, $$0.d().k());
   }

   public cwo c() {
      return this.d.map(dfc::d).orElse(cwo.j);
   }

   public dfc d() {
      return this.c;
   }

   public Optional<dfc> e() {
      return this.d;
   }

   public cwo f() {
      return this.e;
   }

   public void g() {
      this.j = this.j + this.f - (this.g - this.f);
   }

   public cwo h() {
      return this.e.v();
   }

   public int i() {
      return this.f;
   }

   public void j() {
      this.f = 0;
   }

   public int k() {
      return this.g;
   }

   public void l() {
      this.f++;
   }

   public int m() {
      return this.j;
   }

   public void a(int $$0) {
      this.i += $$0;
   }

   public void n() {
      this.i = 0;
   }

   public int o() {
      return this.i;
   }

   public void b(int $$0) {
      this.i = $$0;
   }

   public float p() {
      return this.k;
   }

   public int q() {
      return this.l;
   }

   public boolean r() {
      return this.f >= this.g;
   }

   public void s() {
      this.f = this.g;
   }

   public boolean t() {
      return this.f > 0;
   }

   public boolean u() {
      return this.h;
   }

   public boolean a(cwo $$0, cwo $$1) {
      if (!this.c.a($$0) || $$0.M() < this.a(this.c)) {
         return false;
      } else {
         return !this.d.isPresent() ? $$1.f() : this.d.get().a($$1) && $$1.M() >= this.d.get().b();
      }
   }

   public boolean b(cwo $$0, cwo $$1) {
      if (!this.a($$0, $$1)) {
         return false;
      } else {
         $$0.h(this.b().M());
         if (!this.c().f()) {
            $$1.h(this.c().M());
         }

         return true;
      }
   }

   public dfe v() {
      return new dfe(this);
   }

   private static void a(wa $$0, dfe $$1) {
      dfc.b.encode($$0, $$1.d());
      cwo.h.encode($$0, $$1.f());
      dfc.c.encode($$0, $$1.e());
      $$0.a($$1.r());
      $$0.q($$1.i());
      $$0.q($$1.k());
      $$0.q($$1.q());
      $$0.q($$1.o());
      $$0.a($$1.p());
      $$0.q($$1.m());
   }

   public static dfe a(wa $$0) {
      dfc $$1 = dfc.b.decode($$0);
      cwo $$2 = cwo.h.decode($$0);
      Optional<dfc> $$3 = dfc.c.decode($$0);
      boolean $$4 = $$0.readBoolean();
      int $$5 = $$0.readInt();
      int $$6 = $$0.readInt();
      int $$7 = $$0.readInt();
      int $$8 = $$0.readInt();
      float $$9 = $$0.readFloat();
      int $$10 = $$0.readInt();
      dfe $$11 = new dfe($$1, $$3, $$2, $$5, $$6, $$7, $$9, $$10);
      if ($$4) {
         $$11.s();
      }

      $$11.b($$8);
      return $$11;
   }
}
