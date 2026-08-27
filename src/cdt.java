import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cdt extends ccs implements bsd<cdt.b> {
   public static final String b = "BucketVariantTag";
   private static final ajk<Integer> d = ajo.a(cdt.class, ajm.b);
   public static final List<cdt.d> c = List.of(
      new cdt.d(cdt.b.h, cqw.b, cqw.h),
      new cdt.d(cdt.b.g, cqw.h, cqw.h),
      new cdt.d(cdt.b.g, cqw.h, cqw.l),
      new cdt.d(cdt.b.l, cqw.a, cqw.h),
      new cdt.d(cdt.b.b, cqw.l, cqw.h),
      new cdt.d(cdt.b.a, cqw.b, cqw.a),
      new cdt.d(cdt.b.f, cqw.g, cqw.d),
      new cdt.d(cdt.b.j, cqw.k, cqw.e),
      new cdt.d(cdt.b.l, cqw.a, cqw.o),
      new cdt.d(cdt.b.f, cqw.a, cqw.e),
      new cdt.d(cdt.b.i, cqw.a, cqw.h),
      new cdt.d(cdt.b.l, cqw.a, cqw.b),
      new cdt.d(cdt.b.d, cqw.j, cqw.g),
      new cdt.d(cdt.b.e, cqw.f, cqw.d),
      new cdt.d(cdt.b.k, cqw.o, cqw.a),
      new cdt.d(cdt.b.c, cqw.h, cqw.o),
      new cdt.d(cdt.b.j, cqw.o, cqw.a),
      new cdt.d(cdt.b.g, cqw.a, cqw.e),
      new cdt.d(cdt.b.a, cqw.o, cqw.a),
      new cdt.d(cdt.b.b, cqw.h, cqw.a),
      new cdt.d(cdt.b.d, cqw.j, cqw.e),
      new cdt.d(cdt.b.g, cqw.e, cqw.e)
   );
   private boolean e = true;

   public cdt(bqr<? extends cdt> $$0, czu $$1) {
      super($$0, $$1);
   }

   public static String c(int $$0) {
      return "entity.minecraft.tropical_fish.predefined." + $$0;
   }

   static int a(cdt.b $$0, cqw $$1, cqw $$2) {
      return $$0.b() & 65535 | ($$1.a() & 0xFF) << 16 | ($$2.a() & 0xFF) << 24;
   }

   public static cqw t(int $$0) {
      return cqw.a($$0 >> 16 & 0xFF);
   }

   public static cqw u(int $$0) {
      return cqw.a($$0 >> 24 & 0xFF);
   }

   public static cdt.b v(int $$0) {
      return cdt.b.a($$0 & 65535);
   }

   @Override
   protected void a(ajo.a $$0) {
      super.a($$0);
      $$0.a(d, 0);
   }

   @Override
   public void b(ty $$0) {
      super.b($$0);
      $$0.a("Variant", this.gB());
   }

   @Override
   public void a(ty $$0) {
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

   public cqw gy() {
      return t(this.gB());
   }

   public cqw gz() {
      return u(this.gB());
   }

   public cdt.b gA() {
      return v(this.gB());
   }

   public void a(cdt.b $$0) {
      int $$1 = this.gB();
      cqw $$2 = t($$1);
      cqw $$3 = u($$1);
      this.w(a($$0, $$2, $$3));
   }

   @Override
   public void n(csd $$0) {
      super.n($$0);
      cuq.a(jz.E, $$0, $$0x -> $$0x.a("BucketVariantTag", this.gB()));
   }

   @Override
   public csd b() {
      return new csd(csg.qI);
   }

   @Override
   protected auy v() {
      return auz.zx;
   }

   @Override
   protected auy o_() {
      return auz.zy;
   }

   @Override
   protected auy d(bpj $$0) {
      return auz.zA;
   }

   @Override
   protected auy gq() {
      return auz.zz;
   }

   @Override
   public void c(ty $$0) {
      super.c($$0);
      if ($$0.b("BucketVariantTag", 3)) {
         this.w($$0.h("BucketVariantTag"));
      }
   }

   @Nullable
   @Override
   public brw a(daj $$0, boo $$1, bri $$2, @Nullable brw $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      ayd $$4 = $$0.E_();
      cdt.d $$6;
      if ($$3 instanceof cdt.c $$5) {
         $$6 = $$5.b;
      } else if ((double)$$4.i() < 0.9) {
         $$6 = ac.a(c, $$4);
         $$3 = new cdt.c(this, $$6);
      } else {
         this.e = false;
         cdt.b[] $$8 = cdt.b.values();
         cqw[] $$9 = cqw.values();
         cdt.b $$10 = ac.a($$8, $$4);
         cqw $$11 = ac.a($$9, $$4);
         cqw $$12 = ac.a($$9, $$4);
         $$6 = new cdt.d($$10, $$11, $$12);
      }

      this.w($$6.a());
      return $$3;
   }

   public static boolean b(bqr<cdt> $$0, czv $$1, bri $$2, im $$3, ayd $$4) {
      return $$1.b_($$3.d()).a(avt.a) && $$1.a_($$3.c()).a(dcx.G) && ($$1.t($$3).a(avn.an) || cdv.c($$0, $$1, $$2, $$3, $$4));
   }

   public static enum a {
      a(0),
      b(1);

      final int c;

      private a(int $$0) {
         this.c = $$0;
      }
   }

   public static enum b implements ayq {
      a("kob", cdt.a.a, 0),
      b("sunstreak", cdt.a.a, 1),
      c("snooper", cdt.a.a, 2),
      d("dasher", cdt.a.a, 3),
      e("brinely", cdt.a.a, 4),
      f("spotty", cdt.a.a, 5),
      g("flopper", cdt.a.b, 0),
      h("stripey", cdt.a.b, 1),
      i("glitter", cdt.a.b, 2),
      j("blockfish", cdt.a.b, 3),
      k("betty", cdt.a.b, 4),
      l("clayfish", cdt.a.b, 5);

      public static final Codec<cdt.b> m = ayq.a(cdt.b::values);
      private static final IntFunction<cdt.b> n = awn.a(cdt.b::b, values(), a);
      private final String o;
      private final ws p;
      private final cdt.a q;
      private final int r;

      private b(String $$0, cdt.a $$1, int $$2) {
         this.o = $$0;
         this.q = $$1;
         this.r = $$1.c | $$2 << 8;
         this.p = ws.c("entity.minecraft.tropical_fish.type." + this.o);
      }

      public static cdt.b a(int $$0) {
         return n.apply($$0);
      }

      public cdt.a a() {
         return this.q;
      }

      public int b() {
         return this.r;
      }

      @Override
      public String c() {
         return this.o;
      }

      public ws d() {
         return this.p;
      }
   }

   static class c extends ccs.a {
      final cdt.d b;

      c(cdt $$0, cdt.d $$1) {
         super($$0);
         this.b = $$1;
      }
   }

   public static record d(cdt.b b, cqw c, cqw d) {
      public static final Codec<cdt.d> a = Codec.INT.xmap(cdt.d::new, cdt.d::a);

      public d(int $$0) {
         this(cdt.v($$0), cdt.t($$0), cdt.u($$0));
      }

      public int a() {
         return cdt.a(this.b, this.c, this.d);
      }
   }
}
