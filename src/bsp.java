import com.mojang.datafixers.util.Pair;
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

public abstract class bsp extends bsq {
   static final Logger p = LogUtils.getLogger();
   public static final int b = -1;
   private static final ajv<Integer> q = ajz.a(bsp.class, ajx.b);
   private static final ajv<Integer> r = ajz.a(bsp.class, ajx.b);
   private static final ajv<Integer> s = ajz.a(bsp.class, ajx.b);
   private static final ajv<Vector3f> t = ajz.a(bsp.class, ajx.D);
   private static final ajv<Vector3f> u = ajz.a(bsp.class, ajx.D);
   private static final ajv<Quaternionf> v = ajz.a(bsp.class, ajx.E);
   private static final ajv<Quaternionf> aD = ajz.a(bsp.class, ajx.E);
   private static final ajv<Byte> aE = ajz.a(bsp.class, ajx.a);
   private static final ajv<Integer> aF = ajz.a(bsp.class, ajx.b);
   private static final ajv<Float> aG = ajz.a(bsp.class, ajx.d);
   private static final ajv<Float> aH = ajz.a(bsp.class, ajx.d);
   private static final ajv<Float> aI = ajz.a(bsp.class, ajx.d);
   private static final ajv<Float> aJ = ajz.a(bsp.class, ajx.d);
   private static final ajv<Float> aK = ajz.a(bsp.class, ajx.d);
   private static final ajv<Integer> aL = ajz.a(bsp.class, ajx.b);
   private static final IntSet aM = IntSet.of(new int[]{t.a(), u.a(), v.a(), aD.a(), aE.a(), aF.a(), aH.a(), aI.a()});
   private static final float aN = 0.0F;
   private static final float aO = 1.0F;
   private static final int aP = -1;
   public static final String c = "teleport_duration";
   public static final String d = "interpolation_duration";
   public static final String e = "start_interpolation";
   public static final String f = "transformation";
   public static final String g = "billboard";
   public static final String h = "brightness";
   public static final String i = "view_range";
   public static final String j = "shadow_radius";
   public static final String k = "shadow_strength";
   public static final String l = "width";
   public static final String m = "height";
   public static final String n = "glow_color_override";
   private long aQ = -2147483648L;
   private int aR;
   private float aS;
   private ewr aT;
   protected boolean o;
   private boolean aU;
   private boolean aV;
   @Nullable
   private bsp.k aW;
   @Nullable
   private bsp.j aX;

   public bsp(bsw<?> $$0, dcu $$1) {
      super($$0, $$1);
      this.ag = true;
      this.au = true;
      this.aT = this.cL();
   }

   @Override
   public void a(ajv<?> $$0) {
      super.a($$0);
      if (aK.equals($$0) || aJ.equals($$0)) {
         this.F();
      }

      if (q.equals($$0)) {
         this.aU = true;
      }

      if (r.equals($$0)) {
         this.aV = true;
      }

      if (aM.contains($$0.a())) {
         this.o = true;
      }
   }

   private static j a(ajz $$0) {
      Vector3f $$1 = $$0.a(t);
      Quaternionf $$2 = $$0.a(v);
      Vector3f $$3 = $$0.a(u);
      Quaternionf $$4 = $$0.a(aD);
      return new j($$1, $$2, $$3, $$4);
   }

   @Override
   public void l() {
      bsq $$0 = this.dd();
      if ($$0 != null && $$0.dL()) {
         this.ad();
      }

      if (this.dQ().B) {
         if (this.aU) {
            this.aU = false;
            int $$1 = this.t();
            this.aQ = (long)(this.ai + $$1);
         }

         if (this.aV) {
            this.aV = false;
            this.aR = this.s();
         }

         if (this.o) {
            this.o = false;
            boolean $$2 = this.aR != 0;
            if ($$2 && this.aW != null) {
               this.aW = this.a(this.aW, this.aS);
            } else {
               this.aW = this.H();
            }

            this.a($$2, this.aS);
         }

         if (this.aX != null) {
            if (this.aX.a == 0) {
               this.aX.a(this);
               this.bv();
               this.aX = null;
            } else {
               this.aX.b(this);
               this.aX.a--;
               if (this.aX.a == 0) {
                  this.aX = null;
               }
            }
         }
      }
   }

   protected abstract void a(boolean var1, float var2);

   @Override
   protected void a(ajz.a $$0) {
      $$0.a(s, 0);
      $$0.a(q, 0);
      $$0.a(r, 0);
      $$0.a(t, new Vector3f());
      $$0.a(u, new Vector3f(1.0F, 1.0F, 1.0F));
      $$0.a(aD, new Quaternionf());
      $$0.a(v, new Quaternionf());
      $$0.a(aE, bsp.a.a.a());
      $$0.a(aF, -1);
      $$0.a(aG, 1.0F);
      $$0.a(aH, 0.0F);
      $$0.a(aI, 1.0F);
      $$0.a(aJ, 0.0F);
      $$0.a(aK, 0.0F);
      $$0.a(aL, -1);
   }

   @Override
   protected void a(ua $$0) {
      if ($$0.e("transformation")) {
         j.b.decode(uo.a, $$0.c("transformation")).resultOrPartial(ad.a("Display entity", p::error)).ifPresent($$0x -> this.a((j)$$0x.getFirst()));
      }

      if ($$0.b("interpolation_duration", 99)) {
         int $$1 = $$0.h("interpolation_duration");
         this.b($$1);
      }

      if ($$0.b("start_interpolation", 99)) {
         int $$2 = $$0.h("start_interpolation");
         this.c($$2);
      }

      if ($$0.b("teleport_duration", 99)) {
         int $$3 = $$0.h("teleport_duration");
         this.d(ayn.a($$3, 0, 59));
      }

      if ($$0.b("billboard", 8)) {
         bsp.a.e.decode(uo.a, $$0.c("billboard")).resultOrPartial(ad.a("Display entity", p::error)).ifPresent($$0x -> this.a((bsp.a)$$0x.getFirst()));
      }

      if ($$0.b("view_range", 99)) {
         this.b($$0.j("view_range"));
      }

      if ($$0.b("shadow_radius", 99)) {
         this.c($$0.j("shadow_radius"));
      }

      if ($$0.b("shadow_strength", 99)) {
         this.u($$0.j("shadow_strength"));
      }

      if ($$0.b("width", 99)) {
         this.v($$0.j("width"));
      }

      if ($$0.b("height", 99)) {
         this.w($$0.j("height"));
      }

      if ($$0.b("glow_color_override", 99)) {
         this.m($$0.h("glow_color_override"));
      }

      if ($$0.b("brightness", 10)) {
         axc.b.decode(uo.a, $$0.c("brightness")).resultOrPartial(ad.a("Display entity", p::error)).ifPresent($$0x -> this.a((axc)$$0x.getFirst()));
      } else {
         this.a(null);
      }
   }

   private void a(j $$0) {
      this.ao.a(t, $$0.d());
      this.ao.a(v, $$0.e());
      this.ao.a(u, $$0.f());
      this.ao.a(aD, $$0.g());
   }

   @Override
   protected void b(ua $$0) {
      j.b.encodeStart(uo.a, a(this.ao)).ifSuccess($$1x -> $$0.a("transformation", $$1x));
      bsp.a.e.encodeStart(uo.a, this.w()).ifSuccess($$1x -> $$0.a("billboard", $$1x));
      $$0.a("interpolation_duration", this.s());
      $$0.a("teleport_duration", this.v());
      $$0.a("view_range", this.z());
      $$0.a("shadow_radius", this.A());
      $$0.a("shadow_strength", this.B());
      $$0.a("width", this.C());
      $$0.a("height", this.E());
      $$0.a("glow_color_override", this.D());
      axc $$1 = this.x();
      if ($$1 != null) {
         axc.b.encodeStart(uo.a, $$1).ifSuccess($$1x -> $$0.a("brightness", $$1x));
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      int $$6 = this.v();
      this.aX = new bsp.j($$6, $$0, $$1, $$2, (double)$$3, (double)$$4);
   }

   @Override
   public double c_() {
      return this.aX != null ? this.aX.b : this.dv();
   }

   @Override
   public double d_() {
      return this.aX != null ? this.aX.c : this.dx();
   }

   @Override
   public double L_() {
      return this.aX != null ? this.aX.d : this.dB();
   }

   @Override
   public float M_() {
      return this.aX != null ? (float)this.aX.f : this.dI();
   }

   @Override
   public float e_() {
      return this.aX != null ? (float)this.aX.e : this.dG();
   }

   @Override
   public ewr h_() {
      return this.aT;
   }

   @Override
   public epd j_() {
      return epd.d;
   }

   @Override
   public boolean r_() {
      return true;
   }

   @Nullable
   public bsp.k p() {
      return this.aW;
   }

   private void b(int $$0) {
      this.ao.a(r, $$0);
   }

   private int s() {
      return this.ao.a(r);
   }

   private void c(int $$0) {
      this.ao.a(q, $$0, true);
   }

   private int t() {
      return this.ao.a(q);
   }

   private void d(int $$0) {
      this.ao.a(s, $$0);
   }

   private int v() {
      return this.ao.a(s);
   }

   private void a(bsp.a $$0) {
      this.ao.a(aE, $$0.a());
   }

   private bsp.a w() {
      return bsp.a.f.apply(this.ao.a(aE));
   }

   private void a(@Nullable axc $$0) {
      this.ao.a(aF, $$0 != null ? $$0.a() : -1);
   }

   @Nullable
   private axc x() {
      int $$0 = this.ao.a(aF);
      return $$0 != -1 ? axc.a($$0) : null;
   }

   private int y() {
      return this.ao.a(aF);
   }

   private void b(float $$0) {
      this.ao.a(aG, $$0);
   }

   private float z() {
      return this.ao.a(aG);
   }

   private void c(float $$0) {
      this.ao.a(aH, $$0);
   }

   private float A() {
      return this.ao.a(aH);
   }

   private void u(float $$0) {
      this.ao.a(aI, $$0);
   }

   private float B() {
      return this.ao.a(aI);
   }

   private void v(float $$0) {
      this.ao.a(aJ, $$0);
   }

   private float C() {
      return this.ao.a(aJ);
   }

   private void w(float $$0) {
      this.ao.a(aK, $$0);
   }

   private int D() {
      return this.ao.a(aL);
   }

   private void m(int $$0) {
      this.ao.a(aL, $$0);
   }

   public float a(float $$0) {
      int $$1 = this.aR;
      if ($$1 <= 0) {
         return 1.0F;
      } else {
         float $$2 = (float)((long)this.ai - this.aQ);
         float $$3 = $$2 + $$0;
         float $$4 = ayn.a(ayn.g($$3, 0.0F, (float)$$1), 0.0F, 1.0F);
         this.aS = $$4;
         return $$4;
      }
   }

   private float E() {
      return this.ao.a(aK);
   }

   @Override
   public void a_(double $$0, double $$1, double $$2) {
      super.a_($$0, $$1, $$2);
      this.F();
   }

   private void F() {
      float $$0 = this.C();
      float $$1 = this.E();
      if ($$0 != 0.0F && $$1 != 0.0F) {
         this.au = false;
         float $$2 = $$0 / 2.0F;
         double $$3 = this.dv();
         double $$4 = this.dx();
         double $$5 = this.dB();
         this.aT = new ewr($$3 - (double)$$2, $$4, $$5 - (double)$$2, $$3 + (double)$$2, $$4 + (double)$$1, $$5 + (double)$$2);
      } else {
         this.au = true;
      }
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < ayn.k((double)this.z() * 64.0 * cE());
   }

   @Override
   public int q_() {
      int $$0 = this.D();
      return $$0 != -1 ? $$0 : super.q_();
   }

   private bsp.k H() {
      return new bsp.k(bsp.e.constant(a(this.ao)), this.w(), this.y(), bsp.d.constant(this.A()), bsp.d.constant(this.B()), this.D());
   }

   private bsp.k a(bsp.k $$0, float $$1) {
      j $$2 = $$0.a.get($$1);
      float $$3 = $$0.d.get($$1);
      float $$4 = $$0.e.get($$1);
      return new bsp.k(new bsp.m($$2, a(this.ao)), this.w(), this.y(), new bsp.h($$3, this.A()), new bsp.h($$4, this.B()), this.D());
   }

   public static enum a implements azj {
      a((byte)0, "fixed"),
      b((byte)1, "vertical"),
      c((byte)2, "horizontal"),
      d((byte)3, "center");

      public static final Codec<bsp.a> e = azj.a(bsp.a::values);
      public static final IntFunction<bsp.a> f = axd.a(bsp.a::a, values(), axd.a.a);
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

   public static class b extends bsp {
      public static final String p = "block_state";
      private static final ajv<dta> q = ajz.a(bsp.b.class, ajx.i);
      @Nullable
      private bsp.b.a r;

      public b(bsw<?> $$0, dcu $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a(ajz.a $$0) {
         super.a($$0);
         $$0.a(q, dfy.a.o());
      }

      @Override
      public void a(ajv<?> $$0) {
         super.a($$0);
         if ($$0.equals(q)) {
            this.o = true;
         }
      }

      private dta t() {
         return this.ao.a(q);
      }

      private void c(dta $$0) {
         this.ao.a(q, $$0);
      }

      @Override
      protected void a(ua $$0) {
         super.a($$0);
         this.c(up.a(this.dQ().a(lu.f), $$0.p("block_state")));
      }

      @Override
      protected void b(ua $$0) {
         super.b($$0);
         $$0.a("block_state", up.a(this.t()));
      }

      @Nullable
      public bsp.b.a s() {
         return this.r;
      }

      @Override
      protected void a(boolean $$0, float $$1) {
         this.r = new bsp.b.a(this.t());
      }

      public static record a(dta a) {
      }
   }

   static record c(int a, int b) implements bsp.f {
      @Override
      public int get(float $$0) {
         return axx.b.a($$0, this.a, this.b);
      }
   }

   @FunctionalInterface
   public interface d {
      static bsp.d constant(float $$0) {
         return $$1 -> $$0;
      }

      float get(float var1);
   }

   @FunctionalInterface
   public interface e<T> {
      static <T> bsp.e<T> constant(T $$0) {
         return $$1 -> $$0;
      }

      T get(float var1);
   }

   @FunctionalInterface
   public interface f {
      static bsp.f constant(int $$0) {
         return $$1 -> $$0;
      }

      int get(float var1);
   }

   public static class g extends bsp {
      private static final String p = "item";
      private static final String q = "item_display";
      private static final ajv<cuo> r = ajz.a(bsp.g.class, ajx.h);
      private static final ajv<Byte> s = ajz.a(bsp.g.class, ajx.a);
      private final bue t = bue.a(this::t, this::a);
      @Nullable
      private bsp.g.a u;

      public g(bsw<?> $$0, dcu $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a(ajz.a $$0) {
         super.a($$0);
         $$0.a(r, cuo.l);
         $$0.a(s, cul.a.a());
      }

      @Override
      public void a(ajv<?> $$0) {
         super.a($$0);
         if (r.equals($$0) || s.equals($$0)) {
            this.o = true;
         }
      }

      private cuo t() {
         return this.ao.a(r);
      }

      private void a(cuo $$0) {
         this.ao.a(r, $$0);
      }

      private void a(cul $$0) {
         this.ao.a(s, $$0.a());
      }

      private cul v() {
         return cul.k.apply(this.ao.a(s));
      }

      @Override
      protected void a(ua $$0) {
         super.a($$0);
         if ($$0.e("item")) {
            this.a(cuo.a(this.dS(), (ux)$$0.p("item")).orElse(cuo.l));
         } else {
            this.a(cuo.l);
         }

         if ($$0.b("item_display", 8)) {
            cul.j.decode(uo.a, $$0.c("item_display")).resultOrPartial(ad.a("Display entity", bsp.p::error)).ifPresent($$0x -> this.a((cul)$$0x.getFirst()));
         }
      }

      @Override
      protected void b(ua $$0) {
         super.b($$0);
         if (!this.t().e()) {
            $$0.a("item", this.t().a(this.dS()));
         }

         cul.j.encodeStart(uo.a, this.v()).ifSuccess($$1 -> $$0.a("item_display", $$1));
      }

      @Override
      public bue a_(int $$0) {
         return $$0 == 0 ? this.t : bue.a;
      }

      @Nullable
      public bsp.g.a s() {
         return this.u;
      }

      @Override
      protected void a(boolean $$0, float $$1) {
         cuo $$2 = this.t();
         $$2.a(this);
         this.u = new bsp.g.a($$2, this.v());
      }

      public static record a(cuo a, cul b) {
      }
   }

   static record h(float a, float b) implements bsp.d {
      @Override
      public float get(float $$0) {
         return ayn.i($$0, this.a, this.b);
      }
   }

   static record i(int a, int b) implements bsp.f {
      @Override
      public int get(float $$0) {
         return ayn.a($$0, this.a, this.b);
      }
   }

   static class j {
      int a;
      final double b;
      final double c;
      final double d;
      final double e;
      final double f;

      j(int $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      void a(bsq $$0) {
         $$0.a_(this.b, this.c, this.d);
         $$0.a((float)this.e, (float)this.f);
      }

      void b(bsq $$0) {
         $$0.a(this.a, this.b, this.c, this.d, this.e, this.f);
      }
   }

   public static record k(bsp.e<j> a, bsp.a b, int c, bsp.d d, bsp.d e, int f) {
   }

   public static class l extends bsp {
      public static final String p = "text";
      private static final String aD = "line_width";
      private static final String aE = "text_opacity";
      private static final String aF = "background";
      private static final String aG = "shadow";
      private static final String aH = "see_through";
      private static final String aI = "default_background";
      private static final String aJ = "alignment";
      public static final byte q = 1;
      public static final byte r = 2;
      public static final byte s = 4;
      public static final byte t = 8;
      public static final byte u = 16;
      private static final byte aK = -1;
      public static final int v = 1073741824;
      private static final ajv<wy> aL = ajz.a(bsp.l.class, ajx.f);
      private static final ajv<Integer> aM = ajz.a(bsp.l.class, ajx.b);
      private static final ajv<Integer> aN = ajz.a(bsp.l.class, ajx.b);
      private static final ajv<Byte> aO = ajz.a(bsp.l.class, ajx.a);
      private static final ajv<Byte> aP = ajz.a(bsp.l.class, ajx.a);
      private static final IntSet aQ = IntSet.of(new int[]{aL.a(), aM.a(), aN.a(), aO.a(), aP.a()});
      @Nullable
      private bsp.l.b aR;
      @Nullable
      private bsp.l.e aS;

      public l(bsw<?> $$0, dcu $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a(ajz.a $$0) {
         super.a($$0);
         $$0.a(aL, wy.i());
         $$0.a(aM, 200);
         $$0.a(aN, 1073741824);
         $$0.a(aO, (byte)-1);
         $$0.a(aP, (byte)0);
      }

      @Override
      public void a(ajv<?> $$0) {
         super.a($$0);
         if (aQ.contains($$0.a())) {
            this.o = true;
         }
      }

      private wy t() {
         return this.ao.a(aL);
      }

      private void c(wy $$0) {
         this.ao.a(aL, $$0);
      }

      private int v() {
         return this.ao.a(aM);
      }

      private void b(int $$0) {
         this.ao.a(aM, $$0);
      }

      private byte w() {
         return this.ao.a(aO);
      }

      private void c(byte $$0) {
         this.ao.a(aO, $$0);
      }

      private int x() {
         return this.ao.a(aN);
      }

      private void c(int $$0) {
         this.ao.a(aN, $$0);
      }

      private byte y() {
         return this.ao.a(aP);
      }

      private void d(byte $$0) {
         this.ao.a(aP, $$0);
      }

      private static byte a(byte $$0, ua $$1, String $$2, byte $$3) {
         return $$1.q($$2) ? (byte)($$0 | $$3) : $$0;
      }

      @Override
      protected void a(ua $$0) {
         super.a($$0);
         if ($$0.b("line_width", 99)) {
            this.b($$0.h("line_width"));
         }

         if ($$0.b("text_opacity", 99)) {
            this.c($$0.f("text_opacity"));
         }

         if ($$0.b("background", 99)) {
            this.c($$0.h("background"));
         }

         byte $$1 = a((byte)0, $$0, "shadow", (byte)1);
         $$1 = a($$1, $$0, "see_through", (byte)2);
         $$1 = a($$1, $$0, "default_background", (byte)4);
         Optional<bsp.l.a> $$2 = bsp.l.a.d.decode(uo.a, $$0.c("alignment")).resultOrPartial(ad.a("Display entity", bsp.p::error)).map(Pair::getFirst);
         if ($$2.isPresent()) {
            $$1 = switch ((bsp.l.a)$$2.get()) {
               case a -> $$1;
               case b -> (byte)($$1 | 8);
               case c -> (byte)($$1 | 16);
            };
         }

         this.d($$1);
         if ($$0.b("text", 8)) {
            String $$3 = $$0.l("text");

            try {
               wy $$4 = wy.a.a($$3, this.dS());
               if ($$4 != null) {
                  et $$5 = this.dh().a(2);
                  wy $$6 = xb.a($$5, $$4, this, 0);
                  this.c($$6);
               } else {
                  this.c(wy.i());
               }
            } catch (Exception var8) {
               bsp.p.warn("Failed to parse display entity text {}", $$3, var8);
            }
         }
      }

      private static void b(byte $$0, ua $$1, String $$2, byte $$3) {
         $$1.a($$2, ($$0 & $$3) != 0);
      }

      @Override
      protected void b(ua $$0) {
         super.b($$0);
         $$0.a("text", wy.a.a(this.t(), this.dS()));
         $$0.a("line_width", this.v());
         $$0.a("background", this.x());
         $$0.a("text_opacity", this.w());
         byte $$1 = this.y();
         b($$1, $$0, "shadow", (byte)1);
         b($$1, $$0, "see_through", (byte)2);
         b($$1, $$0, "default_background", (byte)4);
         bsp.l.a.d.encodeStart(uo.a, a($$1)).ifSuccess($$1x -> $$0.a("alignment", $$1x));
      }

      @Override
      protected void a(boolean $$0, float $$1) {
         if ($$0 && this.aS != null) {
            this.aS = this.a(this.aS, $$1);
         } else {
            this.aS = this.z();
         }

         this.aR = null;
      }

      @Nullable
      public bsp.l.e s() {
         return this.aS;
      }

      private bsp.l.e z() {
         return new bsp.l.e(this.t(), this.v(), bsp.f.constant(this.w()), bsp.f.constant(this.x()), this.y());
      }

      private bsp.l.e a(bsp.l.e $$0, float $$1) {
         int $$2 = $$0.d.get($$1);
         int $$3 = $$0.c.get($$1);
         return new bsp.l.e(this.t(), this.v(), new bsp.i($$3, this.w()), new bsp.c($$2, this.x()), this.y());
      }

      public bsp.l.b a(bsp.l.d $$0) {
         if (this.aR == null) {
            if (this.aS != null) {
               this.aR = $$0.split(this.aS.a(), this.aS.b());
            } else {
               this.aR = new bsp.l.b(List.of(), 0);
            }
         }

         return this.aR;
      }

      public static bsp.l.a a(byte $$0) {
         if (($$0 & 8) != 0) {
            return bsp.l.a.b;
         } else {
            return ($$0 & 16) != 0 ? bsp.l.a.c : bsp.l.a.a;
         }
      }

      public static enum a implements azj {
         a("center"),
         b("left"),
         c("right");

         public static final Codec<bsp.l.a> d = azj.a(bsp.l.a::values);
         private final String e;

         private a(final String $$0) {
            this.e = $$0;
         }

         @Override
         public String c() {
            return this.e;
         }
      }

      public static record b(List<bsp.l.c> a, int b) {
      }

      public static record c(axz a, int b) {
      }

      @FunctionalInterface
      public interface d {
         bsp.l.b split(wy var1, int var2);
      }

      public static record e(wy a, int b, bsp.f c, bsp.f d, byte e) {
      }
   }

   static record m(j a, j b) implements bsp.e<j> {
      public j a(float $$0) {
         return (double)$$0 >= 1.0 ? this.b : this.a.a(this.b, $$0);
      }
   }
}
