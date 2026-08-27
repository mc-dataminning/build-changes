import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cbm extends cal implements bpw<cbm.b> {
   public static final String b = "BucketVariantTag";
   private static final aii<Integer> d = ail.a(cbm.class, aik.b);
   public static final List<cbm.d> c = List.of(
      new cbm.d(cbm.b.h, cog.b, cog.h),
      new cbm.d(cbm.b.g, cog.h, cog.h),
      new cbm.d(cbm.b.g, cog.h, cog.l),
      new cbm.d(cbm.b.l, cog.a, cog.h),
      new cbm.d(cbm.b.b, cog.l, cog.h),
      new cbm.d(cbm.b.a, cog.b, cog.a),
      new cbm.d(cbm.b.f, cog.g, cog.d),
      new cbm.d(cbm.b.j, cog.k, cog.e),
      new cbm.d(cbm.b.l, cog.a, cog.o),
      new cbm.d(cbm.b.f, cog.a, cog.e),
      new cbm.d(cbm.b.i, cog.a, cog.h),
      new cbm.d(cbm.b.l, cog.a, cog.b),
      new cbm.d(cbm.b.d, cog.j, cog.g),
      new cbm.d(cbm.b.e, cog.f, cog.d),
      new cbm.d(cbm.b.k, cog.o, cog.a),
      new cbm.d(cbm.b.c, cog.h, cog.o),
      new cbm.d(cbm.b.j, cog.o, cog.a),
      new cbm.d(cbm.b.g, cog.a, cog.e),
      new cbm.d(cbm.b.a, cog.o, cog.a),
      new cbm.d(cbm.b.b, cog.h, cog.a),
      new cbm.d(cbm.b.d, cog.j, cog.e),
      new cbm.d(cbm.b.g, cog.e, cog.e)
   );
   private boolean e = true;

   public cbm(bol<? extends cbm> $$0, cwe $$1) {
      super($$0, $$1);
   }

   public static String c(int $$0) {
      return "entity.minecraft.tropical_fish.predefined." + $$0;
   }

   static int a(cbm.b $$0, cog $$1, cog $$2) {
      return $$0.b() & 65535 | ($$1.a() & 0xFF) << 16 | ($$2.a() & 0xFF) << 24;
   }

   public static cog t(int $$0) {
      return cog.a($$0 >> 16 & 0xFF);
   }

   public static cog u(int $$0) {
      return cog.a($$0 >> 24 & 0xFF);
   }

   public static cbm.b v(int $$0) {
      return cbm.b.a($$0 & 65535);
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(d, 0);
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
      $$0.a("Variant", this.gx());
   }

   @Override
   public void a(sy $$0) {
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

   private int gx() {
      return this.am.b(d);
   }

   public cog gu() {
      return t(this.gx());
   }

   public cog gv() {
      return u(this.gx());
   }

   public cbm.b gw() {
      return v(this.gx());
   }

   public void a(cbm.b $$0) {
      int $$1 = this.gx();
      cog $$2 = t($$1);
      cog $$3 = u($$1);
      this.w(a($$0, $$2, $$3));
   }

   @Override
   public void n(cpq $$0) {
      super.n($$0);
      sy $$1 = $$0.x();
      $$1.a("BucketVariantTag", this.gx());
   }

   @Override
   public cpq b() {
      return new cpq(cpt.qH);
   }

   @Override
   protected ato y() {
      return atp.zf;
   }

   @Override
   protected ato n_() {
      return atp.zg;
   }

   @Override
   protected ato d(bne $$0) {
      return atp.zi;
   }

   @Override
   protected ato gm() {
      return atp.zh;
   }

   @Override
   public void c(sy $$0) {
      super.c($$0);
      if ($$0.b("BucketVariantTag", 3)) {
         this.w($$0.h("BucketVariantTag"));
      }
   }

   @Nullable
   @Override
   public bpp a(cwt $$0, bmj $$1, bpb $$2, @Nullable bpp $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      awt $$4 = $$0.F_();
      cbm.d $$6;
      if ($$3 instanceof cbm.c $$5) {
         $$6 = $$5.b;
      } else if ((double)$$4.i() < 0.9) {
         $$6 = ac.a(c, $$4);
         $$3 = new cbm.c(this, $$6);
      } else {
         this.e = false;
         cbm.b[] $$8 = cbm.b.values();
         cog[] $$9 = cog.values();
         cbm.b $$10 = ac.a($$8, $$4);
         cog $$11 = ac.a($$9, $$4);
         cog $$12 = ac.a($$9, $$4);
         $$6 = new cbm.d($$10, $$11, $$12);
      }

      this.w($$6.a());
      return $$3;
   }

   public static boolean b(bol<cbm> $$0, cwf $$1, bpb $$2, ib $$3, awt $$4) {
      return $$1.b_($$3.d()).a(auj.a) && $$1.a_($$3.c()).a(czh.G) && ($$1.t($$3).a(aud.an) || cbo.c($$0, $$1, $$2, $$3, $$4));
   }

   public static enum a {
      a(0),
      b(1);

      final int c;

      private a(int $$0) {
         this.c = $$0;
      }
   }

   public static enum b implements axg {
      a("kob", cbm.a.a, 0),
      b("sunstreak", cbm.a.a, 1),
      c("snooper", cbm.a.a, 2),
      d("dasher", cbm.a.a, 3),
      e("brinely", cbm.a.a, 4),
      f("spotty", cbm.a.a, 5),
      g("flopper", cbm.a.b, 0),
      h("stripey", cbm.a.b, 1),
      i("glitter", cbm.a.b, 2),
      j("blockfish", cbm.a.b, 3),
      k("betty", cbm.a.b, 4),
      l("clayfish", cbm.a.b, 5);

      public static final Codec<cbm.b> m = axg.a(cbm.b::values);
      private static final IntFunction<cbm.b> n = ave.a(cbm.b::b, values(), a);
      private final String o;
      private final vs p;
      private final cbm.a q;
      private final int r;

      private b(String $$0, cbm.a $$1, int $$2) {
         this.o = $$0;
         this.q = $$1;
         this.r = $$1.c | $$2 << 8;
         this.p = vs.c("entity.minecraft.tropical_fish.type." + this.o);
      }

      public static cbm.b a(int $$0) {
         return n.apply($$0);
      }

      public cbm.a a() {
         return this.q;
      }

      public int b() {
         return this.r;
      }

      @Override
      public String c() {
         return this.o;
      }

      public vs d() {
         return this.p;
      }
   }

   static class c extends cal.a {
      final cbm.d b;

      c(cbm $$0, cbm.d $$1) {
         super($$0);
         this.b = $$1;
      }
   }

   public static record d(cbm.b a, cog b, cog c) {
      public int a() {
         return cbm.a(this.a, this.b, this.c);
      }

      public cbm.b b() {
         return this.a;
      }

      public cog c() {
         return this.b;
      }

      public cog d() {
         return this.c;
      }
   }
}
