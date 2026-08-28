import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dav {
   public static final Codec<dav> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dat.a.fieldOf("buy").forGetter($$0x -> $$0x.c),
               dat.a.lenientOptionalFieldOf("buyB").forGetter($$0x -> $$0x.d),
               cuo.b.fieldOf("sell").forGetter($$0x -> $$0x.e),
               Codec.INT.lenientOptionalFieldOf("uses", 0).forGetter($$0x -> $$0x.f),
               Codec.INT.lenientOptionalFieldOf("maxUses", 4).forGetter($$0x -> $$0x.g),
               Codec.BOOL.lenientOptionalFieldOf("rewardExp", true).forGetter($$0x -> $$0x.h),
               Codec.INT.lenientOptionalFieldOf("specialPrice", 0).forGetter($$0x -> $$0x.i),
               Codec.INT.lenientOptionalFieldOf("demand", 0).forGetter($$0x -> $$0x.j),
               Codec.FLOAT.lenientOptionalFieldOf("priceMultiplier", 0.0F).forGetter($$0x -> $$0x.k),
               Codec.INT.lenientOptionalFieldOf("xp", 1).forGetter($$0x -> $$0x.l)
            )
            .apply($$0, dav::new)
   );
   public static final zm<wz, dav> b = zm.a(dav::a, dav::a);
   private final dat c;
   private final Optional<dat> d;
   private final cuo e;
   private int f;
   private final int g;
   private final boolean h;
   private int i;
   private int j;
   private final float k;
   private final int l;

   private dav(dat $$0, Optional<dat> $$1, cuo $$2, int $$3, int $$4, boolean $$5, int $$6, int $$7, float $$8, int $$9) {
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

   public dav(dat $$0, cuo $$1, int $$2, int $$3, float $$4) {
      this($$0, Optional.empty(), $$1, $$2, $$3, $$4);
   }

   public dav(dat $$0, Optional<dat> $$1, cuo $$2, int $$3, int $$4, float $$5) {
      this($$0, $$1, $$2, 0, $$3, $$4, $$5);
   }

   public dav(dat $$0, Optional<dat> $$1, cuo $$2, int $$3, int $$4, int $$5, float $$6) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, 0);
   }

   public dav(dat $$0, Optional<dat> $$1, cuo $$2, int $$3, int $$4, int $$5, float $$6, int $$7) {
      this($$0, $$1, $$2, $$3, $$4, true, 0, $$7, $$6, $$5);
   }

   private dav(dav $$0) {
      this($$0.c, $$0.d, $$0.e.s(), $$0.f, $$0.g, $$0.h, $$0.i, $$0.j, $$0.k, $$0.l);
   }

   public cuo a() {
      return this.c.d();
   }

   public cuo b() {
      return this.c.d().c(this.a(this.c));
   }

   private int a(dat $$0) {
      int $$1 = $$0.b();
      int $$2 = Math.max(0, ayy.d((float)($$1 * this.j) * this.k));
      return ayy.a($$1 + $$2 + this.i, 1, $$0.d().j());
   }

   public cuo c() {
      return this.d.map(dat::d).orElse(cuo.l);
   }

   public dat d() {
      return this.c;
   }

   public Optional<dat> e() {
      return this.d;
   }

   public cuo f() {
      return this.e;
   }

   public void g() {
      this.j = this.j + this.f - (this.g - this.f);
   }

   public cuo h() {
      return this.e.s();
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

   public boolean a(cuo $$0, cuo $$1) {
      if (!this.c.a($$0) || $$0.I() < this.a(this.c)) {
         return false;
      } else {
         return !this.d.isPresent() ? $$1.e() : this.d.get().a($$1) && $$1.I() >= this.d.get().b();
      }
   }

   public boolean b(cuo $$0, cuo $$1) {
      if (!this.a($$0, $$1)) {
         return false;
      } else {
         $$0.h(this.b().I());
         if (!this.c().e()) {
            $$1.h(this.c().I());
         }

         return true;
      }
   }

   public dav v() {
      return new dav(this);
   }

   private static void a(wz $$0, dav $$1) {
      dat.b.encode($$0, $$1.d());
      cuo.i.encode($$0, $$1.f());
      dat.c.encode($$0, $$1.e());
      $$0.a($$1.r());
      $$0.p($$1.i());
      $$0.p($$1.k());
      $$0.p($$1.q());
      $$0.p($$1.o());
      $$0.a($$1.p());
      $$0.p($$1.m());
   }

   public static dav a(wz $$0) {
      dat $$1 = dat.b.decode($$0);
      cuo $$2 = cuo.i.decode($$0);
      Optional<dat> $$3 = dat.c.decode($$0);
      boolean $$4 = $$0.readBoolean();
      int $$5 = $$0.readInt();
      int $$6 = $$0.readInt();
      int $$7 = $$0.readInt();
      int $$8 = $$0.readInt();
      float $$9 = $$0.readFloat();
      int $$10 = $$0.readInt();
      dav $$11 = new dav($$1, $$3, $$2, $$5, $$6, $$7, $$9, $$10);
      if ($$4) {
         $$11.s();
      }

      $$11.b($$8);
      return $$11;
   }
}
