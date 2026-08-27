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

public abstract class bir extends bis {
   static final Logger p = LogUtils.getLogger();
   public static final int b = -1;
   private static final aeg<Integer> q = aej.a(bir.class, aei.b);
   private static final aeg<Integer> r = aej.a(bir.class, aei.b);
   private static final aeg<Integer> s = aej.a(bir.class, aei.b);
   private static final aeg<Vector3f> t = aej.a(bir.class, aei.A);
   private static final aeg<Vector3f> u = aej.a(bir.class, aei.A);
   private static final aeg<Quaternionf> v = aej.a(bir.class, aei.B);
   private static final aeg<Quaternionf> aE = aej.a(bir.class, aei.B);
   private static final aeg<Byte> aF = aej.a(bir.class, aei.a);
   private static final aeg<Integer> aG = aej.a(bir.class, aei.b);
   private static final aeg<Float> aH = aej.a(bir.class, aei.d);
   private static final aeg<Float> aI = aej.a(bir.class, aei.d);
   private static final aeg<Float> aJ = aej.a(bir.class, aei.d);
   private static final aeg<Float> aK = aej.a(bir.class, aei.d);
   private static final aeg<Float> aL = aej.a(bir.class, aei.d);
   private static final aeg<Integer> aM = aej.a(bir.class, aei.b);
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
   private ehk aU;
   protected boolean o;
   private boolean aV;
   private boolean aW;
   @Nullable
   private bir.k aX;
   @Nullable
   private bir.j aY;

   public bir(biw<?> $$0, cpx $$1) {
      super($$0, $$1);
      this.af = true;
      this.at = true;
      this.aU = this.cG();
   }

   @Override
   public void a(aeg<?> $$0) {
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

   private static j a(aej $$0) {
      Vector3f $$1 = $$0.b(t);
      Quaternionf $$2 = $$0.b(v);
      Vector3f $$3 = $$0.b(u);
      Quaternionf $$4 = $$0.b(aE);
      return new j($$1, $$2, $$3, $$4);
   }

   @Override
   public void l() {
      bis $$0 = this.cY();
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
      this.an.a(aF, bir.a.a.a());
      this.an.a(aG, -1);
      this.an.a(aH, 1.0F);
      this.an.a(aI, 0.0F);
      this.an.a(aJ, 1.0F);
      this.an.a(aK, 0.0F);
      this.an.a(aL, 0.0F);
      this.an.a(aM, -1);
   }

   @Override
   protected void a(qy $$0) {
      if ($$0.e("transformation")) {
         j.b.decode(rk.a, $$0.c("transformation")).resultOrPartial(ac.a("Display entity", p::error)).ifPresent($$0x -> this.a((j)$$0x.getFirst()));
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
         this.d(ary.a($$3, 0, 59));
      }

      if ($$0.b("billboard", 8)) {
         bir.a.e.decode(rk.a, $$0.c("billboard")).resultOrPartial(ac.a("Display entity", p::error)).ifPresent($$0x -> this.a((bir.a)$$0x.getFirst()));
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
         aqs.b.decode(rk.a, $$0.c("brightness")).resultOrPartial(ac.a("Display entity", p::error)).ifPresent($$0x -> this.a((aqs)$$0x.getFirst()));
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
   protected void b(qy $$0) {
      j.b.encodeStart(rk.a, a(this.an)).result().ifPresent($$1x -> $$0.a("transformation", $$1x));
      bir.a.e.encodeStart(rk.a, this.w()).result().ifPresent($$1x -> $$0.a("billboard", $$1x));
      $$0.a("interpolation_duration", this.s());
      $$0.a("teleport_duration", this.v());
      $$0.a("view_range", this.z());
      $$0.a("shadow_radius", this.A());
      $$0.a("shadow_strength", this.B());
      $$0.a("width", this.C());
      $$0.a("height", this.F());
      $$0.a("glow_color_override", this.E());
      aqs $$1 = this.x();
      if ($$1 != null) {
         aqs.b.encodeStart(rk.a, $$1).result().ifPresent($$1x -> $$0.a("brightness", $$1x));
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      int $$6 = this.v();
      this.aY = new bir.j($$6, $$0, $$1, $$2, (double)$$3, (double)$$4);
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
   public ehk g_() {
      return this.aU;
   }

   @Override
   public eat q_() {
      return eat.d;
   }

   @Override
   public boolean p_() {
      return true;
   }

   @Nullable
   public bir.k q() {
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

   private void a(bir.a $$0) {
      this.an.b(aF, $$0.a());
   }

   private bir.a w() {
      return bir.a.f.apply(this.an.b(aF));
   }

   private void a(@Nullable aqs $$0) {
      this.an.b(aG, $$0 != null ? $$0.a() : -1);
   }

   @Nullable
   private aqs x() {
      int $$0 = this.an.b(aG);
      return $$0 != -1 ? aqs.a($$0) : null;
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
         float $$4 = ary.a(ary.g($$3, 0.0F, (float)$$1), 0.0F, 1.0F);
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
         this.aU = new ehk($$3 - (double)$$2, $$4, $$5 - (double)$$2, $$3 + (double)$$2, $$4 + (double)$$1, $$5 + (double)$$2);
      } else {
         this.at = true;
      }
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < ary.k((double)this.z() * 64.0 * cz());
   }

   @Override
   public int h_() {
      int $$0 = this.E();
      return $$0 != -1 ? $$0 : super.h_();
   }

   private bir.k H() {
      return new bir.k(bir.e.constant(a(this.an)), this.w(), this.y(), bir.d.constant(this.A()), bir.d.constant(this.B()), this.E());
   }

   private bir.k a(bir.k $$0, float $$1) {
      j $$2 = $$0.a.get($$1);
      float $$3 = $$0.d.get($$1);
      float $$4 = $$0.e.get($$1);
      return new bir.k(new bir.m($$2, a(this.an)), this.w(), this.y(), new bir.h($$3, this.A()), new bir.h($$4, this.B()), this.E());
   }

   public static enum a implements asr {
      a((byte)0, "fixed"),
      b((byte)1, "vertical"),
      c((byte)2, "horizontal"),
      d((byte)3, "center");

      public static final Codec<bir.a> e = asr.a(bir.a::values);
      public static final IntFunction<bir.a> f = aqt.a(bir.a::a, values(), aqt.a.a);
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

   public static class b extends bir {
      public static final String p = "block_state";
      private static final aeg<dfl> q = aej.a(bir.b.class, aei.i);
      @Nullable
      private bir.b.a r;

      public b(biw<?> $$0, cpx $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a_() {
         super.a_();
         this.an.a(q, csy.a.n());
      }

      @Override
      public void a(aeg<?> $$0) {
         super.a($$0);
         if ($$0.equals(q)) {
            this.o = true;
         }
      }

      private dfl t() {
         return this.an.b(q);
      }

      private void c(dfl $$0) {
         this.an.b(q, $$0);
      }

      @Override
      protected void a(qy $$0) {
         super.a($$0);
         this.c(rl.a(this.dL().a(je.e), $$0.p("block_state")));
      }

      @Override
      protected void b(qy $$0) {
         super.b($$0);
         $$0.a("block_state", rl.a(this.t()));
      }

      @Nullable
      public bir.b.a s() {
         return this.r;
      }

      @Override
      protected void a(boolean $$0, float $$1) {
         this.r = new bir.b.a(this.t());
      }

      public static record a(dfl a) {
      }
   }

   static record c(int a, int b) implements bir.f {
      @Override
      public int get(float $$0) {
         return arj.b.a($$0, this.a, this.b);
      }
   }

   @FunctionalInterface
   public interface d {
      static bir.d constant(float $$0) {
         return $$1 -> $$0;
      }

      float get(float var1);
   }

   @FunctionalInterface
   public interface e<T> {
      static <T> bir.e<T> constant(T $$0) {
         return $$1 -> $$0;
      }

      T get(float var1);
   }

   @FunctionalInterface
   public interface f {
      static bir.f constant(int $$0) {
         return $$1 -> $$0;
      }

      int get(float var1);
   }

   public static class g extends bir {
      private static final String p = "item";
      private static final String q = "item_display";
      private static final aeg<cjh> r = aej.a(bir.g.class, aei.h);
      private static final aeg<Byte> s = aej.a(bir.g.class, aei.a);
      private final bka t = new bka() {
         @Override
         public cjh a() {
            return g.this.t();
         }

         @Override
         public boolean a(cjh $$0) {
            g.this.a($$0);
            return true;
         }
      };
      @Nullable
      private bir.g.a u;

      public g(biw<?> $$0, cpx $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a_() {
         super.a_();
         this.an.a(r, cjh.b);
         this.an.a(s, cje.a.a());
      }

      @Override
      public void a(aeg<?> $$0) {
         super.a($$0);
         if (r.equals($$0) || s.equals($$0)) {
            this.o = true;
         }
      }

      cjh t() {
         return this.an.b(r);
      }

      void a(cjh $$0) {
         this.an.b(r, $$0);
      }

      private void a(cje $$0) {
         this.an.b(s, $$0.a());
      }

      private cje v() {
         return cje.k.apply(this.an.b(s));
      }

      @Override
      protected void a(qy $$0) {
         super.a($$0);
         this.a(cjh.a($$0.p("item")));
         if ($$0.b("item_display", 8)) {
            cje.j.decode(rk.a, $$0.c("item_display")).resultOrPartial(ac.a("Display entity", bir.p::error)).ifPresent($$0x -> this.a((cje)$$0x.getFirst()));
         }
      }

      @Override
      protected void b(qy $$0) {
         super.b($$0);
         $$0.a("item", this.t().b(new qy()));
         cje.j.encodeStart(rk.a, this.v()).result().ifPresent($$1 -> $$0.a("item_display", $$1));
      }

      @Override
      public bka a_(int $$0) {
         return $$0 == 0 ? this.t : bka.b;
      }

      @Nullable
      public bir.g.a s() {
         return this.u;
      }

      @Override
      protected void a(boolean $$0, float $$1) {
         this.u = new bir.g.a(this.t(), this.v());
      }

      public static record a(cjh a, cje b) {
      }
   }

   static record h(float a, float b) implements bir.d {
      @Override
      public float get(float $$0) {
         return ary.i($$0, this.a, this.b);
      }
   }

   static record i(int a, int b) implements bir.f {
      @Override
      public int get(float $$0) {
         return ary.a($$0, this.a, this.b);
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

      void a(bis $$0) {
         $$0.e(this.b, this.c, this.d);
         $$0.a((float)this.e, (float)this.f);
      }

      void b(bis $$0) {
         $$0.a(this.a, this.b, this.c, this.d, this.e, this.f);
      }
   }

   public static record k(bir.e<j> a, bir.a b, int c, bir.d d, bir.d e, int f) {
   }

   public static class l extends bir {
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
      private static final aeg<tn> aM = aej.a(bir.l.class, aei.f);
      private static final aeg<Integer> aN = aej.a(bir.l.class, aei.b);
      private static final aeg<Integer> aO = aej.a(bir.l.class, aei.b);
      private static final aeg<Byte> aP = aej.a(bir.l.class, aei.a);
      private static final aeg<Byte> aQ = aej.a(bir.l.class, aei.a);
      private static final IntSet aR = IntSet.of(new int[]{aM.a(), aN.a(), aO.a(), aP.a(), aQ.a()});
      @Nullable
      private bir.l.b aS;
      @Nullable
      private bir.l.e aT;

      public l(biw<?> $$0, cpx $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a_() {
         super.a_();
         this.an.a(aM, tn.h());
         this.an.a(aN, 200);
         this.an.a(aO, 1073741824);
         this.an.a(aP, (byte)-1);
         this.an.a(aQ, (byte)0);
      }

      @Override
      public void a(aeg<?> $$0) {
         super.a($$0);
         if (aR.contains($$0.a())) {
            this.o = true;
         }
      }

      private tn t() {
         return this.an.b(aM);
      }

      private void c(tn $$0) {
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

      private static byte a(byte $$0, qy $$1, String $$2, byte $$3) {
         return $$1.q($$2) ? (byte)($$0 | $$3) : $$0;
      }

      @Override
      protected void a(qy $$0) {
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
         Optional<bir.l.a> $$2 = bir.l.a.d.decode(rk.a, $$0.c("alignment")).resultOrPartial(ac.a("Display entity", bir.p::error)).map(Pair::getFirst);
         if ($$2.isPresent()) {
            $$1 = switch ((bir.l.a)$$2.get()) {
               case a -> $$1;
               case b -> (byte)($$1 | 8);
               case c -> (byte)($$1 | 16);
            };
         }

         this.d($$1);
         if ($$0.b("text", 8)) {
            String $$3 = $$0.l("text");

            try {
               tn $$4 = tn.a.a($$3);
               if ($$4 != null) {
                  dt $$5 = this.dc().a(2);
                  tn $$6 = tp.a($$5, $$4, this, 0);
                  this.c($$6);
               } else {
                  this.c(tn.h());
               }
            } catch (Exception var8) {
               bir.p.warn("Failed to parse display entity text {}", $$3, var8);
            }
         }
      }

      private static void b(byte $$0, qy $$1, String $$2, byte $$3) {
         $$1.a($$2, ($$0 & $$3) != 0);
      }

      @Override
      protected void b(qy $$0) {
         super.b($$0);
         $$0.a("text", tn.a.a(this.t()));
         $$0.a("line_width", this.v());
         $$0.a("background", this.x());
         $$0.a("text_opacity", this.w());
         byte $$1 = this.y();
         b($$1, $$0, "shadow", (byte)1);
         b($$1, $$0, "see_through", (byte)2);
         b($$1, $$0, "default_background", (byte)4);
         bir.l.a.d.encodeStart(rk.a, a($$1)).result().ifPresent($$1x -> $$0.a("alignment", $$1x));
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
      public bir.l.e s() {
         return this.aT;
      }

      private bir.l.e z() {
         return new bir.l.e(this.t(), this.v(), bir.f.constant(this.w()), bir.f.constant(this.x()), this.y());
      }

      private bir.l.e a(bir.l.e $$0, float $$1) {
         int $$2 = $$0.d.get($$1);
         int $$3 = $$0.c.get($$1);
         return new bir.l.e(this.t(), this.v(), new bir.i($$3, this.w()), new bir.c($$2, this.x()), this.y());
      }

      public bir.l.b a(bir.l.d $$0) {
         if (this.aS == null) {
            if (this.aT != null) {
               this.aS = $$0.split(this.aT.a(), this.aT.b());
            } else {
               this.aS = new bir.l.b(List.of(), 0);
            }
         }

         return this.aS;
      }

      public static bir.l.a a(byte $$0) {
         if (($$0 & 8) != 0) {
            return bir.l.a.b;
         } else {
            return ($$0 & 16) != 0 ? bir.l.a.c : bir.l.a.a;
         }
      }

      public static enum a implements asr {
         a("center"),
         b("left"),
         c("right");

         public static final Codec<bir.l.a> d = asr.a(bir.l.a::values);
         private final String e;

         private a(String $$0) {
            this.e = $$0;
         }

         @Override
         public String c() {
            return this.e;
         }
      }

      public static record b(List<bir.l.c> a, int b) {
      }

      public static record c(arl a, int b) {
      }

      @FunctionalInterface
      public interface d {
         bir.l.b split(tn var1, int var2);
      }

      public static record e(tn a, int b, bir.f c, bir.f d, byte e) {
      }
   }

   static record m(j a, j b) implements bir.e<j> {
      public j a(float $$0) {
         return (double)$$0 >= 1.0 ? this.b : this.a.a(this.b, $$0);
      }
   }
}
