import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cat extends bzs implements bpd<cat.b> {
   public static final String b = "BucketVariantTag";
   private static final aie<Integer> d = aih.a(cat.class, aig.b);
   public static final List<cat.d> c = List.of(
      new cat.d(cat.b.h, cnn.b, cnn.h),
      new cat.d(cat.b.g, cnn.h, cnn.h),
      new cat.d(cat.b.g, cnn.h, cnn.l),
      new cat.d(cat.b.l, cnn.a, cnn.h),
      new cat.d(cat.b.b, cnn.l, cnn.h),
      new cat.d(cat.b.a, cnn.b, cnn.a),
      new cat.d(cat.b.f, cnn.g, cnn.d),
      new cat.d(cat.b.j, cnn.k, cnn.e),
      new cat.d(cat.b.l, cnn.a, cnn.o),
      new cat.d(cat.b.f, cnn.a, cnn.e),
      new cat.d(cat.b.i, cnn.a, cnn.h),
      new cat.d(cat.b.l, cnn.a, cnn.b),
      new cat.d(cat.b.d, cnn.j, cnn.g),
      new cat.d(cat.b.e, cnn.f, cnn.d),
      new cat.d(cat.b.k, cnn.o, cnn.a),
      new cat.d(cat.b.c, cnn.h, cnn.o),
      new cat.d(cat.b.j, cnn.o, cnn.a),
      new cat.d(cat.b.g, cnn.a, cnn.e),
      new cat.d(cat.b.a, cnn.o, cnn.a),
      new cat.d(cat.b.b, cnn.h, cnn.a),
      new cat.d(cat.b.d, cnn.j, cnn.e),
      new cat.d(cat.b.g, cnn.e, cnn.e)
   );
   private boolean e = true;

   public cat(bnu<? extends cat> $$0, cvn $$1) {
      super($$0, $$1);
   }

   public static String c(int $$0) {
      return "entity.minecraft.tropical_fish.predefined." + $$0;
   }

   static int a(cat.b $$0, cnn $$1, cnn $$2) {
      return $$0.b() & 65535 | ($$1.a() & 0xFF) << 16 | ($$2.a() & 0xFF) << 24;
   }

   public static cnn t(int $$0) {
      return cnn.a($$0 >> 16 & 0xFF);
   }

   public static cnn u(int $$0) {
      return cnn.a($$0 >> 24 & 0xFF);
   }

   public static cat.b v(int $$0) {
      return cat.b.a($$0 & 65535);
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(d, 0);
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      $$0.a("Variant", this.gs());
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.w($$0.h("Variant"));
   }

   private void w(int $$0) {
      this.am.b(d, $$0);
   }

   @Override
   public boolean d(int $$0) {
      return !this.e;
   }

   private int gs() {
      return this.am.b(d);
   }

   public cnn gp() {
      return t(this.gs());
   }

   public cnn gq() {
      return u(this.gs());
   }

   public cat.b gr() {
      return v(this.gs());
   }

   public void a(cat.b $$0) {
      int $$1 = this.gs();
      cnn $$2 = t($$1);
      cnn $$3 = u($$1);
      this.w(a($$0, $$2, $$3));
   }

   @Override
   public void l(coz $$0) {
      super.l($$0);
      sw $$1 = $$0.x();
      $$1.a("BucketVariantTag", this.gs());
   }

   @Override
   public coz b() {
      return new coz(cpc.qH);
   }

   @Override
   protected atj y() {
      return atk.ze;
   }

   @Override
   protected atj n_() {
      return atk.zf;
   }

   @Override
   protected atj d(bmn $$0) {
      return atk.zh;
   }

   @Override
   protected atj gh() {
      return atk.zg;
   }

   @Nullable
   @Override
   public boy a(cwc $$0, bls $$1, bok $$2, @Nullable boy $$3, @Nullable sw $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      if ($$2 == bok.l && $$4 != null && $$4.b("BucketVariantTag", 3)) {
         this.w($$4.h("BucketVariantTag"));
         return $$3;
      } else {
         awo $$5 = $$0.F_();
         cat.d $$7;
         if ($$3 instanceof cat.c $$6) {
            $$7 = $$6.b;
         } else if ((double)$$5.i() < 0.9) {
            $$7 = ac.a(c, $$5);
            $$3 = new cat.c(this, $$7);
         } else {
            this.e = false;
            cat.b[] $$9 = cat.b.values();
            cnn[] $$10 = cnn.values();
            cat.b $$11 = ac.a($$9, $$5);
            cnn $$12 = ac.a($$10, $$5);
            cnn $$13 = ac.a($$10, $$5);
            $$7 = new cat.d($$11, $$12, $$13);
         }

         this.w($$7.a());
         return $$3;
      }
   }

   public static boolean b(bnu<cat> $$0, cvo $$1, bok $$2, hz $$3, awo $$4) {
      return $$1.b_($$3.d()).a(aue.a) && $$1.a_($$3.c()).a(cyq.G) && ($$1.t($$3).a(aty.an) || cav.c($$0, $$1, $$2, $$3, $$4));
   }

   public static enum a {
      a(0),
      b(1);

      final int c;

      private a(int $$0) {
         this.c = $$0;
      }
   }

   public static enum b implements axc {
      a("kob", cat.a.a, 0),
      b("sunstreak", cat.a.a, 1),
      c("snooper", cat.a.a, 2),
      d("dasher", cat.a.a, 3),
      e("brinely", cat.a.a, 4),
      f("spotty", cat.a.a, 5),
      g("flopper", cat.a.b, 0),
      h("stripey", cat.a.b, 1),
      i("glitter", cat.a.b, 2),
      j("blockfish", cat.a.b, 3),
      k("betty", cat.a.b, 4),
      l("clayfish", cat.a.b, 5);

      public static final Codec<cat.b> m = axc.a(cat.b::values);
      private static final IntFunction<cat.b> n = auz.a(cat.b::b, values(), a);
      private final String o;
      private final vq p;
      private final cat.a q;
      private final int r;

      private b(String $$0, cat.a $$1, int $$2) {
         this.o = $$0;
         this.q = $$1;
         this.r = $$1.c | $$2 << 8;
         this.p = vq.c("entity.minecraft.tropical_fish.type." + this.o);
      }

      public static cat.b a(int $$0) {
         return n.apply($$0);
      }

      public cat.a a() {
         return this.q;
      }

      public int b() {
         return this.r;
      }

      @Override
      public String c() {
         return this.o;
      }

      public vq d() {
         return this.p;
      }
   }

   static class c extends bzs.a {
      final cat.d b;

      c(cat $$0, cat.d $$1) {
         super($$0);
         this.b = $$1;
      }
   }

   public static record d(cat.b a, cnn b, cnn c) {
      public int a() {
         return cat.a(this.a, this.b, this.c);
      }

      public cat.b b() {
         return this.a;
      }

      public cnn c() {
         return this.b;
      }

      public cnn d() {
         return this.c;
      }
   }
}
