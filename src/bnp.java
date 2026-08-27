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

public abstract class bnp extends bnq {
   static final Logger p = LogUtils.getLogger();
   public static final int b = -1;
   private static final aie<Integer> q = aih.a(bnp.class, aig.b);
   private static final aie<Integer> r = aih.a(bnp.class, aig.b);
   private static final aie<Integer> s = aih.a(bnp.class, aig.b);
   private static final aie<Vector3f> t = aih.a(bnp.class, aig.B);
   private static final aie<Vector3f> u = aih.a(bnp.class, aig.B);
   private static final aie<Quaternionf> v = aih.a(bnp.class, aig.C);
   private static final aie<Quaternionf> aD = aih.a(bnp.class, aig.C);
   private static final aie<Byte> aE = aih.a(bnp.class, aig.a);
   private static final aie<Integer> aF = aih.a(bnp.class, aig.b);
   private static final aie<Float> aG = aih.a(bnp.class, aig.d);
   private static final aie<Float> aH = aih.a(bnp.class, aig.d);
   private static final aie<Float> aI = aih.a(bnp.class, aig.d);
   private static final aie<Float> aJ = aih.a(bnp.class, aig.d);
   private static final aie<Float> aK = aih.a(bnp.class, aig.d);
   private static final aie<Integer> aL = aih.a(bnp.class, aig.b);
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
   private enu aT;
   protected boolean o;
   private boolean aU;
   private boolean aV;
   @Nullable
   private bnp.k aW;
   @Nullable
   private bnp.j aX;

   public bnp(bnw<?> $$0, cvr $$1) {
      super($$0, $$1);
      this.ae = true;
      this.as = true;
      this.aT = this.cH();
   }

   @Override
   public void a(aie<?> $$0) {
      super.a($$0);
      if (aK.equals($$0) || aJ.equals($$0)) {
         this.H();
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

   private static j a(aih $$0) {
      Vector3f $$1 = $$0.b(t);
      Quaternionf $$2 = $$0.b(v);
      Vector3f $$3 = $$0.b(u);
      Quaternionf $$4 = $$0.b(aD);
      return new j($$1, $$2, $$3, $$4);
   }

   @Override
   public void l() {
      bnq $$0 = this.cZ();
      if ($$0 != null && $$0.dH()) {
         this.ac();
      }

      if (this.dM().B) {
         if (this.aU) {
            this.aU = false;
            int $$1 = this.u();
            this.aQ = (long)(this.ag + $$1);
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
               this.aW = this.I();
            }

            this.a($$2, this.aS);
         }

         if (this.aX != null) {
            if (this.aX.a == 0) {
               this.aX.a(this);
               this.bp();
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
   protected void c_() {
      this.am.a(s, 0);
      this.am.a(q, 0);
      this.am.a(r, 0);
      this.am.a(t, new Vector3f());
      this.am.a(u, new Vector3f(1.0F, 1.0F, 1.0F));
      this.am.a(aD, new Quaternionf());
      this.am.a(v, new Quaternionf());
      this.am.a(aE, bnp.a.a.a());
      this.am.a(aF, -1);
      this.am.a(aG, 1.0F);
      this.am.a(aH, 0.0F);
      this.am.a(aI, 1.0F);
      this.am.a(aJ, 0.0F);
      this.am.a(aK, 0.0F);
      this.am.a(aL, -1);
   }

   @Override
   protected void a(sw $$0) {
      if ($$0.e("transformation")) {
         j.b.decode(tk.a, $$0.c("transformation")).resultOrPartial(ac.a("Display entity", p::error)).ifPresent($$0x -> this.a((j)$$0x.getFirst()));
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
         this.d(awi.a($$3, 0, 59));
      }

      if ($$0.b("billboard", 8)) {
         bnp.a.e.decode(tk.a, $$0.c("billboard")).resultOrPartial(ac.a("Display entity", p::error)).ifPresent($$0x -> this.a((bnp.a)$$0x.getFirst()));
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
         auz.b.decode(tk.a, $$0.c("brightness")).resultOrPartial(ac.a("Display entity", p::error)).ifPresent($$0x -> this.a((auz)$$0x.getFirst()));
      } else {
         this.a(null);
      }
   }

   private void a(j $$0) {
      this.am.b(t, $$0.d());
      this.am.b(v, $$0.e());
      this.am.b(u, $$0.f());
      this.am.b(aD, $$0.g());
   }

   @Override
   protected void b(sw $$0) {
      j.b.encodeStart(tk.a, a(this.am)).result().ifPresent($$1x -> $$0.a("transformation", $$1x));
      bnp.a.e.encodeStart(tk.a, this.x()).result().ifPresent($$1x -> $$0.a("billboard", $$1x));
      $$0.a("interpolation_duration", this.s());
      $$0.a("teleport_duration", this.w());
      $$0.a("view_range", this.A());
      $$0.a("shadow_radius", this.B());
      $$0.a("shadow_strength", this.C());
      $$0.a("width", this.D());
      $$0.a("height", this.G());
      $$0.a("glow_color_override", this.E());
      auz $$1 = this.y();
      if ($$1 != null) {
         auz.b.encodeStart(tk.a, $$1).result().ifPresent($$1x -> $$0.a("brightness", $$1x));
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      int $$6 = this.w();
      this.aX = new bnp.j($$6, $$0, $$1, $$2, (double)$$3, (double)$$4);
   }

   @Override
   public double p_() {
      return this.aX != null ? this.aX.b : this.dr();
   }

   @Override
   public double N_() {
      return this.aX != null ? this.aX.c : this.dt();
   }

   @Override
   public double O_() {
      return this.aX != null ? this.aX.d : this.dx();
   }

   @Override
   public float f_() {
      return this.aX != null ? (float)this.aX.f : this.dE();
   }

   @Override
   public float q_() {
      return this.aX != null ? (float)this.aX.e : this.dC();
   }

   @Override
   public enu i_() {
      return this.aT;
   }

   @Override
   public ehb s_() {
      return ehb.d;
   }

   @Override
   public boolean r_() {
      return true;
   }

   @Nullable
   public bnp.k q() {
      return this.aW;
   }

   private void b(int $$0) {
      this.am.b(r, $$0);
   }

   private int s() {
      return this.am.b(r);
   }

   private void c(int $$0) {
      this.am.a(q, $$0, true);
   }

   private int u() {
      return this.am.b(q);
   }

   private void d(int $$0) {
      this.am.b(s, $$0);
   }

   private int w() {
      return this.am.b(s);
   }

   private void a(bnp.a $$0) {
      this.am.b(aE, $$0.a());
   }

   private bnp.a x() {
      return bnp.a.f.apply(this.am.b(aE));
   }

   private void a(@Nullable auz $$0) {
      this.am.b(aF, $$0 != null ? $$0.a() : -1);
   }

   @Nullable
   private auz y() {
      int $$0 = this.am.b(aF);
      return $$0 != -1 ? auz.a($$0) : null;
   }

   private int z() {
      return this.am.b(aF);
   }

   private void b(float $$0) {
      this.am.b(aG, $$0);
   }

   private float A() {
      return this.am.b(aG);
   }

   private void c(float $$0) {
      this.am.b(aH, $$0);
   }

   private float B() {
      return this.am.b(aH);
   }

   private void t(float $$0) {
      this.am.b(aI, $$0);
   }

   private float C() {
      return this.am.b(aI);
   }

   private void u(float $$0) {
      this.am.b(aJ, $$0);
   }

   private float D() {
      return this.am.b(aJ);
   }

   private void v(float $$0) {
      this.am.b(aK, $$0);
   }

   private int E() {
      return this.am.b(aL);
   }

   private void n(int $$0) {
      this.am.b(aL, $$0);
   }

   public float a(float $$0) {
      int $$1 = this.aR;
      if ($$1 <= 0) {
         return 1.0F;
      } else {
         float $$2 = (float)((long)this.ag - this.aQ);
         float $$3 = $$2 + $$0;
         float $$4 = awi.a(awi.g($$3, 0.0F, (float)$$1), 0.0F, 1.0F);
         this.aS = $$4;
         return $$4;
      }
   }

   private float G() {
      return this.am.b(aK);
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
         this.as = false;
         float $$2 = $$0 / 2.0F;
         double $$3 = this.dr();
         double $$4 = this.dt();
         double $$5 = this.dx();
         this.aT = new enu($$3 - (double)$$2, $$4, $$5 - (double)$$2, $$3 + (double)$$2, $$4 + (double)$$1, $$5 + (double)$$2);
      } else {
         this.as = true;
      }
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < awi.k((double)this.A() * 64.0 * cA());
   }

   @Override
   public int j_() {
      int $$0 = this.E();
      return $$0 != -1 ? $$0 : super.j_();
   }

   private bnp.k I() {
      return new bnp.k(bnp.e.constant(a(this.am)), this.x(), this.z(), bnp.d.constant(this.B()), bnp.d.constant(this.C()), this.E());
   }

   private bnp.k a(bnp.k $$0, float $$1) {
      j $$2 = $$0.a.get($$1);
      float $$3 = $$0.d.get($$1);
      float $$4 = $$0.e.get($$1);
      return new bnp.k(new bnp.m($$2, a(this.am)), this.x(), this.z(), new bnp.h($$3, this.B()), new bnp.h($$4, this.C()), this.E());
   }

   public static enum a implements axc {
      a((byte)0, "fixed"),
      b((byte)1, "vertical"),
      c((byte)2, "horizontal"),
      d((byte)3, "center");

      public static final Codec<bnp.a> e = axc.a(bnp.a::values);
      public static final IntFunction<bnp.a> f = ava.a(bnp.a::a, values(), ava.a.a);
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

   public static class b extends bnp {
      public static final String p = "block_state";
      private static final aie<dlj> q = aih.a(bnp.b.class, aig.i);
      @Nullable
      private bnp.b.a r;

      public b(bnw<?> $$0, cvr $$1) {
         super($$0, $$1);
      }

      @Override
      protected void c_() {
         super.c_();
         this.am.a(q, cyu.a.o());
      }

      @Override
      public void a(aie<?> $$0) {
         super.a($$0);
         if ($$0.equals(q)) {
            this.o = true;
         }
      }

      private dlj u() {
         return this.am.b(q);
      }

      private void c(dlj $$0) {
         this.am.b(q, $$0);
      }

      @Override
      protected void a(sw $$0) {
         super.a($$0);
         this.c(tl.a(this.dM().a(kg.f), $$0.p("block_state")));
      }

      @Override
      protected void b(sw $$0) {
         super.b($$0);
         $$0.a("block_state", tl.a(this.u()));
      }

      @Nullable
      public bnp.b.a s() {
         return this.r;
      }

      @Override
      protected void a(boolean $$0, float $$1) {
         this.r = new bnp.b.a(this.u());
      }

      public static record a(dlj a) {
      }
   }

   static record c(int a, int b) implements bnp.f {
      @Override
      public int get(float $$0) {
         return avs.b.a($$0, this.a, this.b);
      }
   }

   @FunctionalInterface
   public interface d {
      static bnp.d constant(float $$0) {
         return $$1 -> $$0;
      }

      float get(float var1);
   }

   @FunctionalInterface
   public interface e<T> {
      static <T> bnp.e<T> constant(T $$0) {
         return $$1 -> $$0;
      }

      T get(float var1);
   }

   @FunctionalInterface
   public interface f {
      static bnp.f constant(int $$0) {
         return $$1 -> $$0;
      }

      int get(float var1);
   }

   public static class g extends bnp {
      private static final String p = "item";
      private static final String q = "item_display";
      private static final aie<cpd> r = aih.a(bnp.g.class, aig.h);
      private static final aie<Byte> s = aih.a(bnp.g.class, aig.a);
      private final boz t = new boz() {
         @Override
         public cpd a() {
            return g.this.u();
         }

         @Override
         public boolean a(cpd $$0) {
            g.this.a($$0);
            return true;
         }
      };
      @Nullable
      private bnp.g.a u;

      public g(bnw<?> $$0, cvr $$1) {
         super($$0, $$1);
      }

      @Override
      protected void c_() {
         super.c_();
         this.am.a(r, cpd.h);
         this.am.a(s, cpa.a.a());
      }

      @Override
      public void a(aie<?> $$0) {
         super.a($$0);
         if (r.equals($$0) || s.equals($$0)) {
            this.o = true;
         }
      }

      cpd u() {
         return this.am.b(r);
      }

      void a(cpd $$0) {
         this.am.b(r, $$0);
      }

      private void a(cpa $$0) {
         this.am.b(s, $$0.a());
      }

      private cpa w() {
         return cpa.k.apply(this.am.b(s));
      }

      @Override
      protected void a(sw $$0) {
         super.a($$0);
         this.a(cpd.a($$0.p("item")));
         if ($$0.b("item_display", 8)) {
            cpa.j.decode(tk.a, $$0.c("item_display")).resultOrPartial(ac.a("Display entity", bnp.p::error)).ifPresent($$0x -> this.a((cpa)$$0x.getFirst()));
         }
      }

      @Override
      protected void b(sw $$0) {
         super.b($$0);
         $$0.a("item", this.u().b(new sw()));
         cpa.j.encodeStart(tk.a, this.w()).result().ifPresent($$1 -> $$0.a("item_display", $$1));
      }

      @Override
      public boz a_(int $$0) {
         return $$0 == 0 ? this.t : boz.b;
      }

      @Nullable
      public bnp.g.a s() {
         return this.u;
      }

      @Override
      protected void a(boolean $$0, float $$1) {
         cpd $$2 = this.u();
         $$2.a(this);
         this.u = new bnp.g.a($$2, this.w());
      }

      public static record a(cpd a, cpa b) {
      }
   }

   static record h(float a, float b) implements bnp.d {
      @Override
      public float get(float $$0) {
         return awi.i($$0, this.a, this.b);
      }
   }

   static record i(int a, int b) implements bnp.f {
      @Override
      public int get(float $$0) {
         return awi.a($$0, this.a, this.b);
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

      void a(bnq $$0) {
         $$0.a_(this.b, this.c, this.d);
         $$0.a((float)this.e, (float)this.f);
      }

      void b(bnq $$0) {
         $$0.a(this.a, this.b, this.c, this.d, this.e, this.f);
      }
   }

   public static record k(bnp.e<j> a, bnp.a b, int c, bnp.d d, bnp.d e, int f) {
   }

   public static class l extends bnp {
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
      private static final aie<vq> aL = aih.a(bnp.l.class, aig.f);
      private static final aie<Integer> aM = aih.a(bnp.l.class, aig.b);
      private static final aie<Integer> aN = aih.a(bnp.l.class, aig.b);
      private static final aie<Byte> aO = aih.a(bnp.l.class, aig.a);
      private static final aie<Byte> aP = aih.a(bnp.l.class, aig.a);
      private static final IntSet aQ = IntSet.of(new int[]{aL.a(), aM.a(), aN.a(), aO.a(), aP.a()});
      @Nullable
      private bnp.l.b aR;
      @Nullable
      private bnp.l.e aS;

      public l(bnw<?> $$0, cvr $$1) {
         super($$0, $$1);
      }

      @Override
      protected void c_() {
         super.c_();
         this.am.a(aL, vq.i());
         this.am.a(aM, 200);
         this.am.a(aN, 1073741824);
         this.am.a(aO, (byte)-1);
         this.am.a(aP, (byte)0);
      }

      @Override
      public void a(aie<?> $$0) {
         super.a($$0);
         if (aQ.contains($$0.a())) {
            this.o = true;
         }
      }

      private vq u() {
         return this.am.b(aL);
      }

      private void c(vq $$0) {
         this.am.b(aL, $$0);
      }

      private int w() {
         return this.am.b(aM);
      }

      private void b(int $$0) {
         this.am.b(aM, $$0);
      }

      private byte x() {
         return this.am.b(aO);
      }

      private void c(byte $$0) {
         this.am.b(aO, $$0);
      }

      private int y() {
         return this.am.b(aN);
      }

      private void c(int $$0) {
         this.am.b(aN, $$0);
      }

      private byte z() {
         return this.am.b(aP);
      }

      private void d(byte $$0) {
         this.am.b(aP, $$0);
      }

      private static byte a(byte $$0, sw $$1, String $$2, byte $$3) {
         return $$1.q($$2) ? (byte)($$0 | $$3) : $$0;
      }

      @Override
      protected void a(sw $$0) {
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
         Optional<bnp.l.a> $$2 = bnp.l.a.d.decode(tk.a, $$0.c("alignment")).resultOrPartial(ac.a("Display entity", bnp.p::error)).map(Pair::getFirst);
         if ($$2.isPresent()) {
            $$1 = switch ((bnp.l.a)$$2.get()) {
               case a -> $$1;
               case b -> (byte)($$1 | 8);
               case c -> (byte)($$1 | 16);
            };
         }

         this.d($$1);
         if ($$0.b("text", 8)) {
            String $$3 = $$0.l("text");

            try {
               vq $$4 = vq.a.a($$3);
               if ($$4 != null) {
                  du $$5 = this.dd().a(2);
                  vq $$6 = vt.a($$5, $$4, this, 0);
                  this.c($$6);
               } else {
                  this.c(vq.i());
               }
            } catch (Exception var8) {
               bnp.p.warn("Failed to parse display entity text {}", $$3, var8);
            }
         }
      }

      private static void b(byte $$0, sw $$1, String $$2, byte $$3) {
         $$1.a($$2, ($$0 & $$3) != 0);
      }

      @Override
      protected void b(sw $$0) {
         super.b($$0);
         $$0.a("text", vq.a.a(this.u()));
         $$0.a("line_width", this.w());
         $$0.a("background", this.y());
         $$0.a("text_opacity", this.x());
         byte $$1 = this.z();
         b($$1, $$0, "shadow", (byte)1);
         b($$1, $$0, "see_through", (byte)2);
         b($$1, $$0, "default_background", (byte)4);
         bnp.l.a.d.encodeStart(tk.a, a($$1)).result().ifPresent($$1x -> $$0.a("alignment", $$1x));
      }

      @Override
      protected void a(boolean $$0, float $$1) {
         if ($$0 && this.aS != null) {
            this.aS = this.a(this.aS, $$1);
         } else {
            this.aS = this.A();
         }

         this.aR = null;
      }

      @Nullable
      public bnp.l.e s() {
         return this.aS;
      }

      private bnp.l.e A() {
         return new bnp.l.e(this.u(), this.w(), bnp.f.constant(this.x()), bnp.f.constant(this.y()), this.z());
      }

      private bnp.l.e a(bnp.l.e $$0, float $$1) {
         int $$2 = $$0.d.get($$1);
         int $$3 = $$0.c.get($$1);
         return new bnp.l.e(this.u(), this.w(), new bnp.i($$3, this.x()), new bnp.c($$2, this.y()), this.z());
      }

      public bnp.l.b a(bnp.l.d $$0) {
         if (this.aR == null) {
            if (this.aS != null) {
               this.aR = $$0.split(this.aS.a(), this.aS.b());
            } else {
               this.aR = new bnp.l.b(List.of(), 0);
            }
         }

         return this.aR;
      }

      public static bnp.l.a a(byte $$0) {
         if (($$0 & 8) != 0) {
            return bnp.l.a.b;
         } else {
            return ($$0 & 16) != 0 ? bnp.l.a.c : bnp.l.a.a;
         }
      }

      public static enum a implements axc {
         a("center"),
         b("left"),
         c("right");

         public static final Codec<bnp.l.a> d = axc.a(bnp.l.a::values);
         private final String e;

         private a(String $$0) {
            this.e = $$0;
         }

         @Override
         public String c() {
            return this.e;
         }
      }

      public static record b(List<bnp.l.c> a, int b) {
      }

      public static record c(avu a, int b) {
      }

      @FunctionalInterface
      public interface d {
         bnp.l.b split(vq var1, int var2);
      }

      public static record e(vq a, int b, bnp.f c, bnp.f d, byte e) {
      }
   }

   static record m(j a, j b) implements bnp.e<j> {
      public j a(float $$0) {
         return (double)$$0 >= 1.0 ? this.b : this.a.a(this.b, $$0);
      }
   }
}
