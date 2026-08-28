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

public abstract class bvp extends bvs {
   static final Logger o = LogUtils.getLogger();
   public static final int a = -1;
   private static final akg<Integer> p = akk.a(bvp.class, aki.b);
   private static final akg<Integer> q = akk.a(bvp.class, aki.b);
   private static final akg<Integer> r = akk.a(bvp.class, aki.b);
   private static final akg<Vector3f> s = akk.a(bvp.class, aki.E);
   private static final akg<Vector3f> t = akk.a(bvp.class, aki.E);
   private static final akg<Quaternionf> u = akk.a(bvp.class, aki.F);
   private static final akg<Quaternionf> ay = akk.a(bvp.class, aki.F);
   private static final akg<Byte> az = akk.a(bvp.class, aki.a);
   private static final akg<Integer> aA = akk.a(bvp.class, aki.b);
   private static final akg<Float> aB = akk.a(bvp.class, aki.d);
   private static final akg<Float> aC = akk.a(bvp.class, aki.d);
   private static final akg<Float> aD = akk.a(bvp.class, aki.d);
   private static final akg<Float> aE = akk.a(bvp.class, aki.d);
   private static final akg<Float> aF = akk.a(bvp.class, aki.d);
   private static final akg<Integer> aG = akk.a(bvp.class, aki.b);
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
   private fcp aO;
   private boolean aP = true;
   protected boolean n;
   private boolean aQ;
   private boolean aR;
   @Nullable
   private bvp.j aS;
   private final bwm aT;

   public bvp(bwb<?> $$0, dhp $$1) {
      super($$0, $$1);
      this.aT = new bwm(this, this.aM);
      this.ad = true;
      this.aO = this.cR();
   }

   @Override
   public void a(akg<?> $$0) {
      super.a($$0);
      if (aF.equals($$0) || aE.equals($$0)) {
         this.A();
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
   public final boolean a(arn $$0, buh $$1, float $$2) {
      return false;
   }

   private static j a(akk $$0) {
      Vector3f $$1 = $$0.a(s);
      Quaternionf $$2 = $$0.a(u);
      Vector3f $$3 = $$0.a(t);
      Quaternionf $$4 = $$0.a(ay);
      return new j($$1, $$2, $$3, $$4);
   }

   @Override
   public void h() {
      bvs $$0 = this.dk();
      if ($$0 != null && $$0.dQ()) {
         this.bP();
      }

      if (this.dV().C) {
         if (this.aQ) {
            this.aQ = false;
            int $$1 = this.n();
            this.aL = (long)(this.af + $$1);
         }

         if (this.aR) {
            this.aR = false;
            this.aM = this.m();
            this.aT.a(this.aM);
         }

         if (this.n) {
            this.n = false;
            boolean $$2 = this.aM != 0;
            if ($$2 && this.aS != null) {
               this.aS = this.a(this.aS, this.aN);
            } else {
               this.aS = this.B();
            }

            this.a($$2, this.aN);
         }

         this.aT.e();
      }
   }

   @Override
   public bwm N_() {
      return this.aT;
   }

   protected abstract void a(boolean var1, float var2);

   @Override
   protected void a(akk.a $$0) {
      $$0.a(r, 0);
      $$0.a(p, 0);
      $$0.a(q, 0);
      $$0.a(s, new Vector3f());
      $$0.a(t, new Vector3f(1.0F, 1.0F, 1.0F));
      $$0.a(ay, new Quaternionf());
      $$0.a(u, new Quaternionf());
      $$0.a(az, bvp.a.a.a());
      $$0.a(aA, -1);
      $$0.a(aB, 1.0F);
      $$0.a(aC, 0.0F);
      $$0.a(aD, 1.0F);
      $$0.a(aE, 0.0F);
      $$0.a(aF, 0.0F);
      $$0.a(aG, -1);
   }

   @Override
   protected void a(tw $$0) {
      if ($$0.e("transformation")) {
         j.b.decode(uk.a, $$0.c("transformation")).resultOrPartial(af.a("Display entity", o::error)).ifPresent($$0x -> this.a((j)$$0x.getFirst()));
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
         this.d(azk.a($$3, 0, 59));
      }

      if ($$0.b("billboard", 8)) {
         bvp.a.e.decode(uk.a, $$0.c("billboard")).resultOrPartial(af.a("Display entity", o::error)).ifPresent($$0x -> this.a((bvp.a)$$0x.getFirst()));
      }

      if ($$0.b("view_range", 99)) {
         this.b($$0.j("view_range"));
      }

      if ($$0.b("shadow_radius", 99)) {
         this.c($$0.j("shadow_radius"));
      }

      if ($$0.b("shadow_strength", 99)) {
         this.d($$0.j("shadow_strength"));
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
         axz.b.decode(uk.a, $$0.c("brightness")).resultOrPartial(af.a("Display entity", o::error)).ifPresent($$0x -> this.a((axz)$$0x.getFirst()));
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
   protected void b(tw $$0) {
      j.b.encodeStart(uk.a, a(this.al)).ifSuccess($$1x -> $$0.a("transformation", $$1x));
      bvp.a.e.encodeStart(uk.a, this.q()).ifSuccess($$1x -> $$0.a("billboard", $$1x));
      $$0.a("interpolation_duration", this.m());
      $$0.a("teleport_duration", this.o());
      $$0.a("view_range", this.u());
      $$0.a("shadow_radius", this.v());
      $$0.a("shadow_strength", this.w());
      $$0.a("width", this.x());
      $$0.a("height", this.z());
      $$0.a("glow_color_override", this.y());
      axz $$1 = this.s();
      if ($$1 != null) {
         axz.b.encodeStart(uk.a, $$1).ifSuccess($$1x -> $$0.a("brightness", $$1x));
      }
   }

   public fcp f() {
      return this.aO;
   }

   public boolean g() {
      return !this.aP;
   }

   @Override
   public euy j_() {
      return euy.d;
   }

   @Override
   public boolean g_() {
      return true;
   }

   @Nullable
   public bvp.j j() {
      return this.aS;
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

   private void a(bvp.a $$0) {
      this.al.a(az, $$0.a());
   }

   private bvp.a q() {
      return bvp.a.f.apply(this.al.a(az));
   }

   private void a(@Nullable axz $$0) {
      this.al.a(aA, $$0 != null ? $$0.a() : -1);
   }

   @Nullable
   private axz s() {
      int $$0 = this.al.a(aA);
      return $$0 != -1 ? axz.a($$0) : null;
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
      int $$1 = this.aM;
      if ($$1 <= 0) {
         return 1.0F;
      } else {
         float $$2 = (float)((long)this.af - this.aL);
         float $$3 = $$2 + $$0;
         float $$4 = azk.a(azk.f($$3, 0.0F, (float)$$1), 0.0F, 1.0F);
         this.aN = $$4;
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
      this.aP = $$0 == 0.0F || $$1 == 0.0F;
      float $$2 = $$0 / 2.0F;
      double $$3 = this.dA();
      double $$4 = this.dC();
      double $$5 = this.dG();
      this.aO = new fcp($$3 - (double)$$2, $$4, $$5 - (double)$$2, $$3 + (double)$$2, $$4 + (double)$$1, $$5 + (double)$$2);
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < azk.k((double)this.u() * 64.0 * cK());
   }

   @Override
   public int f_() {
      int $$0 = this.y();
      return $$0 != -1 ? $$0 : super.f_();
   }

   private bvp.j B() {
      return new bvp.j(bvp.e.constant(a(this.al)), this.q(), this.t(), bvp.d.constant(this.v()), bvp.d.constant(this.w()), this.y());
   }

   private bvp.j a(bvp.j $$0, float $$1) {
      j $$2 = $$0.a.get($$1);
      float $$3 = $$0.d.get($$1);
      float $$4 = $$0.e.get($$1);
      return new bvp.j(new bvp.l($$2, a(this.al)), this.q(), this.t(), new bvp.h($$3, this.v()), new bvp.h($$4, this.w()), this.y());
   }

   public static enum a implements bag {
      a((byte)0, "fixed"),
      b((byte)1, "vertical"),
      c((byte)2, "horizontal"),
      d((byte)3, "center");

      public static final Codec<bvp.a> e = bag.a(bvp.a::values);
      public static final IntFunction<bvp.a> f = aya.a(bvp.a::a, values(), aya.a.a);
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

   public static class b extends bvp {
      public static final String o = "block_state";
      private static final akg<dym> p = akk.a(bvp.b.class, aki.i);
      @Nullable
      private bvp.b.a q;

      public b(bwb<?> $$0, dhp $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a(akk.a $$0) {
         super.a($$0);
         $$0.a(p, dkw.a.m());
      }

      @Override
      public void a(akg<?> $$0) {
         super.a($$0);
         if ($$0.equals(p)) {
            this.n = true;
         }
      }

      private dym n() {
         return this.al.a(p);
      }

      private void c(dym $$0) {
         this.al.a(p, $$0);
      }

      @Override
      protected void a(tw $$0) {
         super.a($$0);
         this.c(ul.a(this.dV().a(me.f), $$0.p("block_state")));
      }

      @Override
      protected void b(tw $$0) {
         super.b($$0);
         $$0.a("block_state", ul.a(this.n()));
      }

      @Nullable
      public bvp.b.a m() {
         return this.q;
      }

      @Override
      protected void a(boolean $$0, float $$1) {
         this.q = new bvp.b.a(this.n());
      }

      public static record a(dym a) {
      }
   }

   static record c(int a, int b) implements bvp.f {
      @Override
      public int get(float $$0) {
         return axu.a($$0, this.a, this.b);
      }
   }

   @FunctionalInterface
   public interface d {
      static bvp.d constant(float $$0) {
         return $$1 -> $$0;
      }

      float get(float var1);
   }

   @FunctionalInterface
   public interface e<T> {
      static <T> bvp.e<T> constant(T $$0) {
         return $$1 -> $$0;
      }

      T get(float var1);
   }

   @FunctionalInterface
   public interface f {
      static bvp.f constant(int $$0) {
         return $$1 -> $$0;
      }

      int get(float var1);
   }

   public static class g extends bvp {
      private static final String o = "item";
      private static final String p = "item_display";
      private static final akg<cxy> q = akk.a(bvp.g.class, aki.h);
      private static final akg<Byte> r = akk.a(bvp.g.class, aki.a);
      private final bxi s = bxi.a(this::n, this::a);
      @Nullable
      private bvp.g.a t;

      public g(bwb<?> $$0, dhp $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a(akk.a $$0) {
         super.a($$0);
         $$0.a(q, cxy.k);
         $$0.a(r, cxw.a.a());
      }

      @Override
      public void a(akg<?> $$0) {
         super.a($$0);
         if (q.equals($$0) || r.equals($$0)) {
            this.n = true;
         }
      }

      private cxy n() {
         return this.al.a(q);
      }

      private void a(cxy $$0) {
         this.al.a(q, $$0);
      }

      private void a(cxw $$0) {
         this.al.a(r, $$0.a());
      }

      private cxw o() {
         return cxw.k.apply(this.al.a(r));
      }

      @Override
      protected void a(tw $$0) {
         super.a($$0);
         if ($$0.e("item")) {
            this.a(cxy.a(this.dX(), (ut)$$0.p("item")).orElse(cxy.k));
         } else {
            this.a(cxy.k);
         }

         if ($$0.b("item_display", 8)) {
            cxw.j.decode(uk.a, $$0.c("item_display")).resultOrPartial(af.a("Display entity", bvp.o::error)).ifPresent($$0x -> this.a((cxw)$$0x.getFirst()));
         }
      }

      @Override
      protected void b(tw $$0) {
         super.b($$0);
         if (!this.n().f()) {
            $$0.a("item", this.n().a(this.dX()));
         }

         cxw.j.encodeStart(uk.a, this.o()).ifSuccess($$1 -> $$0.a("item_display", $$1));
      }

      @Override
      public bxi a_(int $$0) {
         return $$0 == 0 ? this.s : bxi.a;
      }

      @Nullable
      public bvp.g.a m() {
         return this.t;
      }

      @Override
      protected void a(boolean $$0, float $$1) {
         cxy $$2 = this.n();
         $$2.a(this);
         this.t = new bvp.g.a($$2, this.o());
      }

      public static record a(cxy a, cxw b) {
      }
   }

   static record h(float a, float b) implements bvp.d {
      @Override
      public float get(float $$0) {
         return azk.h($$0, this.a, this.b);
      }
   }

   static record i(int a, int b) implements bvp.f {
      @Override
      public int get(float $$0) {
         return azk.a($$0, this.a, this.b);
      }
   }

   public static record j(bvp.e<j> a, bvp.a b, int c, bvp.d d, bvp.d e, int f) {
   }

   public static class k extends bvp {
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
      private static final akg<wv> aG = akk.a(bvp.k.class, aki.f);
      private static final akg<Integer> aH = akk.a(bvp.k.class, aki.b);
      private static final akg<Integer> aI = akk.a(bvp.k.class, aki.b);
      private static final akg<Byte> aJ = akk.a(bvp.k.class, aki.a);
      private static final akg<Byte> aK = akk.a(bvp.k.class, aki.a);
      private static final IntSet aL = IntSet.of(new int[]{aG.a(), aH.a(), aI.a(), aJ.a(), aK.a()});
      @Nullable
      private bvp.k.b aM;
      @Nullable
      private bvp.k.e aN;

      public k(bwb<?> $$0, dhp $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a(akk.a $$0) {
         super.a($$0);
         $$0.a(aG, wv.i());
         $$0.a(aH, 200);
         $$0.a(aI, 1073741824);
         $$0.a(aJ, (byte)-1);
         $$0.a(aK, (byte)0);
      }

      @Override
      public void a(akg<?> $$0) {
         super.a($$0);
         if (aL.contains($$0.a())) {
            this.n = true;
         }
      }

      private wv n() {
         return this.al.a(aG);
      }

      private void a(wv $$0) {
         this.al.a(aG, $$0);
      }

      private int o() {
         return this.al.a(aH);
      }

      private void b(int $$0) {
         this.al.a(aH, $$0);
      }

      private byte q() {
         return this.al.a(aJ);
      }

      private void c(byte $$0) {
         this.al.a(aJ, $$0);
      }

      private int s() {
         return this.al.a(aI);
      }

      private void c(int $$0) {
         this.al.a(aI, $$0);
      }

      private byte t() {
         return this.al.a(aK);
      }

      private void d(byte $$0) {
         this.al.a(aK, $$0);
      }

      private static byte a(byte $$0, tw $$1, String $$2, byte $$3) {
         return $$1.q($$2) ? (byte)($$0 | $$3) : $$0;
      }

      @Override
      protected void a(tw $$0) {
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
         Optional<bvp.k.a> $$2 = bvp.k.a.d.decode(uk.a, $$0.c("alignment")).resultOrPartial(af.a("Display entity", bvp.o::error)).map(Pair::getFirst);
         if ($$2.isPresent()) {
            $$1 = switch ((bvp.k.a)$$2.get()) {
               case a -> $$1;
               case b -> (byte)($$1 | 8);
               case c -> (byte)($$1 | 16);
            };
         }

         this.d($$1);
         ut $$3 = $$0.c("text");
         if ($$3 != null) {
            alb<ut> $$4 = this.dX().a(uk.a);

            try {
               wv $$5 = (wv)wx.a.parse($$4, $$3).getOrThrow();
               if ($$5 != null && this.dV() instanceof arn $$6) {
                  ex $$7 = this.d($$6).a(2);
                  wv $$8 = wy.a($$7, $$5, this, 0);
                  this.a($$8);
               } else {
                  this.a(wv.i());
               }
            } catch (Exception var10) {
               bvp.o.warn("Failed to parse display entity text {}", $$3, var10);
            }
         }
      }

      private static void b(byte $$0, tw $$1, String $$2, byte $$3) {
         $$1.a($$2, ($$0 & $$3) != 0);
      }

      @Override
      protected void b(tw $$0) {
         super.b($$0);
         alb<ut> $$1 = this.dX().a(uk.a);
         $$0.a("text", (ut)wx.a.encodeStart($$1, this.n()).getOrThrow());
         $$0.a("line_width", this.o());
         $$0.a("background", this.s());
         $$0.a("text_opacity", this.q());
         byte $$2 = this.t();
         b($$2, $$0, "shadow", (byte)1);
         b($$2, $$0, "see_through", (byte)2);
         b($$2, $$0, "default_background", (byte)4);
         bvp.k.a.d.encodeStart(uk.a, a($$2)).ifSuccess($$1x -> $$0.a("alignment", $$1x));
      }

      @Override
      protected void a(boolean $$0, float $$1) {
         if ($$0 && this.aN != null) {
            this.aN = this.a(this.aN, $$1);
         } else {
            this.aN = this.u();
         }

         this.aM = null;
      }

      @Nullable
      public bvp.k.e m() {
         return this.aN;
      }

      private bvp.k.e u() {
         return new bvp.k.e(this.n(), this.o(), bvp.f.constant(this.q()), bvp.f.constant(this.s()), this.t());
      }

      private bvp.k.e a(bvp.k.e $$0, float $$1) {
         int $$2 = $$0.d.get($$1);
         int $$3 = $$0.c.get($$1);
         return new bvp.k.e(this.n(), this.o(), new bvp.i($$3, this.q()), new bvp.c($$2, this.s()), this.t());
      }

      public bvp.k.b a(bvp.k.d $$0) {
         if (this.aM == null) {
            if (this.aN != null) {
               this.aM = $$0.split(this.aN.a(), this.aN.b());
            } else {
               this.aM = new bvp.k.b(List.of(), 0);
            }
         }

         return this.aM;
      }

      public static bvp.k.a a(byte $$0) {
         if (($$0 & 8) != 0) {
            return bvp.k.a.b;
         } else {
            return ($$0 & 16) != 0 ? bvp.k.a.c : bvp.k.a.a;
         }
      }

      public static enum a implements bag {
         a("center"),
         b("left"),
         c("right");

         public static final Codec<bvp.k.a> d = bag.a(bvp.k.a::values);
         private final String e;

         private a(final String $$0) {
            this.e = $$0;
         }

         @Override
         public String c() {
            return this.e;
         }
      }

      public static record b(List<bvp.k.c> a, int b) {
      }

      public static record c(ayw a, int b) {
      }

      @FunctionalInterface
      public interface d {
         bvp.k.b split(wv var1, int var2);
      }

      public static record e(wv a, int b, bvp.f c, bvp.f d, byte e) {
      }
   }

   static record l(j a, j b) implements bvp.e<j> {
      public j a(float $$0) {
         return (double)$$0 >= 1.0 ? this.b : this.a.a(this.b, $$0);
      }
   }
}
