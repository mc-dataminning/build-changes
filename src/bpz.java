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

public abstract class bpz extends bqa {
   static final Logger p = LogUtils.getLogger();
   public static final int b = -1;
   private static final aja<Integer> q = aje.a(bpz.class, ajc.b);
   private static final aja<Integer> r = aje.a(bpz.class, ajc.b);
   private static final aja<Integer> s = aje.a(bpz.class, ajc.b);
   private static final aja<Vector3f> t = aje.a(bpz.class, ajc.C);
   private static final aja<Vector3f> u = aje.a(bpz.class, ajc.C);
   private static final aja<Quaternionf> v = aje.a(bpz.class, ajc.D);
   private static final aja<Quaternionf> aE = aje.a(bpz.class, ajc.D);
   private static final aja<Byte> aF = aje.a(bpz.class, ajc.a);
   private static final aja<Integer> aG = aje.a(bpz.class, ajc.b);
   private static final aja<Float> aH = aje.a(bpz.class, ajc.d);
   private static final aja<Float> aI = aje.a(bpz.class, ajc.d);
   private static final aja<Float> aJ = aje.a(bpz.class, ajc.d);
   private static final aja<Float> aK = aje.a(bpz.class, ajc.d);
   private static final aja<Float> aL = aje.a(bpz.class, ajc.d);
   private static final aja<Integer> aM = aje.a(bpz.class, ajc.b);
   private static final IntSet aN = IntSet.of(new int[]{t.a(), u.a(), v.a(), aE.a(), aF.a(), aG.a(), aI.a(), aJ.a()});
   private static final float aO = 0.0F;
   private static final float aP = 1.0F;
   private static final int aQ = -1;
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
   private long aR = -2147483648L;
   private int aS;
   private float aT;
   private ese aU;
   protected boolean o;
   private boolean aV;
   private boolean aW;
   @Nullable
   private bpz.k aX;
   @Nullable
   private bpz.j aY;

   public bpz(bqg<?> $$0, czg $$1) {
      super($$0, $$1);
      this.af = true;
      this.at = true;
      this.aU = this.cH();
   }

   @Override
   public void a(aja<?> $$0) {
      super.a($$0);
      if (aL.equals($$0) || aK.equals($$0)) {
         this.G();
      }

      if (q.equals($$0)) {
         this.aV = true;
      }

      if (r.equals($$0)) {
         this.aW = true;
      }

      if (aN.contains($$0.a())) {
         this.o = true;
      }
   }

   private static j a(aje $$0) {
      Vector3f $$1 = $$0.a(t);
      Quaternionf $$2 = $$0.a(v);
      Vector3f $$3 = $$0.a(u);
      Quaternionf $$4 = $$0.a(aE);
      return new j($$1, $$2, $$3, $$4);
   }

   @Override
   public void l() {
      bqa $$0 = this.cZ();
      if ($$0 != null && $$0.dH()) {
         this.ac();
      }

      if (this.dM().B) {
         if (this.aV) {
            this.aV = false;
            int $$1 = this.u();
            this.aR = (long)(this.ah + $$1);
         }

         if (this.aW) {
            this.aW = false;
            this.aS = this.r();
         }

         if (this.o) {
            this.o = false;
            boolean $$2 = this.aS != 0;
            if ($$2 && this.aX != null) {
               this.aX = this.a(this.aX, this.aT);
            } else {
               this.aX = this.H();
            }

            this.a($$2, this.aT);
         }

         if (this.aY != null) {
            if (this.aY.a == 0) {
               this.aY.a(this);
               this.bs();
               this.aY = null;
            } else {
               this.aY.b(this);
               this.aY.a--;
               if (this.aY.a == 0) {
                  this.aY = null;
               }
            }
         }
      }
   }

   protected abstract void a(boolean var1, float var2);

   @Override
   protected void a(aje.a $$0) {
      $$0.a(s, 0);
      $$0.a(q, 0);
      $$0.a(r, 0);
      $$0.a(t, new Vector3f());
      $$0.a(u, new Vector3f(1.0F, 1.0F, 1.0F));
      $$0.a(aE, new Quaternionf());
      $$0.a(v, new Quaternionf());
      $$0.a(aF, bpz.a.a.a());
      $$0.a(aG, -1);
      $$0.a(aH, 1.0F);
      $$0.a(aI, 0.0F);
      $$0.a(aJ, 1.0F);
      $$0.a(aK, 0.0F);
      $$0.a(aL, 0.0F);
      $$0.a(aM, -1);
   }

   @Override
   protected void a(to $$0) {
      if ($$0.e("transformation")) {
         j.b.decode(uc.a, $$0.c("transformation")).resultOrPartial(ac.a("Display entity", p::error)).ifPresent($$0x -> this.a((j)$$0x.getFirst()));
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
         this.d(axm.a($$3, 0, 59));
      }

      if ($$0.b("billboard", 8)) {
         bpz.a.e.decode(uc.a, $$0.c("billboard")).resultOrPartial(ac.a("Display entity", p::error)).ifPresent($$0x -> this.a((bpz.a)$$0x.getFirst()));
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
         awc.b.decode(uc.a, $$0.c("brightness")).resultOrPartial(ac.a("Display entity", p::error)).ifPresent($$0x -> this.a((awc)$$0x.getFirst()));
      } else {
         this.a(null);
      }
   }

   private void a(j $$0) {
      this.an.a(t, $$0.d());
      this.an.a(v, $$0.e());
      this.an.a(u, $$0.f());
      this.an.a(aE, $$0.g());
   }

   @Override
   protected void b(to $$0) {
      j.b.encodeStart(uc.a, a(this.an)).result().ifPresent($$1x -> $$0.a("transformation", $$1x));
      bpz.a.e.encodeStart(uc.a, this.w()).result().ifPresent($$1x -> $$0.a("billboard", $$1x));
      $$0.a("interpolation_duration", this.r());
      $$0.a("teleport_duration", this.v());
      $$0.a("view_range", this.z());
      $$0.a("shadow_radius", this.A());
      $$0.a("shadow_strength", this.B());
      $$0.a("width", this.C());
      $$0.a("height", this.E());
      $$0.a("glow_color_override", this.D());
      awc $$1 = this.x();
      if ($$1 != null) {
         awc.b.encodeStart(uc.a, $$1).result().ifPresent($$1x -> $$0.a("brightness", $$1x));
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      int $$6 = this.v();
      this.aY = new bpz.j($$6, $$0, $$1, $$2, (double)$$3, (double)$$4);
   }

   @Override
   public double c_() {
      return this.aY != null ? this.aY.b : this.dr();
   }

   @Override
   public double d_() {
      return this.aY != null ? this.aY.c : this.dt();
   }

   @Override
   public double L_() {
      return this.aY != null ? this.aY.d : this.dx();
   }

   @Override
   public float M_() {
      return this.aY != null ? (float)this.aY.f : this.dE();
   }

   @Override
   public float e_() {
      return this.aY != null ? (float)this.aY.e : this.dC();
   }

   @Override
   public ese h_() {
      return this.aU;
   }

   @Override
   public elg k_() {
      return elg.d;
   }

   @Override
   public boolean r_() {
      return true;
   }

   @Nullable
   public bpz.k p() {
      return this.aX;
   }

   private void b(int $$0) {
      this.an.a(r, $$0);
   }

   private int r() {
      return this.an.a(r);
   }

   private void c(int $$0) {
      this.an.a(q, $$0, true);
   }

   private int u() {
      return this.an.a(q);
   }

   private void d(int $$0) {
      this.an.a(s, $$0);
   }

   private int v() {
      return this.an.a(s);
   }

   private void a(bpz.a $$0) {
      this.an.a(aF, $$0.a());
   }

   private bpz.a w() {
      return bpz.a.f.apply(this.an.a(aF));
   }

   private void a(@Nullable awc $$0) {
      this.an.a(aG, $$0 != null ? $$0.a() : -1);
   }

   @Nullable
   private awc x() {
      int $$0 = this.an.a(aG);
      return $$0 != -1 ? awc.a($$0) : null;
   }

   private int y() {
      return this.an.a(aG);
   }

   private void b(float $$0) {
      this.an.a(aH, $$0);
   }

   private float z() {
      return this.an.a(aH);
   }

   private void c(float $$0) {
      this.an.a(aI, $$0);
   }

   private float A() {
      return this.an.a(aI);
   }

   private void t(float $$0) {
      this.an.a(aJ, $$0);
   }

   private float B() {
      return this.an.a(aJ);
   }

   private void u(float $$0) {
      this.an.a(aK, $$0);
   }

   private float C() {
      return this.an.a(aK);
   }

   private void v(float $$0) {
      this.an.a(aL, $$0);
   }

   private int D() {
      return this.an.a(aM);
   }

   private void n(int $$0) {
      this.an.a(aM, $$0);
   }

   public float a(float $$0) {
      int $$1 = this.aS;
      if ($$1 <= 0) {
         return 1.0F;
      } else {
         float $$2 = (float)((long)this.ah - this.aR);
         float $$3 = $$2 + $$0;
         float $$4 = axm.a(axm.g($$3, 0.0F, (float)$$1), 0.0F, 1.0F);
         this.aT = $$4;
         return $$4;
      }
   }

   private float E() {
      return this.an.a(aL);
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
         this.at = false;
         float $$2 = $$0 / 2.0F;
         double $$3 = this.dr();
         double $$4 = this.dt();
         double $$5 = this.dx();
         this.aU = new ese($$3 - (double)$$2, $$4, $$5 - (double)$$2, $$3 + (double)$$2, $$4 + (double)$$1, $$5 + (double)$$2);
      } else {
         this.at = true;
      }
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < axm.k((double)this.z() * 64.0 * cA());
   }

   @Override
   public int i_() {
      int $$0 = this.D();
      return $$0 != -1 ? $$0 : super.i_();
   }

   private bpz.k H() {
      return new bpz.k(bpz.e.constant(a(this.an)), this.w(), this.y(), bpz.d.constant(this.A()), bpz.d.constant(this.B()), this.D());
   }

   private bpz.k a(bpz.k $$0, float $$1) {
      j $$2 = $$0.a.get($$1);
      float $$3 = $$0.d.get($$1);
      float $$4 = $$0.e.get($$1);
      return new bpz.k(new bpz.m($$2, a(this.an)), this.w(), this.y(), new bpz.h($$3, this.A()), new bpz.h($$4, this.B()), this.D());
   }

   public static enum a implements ayg {
      a((byte)0, "fixed"),
      b((byte)1, "vertical"),
      c((byte)2, "horizontal"),
      d((byte)3, "center");

      public static final Codec<bpz.a> e = ayg.a(bpz.a::values);
      public static final IntFunction<bpz.a> f = awd.a(bpz.a::a, values(), awd.a.a);
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

   public static class b extends bpz {
      public static final String p = "block_state";
      private static final aja<dpi> q = aje.a(bpz.b.class, ajc.i);
      @Nullable
      private bpz.b.a r;

      public b(bqg<?> $$0, czg $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a(aje.a $$0) {
         super.a($$0);
         $$0.a(q, dcj.a.n());
      }

      @Override
      public void a(aja<?> $$0) {
         super.a($$0);
         if ($$0.equals(q)) {
            this.o = true;
         }
      }

      private dpi u() {
         return this.an.a(q);
      }

      private void c(dpi $$0) {
         this.an.a(q, $$0);
      }

      @Override
      protected void a(to $$0) {
         super.a($$0);
         this.c(ud.a(this.dM().a(ku.f), $$0.p("block_state")));
      }

      @Override
      protected void b(to $$0) {
         super.b($$0);
         $$0.a("block_state", ud.a(this.u()));
      }

      @Nullable
      public bpz.b.a r() {
         return this.r;
      }

      @Override
      protected void a(boolean $$0, float $$1) {
         this.r = new bpz.b.a(this.u());
      }

      public static record a(dpi a) {
      }
   }

   static record c(int a, int b) implements bpz.f {
      @Override
      public int get(float $$0) {
         return aww.b.a($$0, this.a, this.b);
      }
   }

   @FunctionalInterface
   public interface d {
      static bpz.d constant(float $$0) {
         return $$1 -> $$0;
      }

      float get(float var1);
   }

   @FunctionalInterface
   public interface e<T> {
      static <T> bpz.e<T> constant(T $$0) {
         return $$1 -> $$0;
      }

      T get(float var1);
   }

   @FunctionalInterface
   public interface f {
      static bpz.f constant(int $$0) {
         return $$1 -> $$0;
      }

      int get(float var1);
   }

   public static class g extends bpz {
      private static final String p = "item";
      private static final String q = "item_display";
      private static final aja<crs> r = aje.a(bpz.g.class, ajc.h);
      private static final aja<Byte> s = aje.a(bpz.g.class, ajc.a);
      private final brk t = new brk() {
         @Override
         public crs a() {
            return g.this.u();
         }

         @Override
         public boolean a(crs $$0) {
            g.this.a($$0);
            return true;
         }
      };
      @Nullable
      private bpz.g.a u;

      public g(bqg<?> $$0, czg $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a(aje.a $$0) {
         super.a($$0);
         $$0.a(r, crs.i);
         $$0.a(s, crp.a.a());
      }

      @Override
      public void a(aja<?> $$0) {
         super.a($$0);
         if (r.equals($$0) || s.equals($$0)) {
            this.o = true;
         }
      }

      crs u() {
         return this.an.a(r);
      }

      void a(crs $$0) {
         this.an.a(r, $$0);
      }

      private void a(crp $$0) {
         this.an.a(s, $$0.a());
      }

      private crp v() {
         return crp.k.apply(this.an.a(s));
      }

      @Override
      protected void a(to $$0) {
         super.a($$0);
         if ($$0.e("item")) {
            this.a(crs.a(this.dO(), (ul)$$0.p("item")).orElse(crs.i));
         } else {
            this.a(crs.i);
         }

         if ($$0.b("item_display", 8)) {
            crp.j.decode(uc.a, $$0.c("item_display")).resultOrPartial(ac.a("Display entity", bpz.p::error)).ifPresent($$0x -> this.a((crp)$$0x.getFirst()));
         }
      }

      @Override
      protected void b(to $$0) {
         super.b($$0);
         if (!this.u().d()) {
            $$0.a("item", this.u().a(this.dO()));
         }

         crp.j.encodeStart(uc.a, this.v()).result().ifPresent($$1 -> $$0.a("item_display", $$1));
      }

      @Override
      public brk a_(int $$0) {
         return $$0 == 0 ? this.t : brk.b;
      }

      @Nullable
      public bpz.g.a r() {
         return this.u;
      }

      @Override
      protected void a(boolean $$0, float $$1) {
         crs $$2 = this.u();
         $$2.a(this);
         this.u = new bpz.g.a($$2, this.v());
      }

      public static record a(crs a, crp b) {
      }
   }

   static record h(float a, float b) implements bpz.d {
      @Override
      public float get(float $$0) {
         return axm.i($$0, this.a, this.b);
      }
   }

   static record i(int a, int b) implements bpz.f {
      @Override
      public int get(float $$0) {
         return axm.a($$0, this.a, this.b);
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

      void a(bqa $$0) {
         $$0.a_(this.b, this.c, this.d);
         $$0.a((float)this.e, (float)this.f);
      }

      void b(bqa $$0) {
         $$0.a(this.a, this.b, this.c, this.d, this.e, this.f);
      }
   }

   public static record k(bpz.e<j> a, bpz.a b, int c, bpz.d d, bpz.d e, int f) {
   }

   public static class l extends bpz {
      public static final String p = "text";
      private static final String aE = "line_width";
      private static final String aF = "text_opacity";
      private static final String aG = "background";
      private static final String aH = "shadow";
      private static final String aI = "see_through";
      private static final String aJ = "default_background";
      private static final String aK = "alignment";
      public static final byte q = 1;
      public static final byte r = 2;
      public static final byte s = 4;
      public static final byte t = 8;
      public static final byte u = 16;
      private static final byte aL = -1;
      public static final int v = 1073741824;
      private static final aja<wi> aM = aje.a(bpz.l.class, ajc.f);
      private static final aja<Integer> aN = aje.a(bpz.l.class, ajc.b);
      private static final aja<Integer> aO = aje.a(bpz.l.class, ajc.b);
      private static final aja<Byte> aP = aje.a(bpz.l.class, ajc.a);
      private static final aja<Byte> aQ = aje.a(bpz.l.class, ajc.a);
      private static final IntSet aR = IntSet.of(new int[]{aM.a(), aN.a(), aO.a(), aP.a(), aQ.a()});
      @Nullable
      private bpz.l.b aS;
      @Nullable
      private bpz.l.e aT;

      public l(bqg<?> $$0, czg $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a(aje.a $$0) {
         super.a($$0);
         $$0.a(aM, wi.i());
         $$0.a(aN, 200);
         $$0.a(aO, 1073741824);
         $$0.a(aP, (byte)-1);
         $$0.a(aQ, (byte)0);
      }

      @Override
      public void a(aja<?> $$0) {
         super.a($$0);
         if (aR.contains($$0.a())) {
            this.o = true;
         }
      }

      private wi u() {
         return this.an.a(aM);
      }

      private void c(wi $$0) {
         this.an.a(aM, $$0);
      }

      private int v() {
         return this.an.a(aN);
      }

      private void b(int $$0) {
         this.an.a(aN, $$0);
      }

      private byte w() {
         return this.an.a(aP);
      }

      private void c(byte $$0) {
         this.an.a(aP, $$0);
      }

      private int x() {
         return this.an.a(aO);
      }

      private void c(int $$0) {
         this.an.a(aO, $$0);
      }

      private byte y() {
         return this.an.a(aQ);
      }

      private void d(byte $$0) {
         this.an.a(aQ, $$0);
      }

      private static byte a(byte $$0, to $$1, String $$2, byte $$3) {
         return $$1.q($$2) ? (byte)($$0 | $$3) : $$0;
      }

      @Override
      protected void a(to $$0) {
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
         Optional<bpz.l.a> $$2 = bpz.l.a.d.decode(uc.a, $$0.c("alignment")).resultOrPartial(ac.a("Display entity", bpz.p::error)).map(Pair::getFirst);
         if ($$2.isPresent()) {
            $$1 = switch ((bpz.l.a)$$2.get()) {
               case a -> $$1;
               case b -> (byte)($$1 | 8);
               case c -> (byte)($$1 | 16);
            };
         }

         this.d($$1);
         if ($$0.b("text", 8)) {
            String $$3 = $$0.l("text");

            try {
               wi $$4 = wi.a.a($$3, this.dO());
               if ($$4 != null) {
                  dv $$5 = this.dd().a(2);
                  wi $$6 = wl.a($$5, $$4, this, 0);
                  this.c($$6);
               } else {
                  this.c(wi.i());
               }
            } catch (Exception var8) {
               bpz.p.warn("Failed to parse display entity text {}", $$3, var8);
            }
         }
      }

      private static void b(byte $$0, to $$1, String $$2, byte $$3) {
         $$1.a($$2, ($$0 & $$3) != 0);
      }

      @Override
      protected void b(to $$0) {
         super.b($$0);
         $$0.a("text", wi.a.a(this.u(), this.dO()));
         $$0.a("line_width", this.v());
         $$0.a("background", this.x());
         $$0.a("text_opacity", this.w());
         byte $$1 = this.y();
         b($$1, $$0, "shadow", (byte)1);
         b($$1, $$0, "see_through", (byte)2);
         b($$1, $$0, "default_background", (byte)4);
         bpz.l.a.d.encodeStart(uc.a, a($$1)).result().ifPresent($$1x -> $$0.a("alignment", $$1x));
      }

      @Override
      protected void a(boolean $$0, float $$1) {
         if ($$0 && this.aT != null) {
            this.aT = this.a(this.aT, $$1);
         } else {
            this.aT = this.z();
         }

         this.aS = null;
      }

      @Nullable
      public bpz.l.e r() {
         return this.aT;
      }

      private bpz.l.e z() {
         return new bpz.l.e(this.u(), this.v(), bpz.f.constant(this.w()), bpz.f.constant(this.x()), this.y());
      }

      private bpz.l.e a(bpz.l.e $$0, float $$1) {
         int $$2 = $$0.d.get($$1);
         int $$3 = $$0.c.get($$1);
         return new bpz.l.e(this.u(), this.v(), new bpz.i($$3, this.w()), new bpz.c($$2, this.x()), this.y());
      }

      public bpz.l.b a(bpz.l.d $$0) {
         if (this.aS == null) {
            if (this.aT != null) {
               this.aS = $$0.split(this.aT.a(), this.aT.b());
            } else {
               this.aS = new bpz.l.b(List.of(), 0);
            }
         }

         return this.aS;
      }

      public static bpz.l.a a(byte $$0) {
         if (($$0 & 8) != 0) {
            return bpz.l.a.b;
         } else {
            return ($$0 & 16) != 0 ? bpz.l.a.c : bpz.l.a.a;
         }
      }

      public static enum a implements ayg {
         a("center"),
         b("left"),
         c("right");

         public static final Codec<bpz.l.a> d = ayg.a(bpz.l.a::values);
         private final String e;

         private a(String $$0) {
            this.e = $$0;
         }

         @Override
         public String c() {
            return this.e;
         }
      }

      public static record b(List<bpz.l.c> a, int b) {
      }

      public static record c(awy a, int b) {
      }

      @FunctionalInterface
      public interface d {
         bpz.l.b split(wi var1, int var2);
      }

      public static record e(wi a, int b, bpz.f c, bpz.f d, byte e) {
      }
   }

   static record m(j a, j b) implements bpz.e<j> {
      public j a(float $$0) {
         return (double)$$0 >= 1.0 ? this.b : this.a.a(this.b, $$0);
      }
   }
}
