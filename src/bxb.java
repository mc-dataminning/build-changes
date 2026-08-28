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

public abstract class bxb extends bxe {
   static final Logger o = LogUtils.getLogger();
   public static final int a = -1;
   private static final aku<Integer> p = aky.a(bxb.class, akw.b);
   private static final aku<Integer> q = aky.a(bxb.class, akw.b);
   private static final aku<Integer> r = aky.a(bxb.class, akw.b);
   private static final aku<Vector3f> s = aky.a(bxb.class, akw.H);
   private static final aku<Vector3f> t = aky.a(bxb.class, akw.H);
   private static final aku<Quaternionf> u = aky.a(bxb.class, akw.I);
   private static final aku<Quaternionf> ay = aky.a(bxb.class, akw.I);
   private static final aku<Byte> az = aky.a(bxb.class, akw.a);
   private static final aku<Integer> aA = aky.a(bxb.class, akw.b);
   private static final aku<Float> aB = aky.a(bxb.class, akw.d);
   private static final aku<Float> aC = aky.a(bxb.class, akw.d);
   private static final aku<Float> aD = aky.a(bxb.class, akw.d);
   private static final aku<Float> aE = aky.a(bxb.class, akw.d);
   private static final aku<Float> aF = aky.a(bxb.class, akw.d);
   private static final aku<Integer> aG = aky.a(bxb.class, akw.b);
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
   private ffx aU;
   private boolean aV = true;
   protected boolean n;
   private boolean aW;
   private boolean aX;
   @Nullable
   private bxb.j aY;
   private final bya aZ = new bya(this, 0);

   public bxb(bxn<?> $$0, dkj $$1) {
      super($$0, $$1);
      this.ad = true;
      this.aU = this.cR();
   }

   @Override
   public void a(aku<?> $$0) {
      super.a($$0);
      if (aF.equals($$0) || aE.equals($$0)) {
         this.z();
      }

      if (p.equals($$0)) {
         this.aW = true;
      }

      if (r.equals($$0)) {
         this.aZ.a(this.n());
      }

      if (q.equals($$0)) {
         this.aX = true;
      }

      if (aH.contains($$0.a())) {
         this.n = true;
      }
   }

   @Override
   public final boolean a(asb $$0, bvt $$1, float $$2) {
      return false;
   }

   private static k a(aky $$0) {
      Vector3f $$1 = $$0.a(s);
      Quaternionf $$2 = $$0.a(u);
      Vector3f $$3 = $$0.a(t);
      Quaternionf $$4 = $$0.a(ay);
      return new k($$1, $$2, $$3, $$4);
   }

   @Override
   public void g() {
      bxe $$0 = this.dk();
      if ($$0 != null && $$0.dQ()) {
         this.bO();
      }

      if (this.dV().C) {
         if (this.aW) {
            this.aW = false;
            int $$1 = this.m();
            this.aR = (long)(this.af + $$1);
         }

         if (this.aX) {
            this.aX = false;
            this.aS = this.l();
         }

         if (this.n) {
            this.n = false;
            boolean $$2 = this.aS != 0;
            if ($$2 && this.aY != null) {
               this.aY = this.a(this.aY, this.aT);
            } else {
               this.aY = this.A();
            }

            this.a($$2, this.aT);
         }

         this.aZ.e();
      }
   }

   @Override
   public bya l_() {
      return this.aZ;
   }

   protected abstract void a(boolean var1, float var2);

   @Override
   protected void a(aky.a $$0) {
      $$0.a(r, 0);
      $$0.a(p, 0);
      $$0.a(q, 0);
      $$0.a(s, new Vector3f());
      $$0.a(t, new Vector3f(1.0F, 1.0F, 1.0F));
      $$0.a(ay, new Quaternionf());
      $$0.a(u, new Quaternionf());
      $$0.a(az, bxb.a.a.a());
      $$0.a(aA, -1);
      $$0.a(aB, 1.0F);
      $$0.a(aC, 0.0F);
      $$0.a(aD, 1.0F);
      $$0.a(aE, 0.0F);
      $$0.a(aF, 0.0F);
      $$0.a(aG, -1);
   }

   @Override
   protected void a(ua $$0) {
      this.a($$0.<k>a("transformation", k.b).orElse(k.a()));
      this.b($$0.b("interpolation_duration", 0));
      this.c($$0.b("start_interpolation", 0));
      int $$1 = $$0.b("teleport_duration", 0);
      this.d(azz.a($$1, 0, 59));
      this.a($$0.<bxb.a>a("billboard", bxb.a.e).orElse(bxb.a.a));
      this.b($$0.b("view_range", 1.0F));
      this.c($$0.b("shadow_radius", 0.0F));
      this.d($$0.b("shadow_strength", 1.0F));
      this.y($$0.b("width", 0.0F));
      this.z($$0.b("height", 0.0F));
      this.l($$0.b("glow_color_override", -1));
      this.a($$0.<ayn>a("brightness", ayn.b).orElse(null));
   }

   private void a(k $$0) {
      this.al.a(s, $$0.e());
      this.al.a(u, $$0.f());
      this.al.a(t, $$0.g());
      this.al.a(ay, $$0.h());
   }

   @Override
   protected void b(ua $$0) {
      $$0.a("transformation", k.b, a(this.al));
      $$0.a("billboard", bxb.a.e, this.p());
      $$0.a("interpolation_duration", this.l());
      $$0.a("teleport_duration", this.n());
      $$0.a("view_range", this.t());
      $$0.a("shadow_radius", this.u());
      $$0.a("shadow_strength", this.v());
      $$0.a("width", this.w());
      $$0.a("height", this.y());
      $$0.a("glow_color_override", this.x());
      $$0.b("brightness", ayn.b, this.r());
   }

   public ffx e() {
      return this.aU;
   }

   public boolean f() {
      return !this.aV;
   }

   @Override
   public eyf i_() {
      return eyf.d;
   }

   @Override
   public boolean n_() {
      return true;
   }

   @Nullable
   public bxb.j i() {
      return this.aY;
   }

   private void b(int $$0) {
      this.al.a(q, $$0);
   }

   private int l() {
      return this.al.a(q);
   }

   private void c(int $$0) {
      this.al.a(p, $$0, true);
   }

   private int m() {
      return this.al.a(p);
   }

   private void d(int $$0) {
      this.al.a(r, $$0);
   }

   private int n() {
      return this.al.a(r);
   }

   private void a(bxb.a $$0) {
      this.al.a(az, $$0.a());
   }

   private bxb.a p() {
      return bxb.a.f.apply(this.al.a(az));
   }

   private void a(@Nullable ayn $$0) {
      this.al.a(aA, $$0 != null ? $$0.a() : -1);
   }

   @Nullable
   private ayn r() {
      int $$0 = this.al.a(aA);
      return $$0 != -1 ? ayn.c($$0) : null;
   }

   private int s() {
      return this.al.a(aA);
   }

   private void b(float $$0) {
      this.al.a(aB, $$0);
   }

   private float t() {
      return this.al.a(aB);
   }

   private void c(float $$0) {
      this.al.a(aC, $$0);
   }

   private float u() {
      return this.al.a(aC);
   }

   private void d(float $$0) {
      this.al.a(aD, $$0);
   }

   private float v() {
      return this.al.a(aD);
   }

   private void y(float $$0) {
      this.al.a(aE, $$0);
   }

   private float w() {
      return this.al.a(aE);
   }

   private void z(float $$0) {
      this.al.a(aF, $$0);
   }

   private int x() {
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
         float $$4 = azz.a(azz.f($$3, 0.0F, (float)$$1), 0.0F, 1.0F);
         this.aT = $$4;
         return $$4;
      }
   }

   private float y() {
      return this.al.a(aF);
   }

   @Override
   public void a_(double $$0, double $$1, double $$2) {
      super.a_($$0, $$1, $$2);
      this.z();
   }

   private void z() {
      float $$0 = this.w();
      float $$1 = this.y();
      this.aV = $$0 == 0.0F || $$1 == 0.0F;
      float $$2 = $$0 / 2.0F;
      double $$3 = this.dA();
      double $$4 = this.dC();
      double $$5 = this.dG();
      this.aU = new ffx($$3 - (double)$$2, $$4, $$5 - (double)$$2, $$3 + (double)$$2, $$4 + (double)$$1, $$5 + (double)$$2);
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < azz.k((double)this.t() * 64.0 * cK());
   }

   @Override
   public int m_() {
      int $$0 = this.x();
      return $$0 != -1 ? $$0 : super.m_();
   }

   private bxb.j A() {
      return new bxb.j(bxb.e.constant(a(this.al)), this.p(), this.s(), bxb.d.constant(this.u()), bxb.d.constant(this.v()), this.x());
   }

   private bxb.j a(bxb.j $$0, float $$1) {
      k $$2 = $$0.a.get($$1);
      float $$3 = $$0.d.get($$1);
      float $$4 = $$0.e.get($$1);
      return new bxb.j(new bxb.l($$2, a(this.al)), this.p(), this.s(), new bxb.h($$3, this.u()), new bxb.h($$4, this.v()), this.x());
   }

   public static enum a implements bax {
      a((byte)0, "fixed"),
      b((byte)1, "vertical"),
      c((byte)2, "horizontal"),
      d((byte)3, "center");

      public static final Codec<bxb.a> e = bax.a(bxb.a::values);
      public static final IntFunction<bxb.a> f = ayo.a(bxb.a::a, values(), ayo.a.a);
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

   public static class b extends bxb {
      public static final String o = "block_state";
      private static final aku<ebq> p = aky.a(bxb.b.class, akw.i);
      @Nullable
      private bxb.b.a q;

      public b(bxn<?> $$0, dkj $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a(aky.a $$0) {
         super.a($$0);
         $$0.a(p, dnq.a.m());
      }

      @Override
      public void a(aku<?> $$0) {
         super.a($$0);
         if ($$0.equals(p)) {
            this.n = true;
         }
      }

      private ebq m() {
         return this.al.a(p);
      }

      private void c(ebq $$0) {
         this.al.a(p, $$0);
      }

      @Override
      protected void a(ua $$0) {
         super.a($$0);
         alp<va> $$1 = this.dX().a(uo.a);
         this.c($$0.<ebq>a("block_state", ebq.a, $$1).orElse(dnq.a.m()));
      }

      @Override
      protected void b(ua $$0) {
         super.b($$0);
         alp<va> $$1 = this.dX().a(uo.a);
         $$0.a("block_state", ebq.a, $$1, this.m());
      }

      @Nullable
      public bxb.b.a l() {
         return this.q;
      }

      @Override
      protected void a(boolean $$0, float $$1) {
         this.q = new bxb.b.a(this.m());
      }

      public static record a(ebq a) {
      }
   }

   static record c(int a, int b) implements bxb.f {
      @Override
      public int get(float $$0) {
         return ayh.a($$0, this.a, this.b);
      }
   }

   @FunctionalInterface
   public interface d {
      static bxb.d constant(float $$0) {
         return $$1 -> $$0;
      }

      float get(float var1);
   }

   @FunctionalInterface
   public interface e<T> {
      static <T> bxb.e<T> constant(T $$0) {
         return $$1 -> $$0;
      }

      T get(float var1);
   }

   @FunctionalInterface
   public interface f {
      static bxb.f constant(int $$0) {
         return $$1 -> $$0;
      }

      int get(float var1);
   }

   public static class g extends bxb {
      private static final String o = "item";
      private static final String p = "item_display";
      private static final aku<dak> q = aky.a(bxb.g.class, akw.h);
      private static final aku<Byte> r = aky.a(bxb.g.class, akw.a);
      private final byw s = byw.a(this::m, this::a);
      @Nullable
      private bxb.g.a t;

      public g(bxn<?> $$0, dkj $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a(aky.a $$0) {
         super.a($$0);
         $$0.a(q, dak.l);
         $$0.a(r, dai.a.a());
      }

      @Override
      public void a(aku<?> $$0) {
         super.a($$0);
         if (q.equals($$0) || r.equals($$0)) {
            this.n = true;
         }
      }

      private dak m() {
         return this.al.a(q);
      }

      private void a(dak $$0) {
         this.al.a(q, $$0);
      }

      private void a(dai $$0) {
         this.al.a(r, $$0.a());
      }

      private dai n() {
         return dai.k.apply(this.al.a(r));
      }

      @Override
      protected void a(ua $$0) {
         super.a($$0);
         alp<va> $$1 = this.dX().a(uo.a);
         this.a($$0.<dak>a("item", dak.b, $$1).orElse(dak.l));
         this.a($$0.<dai>a("item_display", dai.j).orElse(dai.a));
      }

      @Override
      protected void b(ua $$0) {
         super.b($$0);
         if (!this.m().f()) {
            $$0.a("item", dak.b, this.dX().a(uo.a), this.m());
         }

         $$0.a("item_display", dai.j, this.n());
      }

      @Override
      public byw a_(int $$0) {
         return $$0 == 0 ? this.s : byw.a;
      }

      @Nullable
      public bxb.g.a l() {
         return this.t;
      }

      @Override
      protected void a(boolean $$0, float $$1) {
         dak $$2 = this.m();
         $$2.a(this);
         this.t = new bxb.g.a($$2, this.n());
      }

      public static record a(dak a, dai b) {
      }
   }

   static record h(float a, float b) implements bxb.d {
      @Override
      public float get(float $$0) {
         return azz.h($$0, this.a, this.b);
      }
   }

   static record i(int a, int b) implements bxb.f {
      @Override
      public int get(float $$0) {
         return azz.a($$0, this.a, this.b);
      }
   }

   public static record j(bxb.e<k> a, bxb.a b, int c, bxb.d d, bxb.d e, int f) {
   }

   public static class k extends bxb {
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
      private static final aku<xg> aH = aky.a(bxb.k.class, akw.f);
      private static final aku<Integer> aI = aky.a(bxb.k.class, akw.b);
      private static final aku<Integer> aJ = aky.a(bxb.k.class, akw.b);
      private static final aku<Byte> aK = aky.a(bxb.k.class, akw.a);
      private static final aku<Byte> aL = aky.a(bxb.k.class, akw.a);
      private static final IntSet aM = IntSet.of(new int[]{aH.a(), aI.a(), aJ.a(), aK.a(), aL.a()});
      @Nullable
      private bxb.k.b aN;
      @Nullable
      private bxb.k.e aO;

      public k(bxn<?> $$0, dkj $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a(aky.a $$0) {
         super.a($$0);
         $$0.a(aH, xg.i());
         $$0.a(aI, 200);
         $$0.a(aJ, 1073741824);
         $$0.a(aK, (byte)-1);
         $$0.a(aL, (byte)0);
      }

      @Override
      public void a(aku<?> $$0) {
         super.a($$0);
         if (aM.contains($$0.a())) {
            this.n = true;
         }
      }

      private xg m() {
         return this.al.a(aH);
      }

      private void a(xg $$0) {
         this.al.a(aH, $$0);
      }

      private int n() {
         return this.al.a(aI);
      }

      private void b(int $$0) {
         this.al.a(aI, $$0);
      }

      private byte p() {
         return this.al.a(aK);
      }

      private void c(byte $$0) {
         this.al.a(aK, $$0);
      }

      private int r() {
         return this.al.a(aJ);
      }

      private void c(int $$0) {
         this.al.a(aJ, $$0);
      }

      private byte s() {
         return this.al.a(aL);
      }

      private void d(byte $$0) {
         this.al.a(aL, $$0);
      }

      private static byte a(byte $$0, ua $$1, String $$2, byte $$3) {
         return $$1.b($$2, false) ? (byte)($$0 | $$3) : $$0;
      }

      @Override
      protected void a(ua $$0) {
         super.a($$0);
         this.b($$0.b("line_width", 200));
         this.c($$0.b("text_opacity", (byte)-1));
         this.c($$0.b("background", 1073741824));
         byte $$1 = a((byte)0, $$0, "shadow", (byte)1);
         $$1 = a($$1, $$0, "see_through", (byte)2);
         $$1 = a($$1, $$0, "default_background", (byte)4);
         Optional<bxb.k.a> $$2 = $$0.a("alignment", bxb.k.a.d);
         if ($$2.isPresent()) {
            $$1 = switch ((bxb.k.a)$$2.get()) {
               case a -> $$1;
               case b -> (byte)($$1 | 8);
               case c -> (byte)($$1 | 16);
            };
         }

         this.d($$1);
         va $$3 = $$0.a("text");
         if ($$3 != null) {
            alp<va> $$4 = this.dX().a(uo.a);

            try {
               xg $$5 = (xg)xi.a.parse($$4, $$3).getOrThrow();
               if ($$5 != null && this.dV() instanceof asb $$6) {
                  ek $$7 = this.d($$6).a(2);
                  xg $$8 = xj.a($$7, $$5, this, 0);
                  this.a($$8);
               } else {
                  this.a(xg.i());
               }
            } catch (Exception var10) {
               bxb.o.warn("Failed to parse display entity text {}", $$3, var10);
            }
         }
      }

      private static void b(byte $$0, ua $$1, String $$2, byte $$3) {
         $$1.a($$2, ($$0 & $$3) != 0);
      }

      @Override
      protected void b(ua $$0) {
         super.b($$0);
         alp<va> $$1 = this.dX().a(uo.a);
         $$0.a("text", xi.a, $$1, this.m());
         $$0.a("line_width", this.n());
         $$0.a("background", this.r());
         $$0.a("text_opacity", this.p());
         byte $$2 = this.s();
         b($$2, $$0, "shadow", (byte)1);
         b($$2, $$0, "see_through", (byte)2);
         b($$2, $$0, "default_background", (byte)4);
         $$0.a("alignment", bxb.k.a.d, a($$2));
      }

      @Override
      protected void a(boolean $$0, float $$1) {
         if ($$0 && this.aO != null) {
            this.aO = this.a(this.aO, $$1);
         } else {
            this.aO = this.t();
         }

         this.aN = null;
      }

      @Nullable
      public bxb.k.e l() {
         return this.aO;
      }

      private bxb.k.e t() {
         return new bxb.k.e(this.m(), this.n(), bxb.f.constant(this.p()), bxb.f.constant(this.r()), this.s());
      }

      private bxb.k.e a(bxb.k.e $$0, float $$1) {
         int $$2 = $$0.d.get($$1);
         int $$3 = $$0.c.get($$1);
         return new bxb.k.e(this.m(), this.n(), new bxb.i($$3, this.p()), new bxb.c($$2, this.r()), this.s());
      }

      public bxb.k.b a(bxb.k.d $$0) {
         if (this.aN == null) {
            if (this.aO != null) {
               this.aN = $$0.split(this.aO.a(), this.aO.b());
            } else {
               this.aN = new bxb.k.b(List.of(), 0);
            }
         }

         return this.aN;
      }

      public static bxb.k.a a(byte $$0) {
         if (($$0 & 8) != 0) {
            return bxb.k.a.b;
         } else {
            return ($$0 & 16) != 0 ? bxb.k.a.c : bxb.k.a.a;
         }
      }

      public static enum a implements bax {
         a("center"),
         b("left"),
         c("right");

         public static final Codec<bxb.k.a> d = bax.a(bxb.k.a::values);
         private final String e;

         private a(final String $$0) {
            this.e = $$0;
         }

         @Override
         public String c() {
            return this.e;
         }
      }

      public static record b(List<bxb.k.c> a, int b) {
      }

      public static record c(azk a, int b) {
      }

      @FunctionalInterface
      public interface d {
         bxb.k.b split(xg var1, int var2);
      }

      public static record e(xg a, int b, bxb.f c, bxb.f d, byte e) {
      }
   }

   static record l(k a, k b) implements bxb.e<k> {
      public k a(float $$0) {
         return (double)$$0 >= 1.0 ? this.b : this.a.a(this.b, $$0);
      }
   }
}
