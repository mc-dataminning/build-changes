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

public abstract class blv extends blw {
   static final Logger p = LogUtils.getLogger();
   public static final int b = -1;
   private static final agn<Integer> q = agq.a(blv.class, agp.b);
   private static final agn<Integer> r = agq.a(blv.class, agp.b);
   private static final agn<Integer> s = agq.a(blv.class, agp.b);
   private static final agn<Vector3f> t = agq.a(blv.class, agp.B);
   private static final agn<Vector3f> u = agq.a(blv.class, agp.B);
   private static final agn<Quaternionf> v = agq.a(blv.class, agp.C);
   private static final agn<Quaternionf> aE = agq.a(blv.class, agp.C);
   private static final agn<Byte> aF = agq.a(blv.class, agp.a);
   private static final agn<Integer> aG = agq.a(blv.class, agp.b);
   private static final agn<Float> aH = agq.a(blv.class, agp.d);
   private static final agn<Float> aI = agq.a(blv.class, agp.d);
   private static final agn<Float> aJ = agq.a(blv.class, agp.d);
   private static final agn<Float> aK = agq.a(blv.class, agp.d);
   private static final agn<Float> aL = agq.a(blv.class, agp.d);
   private static final agn<Integer> aM = agq.a(blv.class, agp.b);
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
   private elx aU;
   protected boolean o;
   private boolean aV;
   private boolean aW;
   @Nullable
   private blv.k aX;
   @Nullable
   private blv.j aY;

   public blv(bmc<?> $$0, ctx $$1) {
      super($$0, $$1);
      this.af = true;
      this.at = true;
      this.aU = this.cH();
   }

   @Override
   public void a(agn<?> $$0) {
      super.a($$0);
      if (aL.equals($$0) || aK.equals($$0)) {
         this.H();
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

   private static j a(agq $$0) {
      Vector3f $$1 = $$0.b(t);
      Quaternionf $$2 = $$0.b(v);
      Vector3f $$3 = $$0.b(u);
      Quaternionf $$4 = $$0.b(aE);
      return new j($$1, $$2, $$3, $$4);
   }

   @Override
   public void l() {
      blw $$0 = this.cZ();
      if ($$0 != null && $$0.dG()) {
         this.ac();
      }

      if (this.dL().B) {
         if (this.aV) {
            this.aV = false;
            int $$1 = this.u();
            this.aR = (long)(this.ah + $$1);
         }

         if (this.aW) {
            this.aW = false;
            this.aS = this.s();
         }

         if (this.o) {
            this.o = false;
            boolean $$2 = this.aS != 0;
            if ($$2 && this.aX != null) {
               this.aX = this.a(this.aX, this.aT);
            } else {
               this.aX = this.I();
            }

            this.a($$2, this.aT);
         }

         if (this.aY != null) {
            if (this.aY.a == 0) {
               this.aY.a(this);
               this.bp();
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
   protected void c_() {
      this.an.a(s, 0);
      this.an.a(q, 0);
      this.an.a(r, 0);
      this.an.a(t, new Vector3f());
      this.an.a(u, new Vector3f(1.0F, 1.0F, 1.0F));
      this.an.a(aE, new Quaternionf());
      this.an.a(v, new Quaternionf());
      this.an.a(aF, blv.a.a.a());
      this.an.a(aG, -1);
      this.an.a(aH, 1.0F);
      this.an.a(aI, 0.0F);
      this.an.a(aJ, 1.0F);
      this.an.a(aK, 0.0F);
      this.an.a(aL, 0.0F);
      this.an.a(aM, -1);
   }

   @Override
   protected void a(so $$0) {
      if ($$0.e("transformation")) {
         j.b.decode(tc.a, $$0.c("transformation")).resultOrPartial(ac.a("Display entity", p::error)).ifPresent($$0x -> this.a((j)$$0x.getFirst()));
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
         this.d(aup.a($$3, 0, 59));
      }

      if ($$0.b("billboard", 8)) {
         blv.a.e.decode(tc.a, $$0.c("billboard")).resultOrPartial(ac.a("Display entity", p::error)).ifPresent($$0x -> this.a((blv.a)$$0x.getFirst()));
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
         this.m($$0.h("glow_color_override"));
      }

      if ($$0.b("brightness", 10)) {
         atg.b.decode(tc.a, $$0.c("brightness")).resultOrPartial(ac.a("Display entity", p::error)).ifPresent($$0x -> this.a((atg)$$0x.getFirst()));
      } else {
         this.a(null);
      }
   }

   private void a(j $$0) {
      this.an.b(t, $$0.d());
      this.an.b(v, $$0.e());
      this.an.b(u, $$0.f());
      this.an.b(aE, $$0.g());
   }

   @Override
   protected void b(so $$0) {
      j.b.encodeStart(tc.a, a(this.an)).result().ifPresent($$1x -> $$0.a("transformation", $$1x));
      blv.a.e.encodeStart(tc.a, this.x()).result().ifPresent($$1x -> $$0.a("billboard", $$1x));
      $$0.a("interpolation_duration", this.s());
      $$0.a("teleport_duration", this.w());
      $$0.a("view_range", this.A());
      $$0.a("shadow_radius", this.B());
      $$0.a("shadow_strength", this.C());
      $$0.a("width", this.D());
      $$0.a("height", this.G());
      $$0.a("glow_color_override", this.E());
      atg $$1 = this.y();
      if ($$1 != null) {
         atg.b.encodeStart(tc.a, $$1).result().ifPresent($$1x -> $$0.a("brightness", $$1x));
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      int $$6 = this.w();
      this.aY = new blv.j($$6, $$0, $$1, $$2, (double)$$3, (double)$$4);
   }

   @Override
   public double p_() {
      return this.aY != null ? this.aY.b : this.dq();
   }

   @Override
   public double N_() {
      return this.aY != null ? this.aY.c : this.ds();
   }

   @Override
   public double O_() {
      return this.aY != null ? this.aY.d : this.dw();
   }

   @Override
   public float f_() {
      return this.aY != null ? (float)this.aY.f : this.dD();
   }

   @Override
   public float q_() {
      return this.aY != null ? (float)this.aY.e : this.dB();
   }

   @Override
   public elx i_() {
      return this.aU;
   }

   @Override
   public efe s_() {
      return efe.d;
   }

   @Override
   public boolean r_() {
      return true;
   }

   @Nullable
   public blv.k q() {
      return this.aX;
   }

   private void b(int $$0) {
      this.an.b(r, $$0);
   }

   private int s() {
      return this.an.b(r);
   }

   private void c(int $$0) {
      this.an.a(q, $$0, true);
   }

   private int u() {
      return this.an.b(q);
   }

   private void d(int $$0) {
      this.an.b(s, $$0);
   }

   private int w() {
      return this.an.b(s);
   }

   private void a(blv.a $$0) {
      this.an.b(aF, $$0.a());
   }

   private blv.a x() {
      return blv.a.f.apply(this.an.b(aF));
   }

   private void a(@Nullable atg $$0) {
      this.an.b(aG, $$0 != null ? $$0.a() : -1);
   }

   @Nullable
   private atg y() {
      int $$0 = this.an.b(aG);
      return $$0 != -1 ? atg.a($$0) : null;
   }

   private int z() {
      return this.an.b(aG);
   }

   private void b(float $$0) {
      this.an.b(aH, $$0);
   }

   private float A() {
      return this.an.b(aH);
   }

   private void c(float $$0) {
      this.an.b(aI, $$0);
   }

   private float B() {
      return this.an.b(aI);
   }

   private void t(float $$0) {
      this.an.b(aJ, $$0);
   }

   private float C() {
      return this.an.b(aJ);
   }

   private void u(float $$0) {
      this.an.b(aK, $$0);
   }

   private float D() {
      return this.an.b(aK);
   }

   private void v(float $$0) {
      this.an.b(aL, $$0);
   }

   private int E() {
      return this.an.b(aM);
   }

   private void m(int $$0) {
      this.an.b(aM, $$0);
   }

   public float a(float $$0) {
      int $$1 = this.aS;
      if ($$1 <= 0) {
         return 1.0F;
      } else {
         float $$2 = (float)((long)this.ah - this.aR);
         float $$3 = $$2 + $$0;
         float $$4 = aup.a(aup.g($$3, 0.0F, (float)$$1), 0.0F, 1.0F);
         this.aT = $$4;
         return $$4;
      }
   }

   private float G() {
      return this.an.b(aL);
   }

   @Override
   public void a_(double $$0, double $$1, double $$2) {
      super.a_($$0, $$1, $$2);
      this.H();
   }

   private void H() {
      float $$0 = this.D();
      float $$1 = this.G();
      if ($$0 != 0.0F && $$1 != 0.0F) {
         this.at = false;
         float $$2 = $$0 / 2.0F;
         double $$3 = this.dq();
         double $$4 = this.ds();
         double $$5 = this.dw();
         this.aU = new elx($$3 - (double)$$2, $$4, $$5 - (double)$$2, $$3 + (double)$$2, $$4 + (double)$$1, $$5 + (double)$$2);
      } else {
         this.at = true;
      }
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < aup.k((double)this.A() * 64.0 * cA());
   }

   @Override
   public int j_() {
      int $$0 = this.E();
      return $$0 != -1 ? $$0 : super.j_();
   }

   private blv.k I() {
      return new blv.k(blv.e.constant(a(this.an)), this.x(), this.z(), blv.d.constant(this.B()), blv.d.constant(this.C()), this.E());
   }

   private blv.k a(blv.k $$0, float $$1) {
      j $$2 = $$0.a.get($$1);
      float $$3 = $$0.d.get($$1);
      float $$4 = $$0.e.get($$1);
      return new blv.k(new blv.m($$2, a(this.an)), this.x(), this.z(), new blv.h($$3, this.B()), new blv.h($$4, this.C()), this.E());
   }

   public static enum a implements avl {
      a((byte)0, "fixed"),
      b((byte)1, "vertical"),
      c((byte)2, "horizontal"),
      d((byte)3, "center");

      public static final Codec<blv.a> e = avl.a(blv.a::values);
      public static final IntFunction<blv.a> f = ath.a(blv.a::a, values(), ath.a.a);
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

   public static class b extends blv {
      public static final String p = "block_state";
      private static final agn<djp> q = agq.a(blv.b.class, agp.i);
      @Nullable
      private blv.b.a r;

      public b(bmc<?> $$0, ctx $$1) {
         super($$0, $$1);
      }

      @Override
      protected void c_() {
         super.c_();
         this.an.a(q, cxa.a.o());
      }

      @Override
      public void a(agn<?> $$0) {
         super.a($$0);
         if ($$0.equals(q)) {
            this.o = true;
         }
      }

      private djp u() {
         return this.an.b(q);
      }

      private void c(djp $$0) {
         this.an.b(q, $$0);
      }

      @Override
      protected void a(so $$0) {
         super.a($$0);
         this.c(td.a(this.dL().a(ke.f), $$0.p("block_state")));
      }

      @Override
      protected void b(so $$0) {
         super.b($$0);
         $$0.a("block_state", td.a(this.u()));
      }

      @Nullable
      public blv.b.a s() {
         return this.r;
      }

      @Override
      protected void a(boolean $$0, float $$1) {
         this.r = new blv.b.a(this.u());
      }

      public static record a(djp a) {
      }
   }

   static record c(int a, int b) implements blv.f {
      @Override
      public int get(float $$0) {
         return atz.b.a($$0, this.a, this.b);
      }
   }

   @FunctionalInterface
   public interface d {
      static blv.d constant(float $$0) {
         return $$1 -> $$0;
      }

      float get(float var1);
   }

   @FunctionalInterface
   public interface e<T> {
      static <T> blv.e<T> constant(T $$0) {
         return $$1 -> $$0;
      }

      T get(float var1);
   }

   @FunctionalInterface
   public interface f {
      static blv.f constant(int $$0) {
         return $$1 -> $$0;
      }

      int get(float var1);
   }

   public static class g extends blv {
      private static final String p = "item";
      private static final String q = "item_display";
      private static final agn<cng> r = agq.a(blv.g.class, agp.h);
      private static final agn<Byte> s = agq.a(blv.g.class, agp.a);
      private final bng t = new bng() {
         @Override
         public cng a() {
            return g.this.u();
         }

         @Override
         public boolean a(cng $$0) {
            g.this.a($$0);
            return true;
         }
      };
      @Nullable
      private blv.g.a u;

      public g(bmc<?> $$0, ctx $$1) {
         super($$0, $$1);
      }

      @Override
      protected void c_() {
         super.c_();
         this.an.a(r, cng.f);
         this.an.a(s, cnd.a.a());
      }

      @Override
      public void a(agn<?> $$0) {
         super.a($$0);
         if (r.equals($$0) || s.equals($$0)) {
            this.o = true;
         }
      }

      cng u() {
         return this.an.b(r);
      }

      void a(cng $$0) {
         this.an.b(r, $$0);
      }

      private void a(cnd $$0) {
         this.an.b(s, $$0.a());
      }

      private cnd w() {
         return cnd.k.apply(this.an.b(s));
      }

      @Override
      protected void a(so $$0) {
         super.a($$0);
         this.a(cng.a($$0.p("item")));
         if ($$0.b("item_display", 8)) {
            cnd.j.decode(tc.a, $$0.c("item_display")).resultOrPartial(ac.a("Display entity", blv.p::error)).ifPresent($$0x -> this.a((cnd)$$0x.getFirst()));
         }
      }

      @Override
      protected void b(so $$0) {
         super.b($$0);
         $$0.a("item", this.u().b(new so()));
         cnd.j.encodeStart(tc.a, this.w()).result().ifPresent($$1 -> $$0.a("item_display", $$1));
      }

      @Override
      public bng a_(int $$0) {
         return $$0 == 0 ? this.t : bng.b;
      }

      @Nullable
      public blv.g.a s() {
         return this.u;
      }

      @Override
      protected void a(boolean $$0, float $$1) {
         cng $$2 = this.u();
         $$2.a(this);
         this.u = new blv.g.a($$2, this.w());
      }

      public static record a(cng a, cnd b) {
      }
   }

   static record h(float a, float b) implements blv.d {
      @Override
      public float get(float $$0) {
         return aup.i($$0, this.a, this.b);
      }
   }

   static record i(int a, int b) implements blv.f {
      @Override
      public int get(float $$0) {
         return aup.a($$0, this.a, this.b);
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

      void a(blw $$0) {
         $$0.a_(this.b, this.c, this.d);
         $$0.a((float)this.e, (float)this.f);
      }

      void b(blw $$0) {
         $$0.a(this.a, this.b, this.c, this.d, this.e, this.f);
      }
   }

   public static record k(blv.e<j> a, blv.a b, int c, blv.d d, blv.d e, int f) {
   }

   public static class l extends blv {
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
      private static final agn<vg> aM = agq.a(blv.l.class, agp.f);
      private static final agn<Integer> aN = agq.a(blv.l.class, agp.b);
      private static final agn<Integer> aO = agq.a(blv.l.class, agp.b);
      private static final agn<Byte> aP = agq.a(blv.l.class, agp.a);
      private static final agn<Byte> aQ = agq.a(blv.l.class, agp.a);
      private static final IntSet aR = IntSet.of(new int[]{aM.a(), aN.a(), aO.a(), aP.a(), aQ.a()});
      @Nullable
      private blv.l.b aS;
      @Nullable
      private blv.l.e aT;

      public l(bmc<?> $$0, ctx $$1) {
         super($$0, $$1);
      }

      @Override
      protected void c_() {
         super.c_();
         this.an.a(aM, vg.i());
         this.an.a(aN, 200);
         this.an.a(aO, 1073741824);
         this.an.a(aP, (byte)-1);
         this.an.a(aQ, (byte)0);
      }

      @Override
      public void a(agn<?> $$0) {
         super.a($$0);
         if (aR.contains($$0.a())) {
            this.o = true;
         }
      }

      private vg u() {
         return this.an.b(aM);
      }

      private void c(vg $$0) {
         this.an.b(aM, $$0);
      }

      private int w() {
         return this.an.b(aN);
      }

      private void b(int $$0) {
         this.an.b(aN, $$0);
      }

      private byte x() {
         return this.an.b(aP);
      }

      private void c(byte $$0) {
         this.an.b(aP, $$0);
      }

      private int y() {
         return this.an.b(aO);
      }

      private void c(int $$0) {
         this.an.b(aO, $$0);
      }

      private byte z() {
         return this.an.b(aQ);
      }

      private void d(byte $$0) {
         this.an.b(aQ, $$0);
      }

      private static byte a(byte $$0, so $$1, String $$2, byte $$3) {
         return $$1.q($$2) ? (byte)($$0 | $$3) : $$0;
      }

      @Override
      protected void a(so $$0) {
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
         Optional<blv.l.a> $$2 = blv.l.a.d.decode(tc.a, $$0.c("alignment")).resultOrPartial(ac.a("Display entity", blv.p::error)).map(Pair::getFirst);
         if ($$2.isPresent()) {
            $$1 = switch ((blv.l.a)$$2.get()) {
               case a -> $$1;
               case b -> (byte)($$1 | 8);
               case c -> (byte)($$1 | 16);
            };
         }

         this.d($$1);
         if ($$0.b("text", 8)) {
            String $$3 = $$0.l("text");

            try {
               vg $$4 = vg.a.a($$3);
               if ($$4 != null) {
                  ds $$5 = this.dd().a(2);
                  vg $$6 = vj.a($$5, $$4, this, 0);
                  this.c($$6);
               } else {
                  this.c(vg.i());
               }
            } catch (Exception var8) {
               blv.p.warn("Failed to parse display entity text {}", $$3, var8);
            }
         }
      }

      private static void b(byte $$0, so $$1, String $$2, byte $$3) {
         $$1.a($$2, ($$0 & $$3) != 0);
      }

      @Override
      protected void b(so $$0) {
         super.b($$0);
         $$0.a("text", vg.a.a(this.u()));
         $$0.a("line_width", this.w());
         $$0.a("background", this.y());
         $$0.a("text_opacity", this.x());
         byte $$1 = this.z();
         b($$1, $$0, "shadow", (byte)1);
         b($$1, $$0, "see_through", (byte)2);
         b($$1, $$0, "default_background", (byte)4);
         blv.l.a.d.encodeStart(tc.a, a($$1)).result().ifPresent($$1x -> $$0.a("alignment", $$1x));
      }

      @Override
      protected void a(boolean $$0, float $$1) {
         if ($$0 && this.aT != null) {
            this.aT = this.a(this.aT, $$1);
         } else {
            this.aT = this.A();
         }

         this.aS = null;
      }

      @Nullable
      public blv.l.e s() {
         return this.aT;
      }

      private blv.l.e A() {
         return new blv.l.e(this.u(), this.w(), blv.f.constant(this.x()), blv.f.constant(this.y()), this.z());
      }

      private blv.l.e a(blv.l.e $$0, float $$1) {
         int $$2 = $$0.d.get($$1);
         int $$3 = $$0.c.get($$1);
         return new blv.l.e(this.u(), this.w(), new blv.i($$3, this.x()), new blv.c($$2, this.y()), this.z());
      }

      public blv.l.b a(blv.l.d $$0) {
         if (this.aS == null) {
            if (this.aT != null) {
               this.aS = $$0.split(this.aT.a(), this.aT.b());
            } else {
               this.aS = new blv.l.b(List.of(), 0);
            }
         }

         return this.aS;
      }

      public static blv.l.a a(byte $$0) {
         if (($$0 & 8) != 0) {
            return blv.l.a.b;
         } else {
            return ($$0 & 16) != 0 ? blv.l.a.c : blv.l.a.a;
         }
      }

      public static enum a implements avl {
         a("center"),
         b("left"),
         c("right");

         public static final Codec<blv.l.a> d = avl.a(blv.l.a::values);
         private final String e;

         private a(String $$0) {
            this.e = $$0;
         }

         @Override
         public String c() {
            return this.e;
         }
      }

      public static record b(List<blv.l.c> a, int b) {
      }

      public static record c(aub a, int b) {
      }

      @FunctionalInterface
      public interface d {
         blv.l.b split(vg var1, int var2);
      }

      public static record e(vg a, int b, blv.f c, blv.f d, byte e) {
      }
   }

   static record m(j a, j b) implements blv.e<j> {
      public j a(float $$0) {
         return (double)$$0 >= 1.0 ? this.b : this.a.a(this.b, $$0);
      }
   }
}
