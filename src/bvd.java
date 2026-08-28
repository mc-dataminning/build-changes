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

public abstract class bvd extends bvf {
   static final Logger o = LogUtils.getLogger();
   public static final int a = -1;
   private static final alc<Integer> p = alg.a(bvd.class, ale.b);
   private static final alc<Integer> q = alg.a(bvd.class, ale.b);
   private static final alc<Integer> r = alg.a(bvd.class, ale.b);
   private static final alc<Vector3f> s = alg.a(bvd.class, ale.D);
   private static final alc<Vector3f> t = alg.a(bvd.class, ale.D);
   private static final alc<Quaternionf> u = alg.a(bvd.class, ale.E);
   private static final alc<Quaternionf> ay = alg.a(bvd.class, ale.E);
   private static final alc<Byte> az = alg.a(bvd.class, ale.a);
   private static final alc<Integer> aA = alg.a(bvd.class, ale.b);
   private static final alc<Float> aB = alg.a(bvd.class, ale.d);
   private static final alc<Float> aC = alg.a(bvd.class, ale.d);
   private static final alc<Float> aD = alg.a(bvd.class, ale.d);
   private static final alc<Float> aE = alg.a(bvd.class, ale.d);
   private static final alc<Float> aF = alg.a(bvd.class, ale.d);
   private static final alc<Integer> aG = alg.a(bvd.class, ale.b);
   private static final IntSet aH = IntSet.of(new int[]{s.a(), t.a(), u.a(), ay.a(), az.a(), aA.a(), aC.a(), aD.a()});
   private static final float aI = 0.0F;
   private static final float aJ = 1.0F;
   private static final int aK = -1;
   public static final String b = "teleport_duration";
   public static final String c = "interpolation_duration";
   public static final String d = "start_interpolation";
   public static final String e = "transformation";
   public static final String f = "billboard";
   public static final String g = "brightness";
   public static final String h = "view_range";
   public static final String i = "shadow_radius";
   public static final String j = "shadow_strength";
   public static final String k = "width";
   public static final String l = "height";
   public static final String m = "glow_color_override";
   private long aL = -2147483648L;
   private int aM;
   private float aN;
   private fbn aO;
   private boolean aP = true;
   protected boolean n;
   private boolean aQ;
   private boolean aR;
   @Nullable
   private bvd.k aS;
   @Nullable
   private bvd.j aT;

   public bvd(bvm<?> $$0, dha $$1) {
      super($$0, $$1);
      this.ad = true;
      this.aO = this.cR();
   }

   @Override
   public void a(alc<?> $$0) {
      super.a($$0);
      if (aF.equals($$0) || aE.equals($$0)) {
         this.E();
      }

      if (p.equals($$0)) {
         this.aQ = true;
      }

      if (q.equals($$0)) {
         this.aR = true;
      }

      if (aH.contains($$0.a())) {
         this.n = true;
      }
   }

   @Override
   public final boolean a(ash $$0, btv $$1, float $$2) {
      return false;
   }

   private static j a(alg $$0) {
      Vector3f $$1 = $$0.a(s);
      Quaternionf $$2 = $$0.a(u);
      Vector3f $$3 = $$0.a(t);
      Quaternionf $$4 = $$0.a(ay);
      return new j($$1, $$2, $$3, $$4);
   }

   @Override
   public void h() {
      bvf $$0 = this.dk();
      if ($$0 != null && $$0.dQ()) {
         this.ae();
      }

      if (this.dV().C) {
         if (this.aQ) {
            this.aQ = false;
            int $$1 = this.t();
            this.aL = (long)(this.af + $$1);
         }

         if (this.aR) {
            this.aR = false;
            this.aM = this.s();
         }

         if (this.n) {
            this.n = false;
            boolean $$2 = this.aM != 0;
            if ($$2 && this.aS != null) {
               this.aS = this.a(this.aS, this.aN);
            } else {
               this.aS = this.F();
            }

            this.a($$2, this.aN);
         }

         if (this.aT != null) {
            if (this.aT.a == 0) {
               this.aT.a(this);
               this.bz();
               this.aT = null;
            } else {
               this.aT.b(this);
               this.aT.a--;
               if (this.aT.a == 0) {
                  this.aT = null;
               }
            }
         }
      }
   }

   protected abstract void a(boolean var1, float var2);

   @Override
   protected void a(alg.a $$0) {
      $$0.a(r, 0);
      $$0.a(p, 0);
      $$0.a(q, 0);
      $$0.a(s, new Vector3f());
      $$0.a(t, new Vector3f(1.0F, 1.0F, 1.0F));
      $$0.a(ay, new Quaternionf());
      $$0.a(u, new Quaternionf());
      $$0.a(az, bvd.a.a.a());
      $$0.a(aA, -1);
      $$0.a(aB, 1.0F);
      $$0.a(aC, 0.0F);
      $$0.a(aD, 1.0F);
      $$0.a(aE, 0.0F);
      $$0.a(aF, 0.0F);
      $$0.a(aG, -1);
   }

   @Override
   protected void a(ux $$0) {
      if ($$0.e("transformation")) {
         j.b.decode(vl.a, $$0.c("transformation")).resultOrPartial(ae.a("Display entity", o::error)).ifPresent($$0x -> this.a((j)$$0x.getFirst()));
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
         this.d(bae.a($$3, 0, 59));
      }

      if ($$0.b("billboard", 8)) {
         bvd.a.e.decode(vl.a, $$0.c("billboard")).resultOrPartial(ae.a("Display entity", o::error)).ifPresent($$0x -> this.a((bvd.a)$$0x.getFirst()));
      }

      if ($$0.b("view_range", 99)) {
         this.b($$0.j("view_range"));
      }

      if ($$0.b("shadow_radius", 99)) {
         this.c($$0.j("shadow_radius"));
      }

      if ($$0.b("shadow_strength", 99)) {
         this.x($$0.j("shadow_strength"));
      }

      if ($$0.b("width", 99)) {
         this.y($$0.j("width"));
      }

      if ($$0.b("height", 99)) {
         this.z($$0.j("height"));
      }

      if ($$0.b("glow_color_override", 99)) {
         this.l($$0.h("glow_color_override"));
      }

      if ($$0.b("brightness", 10)) {
         ayu.b.decode(vl.a, $$0.c("brightness")).resultOrPartial(ae.a("Display entity", o::error)).ifPresent($$0x -> this.a((ayu)$$0x.getFirst()));
      } else {
         this.a(null);
      }
   }

   private void a(j $$0) {
      this.al.a(s, $$0.d());
      this.al.a(u, $$0.e());
      this.al.a(t, $$0.f());
      this.al.a(ay, $$0.g());
   }

   @Override
   protected void b(ux $$0) {
      j.b.encodeStart(vl.a, a(this.al)).ifSuccess($$1x -> $$0.a("transformation", $$1x));
      bvd.a.e.encodeStart(vl.a, this.v()).ifSuccess($$1x -> $$0.a("billboard", $$1x));
      $$0.a("interpolation_duration", this.s());
      $$0.a("teleport_duration", this.u());
      $$0.a("view_range", this.y());
      $$0.a("shadow_radius", this.z());
      $$0.a("shadow_strength", this.A());
      $$0.a("width", this.B());
      $$0.a("height", this.D());
      $$0.a("glow_color_override", this.C());
      ayu $$1 = this.w();
      if ($$1 != null) {
         ayu.b.encodeStart(vl.a, $$1).ifSuccess($$1x -> $$0.a("brightness", $$1x));
      }
   }

   @Override
   public void f_() {
      this.aT = null;
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      int $$6 = this.u();
      this.aT = new bvd.j($$6, $$0, $$1, $$2, (double)$$3, (double)$$4);
   }

   @Override
   public double R_() {
      return this.aT != null ? this.aT.b : this.dA();
   }

   @Override
   public double S_() {
      return this.aT != null ? this.aT.c : this.dC();
   }

   @Override
   public double g_() {
      return this.aT != null ? this.aT.d : this.dG();
   }

   @Override
   public float r_() {
      return this.aT != null ? (float)this.aT.f : this.dN();
   }

   @Override
   public float h_() {
      return this.aT != null ? (float)this.aT.e : this.dL();
   }

   public fbn l() {
      return this.aO;
   }

   public boolean m() {
      return !this.aP;
   }

   @Override
   public etu n_() {
      return etu.d;
   }

   @Override
   public boolean s_() {
      return true;
   }

   @Nullable
   public bvd.k p() {
      return this.aS;
   }

   private void b(int $$0) {
      this.al.a(q, $$0);
   }

   private int s() {
      return this.al.a(q);
   }

   private void c(int $$0) {
      this.al.a(p, $$0, true);
   }

   private int t() {
      return this.al.a(p);
   }

   private void d(int $$0) {
      this.al.a(r, $$0);
   }

   private int u() {
      return this.al.a(r);
   }

   private void a(bvd.a $$0) {
      this.al.a(az, $$0.a());
   }

   private bvd.a v() {
      return bvd.a.f.apply(this.al.a(az));
   }

   private void a(@Nullable ayu $$0) {
      this.al.a(aA, $$0 != null ? $$0.a() : -1);
   }

   @Nullable
   private ayu w() {
      int $$0 = this.al.a(aA);
      return $$0 != -1 ? ayu.a($$0) : null;
   }

   private int x() {
      return this.al.a(aA);
   }

   private void b(float $$0) {
      this.al.a(aB, $$0);
   }

   private float y() {
      return this.al.a(aB);
   }

   private void c(float $$0) {
      this.al.a(aC, $$0);
   }

   private float z() {
      return this.al.a(aC);
   }

   private void x(float $$0) {
      this.al.a(aD, $$0);
   }

   private float A() {
      return this.al.a(aD);
   }

   private void y(float $$0) {
      this.al.a(aE, $$0);
   }

   private float B() {
      return this.al.a(aE);
   }

   private void z(float $$0) {
      this.al.a(aF, $$0);
   }

   private int C() {
      return this.al.a(aG);
   }

   private void l(int $$0) {
      this.al.a(aG, $$0);
   }

   public float a(float $$0) {
      int $$1 = this.aM;
      if ($$1 <= 0) {
         return 1.0F;
      } else {
         float $$2 = (float)((long)this.af - this.aL);
         float $$3 = $$2 + $$0;
         float $$4 = bae.a(bae.f($$3, 0.0F, (float)$$1), 0.0F, 1.0F);
         this.aN = $$4;
         return $$4;
      }
   }

   private float D() {
      return this.al.a(aF);
   }

   @Override
   public void a_(double $$0, double $$1, double $$2) {
      super.a_($$0, $$1, $$2);
      this.E();
   }

   private void E() {
      float $$0 = this.B();
      float $$1 = this.D();
      this.aP = $$0 == 0.0F || $$1 == 0.0F;
      float $$2 = $$0 / 2.0F;
      double $$3 = this.dA();
      double $$4 = this.dC();
      double $$5 = this.dG();
      this.aO = new fbn($$3 - (double)$$2, $$4, $$5 - (double)$$2, $$3 + (double)$$2, $$4 + (double)$$1, $$5 + (double)$$2);
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < bae.k((double)this.y() * 64.0 * cK());
   }

   @Override
   public int k_() {
      int $$0 = this.C();
      return $$0 != -1 ? $$0 : super.k_();
   }

   private bvd.k F() {
      return new bvd.k(bvd.e.constant(a(this.al)), this.v(), this.x(), bvd.d.constant(this.z()), bvd.d.constant(this.A()), this.C());
   }

   private bvd.k a(bvd.k $$0, float $$1) {
      j $$2 = $$0.a.get($$1);
      float $$3 = $$0.d.get($$1);
      float $$4 = $$0.e.get($$1);
      return new bvd.k(new bvd.m($$2, a(this.al)), this.v(), this.x(), new bvd.h($$3, this.z()), new bvd.h($$4, this.A()), this.C());
   }

   public static enum a implements bba {
      a((byte)0, "fixed"),
      b((byte)1, "vertical"),
      c((byte)2, "horizontal"),
      d((byte)3, "center");

      public static final Codec<bvd.a> e = bba.a(bvd.a::values);
      public static final IntFunction<bvd.a> f = ayv.a(bvd.a::a, values(), ayv.a.a);
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

   public static class b extends bvd {
      public static final String o = "block_state";
      private static final alc<dxn> p = alg.a(bvd.b.class, ale.i);
      @Nullable
      private bvd.b.a q;

      public b(bvm<?> $$0, dha $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a(alg.a $$0) {
         super.a($$0);
         $$0.a(p, dkg.a.m());
      }

      @Override
      public void a(alc<?> $$0) {
         super.a($$0);
         if ($$0.equals(p)) {
            this.n = true;
         }
      }

      private dxn t() {
         return this.al.a(p);
      }

      private void c(dxn $$0) {
         this.al.a(p, $$0);
      }

      @Override
      protected void a(ux $$0) {
         super.a($$0);
         this.c(vm.a(this.dV().a(mb.f), $$0.p("block_state")));
      }

      @Override
      protected void b(ux $$0) {
         super.b($$0);
         $$0.a("block_state", vm.a(this.t()));
      }

      @Nullable
      public bvd.b.a s() {
         return this.q;
      }

      @Override
      protected void a(boolean $$0, float $$1) {
         this.q = new bvd.b.a(this.t());
      }

      public static record a(dxn a) {
      }
   }

   static record c(int a, int b) implements bvd.f {
      @Override
      public int get(float $$0) {
         return ayp.a($$0, this.a, this.b);
      }
   }

   @FunctionalInterface
   public interface d {
      static bvd.d constant(float $$0) {
         return $$1 -> $$0;
      }

      float get(float var1);
   }

   @FunctionalInterface
   public interface e<T> {
      static <T> bvd.e<T> constant(T $$0) {
         return $$1 -> $$0;
      }

      T get(float var1);
   }

   @FunctionalInterface
   public interface f {
      static bvd.f constant(int $$0) {
         return $$1 -> $$0;
      }

      int get(float var1);
   }

   public static class g extends bvd {
      private static final String o = "item";
      private static final String p = "item_display";
      private static final alc<cxk> q = alg.a(bvd.g.class, ale.h);
      private static final alc<Byte> r = alg.a(bvd.g.class, ale.a);
      private final bwt s = bwt.a(this::t, this::a);
      @Nullable
      private bvd.g.a t;

      public g(bvm<?> $$0, dha $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a(alg.a $$0) {
         super.a($$0);
         $$0.a(q, cxk.k);
         $$0.a(r, cxi.a.a());
      }

      @Override
      public void a(alc<?> $$0) {
         super.a($$0);
         if (q.equals($$0) || r.equals($$0)) {
            this.n = true;
         }
      }

      private cxk t() {
         return this.al.a(q);
      }

      private void a(cxk $$0) {
         this.al.a(q, $$0);
      }

      private void a(cxi $$0) {
         this.al.a(r, $$0.a());
      }

      private cxi u() {
         return cxi.k.apply(this.al.a(r));
      }

      @Override
      protected void a(ux $$0) {
         super.a($$0);
         if ($$0.e("item")) {
            this.a(cxk.a(this.dX(), (vu)$$0.p("item")).orElse(cxk.k));
         } else {
            this.a(cxk.k);
         }

         if ($$0.b("item_display", 8)) {
            cxi.j.decode(vl.a, $$0.c("item_display")).resultOrPartial(ae.a("Display entity", bvd.o::error)).ifPresent($$0x -> this.a((cxi)$$0x.getFirst()));
         }
      }

      @Override
      protected void b(ux $$0) {
         super.b($$0);
         if (!this.t().f()) {
            $$0.a("item", this.t().a(this.dX()));
         }

         cxi.j.encodeStart(vl.a, this.u()).ifSuccess($$1 -> $$0.a("item_display", $$1));
      }

      @Override
      public bwt a_(int $$0) {
         return $$0 == 0 ? this.s : bwt.a;
      }

      @Nullable
      public bvd.g.a s() {
         return this.t;
      }

      @Override
      protected void a(boolean $$0, float $$1) {
         cxk $$2 = this.t();
         $$2.a(this);
         this.t = new bvd.g.a($$2, this.u());
      }

      public static record a(cxk a, cxi b) {
      }
   }

   static record h(float a, float b) implements bvd.d {
      @Override
      public float get(float $$0) {
         return bae.h($$0, this.a, this.b);
      }
   }

   static record i(int a, int b) implements bvd.f {
      @Override
      public int get(float $$0) {
         return bae.a($$0, this.a, this.b);
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

      void a(bvf $$0) {
         $$0.a_(this.b, this.c, this.d);
         $$0.b((float)this.e, (float)this.f);
      }

      void b(bvf $$0) {
         $$0.a(this.a, this.b, this.c, this.d, this.e, this.f);
      }
   }

   public static record k(bvd.e<j> a, bvd.a b, int c, bvd.d d, bvd.d e, int f) {
   }

   public static class l extends bvd {
      public static final String o = "text";
      private static final String ay = "line_width";
      private static final String az = "text_opacity";
      private static final String aA = "background";
      private static final String aB = "shadow";
      private static final String aC = "see_through";
      private static final String aD = "default_background";
      private static final String aE = "alignment";
      public static final byte p = 1;
      public static final byte q = 2;
      public static final byte r = 4;
      public static final byte s = 8;
      public static final byte t = 16;
      private static final byte aF = -1;
      public static final int u = 1073741824;
      private static final alc<xv> aG = alg.a(bvd.l.class, ale.f);
      private static final alc<Integer> aH = alg.a(bvd.l.class, ale.b);
      private static final alc<Integer> aI = alg.a(bvd.l.class, ale.b);
      private static final alc<Byte> aJ = alg.a(bvd.l.class, ale.a);
      private static final alc<Byte> aK = alg.a(bvd.l.class, ale.a);
      private static final IntSet aL = IntSet.of(new int[]{aG.a(), aH.a(), aI.a(), aJ.a(), aK.a()});
      @Nullable
      private bvd.l.b aM;
      @Nullable
      private bvd.l.e aN;

      public l(bvm<?> $$0, dha $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a(alg.a $$0) {
         super.a($$0);
         $$0.a(aG, xv.i());
         $$0.a(aH, 200);
         $$0.a(aI, 1073741824);
         $$0.a(aJ, (byte)-1);
         $$0.a(aK, (byte)0);
      }

      @Override
      public void a(alc<?> $$0) {
         super.a($$0);
         if (aL.contains($$0.a())) {
            this.n = true;
         }
      }

      private xv t() {
         return this.al.a(aG);
      }

      private void a(xv $$0) {
         this.al.a(aG, $$0);
      }

      private int u() {
         return this.al.a(aH);
      }

      private void b(int $$0) {
         this.al.a(aH, $$0);
      }

      private byte v() {
         return this.al.a(aJ);
      }

      private void c(byte $$0) {
         this.al.a(aJ, $$0);
      }

      private int w() {
         return this.al.a(aI);
      }

      private void c(int $$0) {
         this.al.a(aI, $$0);
      }

      private byte x() {
         return this.al.a(aK);
      }

      private void d(byte $$0) {
         this.al.a(aK, $$0);
      }

      private static byte a(byte $$0, ux $$1, String $$2, byte $$3) {
         return $$1.q($$2) ? (byte)($$0 | $$3) : $$0;
      }

      @Override
      protected void a(ux $$0) {
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
         Optional<bvd.l.a> $$2 = bvd.l.a.d.decode(vl.a, $$0.c("alignment")).resultOrPartial(ae.a("Display entity", bvd.o::error)).map(Pair::getFirst);
         if ($$2.isPresent()) {
            $$1 = switch ((bvd.l.a)$$2.get()) {
               case a -> $$1;
               case b -> (byte)($$1 | 8);
               case c -> (byte)($$1 | 16);
            };
         }

         this.d($$1);
         if ($$0.b("text", 8)) {
            String $$3 = $$0.l("text");

            try {
               xv $$4 = xv.a.a($$3, this.dX());
               if ($$4 != null && this.dV() instanceof ash $$5) {
                  ew $$6 = this.d($$5).a(2);
                  xv $$7 = xy.a($$6, $$4, this, 0);
                  this.a($$7);
               } else {
                  this.a(xv.i());
               }
            } catch (Exception var9) {
               bvd.o.warn("Failed to parse display entity text {}", $$3, var9);
            }
         }
      }

      private static void b(byte $$0, ux $$1, String $$2, byte $$3) {
         $$1.a($$2, ($$0 & $$3) != 0);
      }

      @Override
      protected void b(ux $$0) {
         super.b($$0);
         $$0.a("text", xv.a.a(this.t(), this.dX()));
         $$0.a("line_width", this.u());
         $$0.a("background", this.w());
         $$0.a("text_opacity", this.v());
         byte $$1 = this.x();
         b($$1, $$0, "shadow", (byte)1);
         b($$1, $$0, "see_through", (byte)2);
         b($$1, $$0, "default_background", (byte)4);
         bvd.l.a.d.encodeStart(vl.a, a($$1)).ifSuccess($$1x -> $$0.a("alignment", $$1x));
      }

      @Override
      protected void a(boolean $$0, float $$1) {
         if ($$0 && this.aN != null) {
            this.aN = this.a(this.aN, $$1);
         } else {
            this.aN = this.y();
         }

         this.aM = null;
      }

      @Nullable
      public bvd.l.e s() {
         return this.aN;
      }

      private bvd.l.e y() {
         return new bvd.l.e(this.t(), this.u(), bvd.f.constant(this.v()), bvd.f.constant(this.w()), this.x());
      }

      private bvd.l.e a(bvd.l.e $$0, float $$1) {
         int $$2 = $$0.d.get($$1);
         int $$3 = $$0.c.get($$1);
         return new bvd.l.e(this.t(), this.u(), new bvd.i($$3, this.v()), new bvd.c($$2, this.w()), this.x());
      }

      public bvd.l.b a(bvd.l.d $$0) {
         if (this.aM == null) {
            if (this.aN != null) {
               this.aM = $$0.split(this.aN.a(), this.aN.b());
            } else {
               this.aM = new bvd.l.b(List.of(), 0);
            }
         }

         return this.aM;
      }

      public static bvd.l.a a(byte $$0) {
         if (($$0 & 8) != 0) {
            return bvd.l.a.b;
         } else {
            return ($$0 & 16) != 0 ? bvd.l.a.c : bvd.l.a.a;
         }
      }

      public static enum a implements bba {
         a("center"),
         b("left"),
         c("right");

         public static final Codec<bvd.l.a> d = bba.a(bvd.l.a::values);
         private final String e;

         private a(final String $$0) {
            this.e = $$0;
         }

         @Override
         public String c() {
            return this.e;
         }
      }

      public static record b(List<bvd.l.c> a, int b) {
      }

      public static record c(azq a, int b) {
      }

      @FunctionalInterface
      public interface d {
         bvd.l.b split(xv var1, int var2);
      }

      public static record e(xv a, int b, bvd.f c, bvd.f d, byte e) {
      }
   }

   static record m(j a, j b) implements bvd.e<j> {
      public j a(float $$0) {
         return (double)$$0 >= 1.0 ? this.b : this.a.a(this.b, $$0);
      }
   }
}
