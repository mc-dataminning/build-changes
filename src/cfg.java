import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cfg extends cef implements btq<cfg.b> {
   public static final String b = "BucketVariantTag";
   private static final ajs<Integer> d = ajw.a(cfg.class, aju.b);
   public static final List<cfg.d> c = List.of(
      new cfg.d(cfg.b.h, csj.b, csj.h),
      new cfg.d(cfg.b.g, csj.h, csj.h),
      new cfg.d(cfg.b.g, csj.h, csj.l),
      new cfg.d(cfg.b.l, csj.a, csj.h),
      new cfg.d(cfg.b.b, csj.l, csj.h),
      new cfg.d(cfg.b.a, csj.b, csj.a),
      new cfg.d(cfg.b.f, csj.g, csj.d),
      new cfg.d(cfg.b.j, csj.k, csj.e),
      new cfg.d(cfg.b.l, csj.a, csj.o),
      new cfg.d(cfg.b.f, csj.a, csj.e),
      new cfg.d(cfg.b.i, csj.a, csj.h),
      new cfg.d(cfg.b.l, csj.a, csj.b),
      new cfg.d(cfg.b.d, csj.j, csj.g),
      new cfg.d(cfg.b.e, csj.f, csj.d),
      new cfg.d(cfg.b.k, csj.o, csj.a),
      new cfg.d(cfg.b.c, csj.h, csj.o),
      new cfg.d(cfg.b.j, csj.o, csj.a),
      new cfg.d(cfg.b.g, csj.a, csj.e),
      new cfg.d(cfg.b.a, csj.o, csj.a),
      new cfg.d(cfg.b.b, csj.h, csj.a),
      new cfg.d(cfg.b.d, csj.j, csj.e),
      new cfg.d(cfg.b.g, csj.e, csj.e)
   );
   private boolean e = true;

   public cfg(bsc<? extends cfg> $$0, daz $$1) {
      super($$0, $$1);
   }

   public static String c(int $$0) {
      return "entity.minecraft.tropical_fish.predefined." + $$0;
   }

   static int a(cfg.b $$0, csj $$1, csj $$2) {
      return $$0.b() & 65535 | ($$1.a() & 0xFF) << 16 | ($$2.a() & 0xFF) << 24;
   }

   public static csj t(int $$0) {
      return csj.a($$0 >> 16 & 0xFF);
   }

   public static csj u(int $$0) {
      return csj.a($$0 >> 24 & 0xFF);
   }

   public static cfg.b v(int $$0) {
      return cfg.b.a($$0 & 65535);
   }

   @Override
   protected void a(ajw.a $$0) {
      super.a($$0);
      $$0.a(d, 0);
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      $$0.a("Variant", this.gB());
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      this.w($$0.h("Variant"));
   }

   private void w(int $$0) {
      this.ao.a(d, $$0);
   }

   @Override
   public boolean d(int $$0) {
      return !this.e;
   }

   private int gB() {
      return this.ao.a(d);
   }

   public csj gy() {
      return t(this.gB());
   }

   public csj gz() {
      return u(this.gB());
   }

   public cfg.b gA() {
      return v(this.gB());
   }

   public void a(cfg.b $$0) {
      int $$1 = this.gB();
      csj $$2 = t($$1);
      csj $$3 = u($$1);
      this.w(a($$0, $$2, $$3));
   }

   @Override
   public void n(ctq $$0) {
      super.n($$0);
      cwf.a(kb.M, $$0, $$0x -> $$0x.a("BucketVariantTag", this.gB()));
   }

   @Override
   public ctq b() {
      return new ctq(ctt.qI);
   }

   @Override
   protected avh v() {
      return avi.zJ;
   }

   @Override
   protected avh o_() {
      return avi.zK;
   }

   @Override
   protected avh d(bqp $$0) {
      return avi.zM;
   }

   @Override
   protected avh gq() {
      return avi.zL;
   }

   @Override
   public void c(ud $$0) {
      super.c($$0);
      if ($$0.b("BucketVariantTag", 3)) {
         this.w($$0.h("BucketVariantTag"));
      }
   }

   @Nullable
   @Override
   public btj a(dbo $$0, bpu $$1, bsu $$2, @Nullable btj $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      aym $$4 = $$0.E_();
      cfg.d $$6;
      if ($$3 instanceof cfg.c $$5) {
         $$6 = $$5.b;
      } else if ((double)$$4.i() < 0.9) {
         $$6 = ac.a(c, $$4);
         $$3 = new cfg.c(this, $$6);
      } else {
         this.e = false;
         cfg.b[] $$8 = cfg.b.values();
         csj[] $$9 = csj.values();
         cfg.b $$10 = ac.a($$8, $$4);
         csj $$11 = ac.a($$9, $$4);
         csj $$12 = ac.a($$9, $$4);
         $$6 = new cfg.d($$10, $$11, $$12);
      }

      this.w($$6.a());
      return $$3;
   }

   public static boolean b(bsc<cfg> $$0, dba $$1, bsu $$2, io $$3, aym $$4) {
      return $$1.b_($$3.d()).a(awc.a) && $$1.a_($$3.c()).a(dec.G) && ($$1.t($$3).a(avw.an) || cfi.c($$0, $$1, $$2, $$3, $$4));
   }

   public static enum a {
      a(0),
      b(1);

      final int c;

      private a(int $$0) {
         this.c = $$0;
      }
   }

   public static enum b implements ayz {
      a("kob", cfg.a.a, 0),
      b("sunstreak", cfg.a.a, 1),
      c("snooper", cfg.a.a, 2),
      d("dasher", cfg.a.a, 3),
      e("brinely", cfg.a.a, 4),
      f("spotty", cfg.a.a, 5),
      g("flopper", cfg.a.b, 0),
      h("stripey", cfg.a.b, 1),
      i("glitter", cfg.a.b, 2),
      j("blockfish", cfg.a.b, 3),
      k("betty", cfg.a.b, 4),
      l("clayfish", cfg.a.b, 5);

      public static final Codec<cfg.b> m = ayz.a(cfg.b::values);
      private static final IntFunction<cfg.b> n = aww.a(cfg.b::b, values(), a);
      private final String o;
      private final wx p;
      private final cfg.a q;
      private final int r;

      private b(String $$0, cfg.a $$1, int $$2) {
         this.o = $$0;
         this.q = $$1;
         this.r = $$1.c | $$2 << 8;
         this.p = wx.c("entity.minecraft.tropical_fish.type." + this.o);
      }

      public static cfg.b a(int $$0) {
         return n.apply($$0);
      }

      public cfg.a a() {
         return this.q;
      }

      public int b() {
         return this.r;
      }

      @Override
      public String c() {
         return this.o;
      }

      public wx d() {
         return this.p;
      }
   }

   static class c extends cef.a {
      final cfg.d b;

      c(cfg $$0, cfg.d $$1) {
         super($$0);
         this.b = $$1;
      }
   }

   public static record d(cfg.b b, csj c, csj d) {
      public static final Codec<cfg.d> a = Codec.INT.xmap(cfg.d::new, cfg.d::a);

      public d(int $$0) {
         this(cfg.v($$0), cfg.t($$0), cfg.u($$0));
      }

      public int a() {
         return cfg.a(this.b, this.c, this.d);
      }
   }
}
