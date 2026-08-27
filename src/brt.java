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

public abstract class brt extends bru {
   static final Logger p = LogUtils.getLogger();
   public static final int b = -1;
   private static final ajr<Integer> q = ajv.a(brt.class, ajt.b);
   private static final ajr<Integer> r = ajv.a(brt.class, ajt.b);
   private static final ajr<Integer> s = ajv.a(brt.class, ajt.b);
   private static final ajr<Vector3f> t = ajv.a(brt.class, ajt.D);
   private static final ajr<Vector3f> u = ajv.a(brt.class, ajt.D);
   private static final ajr<Quaternionf> v = ajv.a(brt.class, ajt.E);
   private static final ajr<Quaternionf> aF = ajv.a(brt.class, ajt.E);
   private static final ajr<Byte> aG = ajv.a(brt.class, ajt.a);
   private static final ajr<Integer> aH = ajv.a(brt.class, ajt.b);
   private static final ajr<Float> aI = ajv.a(brt.class, ajt.d);
   private static final ajr<Float> aJ = ajv.a(brt.class, ajt.d);
   private static final ajr<Float> aK = ajv.a(brt.class, ajt.d);
   private static final ajr<Float> aL = ajv.a(brt.class, ajt.d);
   private static final ajr<Float> aM = ajv.a(brt.class, ajt.d);
   private static final ajr<Integer> aN = ajv.a(brt.class, ajt.b);
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
   private euf aV;
   protected boolean o;
   private boolean aW;
   private boolean aX;
   @Nullable
   private brt.k aY;
   @Nullable
   private brt.j aZ;

   public brt(bsa<?> $$0, dax $$1) {
      super($$0, $$1);
      this.ag = true;
      this.au = true;
      this.aV = this.cK();
   }

   @Override
   public void a(ajr<?> $$0) {
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

   private static j a(ajv $$0) {
      Vector3f $$1 = $$0.a(t);
      Quaternionf $$2 = $$0.a(v);
      Vector3f $$3 = $$0.a(u);
      Quaternionf $$4 = $$0.a(aF);
      return new j($$1, $$2, $$3, $$4);
   }

   @Override
   public void l() {
      bru $$0 = this.dc();
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
   protected void a(ajv.a $$0) {
      $$0.a(s, 0);
      $$0.a(q, 0);
      $$0.a(r, 0);
      $$0.a(t, new Vector3f());
      $$0.a(u, new Vector3f(1.0F, 1.0F, 1.0F));
      $$0.a(aF, new Quaternionf());
      $$0.a(v, new Quaternionf());
      $$0.a(aG, brt.a.a.a());
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
         this.d(ayd.a($$3, 0, 59));
      }

      if ($$0.b("billboard", 8)) {
         brt.a.e.decode(ur.a, $$0.c("billboard")).resultOrPartial(ac.a("Display entity", p::error)).ifPresent($$0x -> this.a((brt.a)$$0x.getFirst()));
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
         awu.b.decode(ur.a, $$0.c("brightness")).resultOrPartial(ac.a("Display entity", p::error)).ifPresent($$0x -> this.a((awu)$$0x.getFirst()));
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
      brt.a.e.encodeStart(ur.a, this.w()).ifSuccess($$1x -> $$0.a("billboard", $$1x));
      $$0.a("interpolation_duration", this.s());
      $$0.a("teleport_duration", this.v());
      $$0.a("view_range", this.z());
      $$0.a("shadow_radius", this.A());
      $$0.a("shadow_strength", this.B());
      $$0.a("width", this.C());
      $$0.a("height", this.E());
      $$0.a("glow_color_override", this.D());
      awu $$1 = this.x();
      if ($$1 != null) {
         awu.b.encodeStart(ur.a, $$1).ifSuccess($$1x -> $$0.a("brightness", $$1x));
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      int $$6 = this.v();
      this.aZ = new brt.j($$6, $$0, $$1, $$2, (double)$$3, (double)$$4);
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
   public euf h_() {
      return this.aV;
   }

   @Override
   public emz k_() {
      return emz.d;
   }

   @Override
   public boolean r_() {
      return true;
   }

   @Nullable
   public brt.k p() {
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

   private void a(brt.a $$0) {
      this.ao.a(aG, $$0.a());
   }

   private brt.a w() {
      return brt.a.f.apply(this.ao.a(aG));
   }

   private void a(@Nullable awu $$0) {
      this.ao.a(aH, $$0 != null ? $$0.a() : -1);
   }

   @Nullable
   private awu x() {
      int $$0 = this.ao.a(aH);
      return $$0 != -1 ? awu.a($$0) : null;
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
         float $$4 = ayd.a(ayd.g($$3, 0.0F, (float)$$1), 0.0F, 1.0F);
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
         this.aV = new euf($$3 - (double)$$2, $$4, $$5 - (double)$$2, $$3 + (double)$$2, $$4 + (double)$$1, $$5 + (double)$$2);
      } else {
         this.au = true;
      }
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < ayd.k((double)this.z() * 64.0 * cD());
   }

   @Override
   public int i_() {
      int $$0 = this.D();
      return $$0 != -1 ? $$0 : super.i_();
   }

   private brt.k H() {
      return new brt.k(brt.e.constant(a(this.ao)), this.w(), this.y(), brt.d.constant(this.A()), brt.d.constant(this.B()), this.D());
   }

   private brt.k a(brt.k $$0, float $$1) {
      j $$2 = $$0.a.get($$1);
      float $$3 = $$0.d.get($$1);
      float $$4 = $$0.e.get($$1);
      return new brt.k(new brt.m($$2, a(this.ao)), this.w(), this.y(), new brt.h($$3, this.A()), new brt.h($$4, this.B()), this.D());
   }

   public static enum a implements ayx {
      a((byte)0, "fixed"),
      b((byte)1, "vertical"),
      c((byte)2, "horizontal"),
      d((byte)3, "center");

      public static final Codec<brt.a> e = ayx.a(brt.a::values);
      public static final IntFunction<brt.a> f = awv.a(brt.a::a, values(), awv.a.a);
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

   public static class b extends brt {
      public static final String p = "block_state";
      private static final ajr<drb> q = ajv.a(brt.b.class, ajt.i);
      @Nullable
      private brt.b.a r;

      public b(bsa<?> $$0, dax $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a(ajv.a $$0) {
         super.a($$0);
         $$0.a(q, dea.a.n());
      }

      @Override
      public void a(ajr<?> $$0) {
         super.a($$0);
         if ($$0.equals(q)) {
            this.o = true;
         }
      }

      private drb u() {
         return this.ao.a(q);
      }

      private void c(drb $$0) {
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
      public brt.b.a s() {
         return this.r;
      }

      @Override
      protected void a(boolean $$0, float $$1) {
         this.r = new brt.b.a(this.u());
      }

      public static record a(drb a) {
      }
   }

   static record c(int a, int b) implements brt.f {
      @Override
      public int get(float $$0) {
         return axo.b.a($$0, this.a, this.b);
      }
   }

   @FunctionalInterface
   public interface d {
      static brt.d constant(float $$0) {
         return $$1 -> $$0;
      }

      float get(float var1);
   }

   @FunctionalInterface
   public interface e<T> {
      static <T> brt.e<T> constant(T $$0) {
         return $$1 -> $$0;
      }

      T get(float var1);
   }

   @FunctionalInterface
   public interface f {
      static brt.f constant(int $$0) {
         return $$1 -> $$0;
      }

      int get(float var1);
   }

   public static class g extends brt {
      private static final String p = "item";
      private static final String q = "item_display";
      private static final ajr<cto> r = ajv.a(brt.g.class, ajt.h);
      private static final ajr<Byte> s = ajv.a(brt.g.class, ajt.a);
      private final btg t = new btg() {
         @Override
         public cto a() {
            return g.this.u();
         }

         @Override
         public boolean a(cto $$0) {
            g.this.a($$0);
            return true;
         }
      };
      @Nullable
      private brt.g.a u;

      public g(bsa<?> $$0, dax $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a(ajv.a $$0) {
         super.a($$0);
         $$0.a(r, cto.i);
         $$0.a(s, ctl.a.a());
      }

      @Override
      public void a(ajr<?> $$0) {
         super.a($$0);
         if (r.equals($$0) || s.equals($$0)) {
            this.o = true;
         }
      }

      cto u() {
         return this.ao.a(r);
      }

      void a(cto $$0) {
         this.ao.a(r, $$0);
      }

      private void a(ctl $$0) {
         this.ao.a(s, $$0.a());
      }

      private ctl v() {
         return ctl.k.apply(this.ao.a(s));
      }

      @Override
      protected void a(ud $$0) {
         super.a($$0);
         if ($$0.e("item")) {
            this.a(cto.a(this.dR(), (va)$$0.p("item")).orElse(cto.i));
         } else {
            this.a(cto.i);
         }

         if ($$0.b("item_display", 8)) {
            ctl.j.decode(ur.a, $$0.c("item_display")).resultOrPartial(ac.a("Display entity", brt.p::error)).ifPresent($$0x -> this.a((ctl)$$0x.getFirst()));
         }
      }

      @Override
      protected void b(ud $$0) {
         super.b($$0);
         if (!this.u().e()) {
            $$0.a("item", this.u().a(this.dR()));
         }

         ctl.j.encodeStart(ur.a, this.v()).ifSuccess($$1 -> $$0.a("item_display", $$1));
      }

      @Override
      public btg a_(int $$0) {
         return $$0 == 0 ? this.t : btg.b;
      }

      @Nullable
      public brt.g.a s() {
         return this.u;
      }

      @Override
      protected void a(boolean $$0, float $$1) {
         cto $$2 = this.u();
         $$2.a(this);
         this.u = new brt.g.a($$2, this.v());
      }

      public static record a(cto a, ctl b) {
      }
   }

   static record h(float a, float b) implements brt.d {
      @Override
      public float get(float $$0) {
         return ayd.i($$0, this.a, this.b);
      }
   }

   static record i(int a, int b) implements brt.f {
      @Override
      public int get(float $$0) {
         return ayd.a($$0, this.a, this.b);
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

      void a(bru $$0) {
         $$0.a_(this.b, this.c, this.d);
         $$0.a((float)this.e, (float)this.f);
      }

      void b(bru $$0) {
         $$0.a(this.a, this.b, this.c, this.d, this.e, this.f);
      }
   }

   public static record k(brt.e<j> a, brt.a b, int c, brt.d d, brt.d e, int f) {
   }

   public static class l extends brt {
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
      private static final ajr<wx> aN = ajv.a(brt.l.class, ajt.f);
      private static final ajr<Integer> aO = ajv.a(brt.l.class, ajt.b);
      private static final ajr<Integer> aP = ajv.a(brt.l.class, ajt.b);
      private static final ajr<Byte> aQ = ajv.a(brt.l.class, ajt.a);
      private static final ajr<Byte> aR = ajv.a(brt.l.class, ajt.a);
      private static final IntSet aS = IntSet.of(new int[]{aN.a(), aO.a(), aP.a(), aQ.a(), aR.a()});
      @Nullable
      private brt.l.b aT;
      @Nullable
      private brt.l.e aU;

      public l(bsa<?> $$0, dax $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a(ajv.a $$0) {
         super.a($$0);
         $$0.a(aN, wx.i());
         $$0.a(aO, 200);
         $$0.a(aP, 1073741824);
         $$0.a(aQ, (byte)-1);
         $$0.a(aR, (byte)0);
      }

      @Override
      public void a(ajr<?> $$0) {
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
         Optional<brt.l.a> $$2 = brt.l.a.d.decode(ur.a, $$0.c("alignment")).resultOrPartial(ac.a("Display entity", brt.p::error)).map(Pair::getFirst);
         if ($$2.isPresent()) {
            $$1 = switch ((brt.l.a)$$2.get()) {
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
               brt.p.warn("Failed to parse display entity text {}", $$3, var8);
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
         brt.l.a.d.encodeStart(ur.a, a($$1)).ifSuccess($$1x -> $$0.a("alignment", $$1x));
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
      public brt.l.e s() {
         return this.aU;
      }

      private brt.l.e z() {
         return new brt.l.e(this.u(), this.v(), brt.f.constant(this.w()), brt.f.constant(this.x()), this.y());
      }

      private brt.l.e a(brt.l.e $$0, float $$1) {
         int $$2 = $$0.d.get($$1);
         int $$3 = $$0.c.get($$1);
         return new brt.l.e(this.u(), this.v(), new brt.i($$3, this.w()), new brt.c($$2, this.x()), this.y());
      }

      public brt.l.b a(brt.l.d $$0) {
         if (this.aT == null) {
            if (this.aU != null) {
               this.aT = $$0.split(this.aU.a(), this.aU.b());
            } else {
               this.aT = new brt.l.b(List.of(), 0);
            }
         }

         return this.aT;
      }

      public static brt.l.a a(byte $$0) {
         if (($$0 & 8) != 0) {
            return brt.l.a.b;
         } else {
            return ($$0 & 16) != 0 ? brt.l.a.c : brt.l.a.a;
         }
      }

      public static enum a implements ayx {
         a("center"),
         b("left"),
         c("right");

         public static final Codec<brt.l.a> d = ayx.a(brt.l.a::values);
         private final String e;

         private a(String $$0) {
            this.e = $$0;
         }

         @Override
         public String c() {
            return this.e;
         }
      }

      public static record b(List<brt.l.c> a, int b) {
      }

      public static record c(axq a, int b) {
      }

      @FunctionalInterface
      public interface d {
         brt.l.b split(wx var1, int var2);
      }

      public static record e(wx a, int b, brt.f c, brt.f d, byte e) {
      }
   }

   static record m(j a, j b) implements brt.e<j> {
      public j a(float $$0) {
         return (double)$$0 >= 1.0 ? this.b : this.a.a(this.b, $$0);
      }
   }
}
