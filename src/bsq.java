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

public abstract class bsq extends bsr {
   static final Logger p = LogUtils.getLogger();
   public static final int b = -1;
   private static final ajw<Integer> q = aka.a(bsq.class, ajy.b);
   private static final ajw<Integer> r = aka.a(bsq.class, ajy.b);
   private static final ajw<Integer> s = aka.a(bsq.class, ajy.b);
   private static final ajw<Vector3f> t = aka.a(bsq.class, ajy.D);
   private static final ajw<Vector3f> u = aka.a(bsq.class, ajy.D);
   private static final ajw<Quaternionf> v = aka.a(bsq.class, ajy.E);
   private static final ajw<Quaternionf> aD = aka.a(bsq.class, ajy.E);
   private static final ajw<Byte> aE = aka.a(bsq.class, ajy.a);
   private static final ajw<Integer> aF = aka.a(bsq.class, ajy.b);
   private static final ajw<Float> aG = aka.a(bsq.class, ajy.d);
   private static final ajw<Float> aH = aka.a(bsq.class, ajy.d);
   private static final ajw<Float> aI = aka.a(bsq.class, ajy.d);
   private static final ajw<Float> aJ = aka.a(bsq.class, ajy.d);
   private static final ajw<Float> aK = aka.a(bsq.class, ajy.d);
   private static final ajw<Integer> aL = aka.a(bsq.class, ajy.b);
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
   private ewx aT;
   protected boolean o;
   private boolean aU;
   private boolean aV;
   @Nullable
   private bsq.k aW;
   @Nullable
   private bsq.j aX;

   public bsq(bsx<?> $$0, dcw $$1) {
      super($$0, $$1);
      this.ag = true;
      this.au = true;
      this.aT = this.cK();
   }

   @Override
   public void a(ajw<?> $$0) {
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

   private static j a(aka $$0) {
      Vector3f $$1 = $$0.a(t);
      Quaternionf $$2 = $$0.a(v);
      Vector3f $$3 = $$0.a(u);
      Quaternionf $$4 = $$0.a(aD);
      return new j($$1, $$2, $$3, $$4);
   }

   @Override
   public void l() {
      bsr $$0 = this.dc();
      if ($$0 != null && $$0.dJ()) {
         this.ad();
      }

      if (this.dO().B) {
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
   protected void a(aka.a $$0) {
      $$0.a(s, 0);
      $$0.a(q, 0);
      $$0.a(r, 0);
      $$0.a(t, new Vector3f());
      $$0.a(u, new Vector3f(1.0F, 1.0F, 1.0F));
      $$0.a(aD, new Quaternionf());
      $$0.a(v, new Quaternionf());
      $$0.a(aE, bsq.a.a.a());
      $$0.a(aF, -1);
      $$0.a(aG, 1.0F);
      $$0.a(aH, 0.0F);
      $$0.a(aI, 1.0F);
      $$0.a(aJ, 0.0F);
      $$0.a(aK, 0.0F);
      $$0.a(aL, -1);
   }

   @Override
   protected void a(ub $$0) {
      if ($$0.e("transformation")) {
         j.b.decode(up.a, $$0.c("transformation")).resultOrPartial(ad.a("Display entity", p::error)).ifPresent($$0x -> this.a((j)$$0x.getFirst()));
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
         this.d(ayo.a($$3, 0, 59));
      }

      if ($$0.b("billboard", 8)) {
         bsq.a.e.decode(up.a, $$0.c("billboard")).resultOrPartial(ad.a("Display entity", p::error)).ifPresent($$0x -> this.a((bsq.a)$$0x.getFirst()));
      }

      if ($$0.b("view_range", 99)) {
         this.b($$0.j("view_range"));
      }

      if ($$0.b("shadow_radius", 99)) {
         this.c($$0.j("shadow_radius"));
      }

      if ($$0.b("shadow_strength", 99)) {
         this.v($$0.j("shadow_strength"));
      }

      if ($$0.b("width", 99)) {
         this.w($$0.j("width"));
      }

      if ($$0.b("height", 99)) {
         this.x($$0.j("height"));
      }

      if ($$0.b("glow_color_override", 99)) {
         this.m($$0.h("glow_color_override"));
      }

      if ($$0.b("brightness", 10)) {
         axd.b.decode(up.a, $$0.c("brightness")).resultOrPartial(ad.a("Display entity", p::error)).ifPresent($$0x -> this.a((axd)$$0x.getFirst()));
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
   protected void b(ub $$0) {
      j.b.encodeStart(up.a, a(this.ao)).ifSuccess($$1x -> $$0.a("transformation", $$1x));
      bsq.a.e.encodeStart(up.a, this.w()).ifSuccess($$1x -> $$0.a("billboard", $$1x));
      $$0.a("interpolation_duration", this.s());
      $$0.a("teleport_duration", this.v());
      $$0.a("view_range", this.z());
      $$0.a("shadow_radius", this.A());
      $$0.a("shadow_strength", this.B());
      $$0.a("width", this.C());
      $$0.a("height", this.E());
      $$0.a("glow_color_override", this.D());
      axd $$1 = this.x();
      if ($$1 != null) {
         axd.b.encodeStart(up.a, $$1).ifSuccess($$1x -> $$0.a("brightness", $$1x));
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      int $$6 = this.v();
      this.aX = new bsq.j($$6, $$0, $$1, $$2, (double)$$3, (double)$$4);
   }

   @Override
   public double c_() {
      return this.aX != null ? this.aX.b : this.dt();
   }

   @Override
   public double d_() {
      return this.aX != null ? this.aX.c : this.dv();
   }

   @Override
   public double P_() {
      return this.aX != null ? this.aX.d : this.dz();
   }

   @Override
   public float Q_() {
      return this.aX != null ? (float)this.aX.f : this.dG();
   }

   @Override
   public float e_() {
      return this.aX != null ? (float)this.aX.e : this.dE();
   }

   @Override
   public ewx h_() {
      return this.aT;
   }

   @Override
   public epj j_() {
      return epj.d;
   }

   @Override
   public boolean r_() {
      return true;
   }

   @Nullable
   public bsq.k p() {
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

   private void a(bsq.a $$0) {
      this.ao.a(aE, $$0.a());
   }

   private bsq.a w() {
      return bsq.a.f.apply(this.ao.a(aE));
   }

   private void a(@Nullable axd $$0) {
      this.ao.a(aF, $$0 != null ? $$0.a() : -1);
   }

   @Nullable
   private axd x() {
      int $$0 = this.ao.a(aF);
      return $$0 != -1 ? axd.a($$0) : null;
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

   private void v(float $$0) {
      this.ao.a(aI, $$0);
   }

   private float B() {
      return this.ao.a(aI);
   }

   private void w(float $$0) {
      this.ao.a(aJ, $$0);
   }

   private float C() {
      return this.ao.a(aJ);
   }

   private void x(float $$0) {
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
         float $$4 = ayo.a(ayo.g($$3, 0.0F, (float)$$1), 0.0F, 1.0F);
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
         double $$3 = this.dt();
         double $$4 = this.dv();
         double $$5 = this.dz();
         this.aT = new ewx($$3 - (double)$$2, $$4, $$5 - (double)$$2, $$3 + (double)$$2, $$4 + (double)$$1, $$5 + (double)$$2);
      } else {
         this.au = true;
      }
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < ayo.k((double)this.z() * 64.0 * cD());
   }

   @Override
   public int q_() {
      int $$0 = this.D();
      return $$0 != -1 ? $$0 : super.q_();
   }

   private bsq.k H() {
      return new bsq.k(bsq.e.constant(a(this.ao)), this.w(), this.y(), bsq.d.constant(this.A()), bsq.d.constant(this.B()), this.D());
   }

   private bsq.k a(bsq.k $$0, float $$1) {
      j $$2 = $$0.a.get($$1);
      float $$3 = $$0.d.get($$1);
      float $$4 = $$0.e.get($$1);
      return new bsq.k(new bsq.m($$2, a(this.ao)), this.w(), this.y(), new bsq.h($$3, this.A()), new bsq.h($$4, this.B()), this.D());
   }

   public static enum a implements azk {
      a((byte)0, "fixed"),
      b((byte)1, "vertical"),
      c((byte)2, "horizontal"),
      d((byte)3, "center");

      public static final Codec<bsq.a> e = azk.a(bsq.a::values);
      public static final IntFunction<bsq.a> f = axe.a(bsq.a::a, values(), axe.a.a);
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

   public static class b extends bsq {
      public static final String p = "block_state";
      private static final ajw<dtc> q = aka.a(bsq.b.class, ajy.i);
      @Nullable
      private bsq.b.a r;

      public b(bsx<?> $$0, dcw $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a(aka.a $$0) {
         super.a($$0);
         $$0.a(q, dga.a.o());
      }

      @Override
      public void a(ajw<?> $$0) {
         super.a($$0);
         if ($$0.equals(q)) {
            this.o = true;
         }
      }

      private dtc t() {
         return this.ao.a(q);
      }

      private void c(dtc $$0) {
         this.ao.a(q, $$0);
      }

      @Override
      protected void a(ub $$0) {
         super.a($$0);
         this.c(uq.a(this.dO().a(lu.f), $$0.p("block_state")));
      }

      @Override
      protected void b(ub $$0) {
         super.b($$0);
         $$0.a("block_state", uq.a(this.t()));
      }

      @Nullable
      public bsq.b.a s() {
         return this.r;
      }

      @Override
      protected void a(boolean $$0, float $$1) {
         this.r = new bsq.b.a(this.t());
      }

      public static record a(dtc a) {
      }
   }

   static record c(int a, int b) implements bsq.f {
      @Override
      public int get(float $$0) {
         return axy.b.a($$0, this.a, this.b);
      }
   }

   @FunctionalInterface
   public interface d {
      static bsq.d constant(float $$0) {
         return $$1 -> $$0;
      }

      float get(float var1);
   }

   @FunctionalInterface
   public interface e<T> {
      static <T> bsq.e<T> constant(T $$0) {
         return $$1 -> $$0;
      }

      T get(float var1);
   }

   @FunctionalInterface
   public interface f {
      static bsq.f constant(int $$0) {
         return $$1 -> $$0;
      }

      int get(float var1);
   }

   public static class g extends bsq {
      private static final String p = "item";
      private static final String q = "item_display";
      private static final ajw<cuq> r = aka.a(bsq.g.class, ajy.h);
      private static final ajw<Byte> s = aka.a(bsq.g.class, ajy.a);
      private final bug t = bug.a(this::t, this::a);
      @Nullable
      private bsq.g.a u;

      public g(bsx<?> $$0, dcw $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a(aka.a $$0) {
         super.a($$0);
         $$0.a(r, cuq.l);
         $$0.a(s, cun.a.a());
      }

      @Override
      public void a(ajw<?> $$0) {
         super.a($$0);
         if (r.equals($$0) || s.equals($$0)) {
            this.o = true;
         }
      }

      private cuq t() {
         return this.ao.a(r);
      }

      private void a(cuq $$0) {
         this.ao.a(r, $$0);
      }

      private void a(cun $$0) {
         this.ao.a(s, $$0.a());
      }

      private cun v() {
         return cun.k.apply(this.ao.a(s));
      }

      @Override
      protected void a(ub $$0) {
         super.a($$0);
         if ($$0.e("item")) {
            this.a(cuq.a(this.dQ(), (uy)$$0.p("item")).orElse(cuq.l));
         } else {
            this.a(cuq.l);
         }

         if ($$0.b("item_display", 8)) {
            cun.j.decode(up.a, $$0.c("item_display")).resultOrPartial(ad.a("Display entity", bsq.p::error)).ifPresent($$0x -> this.a((cun)$$0x.getFirst()));
         }
      }

      @Override
      protected void b(ub $$0) {
         super.b($$0);
         if (!this.t().e()) {
            $$0.a("item", this.t().a(this.dQ()));
         }

         cun.j.encodeStart(up.a, this.v()).ifSuccess($$1 -> $$0.a("item_display", $$1));
      }

      @Override
      public bug a_(int $$0) {
         return $$0 == 0 ? this.t : bug.a;
      }

      @Nullable
      public bsq.g.a s() {
         return this.u;
      }

      @Override
      protected void a(boolean $$0, float $$1) {
         cuq $$2 = this.t();
         $$2.a(this);
         this.u = new bsq.g.a($$2, this.v());
      }

      public static record a(cuq a, cun b) {
      }
   }

   static record h(float a, float b) implements bsq.d {
      @Override
      public float get(float $$0) {
         return ayo.i($$0, this.a, this.b);
      }
   }

   static record i(int a, int b) implements bsq.f {
      @Override
      public int get(float $$0) {
         return ayo.a($$0, this.a, this.b);
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

      void a(bsr $$0) {
         $$0.a_(this.b, this.c, this.d);
         $$0.a((float)this.e, (float)this.f);
      }

      void b(bsr $$0) {
         $$0.a(this.a, this.b, this.c, this.d, this.e, this.f);
      }
   }

   public static record k(bsq.e<j> a, bsq.a b, int c, bsq.d d, bsq.d e, int f) {
   }

   public static class l extends bsq {
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
      private static final ajw<wz> aL = aka.a(bsq.l.class, ajy.f);
      private static final ajw<Integer> aM = aka.a(bsq.l.class, ajy.b);
      private static final ajw<Integer> aN = aka.a(bsq.l.class, ajy.b);
      private static final ajw<Byte> aO = aka.a(bsq.l.class, ajy.a);
      private static final ajw<Byte> aP = aka.a(bsq.l.class, ajy.a);
      private static final IntSet aQ = IntSet.of(new int[]{aL.a(), aM.a(), aN.a(), aO.a(), aP.a()});
      @Nullable
      private bsq.l.b aR;
      @Nullable
      private bsq.l.e aS;

      public l(bsx<?> $$0, dcw $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a(aka.a $$0) {
         super.a($$0);
         $$0.a(aL, wz.i());
         $$0.a(aM, 200);
         $$0.a(aN, 1073741824);
         $$0.a(aO, (byte)-1);
         $$0.a(aP, (byte)0);
      }

      @Override
      public void a(ajw<?> $$0) {
         super.a($$0);
         if (aQ.contains($$0.a())) {
            this.o = true;
         }
      }

      private wz t() {
         return this.ao.a(aL);
      }

      private void c(wz $$0) {
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

      private static byte a(byte $$0, ub $$1, String $$2, byte $$3) {
         return $$1.q($$2) ? (byte)($$0 | $$3) : $$0;
      }

      @Override
      protected void a(ub $$0) {
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
         Optional<bsq.l.a> $$2 = bsq.l.a.d.decode(up.a, $$0.c("alignment")).resultOrPartial(ad.a("Display entity", bsq.p::error)).map(Pair::getFirst);
         if ($$2.isPresent()) {
            $$1 = switch ((bsq.l.a)$$2.get()) {
               case a -> $$1;
               case b -> (byte)($$1 | 8);
               case c -> (byte)($$1 | 16);
            };
         }

         this.d($$1);
         if ($$0.b("text", 8)) {
            String $$3 = $$0.l("text");

            try {
               wz $$4 = wz.a.a($$3, this.dQ());
               if ($$4 != null) {
                  et $$5 = this.dg().a(2);
                  wz $$6 = xc.a($$5, $$4, this, 0);
                  this.c($$6);
               } else {
                  this.c(wz.i());
               }
            } catch (Exception var8) {
               bsq.p.warn("Failed to parse display entity text {}", $$3, var8);
            }
         }
      }

      private static void b(byte $$0, ub $$1, String $$2, byte $$3) {
         $$1.a($$2, ($$0 & $$3) != 0);
      }

      @Override
      protected void b(ub $$0) {
         super.b($$0);
         $$0.a("text", wz.a.a(this.t(), this.dQ()));
         $$0.a("line_width", this.v());
         $$0.a("background", this.x());
         $$0.a("text_opacity", this.w());
         byte $$1 = this.y();
         b($$1, $$0, "shadow", (byte)1);
         b($$1, $$0, "see_through", (byte)2);
         b($$1, $$0, "default_background", (byte)4);
         bsq.l.a.d.encodeStart(up.a, a($$1)).ifSuccess($$1x -> $$0.a("alignment", $$1x));
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
      public bsq.l.e s() {
         return this.aS;
      }

      private bsq.l.e z() {
         return new bsq.l.e(this.t(), this.v(), bsq.f.constant(this.w()), bsq.f.constant(this.x()), this.y());
      }

      private bsq.l.e a(bsq.l.e $$0, float $$1) {
         int $$2 = $$0.d.get($$1);
         int $$3 = $$0.c.get($$1);
         return new bsq.l.e(this.t(), this.v(), new bsq.i($$3, this.w()), new bsq.c($$2, this.x()), this.y());
      }

      public bsq.l.b a(bsq.l.d $$0) {
         if (this.aR == null) {
            if (this.aS != null) {
               this.aR = $$0.split(this.aS.a(), this.aS.b());
            } else {
               this.aR = new bsq.l.b(List.of(), 0);
            }
         }

         return this.aR;
      }

      public static bsq.l.a a(byte $$0) {
         if (($$0 & 8) != 0) {
            return bsq.l.a.b;
         } else {
            return ($$0 & 16) != 0 ? bsq.l.a.c : bsq.l.a.a;
         }
      }

      public static enum a implements azk {
         a("center"),
         b("left"),
         c("right");

         public static final Codec<bsq.l.a> d = azk.a(bsq.l.a::values);
         private final String e;

         private a(final String $$0) {
            this.e = $$0;
         }

         @Override
         public String c() {
            return this.e;
         }
      }

      public static record b(List<bsq.l.c> a, int b) {
      }

      public static record c(aya a, int b) {
      }

      @FunctionalInterface
      public interface d {
         bsq.l.b split(wz var1, int var2);
      }

      public static record e(wz a, int b, bsq.f c, bsq.f d, byte e) {
      }
   }

   static record m(j a, j b) implements bsq.e<j> {
      public j a(float $$0) {
         return (double)$$0 >= 1.0 ? this.b : this.a.a(this.b, $$0);
      }
   }
}
