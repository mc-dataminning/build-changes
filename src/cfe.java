import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cfe extends ced implements bto<cfe.b> {
   public static final String b = "BucketVariantTag";
   private static final ajr<Integer> d = ajv.a(cfe.class, ajt.b);
   public static final List<cfe.d> c = List.of(
      new cfe.d(cfe.b.h, csh.b, csh.h),
      new cfe.d(cfe.b.g, csh.h, csh.h),
      new cfe.d(cfe.b.g, csh.h, csh.l),
      new cfe.d(cfe.b.l, csh.a, csh.h),
      new cfe.d(cfe.b.b, csh.l, csh.h),
      new cfe.d(cfe.b.a, csh.b, csh.a),
      new cfe.d(cfe.b.f, csh.g, csh.d),
      new cfe.d(cfe.b.j, csh.k, csh.e),
      new cfe.d(cfe.b.l, csh.a, csh.o),
      new cfe.d(cfe.b.f, csh.a, csh.e),
      new cfe.d(cfe.b.i, csh.a, csh.h),
      new cfe.d(cfe.b.l, csh.a, csh.b),
      new cfe.d(cfe.b.d, csh.j, csh.g),
      new cfe.d(cfe.b.e, csh.f, csh.d),
      new cfe.d(cfe.b.k, csh.o, csh.a),
      new cfe.d(cfe.b.c, csh.h, csh.o),
      new cfe.d(cfe.b.j, csh.o, csh.a),
      new cfe.d(cfe.b.g, csh.a, csh.e),
      new cfe.d(cfe.b.a, csh.o, csh.a),
      new cfe.d(cfe.b.b, csh.h, csh.a),
      new cfe.d(cfe.b.d, csh.j, csh.e),
      new cfe.d(cfe.b.g, csh.e, csh.e)
   );
   private boolean e = true;

   public cfe(bsa<? extends cfe> $$0, dax $$1) {
      super($$0, $$1);
   }

   public static String c(int $$0) {
      return "entity.minecraft.tropical_fish.predefined." + $$0;
   }

   static int a(cfe.b $$0, csh $$1, csh $$2) {
      return $$0.b() & 65535 | ($$1.a() & 0xFF) << 16 | ($$2.a() & 0xFF) << 24;
   }

   public static csh t(int $$0) {
      return csh.a($$0 >> 16 & 0xFF);
   }

   public static csh u(int $$0) {
      return csh.a($$0 >> 24 & 0xFF);
   }

   public static cfe.b v(int $$0) {
      return cfe.b.a($$0 & 65535);
   }

   @Override
   protected void a(ajv.a $$0) {
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

   public csh gy() {
      return t(this.gB());
   }

   public csh gz() {
      return u(this.gB());
   }

   public cfe.b gA() {
      return v(this.gB());
   }

   public void a(cfe.b $$0) {
      int $$1 = this.gB();
      csh $$2 = t($$1);
      csh $$3 = u($$1);
      this.w(a($$0, $$2, $$3));
   }

   @Override
   public void n(cto $$0) {
      super.n($$0);
      cwd.a(kb.M, $$0, $$0x -> $$0x.a("BucketVariantTag", this.gB()));
   }

   @Override
   public cto b() {
      return new cto(ctr.qI);
   }

   @Override
   protected avg v() {
      return avh.zJ;
   }

   @Override
   protected avg o_() {
      return avh.zK;
   }

   @Override
   protected avg d(bqn $$0) {
      return avh.zM;
   }

   @Override
   protected avg gq() {
      return avh.zL;
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
   public bth a(dbm $$0, bps $$1, bss $$2, @Nullable bth $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      ayk $$4 = $$0.E_();
      cfe.d $$6;
      if ($$3 instanceof cfe.c $$5) {
         $$6 = $$5.b;
      } else if ((double)$$4.i() < 0.9) {
         $$6 = ac.a(c, $$4);
         $$3 = new cfe.c(this, $$6);
      } else {
         this.e = false;
         cfe.b[] $$8 = cfe.b.values();
         csh[] $$9 = csh.values();
         cfe.b $$10 = ac.a($$8, $$4);
         csh $$11 = ac.a($$9, $$4);
         csh $$12 = ac.a($$9, $$4);
         $$6 = new cfe.d($$10, $$11, $$12);
      }

      this.w($$6.a());
      return $$3;
   }

   public static boolean b(bsa<cfe> $$0, day $$1, bss $$2, io $$3, ayk $$4) {
      return $$1.b_($$3.d()).a(awb.a) && $$1.a_($$3.c()).a(dea.G) && ($$1.t($$3).a(avv.an) || cfg.c($$0, $$1, $$2, $$3, $$4));
   }

   public static enum a {
      a(0),
      b(1);

      final int c;

      private a(int $$0) {
         this.c = $$0;
      }
   }

   public static enum b implements ayx {
      a("kob", cfe.a.a, 0),
      b("sunstreak", cfe.a.a, 1),
      c("snooper", cfe.a.a, 2),
      d("dasher", cfe.a.a, 3),
      e("brinely", cfe.a.a, 4),
      f("spotty", cfe.a.a, 5),
      g("flopper", cfe.a.b, 0),
      h("stripey", cfe.a.b, 1),
      i("glitter", cfe.a.b, 2),
      j("blockfish", cfe.a.b, 3),
      k("betty", cfe.a.b, 4),
      l("clayfish", cfe.a.b, 5);

      public static final Codec<cfe.b> m = ayx.a(cfe.b::values);
      private static final IntFunction<cfe.b> n = awv.a(cfe.b::b, values(), a);
      private final String o;
      private final wx p;
      private final cfe.a q;
      private final int r;

      private b(String $$0, cfe.a $$1, int $$2) {
         this.o = $$0;
         this.q = $$1;
         this.r = $$1.c | $$2 << 8;
         this.p = wx.c("entity.minecraft.tropical_fish.type." + this.o);
      }

      public static cfe.b a(int $$0) {
         return n.apply($$0);
      }

      public cfe.a a() {
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

   static class c extends ced.a {
      final cfe.d b;

      c(cfe $$0, cfe.d $$1) {
         super($$0);
         this.b = $$1;
      }
   }

   public static record d(cfe.b b, csh c, csh d) {
      public static final Codec<cfe.d> a = Codec.INT.xmap(cfe.d::new, cfe.d::a);

      public d(int $$0) {
         this(cfe.v($$0), cfe.t($$0), cfe.u($$0));
      }

      public int a() {
         return cfe.a(this.b, this.c, this.d);
      }
   }
}
