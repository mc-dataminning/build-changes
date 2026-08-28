import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dfd {
   public static final Codec<dfd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dfb.a.fieldOf("buy").forGetter($$0x -> $$0x.c),
               dfb.a.lenientOptionalFieldOf("buyB").forGetter($$0x -> $$0x.d),
               cwn.a.fieldOf("sell").forGetter($$0x -> $$0x.e),
               Codec.INT.lenientOptionalFieldOf("uses", 0).forGetter($$0x -> $$0x.f),
               Codec.INT.lenientOptionalFieldOf("maxUses", 4).forGetter($$0x -> $$0x.g),
               Codec.BOOL.lenientOptionalFieldOf("rewardExp", true).forGetter($$0x -> $$0x.h),
               Codec.INT.lenientOptionalFieldOf("specialPrice", 0).forGetter($$0x -> $$0x.i),
               Codec.INT.lenientOptionalFieldOf("demand", 0).forGetter($$0x -> $$0x.j),
               Codec.FLOAT.lenientOptionalFieldOf("priceMultiplier", 0.0F).forGetter($$0x -> $$0x.k),
               Codec.INT.lenientOptionalFieldOf("xp", 1).forGetter($$0x -> $$0x.l)
            )
            .apply($$0, dfd::new)
   );
   public static final ym<vz, dfd> b = ym.a(dfd::a, dfd::a);
   private final dfb c;
   private final Optional<dfb> d;
   private final cwn e;
   private int f;
   private final int g;
   private final boolean h;
   private int i;
   private int j;
   private final float k;
   private final int l;

   private dfd(dfb $$0, Optional<dfb> $$1, cwn $$2, int $$3, int $$4, boolean $$5, int $$6, int $$7, float $$8, int $$9) {
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

   public dfd(dfb $$0, cwn $$1, int $$2, int $$3, float $$4) {
      this($$0, Optional.empty(), $$1, $$2, $$3, $$4);
   }

   public dfd(dfb $$0, Optional<dfb> $$1, cwn $$2, int $$3, int $$4, float $$5) {
      this($$0, $$1, $$2, 0, $$3, $$4, $$5);
   }

   public dfd(dfb $$0, Optional<dfb> $$1, cwn $$2, int $$3, int $$4, int $$5, float $$6) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, 0);
   }

   public dfd(dfb $$0, Optional<dfb> $$1, cwn $$2, int $$3, int $$4, int $$5, float $$6, int $$7) {
      this($$0, $$1, $$2, $$3, $$4, true, 0, $$7, $$6, $$5);
   }

   private dfd(dfd $$0) {
      this($$0.c, $$0.d, $$0.e.v(), $$0.f, $$0.g, $$0.h, $$0.i, $$0.j, $$0.k, $$0.l);
   }

   public cwn a() {
      return this.c.d();
   }

   public cwn b() {
      return this.c.d().c(this.a(this.c));
   }

   private int a(dfb $$0) {
      int $$1 = $$0.b();
      int $$2 = Math.max(0, ayy.d((float)($$1 * this.j) * this.k));
      return ayy.a($$1 + $$2 + this.i, 1, $$0.d().k());
   }

   public cwn c() {
      return this.d.map(dfb::d).orElse(cwn.j);
   }

   public dfb d() {
      return this.c;
   }

   public Optional<dfb> e() {
      return this.d;
   }

   public cwn f() {
      return this.e;
   }

   public void g() {
      this.j = this.j + this.f - (this.g - this.f);
   }

   public cwn h() {
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

   public boolean a(cwn $$0, cwn $$1) {
      if (!this.c.a($$0) || $$0.M() < this.a(this.c)) {
         return false;
      } else {
         return !this.d.isPresent() ? $$1.f() : this.d.get().a($$1) && $$1.M() >= this.d.get().b();
      }
   }

   public boolean b(cwn $$0, cwn $$1) {
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

   public dfd v() {
      return new dfd(this);
   }

   private static void a(vz $$0, dfd $$1) {
      dfb.b.encode($$0, $$1.d());
      cwn.h.encode($$0, $$1.f());
      dfb.c.encode($$0, $$1.e());
      $$0.a($$1.r());
      $$0.q($$1.i());
      $$0.q($$1.k());
      $$0.q($$1.q());
      $$0.q($$1.o());
      $$0.a($$1.p());
      $$0.q($$1.m());
   }

   public static dfd a(vz $$0) {
      dfb $$1 = dfb.b.decode($$0);
      cwn $$2 = cwn.h.decode($$0);
      Optional<dfb> $$3 = dfb.c.decode($$0);
      boolean $$4 = $$0.readBoolean();
      int $$5 = $$0.readInt();
      int $$6 = $$0.readInt();
      int $$7 = $$0.readInt();
      int $$8 = $$0.readInt();
      float $$9 = $$0.readFloat();
      int $$10 = $$0.readInt();
      dfd $$11 = new dfd($$1, $$3, $$2, $$5, $$6, $$7, $$9, $$10);
      if ($$4) {
         $$11.s();
      }

      $$11.b($$8);
      return $$11;
   }
}
