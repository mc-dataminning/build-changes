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

public abstract class brv extends brw {
   static final Logger p = LogUtils.getLogger();
   public static final int b = -1;
   private static final ajs<Integer> q = ajw.a(brv.class, aju.b);
   private static final ajs<Integer> r = ajw.a(brv.class, aju.b);
   private static final ajs<Integer> s = ajw.a(brv.class, aju.b);
   private static final ajs<Vector3f> t = ajw.a(brv.class, aju.D);
   private static final ajs<Vector3f> u = ajw.a(brv.class, aju.D);
   private static final ajs<Quaternionf> v = ajw.a(brv.class, aju.E);
   private static final ajs<Quaternionf> aF = ajw.a(brv.class, aju.E);
   private static final ajs<Byte> aG = ajw.a(brv.class, aju.a);
   private static final ajs<Integer> aH = ajw.a(brv.class, aju.b);
   private static final ajs<Float> aI = ajw.a(brv.class, aju.d);
   private static final ajs<Float> aJ = ajw.a(brv.class, aju.d);
   private static final ajs<Float> aK = ajw.a(brv.class, aju.d);
   private static final ajs<Float> aL = ajw.a(brv.class, aju.d);
   private static final ajs<Float> aM = ajw.a(brv.class, aju.d);
   private static final ajs<Integer> aN = ajw.a(brv.class, aju.b);
   private static final IntSet aO = IntSet.of(new int[]{t.a(), u.a(), v.a(), aF.a(), aG.a(), aH.a(), aJ.a(), aK.a()});
   private static final float aP = 0.0F;
   private static final float aQ = 1.0F;
   private static final int aR = -1;
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
   private long aS = -2147483648L;
   private int aT;
   private float aU;
   private euh aV;
   protected boolean o;
   private boolean aW;
   private boolean aX;
   @Nullable
   private brv.k aY;
   @Nullable
   private brv.j aZ;

   public brv(bsc<?> $$0, daz $$1) {
      super($$0, $$1);
      this.ag = true;
      this.au = true;
      this.aV = this.cK();
   }

   @Override
   public void a(ajs<?> $$0) {
      super.a($$0);
      if (aM.equals($$0) || aL.equals($$0)) {
         this.G();
      }

      if (q.equals($$0)) {
         this.aW = true;
      }

      if (r.equals($$0)) {
         this.aX = true;
      }

      if (aO.contains($$0.a())) {
         this.o = true;
      }
   }

   private static j a(ajw $$0) {
      Vector3f $$1 = $$0.a(t);
      Quaternionf $$2 = $$0.a(v);
      Vector3f $$3 = $$0.a(u);
      Quaternionf $$4 = $$0.a(aF);
      return new j($$1, $$2, $$3, $$4);
   }

   @Override
   public void l() {
      brw $$0 = this.dc();
      if ($$0 != null && $$0.dK()) {
         this.ac();
      }

      if (this.dP().B) {
         if (this.aW) {
            this.aW = false;
            int $$1 = this.u();
            this.aS = (long)(this.ai + $$1);
         }

         if (this.aX) {
            this.aX = false;
            this.aT = this.s();
         }

         if (this.o) {
            this.o = false;
            boolean $$2 = this.aT != 0;
            if ($$2 && this.aY != null) {
               this.aY = this.a(this.aY, this.aU);
            } else {
               this.aY = this.H();
            }

            this.a($$2, this.aU);
         }

         if (this.aZ != null) {
            if (this.aZ.a == 0) {
               this.aZ.a(this);
               this.bu();
               this.aZ = null;
            } else {
               this.aZ.b(this);
               this.aZ.a--;
               if (this.aZ.a == 0) {
                  this.aZ = null;
               }
            }
         }
      }
   }

   protected abstract void a(boolean var1, float var2);

   @Override
   protected void a(ajw.a $$0) {
      $$0.a(s, 0);
      $$0.a(q, 0);
      $$0.a(r, 0);
      $$0.a(t, new Vector3f());
      $$0.a(u, new Vector3f(1.0F, 1.0F, 1.0F));
      $$0.a(aF, new Quaternionf());
      $$0.a(v, new Quaternionf());
      $$0.a(aG, brv.a.a.a());
      $$0.a(aH, -1);
      $$0.a(aI, 1.0F);
      $$0.a(aJ, 0.0F);
      $$0.a(aK, 1.0F);
      $$0.a(aL, 0.0F);
      $$0.a(aM, 0.0F);
      $$0.a(aN, -1);
   }

   @Override
   protected void a(ud $$0) {
      if ($$0.e("transformation")) {
         j.b.decode(ur.a, $$0.c("transformation")).resultOrPartial(ac.a("Display entity", p::error)).ifPresent($$0x -> this.a((j)$$0x.getFirst()));
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
         this.d(ayf.a($$3, 0, 59));
      }

      if ($$0.b("billboard", 8)) {
         brv.a.e.decode(ur.a, $$0.c("billboard")).resultOrPartial(ac.a("Display entity", p::error)).ifPresent($$0x -> this.a((brv.a)$$0x.getFirst()));
      }

      if ($$0.b("view_range", 99)) {
         this.b($$0.j("view_range"));
      }

      if ($$0.b("shadow_radius", 99)) {
         this.c($$0.j("shadow_radius"));
      }

      if ($$0.b("shadow_strength", 99)) {
         this.t($$0.j("shadow_strength"));
      }

      if ($$0.b("width", 99)) {
         this.u($$0.j("width"));
      }

      if ($$0.b("height", 99)) {
         this.v($$0.j("height"));
      }

      if ($$0.b("glow_color_override", 99)) {
         this.n($$0.h("glow_color_override"));
      }

      if ($$0.b("brightness", 10)) {
         awv.b.decode(ur.a, $$0.c("brightness")).resultOrPartial(ac.a("Display entity", p::error)).ifPresent($$0x -> this.a((awv)$$0x.getFirst()));
      } else {
         this.a(null);
      }
   }

   private void a(j $$0) {
      this.ao.a(t, $$0.d());
      this.ao.a(v, $$0.e());
      this.ao.a(u, $$0.f());
      this.ao.a(aF, $$0.g());
   }

   @Override
   protected void b(ud $$0) {
      j.b.encodeStart(ur.a, a(this.ao)).ifSuccess($$1x -> $$0.a("transformation", $$1x));
      brv.a.e.encodeStart(ur.a, this.w()).ifSuccess($$1x -> $$0.a("billboard", $$1x));
      $$0.a("interpolation_duration", this.s());
      $$0.a("teleport_duration", this.v());
      $$0.a("view_range", this.z());
      $$0.a("shadow_radius", this.A());
      $$0.a("shadow_strength", this.B());
      $$0.a("width", this.C());
      $$0.a("height", this.E());
      $$0.a("glow_color_override", this.D());
      awv $$1 = this.x();
      if ($$1 != null) {
         awv.b.encodeStart(ur.a, $$1).ifSuccess($$1x -> $$0.a("brightness", $$1x));
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      int $$6 = this.v();
      this.aZ = new brv.j($$6, $$0, $$1, $$2, (double)$$3, (double)$$4);
   }

   @Override
   public double c_() {
      return this.aZ != null ? this.aZ.b : this.du();
   }

   @Override
   public double d_() {
      return this.aZ != null ? this.aZ.c : this.dw();
   }

   @Override
   public double L_() {
      return this.aZ != null ? this.aZ.d : this.dA();
   }

   @Override
   public float M_() {
      return this.aZ != null ? (float)this.aZ.f : this.dH();
   }

   @Override
   public float e_() {
      return this.aZ != null ? (float)this.aZ.e : this.dF();
   }

   @Override
   public euh h_() {
      return this.aV;
   }

   @Override
   public enb k_() {
      return enb.d;
   }

   @Override
   public boolean r_() {
      return true;
   }

   @Nullable
   public brv.k p() {
      return this.aY;
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

   private int u() {
      return this.ao.a(q);
   }

   private void d(int $$0) {
      this.ao.a(s, $$0);
   }

   private int v() {
      return this.ao.a(s);
   }

   private void a(brv.a $$0) {
      this.ao.a(aG, $$0.a());
   }

   private brv.a w() {
      return brv.a.f.apply(this.ao.a(aG));
   }

   private void a(@Nullable awv $$0) {
      this.ao.a(aH, $$0 != null ? $$0.a() : -1);
   }

   @Nullable
   private awv x() {
      int $$0 = this.ao.a(aH);
      return $$0 != -1 ? awv.a($$0) : null;
   }

   private int y() {
      return this.ao.a(aH);
   }

   private void b(float $$0) {
      this.ao.a(aI, $$0);
   }

   private float z() {
      return this.ao.a(aI);
   }

   private void c(float $$0) {
      this.ao.a(aJ, $$0);
   }

   private float A() {
      return this.ao.a(aJ);
   }

   private void t(float $$0) {
      this.ao.a(aK, $$0);
   }

   private float B() {
      return this.ao.a(aK);
   }

   private void u(float $$0) {
      this.ao.a(aL, $$0);
   }

   private float C() {
      return this.ao.a(aL);
   }

   private void v(float $$0) {
      this.ao.a(aM, $$0);
   }

   private int D() {
      return this.ao.a(aN);
   }

   private void n(int $$0) {
      this.ao.a(aN, $$0);
   }

   public float a(float $$0) {
      int $$1 = this.aT;
      if ($$1 <= 0) {
         return 1.0F;
      } else {
         float $$2 = (float)((long)this.ai - this.aS);
         float $$3 = $$2 + $$0;
         float $$4 = ayf.a(ayf.g($$3, 0.0F, (float)$$1), 0.0F, 1.0F);
         this.aU = $$4;
         return $$4;
      }
   }

   private float E() {
      return this.ao.a(aM);
   }

   @Override
   public void a_(double $$0, double $$1, double $$2) {
      super.a_($$0, $$1, $$2);
      this.G();
   }

   private void G() {
      float $$0 = this.C();
      float $$1 = this.E();
      if ($$0 != 0.0F && $$1 != 0.0F) {
         this.au = false;
         float $$2 = $$0 / 2.0F;
         double $$3 = this.du();
         double $$4 = this.dw();
         double $$5 = this.dA();
         this.aV = new euh($$3 - (double)$$2, $$4, $$5 - (double)$$2, $$3 + (double)$$2, $$4 + (double)$$1, $$5 + (double)$$2);
      } else {
         this.au = true;
      }
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < ayf.k((double)this.z() * 64.0 * cD());
   }

   @Override
   public int i_() {
      int $$0 = this.D();
      return $$0 != -1 ? $$0 : super.i_();
   }

   private brv.k H() {
      return new brv.k(brv.e.constant(a(this.ao)), this.w(), this.y(), brv.d.constant(this.A()), brv.d.constant(this.B()), this.D());
   }

   private brv.k a(brv.k $$0, float $$1) {
      j $$2 = $$0.a.get($$1);
      float $$3 = $$0.d.get($$1);
      float $$4 = $$0.e.get($$1);
      return new brv.k(new brv.m($$2, a(this.ao)), this.w(), this.y(), new brv.h($$3, this.A()), new brv.h($$4, this.B()), this.D());
   }

   public static enum a implements ayz {
      a((byte)0, "fixed"),
      b((byte)1, "vertical"),
      c((byte)2, "horizontal"),
      d((byte)3, "center");

      public static final Codec<brv.a> e = ayz.a(brv.a::values);
      public static final IntFunction<brv.a> f = aww.a(brv.a::a, values(), aww.a.a);
      private final byte g;
      private final String h;

      private a(byte $$0, String $$1) {
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

   public static class b extends brv {
      public static final String p = "block_state";
      private static final ajs<drd> q = ajw.a(brv.b.class, aju.i);
      @Nullable
      private brv.b.a r;

      public b(bsc<?> $$0, daz $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a(ajw.a $$0) {
         super.a($$0);
         $$0.a(q, dec.a.n());
      }

      @Override
      public void a(ajs<?> $$0) {
         super.a($$0);
         if ($$0.equals(q)) {
            this.o = true;
         }
      }

      private drd u() {
         return this.ao.a(q);
      }

      private void c(drd $$0) {
         this.ao.a(q, $$0);
      }

      @Override
      protected void a(ud $$0) {
         super.a($$0);
         this.c(us.a(this.dP().a(lf.f), $$0.p("block_state")));
      }

      @Override
      protected void b(ud $$0) {
         super.b($$0);
         $$0.a("block_state", us.a(this.u()));
      }

      @Nullable
      public brv.b.a s() {
         return this.r;
      }

      @Override
      protected void a(boolean $$0, float $$1) {
         this.r = new brv.b.a(this.u());
      }

      public static record a(drd a) {
      }
   }

   static record c(int a, int b) implements brv.f {
      @Override
      public int get(float $$0) {
         return axp.b.a($$0, this.a, this.b);
      }
   }

   @FunctionalInterface
   public interface d {
      static brv.d constant(float $$0) {
         return $$1 -> $$0;
      }

      float get(float var1);
   }

   @FunctionalInterface
   public interface e<T> {
      static <T> brv.e<T> constant(T $$0) {
         return $$1 -> $$0;
      }

      T get(float var1);
   }

   @FunctionalInterface
   public interface f {
      static brv.f constant(int $$0) {
         return $$1 -> $$0;
      }

      int get(float var1);
   }

   public static class g extends brv {
      private static final String p = "item";
      private static final String q = "item_display";
      private static final ajs<ctq> r = ajw.a(brv.g.class, aju.h);
      private static final ajs<Byte> s = ajw.a(brv.g.class, aju.a);
      private final bti t = new bti() {
         @Override
         public ctq a() {
            return g.this.u();
         }

         @Override
         public boolean a(ctq $$0) {
            g.this.a($$0);
            return true;
         }
      };
      @Nullable
      private brv.g.a u;

      public g(bsc<?> $$0, daz $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a(ajw.a $$0) {
         super.a($$0);
         $$0.a(r, ctq.i);
         $$0.a(s, ctn.a.a());
      }

      @Override
      public void a(ajs<?> $$0) {
         super.a($$0);
         if (r.equals($$0) || s.equals($$0)) {
            this.o = true;
         }
      }

      ctq u() {
         return this.ao.a(r);
      }

      void a(ctq $$0) {
         this.ao.a(r, $$0);
      }

      private void a(ctn $$0) {
         this.ao.a(s, $$0.a());
      }

      private ctn v() {
         return ctn.k.apply(this.ao.a(s));
      }

      @Override
      protected void a(ud $$0) {
         super.a($$0);
         if ($$0.e("item")) {
            this.a(ctq.a(this.dR(), (va)$$0.p("item")).orElse(ctq.i));
         } else {
            this.a(ctq.i);
         }

         if ($$0.b("item_display", 8)) {
            ctn.j.decode(ur.a, $$0.c("item_display")).resultOrPartial(ac.a("Display entity", brv.p::error)).ifPresent($$0x -> this.a((ctn)$$0x.getFirst()));
         }
      }

      @Override
      protected void b(ud $$0) {
         super.b($$0);
         if (!this.u().e()) {
            $$0.a("item", this.u().a(this.dR()));
         }

         ctn.j.encodeStart(ur.a, this.v()).ifSuccess($$1 -> $$0.a("item_display", $$1));
      }

      @Override
      public bti a_(int $$0) {
         return $$0 == 0 ? this.t : bti.b;
      }

      @Nullable
      public brv.g.a s() {
         return this.u;
      }

      @Override
      protected void a(boolean $$0, float $$1) {
         ctq $$2 = this.u();
         $$2.a(this);
         this.u = new brv.g.a($$2, this.v());
      }

      public static record a(ctq a, ctn b) {
      }
   }

   static record h(float a, float b) implements brv.d {
      @Override
      public float get(float $$0) {
         return ayf.i($$0, this.a, this.b);
      }
   }

   static record i(int a, int b) implements brv.f {
      @Override
      public int get(float $$0) {
         return ayf.a($$0, this.a, this.b);
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

      void a(brw $$0) {
         $$0.a_(this.b, this.c, this.d);
         $$0.a((float)this.e, (float)this.f);
      }

      void b(brw $$0) {
         $$0.a(this.a, this.b, this.c, this.d, this.e, this.f);
      }
   }

   public static record k(brv.e<j> a, brv.a b, int c, brv.d d, brv.d e, int f) {
   }

   public static class l extends brv {
      public static final String p = "text";
      private static final String aF = "line_width";
      private static final String aG = "text_opacity";
      private static final String aH = "background";
      private static final String aI = "shadow";
      private static final String aJ = "see_through";
      private static final String aK = "default_background";
      private static final String aL = "alignment";
      public static final byte q = 1;
      public static final byte r = 2;
      public static final byte s = 4;
      public static final byte t = 8;
      public static final byte u = 16;
      private static final byte aM = -1;
      public static final int v = 1073741824;
      private static final ajs<wx> aN = ajw.a(brv.l.class, aju.f);
      private static final ajs<Integer> aO = ajw.a(brv.l.class, aju.b);
      private static final ajs<Integer> aP = ajw.a(brv.l.class, aju.b);
      private static final ajs<Byte> aQ = ajw.a(brv.l.class, aju.a);
      private static final ajs<Byte> aR = ajw.a(brv.l.class, aju.a);
      private static final IntSet aS = IntSet.of(new int[]{aN.a(), aO.a(), aP.a(), aQ.a(), aR.a()});
      @Nullable
      private brv.l.b aT;
      @Nullable
      private brv.l.e aU;

      public l(bsc<?> $$0, daz $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a(ajw.a $$0) {
         super.a($$0);
         $$0.a(aN, wx.i());
         $$0.a(aO, 200);
         $$0.a(aP, 1073741824);
         $$0.a(aQ, (byte)-1);
         $$0.a(aR, (byte)0);
      }

      @Override
      public void a(ajs<?> $$0) {
         super.a($$0);
         if (aS.contains($$0.a())) {
            this.o = true;
         }
      }

      private wx u() {
         return this.ao.a(aN);
      }

      private void c(wx $$0) {
         this.ao.a(aN, $$0);
      }

      private int v() {
         return this.ao.a(aO);
      }

      private void b(int $$0) {
         this.ao.a(aO, $$0);
      }

      private byte w() {
         return this.ao.a(aQ);
      }

      private void c(byte $$0) {
         this.ao.a(aQ, $$0);
      }

      private int x() {
         return this.ao.a(aP);
      }

      private void c(int $$0) {
         this.ao.a(aP, $$0);
      }

      private byte y() {
         return this.ao.a(aR);
      }

      private void d(byte $$0) {
         this.ao.a(aR, $$0);
      }

      private static byte a(byte $$0, ud $$1, String $$2, byte $$3) {
         return $$1.q($$2) ? (byte)($$0 | $$3) : $$0;
      }

      @Override
      protected void a(ud $$0) {
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
         Optional<brv.l.a> $$2 = brv.l.a.d.decode(ur.a, $$0.c("alignment")).resultOrPartial(ac.a("Display entity", brv.p::error)).map(Pair::getFirst);
         if ($$2.isPresent()) {
            $$1 = switch ((brv.l.a)$$2.get()) {
               case a -> $$1;
               case b -> (byte)($$1 | 8);
               case c -> (byte)($$1 | 16);
            };
         }

         this.d($$1);
         if ($$0.b("text", 8)) {
            String $$3 = $$0.l("text");

            try {
               wx $$4 = wx.a.a($$3, this.dR());
               if ($$4 != null) {
                  ee $$5 = this.dg().a(2);
                  wx $$6 = xa.a($$5, $$4, this, 0);
                  this.c($$6);
               } else {
                  this.c(wx.i());
               }
            } catch (Exception var8) {
               brv.p.warn("Failed to parse display entity text {}", $$3, var8);
            }
         }
      }

      private static void b(byte $$0, ud $$1, String $$2, byte $$3) {
         $$1.a($$2, ($$0 & $$3) != 0);
      }

      @Override
      protected void b(ud $$0) {
         super.b($$0);
         $$0.a("text", wx.a.a(this.u(), this.dR()));
         $$0.a("line_width", this.v());
         $$0.a("background", this.x());
         $$0.a("text_opacity", this.w());
         byte $$1 = this.y();
         b($$1, $$0, "shadow", (byte)1);
         b($$1, $$0, "see_through", (byte)2);
         b($$1, $$0, "default_background", (byte)4);
         brv.l.a.d.encodeStart(ur.a, a($$1)).ifSuccess($$1x -> $$0.a("alignment", $$1x));
      }

      @Override
      protected void a(boolean $$0, float $$1) {
         if ($$0 && this.aU != null) {
            this.aU = this.a(this.aU, $$1);
         } else {
            this.aU = this.z();
         }

         this.aT = null;
      }

      @Nullable
      public brv.l.e s() {
         return this.aU;
      }

      private brv.l.e z() {
         return new brv.l.e(this.u(), this.v(), brv.f.constant(this.w()), brv.f.constant(this.x()), this.y());
      }

      private brv.l.e a(brv.l.e $$0, float $$1) {
         int $$2 = $$0.d.get($$1);
         int $$3 = $$0.c.get($$1);
         return new brv.l.e(this.u(), this.v(), new brv.i($$3, this.w()), new brv.c($$2, this.x()), this.y());
      }

      public brv.l.b a(brv.l.d $$0) {
         if (this.aT == null) {
            if (this.aU != null) {
               this.aT = $$0.split(this.aU.a(), this.aU.b());
            } else {
               this.aT = new brv.l.b(List.of(), 0);
            }
         }

         return this.aT;
      }

      public static brv.l.a a(byte $$0) {
         if (($$0 & 8) != 0) {
            return brv.l.a.b;
         } else {
            return ($$0 & 16) != 0 ? brv.l.a.c : brv.l.a.a;
         }
      }

      public static enum a implements ayz {
         a("center"),
         b("left"),
         c("right");

         public static final Codec<brv.l.a> d = ayz.a(brv.l.a::values);
         private final String e;

         private a(String $$0) {
            this.e = $$0;
         }

         @Override
         public String c() {
            return this.e;
         }
      }

      public static record b(List<brv.l.c> a, int b) {
      }

      public static record c(axr a, int b) {
      }

      @FunctionalInterface
      public interface d {
         brv.l.b split(wx var1, int var2);
      }

      public static record e(wx a, int b, brv.f c, brv.f d, byte e) {
      }
   }

   static record m(j a, j b) implements brv.e<j> {
      public j a(float $$0) {
         return (double)$$0 >= 1.0 ? this.b : this.a.a(this.b, $$0);
      }
   }
}
