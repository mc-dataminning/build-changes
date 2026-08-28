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

public abstract class bvi extends bvk {
   static final Logger o = LogUtils.getLogger();
   public static final int a = -1;
   private static final alc<Integer> p = alg.a(bvi.class, ale.b);
   private static final alc<Integer> q = alg.a(bvi.class, ale.b);
   private static final alc<Integer> r = alg.a(bvi.class, ale.b);
   private static final alc<Vector3f> s = alg.a(bvi.class, ale.D);
   private static final alc<Vector3f> t = alg.a(bvi.class, ale.D);
   private static final alc<Quaternionf> u = alg.a(bvi.class, ale.E);
   private static final alc<Quaternionf> ay = alg.a(bvi.class, ale.E);
   private static final alc<Byte> az = alg.a(bvi.class, ale.a);
   private static final alc<Integer> aA = alg.a(bvi.class, ale.b);
   private static final alc<Float> aB = alg.a(bvi.class, ale.d);
   private static final alc<Float> aC = alg.a(bvi.class, ale.d);
   private static final alc<Float> aD = alg.a(bvi.class, ale.d);
   private static final alc<Float> aE = alg.a(bvi.class, ale.d);
   private static final alc<Float> aF = alg.a(bvi.class, ale.d);
   private static final alc<Integer> aG = alg.a(bvi.class, ale.b);
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
   private fbt aO;
   private boolean aP = true;
   protected boolean n;
   private boolean aQ;
   private boolean aR;
   @Nullable
   private bvi.k aS;
   @Nullable
   private bvi.j aT;

   public bvi(bvr<?> $$0, dhi $$1) {
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
   public final boolean a(ash $$0, bua $$1, float $$2) {
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
      bvk $$0 = this.dl();
      if ($$0 != null && $$0.dR()) {
         this.ae();
      }

      if (this.dW().C) {
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
      $$0.a(az, bvi.a.a.a());
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
         bvi.a.e.decode(vl.a, $$0.c("billboard")).resultOrPartial(ae.a("Display entity", o::error)).ifPresent($$0x -> this.a((bvi.a)$$0x.getFirst()));
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
      bvi.a.e.encodeStart(vl.a, this.v()).ifSuccess($$1x -> $$0.a("billboard", $$1x));
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
      this.aT = new bvi.j($$6, $$0, $$1, $$2, (double)$$3, (double)$$4);
   }

   @Override
   public double R_() {
      return this.aT != null ? this.aT.b : this.dB();
   }

   @Override
   public double S_() {
      return this.aT != null ? this.aT.c : this.dD();
   }

   @Override
   public double g_() {
      return this.aT != null ? this.aT.d : this.dH();
   }

   @Override
   public float r_() {
      return this.aT != null ? (float)this.aT.f : this.dO();
   }

   @Override
   public float h_() {
      return this.aT != null ? (float)this.aT.e : this.dM();
   }

   public fbt l() {
      return this.aO;
   }

   public boolean m() {
      return !this.aP;
   }

   @Override
   public euc n_() {
      return euc.d;
   }

   @Override
   public boolean s_() {
      return true;
   }

   @Nullable
   public bvi.k p() {
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

   private void a(bvi.a $$0) {
      this.al.a(az, $$0.a());
   }

   private bvi.a v() {
      return bvi.a.f.apply(this.al.a(az));
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
      double $$3 = this.dB();
      double $$4 = this.dD();
      double $$5 = this.dH();
      this.aO = new fbt($$3 - (double)$$2, $$4, $$5 - (double)$$2, $$3 + (double)$$2, $$4 + (double)$$1, $$5 + (double)$$2);
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

   private bvi.k F() {
      return new bvi.k(bvi.e.constant(a(this.al)), this.v(), this.x(), bvi.d.constant(this.z()), bvi.d.constant(this.A()), this.C());
   }

   private bvi.k a(bvi.k $$0, float $$1) {
      j $$2 = $$0.a.get($$1);
      float $$3 = $$0.d.get($$1);
      float $$4 = $$0.e.get($$1);
      return new bvi.k(new bvi.m($$2, a(this.al)), this.v(), this.x(), new bvi.h($$3, this.z()), new bvi.h($$4, this.A()), this.C());
   }

   public static enum a implements bba {
      a((byte)0, "fixed"),
      b((byte)1, "vertical"),
      c((byte)2, "horizontal"),
      d((byte)3, "center");

      public static final Codec<bvi.a> e = bba.a(bvi.a::values);
      public static final IntFunction<bvi.a> f = ayv.a(bvi.a::a, values(), ayv.a.a);
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

   public static class b extends bvi {
      public static final String o = "block_state";
      private static final alc<dxv> p = alg.a(bvi.b.class, ale.i);
      @Nullable
      private bvi.b.a q;

      public b(bvr<?> $$0, dhi $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a(alg.a $$0) {
         super.a($$0);
         $$0.a(p, dko.a.m());
      }

      @Override
      public void a(alc<?> $$0) {
         super.a($$0);
         if ($$0.equals(p)) {
            this.n = true;
         }
      }

      private dxv t() {
         return this.al.a(p);
      }

      private void c(dxv $$0) {
         this.al.a(p, $$0);
      }

      @Override
      protected void a(ux $$0) {
         super.a($$0);
         this.c(vm.a(this.dW().a(mb.f), $$0.p("block_state")));
      }

      @Override
      protected void b(ux $$0) {
         super.b($$0);
         $$0.a("block_state", vm.a(this.t()));
      }

      @Nullable
      public bvi.b.a s() {
         return this.q;
      }

      @Override
      protected void a(boolean $$0, float $$1) {
         this.q = new bvi.b.a(this.t());
      }

      public static record a(dxv a) {
      }
   }

   static record c(int a, int b) implements bvi.f {
      @Override
      public int get(float $$0) {
         return ayp.a($$0, this.a, this.b);
      }
   }

   @FunctionalInterface
   public interface d {
      static bvi.d constant(float $$0) {
         return $$1 -> $$0;
      }

      float get(float var1);
   }

   @FunctionalInterface
   public interface e<T> {
      static <T> bvi.e<T> constant(T $$0) {
         return $$1 -> $$0;
      }

      T get(float var1);
   }

   @FunctionalInterface
   public interface f {
      static bvi.f constant(int $$0) {
         return $$1 -> $$0;
      }

      int get(float var1);
   }

   public static class g extends bvi {
      private static final String o = "item";
      private static final String p = "item_display";
      private static final alc<cxp> q = alg.a(bvi.g.class, ale.h);
      private static final alc<Byte> r = alg.a(bvi.g.class, ale.a);
      private final bwy s = bwy.a(this::t, this::a);
      @Nullable
      private bvi.g.a t;

      public g(bvr<?> $$0, dhi $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a(alg.a $$0) {
         super.a($$0);
         $$0.a(q, cxp.j);
         $$0.a(r, cxn.a.a());
      }

      @Override
      public void a(alc<?> $$0) {
         super.a($$0);
         if (q.equals($$0) || r.equals($$0)) {
            this.n = true;
         }
      }

      private cxp t() {
         return this.al.a(q);
      }

      private void a(cxp $$0) {
         this.al.a(q, $$0);
      }

      private void a(cxn $$0) {
         this.al.a(r, $$0.a());
      }

      private cxn u() {
         return cxn.k.apply(this.al.a(r));
      }

      @Override
      protected void a(ux $$0) {
         super.a($$0);
         if ($$0.e("item")) {
            this.a(cxp.a(this.dY(), (vu)$$0.p("item")).orElse(cxp.j));
         } else {
            this.a(cxp.j);
         }

         if ($$0.b("item_display", 8)) {
            cxn.j.decode(vl.a, $$0.c("item_display")).resultOrPartial(ae.a("Display entity", bvi.o::error)).ifPresent($$0x -> this.a((cxn)$$0x.getFirst()));
         }
      }

      @Override
      protected void b(ux $$0) {
         super.b($$0);
         if (!this.t().f()) {
            $$0.a("item", this.t().a(this.dY()));
         }

         cxn.j.encodeStart(vl.a, this.u()).ifSuccess($$1 -> $$0.a("item_display", $$1));
      }

      @Override
      public bwy a_(int $$0) {
         return $$0 == 0 ? this.s : bwy.a;
      }

      @Nullable
      public bvi.g.a s() {
         return this.t;
      }

      @Override
      protected void a(boolean $$0, float $$1) {
         cxp $$2 = this.t();
         $$2.a(this);
         this.t = new bvi.g.a($$2, this.u());
      }

      public static record a(cxp a, cxn b) {
      }
   }

   static record h(float a, float b) implements bvi.d {
      @Override
      public float get(float $$0) {
         return bae.h($$0, this.a, this.b);
      }
   }

   static record i(int a, int b) implements bvi.f {
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

      void a(bvk $$0) {
         $$0.a_(this.b, this.c, this.d);
         $$0.b((float)this.e, (float)this.f);
      }

      void b(bvk $$0) {
         $$0.a(this.a, this.b, this.c, this.d, this.e, this.f);
      }
   }

   public static record k(bvi.e<j> a, bvi.a b, int c, bvi.d d, bvi.d e, int f) {
   }

   public static class l extends bvi {
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
      private static final alc<xv> aG = alg.a(bvi.l.class, ale.f);
      private static final alc<Integer> aH = alg.a(bvi.l.class, ale.b);
      private static final alc<Integer> aI = alg.a(bvi.l.class, ale.b);
      private static final alc<Byte> aJ = alg.a(bvi.l.class, ale.a);
      private static final alc<Byte> aK = alg.a(bvi.l.class, ale.a);
      private static final IntSet aL = IntSet.of(new int[]{aG.a(), aH.a(), aI.a(), aJ.a(), aK.a()});
      @Nullable
      private bvi.l.b aM;
      @Nullable
      private bvi.l.e aN;

      public l(bvr<?> $$0, dhi $$1) {
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
         Optional<bvi.l.a> $$2 = bvi.l.a.d.decode(vl.a, $$0.c("alignment")).resultOrPartial(ae.a("Display entity", bvi.o::error)).map(Pair::getFirst);
         if ($$2.isPresent()) {
            $$1 = switch ((bvi.l.a)$$2.get()) {
               case a -> $$1;
               case b -> (byte)($$1 | 8);
               case c -> (byte)($$1 | 16);
            };
         }

         this.d($$1);
         if ($$0.b("text", 8)) {
            String $$3 = $$0.l("text");

            try {
               xv $$4 = xv.a.a($$3, this.dY());
               if ($$4 != null && this.dW() instanceof ash $$5) {
                  ew $$6 = this.d($$5).a(2);
                  xv $$7 = xy.a($$6, $$4, this, 0);
                  this.a($$7);
               } else {
                  this.a(xv.i());
               }
            } catch (Exception var9) {
               bvi.o.warn("Failed to parse display entity text {}", $$3, var9);
            }
         }
      }

      private static void b(byte $$0, ux $$1, String $$2, byte $$3) {
         $$1.a($$2, ($$0 & $$3) != 0);
      }

      @Override
      protected void b(ux $$0) {
         super.b($$0);
         $$0.a("text", xv.a.a(this.t(), this.dY()));
         $$0.a("line_width", this.u());
         $$0.a("background", this.w());
         $$0.a("text_opacity", this.v());
         byte $$1 = this.x();
         b($$1, $$0, "shadow", (byte)1);
         b($$1, $$0, "see_through", (byte)2);
         b($$1, $$0, "default_background", (byte)4);
         bvi.l.a.d.encodeStart(vl.a, a($$1)).ifSuccess($$1x -> $$0.a("alignment", $$1x));
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
      public bvi.l.e s() {
         return this.aN;
      }

      private bvi.l.e y() {
         return new bvi.l.e(this.t(), this.u(), bvi.f.constant(this.v()), bvi.f.constant(this.w()), this.x());
      }

      private bvi.l.e a(bvi.l.e $$0, float $$1) {
         int $$2 = $$0.d.get($$1);
         int $$3 = $$0.c.get($$1);
         return new bvi.l.e(this.t(), this.u(), new bvi.i($$3, this.v()), new bvi.c($$2, this.w()), this.x());
      }

      public bvi.l.b a(bvi.l.d $$0) {
         if (this.aM == null) {
            if (this.aN != null) {
               this.aM = $$0.split(this.aN.a(), this.aN.b());
            } else {
               this.aM = new bvi.l.b(List.of(), 0);
            }
         }

         return this.aM;
      }

      public static bvi.l.a a(byte $$0) {
         if (($$0 & 8) != 0) {
            return bvi.l.a.b;
         } else {
            return ($$0 & 16) != 0 ? bvi.l.a.c : bvi.l.a.a;
         }
      }

      public static enum a implements bba {
         a("center"),
         b("left"),
         c("right");

         public static final Codec<bvi.l.a> d = bba.a(bvi.l.a::values);
         private final String e;

         private a(final String $$0) {
            this.e = $$0;
         }

         @Override
         public String c() {
            return this.e;
         }
      }

      public static record b(List<bvi.l.c> a, int b) {
      }

      public static record c(azq a, int b) {
      }

      @FunctionalInterface
      public interface d {
         bvi.l.b split(xv var1, int var2);
      }

      public static record e(xv a, int b, bvi.f c, bvi.f d, byte e) {
      }
   }

   static record m(j a, j b) implements bvi.e<j> {
      public j a(float $$0) {
         return (double)$$0 >= 1.0 ? this.b : this.a.a(this.b, $$0);
      }
   }
}
