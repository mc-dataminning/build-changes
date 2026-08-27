import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class cxv {
   public static final Codec<cxv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cxt.a.fieldOf("buy").forGetter($$0x -> $$0x.c),
               cxt.a.optionalFieldOf("buyB").forGetter($$0x -> $$0x.d),
               crj.a.fieldOf("sell").forGetter($$0x -> $$0x.e),
               Codec.INT.optionalFieldOf("uses", 0).forGetter($$0x -> $$0x.f),
               Codec.INT.optionalFieldOf("maxUses", 4).forGetter($$0x -> $$0x.g),
               Codec.BOOL.optionalFieldOf("rewardExp", true).forGetter($$0x -> $$0x.h),
               Codec.INT.optionalFieldOf("specialPrice", 0).forGetter($$0x -> $$0x.i),
               Codec.INT.optionalFieldOf("demand", 0).forGetter($$0x -> $$0x.j),
               Codec.FLOAT.optionalFieldOf("priceMultiplier", 0.0F).forGetter($$0x -> $$0x.k),
               Codec.INT.optionalFieldOf("xp", 1).forGetter($$0x -> $$0x.l)
            )
            .apply($$0, cxv::new)
   );
   public static final ye<vr, cxv> b = ye.a(cxv::a, cxv::a);
   private final cxt c;
   private final Optional<cxt> d;
   private final crj e;
   private int f;
   private final int g;
   private final boolean h;
   private int i;
   private int j;
   private final float k;
   private final int l;

   private cxv(cxt $$0, Optional<cxt> $$1, crj $$2, int $$3, int $$4, boolean $$5, int $$6, int $$7, float $$8, int $$9) {
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

   public cxv(cxt $$0, crj $$1, int $$2, int $$3, float $$4) {
      this($$0, Optional.empty(), $$1, $$2, $$3, $$4);
   }

   public cxv(cxt $$0, Optional<cxt> $$1, crj $$2, int $$3, int $$4, float $$5) {
      this($$0, $$1, $$2, 0, $$3, $$4, $$5);
   }

   public cxv(cxt $$0, Optional<cxt> $$1, crj $$2, int $$3, int $$4, int $$5, float $$6) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, 0);
   }

   public cxv(cxt $$0, Optional<cxt> $$1, crj $$2, int $$3, int $$4, int $$5, float $$6, int $$7) {
      this($$0, $$1, $$2, $$3, $$4, true, 0, $$7, $$6, $$5);
   }

   private cxv(cxv $$0) {
      this($$0.c, $$0.d, $$0.e.r(), $$0.f, $$0.g, $$0.h, $$0.i, $$0.j, $$0.k, $$0.l);
   }

   public crj a() {
      return this.c.d();
   }

   public crj b() {
      return this.c.d().c(this.a(this.c));
   }

   private int a(cxt $$0) {
      int $$1 = $$0.b();
      int $$2 = Math.max(0, axk.d((float)($$1 * this.j) * this.k));
      return axk.a($$1 + $$2 + this.i, 1, $$0.a().a().q());
   }

   public crj c() {
      return this.d.map(cxt::d).orElse(crj.i);
   }

   public cxt d() {
      return this.c;
   }

   public Optional<cxt> e() {
      return this.d;
   }

   public crj f() {
      return this.e;
   }

   public void g() {
      this.j = this.j + this.f - (this.g - this.f);
   }

   public crj h() {
      return this.e.r();
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

   public boolean a(crj $$0, crj $$1) {
      if (!this.c.a($$0) || $$0.G() < this.a(this.c)) {
         return false;
      } else {
         return !this.d.isPresent() ? $$1.d() : this.d.get().a($$1) && $$1.G() >= this.d.get().b();
      }
   }

   public boolean b(crj $$0, crj $$1) {
      if (!this.a($$0, $$1)) {
         return false;
      } else {
         $$0.g(this.b().G());
         if (!this.c().d()) {
            $$1.g(this.c().G());
         }

         return true;
      }
   }

   public cxv v() {
      return new cxv(this);
   }

   private static void a(vr $$0, cxv $$1) {
      cxt.b.encode($$0, $$1.d());
      crj.f.encode($$0, $$1.f());
      cxt.c.encode($$0, $$1.e());
      $$0.a($$1.r());
      $$0.p($$1.i());
      $$0.p($$1.k());
      $$0.p($$1.q());
      $$0.p($$1.o());
      $$0.a($$1.p());
      $$0.p($$1.m());
   }

   public static cxv a(vr $$0) {
      cxt $$1 = cxt.b.decode($$0);
      crj $$2 = crj.f.decode($$0);
      Optional<cxt> $$3 = cxt.c.decode($$0);
      boolean $$4 = $$0.readBoolean();
      int $$5 = $$0.readInt();
      int $$6 = $$0.readInt();
      int $$7 = $$0.readInt();
      int $$8 = $$0.readInt();
      float $$9 = $$0.readFloat();
      int $$10 = $$0.readInt();
      cxv $$11 = new cxv($$1, $$3, $$2, $$5, $$6, $$7, $$9, $$10);
      if ($$4) {
         $$11.s();
      }

      $$11.b($$8);
      return $$11;
   }
}
