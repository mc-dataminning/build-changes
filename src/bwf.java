import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.List;
import java.util.Optional;
import java.util.function.IntFunction;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;
import org.slf4j.Logger;

public abstract class bwf extends bwi {
   static final Logger o = LogUtils.getLogger();
   public static final int a = -1;
   private static final akj<Integer> p = akn.a(bwf.class, akl.b);
   private static final akj<Integer> q = akn.a(bwf.class, akl.b);
   private static final akj<Integer> r = akn.a(bwf.class, akl.b);
   private static final akj<Vector3f> s = akn.a(bwf.class, akl.H);
   private static final akj<Vector3f> t = akn.a(bwf.class, akl.H);
   private static final akj<Quaternionf> u = akn.a(bwf.class, akl.I);
   private static final akj<Quaternionf> ay = akn.a(bwf.class, akl.I);
   private static final akj<Byte> az = akn.a(bwf.class, akl.a);
   private static final akj<Integer> aA = akn.a(bwf.class, akl.b);
   private static final akj<Float> aB = akn.a(bwf.class, akl.d);
   private static final akj<Float> aC = akn.a(bwf.class, akl.d);
   private static final akj<Float> aD = akn.a(bwf.class, akl.d);
   private static final akj<Float> aE = akn.a(bwf.class, akl.d);
   private static final akj<Float> aF = akn.a(bwf.class, akl.d);
   private static final akj<Integer> aG = akn.a(bwf.class, akl.b);
   private static final IntSet aH = IntSet.of(new int[]{s.a(), t.a(), u.a(), ay.a(), az.a(), aA.a(), aC.a(), aD.a()});
   private static final int aI = 0;
   private static final float aJ = 0.0F;
   private static final float aK = 1.0F;
   private static final int aL = -1;
   public static final String b = "teleport_duration";
   public static final String c = "interpolation_duration";
   public static final String d = "start_interpolation";
   public static final String e = "transformation";
   public static final String f = "billboard";
   public static final String g = "brightness";
   public static final String h = "view_range";
   public static final String i = "shadow_radius";
   public static final String j = "shadow_strength";
   public static final String k = "width";
   public static final String l = "height";
   public static final String m = "glow_color_override";
   private long aM = -2147483648L;
   private int aN;
   private float aO;
   private fex aP;
   private boolean aQ = true;
   protected boolean n;
   private boolean aR;
   private boolean aS;
   @Nullable
   private bwf.j aT;
   private final bxe aU = new bxe(this, 0);

   public bwf(bwr<?> $$0, djm $$1) {
      super($$0, $$1);
      this.ad = true;
      this.aP = this.cQ();
   }

   @Override
   public void a(akj<?> $$0) {
      super.a($$0);
      if (aF.equals($$0) || aE.equals($$0)) {
         this.A();
      }

      if (p.equals($$0)) {
         this.aR = true;
      }

      if (r.equals($$0)) {
         this.aU.a(this.o());
      }

      if (q.equals($$0)) {
         this.aS = true;
      }

      if (aH.contains($$0.a())) {
         this.n = true;
      }
   }

   @Override
   public final boolean a(arq $$0, bux $$1, float $$2) {
      return false;
   }

   private static k a(akn $$0) {
      Vector3f $$1 = $$0.a(s);
      Quaternionf $$2 = $$0.a(u);
      Vector3f $$3 = $$0.a(t);
      Quaternionf $$4 = $$0.a(ay);
      return new k($$1, $$2, $$3, $$4);
   }

   @Override
   public void h() {
      bwi $$0 = this.dj();
      if ($$0 != null && $$0.dP()) {
         this.bN();
      }

      if (this.dU().C) {
         if (this.aR) {
            this.aR = false;
            int $$1 = this.n();
            this.aM = (long)(this.af + $$1);
         }

         if (this.aS) {
            this.aS = false;
            this.aN = this.m();
         }

         if (this.n) {
            this.n = false;
            boolean $$2 = this.aN != 0;
            if ($$2 && this.aT != null) {
               this.aT = this.a(this.aT, this.aO);
            } else {
               this.aT = this.B();
            }

            this.a($$2, this.aO);
         }

         this.aU.e();
      }
   }

   @Override
   public bxe N_() {
      return this.aU;
   }

   protected abstract void a(boolean var1, float var2);

   @Override
   protected void a(akn.a $$0) {
      $$0.a(r, 0);
      $$0.a(p, 0);
      $$0.a(q, 0);
      $$0.a(s, new Vector3f());
      $$0.a(t, new Vector3f(1.0F, 1.0F, 1.0F));
      $$0.a(ay, new Quaternionf());
      $$0.a(u, new Quaternionf());
      $$0.a(az, bwf.a.a.a());
      $$0.a(aA, -1);
      $$0.a(aB, 1.0F);
      $$0.a(aC, 0.0F);
      $$0.a(aD, 1.0F);
      $$0.a(aE, 0.0F);
      $$0.a(aF, 0.0F);
      $$0.a(aG, -1);
   }

   @Override
   protected void a(tz $$0) {
      this.a($$0.<k>a("transformation", k.b).orElse(k.a()));
      if ($$0.b("interpolation_duration", 99)) {
         int $$1 = $$0.f("interpolation_duration");
         this.b($$1);
      }

      if ($$0.b("start_interpolation", 99)) {
         int $$2 = $$0.f("start_interpolation");
         this.c($$2);
      }

      if ($$0.b("teleport_duration", 99)) {
         int $$3 = $$0.f("teleport_duration");
         this.d(azm.a($$3, 0, 59));
      }

      this.a($$0.<bwf.a>a("billboard", bwf.a.e).orElse(bwf.a.a));
      if ($$0.b("view_range", 99)) {
         this.b($$0.h("view_range"));
      }

      if ($$0.b("shadow_radius", 99)) {
         this.c($$0.h("shadow_radius"));
      }

      if ($$0.b("shadow_strength", 99)) {
         this.d($$0.h("shadow_strength"));
      }

      if ($$0.b("width", 99)) {
         this.y($$0.h("width"));
      }

      if ($$0.b("height", 99)) {
         this.z($$0.h("height"));
      }

      if ($$0.b("glow_color_override", 99)) {
         this.l($$0.f("glow_color_override"));
      }

      this.a($$0.<ayb>a("brightness", ayb.b).orElse(null));
   }

   private void a(k $$0) {
      this.al.a(s, $$0.e());
      this.al.a(u, $$0.f());
      this.al.a(t, $$0.g());
      this.al.a(ay, $$0.h());
   }

   @Override
   protected void b(tz $$0) {
      $$0.a("transformation", k.b, a(this.al));
      $$0.a("billboard", bwf.a.e, this.q());
      $$0.a("interpolation_duration", this.m());
      $$0.a("teleport_duration", this.o());
      $$0.a("view_range", this.u());
      $$0.a("shadow_radius", this.v());
      $$0.a("shadow_strength", this.w());
      $$0.a("width", this.x());
      $$0.a("height", this.z());
      $$0.a("glow_color_override", this.y());
      $$0.b("brightness", ayb.b, this.s());
   }

   public fex f() {
      return this.aP;
   }

   public boolean g() {
      return !this.aQ;
   }

   @Override
   public exf j_() {
      return exf.d;
   }

   @Override
   public boolean g_() {
      return true;
   }

   @Nullable
   public bwf.j j() {
      return this.aT;
   }

   private void b(int $$0) {
      this.al.a(q, $$0);
   }

   private int m() {
      return this.al.a(q);
   }

   private void c(int $$0) {
      this.al.a(p, $$0, true);
   }

   private int n() {
      return this.al.a(p);
   }

   private void d(int $$0) {
      this.al.a(r, $$0);
   }

   private int o() {
      return this.al.a(r);
   }

   private void a(bwf.a $$0) {
      this.al.a(az, $$0.a());
   }

   private bwf.a q() {
      return bwf.a.f.apply(this.al.a(az));
   }

   private void a(@Nullable ayb $$0) {
      this.al.a(aA, $$0 != null ? $$0.a() : -1);
   }

   @Nullable
   private ayb s() {
      int $$0 = this.al.a(aA);
      return $$0 != -1 ? ayb.a($$0) : null;
   }

   private int t() {
      return this.al.a(aA);
   }

   private void b(float $$0) {
      this.al.a(aB, $$0);
   }

   private float u() {
      return this.al.a(aB);
   }

   private void c(float $$0) {
      this.al.a(aC, $$0);
   }

   private float v() {
      return this.al.a(aC);
   }

   private void d(float $$0) {
      this.al.a(aD, $$0);
   }

   private float w() {
      return this.al.a(aD);
   }

   private void y(float $$0) {
      this.al.a(aE, $$0);
   }

   private float x() {
      return this.al.a(aE);
   }

   private void z(float $$0) {
      this.al.a(aF, $$0);
   }

   private int y() {
      return this.al.a(aG);
   }

   private void l(int $$0) {
      this.al.a(aG, $$0);
   }

   public float a(float $$0) {
      int $$1 = this.aN;
      if ($$1 <= 0) {
         return 1.0F;
      } else {
         float $$2 = (float)((long)this.af - this.aM);
         float $$3 = $$2 + $$0;
         float $$4 = azm.a(azm.f($$3, 0.0F, (float)$$1), 0.0F, 1.0F);
         this.aO = $$4;
         return $$4;
      }
   }

   private float z() {
      return this.al.a(aF);
   }

   @Override
   public void a_(double $$0, double $$1, double $$2) {
      super.a_($$0, $$1, $$2);
      this.A();
   }

   private void A() {
      float $$0 = this.x();
      float $$1 = this.z();
      this.aQ = $$0 == 0.0F || $$1 == 0.0F;
      float $$2 = $$0 / 2.0F;
      double $$3 = this.dz();
      double $$4 = this.dB();
      double $$5 = this.dF();
      this.aP = new fex($$3 - (double)$$2, $$4, $$5 - (double)$$2, $$3 + (double)$$2, $$4 + (double)$$1, $$5 + (double)$$2);
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < azm.k((double)this.u() * 64.0 * cJ());
   }

   @Override
   public int f_() {
      int $$0 = this.y();
      return $$0 != -1 ? $$0 : super.f_();
   }

   private bwf.j B() {
      return new bwf.j(bwf.e.constant(a(this.al)), this.q(), this.t(), bwf.d.constant(this.v()), bwf.d.constant(this.w()), this.y());
   }

   private bwf.j a(bwf.j $$0, float $$1) {
      k $$2 = $$0.a.get($$1);
      float $$3 = $$0.d.get($$1);
      float $$4 = $$0.e.get($$1);
      return new bwf.j(new bwf.l($$2, a(this.al)), this.q(), this.t(), new bwf.h($$3, this.v()), new bwf.h($$4, this.w()), this.y());
   }

   public static enum a implements bak {
      a((byte)0, "fixed"),
      b((byte)1, "vertical"),
      c((byte)2, "horizontal"),
      d((byte)3, "center");

      public static final Codec<bwf.a> e = bak.a(bwf.a::values);
      public static final IntFunction<bwf.a> f = ayc.a(bwf.a::a, values(), ayc.a.a);
      private final byte g;
      private final String h;

      private a(final byte $$0, final String $$1) {
         this.h = $$1;
         this.g = $$0;
      }

      @Override
      public String c() {
         return this.h;
      }

      byte a() {
         return this.g;
      }
   }

   public static class b extends bwf {
      public static final String o = "block_state";
      private static final akj<eat> p = akn.a(bwf.b.class, akl.i);
      @Nullable
      private bwf.b.a q;

      public b(bwr<?> $$0, djm $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a(akn.a $$0) {
         super.a($$0);
         $$0.a(p, dmt.a.m());
      }

      @Override
      public void a(akj<?> $$0) {
         super.a($$0);
         if ($$0.equals(p)) {
            this.n = true;
         }
      }

      private eat n() {
         return this.al.a(p);
      }

      private void c(eat $$0) {
         this.al.a(p, $$0);
      }

      @Override
      protected void a(tz $$0) {
         super.a($$0);
         ale<uw> $$1 = this.dW().a(un.a);
         this.c($$0.<eat>a("block_state", eat.a, $$1).orElse(dmt.a.m()));
      }

      @Override
      protected void b(tz $$0) {
         super.b($$0);
         ale<uw> $$1 = this.dW().a(un.a);
         $$0.a("block_state", eat.a, $$1, this.n());
      }

      @Nullable
      public bwf.b.a m() {
         return this.q;
      }

      @Override
      protected void a(boolean $$0, float $$1) {
         this.q = new bwf.b.a(this.n());
      }

      public static record a(eat a) {
      }
   }

   static record c(int a, int b) implements bwf.f {
      @Override
      public int get(float $$0) {
         return axw.a($$0, this.a, this.b);
      }
   }

   @FunctionalInterface
   public interface d {
      static bwf.d constant(float $$0) {
         return $$1 -> $$0;
      }

      float get(float var1);
   }

   @FunctionalInterface
   public interface e<T> {
      static <T> bwf.e<T> constant(T $$0) {
         return $$1 -> $$0;
      }

      T get(float var1);
   }

   @FunctionalInterface
   public interface f {
      static bwf.f constant(int $$0) {
         return $$1 -> $$0;
      }

      int get(float var1);
   }

   public static class g extends bwf {
      private static final String o = "item";
      private static final String p = "item_display";
      private static final akj<czn> q = akn.a(bwf.g.class, akl.h);
      private static final akj<Byte> r = akn.a(bwf.g.class, akl.a);
      private final bya s = bya.a(this::n, this::a);
      @Nullable
      private bwf.g.a t;

      public g(bwr<?> $$0, djm $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a(akn.a $$0) {
         super.a($$0);
         $$0.a(q, czn.k);
         $$0.a(r, czl.a.a());
      }

      @Override
      public void a(akj<?> $$0) {
         super.a($$0);
         if (q.equals($$0) || r.equals($$0)) {
            this.n = true;
         }
      }

      private czn n() {
         return this.al.a(q);
      }

      private void a(czn $$0) {
         this.al.a(q, $$0);
      }

      private void a(czl $$0) {
         this.al.a(r, $$0.a());
      }

      private czl o() {
         return czl.k.apply(this.al.a(r));
      }

      @Override
      protected void a(tz $$0) {
         super.a($$0);
         ale<uw> $$1 = this.dW().a(un.a);
         this.a($$0.<czn>a("item", czn.b, $$1).orElse(czn.k));
         this.a($$0.<czl>a("item_display", czl.j).orElse(czl.a));
      }

      @Override
      protected void b(tz $$0) {
         super.b($$0);
         if (!this.n().f()) {
            $$0.a("item", czn.b, this.dW().a(un.a), this.n());
         }

         $$0.a("item_display", czl.j, this.o());
      }

      @Override
      public bya a_(int $$0) {
         return $$0 == 0 ? this.s : bya.a;
      }

      @Nullable
      public bwf.g.a m() {
         return this.t;
      }

      @Override
      protected void a(boolean $$0, float $$1) {
         czn $$2 = this.n();
         $$2.a(this);
         this.t = new bwf.g.a($$2, this.o());
      }

      public static record a(czn a, czl b) {
      }
   }

   static record h(float a, float b) implements bwf.d {
      @Override
      public float get(float $$0) {
         return azm.h($$0, this.a, this.b);
      }
   }

   static record i(int a, int b) implements bwf.f {
      @Override
      public int get(float $$0) {
         return azm.a($$0, this.a, this.b);
      }
   }

   public static record j(bwf.e<k> a, bwf.a b, int c, bwf.d d, bwf.d e, int f) {
   }

   public static class k extends bwf {
      public static final String o = "text";
      private static final String ay = "line_width";
      private static final String az = "text_opacity";
      private static final String aA = "background";
      private static final String aB = "shadow";
      private static final String aC = "see_through";
      private static final String aD = "default_background";
      private static final String aE = "alignment";
      public static final byte p = 1;
      public static final byte q = 2;
      public static final byte r = 4;
      public static final byte s = 8;
      public static final byte t = 16;
      private static final byte aF = -1;
      public static final int u = 1073741824;
      private static final akj<wy> aG = akn.a(bwf.k.class, akl.f);
      private static final akj<Integer> aH = akn.a(bwf.k.class, akl.b);
      private static final akj<Integer> aI = akn.a(bwf.k.class, akl.b);
      private static final akj<Byte> aJ = akn.a(bwf.k.class, akl.a);
      private static final akj<Byte> aK = akn.a(bwf.k.class, akl.a);
      private static final IntSet aL = IntSet.of(new int[]{aG.a(), aH.a(), aI.a(), aJ.a(), aK.a()});
      @Nullable
      private bwf.k.b aM;
      @Nullable
      private bwf.k.e aN;

      public k(bwr<?> $$0, djm $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a(akn.a $$0) {
         super.a($$0);
         $$0.a(aG, wy.i());
         $$0.a(aH, 200);
         $$0.a(aI, 1073741824);
         $$0.a(aJ, (byte)-1);
         $$0.a(aK, (byte)0);
      }

      @Override
      public void a(akj<?> $$0) {
         super.a($$0);
         if (aL.contains($$0.a())) {
            this.n = true;
         }
      }

      private wy n() {
         return this.al.a(aG);
      }

      private void a(wy $$0) {
         this.al.a(aG, $$0);
      }

      private int o() {
         return this.al.a(aH);
      }

      private void b(int $$0) {
         this.al.a(aH, $$0);
      }

      private byte q() {
         return this.al.a(aJ);
      }

      private void c(byte $$0) {
         this.al.a(aJ, $$0);
      }

      private int s() {
         return this.al.a(aI);
      }

      private void c(int $$0) {
         this.al.a(aI, $$0);
      }

      private byte t() {
         return this.al.a(aK);
      }

      private void d(byte $$0) {
         this.al.a(aK, $$0);
      }

      private static byte a(byte $$0, tz $$1, String $$2, byte $$3) {
         return $$1.o($$2) ? (byte)($$0 | $$3) : $$0;
      }

      @Override
      protected void a(tz $$0) {
         super.a($$0);
         if ($$0.b("line_width", 99)) {
            this.b($$0.f("line_width"));
         }

         if ($$0.b("text_opacity", 99)) {
            this.c($$0.d("text_opacity"));
         }

         if ($$0.b("background", 99)) {
            this.c($$0.f("background"));
         }

         byte $$1 = a((byte)0, $$0, "shadow", (byte)1);
         $$1 = a($$1, $$0, "see_through", (byte)2);
         $$1 = a($$1, $$0, "default_background", (byte)4);
         Optional<bwf.k.a> $$2 = $$0.a("alignment", bwf.k.a.d);
         if ($$2.isPresent()) {
            $$1 = switch ((bwf.k.a)$$2.get()) {
               case a -> $$1;
               case b -> (byte)($$1 | 8);
               case c -> (byte)($$1 | 16);
            };
         }

         this.d($$1);
         uw $$3 = $$0.a("text");
         if ($$3 != null) {
            ale<uw> $$4 = this.dW().a(un.a);

            try {
               wy $$5 = (wy)xa.a.parse($$4, $$3).getOrThrow();
               if ($$5 != null && this.dU() instanceof arq $$6) {
                  ej $$7 = this.d($$6).a(2);
                  wy $$8 = xb.a($$7, $$5, this, 0);
                  this.a($$8);
               } else {
                  this.a(wy.i());
               }
            } catch (Exception var10) {
               bwf.o.warn("Failed to parse display entity text {}", $$3, var10);
            }
         }
      }

      private static void b(byte $$0, tz $$1, String $$2, byte $$3) {
         $$1.a($$2, ($$0 & $$3) != 0);
      }

      @Override
      protected void b(tz $$0) {
         super.b($$0);
         ale<uw> $$1 = this.dW().a(un.a);
         $$0.a("text", xa.a, $$1, this.n());
         $$0.a("line_width", this.o());
         $$0.a("background", this.s());
         $$0.a("text_opacity", this.q());
         byte $$2 = this.t();
         b($$2, $$0, "shadow", (byte)1);
         b($$2, $$0, "see_through", (byte)2);
         b($$2, $$0, "default_background", (byte)4);
         $$0.a("alignment", bwf.k.a.d, a($$2));
      }

      @Override
      protected void a(boolean $$0, float $$1) {
         if ($$0 && this.aN != null) {
            this.aN = this.a(this.aN, $$1);
         } else {
            this.aN = this.u();
         }

         this.aM = null;
      }

      @Nullable
      public bwf.k.e m() {
         return this.aN;
      }

      private bwf.k.e u() {
         return new bwf.k.e(this.n(), this.o(), bwf.f.constant(this.q()), bwf.f.constant(this.s()), this.t());
      }

      private bwf.k.e a(bwf.k.e $$0, float $$1) {
         int $$2 = $$0.d.get($$1);
         int $$3 = $$0.c.get($$1);
         return new bwf.k.e(this.n(), this.o(), new bwf.i($$3, this.q()), new bwf.c($$2, this.s()), this.t());
      }

      public bwf.k.b a(bwf.k.d $$0) {
         if (this.aM == null) {
            if (this.aN != null) {
               this.aM = $$0.split(this.aN.a(), this.aN.b());
            } else {
               this.aM = new bwf.k.b(List.of(), 0);
            }
         }

         return this.aM;
      }

      public static bwf.k.a a(byte $$0) {
         if (($$0 & 8) != 0) {
            return bwf.k.a.b;
         } else {
            return ($$0 & 16) != 0 ? bwf.k.a.c : bwf.k.a.a;
         }
      }

      public static enum a implements bak {
         a("center"),
         b("left"),
         c("right");

         public static final Codec<bwf.k.a> d = bak.a(bwf.k.a::values);
         private final String e;

         private a(final String $$0) {
            this.e = $$0;
         }

         @Override
         public String c() {
            return this.e;
         }
      }

      public static record b(List<bwf.k.c> a, int b) {
      }

      public static record c(ayy a, int b) {
      }

      @FunctionalInterface
      public interface d {
         bwf.k.b split(wy var1, int var2);
      }

      public static record e(wy a, int b, bwf.f c, bwf.f d, byte e) {
      }
   }

   static record l(k a, k b) implements bwf.e<k> {
      public k a(float $$0) {
         return (double)$$0 >= 1.0 ? this.b : this.a.a(this.b, $$0);
      }
   }
}
