import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class bzc extends byb implements bnm<bzc.b> {
   public static final String b = "BucketVariantTag";
   private static final agn<Integer> d = agq.a(bzc.class, agp.b);
   public static final List<bzc.d> c = List.of(
      new bzc.d(bzc.b.h, clv.b, clv.h),
      new bzc.d(bzc.b.g, clv.h, clv.h),
      new bzc.d(bzc.b.g, clv.h, clv.l),
      new bzc.d(bzc.b.l, clv.a, clv.h),
      new bzc.d(bzc.b.b, clv.l, clv.h),
      new bzc.d(bzc.b.a, clv.b, clv.a),
      new bzc.d(bzc.b.f, clv.g, clv.d),
      new bzc.d(bzc.b.j, clv.k, clv.e),
      new bzc.d(bzc.b.l, clv.a, clv.o),
      new bzc.d(bzc.b.f, clv.a, clv.e),
      new bzc.d(bzc.b.i, clv.a, clv.h),
      new bzc.d(bzc.b.l, clv.a, clv.b),
      new bzc.d(bzc.b.d, clv.j, clv.g),
      new bzc.d(bzc.b.e, clv.f, clv.d),
      new bzc.d(bzc.b.k, clv.o, clv.a),
      new bzc.d(bzc.b.c, clv.h, clv.o),
      new bzc.d(bzc.b.j, clv.o, clv.a),
      new bzc.d(bzc.b.g, clv.a, clv.e),
      new bzc.d(bzc.b.a, clv.o, clv.a),
      new bzc.d(bzc.b.b, clv.h, clv.a),
      new bzc.d(bzc.b.d, clv.j, clv.e),
      new bzc.d(bzc.b.g, clv.e, clv.e)
   );
   private boolean e = true;

   public bzc(bmc<? extends bzc> $$0, ctx $$1) {
      super($$0, $$1);
   }

   public static String c(int $$0) {
      return "entity.minecraft.tropical_fish.predefined." + $$0;
   }

   static int a(bzc.b $$0, clv $$1, clv $$2) {
      return $$0.b() & 65535 | ($$1.a() & 0xFF) << 16 | ($$2.a() & 0xFF) << 24;
   }

   public static clv s(int $$0) {
      return clv.a($$0 >> 16 & 0xFF);
   }

   public static clv t(int $$0) {
      return clv.a($$0 >> 24 & 0xFF);
   }

   public static bzc.b u(int $$0) {
      return bzc.b.a($$0 & 65535);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(d, 0);
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
      $$0.a("Variant", this.gr());
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      this.v($$0.h("Variant"));
   }

   private void v(int $$0) {
      this.an.b(d, $$0);
   }

   @Override
   public boolean d(int $$0) {
      return !this.e;
   }

   private int gr() {
      return this.an.b(d);
   }

   public clv go() {
      return s(this.gr());
   }

   public clv gp() {
      return t(this.gr());
   }

   public bzc.b gq() {
      return u(this.gr());
   }

   public void a(bzc.b $$0) {
      int $$1 = this.gr();
      clv $$2 = s($$1);
      clv $$3 = t($$1);
      this.v(a($$0, $$2, $$3));
   }

   @Override
   public void l(cng $$0) {
      super.l($$0);
      so $$1 = $$0.w();
      $$1.a("BucketVariantTag", this.gr());
   }

   @Override
   public cng b() {
      return new cng(cnj.qH);
   }

   @Override
   protected ars y() {
      return art.ze;
   }

   @Override
   protected ars n_() {
      return art.zf;
   }

   @Override
   protected ars d(bkv $$0) {
      return art.zh;
   }

   @Override
   protected ars gg() {
      return art.zg;
   }

   @Nullable
   @Override
   public bnh a(cum $$0, bka $$1, bms $$2, @Nullable bnh $$3, @Nullable so $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      if ($$2 == bms.l && $$4 != null && $$4.b("BucketVariantTag", 3)) {
         this.v($$4.h("BucketVariantTag"));
         return $$3;
      } else {
         auw $$5 = $$0.F_();
         bzc.d $$7;
         if ($$3 instanceof bzc.c $$6) {
            $$7 = $$6.b;
         } else if ((double)$$5.i() < 0.9) {
            $$7 = ac.a(c, $$5);
            $$3 = new bzc.c(this, $$7);
         } else {
            this.e = false;
            bzc.b[] $$9 = bzc.b.values();
            clv[] $$10 = clv.values();
            bzc.b $$11 = ac.a($$9, $$5);
            clv $$12 = ac.a($$10, $$5);
            clv $$13 = ac.a($$10, $$5);
            $$7 = new bzc.d($$11, $$12, $$13);
         }

         this.v($$7.a());
         return $$3;
      }
   }

   public static boolean b(bmc<bzc> $$0, cty $$1, bms $$2, hx $$3, auw $$4) {
      return $$1.b_($$3.d()).a(asn.a) && $$1.a_($$3.c()).a(cxa.G) && ($$1.t($$3).a(ash.an) || bze.c($$0, $$1, $$2, $$3, $$4));
   }

   public static enum a {
      a(0),
      b(1);

      final int c;

      private a(int $$0) {
         this.c = $$0;
      }
   }

   public static enum b implements avl {
      a("kob", bzc.a.a, 0),
      b("sunstreak", bzc.a.a, 1),
      c("snooper", bzc.a.a, 2),
      d("dasher", bzc.a.a, 3),
      e("brinely", bzc.a.a, 4),
      f("spotty", bzc.a.a, 5),
      g("flopper", bzc.a.b, 0),
      h("stripey", bzc.a.b, 1),
      i("glitter", bzc.a.b, 2),
      j("blockfish", bzc.a.b, 3),
      k("betty", bzc.a.b, 4),
      l("clayfish", bzc.a.b, 5);

      public static final Codec<bzc.b> m = avl.a(bzc.b::values);
      private static final IntFunction<bzc.b> n = ath.a(bzc.b::b, values(), a);
      private final String o;
      private final vg p;
      private final bzc.a q;
      private final int r;

      private b(String $$0, bzc.a $$1, int $$2) {
         this.o = $$0;
         this.q = $$1;
         this.r = $$1.c | $$2 << 8;
         this.p = vg.c("entity.minecraft.tropical_fish.type." + this.o);
      }

      public static bzc.b a(int $$0) {
         return n.apply($$0);
      }

      public bzc.a a() {
         return this.q;
      }

      public int b() {
         return this.r;
      }

      @Override
      public String c() {
         return this.o;
      }

      public vg d() {
         return this.p;
      }
   }

   static class c extends byb.a {
      final bzc.d b;

      c(bzc $$0, bzc.d $$1) {
         super($$0);
         this.b = $$1;
      }
   }

   public static record d(bzc.b a, clv b, clv c) {
      public int a() {
         return bzc.a(this.a, this.b, this.c);
      }

      public bzc.b b() {
         return this.a;
      }

      public clv c() {
         return this.b;
      }

      public clv d() {
         return this.c;
      }
   }
}
