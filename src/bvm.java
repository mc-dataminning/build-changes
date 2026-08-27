import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class bvm extends bul implements bjz<bvm.b> {
   public static final String b = "BucketVariantTag";
   private static final aec<Integer> d = aef.a(bvm.class, aee.b);
   public static final List<bvm.d> c = List.of(
      new bvm.d(bvm.b.h, cho.b, cho.h),
      new bvm.d(bvm.b.g, cho.h, cho.h),
      new bvm.d(bvm.b.g, cho.h, cho.l),
      new bvm.d(bvm.b.l, cho.a, cho.h),
      new bvm.d(bvm.b.b, cho.l, cho.h),
      new bvm.d(bvm.b.a, cho.b, cho.a),
      new bvm.d(bvm.b.f, cho.g, cho.d),
      new bvm.d(bvm.b.j, cho.k, cho.e),
      new bvm.d(bvm.b.l, cho.a, cho.o),
      new bvm.d(bvm.b.f, cho.a, cho.e),
      new bvm.d(bvm.b.i, cho.a, cho.h),
      new bvm.d(bvm.b.l, cho.a, cho.b),
      new bvm.d(bvm.b.d, cho.j, cho.g),
      new bvm.d(bvm.b.e, cho.f, cho.d),
      new bvm.d(bvm.b.k, cho.o, cho.a),
      new bvm.d(bvm.b.c, cho.h, cho.o),
      new bvm.d(bvm.b.j, cho.o, cho.a),
      new bvm.d(bvm.b.g, cho.a, cho.e),
      new bvm.d(bvm.b.a, cho.o, cho.a),
      new bvm.d(bvm.b.b, cho.h, cho.a),
      new bvm.d(bvm.b.d, cho.j, cho.e),
      new bvm.d(bvm.b.g, cho.e, cho.e)
   );
   private boolean e = true;

   public bvm(bip<? extends bvm> $$0, cpq $$1) {
      super($$0, $$1);
   }

   public static String c(int $$0) {
      return "entity.minecraft.tropical_fish.predefined." + $$0;
   }

   static int a(bvm.b $$0, cho $$1, cho $$2) {
      return $$0.b() & 65535 | ($$1.a() & 0xFF) << 16 | ($$2.a() & 0xFF) << 24;
   }

   public static cho s(int $$0) {
      return cho.a($$0 >> 16 & 0xFF);
   }

   public static cho t(int $$0) {
      return cho.a($$0 >> 24 & 0xFF);
   }

   public static bvm.b u(int $$0) {
      return bvm.b.a($$0 & 65535);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(d, 0);
   }

   @Override
   public void b(qu $$0) {
      super.b($$0);
      $$0.a("Variant", this.gm());
   }

   @Override
   public void a(qu $$0) {
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

   private int gm() {
      return this.an.b(d);
   }

   public cho gj() {
      return s(this.gm());
   }

   public cho gk() {
      return t(this.gm());
   }

   public bvm.b gl() {
      return u(this.gm());
   }

   public void a(bvm.b $$0) {
      int $$1 = this.gm();
      cho $$2 = s($$1);
      cho $$3 = t($$1);
      this.v(a($$0, $$2, $$3));
   }

   @Override
   public void l(cja $$0) {
      super.l($$0);
      qu $$1 = $$0.w();
      $$1.a("BucketVariantTag", this.gm());
   }

   @Override
   public cja b() {
      return new cja(cjd.pU);
   }

   @Override
   protected aoy r() {
      return aoz.xZ;
   }

   @Override
   protected aoy h_() {
      return aoz.ya;
   }

   @Override
   protected aoy d(bhj $$0) {
      return aoz.yc;
   }

   @Override
   protected aoy gb() {
      return aoz.yb;
   }

   @Nullable
   @Override
   public bju a(cqf $$0, bgr $$1, bjf $$2, @Nullable bju $$3, @Nullable qu $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      if ($$2 == bjf.l && $$4 != null && $$4.b("BucketVariantTag", 3)) {
         this.v($$4.h("BucketVariantTag"));
         return $$3;
      } else {
         arx $$5 = $$0.y_();
         bvm.d $$7;
         if ($$3 instanceof bvm.c $$6) {
            $$7 = $$6.b;
         } else if ((double)$$5.i() < 0.9) {
            $$7 = ac.a(c, $$5);
            $$3 = new bvm.c(this, $$7);
         } else {
            this.e = false;
            bvm.b[] $$9 = bvm.b.values();
            cho[] $$10 = cho.values();
            bvm.b $$11 = ac.a($$9, $$5);
            cho $$12 = ac.a($$10, $$5);
            cho $$13 = ac.a($$10, $$5);
            $$7 = new bvm.d($$11, $$12, $$13);
         }

         this.v($$7.a());
         return $$3;
      }
   }

   public static boolean b(bip<bvm> $$0, cpr $$1, bjf $$2, gw $$3, arx $$4) {
      return $$1.b_($$3.d()).a(apt.a) && $$1.a_($$3.c()).a(csr.G) && ($$1.s($$3).a(apn.am) || bvo.c($$0, $$1, $$2, $$3, $$4));
   }

   public static enum a {
      a(0),
      b(1);

      final int c;

      private a(int $$0) {
         this.c = $$0;
      }
   }

   public static enum b implements ask {
      a("kob", bvm.a.a, 0),
      b("sunstreak", bvm.a.a, 1),
      c("snooper", bvm.a.a, 2),
      d("dasher", bvm.a.a, 3),
      e("brinely", bvm.a.a, 4),
      f("spotty", bvm.a.a, 5),
      g("flopper", bvm.a.b, 0),
      h("stripey", bvm.a.b, 1),
      i("glitter", bvm.a.b, 2),
      j("blockfish", bvm.a.b, 3),
      k("betty", bvm.a.b, 4),
      l("clayfish", bvm.a.b, 5);

      public static final Codec<bvm.b> m = ask.a(bvm.b::values);
      private static final IntFunction<bvm.b> n = aqn.a(bvm.b::b, values(), a);
      private final String o;
      private final ti p;
      private final bvm.a q;
      private final int r;

      private b(String $$0, bvm.a $$1, int $$2) {
         this.o = $$0;
         this.q = $$1;
         this.r = $$1.c | $$2 << 8;
         this.p = ti.c("entity.minecraft.tropical_fish.type." + this.o);
      }

      public static bvm.b a(int $$0) {
         return n.apply($$0);
      }

      public bvm.a a() {
         return this.q;
      }

      public int b() {
         return this.r;
      }

      @Override
      public String c() {
         return this.o;
      }

      public ti d() {
         return this.p;
      }
   }

   static class c extends bul.a {
      final bvm.d b;

      c(bvm $$0, bvm.d $$1) {
         super($$0);
         this.b = $$1;
      }
   }

   public static record d(bvm.b a, cho b, cho c) {
      public int a() {
         return bvm.a(this.a, this.b, this.c);
      }

      public bvm.b b() {
         return this.a;
      }

      public cho c() {
         return this.b;
      }

      public cho d() {
         return this.c;
      }
   }
}
