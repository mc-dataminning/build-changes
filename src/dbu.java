import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dbu {
   public static final Codec<dbu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dbs.a.fieldOf("buy").forGetter($$0x -> $$0x.c),
               dbs.a.lenientOptionalFieldOf("buyB").forGetter($$0x -> $$0x.d),
               cuq.b.fieldOf("sell").forGetter($$0x -> $$0x.e),
               Codec.INT.lenientOptionalFieldOf("uses", 0).forGetter($$0x -> $$0x.f),
               Codec.INT.lenientOptionalFieldOf("maxUses", 4).forGetter($$0x -> $$0x.g),
               Codec.BOOL.lenientOptionalFieldOf("rewardExp", true).forGetter($$0x -> $$0x.h),
               Codec.INT.lenientOptionalFieldOf("specialPrice", 0).forGetter($$0x -> $$0x.i),
               Codec.INT.lenientOptionalFieldOf("demand", 0).forGetter($$0x -> $$0x.j),
               Codec.FLOAT.lenientOptionalFieldOf("priceMultiplier", 0.0F).forGetter($$0x -> $$0x.k),
               Codec.INT.lenientOptionalFieldOf("xp", 1).forGetter($$0x -> $$0x.l)
            )
            .apply($$0, dbu::new)
   );
   public static final yx<wk, dbu> b = yx.a(dbu::a, dbu::a);
   private final dbs c;
   private final Optional<dbs> d;
   private final cuq e;
   private int f;
   private final int g;
   private final boolean h;
   private int i;
   private int j;
   private final float k;
   private final int l;

   private dbu(dbs $$0, Optional<dbs> $$1, cuq $$2, int $$3, int $$4, boolean $$5, int $$6, int $$7, float $$8, int $$9) {
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

   public dbu(dbs $$0, cuq $$1, int $$2, int $$3, float $$4) {
      this($$0, Optional.empty(), $$1, $$2, $$3, $$4);
   }

   public dbu(dbs $$0, Optional<dbs> $$1, cuq $$2, int $$3, int $$4, float $$5) {
      this($$0, $$1, $$2, 0, $$3, $$4, $$5);
   }

   public dbu(dbs $$0, Optional<dbs> $$1, cuq $$2, int $$3, int $$4, int $$5, float $$6) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, 0);
   }

   public dbu(dbs $$0, Optional<dbs> $$1, cuq $$2, int $$3, int $$4, int $$5, float $$6, int $$7) {
      this($$0, $$1, $$2, $$3, $$4, true, 0, $$7, $$6, $$5);
   }

   private dbu(dbu $$0) {
      this($$0.c, $$0.d, $$0.e.s(), $$0.f, $$0.g, $$0.h, $$0.i, $$0.j, $$0.k, $$0.l);
   }

   public cuq a() {
      return this.c.d();
   }

   public cuq b() {
      return this.c.d().c(this.a(this.c));
   }

   private int a(dbs $$0) {
      int $$1 = $$0.b();
      int $$2 = Math.max(0, ayo.d((float)($$1 * this.j) * this.k));
      return ayo.a($$1 + $$2 + this.i, 1, $$0.d().j());
   }

   public cuq c() {
      return this.d.map(dbs::d).orElse(cuq.l);
   }

   public dbs d() {
      return this.c;
   }

   public Optional<dbs> e() {
      return this.d;
   }

   public cuq f() {
      return this.e;
   }

   public void g() {
      this.j = this.j + this.f - (this.g - this.f);
   }

   public cuq h() {
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

   public boolean a(cuq $$0, cuq $$1) {
      if (!this.c.a($$0) || $$0.H() < this.a(this.c)) {
         return false;
      } else {
         return !this.d.isPresent() ? $$1.e() : this.d.get().a($$1) && $$1.H() >= this.d.get().b();
      }
   }

   public boolean b(cuq $$0, cuq $$1) {
      if (!this.a($$0, $$1)) {
         return false;
      } else {
         $$0.h(this.b().H());
         if (!this.c().e()) {
            $$1.h(this.c().H());
         }

         return true;
      }
   }

   public dbu v() {
      return new dbu(this);
   }

   private static void a(wk $$0, dbu $$1) {
      dbs.b.encode($$0, $$1.d());
      cuq.i.encode($$0, $$1.f());
      dbs.c.encode($$0, $$1.e());
      $$0.a($$1.r());
      $$0.p($$1.i());
      $$0.p($$1.k());
      $$0.p($$1.q());
      $$0.p($$1.o());
      $$0.a($$1.p());
      $$0.p($$1.m());
   }

   public static dbu a(wk $$0) {
      dbs $$1 = dbs.b.decode($$0);
      cuq $$2 = cuq.i.decode($$0);
      Optional<dbs> $$3 = dbs.c.decode($$0);
      boolean $$4 = $$0.readBoolean();
      int $$5 = $$0.readInt();
      int $$6 = $$0.readInt();
      int $$7 = $$0.readInt();
      int $$8 = $$0.readInt();
      float $$9 = $$0.readFloat();
      int $$10 = $$0.readInt();
      dbu $$11 = new dbu($$1, $$3, $$2, $$5, $$6, $$7, $$9, $$10);
      if ($$4) {
         $$11.s();
      }

      $$11.b($$8);
      return $$11;
   }
}
