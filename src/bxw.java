import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class bxw extends bwv implements bmj<bxw.b> {
   public static final String b = "BucketVariantTag";
   private static final afs<Integer> d = afv.a(bxw.class, afu.b);
   public static final List<bxw.d> c = List.of(
      new bxw.d(bxw.b.h, ckc.b, ckc.h),
      new bxw.d(bxw.b.g, ckc.h, ckc.h),
      new bxw.d(bxw.b.g, ckc.h, ckc.l),
      new bxw.d(bxw.b.l, ckc.a, ckc.h),
      new bxw.d(bxw.b.b, ckc.l, ckc.h),
      new bxw.d(bxw.b.a, ckc.b, ckc.a),
      new bxw.d(bxw.b.f, ckc.g, ckc.d),
      new bxw.d(bxw.b.j, ckc.k, ckc.e),
      new bxw.d(bxw.b.l, ckc.a, ckc.o),
      new bxw.d(bxw.b.f, ckc.a, ckc.e),
      new bxw.d(bxw.b.i, ckc.a, ckc.h),
      new bxw.d(bxw.b.l, ckc.a, ckc.b),
      new bxw.d(bxw.b.d, ckc.j, ckc.g),
      new bxw.d(bxw.b.e, ckc.f, ckc.d),
      new bxw.d(bxw.b.k, ckc.o, ckc.a),
      new bxw.d(bxw.b.c, ckc.h, ckc.o),
      new bxw.d(bxw.b.j, ckc.o, ckc.a),
      new bxw.d(bxw.b.g, ckc.a, ckc.e),
      new bxw.d(bxw.b.a, ckc.o, ckc.a),
      new bxw.d(bxw.b.b, ckc.h, ckc.a),
      new bxw.d(bxw.b.d, ckc.j, ckc.e),
      new bxw.d(bxw.b.g, ckc.e, ckc.e)
   );
   private boolean e = true;

   public bxw(bkz<? extends bxw> $$0, csf $$1) {
      super($$0, $$1);
   }

   public static String c(int $$0) {
      return "entity.minecraft.tropical_fish.predefined." + $$0;
   }

   static int a(bxw.b $$0, ckc $$1, ckc $$2) {
      return $$0.b() & 65535 | ($$1.a() & 0xFF) << 16 | ($$2.a() & 0xFF) << 24;
   }

   public static ckc s(int $$0) {
      return ckc.a($$0 >> 16 & 0xFF);
   }

   public static ckc t(int $$0) {
      return ckc.a($$0 >> 24 & 0xFF);
   }

   public static bxw.b u(int $$0) {
      return bxw.b.a($$0 & 65535);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(d, 0);
   }

   @Override
   public void b(sd $$0) {
      super.b($$0);
      $$0.a("Variant", this.gr());
   }

   @Override
   public void a(sd $$0) {
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

   public ckc go() {
      return s(this.gr());
   }

   public ckc gp() {
      return t(this.gr());
   }

   public bxw.b gq() {
      return u(this.gr());
   }

   public void a(bxw.b $$0) {
      int $$1 = this.gr();
      ckc $$2 = s($$1);
      ckc $$3 = t($$1);
      this.v(a($$0, $$2, $$3));
   }

   @Override
   public void l(clo $$0) {
      super.l($$0);
      sd $$1 = $$0.w();
      $$1.a("BucketVariantTag", this.gr());
   }

   @Override
   public clo b() {
      return new clo(clr.qF);
   }

   @Override
   protected aqu y() {
      return aqv.yu;
   }

   @Override
   protected aqu n_() {
      return aqv.yv;
   }

   @Override
   protected aqu d(bjt $$0) {
      return aqv.yx;
   }

   @Override
   protected aqu gg() {
      return aqv.yw;
   }

   @Nullable
   @Override
   public bme a(csu $$0, biz $$1, blp $$2, @Nullable bme $$3, @Nullable sd $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      if ($$2 == blp.l && $$4 != null && $$4.b("BucketVariantTag", 3)) {
         this.v($$4.h("BucketVariantTag"));
         return $$3;
      } else {
         atw $$5 = $$0.F_();
         bxw.d $$7;
         if ($$3 instanceof bxw.c $$6) {
            $$7 = $$6.b;
         } else if ((double)$$5.i() < 0.9) {
            $$7 = ac.a(c, $$5);
            $$3 = new bxw.c(this, $$7);
         } else {
            this.e = false;
            bxw.b[] $$9 = bxw.b.values();
            ckc[] $$10 = ckc.values();
            bxw.b $$11 = ac.a($$9, $$5);
            ckc $$12 = ac.a($$10, $$5);
            ckc $$13 = ac.a($$10, $$5);
            $$7 = new bxw.d($$11, $$12, $$13);
         }

         this.v($$7.a());
         return $$3;
      }
   }

   public static boolean b(bkz<bxw> $$0, csg $$1, blp $$2, hx $$3, atw $$4) {
      return $$1.b_($$3.d()).a(arp.a) && $$1.a_($$3.c()).a(cvh.G) && ($$1.s($$3).a(arj.am) || bxy.c($$0, $$1, $$2, $$3, $$4));
   }

   public static enum a {
      a(0),
      b(1);

      final int c;

      private a(int $$0) {
         this.c = $$0;
      }
   }

   public static enum b implements auk {
      a("kob", bxw.a.a, 0),
      b("sunstreak", bxw.a.a, 1),
      c("snooper", bxw.a.a, 2),
      d("dasher", bxw.a.a, 3),
      e("brinely", bxw.a.a, 4),
      f("spotty", bxw.a.a, 5),
      g("flopper", bxw.a.b, 0),
      h("stripey", bxw.a.b, 1),
      i("glitter", bxw.a.b, 2),
      j("blockfish", bxw.a.b, 3),
      k("betty", bxw.a.b, 4),
      l("clayfish", bxw.a.b, 5);

      public static final Codec<bxw.b> m = auk.a(bxw.b::values);
      private static final IntFunction<bxw.b> n = asj.a(bxw.b::b, values(), a);
      private final String o;
      private final uv p;
      private final bxw.a q;
      private final int r;

      private b(String $$0, bxw.a $$1, int $$2) {
         this.o = $$0;
         this.q = $$1;
         this.r = $$1.c | $$2 << 8;
         this.p = uv.c("entity.minecraft.tropical_fish.type." + this.o);
      }

      public static bxw.b a(int $$0) {
         return n.apply($$0);
      }

      public bxw.a a() {
         return this.q;
      }

      public int b() {
         return this.r;
      }

      @Override
      public String c() {
         return this.o;
      }

      public uv d() {
         return this.p;
      }
   }

   static class c extends bwv.a {
      final bxw.d b;

      c(bxw $$0, bxw.d $$1) {
         super($$0);
         this.b = $$1;
      }
   }

   public static record d(bxw.b a, ckc b, ckc c) {
      public int a() {
         return bxw.a(this.a, this.b, this.c);
      }

      public bxw.b b() {
         return this.a;
      }

      public ckc c() {
         return this.b;
      }

      public ckc d() {
         return this.c;
      }
   }
}
