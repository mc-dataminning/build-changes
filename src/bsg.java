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

public abstract class bsg extends bsh {
   static final Logger p = LogUtils.getLogger();
   public static final int b = -1;
   private static final ajp<Integer> q = ajt.a(bsg.class, ajr.b);
   private static final ajp<Integer> r = ajt.a(bsg.class, ajr.b);
   private static final ajp<Integer> s = ajt.a(bsg.class, ajr.b);
   private static final ajp<Vector3f> t = ajt.a(bsg.class, ajr.D);
   private static final ajp<Vector3f> u = ajt.a(bsg.class, ajr.D);
   private static final ajp<Quaternionf> v = ajt.a(bsg.class, ajr.E);
   private static final ajp<Quaternionf> aF = ajt.a(bsg.class, ajr.E);
   private static final ajp<Byte> aG = ajt.a(bsg.class, ajr.a);
   private static final ajp<Integer> aH = ajt.a(bsg.class, ajr.b);
   private static final ajp<Float> aI = ajt.a(bsg.class, ajr.d);
   private static final ajp<Float> aJ = ajt.a(bsg.class, ajr.d);
   private static final ajp<Float> aK = ajt.a(bsg.class, ajr.d);
   private static final ajp<Float> aL = ajt.a(bsg.class, ajr.d);
   private static final ajp<Float> aM = ajt.a(bsg.class, ajr.d);
   private static final ajp<Integer> aN = ajt.a(bsg.class, ajr.b);
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
   private ewc aV;
   protected boolean o;
   private boolean aW;
   private boolean aX;
   @Nullable
   private bsg.k aY;
   @Nullable
   private bsg.j aZ;

   public bsg(bsn<?> $$0, dcg $$1) {
      super($$0, $$1);
      this.ag = true;
      this.au = true;
      this.aV = this.cM();
   }

   @Override
   public void a(ajp<?> $$0) {
      super.a($$0);
      if (aM.equals($$0) || aL.equals($$0)) {
         this.F();
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

   private static j a(ajt $$0) {
      Vector3f $$1 = $$0.a(t);
      Quaternionf $$2 = $$0.a(v);
      Vector3f $$3 = $$0.a(u);
      Quaternionf $$4 = $$0.a(aF);
      return new j($$1, $$2, $$3, $$4);
   }

   @Override
   public void l() {
      bsh $$0 = this.de();
      if ($$0 != null && $$0.dM()) {
         this.ad();
      }

      if (this.dR().B) {
         if (this.aW) {
            this.aW = false;
            int $$1 = this.t();
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
               this.bw();
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
   protected void a(ajt.a $$0) {
      $$0.a(s, 0);
      $$0.a(q, 0);
      $$0.a(r, 0);
      $$0.a(t, new Vector3f());
      $$0.a(u, new Vector3f(1.0F, 1.0F, 1.0F));
      $$0.a(aF, new Quaternionf());
      $$0.a(v, new Quaternionf());
      $$0.a(aG, bsg.a.a.a());
      $$0.a(aH, -1);
      $$0.a(aI, 1.0F);
      $$0.a(aJ, 0.0F);
      $$0.a(aK, 1.0F);
      $$0.a(aL, 0.0F);
      $$0.a(aM, 0.0F);
      $$0.a(aN, -1);
   }

   @Override
   protected void a(tx $$0) {
      if ($$0.e("transformation")) {
         j.b.decode(ul.a, $$0.c("transformation")).resultOrPartial(ac.a("Display entity", p::error)).ifPresent($$0x -> this.a((j)$$0x.getFirst()));
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
         this.d(ayg.a($$3, 0, 59));
      }

      if ($$0.b("billboard", 8)) {
         bsg.a.e.decode(ul.a, $$0.c("billboard")).resultOrPartial(ac.a("Display entity", p::error)).ifPresent($$0x -> this.a((bsg.a)$$0x.getFirst()));
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
         awv.b.decode(ul.a, $$0.c("brightness")).resultOrPartial(ac.a("Display entity", p::error)).ifPresent($$0x -> this.a((awv)$$0x.getFirst()));
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
   protected void b(tx $$0) {
      j.b.encodeStart(ul.a, a(this.ao)).ifSuccess($$1x -> $$0.a("transformation", $$1x));
      bsg.a.e.encodeStart(ul.a, this.w()).ifSuccess($$1x -> $$0.a("billboard", $$1x));
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
         awv.b.encodeStart(ul.a, $$1).ifSuccess($$1x -> $$0.a("brightness", $$1x));
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      int $$6 = this.v();
      this.aZ = new bsg.j($$6, $$0, $$1, $$2, (double)$$3, (double)$$4);
   }

   @Override
   public double c_() {
      return this.aZ != null ? this.aZ.b : this.dw();
   }

   @Override
   public double d_() {
      return this.aZ != null ? this.aZ.c : this.dy();
   }

   @Override
   public double L_() {
      return this.aZ != null ? this.aZ.d : this.dC();
   }

   @Override
   public float M_() {
      return this.aZ != null ? (float)this.aZ.f : this.dJ();
   }

   @Override
   public float e_() {
      return this.aZ != null ? (float)this.aZ.e : this.dH();
   }

   @Override
   public ewc h_() {
      return this.aV;
   }

   @Override
   public eoo j_() {
      return eoo.d;
   }

   @Override
   public boolean r_() {
      return true;
   }

   @Nullable
   public bsg.k p() {
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

   private int t() {
      return this.ao.a(q);
   }

   private void d(int $$0) {
      this.ao.a(s, $$0);
   }

   private int v() {
      return this.ao.a(s);
   }

   private void a(bsg.a $$0) {
      this.ao.a(aG, $$0.a());
   }

   private bsg.a w() {
      return bsg.a.f.apply(this.ao.a(aG));
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

   private void u(float $$0) {
      this.ao.a(aK, $$0);
   }

   private float B() {
      return this.ao.a(aK);
   }

   private void v(float $$0) {
      this.ao.a(aL, $$0);
   }

   private float C() {
      return this.ao.a(aL);
   }

   private void w(float $$0) {
      this.ao.a(aM, $$0);
   }

   private int D() {
      return this.ao.a(aN);
   }

   private void m(int $$0) {
      this.ao.a(aN, $$0);
   }

   public float a(float $$0) {
      int $$1 = this.aT;
      if ($$1 <= 0) {
         return 1.0F;
      } else {
         float $$2 = (float)((long)this.ai - this.aS);
         float $$3 = $$2 + $$0;
         float $$4 = ayg.a(ayg.g($$3, 0.0F, (float)$$1), 0.0F, 1.0F);
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
      this.F();
   }

   private void F() {
      float $$0 = this.C();
      float $$1 = this.E();
      if ($$0 != 0.0F && $$1 != 0.0F) {
         this.au = false;
         float $$2 = $$0 / 2.0F;
         double $$3 = this.dw();
         double $$4 = this.dy();
         double $$5 = this.dC();
         this.aV = new ewc($$3 - (double)$$2, $$4, $$5 - (double)$$2, $$3 + (double)$$2, $$4 + (double)$$1, $$5 + (double)$$2);
      } else {
         this.au = true;
      }
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < ayg.k((double)this.z() * 64.0 * cF());
   }

   @Override
   public int q_() {
      int $$0 = this.D();
      return $$0 != -1 ? $$0 : super.q_();
   }

   private bsg.k H() {
      return new bsg.k(bsg.e.constant(a(this.ao)), this.w(), this.y(), bsg.d.constant(this.A()), bsg.d.constant(this.B()), this.D());
   }

   private bsg.k a(bsg.k $$0, float $$1) {
      j $$2 = $$0.a.get($$1);
      float $$3 = $$0.d.get($$1);
      float $$4 = $$0.e.get($$1);
      return new bsg.k(new bsg.m($$2, a(this.ao)), this.w(), this.y(), new bsg.h($$3, this.A()), new bsg.h($$4, this.B()), this.D());
   }

   public static enum a implements azc {
      a((byte)0, "fixed"),
      b((byte)1, "vertical"),
      c((byte)2, "horizontal"),
      d((byte)3, "center");

      public static final Codec<bsg.a> e = azc.a(bsg.a::values);
      public static final IntFunction<bsg.a> f = aww.a(bsg.a::a, values(), aww.a.a);
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

   public static class b extends bsg {
      public static final String p = "block_state";
      private static final ajp<dsl> q = ajt.a(bsg.b.class, ajr.i);
      @Nullable
      private bsg.b.a r;

      public b(bsn<?> $$0, dcg $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a(ajt.a $$0) {
         super.a($$0);
         $$0.a(q, dfk.a.o());
      }

      @Override
      public void a(ajp<?> $$0) {
         super.a($$0);
         if ($$0.equals(q)) {
            this.o = true;
         }
      }

      private dsl t() {
         return this.ao.a(q);
      }

      private void c(dsl $$0) {
         this.ao.a(q, $$0);
      }

      @Override
      protected void a(tx $$0) {
         super.a($$0);
         this.c(um.a(this.dR().a(lr.f), $$0.p("block_state")));
      }

      @Override
      protected void b(tx $$0) {
         super.b($$0);
         $$0.a("block_state", um.a(this.t()));
      }

      @Nullable
      public bsg.b.a s() {
         return this.r;
      }

      @Override
      protected void a(boolean $$0, float $$1) {
         this.r = new bsg.b.a(this.t());
      }

      public static record a(dsl a) {
      }
   }

   static record c(int a, int b) implements bsg.f {
      @Override
      public int get(float $$0) {
         return axq.b.a($$0, this.a, this.b);
      }
   }

   @FunctionalInterface
   public interface d {
      static bsg.d constant(float $$0) {
         return $$1 -> $$0;
      }

      float get(float var1);
   }

   @FunctionalInterface
   public interface e<T> {
      static <T> bsg.e<T> constant(T $$0) {
         return $$1 -> $$0;
      }

      T get(float var1);
   }

   @FunctionalInterface
   public interface f {
      static bsg.f constant(int $$0) {
         return $$1 -> $$0;
      }

      int get(float var1);
   }

   public static class g extends bsg {
      private static final String p = "item";
      private static final String q = "item_display";
      private static final ajp<cud> r = ajt.a(bsg.g.class, ajr.h);
      private static final ajp<Byte> s = ajt.a(bsg.g.class, ajr.a);
      private final btu t = btu.a(this::t, this::a);
      @Nullable
      private bsg.g.a u;

      public g(bsn<?> $$0, dcg $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a(ajt.a $$0) {
         super.a($$0);
         $$0.a(r, cud.l);
         $$0.a(s, cua.a.a());
      }

      @Override
      public void a(ajp<?> $$0) {
         super.a($$0);
         if (r.equals($$0) || s.equals($$0)) {
            this.o = true;
         }
      }

      private cud t() {
         return this.ao.a(r);
      }

      private void a(cud $$0) {
         this.ao.a(r, $$0);
      }

      private void a(cua $$0) {
         this.ao.a(s, $$0.a());
      }

      private cua v() {
         return cua.k.apply(this.ao.a(s));
      }

      @Override
      protected void a(tx $$0) {
         super.a($$0);
         if ($$0.e("item")) {
            this.a(cud.a(this.dT(), (uu)$$0.p("item")).orElse(cud.l));
         } else {
            this.a(cud.l);
         }

         if ($$0.b("item_display", 8)) {
            cua.j.decode(ul.a, $$0.c("item_display")).resultOrPartial(ac.a("Display entity", bsg.p::error)).ifPresent($$0x -> this.a((cua)$$0x.getFirst()));
         }
      }

      @Override
      protected void b(tx $$0) {
         super.b($$0);
         if (!this.t().e()) {
            $$0.a("item", this.t().a(this.dT()));
         }

         cua.j.encodeStart(ul.a, this.v()).ifSuccess($$1 -> $$0.a("item_display", $$1));
      }

      @Override
      public btu a_(int $$0) {
         return $$0 == 0 ? this.t : btu.a;
      }

      @Nullable
      public bsg.g.a s() {
         return this.u;
      }

      @Override
      protected void a(boolean $$0, float $$1) {
         cud $$2 = this.t();
         $$2.a(this);
         this.u = new bsg.g.a($$2, this.v());
      }

      public static record a(cud a, cua b) {
      }
   }

   static record h(float a, float b) implements bsg.d {
      @Override
      public float get(float $$0) {
         return ayg.i($$0, this.a, this.b);
      }
   }

   static record i(int a, int b) implements bsg.f {
      @Override
      public int get(float $$0) {
         return ayg.a($$0, this.a, this.b);
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

      void a(bsh $$0) {
         $$0.a_(this.b, this.c, this.d);
         $$0.a((float)this.e, (float)this.f);
      }

      void b(bsh $$0) {
         $$0.a(this.a, this.b, this.c, this.d, this.e, this.f);
      }
   }

   public static record k(bsg.e<j> a, bsg.a b, int c, bsg.d d, bsg.d e, int f) {
   }

   public static class l extends bsg {
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
      private static final ajp<wu> aN = ajt.a(bsg.l.class, ajr.f);
      private static final ajp<Integer> aO = ajt.a(bsg.l.class, ajr.b);
      private static final ajp<Integer> aP = ajt.a(bsg.l.class, ajr.b);
      private static final ajp<Byte> aQ = ajt.a(bsg.l.class, ajr.a);
      private static final ajp<Byte> aR = ajt.a(bsg.l.class, ajr.a);
      private static final IntSet aS = IntSet.of(new int[]{aN.a(), aO.a(), aP.a(), aQ.a(), aR.a()});
      @Nullable
      private bsg.l.b aT;
      @Nullable
      private bsg.l.e aU;

      public l(bsn<?> $$0, dcg $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a(ajt.a $$0) {
         super.a($$0);
         $$0.a(aN, wu.i());
         $$0.a(aO, 200);
         $$0.a(aP, 1073741824);
         $$0.a(aQ, (byte)-1);
         $$0.a(aR, (byte)0);
      }

      @Override
      public void a(ajp<?> $$0) {
         super.a($$0);
         if (aS.contains($$0.a())) {
            this.o = true;
         }
      }

      private wu t() {
         return this.ao.a(aN);
      }

      private void c(wu $$0) {
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

      private static byte a(byte $$0, tx $$1, String $$2, byte $$3) {
         return $$1.q($$2) ? (byte)($$0 | $$3) : $$0;
      }

      @Override
      protected void a(tx $$0) {
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
         Optional<bsg.l.a> $$2 = bsg.l.a.d.decode(ul.a, $$0.c("alignment")).resultOrPartial(ac.a("Display entity", bsg.p::error)).map(Pair::getFirst);
         if ($$2.isPresent()) {
            $$1 = switch ((bsg.l.a)$$2.get()) {
               case a -> $$1;
               case b -> (byte)($$1 | 8);
               case c -> (byte)($$1 | 16);
            };
         }

         this.d($$1);
         if ($$0.b("text", 8)) {
            String $$3 = $$0.l("text");

            try {
               wu $$4 = wu.a.a($$3, this.dT());
               if ($$4 != null) {
                  eq $$5 = this.di().a(2);
                  wu $$6 = wx.a($$5, $$4, this, 0);
                  this.c($$6);
               } else {
                  this.c(wu.i());
               }
            } catch (Exception var8) {
               bsg.p.warn("Failed to parse display entity text {}", $$3, var8);
            }
         }
      }

      private static void b(byte $$0, tx $$1, String $$2, byte $$3) {
         $$1.a($$2, ($$0 & $$3) != 0);
      }

      @Override
      protected void b(tx $$0) {
         super.b($$0);
         $$0.a("text", wu.a.a(this.t(), this.dT()));
         $$0.a("line_width", this.v());
         $$0.a("background", this.x());
         $$0.a("text_opacity", this.w());
         byte $$1 = this.y();
         b($$1, $$0, "shadow", (byte)1);
         b($$1, $$0, "see_through", (byte)2);
         b($$1, $$0, "default_background", (byte)4);
         bsg.l.a.d.encodeStart(ul.a, a($$1)).ifSuccess($$1x -> $$0.a("alignment", $$1x));
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
      public bsg.l.e s() {
         return this.aU;
      }

      private bsg.l.e z() {
         return new bsg.l.e(this.t(), this.v(), bsg.f.constant(this.w()), bsg.f.constant(this.x()), this.y());
      }

      private bsg.l.e a(bsg.l.e $$0, float $$1) {
         int $$2 = $$0.d.get($$1);
         int $$3 = $$0.c.get($$1);
         return new bsg.l.e(this.t(), this.v(), new bsg.i($$3, this.w()), new bsg.c($$2, this.x()), this.y());
      }

      public bsg.l.b a(bsg.l.d $$0) {
         if (this.aT == null) {
            if (this.aU != null) {
               this.aT = $$0.split(this.aU.a(), this.aU.b());
            } else {
               this.aT = new bsg.l.b(List.of(), 0);
            }
         }

         return this.aT;
      }

      public static bsg.l.a a(byte $$0) {
         if (($$0 & 8) != 0) {
            return bsg.l.a.b;
         } else {
            return ($$0 & 16) != 0 ? bsg.l.a.c : bsg.l.a.a;
         }
      }

      public static enum a implements azc {
         a("center"),
         b("left"),
         c("right");

         public static final Codec<bsg.l.a> d = azc.a(bsg.l.a::values);
         private final String e;

         private a(final String $$0) {
            this.e = $$0;
         }

         @Override
         public String c() {
            return this.e;
         }
      }

      public static record b(List<bsg.l.c> a, int b) {
      }

      public static record c(axs a, int b) {
      }

      @FunctionalInterface
      public interface d {
         bsg.l.b split(wu var1, int var2);
      }

      public static record e(wu a, int b, bsg.f c, bsg.f d, byte e) {
      }
   }

   static record m(j a, j b) implements bsg.e<j> {
      public j a(float $$0) {
         return (double)$$0 >= 1.0 ? this.b : this.a.a(this.b, $$0);
      }
   }
}
