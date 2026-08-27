import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class byy extends bxx implements bnj<byy.b> {
   public static final String b = "BucketVariantTag";
   private static final agm<Integer> d = agp.a(byy.class, ago.b);
   public static final List<byy.d> c = List.of(
      new byy.d(byy.b.h, clm.b, clm.h),
      new byy.d(byy.b.g, clm.h, clm.h),
      new byy.d(byy.b.g, clm.h, clm.l),
      new byy.d(byy.b.l, clm.a, clm.h),
      new byy.d(byy.b.b, clm.l, clm.h),
      new byy.d(byy.b.a, clm.b, clm.a),
      new byy.d(byy.b.f, clm.g, clm.d),
      new byy.d(byy.b.j, clm.k, clm.e),
      new byy.d(byy.b.l, clm.a, clm.o),
      new byy.d(byy.b.f, clm.a, clm.e),
      new byy.d(byy.b.i, clm.a, clm.h),
      new byy.d(byy.b.l, clm.a, clm.b),
      new byy.d(byy.b.d, clm.j, clm.g),
      new byy.d(byy.b.e, clm.f, clm.d),
      new byy.d(byy.b.k, clm.o, clm.a),
      new byy.d(byy.b.c, clm.h, clm.o),
      new byy.d(byy.b.j, clm.o, clm.a),
      new byy.d(byy.b.g, clm.a, clm.e),
      new byy.d(byy.b.a, clm.o, clm.a),
      new byy.d(byy.b.b, clm.h, clm.a),
      new byy.d(byy.b.d, clm.j, clm.e),
      new byy.d(byy.b.g, clm.e, clm.e)
   );
   private boolean e = true;

   public byy(blz<? extends byy> $$0, ctp $$1) {
      super($$0, $$1);
   }

   public static String c(int $$0) {
      return "entity.minecraft.tropical_fish.predefined." + $$0;
   }

   static int a(byy.b $$0, clm $$1, clm $$2) {
      return $$0.b() & 65535 | ($$1.a() & 0xFF) << 16 | ($$2.a() & 0xFF) << 24;
   }

   public static clm s(int $$0) {
      return clm.a($$0 >> 16 & 0xFF);
   }

   public static clm t(int $$0) {
      return clm.a($$0 >> 24 & 0xFF);
   }

   public static byy.b u(int $$0) {
      return byy.b.a($$0 & 65535);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(d, 0);
   }

   @Override
   public void b(sn $$0) {
      super.b($$0);
      $$0.a("Variant", this.gq());
   }

   @Override
   public void a(sn $$0) {
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

   private int gq() {
      return this.an.b(d);
   }

   public clm gn() {
      return s(this.gq());
   }

   public clm go() {
      return t(this.gq());
   }

   public byy.b gp() {
      return u(this.gq());
   }

   public void a(byy.b $$0) {
      int $$1 = this.gq();
      clm $$2 = s($$1);
      clm $$3 = t($$1);
      this.v(a($$0, $$2, $$3));
   }

   @Override
   public void l(cmy $$0) {
      super.l($$0);
      sn $$1 = $$0.w();
      $$1.a("BucketVariantTag", this.gq());
   }

   @Override
   public cmy b() {
      return new cmy(cnb.qF);
   }

   @Override
   protected arr y() {
      return ars.yP;
   }

   @Override
   protected arr n_() {
      return ars.yQ;
   }

   @Override
   protected arr d(bkt $$0) {
      return ars.yS;
   }

   @Override
   protected arr gf() {
      return ars.yR;
   }

   @Nullable
   @Override
   public bne a(cue $$0, bjz $$1, bmp $$2, @Nullable bne $$3, @Nullable sn $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      if ($$2 == bmp.l && $$4 != null && $$4.b("BucketVariantTag", 3)) {
         this.v($$4.h("BucketVariantTag"));
         return $$3;
      } else {
         auv $$5 = $$0.F_();
         byy.d $$7;
         if ($$3 instanceof byy.c $$6) {
            $$7 = $$6.b;
         } else if ((double)$$5.i() < 0.9) {
            $$7 = ac.a(c, $$5);
            $$3 = new byy.c(this, $$7);
         } else {
            this.e = false;
            byy.b[] $$9 = byy.b.values();
            clm[] $$10 = clm.values();
            byy.b $$11 = ac.a($$9, $$5);
            clm $$12 = ac.a($$10, $$5);
            clm $$13 = ac.a($$10, $$5);
            $$7 = new byy.d($$11, $$12, $$13);
         }

         this.v($$7.a());
         return $$3;
      }
   }

   public static boolean b(blz<byy> $$0, ctq $$1, bmp $$2, hx $$3, auv $$4) {
      return $$1.b_($$3.d()).a(asm.a) && $$1.a_($$3.c()).a(cws.G) && ($$1.t($$3).a(asg.an) || bza.c($$0, $$1, $$2, $$3, $$4));
   }

   public static enum a {
      a(0),
      b(1);

      final int c;

      private a(int $$0) {
         this.c = $$0;
      }
   }

   public static enum b implements avk {
      a("kob", byy.a.a, 0),
      b("sunstreak", byy.a.a, 1),
      c("snooper", byy.a.a, 2),
      d("dasher", byy.a.a, 3),
      e("brinely", byy.a.a, 4),
      f("spotty", byy.a.a, 5),
      g("flopper", byy.a.b, 0),
      h("stripey", byy.a.b, 1),
      i("glitter", byy.a.b, 2),
      j("blockfish", byy.a.b, 3),
      k("betty", byy.a.b, 4),
      l("clayfish", byy.a.b, 5);

      public static final Codec<byy.b> m = avk.a(byy.b::values);
      private static final IntFunction<byy.b> n = atg.a(byy.b::b, values(), a);
      private final String o;
      private final vf p;
      private final byy.a q;
      private final int r;

      private b(String $$0, byy.a $$1, int $$2) {
         this.o = $$0;
         this.q = $$1;
         this.r = $$1.c | $$2 << 8;
         this.p = vf.c("entity.minecraft.tropical_fish.type." + this.o);
      }

      public static byy.b a(int $$0) {
         return n.apply($$0);
      }

      public byy.a a() {
         return this.q;
      }

      public int b() {
         return this.r;
      }

      @Override
      public String c() {
         return this.o;
      }

      public vf d() {
         return this.p;
      }
   }

   static class c extends bxx.a {
      final byy.d b;

      c(byy $$0, byy.d $$1) {
         super($$0);
         this.b = $$1;
      }
   }

   public static record d(byy.b a, clm b, clm c) {
      public int a() {
         return byy.a(this.a, this.b, this.c);
      }

      public byy.b b() {
         return this.a;
      }

      public clm c() {
         return this.b;
      }

      public clm d() {
         return this.c;
      }
   }
}
