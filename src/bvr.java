import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class bvr extends buq implements bke<bvr.b> {
   public static final String b = "BucketVariantTag";
   private static final aef<Integer> d = aei.a(bvr.class, aeh.b);
   public static final List<bvr.d> c = List.of(
      new bvr.d(bvr.b.h, cht.b, cht.h),
      new bvr.d(bvr.b.g, cht.h, cht.h),
      new bvr.d(bvr.b.g, cht.h, cht.l),
      new bvr.d(bvr.b.l, cht.a, cht.h),
      new bvr.d(bvr.b.b, cht.l, cht.h),
      new bvr.d(bvr.b.a, cht.b, cht.a),
      new bvr.d(bvr.b.f, cht.g, cht.d),
      new bvr.d(bvr.b.j, cht.k, cht.e),
      new bvr.d(bvr.b.l, cht.a, cht.o),
      new bvr.d(bvr.b.f, cht.a, cht.e),
      new bvr.d(bvr.b.i, cht.a, cht.h),
      new bvr.d(bvr.b.l, cht.a, cht.b),
      new bvr.d(bvr.b.d, cht.j, cht.g),
      new bvr.d(bvr.b.e, cht.f, cht.d),
      new bvr.d(bvr.b.k, cht.o, cht.a),
      new bvr.d(bvr.b.c, cht.h, cht.o),
      new bvr.d(bvr.b.j, cht.o, cht.a),
      new bvr.d(bvr.b.g, cht.a, cht.e),
      new bvr.d(bvr.b.a, cht.o, cht.a),
      new bvr.d(bvr.b.b, cht.h, cht.a),
      new bvr.d(bvr.b.d, cht.j, cht.e),
      new bvr.d(bvr.b.g, cht.e, cht.e)
   );
   private boolean e = true;

   public bvr(biu<? extends bvr> $$0, cpv $$1) {
      super($$0, $$1);
   }

   public static String c(int $$0) {
      return "entity.minecraft.tropical_fish.predefined." + $$0;
   }

   static int a(bvr.b $$0, cht $$1, cht $$2) {
      return $$0.b() & 65535 | ($$1.a() & 0xFF) << 16 | ($$2.a() & 0xFF) << 24;
   }

   public static cht s(int $$0) {
      return cht.a($$0 >> 16 & 0xFF);
   }

   public static cht t(int $$0) {
      return cht.a($$0 >> 24 & 0xFF);
   }

   public static bvr.b u(int $$0) {
      return bvr.b.a($$0 & 65535);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(d, 0);
   }

   @Override
   public void b(qy $$0) {
      super.b($$0);
      $$0.a("Variant", this.gp());
   }

   @Override
   public void a(qy $$0) {
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

   private int gp() {
      return this.an.b(d);
   }

   public cht gm() {
      return s(this.gp());
   }

   public cht gn() {
      return t(this.gp());
   }

   public bvr.b go() {
      return u(this.gp());
   }

   public void a(bvr.b $$0) {
      int $$1 = this.gp();
      cht $$2 = s($$1);
      cht $$3 = t($$1);
      this.v(a($$0, $$2, $$3));
   }

   @Override
   public void l(cjf $$0) {
      super.l($$0);
      qy $$1 = $$0.w();
      $$1.a("BucketVariantTag", this.gp());
   }

   @Override
   public cjf b() {
      return new cjf(cji.pU);
   }

   @Override
   protected apd w() {
      return ape.xZ;
   }

   @Override
   protected apd l_() {
      return ape.ya;
   }

   @Override
   protected apd d(bho $$0) {
      return ape.yc;
   }

   @Override
   protected apd ge() {
      return ape.yb;
   }

   @Nullable
   @Override
   public bjz a(cqk $$0, bgw $$1, bjk $$2, @Nullable bjz $$3, @Nullable qy $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      if ($$2 == bjk.l && $$4 != null && $$4.b("BucketVariantTag", 3)) {
         this.v($$4.h("BucketVariantTag"));
         return $$3;
      } else {
         asc $$5 = $$0.D_();
         bvr.d $$7;
         if ($$3 instanceof bvr.c $$6) {
            $$7 = $$6.b;
         } else if ((double)$$5.i() < 0.9) {
            $$7 = ac.a(c, $$5);
            $$3 = new bvr.c(this, $$7);
         } else {
            this.e = false;
            bvr.b[] $$9 = bvr.b.values();
            cht[] $$10 = cht.values();
            bvr.b $$11 = ac.a($$9, $$5);
            cht $$12 = ac.a($$10, $$5);
            cht $$13 = ac.a($$10, $$5);
            $$7 = new bvr.d($$11, $$12, $$13);
         }

         this.v($$7.a());
         return $$3;
      }
   }

   public static boolean b(biu<bvr> $$0, cpw $$1, bjk $$2, gw $$3, asc $$4) {
      return $$1.b_($$3.d()).a(apy.a) && $$1.a_($$3.c()).a(csw.G) && ($$1.s($$3).a(aps.am) || bvt.c($$0, $$1, $$2, $$3, $$4));
   }

   public static enum a {
      a(0),
      b(1);

      final int c;

      private a(int $$0) {
         this.c = $$0;
      }
   }

   public static enum b implements asp {
      a("kob", bvr.a.a, 0),
      b("sunstreak", bvr.a.a, 1),
      c("snooper", bvr.a.a, 2),
      d("dasher", bvr.a.a, 3),
      e("brinely", bvr.a.a, 4),
      f("spotty", bvr.a.a, 5),
      g("flopper", bvr.a.b, 0),
      h("stripey", bvr.a.b, 1),
      i("glitter", bvr.a.b, 2),
      j("blockfish", bvr.a.b, 3),
      k("betty", bvr.a.b, 4),
      l("clayfish", bvr.a.b, 5);

      public static final Codec<bvr.b> m = asp.a(bvr.b::values);
      private static final IntFunction<bvr.b> n = aqs.a(bvr.b::b, values(), a);
      private final String o;
      private final tm p;
      private final bvr.a q;
      private final int r;

      private b(String $$0, bvr.a $$1, int $$2) {
         this.o = $$0;
         this.q = $$1;
         this.r = $$1.c | $$2 << 8;
         this.p = tm.c("entity.minecraft.tropical_fish.type." + this.o);
      }

      public static bvr.b a(int $$0) {
         return n.apply($$0);
      }

      public bvr.a a() {
         return this.q;
      }

      public int b() {
         return this.r;
      }

      @Override
      public String c() {
         return this.o;
      }

      public tm d() {
         return this.p;
      }
   }

   static class c extends buq.a {
      final bvr.d b;

      c(bvr $$0, bvr.d $$1) {
         super($$0);
         this.b = $$1;
      }
   }

   public static record d(bvr.b a, cht b, cht c) {
      public int a() {
         return bvr.a(this.a, this.b, this.c);
      }

      public bvr.b b() {
         return this.a;
      }

      public cht c() {
         return this.b;
      }

      public cht d() {
         return this.c;
      }
   }
}
