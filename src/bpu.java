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

public abstract class bpu extends bpv {
   static final Logger p = LogUtils.getLogger();
   public static final int b = -1;
   private static final aiy<Integer> q = ajc.a(bpu.class, aja.b);
   private static final aiy<Integer> r = ajc.a(bpu.class, aja.b);
   private static final aiy<Integer> s = ajc.a(bpu.class, aja.b);
   private static final aiy<Vector3f> t = ajc.a(bpu.class, aja.B);
   private static final aiy<Vector3f> u = ajc.a(bpu.class, aja.B);
   private static final aiy<Quaternionf> v = ajc.a(bpu.class, aja.C);
   private static final aiy<Quaternionf> aE = ajc.a(bpu.class, aja.C);
   private static final aiy<Byte> aF = ajc.a(bpu.class, aja.a);
   private static final aiy<Integer> aG = ajc.a(bpu.class, aja.b);
   private static final aiy<Float> aH = ajc.a(bpu.class, aja.d);
   private static final aiy<Float> aI = ajc.a(bpu.class, aja.d);
   private static final aiy<Float> aJ = ajc.a(bpu.class, aja.d);
   private static final aiy<Float> aK = ajc.a(bpu.class, aja.d);
   private static final aiy<Float> aL = ajc.a(bpu.class, aja.d);
   private static final aiy<Integer> aM = ajc.a(bpu.class, aja.b);
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
   private erv aU;
   protected boolean o;
   private boolean aV;
   private boolean aW;
   @Nullable
   private bpu.k aX;
   @Nullable
   private bpu.j aY;

   public bpu(bqb<?> $$0, cyx $$1) {
      super($$0, $$1);
      this.af = true;
      this.at = true;
      this.aU = this.cH();
   }

   @Override
   public void a(aiy<?> $$0) {
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

   private static j a(ajc $$0) {
      Vector3f $$1 = $$0.a(t);
      Quaternionf $$2 = $$0.a(v);
      Vector3f $$3 = $$0.a(u);
      Quaternionf $$4 = $$0.a(aE);
      return new j($$1, $$2, $$3, $$4);
   }

   @Override
   public void l() {
      bpv $$0 = this.cZ();
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
   protected void a(ajc.a $$0) {
      $$0.a(s, 0);
      $$0.a(q, 0);
      $$0.a(r, 0);
      $$0.a(t, new Vector3f());
      $$0.a(u, new Vector3f(1.0F, 1.0F, 1.0F));
      $$0.a(aE, new Quaternionf());
      $$0.a(v, new Quaternionf());
      $$0.a(aF, bpu.a.a.a());
      $$0.a(aG, -1);
      $$0.a(aH, 1.0F);
      $$0.a(aI, 0.0F);
      $$0.a(aJ, 1.0F);
      $$0.a(aK, 0.0F);
      $$0.a(aL, 0.0F);
      $$0.a(aM, -1);
   }

   @Override
   protected void a(tm $$0) {
      if ($$0.e("transformation")) {
         j.b.decode(ua.a, $$0.c("transformation")).resultOrPartial(ac.a("Display entity", p::error)).ifPresent($$0x -> this.a((j)$$0x.getFirst()));
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
         this.d(axk.a($$3, 0, 59));
      }

      if ($$0.b("billboard", 8)) {
         bpu.a.e.decode(ua.a, $$0.c("billboard")).resultOrPartial(ac.a("Display entity", p::error)).ifPresent($$0x -> this.a((bpu.a)$$0x.getFirst()));
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
         awa.b.decode(ua.a, $$0.c("brightness")).resultOrPartial(ac.a("Display entity", p::error)).ifPresent($$0x -> this.a((awa)$$0x.getFirst()));
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
   protected void b(tm $$0) {
      j.b.encodeStart(ua.a, a(this.an)).result().ifPresent($$1x -> $$0.a("transformation", $$1x));
      bpu.a.e.encodeStart(ua.a, this.w()).result().ifPresent($$1x -> $$0.a("billboard", $$1x));
      $$0.a("interpolation_duration", this.r());
      $$0.a("teleport_duration", this.v());
      $$0.a("view_range", this.z());
      $$0.a("shadow_radius", this.A());
      $$0.a("shadow_strength", this.B());
      $$0.a("width", this.C());
      $$0.a("height", this.E());
      $$0.a("glow_color_override", this.D());
      awa $$1 = this.x();
      if ($$1 != null) {
         awa.b.encodeStart(ua.a, $$1).result().ifPresent($$1x -> $$0.a("brightness", $$1x));
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      int $$6 = this.v();
      this.aY = new bpu.j($$6, $$0, $$1, $$2, (double)$$3, (double)$$4);
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
   public erv h_() {
      return this.aU;
   }

   @Override
   public ekx k_() {
      return ekx.d;
   }

   @Override
   public boolean r_() {
      return true;
   }

   @Nullable
   public bpu.k p() {
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

   private void a(bpu.a $$0) {
      this.an.a(aF, $$0.a());
   }

   private bpu.a w() {
      return bpu.a.f.apply(this.an.a(aF));
   }

   private void a(@Nullable awa $$0) {
      this.an.a(aG, $$0 != null ? $$0.a() : -1);
   }

   @Nullable
   private awa x() {
      int $$0 = this.an.a(aG);
      return $$0 != -1 ? awa.a($$0) : null;
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
         float $$4 = axk.a(axk.g($$3, 0.0F, (float)$$1), 0.0F, 1.0F);
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
         this.aU = new erv($$3 - (double)$$2, $$4, $$5 - (double)$$2, $$3 + (double)$$2, $$4 + (double)$$1, $$5 + (double)$$2);
      } else {
         this.at = true;
      }
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < axk.k((double)this.z() * 64.0 * cA());
   }

   @Override
   public int i_() {
      int $$0 = this.D();
      return $$0 != -1 ? $$0 : super.i_();
   }

   private bpu.k H() {
      return new bpu.k(bpu.e.constant(a(this.an)), this.w(), this.y(), bpu.d.constant(this.A()), bpu.d.constant(this.B()), this.D());
   }

   private bpu.k a(bpu.k $$0, float $$1) {
      j $$2 = $$0.a.get($$1);
      float $$3 = $$0.d.get($$1);
      float $$4 = $$0.e.get($$1);
      return new bpu.k(new bpu.m($$2, a(this.an)), this.w(), this.y(), new bpu.h($$3, this.A()), new bpu.h($$4, this.B()), this.D());
   }

   public static enum a implements aye {
      a((byte)0, "fixed"),
      b((byte)1, "vertical"),
      c((byte)2, "horizontal"),
      d((byte)3, "center");

      public static final Codec<bpu.a> e = aye.a(bpu.a::values);
      public static final IntFunction<bpu.a> f = awb.a(bpu.a::a, values(), awb.a.a);
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

   public static class b extends bpu {
      public static final String p = "block_state";
      private static final aiy<doz> q = ajc.a(bpu.b.class, aja.i);
      @Nullable
      private bpu.b.a r;

      public b(bqb<?> $$0, cyx $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a(ajc.a $$0) {
         super.a($$0);
         $$0.a(q, dca.a.n());
      }

      @Override
      public void a(aiy<?> $$0) {
         super.a($$0);
         if ($$0.equals(q)) {
            this.o = true;
         }
      }

      private doz u() {
         return this.an.a(q);
      }

      private void c(doz $$0) {
         this.an.a(q, $$0);
      }

      @Override
      protected void a(tm $$0) {
         super.a($$0);
         this.c(ub.a(this.dM().a(ks.f), $$0.p("block_state")));
      }

      @Override
      protected void b(tm $$0) {
         super.b($$0);
         $$0.a("block_state", ub.a(this.u()));
      }

      @Nullable
      public bpu.b.a r() {
         return this.r;
      }

      @Override
      protected void a(boolean $$0, float $$1) {
         this.r = new bpu.b.a(this.u());
      }

      public static record a(doz a) {
      }
   }

   static record c(int a, int b) implements bpu.f {
      @Override
      public int get(float $$0) {
         return awu.b.a($$0, this.a, this.b);
      }
   }

   @FunctionalInterface
   public interface d {
      static bpu.d constant(float $$0) {
         return $$1 -> $$0;
      }

      float get(float var1);
   }

   @FunctionalInterface
   public interface e<T> {
      static <T> bpu.e<T> constant(T $$0) {
         return $$1 -> $$0;
      }

      T get(float var1);
   }

   @FunctionalInterface
   public interface f {
      static bpu.f constant(int $$0) {
         return $$1 -> $$0;
      }

      int get(float var1);
   }

   public static class g extends bpu {
      private static final String p = "item";
      private static final String q = "item_display";
      private static final aiy<crj> r = ajc.a(bpu.g.class, aja.h);
      private static final aiy<Byte> s = ajc.a(bpu.g.class, aja.a);
      private final brf t = new brf() {
         @Override
         public crj a() {
            return g.this.u();
         }

         @Override
         public boolean a(crj $$0) {
            g.this.a($$0);
            return true;
         }
      };
      @Nullable
      private bpu.g.a u;

      public g(bqb<?> $$0, cyx $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a(ajc.a $$0) {
         super.a($$0);
         $$0.a(r, crj.i);
         $$0.a(s, crg.a.a());
      }

      @Override
      public void a(aiy<?> $$0) {
         super.a($$0);
         if (r.equals($$0) || s.equals($$0)) {
            this.o = true;
         }
      }

      crj u() {
         return this.an.a(r);
      }

      void a(crj $$0) {
         this.an.a(r, $$0);
      }

      private void a(crg $$0) {
         this.an.a(s, $$0.a());
      }

      private crg v() {
         return crg.k.apply(this.an.a(s));
      }

      @Override
      protected void a(tm $$0) {
         super.a($$0);
         if ($$0.e("item")) {
            this.a(crj.a(this.dO(), (uj)$$0.p("item")).orElse(crj.i));
         } else {
            this.a(crj.i);
         }

         if ($$0.b("item_display", 8)) {
            crg.j.decode(ua.a, $$0.c("item_display")).resultOrPartial(ac.a("Display entity", bpu.p::error)).ifPresent($$0x -> this.a((crg)$$0x.getFirst()));
         }
      }

      @Override
      protected void b(tm $$0) {
         super.b($$0);
         if (!this.u().d()) {
            $$0.a("item", this.u().a(this.dO()));
         }

         crg.j.encodeStart(ua.a, this.v()).result().ifPresent($$1 -> $$0.a("item_display", $$1));
      }

      @Override
      public brf a_(int $$0) {
         return $$0 == 0 ? this.t : brf.b;
      }

      @Nullable
      public bpu.g.a r() {
         return this.u;
      }

      @Override
      protected void a(boolean $$0, float $$1) {
         crj $$2 = this.u();
         $$2.a(this);
         this.u = new bpu.g.a($$2, this.v());
      }

      public static record a(crj a, crg b) {
      }
   }

   static record h(float a, float b) implements bpu.d {
      @Override
      public float get(float $$0) {
         return axk.i($$0, this.a, this.b);
      }
   }

   static record i(int a, int b) implements bpu.f {
      @Override
      public int get(float $$0) {
         return axk.a($$0, this.a, this.b);
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

      void a(bpv $$0) {
         $$0.a_(this.b, this.c, this.d);
         $$0.a((float)this.e, (float)this.f);
      }

      void b(bpv $$0) {
         $$0.a(this.a, this.b, this.c, this.d, this.e, this.f);
      }
   }

   public static record k(bpu.e<j> a, bpu.a b, int c, bpu.d d, bpu.d e, int f) {
   }

   public static class l extends bpu {
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
      private static final aiy<wg> aM = ajc.a(bpu.l.class, aja.f);
      private static final aiy<Integer> aN = ajc.a(bpu.l.class, aja.b);
      private static final aiy<Integer> aO = ajc.a(bpu.l.class, aja.b);
      private static final aiy<Byte> aP = ajc.a(bpu.l.class, aja.a);
      private static final aiy<Byte> aQ = ajc.a(bpu.l.class, aja.a);
      private static final IntSet aR = IntSet.of(new int[]{aM.a(), aN.a(), aO.a(), aP.a(), aQ.a()});
      @Nullable
      private bpu.l.b aS;
      @Nullable
      private bpu.l.e aT;

      public l(bqb<?> $$0, cyx $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a(ajc.a $$0) {
         super.a($$0);
         $$0.a(aM, wg.i());
         $$0.a(aN, 200);
         $$0.a(aO, 1073741824);
         $$0.a(aP, (byte)-1);
         $$0.a(aQ, (byte)0);
      }

      @Override
      public void a(aiy<?> $$0) {
         super.a($$0);
         if (aR.contains($$0.a())) {
            this.o = true;
         }
      }

      private wg u() {
         return this.an.a(aM);
      }

      private void c(wg $$0) {
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

      private static byte a(byte $$0, tm $$1, String $$2, byte $$3) {
         return $$1.q($$2) ? (byte)($$0 | $$3) : $$0;
      }

      @Override
      protected void a(tm $$0) {
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
         Optional<bpu.l.a> $$2 = bpu.l.a.d.decode(ua.a, $$0.c("alignment")).resultOrPartial(ac.a("Display entity", bpu.p::error)).map(Pair::getFirst);
         if ($$2.isPresent()) {
            $$1 = switch ((bpu.l.a)$$2.get()) {
               case a -> $$1;
               case b -> (byte)($$1 | 8);
               case c -> (byte)($$1 | 16);
            };
         }

         this.d($$1);
         if ($$0.b("text", 8)) {
            String $$3 = $$0.l("text");

            try {
               wg $$4 = wg.a.a($$3, this.dO());
               if ($$4 != null) {
                  du $$5 = this.dd().a(2);
                  wg $$6 = wj.a($$5, $$4, this, 0);
                  this.c($$6);
               } else {
                  this.c(wg.i());
               }
            } catch (Exception var8) {
               bpu.p.warn("Failed to parse display entity text {}", $$3, var8);
            }
         }
      }

      private static void b(byte $$0, tm $$1, String $$2, byte $$3) {
         $$1.a($$2, ($$0 & $$3) != 0);
      }

      @Override
      protected void b(tm $$0) {
         super.b($$0);
         $$0.a("text", wg.a.a(this.u(), this.dO()));
         $$0.a("line_width", this.v());
         $$0.a("background", this.x());
         $$0.a("text_opacity", this.w());
         byte $$1 = this.y();
         b($$1, $$0, "shadow", (byte)1);
         b($$1, $$0, "see_through", (byte)2);
         b($$1, $$0, "default_background", (byte)4);
         bpu.l.a.d.encodeStart(ua.a, a($$1)).result().ifPresent($$1x -> $$0.a("alignment", $$1x));
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
      public bpu.l.e r() {
         return this.aT;
      }

      private bpu.l.e z() {
         return new bpu.l.e(this.u(), this.v(), bpu.f.constant(this.w()), bpu.f.constant(this.x()), this.y());
      }

      private bpu.l.e a(bpu.l.e $$0, float $$1) {
         int $$2 = $$0.d.get($$1);
         int $$3 = $$0.c.get($$1);
         return new bpu.l.e(this.u(), this.v(), new bpu.i($$3, this.w()), new bpu.c($$2, this.x()), this.y());
      }

      public bpu.l.b a(bpu.l.d $$0) {
         if (this.aS == null) {
            if (this.aT != null) {
               this.aS = $$0.split(this.aT.a(), this.aT.b());
            } else {
               this.aS = new bpu.l.b(List.of(), 0);
            }
         }

         return this.aS;
      }

      public static bpu.l.a a(byte $$0) {
         if (($$0 & 8) != 0) {
            return bpu.l.a.b;
         } else {
            return ($$0 & 16) != 0 ? bpu.l.a.c : bpu.l.a.a;
         }
      }

      public static enum a implements aye {
         a("center"),
         b("left"),
         c("right");

         public static final Codec<bpu.l.a> d = aye.a(bpu.l.a::values);
         private final String e;

         private a(String $$0) {
            this.e = $$0;
         }

         @Override
         public String c() {
            return this.e;
         }
      }

      public static record b(List<bpu.l.c> a, int b) {
      }

      public static record c(aww a, int b) {
      }

      @FunctionalInterface
      public interface d {
         bpu.l.b split(wg var1, int var2);
      }

      public static record e(wg a, int b, bpu.f c, bpu.f d, byte e) {
      }
   }

   static record m(j a, j b) implements bpu.e<j> {
      public j a(float $$0) {
         return (double)$$0 >= 1.0 ? this.b : this.a.a(this.b, $$0);
      }
   }
}
