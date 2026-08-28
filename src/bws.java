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

public abstract class bws extends bwv {
   static final Logger o = LogUtils.getLogger();
   public static final int a = -1;
   private static final akn<Integer> p = akr.a(bws.class, akp.b);
   private static final akn<Integer> q = akr.a(bws.class, akp.b);
   private static final akn<Integer> r = akr.a(bws.class, akp.b);
   private static final akn<Vector3f> s = akr.a(bws.class, akp.H);
   private static final akn<Vector3f> t = akr.a(bws.class, akp.H);
   private static final akn<Quaternionf> u = akr.a(bws.class, akp.I);
   private static final akn<Quaternionf> ay = akr.a(bws.class, akp.I);
   private static final akn<Byte> az = akr.a(bws.class, akp.a);
   private static final akn<Integer> aA = akr.a(bws.class, akp.b);
   private static final akn<Float> aB = akr.a(bws.class, akp.d);
   private static final akn<Float> aC = akr.a(bws.class, akp.d);
   private static final akn<Float> aD = akr.a(bws.class, akp.d);
   private static final akn<Float> aE = akr.a(bws.class, akp.d);
   private static final akn<Float> aF = akr.a(bws.class, akp.d);
   private static final akn<Integer> aG = akr.a(bws.class, akp.b);
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
   private ffn aU;
   private boolean aV = true;
   protected boolean n;
   private boolean aW;
   private boolean aX;
   @Nullable
   private bws.j aY;
   private final bxr aZ = new bxr(this, 0);

   public bws(bxe<?> $$0, djz $$1) {
      super($$0, $$1);
      this.ad = true;
      this.aU = this.cR();
   }

   @Override
   public void a(akn<?> $$0) {
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
   public final boolean a(aru $$0, bvk $$1, float $$2) {
      return false;
   }

   private static k a(akr $$0) {
      Vector3f $$1 = $$0.a(s);
      Quaternionf $$2 = $$0.a(u);
      Vector3f $$3 = $$0.a(t);
      Quaternionf $$4 = $$0.a(ay);
      return new k($$1, $$2, $$3, $$4);
   }

   @Override
   public void h() {
      bwv $$0 = this.dk();
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
   public bxr R_() {
      return this.aZ;
   }

   protected abstract void a(boolean var1, float var2);

   @Override
   protected void a(akr.a $$0) {
      $$0.a(r, 0);
      $$0.a(p, 0);
      $$0.a(q, 0);
      $$0.a(s, new Vector3f());
      $$0.a(t, new Vector3f(1.0F, 1.0F, 1.0F));
      $$0.a(ay, new Quaternionf());
      $$0.a(u, new Quaternionf());
      $$0.a(az, bws.a.a.a());
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
      this.d(azq.a($$1, 0, 59));
      this.a($$0.<bws.a>a("billboard", bws.a.e).orElse(bws.a.a));
      this.b($$0.b("view_range", 1.0F));
      this.c($$0.b("shadow_radius", 0.0F));
      this.d($$0.b("shadow_strength", 1.0F));
      this.y($$0.b("width", 0.0F));
      this.z($$0.b("height", 0.0F));
      this.l($$0.b("glow_color_override", -1));
      this.a($$0.<ayf>a("brightness", ayf.b).orElse(null));
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
      $$0.a("billboard", bws.a.e, this.q());
      $$0.a("interpolation_duration", this.m());
      $$0.a("teleport_duration", this.o());
      $$0.a("view_range", this.u());
      $$0.a("shadow_radius", this.v());
      $$0.a("shadow_strength", this.w());
      $$0.a("width", this.x());
      $$0.a("height", this.z());
      $$0.a("glow_color_override", this.y());
      $$0.b("brightness", ayf.b, this.s());
   }

   public ffn f() {
      return this.aU;
   }

   public boolean g() {
      return !this.aV;
   }

   @Override
   public exv j_() {
      return exv.d;
   }

   @Override
   public boolean g_() {
      return true;
   }

   @Nullable
   public bws.j j() {
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

   private void a(bws.a $$0) {
      this.al.a(az, $$0.a());
   }

   private bws.a q() {
      return bws.a.f.apply(this.al.a(az));
   }

   private void a(@Nullable ayf $$0) {
      this.al.a(aA, $$0 != null ? $$0.a() : -1);
   }

   @Nullable
   private ayf s() {
      int $$0 = this.al.a(aA);
      return $$0 != -1 ? ayf.a($$0) : null;
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
         float $$4 = azq.a(azq.f($$3, 0.0F, (float)$$1), 0.0F, 1.0F);
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
      this.aU = new ffn($$3 - (double)$$2, $$4, $$5 - (double)$$2, $$3 + (double)$$2, $$4 + (double)$$1, $$5 + (double)$$2);
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < azq.k((double)this.u() * 64.0 * cK());
   }

   @Override
   public int f_() {
      int $$0 = this.y();
      return $$0 != -1 ? $$0 : super.f_();
   }

   private bws.j B() {
      return new bws.j(bws.e.constant(a(this.al)), this.q(), this.t(), bws.d.constant(this.v()), bws.d.constant(this.w()), this.y());
   }

   private bws.j a(bws.j $$0, float $$1) {
      k $$2 = $$0.a.get($$1);
      float $$3 = $$0.d.get($$1);
      float $$4 = $$0.e.get($$1);
      return new bws.j(new bws.l($$2, a(this.al)), this.q(), this.t(), new bws.h($$3, this.v()), new bws.h($$4, this.w()), this.y());
   }

   public static enum a implements bao {
      a((byte)0, "fixed"),
      b((byte)1, "vertical"),
      c((byte)2, "horizontal"),
      d((byte)3, "center");

      public static final Codec<bws.a> e = bao.a(bws.a::values);
      public static final IntFunction<bws.a> f = ayg.a(bws.a::a, values(), ayg.a.a);
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

   public static class b extends bws {
      public static final String o = "block_state";
      private static final akn<ebg> p = akr.a(bws.b.class, akp.i);
      @Nullable
      private bws.b.a q;

      public b(bxe<?> $$0, djz $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a(akr.a $$0) {
         super.a($$0);
         $$0.a(p, dng.a.m());
      }

      @Override
      public void a(akn<?> $$0) {
         super.a($$0);
         if ($$0.equals(p)) {
            this.n = true;
         }
      }

      private ebg n() {
         return this.al.a(p);
      }

      private void c(ebg $$0) {
         this.al.a(p, $$0);
      }

      @Override
      protected void a(ua $$0) {
         super.a($$0);
         ali<va> $$1 = this.dX().a(uo.a);
         this.c($$0.<ebg>a("block_state", ebg.a, $$1).orElse(dng.a.m()));
      }

      @Override
      protected void b(ua $$0) {
         super.b($$0);
         ali<va> $$1 = this.dX().a(uo.a);
         $$0.a("block_state", ebg.a, $$1, this.n());
      }

      @Nullable
      public bws.b.a m() {
         return this.q;
      }

      @Override
      protected void a(boolean $$0, float $$1) {
         this.q = new bws.b.a(this.n());
      }

      public static record a(ebg a) {
      }
   }

   static record c(int a, int b) implements bws.f {
      @Override
      public int get(float $$0) {
         return aya.a($$0, this.a, this.b);
      }
   }

   @FunctionalInterface
   public interface d {
      static bws.d constant(float $$0) {
         return $$1 -> $$0;
      }

      float get(float var1);
   }

   @FunctionalInterface
   public interface e<T> {
      static <T> bws.e<T> constant(T $$0) {
         return $$1 -> $$0;
      }

      T get(float var1);
   }

   @FunctionalInterface
   public interface f {
      static bws.f constant(int $$0) {
         return $$1 -> $$0;
      }

      int get(float var1);
   }

   public static class g extends bws {
      private static final String o = "item";
      private static final String p = "item_display";
      private static final akn<daa> q = akr.a(bws.g.class, akp.h);
      private static final akn<Byte> r = akr.a(bws.g.class, akp.a);
      private final byn s = byn.a(this::n, this::a);
      @Nullable
      private bws.g.a t;

      public g(bxe<?> $$0, djz $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a(akr.a $$0) {
         super.a($$0);
         $$0.a(q, daa.k);
         $$0.a(r, czy.a.a());
      }

      @Override
      public void a(akn<?> $$0) {
         super.a($$0);
         if (q.equals($$0) || r.equals($$0)) {
            this.n = true;
         }
      }

      private daa n() {
         return this.al.a(q);
      }

      private void a(daa $$0) {
         this.al.a(q, $$0);
      }

      private void a(czy $$0) {
         this.al.a(r, $$0.a());
      }

      private czy o() {
         return czy.k.apply(this.al.a(r));
      }

      @Override
      protected void a(ua $$0) {
         super.a($$0);
         ali<va> $$1 = this.dX().a(uo.a);
         this.a($$0.<daa>a("item", daa.b, $$1).orElse(daa.k));
         this.a($$0.<czy>a("item_display", czy.j).orElse(czy.a));
      }

      @Override
      protected void b(ua $$0) {
         super.b($$0);
         if (!this.n().f()) {
            $$0.a("item", daa.b, this.dX().a(uo.a), this.n());
         }

         $$0.a("item_display", czy.j, this.o());
      }

      @Override
      public byn a_(int $$0) {
         return $$0 == 0 ? this.s : byn.a;
      }

      @Nullable
      public bws.g.a m() {
         return this.t;
      }

      @Override
      protected void a(boolean $$0, float $$1) {
         daa $$2 = this.n();
         $$2.a(this);
         this.t = new bws.g.a($$2, this.o());
      }

      public static record a(daa a, czy b) {
      }
   }

   static record h(float a, float b) implements bws.d {
      @Override
      public float get(float $$0) {
         return azq.h($$0, this.a, this.b);
      }
   }

   static record i(int a, int b) implements bws.f {
      @Override
      public int get(float $$0) {
         return azq.a($$0, this.a, this.b);
      }
   }

   public static record j(bws.e<k> a, bws.a b, int c, bws.d d, bws.d e, int f) {
   }

   public static class k extends bws {
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
      private static final akn<xc> aH = akr.a(bws.k.class, akp.f);
      private static final akn<Integer> aI = akr.a(bws.k.class, akp.b);
      private static final akn<Integer> aJ = akr.a(bws.k.class, akp.b);
      private static final akn<Byte> aK = akr.a(bws.k.class, akp.a);
      private static final akn<Byte> aL = akr.a(bws.k.class, akp.a);
      private static final IntSet aM = IntSet.of(new int[]{aH.a(), aI.a(), aJ.a(), aK.a(), aL.a()});
      @Nullable
      private bws.k.b aN;
      @Nullable
      private bws.k.e aO;

      public k(bxe<?> $$0, djz $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a(akr.a $$0) {
         super.a($$0);
         $$0.a(aH, xc.i());
         $$0.a(aI, 200);
         $$0.a(aJ, 1073741824);
         $$0.a(aK, (byte)-1);
         $$0.a(aL, (byte)0);
      }

      @Override
      public void a(akn<?> $$0) {
         super.a($$0);
         if (aM.contains($$0.a())) {
            this.n = true;
         }
      }

      private xc n() {
         return this.al.a(aH);
      }

      private void a(xc $$0) {
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
         Optional<bws.k.a> $$2 = $$0.a("alignment", bws.k.a.d);
         if ($$2.isPresent()) {
            $$1 = switch ((bws.k.a)$$2.get()) {
               case a -> $$1;
               case b -> (byte)($$1 | 8);
               case c -> (byte)($$1 | 16);
            };
         }

         this.d($$1);
         va $$3 = $$0.a("text");
         if ($$3 != null) {
            ali<va> $$4 = this.dX().a(uo.a);

            try {
               xc $$5 = (xc)xe.a.parse($$4, $$3).getOrThrow();
               if ($$5 != null && this.dV() instanceof aru $$6) {
                  ek $$7 = this.d($$6).a(2);
                  xc $$8 = xf.a($$7, $$5, this, 0);
                  this.a($$8);
               } else {
                  this.a(xc.i());
               }
            } catch (Exception var10) {
               bws.o.warn("Failed to parse display entity text {}", $$3, var10);
            }
         }
      }

      private static void b(byte $$0, ua $$1, String $$2, byte $$3) {
         $$1.a($$2, ($$0 & $$3) != 0);
      }

      @Override
      protected void b(ua $$0) {
         super.b($$0);
         ali<va> $$1 = this.dX().a(uo.a);
         $$0.a("text", xe.a, $$1, this.n());
         $$0.a("line_width", this.o());
         $$0.a("background", this.s());
         $$0.a("text_opacity", this.q());
         byte $$2 = this.t();
         b($$2, $$0, "shadow", (byte)1);
         b($$2, $$0, "see_through", (byte)2);
         b($$2, $$0, "default_background", (byte)4);
         $$0.a("alignment", bws.k.a.d, a($$2));
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
      public bws.k.e m() {
         return this.aO;
      }

      private bws.k.e u() {
         return new bws.k.e(this.n(), this.o(), bws.f.constant(this.q()), bws.f.constant(this.s()), this.t());
      }

      private bws.k.e a(bws.k.e $$0, float $$1) {
         int $$2 = $$0.d.get($$1);
         int $$3 = $$0.c.get($$1);
         return new bws.k.e(this.n(), this.o(), new bws.i($$3, this.q()), new bws.c($$2, this.s()), this.t());
      }

      public bws.k.b a(bws.k.d $$0) {
         if (this.aN == null) {
            if (this.aO != null) {
               this.aN = $$0.split(this.aO.a(), this.aO.b());
            } else {
               this.aN = new bws.k.b(List.of(), 0);
            }
         }

         return this.aN;
      }

      public static bws.k.a a(byte $$0) {
         if (($$0 & 8) != 0) {
            return bws.k.a.b;
         } else {
            return ($$0 & 16) != 0 ? bws.k.a.c : bws.k.a.a;
         }
      }

      public static enum a implements bao {
         a("center"),
         b("left"),
         c("right");

         public static final Codec<bws.k.a> d = bao.a(bws.k.a::values);
         private final String e;

         private a(final String $$0) {
            this.e = $$0;
         }

         @Override
         public String c() {
            return this.e;
         }
      }

      public static record b(List<bws.k.c> a, int b) {
      }

      public static record c(azc a, int b) {
      }

      @FunctionalInterface
      public interface d {
         bws.k.b split(xc var1, int var2);
      }

      public static record e(xc a, int b, bws.f c, bws.f d, byte e) {
      }
   }

   static record l(k a, k b) implements bws.e<k> {
      public k a(float $$0) {
         return (double)$$0 >= 1.0 ? this.b : this.a.a(this.b, $$0);
      }
   }
}
