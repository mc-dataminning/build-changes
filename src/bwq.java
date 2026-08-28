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

public abstract class bwq extends bwt {
   static final Logger o = LogUtils.getLogger();
   public static final int a = -1;
   private static final akl<Integer> p = akp.a(bwq.class, akn.b);
   private static final akl<Integer> q = akp.a(bwq.class, akn.b);
   private static final akl<Integer> r = akp.a(bwq.class, akn.b);
   private static final akl<Vector3f> s = akp.a(bwq.class, akn.H);
   private static final akl<Vector3f> t = akp.a(bwq.class, akn.H);
   private static final akl<Quaternionf> u = akp.a(bwq.class, akn.I);
   private static final akl<Quaternionf> ay = akp.a(bwq.class, akn.I);
   private static final akl<Byte> az = akp.a(bwq.class, akn.a);
   private static final akl<Integer> aA = akp.a(bwq.class, akn.b);
   private static final akl<Float> aB = akp.a(bwq.class, akn.d);
   private static final akl<Float> aC = akp.a(bwq.class, akn.d);
   private static final akl<Float> aD = akp.a(bwq.class, akn.d);
   private static final akl<Float> aE = akp.a(bwq.class, akn.d);
   private static final akl<Float> aF = akp.a(bwq.class, akn.d);
   private static final akl<Integer> aG = akp.a(bwq.class, akn.b);
   private static final IntSet aH = IntSet.of(new int[]{s.a(), t.a(), u.a(), ay.a(), az.a(), aA.a(), aC.a(), aD.a()});
   private static final int aI = 0;
   private static final int aJ = 0;
   private static final int aK = 0;
   private static final float aL = 0.0F;
   private static final float aM = 1.0F;
   private static final float aN = 1.0F;
   private static final float aO = 0.0F;
   private static final float aP = 0.0F;
   private static final int aQ = -1;
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
   private long aR = -2147483648L;
   private int aS;
   private float aT;
   private ffl aU;
   private boolean aV = true;
   protected boolean n;
   private boolean aW;
   private boolean aX;
   @Nullable
   private bwq.j aY;
   private final bxp aZ = new bxp(this, 0);

   public bwq(bxc<?> $$0, djx $$1) {
      super($$0, $$1);
      this.ad = true;
      this.aU = this.cR();
   }

   @Override
   public void a(akl<?> $$0) {
      super.a($$0);
      if (aF.equals($$0) || aE.equals($$0)) {
         this.A();
      }

      if (p.equals($$0)) {
         this.aW = true;
      }

      if (r.equals($$0)) {
         this.aZ.a(this.o());
      }

      if (q.equals($$0)) {
         this.aX = true;
      }

      if (aH.contains($$0.a())) {
         this.n = true;
      }
   }

   @Override
   public final boolean a(ars $$0, bvi $$1, float $$2) {
      return false;
   }

   private static k a(akp $$0) {
      Vector3f $$1 = $$0.a(s);
      Quaternionf $$2 = $$0.a(u);
      Vector3f $$3 = $$0.a(t);
      Quaternionf $$4 = $$0.a(ay);
      return new k($$1, $$2, $$3, $$4);
   }

   @Override
   public void h() {
      bwt $$0 = this.dk();
      if ($$0 != null && $$0.dQ()) {
         this.bO();
      }

      if (this.dV().C) {
         if (this.aW) {
            this.aW = false;
            int $$1 = this.n();
            this.aR = (long)(this.af + $$1);
         }

         if (this.aX) {
            this.aX = false;
            this.aS = this.m();
         }

         if (this.n) {
            this.n = false;
            boolean $$2 = this.aS != 0;
            if ($$2 && this.aY != null) {
               this.aY = this.a(this.aY, this.aT);
            } else {
               this.aY = this.B();
            }

            this.a($$2, this.aT);
         }

         this.aZ.e();
      }
   }

   @Override
   public bxp R_() {
      return this.aZ;
   }

   protected abstract void a(boolean var1, float var2);

   @Override
   protected void a(akp.a $$0) {
      $$0.a(r, 0);
      $$0.a(p, 0);
      $$0.a(q, 0);
      $$0.a(s, new Vector3f());
      $$0.a(t, new Vector3f(1.0F, 1.0F, 1.0F));
      $$0.a(ay, new Quaternionf());
      $$0.a(u, new Quaternionf());
      $$0.a(az, bwq.a.a.a());
      $$0.a(aA, -1);
      $$0.a(aB, 1.0F);
      $$0.a(aC, 0.0F);
      $$0.a(aD, 1.0F);
      $$0.a(aE, 0.0F);
      $$0.a(aF, 0.0F);
      $$0.a(aG, -1);
   }

   @Override
   protected void a(tz $$0) {
      this.a($$0.<k>a("transformation", k.b).orElse(k.a()));
      this.b($$0.b("interpolation_duration", 0));
      this.c($$0.b("start_interpolation", 0));
      int $$1 = $$0.b("teleport_duration", 0);
      this.d(azo.a($$1, 0, 59));
      this.a($$0.<bwq.a>a("billboard", bwq.a.e).orElse(bwq.a.a));
      this.b($$0.b("view_range", 1.0F));
      this.c($$0.b("shadow_radius", 0.0F));
      this.d($$0.b("shadow_strength", 1.0F));
      this.y($$0.b("width", 0.0F));
      this.z($$0.b("height", 0.0F));
      this.l($$0.b("glow_color_override", -1));
      this.a($$0.<ayd>a("brightness", ayd.b).orElse(null));
   }

   private void a(k $$0) {
      this.al.a(s, $$0.e());
      this.al.a(u, $$0.f());
      this.al.a(t, $$0.g());
      this.al.a(ay, $$0.h());
   }

   @Override
   protected void b(tz $$0) {
      $$0.a("transformation", k.b, a(this.al));
      $$0.a("billboard", bwq.a.e, this.q());
      $$0.a("interpolation_duration", this.m());
      $$0.a("teleport_duration", this.o());
      $$0.a("view_range", this.u());
      $$0.a("shadow_radius", this.v());
      $$0.a("shadow_strength", this.w());
      $$0.a("width", this.x());
      $$0.a("height", this.z());
      $$0.a("glow_color_override", this.y());
      $$0.b("brightness", ayd.b, this.s());
   }

   public ffl f() {
      return this.aU;
   }

   public boolean g() {
      return !this.aV;
   }

   @Override
   public ext j_() {
      return ext.d;
   }

   @Override
   public boolean g_() {
      return true;
   }

   @Nullable
   public bwq.j j() {
      return this.aY;
   }

   private void b(int $$0) {
      this.al.a(q, $$0);
   }

   private int m() {
      return this.al.a(q);
   }

   private void c(int $$0) {
      this.al.a(p, $$0, true);
   }

   private int n() {
      return this.al.a(p);
   }

   private void d(int $$0) {
      this.al.a(r, $$0);
   }

   private int o() {
      return this.al.a(r);
   }

   private void a(bwq.a $$0) {
      this.al.a(az, $$0.a());
   }

   private bwq.a q() {
      return bwq.a.f.apply(this.al.a(az));
   }

   private void a(@Nullable ayd $$0) {
      this.al.a(aA, $$0 != null ? $$0.a() : -1);
   }

   @Nullable
   private ayd s() {
      int $$0 = this.al.a(aA);
      return $$0 != -1 ? ayd.a($$0) : null;
   }

   private int t() {
      return this.al.a(aA);
   }

   private void b(float $$0) {
      this.al.a(aB, $$0);
   }

   private float u() {
      return this.al.a(aB);
   }

   private void c(float $$0) {
      this.al.a(aC, $$0);
   }

   private float v() {
      return this.al.a(aC);
   }

   private void d(float $$0) {
      this.al.a(aD, $$0);
   }

   private float w() {
      return this.al.a(aD);
   }

   private void y(float $$0) {
      this.al.a(aE, $$0);
   }

   private float x() {
      return this.al.a(aE);
   }

   private void z(float $$0) {
      this.al.a(aF, $$0);
   }

   private int y() {
      return this.al.a(aG);
   }

   private void l(int $$0) {
      this.al.a(aG, $$0);
   }

   public float a(float $$0) {
      int $$1 = this.aS;
      if ($$1 <= 0) {
         return 1.0F;
      } else {
         float $$2 = (float)((long)this.af - this.aR);
         float $$3 = $$2 + $$0;
         float $$4 = azo.a(azo.f($$3, 0.0F, (float)$$1), 0.0F, 1.0F);
         this.aT = $$4;
         return $$4;
      }
   }

   private float z() {
      return this.al.a(aF);
   }

   @Override
   public void a_(double $$0, double $$1, double $$2) {
      super.a_($$0, $$1, $$2);
      this.A();
   }

   private void A() {
      float $$0 = this.x();
      float $$1 = this.z();
      this.aV = $$0 == 0.0F || $$1 == 0.0F;
      float $$2 = $$0 / 2.0F;
      double $$3 = this.dA();
      double $$4 = this.dC();
      double $$5 = this.dG();
      this.aU = new ffl($$3 - (double)$$2, $$4, $$5 - (double)$$2, $$3 + (double)$$2, $$4 + (double)$$1, $$5 + (double)$$2);
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < azo.k((double)this.u() * 64.0 * cK());
   }

   @Override
   public int f_() {
      int $$0 = this.y();
      return $$0 != -1 ? $$0 : super.f_();
   }

   private bwq.j B() {
      return new bwq.j(bwq.e.constant(a(this.al)), this.q(), this.t(), bwq.d.constant(this.v()), bwq.d.constant(this.w()), this.y());
   }

   private bwq.j a(bwq.j $$0, float $$1) {
      k $$2 = $$0.a.get($$1);
      float $$3 = $$0.d.get($$1);
      float $$4 = $$0.e.get($$1);
      return new bwq.j(new bwq.l($$2, a(this.al)), this.q(), this.t(), new bwq.h($$3, this.v()), new bwq.h($$4, this.w()), this.y());
   }

   public static enum a implements bam {
      a((byte)0, "fixed"),
      b((byte)1, "vertical"),
      c((byte)2, "horizontal"),
      d((byte)3, "center");

      public static final Codec<bwq.a> e = bam.a(bwq.a::values);
      public static final IntFunction<bwq.a> f = aye.a(bwq.a::a, values(), aye.a.a);
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

   public static class b extends bwq {
      public static final String o = "block_state";
      private static final akl<ebe> p = akp.a(bwq.b.class, akn.i);
      @Nullable
      private bwq.b.a q;

      public b(bxc<?> $$0, djx $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a(akp.a $$0) {
         super.a($$0);
         $$0.a(p, dne.a.m());
      }

      @Override
      public void a(akl<?> $$0) {
         super.a($$0);
         if ($$0.equals(p)) {
            this.n = true;
         }
      }

      private ebe n() {
         return this.al.a(p);
      }

      private void c(ebe $$0) {
         this.al.a(p, $$0);
      }

      @Override
      protected void a(tz $$0) {
         super.a($$0);
         alg<uy> $$1 = this.dX().a(un.a);
         this.c($$0.<ebe>a("block_state", ebe.a, $$1).orElse(dne.a.m()));
      }

      @Override
      protected void b(tz $$0) {
         super.b($$0);
         alg<uy> $$1 = this.dX().a(un.a);
         $$0.a("block_state", ebe.a, $$1, this.n());
      }

      @Nullable
      public bwq.b.a m() {
         return this.q;
      }

      @Override
      protected void a(boolean $$0, float $$1) {
         this.q = new bwq.b.a(this.n());
      }

      public static record a(ebe a) {
      }
   }

   static record c(int a, int b) implements bwq.f {
      @Override
      public int get(float $$0) {
         return axy.a($$0, this.a, this.b);
      }
   }

   @FunctionalInterface
   public interface d {
      static bwq.d constant(float $$0) {
         return $$1 -> $$0;
      }

      float get(float var1);
   }

   @FunctionalInterface
   public interface e<T> {
      static <T> bwq.e<T> constant(T $$0) {
         return $$1 -> $$0;
      }

      T get(float var1);
   }

   @FunctionalInterface
   public interface f {
      static bwq.f constant(int $$0) {
         return $$1 -> $$0;
      }

      int get(float var1);
   }

   public static class g extends bwq {
      private static final String o = "item";
      private static final String p = "item_display";
      private static final akl<czy> q = akp.a(bwq.g.class, akn.h);
      private static final akl<Byte> r = akp.a(bwq.g.class, akn.a);
      private final byl s = byl.a(this::n, this::a);
      @Nullable
      private bwq.g.a t;

      public g(bxc<?> $$0, djx $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a(akp.a $$0) {
         super.a($$0);
         $$0.a(q, czy.k);
         $$0.a(r, czw.a.a());
      }

      @Override
      public void a(akl<?> $$0) {
         super.a($$0);
         if (q.equals($$0) || r.equals($$0)) {
            this.n = true;
         }
      }

      private czy n() {
         return this.al.a(q);
      }

      private void a(czy $$0) {
         this.al.a(q, $$0);
      }

      private void a(czw $$0) {
         this.al.a(r, $$0.a());
      }

      private czw o() {
         return czw.k.apply(this.al.a(r));
      }

      @Override
      protected void a(tz $$0) {
         super.a($$0);
         alg<uy> $$1 = this.dX().a(un.a);
         this.a($$0.<czy>a("item", czy.b, $$1).orElse(czy.k));
         this.a($$0.<czw>a("item_display", czw.j).orElse(czw.a));
      }

      @Override
      protected void b(tz $$0) {
         super.b($$0);
         if (!this.n().f()) {
            $$0.a("item", czy.b, this.dX().a(un.a), this.n());
         }

         $$0.a("item_display", czw.j, this.o());
      }

      @Override
      public byl a_(int $$0) {
         return $$0 == 0 ? this.s : byl.a;
      }

      @Nullable
      public bwq.g.a m() {
         return this.t;
      }

      @Override
      protected void a(boolean $$0, float $$1) {
         czy $$2 = this.n();
         $$2.a(this);
         this.t = new bwq.g.a($$2, this.o());
      }

      public static record a(czy a, czw b) {
      }
   }

   static record h(float a, float b) implements bwq.d {
      @Override
      public float get(float $$0) {
         return azo.h($$0, this.a, this.b);
      }
   }

   static record i(int a, int b) implements bwq.f {
      @Override
      public int get(float $$0) {
         return azo.a($$0, this.a, this.b);
      }
   }

   public static record j(bwq.e<k> a, bwq.a b, int c, bwq.d d, bwq.d e, int f) {
   }

   public static class k extends bwq {
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
      private static final int aG = 200;
      private static final akl<xa> aH = akp.a(bwq.k.class, akn.f);
      private static final akl<Integer> aI = akp.a(bwq.k.class, akn.b);
      private static final akl<Integer> aJ = akp.a(bwq.k.class, akn.b);
      private static final akl<Byte> aK = akp.a(bwq.k.class, akn.a);
      private static final akl<Byte> aL = akp.a(bwq.k.class, akn.a);
      private static final IntSet aM = IntSet.of(new int[]{aH.a(), aI.a(), aJ.a(), aK.a(), aL.a()});
      @Nullable
      private bwq.k.b aN;
      @Nullable
      private bwq.k.e aO;

      public k(bxc<?> $$0, djx $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a(akp.a $$0) {
         super.a($$0);
         $$0.a(aH, xa.i());
         $$0.a(aI, 200);
         $$0.a(aJ, 1073741824);
         $$0.a(aK, (byte)-1);
         $$0.a(aL, (byte)0);
      }

      @Override
      public void a(akl<?> $$0) {
         super.a($$0);
         if (aM.contains($$0.a())) {
            this.n = true;
         }
      }

      private xa n() {
         return this.al.a(aH);
      }

      private void a(xa $$0) {
         this.al.a(aH, $$0);
      }

      private int o() {
         return this.al.a(aI);
      }

      private void b(int $$0) {
         this.al.a(aI, $$0);
      }

      private byte q() {
         return this.al.a(aK);
      }

      private void c(byte $$0) {
         this.al.a(aK, $$0);
      }

      private int s() {
         return this.al.a(aJ);
      }

      private void c(int $$0) {
         this.al.a(aJ, $$0);
      }

      private byte t() {
         return this.al.a(aL);
      }

      private void d(byte $$0) {
         this.al.a(aL, $$0);
      }

      private static byte a(byte $$0, tz $$1, String $$2, byte $$3) {
         return $$1.b($$2, false) ? (byte)($$0 | $$3) : $$0;
      }

      @Override
      protected void a(tz $$0) {
         super.a($$0);
         this.b($$0.b("line_width", 200));
         this.c($$0.b("text_opacity", (byte)-1));
         this.c($$0.b("background", 1073741824));
         byte $$1 = a((byte)0, $$0, "shadow", (byte)1);
         $$1 = a($$1, $$0, "see_through", (byte)2);
         $$1 = a($$1, $$0, "default_background", (byte)4);
         Optional<bwq.k.a> $$2 = $$0.a("alignment", bwq.k.a.d);
         if ($$2.isPresent()) {
            $$1 = switch ((bwq.k.a)$$2.get()) {
               case a -> $$1;
               case b -> (byte)($$1 | 8);
               case c -> (byte)($$1 | 16);
            };
         }

         this.d($$1);
         uy $$3 = $$0.a("text");
         if ($$3 != null) {
            alg<uy> $$4 = this.dX().a(un.a);

            try {
               xa $$5 = (xa)xc.a.parse($$4, $$3).getOrThrow();
               if ($$5 != null && this.dV() instanceof ars $$6) {
                  ej $$7 = this.d($$6).a(2);
                  xa $$8 = xd.a($$7, $$5, this, 0);
                  this.a($$8);
               } else {
                  this.a(xa.i());
               }
            } catch (Exception var10) {
               bwq.o.warn("Failed to parse display entity text {}", $$3, var10);
            }
         }
      }

      private static void b(byte $$0, tz $$1, String $$2, byte $$3) {
         $$1.a($$2, ($$0 & $$3) != 0);
      }

      @Override
      protected void b(tz $$0) {
         super.b($$0);
         alg<uy> $$1 = this.dX().a(un.a);
         $$0.a("text", xc.a, $$1, this.n());
         $$0.a("line_width", this.o());
         $$0.a("background", this.s());
         $$0.a("text_opacity", this.q());
         byte $$2 = this.t();
         b($$2, $$0, "shadow", (byte)1);
         b($$2, $$0, "see_through", (byte)2);
         b($$2, $$0, "default_background", (byte)4);
         $$0.a("alignment", bwq.k.a.d, a($$2));
      }

      @Override
      protected void a(boolean $$0, float $$1) {
         if ($$0 && this.aO != null) {
            this.aO = this.a(this.aO, $$1);
         } else {
            this.aO = this.u();
         }

         this.aN = null;
      }

      @Nullable
      public bwq.k.e m() {
         return this.aO;
      }

      private bwq.k.e u() {
         return new bwq.k.e(this.n(), this.o(), bwq.f.constant(this.q()), bwq.f.constant(this.s()), this.t());
      }

      private bwq.k.e a(bwq.k.e $$0, float $$1) {
         int $$2 = $$0.d.get($$1);
         int $$3 = $$0.c.get($$1);
         return new bwq.k.e(this.n(), this.o(), new bwq.i($$3, this.q()), new bwq.c($$2, this.s()), this.t());
      }

      public bwq.k.b a(bwq.k.d $$0) {
         if (this.aN == null) {
            if (this.aO != null) {
               this.aN = $$0.split(this.aO.a(), this.aO.b());
            } else {
               this.aN = new bwq.k.b(List.of(), 0);
            }
         }

         return this.aN;
      }

      public static bwq.k.a a(byte $$0) {
         if (($$0 & 8) != 0) {
            return bwq.k.a.b;
         } else {
            return ($$0 & 16) != 0 ? bwq.k.a.c : bwq.k.a.a;
         }
      }

      public static enum a implements bam {
         a("center"),
         b("left"),
         c("right");

         public static final Codec<bwq.k.a> d = bam.a(bwq.k.a::values);
         private final String e;

         private a(final String $$0) {
            this.e = $$0;
         }

         @Override
         public String c() {
            return this.e;
         }
      }

      public static record b(List<bwq.k.c> a, int b) {
      }

      public static record c(aza a, int b) {
      }

      @FunctionalInterface
      public interface d {
         bwq.k.b split(xa var1, int var2);
      }

      public static record e(xa a, int b, bwq.f c, bwq.f d, byte e) {
      }
   }

   static record l(k a, k b) implements bwq.e<k> {
      public k a(float $$0) {
         return (double)$$0 >= 1.0 ? this.b : this.a.a(this.b, $$0);
      }
   }
}
