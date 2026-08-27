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

public abstract class biv extends biw {
   static final Logger p = LogUtils.getLogger();
   public static final int b = -1;
   private static final aef<Integer> q = aei.a(biv.class, aeh.b);
   private static final aef<Integer> r = aei.a(biv.class, aeh.b);
   private static final aef<Integer> s = aei.a(biv.class, aeh.b);
   private static final aef<Vector3f> t = aei.a(biv.class, aeh.A);
   private static final aef<Vector3f> u = aei.a(biv.class, aeh.A);
   private static final aef<Quaternionf> v = aei.a(biv.class, aeh.B);
   private static final aef<Quaternionf> aE = aei.a(biv.class, aeh.B);
   private static final aef<Byte> aF = aei.a(biv.class, aeh.a);
   private static final aef<Integer> aG = aei.a(biv.class, aeh.b);
   private static final aef<Float> aH = aei.a(biv.class, aeh.d);
   private static final aef<Float> aI = aei.a(biv.class, aeh.d);
   private static final aef<Float> aJ = aei.a(biv.class, aeh.d);
   private static final aef<Float> aK = aei.a(biv.class, aeh.d);
   private static final aef<Float> aL = aei.a(biv.class, aeh.d);
   private static final aef<Integer> aM = aei.a(biv.class, aeh.b);
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
   private ehc aU;
   protected boolean o;
   private boolean aV;
   private boolean aW;
   @Nullable
   private biv.k aX;
   @Nullable
   private biv.j aY;

   public biv(bja<?> $$0, cqb $$1) {
      super($$0, $$1);
      this.af = true;
      this.at = true;
      this.aU = this.cG();
   }

   @Override
   public void a(aef<?> $$0) {
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

   private static j a(aei $$0) {
      Vector3f $$1 = $$0.b(t);
      Quaternionf $$2 = $$0.b(v);
      Vector3f $$3 = $$0.b(u);
      Quaternionf $$4 = $$0.b(aE);
      return new j($$1, $$2, $$3, $$4);
   }

   @Override
   public void l() {
      biw $$0 = this.cY();
      if ($$0 != null && $$0.dG()) {
         this.aa();
      }

      if (this.dL().B) {
         if (this.aV) {
            this.aV = false;
            int $$1 = this.t();
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
               this.aX = this.H();
            }

            this.a($$2, this.aT);
         }

         if (this.aY != null) {
            if (this.aY.a == 0) {
               this.aY.a(this);
               this.bn();
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
   protected void a_() {
      this.an.a(s, 0);
      this.an.a(q, 0);
      this.an.a(r, 0);
      this.an.a(t, new Vector3f());
      this.an.a(u, new Vector3f(1.0F, 1.0F, 1.0F));
      this.an.a(aE, new Quaternionf());
      this.an.a(v, new Quaternionf());
      this.an.a(aF, biv.a.a.a());
      this.an.a(aG, -1);
      this.an.a(aH, 1.0F);
      this.an.a(aI, 0.0F);
      this.an.a(aJ, 1.0F);
      this.an.a(aK, 0.0F);
      this.an.a(aL, 0.0F);
      this.an.a(aM, -1);
   }

   @Override
   protected void a(qw $$0) {
      if ($$0.e("transformation")) {
         j.b.decode(ri.a, $$0.c("transformation")).resultOrPartial(ac.a("Display entity", p::error)).ifPresent($$0x -> this.a((j)$$0x.getFirst()));
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
         this.d(asb.a($$3, 0, 59));
      }

      if ($$0.b("billboard", 8)) {
         biv.a.e.decode(ri.a, $$0.c("billboard")).resultOrPartial(ac.a("Display entity", p::error)).ifPresent($$0x -> this.a((biv.a)$$0x.getFirst()));
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
         aqt.b.decode(ri.a, $$0.c("brightness")).resultOrPartial(ac.a("Display entity", p::error)).ifPresent($$0x -> this.a((aqt)$$0x.getFirst()));
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
   protected void b(qw $$0) {
      j.b.encodeStart(ri.a, a(this.an)).result().ifPresent($$1x -> $$0.a("transformation", $$1x));
      biv.a.e.encodeStart(ri.a, this.w()).result().ifPresent($$1x -> $$0.a("billboard", $$1x));
      $$0.a("interpolation_duration", this.s());
      $$0.a("teleport_duration", this.v());
      $$0.a("view_range", this.z());
      $$0.a("shadow_radius", this.A());
      $$0.a("shadow_strength", this.B());
      $$0.a("width", this.C());
      $$0.a("height", this.F());
      $$0.a("glow_color_override", this.E());
      aqt $$1 = this.x();
      if ($$1 != null) {
         aqt.b.encodeStart(ri.a, $$1).result().ifPresent($$1x -> $$0.a("brightness", $$1x));
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      int $$6 = this.v();
      this.aY = new biv.j($$6, $$0, $$1, $$2, (double)$$3, (double)$$4);
   }

   @Override
   public double n_() {
      return this.aY != null ? this.aY.b : this.dq();
   }

   @Override
   public double K_() {
      return this.aY != null ? this.aY.c : this.ds();
   }

   @Override
   public double L_() {
      return this.aY != null ? this.aY.d : this.dw();
   }

   @Override
   public float d_() {
      return this.aY != null ? (float)this.aY.f : this.dD();
   }

   @Override
   public float o_() {
      return this.aY != null ? (float)this.aY.e : this.dB();
   }

   @Override
   public ehc g_() {
      return this.aU;
   }

   @Override
   public eal q_() {
      return eal.d;
   }

   @Override
   public boolean p_() {
      return true;
   }

   @Nullable
   public biv.k q() {
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

   private int t() {
      return this.an.b(q);
   }

   private void d(int $$0) {
      this.an.b(s, $$0);
   }

   private int v() {
      return this.an.b(s);
   }

   private void a(biv.a $$0) {
      this.an.b(aF, $$0.a());
   }

   private biv.a w() {
      return biv.a.f.apply(this.an.b(aF));
   }

   private void a(@Nullable aqt $$0) {
      this.an.b(aG, $$0 != null ? $$0.a() : -1);
   }

   @Nullable
   private aqt x() {
      int $$0 = this.an.b(aG);
      return $$0 != -1 ? aqt.a($$0) : null;
   }

   private int y() {
      return this.an.b(aG);
   }

   private void b(float $$0) {
      this.an.b(aH, $$0);
   }

   private float z() {
      return this.an.b(aH);
   }

   private void c(float $$0) {
      this.an.b(aI, $$0);
   }

   private float A() {
      return this.an.b(aI);
   }

   private void u(float $$0) {
      this.an.b(aJ, $$0);
   }

   private float B() {
      return this.an.b(aJ);
   }

   private void v(float $$0) {
      this.an.b(aK, $$0);
   }

   private float C() {
      return this.an.b(aK);
   }

   private void w(float $$0) {
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
         float $$4 = asb.a(asb.g($$3, 0.0F, (float)$$1), 0.0F, 1.0F);
         this.aT = $$4;
         return $$4;
      }
   }

   private float F() {
      return this.an.b(aL);
   }

   @Override
   public void e(double $$0, double $$1, double $$2) {
      super.e($$0, $$1, $$2);
      this.G();
   }

   private void G() {
      float $$0 = this.C();
      float $$1 = this.F();
      if ($$0 != 0.0F && $$1 != 0.0F) {
         this.at = false;
         float $$2 = $$0 / 2.0F;
         double $$3 = this.dq();
         double $$4 = this.ds();
         double $$5 = this.dw();
         this.aU = new ehc($$3 - (double)$$2, $$4, $$5 - (double)$$2, $$3 + (double)$$2, $$4 + (double)$$1, $$5 + (double)$$2);
      } else {
         this.at = true;
      }
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < asb.k((double)this.z() * 64.0 * cz());
   }

   @Override
   public int h_() {
      int $$0 = this.E();
      return $$0 != -1 ? $$0 : super.h_();
   }

   private biv.k H() {
      return new biv.k(biv.e.constant(a(this.an)), this.w(), this.y(), biv.d.constant(this.A()), biv.d.constant(this.B()), this.E());
   }

   private biv.k a(biv.k $$0, float $$1) {
      j $$2 = $$0.a.get($$1);
      float $$3 = $$0.d.get($$1);
      float $$4 = $$0.e.get($$1);
      return new biv.k(new biv.m($$2, a(this.an)), this.w(), this.y(), new biv.h($$3, this.A()), new biv.h($$4, this.B()), this.E());
   }

   public static enum a implements asu {
      a((byte)0, "fixed"),
      b((byte)1, "vertical"),
      c((byte)2, "horizontal"),
      d((byte)3, "center");

      public static final Codec<biv.a> e = asu.a(biv.a::values);
      public static final IntFunction<biv.a> f = aqu.a(biv.a::a, values(), aqu.a.a);
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

   public static class b extends biv {
      public static final String p = "block_state";
      private static final aef<dfd> q = aei.a(biv.b.class, aeh.i);
      @Nullable
      private biv.b.a r;

      public b(bja<?> $$0, cqb $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a_() {
         super.a_();
         this.an.a(q, cte.a.o());
      }

      @Override
      public void a(aef<?> $$0) {
         super.a($$0);
         if ($$0.equals(q)) {
            this.o = true;
         }
      }

      private dfd t() {
         return this.an.b(q);
      }

      private void c(dfd $$0) {
         this.an.b(q, $$0);
      }

      @Override
      protected void a(qw $$0) {
         super.a($$0);
         this.c(rj.a(this.dL().a(jc.e), $$0.p("block_state")));
      }

      @Override
      protected void b(qw $$0) {
         super.b($$0);
         $$0.a("block_state", rj.a(this.t()));
      }

      @Nullable
      public biv.b.a s() {
         return this.r;
      }

      @Override
      protected void a(boolean $$0, float $$1) {
         this.r = new biv.b.a(this.t());
      }

      public static record a(dfd a) {
      }
   }

   static record c(int a, int b) implements biv.f {
      @Override
      public int get(float $$0) {
         return arl.b.a($$0, this.a, this.b);
      }
   }

   @FunctionalInterface
   public interface d {
      static biv.d constant(float $$0) {
         return $$1 -> $$0;
      }

      float get(float var1);
   }

   @FunctionalInterface
   public interface e<T> {
      static <T> biv.e<T> constant(T $$0) {
         return $$1 -> $$0;
      }

      T get(float var1);
   }

   @FunctionalInterface
   public interface f {
      static biv.f constant(int $$0) {
         return $$1 -> $$0;
      }

      int get(float var1);
   }

   public static class g extends biv {
      private static final String p = "item";
      private static final String q = "item_display";
      private static final aef<cjl> r = aei.a(biv.g.class, aeh.h);
      private static final aef<Byte> s = aei.a(biv.g.class, aeh.a);
      private final bke t = new bke() {
         @Override
         public cjl a() {
            return g.this.t();
         }

         @Override
         public boolean a(cjl $$0) {
            g.this.a($$0);
            return true;
         }
      };
      @Nullable
      private biv.g.a u;

      public g(bja<?> $$0, cqb $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a_() {
         super.a_();
         this.an.a(r, cjl.b);
         this.an.a(s, cji.a.a());
      }

      @Override
      public void a(aef<?> $$0) {
         super.a($$0);
         if (r.equals($$0) || s.equals($$0)) {
            this.o = true;
         }
      }

      cjl t() {
         return this.an.b(r);
      }

      void a(cjl $$0) {
         this.an.b(r, $$0);
      }

      private void a(cji $$0) {
         this.an.b(s, $$0.a());
      }

      private cji v() {
         return cji.k.apply(this.an.b(s));
      }

      @Override
      protected void a(qw $$0) {
         super.a($$0);
         this.a(cjl.a($$0.p("item")));
         if ($$0.b("item_display", 8)) {
            cji.j.decode(ri.a, $$0.c("item_display")).resultOrPartial(ac.a("Display entity", biv.p::error)).ifPresent($$0x -> this.a((cji)$$0x.getFirst()));
         }
      }

      @Override
      protected void b(qw $$0) {
         super.b($$0);
         $$0.a("item", this.t().b(new qw()));
         cji.j.encodeStart(ri.a, this.v()).result().ifPresent($$1 -> $$0.a("item_display", $$1));
      }

      @Override
      public bke a_(int $$0) {
         return $$0 == 0 ? this.t : bke.b;
      }

      @Nullable
      public biv.g.a s() {
         return this.u;
      }

      @Override
      protected void a(boolean $$0, float $$1) {
         cjl $$2 = this.t();
         $$2.a(this);
         this.u = new biv.g.a($$2, this.v());
      }

      public static record a(cjl a, cji b) {
      }
   }

   static record h(float a, float b) implements biv.d {
      @Override
      public float get(float $$0) {
         return asb.i($$0, this.a, this.b);
      }
   }

   static record i(int a, int b) implements biv.f {
      @Override
      public int get(float $$0) {
         return asb.a($$0, this.a, this.b);
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

      void a(biw $$0) {
         $$0.e(this.b, this.c, this.d);
         $$0.a((float)this.e, (float)this.f);
      }

      void b(biw $$0) {
         $$0.a(this.a, this.b, this.c, this.d, this.e, this.f);
      }
   }

   public static record k(biv.e<j> a, biv.a b, int c, biv.d d, biv.d e, int f) {
   }

   public static class l extends biv {
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
      private static final aef<tl> aM = aei.a(biv.l.class, aeh.f);
      private static final aef<Integer> aN = aei.a(biv.l.class, aeh.b);
      private static final aef<Integer> aO = aei.a(biv.l.class, aeh.b);
      private static final aef<Byte> aP = aei.a(biv.l.class, aeh.a);
      private static final aef<Byte> aQ = aei.a(biv.l.class, aeh.a);
      private static final IntSet aR = IntSet.of(new int[]{aM.a(), aN.a(), aO.a(), aP.a(), aQ.a()});
      @Nullable
      private biv.l.b aS;
      @Nullable
      private biv.l.e aT;

      public l(bja<?> $$0, cqb $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a_() {
         super.a_();
         this.an.a(aM, tl.i());
         this.an.a(aN, 200);
         this.an.a(aO, 1073741824);
         this.an.a(aP, (byte)-1);
         this.an.a(aQ, (byte)0);
      }

      @Override
      public void a(aef<?> $$0) {
         super.a($$0);
         if (aR.contains($$0.a())) {
            this.o = true;
         }
      }

      private tl t() {
         return this.an.b(aM);
      }

      private void c(tl $$0) {
         this.an.b(aM, $$0);
      }

      private int v() {
         return this.an.b(aN);
      }

      private void b(int $$0) {
         this.an.b(aN, $$0);
      }

      private byte w() {
         return this.an.b(aP);
      }

      private void c(byte $$0) {
         this.an.b(aP, $$0);
      }

      private int x() {
         return this.an.b(aO);
      }

      private void c(int $$0) {
         this.an.b(aO, $$0);
      }

      private byte y() {
         return this.an.b(aQ);
      }

      private void d(byte $$0) {
         this.an.b(aQ, $$0);
      }

      private static byte a(byte $$0, qw $$1, String $$2, byte $$3) {
         return $$1.q($$2) ? (byte)($$0 | $$3) : $$0;
      }

      @Override
      protected void a(qw $$0) {
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
         Optional<biv.l.a> $$2 = biv.l.a.d.decode(ri.a, $$0.c("alignment")).resultOrPartial(ac.a("Display entity", biv.p::error)).map(Pair::getFirst);
         if ($$2.isPresent()) {
            $$1 = switch ((biv.l.a)$$2.get()) {
               case a -> $$1;
               case b -> (byte)($$1 | 8);
               case c -> (byte)($$1 | 16);
            };
         }

         this.d($$1);
         if ($$0.b("text", 8)) {
            String $$3 = $$0.l("text");

            try {
               tl $$4 = tl.a.a($$3);
               if ($$4 != null) {
                  dt $$5 = this.dc().a(2);
                  tl $$6 = to.a($$5, $$4, this, 0);
                  this.c($$6);
               } else {
                  this.c(tl.i());
               }
            } catch (Exception var8) {
               biv.p.warn("Failed to parse display entity text {}", $$3, var8);
            }
         }
      }

      private static void b(byte $$0, qw $$1, String $$2, byte $$3) {
         $$1.a($$2, ($$0 & $$3) != 0);
      }

      @Override
      protected void b(qw $$0) {
         super.b($$0);
         $$0.a("text", tl.a.a(this.t()));
         $$0.a("line_width", this.v());
         $$0.a("background", this.x());
         $$0.a("text_opacity", this.w());
         byte $$1 = this.y();
         b($$1, $$0, "shadow", (byte)1);
         b($$1, $$0, "see_through", (byte)2);
         b($$1, $$0, "default_background", (byte)4);
         biv.l.a.d.encodeStart(ri.a, a($$1)).result().ifPresent($$1x -> $$0.a("alignment", $$1x));
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
      public biv.l.e s() {
         return this.aT;
      }

      private biv.l.e z() {
         return new biv.l.e(this.t(), this.v(), biv.f.constant(this.w()), biv.f.constant(this.x()), this.y());
      }

      private biv.l.e a(biv.l.e $$0, float $$1) {
         int $$2 = $$0.d.get($$1);
         int $$3 = $$0.c.get($$1);
         return new biv.l.e(this.t(), this.v(), new biv.i($$3, this.w()), new biv.c($$2, this.x()), this.y());
      }

      public biv.l.b a(biv.l.d $$0) {
         if (this.aS == null) {
            if (this.aT != null) {
               this.aS = $$0.split(this.aT.a(), this.aT.b());
            } else {
               this.aS = new biv.l.b(List.of(), 0);
            }
         }

         return this.aS;
      }

      public static biv.l.a a(byte $$0) {
         if (($$0 & 8) != 0) {
            return biv.l.a.b;
         } else {
            return ($$0 & 16) != 0 ? biv.l.a.c : biv.l.a.a;
         }
      }

      public static enum a implements asu {
         a("center"),
         b("left"),
         c("right");

         public static final Codec<biv.l.a> d = asu.a(biv.l.a::values);
         private final String e;

         private a(String $$0) {
            this.e = $$0;
         }

         @Override
         public String c() {
            return this.e;
         }
      }

      public static record b(List<biv.l.c> a, int b) {
      }

      public static record c(arn a, int b) {
      }

      @FunctionalInterface
      public interface d {
         biv.l.b split(tl var1, int var2);
      }

      public static record e(tl a, int b, biv.f c, biv.f d, byte e) {
      }
   }

   static record m(j a, j b) implements biv.e<j> {
      public j a(float $$0) {
         return (double)$$0 >= 1.0 ? this.b : this.a.a(this.b, $$0);
      }
   }
}
