import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import org.joml.Vector3f;

public class bzt extends bzb implements byt, bzz {
   private static final adz<Boolean> d = aec.a(bzt.class, aeb.k);
   private static final int e = 40;
   private static final int bT = 1;
   private static final float bU = 0.6F;
   private static final int bV = 6;
   private static final float bW = 0.5F;
   private static final int bX = 40;
   private static final int bY = 15;
   private static final int bZ = 200;
   private static final float ca = 0.3F;
   private static final float cb = 0.4F;
   private int cc;
   protected static final ImmutableList<? extends btf<? extends bte<? super bzt>>> b = ImmutableList.of(btf.c, btf.d);
   protected static final ImmutableList<? extends bsa<?>> c = ImmutableList.of(bsa.g, bsa.h, bsa.k, bsa.l, bsa.n, bsa.m, bsa.E, bsa.t, bsa.o, bsa.p);

   public bzt(bim<? extends bzt> $$0, cpm $$1) {
      super($$0, $$1);
      this.bJ = 5;
   }

   @Override
   protected bjz.b<bzt> dN() {
      return bjz.a(c, b);
   }

   @Override
   protected bjz<?> a(Dynamic<?> $$0) {
      bjz<bzt> $$1 = this.dN().a($$0);
      a($$1);
      b($$1);
      c($$1);
      $$1.a(ImmutableSet.of(ccy.a));
      $$1.b(ccy.b);
      $$1.f();
      return $$1;
   }

   private static void a(bjz<bzt> $$0) {
      $$0.a(ccy.a, 0, ImmutableList.of(new blv(45, 90), new blz()));
   }

   private static void b(bjz<bzt> $$0) {
      $$0.a(
         ccy.b,
         10,
         ImmutableList.of(
            bnb.a(bzt::gb),
            bmp.a(8.0F, bgb.a(30, 60)),
            new bmm(ImmutableList.of(Pair.of(bmh.a(0.4F), 2), Pair.of(bmw.a(0.4F, 3), 2), Pair.of(new bla(30, 60), 1)))
         )
      );
   }

   private static void c(bjz<bzt> $$0) {
      $$0.a(ccy.k, 10, ImmutableList.of(bmu.a(1.0F), boc.a(bzt::q, blw.a(40)), boc.a(bzt::i_, blw.a(15)), bne.a()), bsa.o);
   }

   private Optional<? extends biy> gb() {
      return this.dM().c(bsa.h).orElse(bsc.a()).a(this::l);
   }

   private boolean l(biy $$0) {
      bim<?> $$1 = $$0.ag();
      return $$1 != bim.bo && $$1 != bim.u && bte.c(this, $$0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(d, false);
   }

   @Override
   public void a(adz<?> $$0) {
      super.a($$0);
      if (d.equals($$0)) {
         this.e_();
      }
   }

   public static bke.a p() {
      return bzb.gf().a(bkf.a, 40.0).a(bkf.d, 0.3F).a(bkf.c, 0.6F).a(bkf.g, 1.0).a(bkf.f, 6.0);
   }

   public boolean q() {
      return !this.i_();
   }

   @Override
   public boolean C(bii $$0) {
      if (!($$0 instanceof biy)) {
         return false;
      } else {
         this.cc = 10;
         this.dK().a(this, (byte)4);
         this.a(aow.AM, 1.0F, this.eV());
         return bzz.a(this, (biy)$$0);
      }
   }

   @Override
   public boolean a(cbn $$0) {
      return !this.fO();
   }

   @Override
   protected void e(biy $$0) {
      if (!this.i_()) {
         bzz.b(this, $$0);
      }
   }

   @Override
   protected Vector3f a(bii $$0, bij $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.09375F * $$2, 0.0F);
   }

   @Override
   public boolean a(bhg $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dK().B) {
         return false;
      } else if ($$2 && $$0.d() instanceof biy) {
         biy $$3 = (biy)$$0.d();
         if (this.c($$3) && !bks.a(this, $$3, 4.0)) {
            this.m($$3);
         }

         return $$2;
      } else {
         return $$2;
      }
   }

   private void m(biy $$0) {
      this.bz.b(bsa.E);
      this.bz.a(bsa.o, $$0, 200L);
   }

   @Override
   public bjz<bzt> dM() {
      return (bjz<bzt>)super.dM();
   }

   protected void t() {
      ccy $$0 = this.bz.g().orElse(null);
      this.bz.a(ImmutableList.of(ccy.k, ccy.b));
      ccy $$1 = this.bz.g().orElse(null);
      if ($$1 == ccy.k && $$0 != ccy.k) {
         this.ga();
      }

      this.v(this.bz.a(bsa.o));
   }

   @Override
   protected void V() {
      this.dK().ad().a("zoglinBrain");
      this.dM().a((akk)this.dK(), this);
      this.dK().ad().c();
      this.t();
   }

   @Override
   public void a(boolean $$0) {
      this.al().b(d, $$0);
      if (!this.dK().B && $$0) {
         this.a(bkf.f).a(0.5);
      }
   }

   @Override
   public boolean i_() {
      return this.al().b(d);
   }

   @Override
   public void b_() {
      if (this.cc > 0) {
         this.cc--;
      }

      super.b_();
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.cc = 10;
         this.a(aow.AM, 1.0F, this.eV());
      } else {
         super.b($$0);
      }
   }

   @Override
   public int fZ() {
      return this.cc;
   }

   @Override
   protected aov r() {
      if (this.dK().B) {
         return null;
      } else {
         return this.bz.a(bsa.o) ? aow.AL : aow.AK;
      }
   }

   @Override
   protected aov d(bhg $$0) {
      return aow.AO;
   }

   @Override
   protected aov h_() {
      return aow.AN;
   }

   @Override
   protected void b(gu $$0, dfa $$1) {
      this.a(aow.AP, 0.15F, 1.0F);
   }

   protected void ga() {
      this.a(aow.AL, 1.0F, this.eV());
   }

   @Override
   protected void T() {
      super.T();
      aav.a(this);
   }

   @Override
   public bjd eQ() {
      return bjd.b;
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      if (this.i_()) {
         $$0.a("IsBaby", true);
      }
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      if ($$0.q("IsBaby")) {
         this.a(true);
      }
   }
}
