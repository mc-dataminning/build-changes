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

public abstract class bux extends bva {
   static final Logger o = LogUtils.getLogger();
   public static final int a = -1;
   private static final ajx<Integer> p = akb.a(bux.class, ajz.b);
   private static final ajx<Integer> q = akb.a(bux.class, ajz.b);
   private static final ajx<Integer> r = akb.a(bux.class, ajz.b);
   private static final ajx<Vector3f> s = akb.a(bux.class, ajz.E);
   private static final ajx<Vector3f> t = akb.a(bux.class, ajz.E);
   private static final ajx<Quaternionf> u = akb.a(bux.class, ajz.F);
   private static final ajx<Quaternionf> ay = akb.a(bux.class, ajz.F);
   private static final ajx<Byte> az = akb.a(bux.class, ajz.a);
   private static final ajx<Integer> aA = akb.a(bux.class, ajz.b);
   private static final ajx<Float> aB = akb.a(bux.class, ajz.d);
   private static final ajx<Float> aC = akb.a(bux.class, ajz.d);
   private static final ajx<Float> aD = akb.a(bux.class, ajz.d);
   private static final ajx<Float> aE = akb.a(bux.class, ajz.d);
   private static final ajx<Float> aF = akb.a(bux.class, ajz.d);
   private static final ajx<Integer> aG = akb.a(bux.class, ajz.b);
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
   private fbs aO;
   private boolean aP = true;
   protected boolean n;
   private boolean aQ;
   private boolean aR;
   @Nullable
   private bux.j aS;
   private final bvt aT;

   public bux(bvi<?> $$0, dgz $$1) {
      super($$0, $$1);
      this.aT = new bvt(this, this.aM);
      this.ad = true;
      this.aO = this.cQ();
   }

   @Override
   public void a(ajx<?> $$0) {
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
   public final boolean a(ard $$0, btp $$1, float $$2) {
      return false;
   }

   private static j a(akb $$0) {
      Vector3f $$1 = $$0.a(s);
      Quaternionf $$2 = $$0.a(u);
      Vector3f $$3 = $$0.a(t);
      Quaternionf $$4 = $$0.a(ay);
      return new j($$1, $$2, $$3, $$4);
   }

   @Override
   public void h() {
      bva $$0 = this.dj();
      if ($$0 != null && $$0.dP()) {
         this.bO();
      }

      if (this.dU().C) {
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
   public bvt N_() {
      return this.aT;
   }

   protected abstract void a(boolean var1, float var2);

   @Override
   protected void a(akb.a $$0) {
      $$0.a(r, 0);
      $$0.a(p, 0);
      $$0.a(q, 0);
      $$0.a(s, new Vector3f());
      $$0.a(t, new Vector3f(1.0F, 1.0F, 1.0F));
      $$0.a(ay, new Quaternionf());
      $$0.a(u, new Quaternionf());
      $$0.a(az, bux.a.a.a());
      $$0.a(aA, -1);
      $$0.a(aB, 1.0F);
      $$0.a(aC, 0.0F);
      $$0.a(aD, 1.0F);
      $$0.a(aE, 0.0F);
      $$0.a(aF, 0.0F);
      $$0.a(aG, -1);
   }

   @Override
   protected void a(tq $$0) {
      if ($$0.e("transformation")) {
         j.b.decode(ue.a, $$0.c("transformation")).resultOrPartial(af.a("Display entity", o::error)).ifPresent($$0x -> this.a((j)$$0x.getFirst()));
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
         this.d(ayz.a($$3, 0, 59));
      }

      if ($$0.b("billboard", 8)) {
         bux.a.e.decode(ue.a, $$0.c("billboard")).resultOrPartial(af.a("Display entity", o::error)).ifPresent($$0x -> this.a((bux.a)$$0x.getFirst()));
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
         axp.b.decode(ue.a, $$0.c("brightness")).resultOrPartial(af.a("Display entity", o::error)).ifPresent($$0x -> this.a((axp)$$0x.getFirst()));
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
   protected void b(tq $$0) {
      j.b.encodeStart(ue.a, a(this.al)).ifSuccess($$1x -> $$0.a("transformation", $$1x));
      bux.a.e.encodeStart(ue.a, this.q()).ifSuccess($$1x -> $$0.a("billboard", $$1x));
      $$0.a("interpolation_duration", this.m());
      $$0.a("teleport_duration", this.o());
      $$0.a("view_range", this.u());
      $$0.a("shadow_radius", this.v());
      $$0.a("shadow_strength", this.w());
      $$0.a("width", this.x());
      $$0.a("height", this.z());
      $$0.a("glow_color_override", this.y());
      axp $$1 = this.s();
      if ($$1 != null) {
         axp.b.encodeStart(ue.a, $$1).ifSuccess($$1x -> $$0.a("brightness", $$1x));
      }
   }

   public fbs f() {
      return this.aO;
   }

   public boolean g() {
      return !this.aP;
   }

   @Override
   public eub j_() {
      return eub.d;
   }

   @Override
   public boolean g_() {
      return true;
   }

   @Nullable
   public bux.j j() {
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

   private void a(bux.a $$0) {
      this.al.a(az, $$0.a());
   }

   private bux.a q() {
      return bux.a.f.apply(this.al.a(az));
   }

   private void a(@Nullable axp $$0) {
      this.al.a(aA, $$0 != null ? $$0.a() : -1);
   }

   @Nullable
   private axp s() {
      int $$0 = this.al.a(aA);
      return $$0 != -1 ? axp.a($$0) : null;
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
         float $$4 = ayz.a(ayz.f($$3, 0.0F, (float)$$1), 0.0F, 1.0F);
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
      double $$3 = this.dz();
      double $$4 = this.dB();
      double $$5 = this.dF();
      this.aO = new fbs($$3 - (double)$$2, $$4, $$5 - (double)$$2, $$3 + (double)$$2, $$4 + (double)$$1, $$5 + (double)$$2);
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < ayz.k((double)this.u() * 64.0 * cJ());
   }

   @Override
   public int f_() {
      int $$0 = this.y();
      return $$0 != -1 ? $$0 : super.f_();
   }

   private bux.j B() {
      return new bux.j(bux.e.constant(a(this.al)), this.q(), this.t(), bux.d.constant(this.v()), bux.d.constant(this.w()), this.y());
   }

   private bux.j a(bux.j $$0, float $$1) {
      j $$2 = $$0.a.get($$1);
      float $$3 = $$0.d.get($$1);
      float $$4 = $$0.e.get($$1);
      return new bux.j(new bux.l($$2, a(this.al)), this.q(), this.t(), new bux.h($$3, this.v()), new bux.h($$4, this.w()), this.y());
   }

   public static enum a implements azv {
      a((byte)0, "fixed"),
      b((byte)1, "vertical"),
      c((byte)2, "horizontal"),
      d((byte)3, "center");

      public static final Codec<bux.a> e = azv.a(bux.a::values);
      public static final IntFunction<bux.a> f = axq.a(bux.a::a, values(), axq.a.a);
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

   public static class b extends bux {
      public static final String o = "block_state";
      private static final ajx<dxq> p = akb.a(bux.b.class, ajz.i);
      @Nullable
      private bux.b.a q;

      public b(bvi<?> $$0, dgz $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a(akb.a $$0) {
         super.a($$0);
         $$0.a(p, dkg.a.m());
      }

      @Override
      public void a(ajx<?> $$0) {
         super.a($$0);
         if ($$0.equals(p)) {
            this.n = true;
         }
      }

      private dxq n() {
         return this.al.a(p);
      }

      private void c(dxq $$0) {
         this.al.a(p, $$0);
      }

      @Override
      protected void a(tq $$0) {
         super.a($$0);
         this.c(uf.a(this.dU().a(mc.f), $$0.p("block_state")));
      }

      @Override
      protected void b(tq $$0) {
         super.b($$0);
         $$0.a("block_state", uf.a(this.n()));
      }

      @Nullable
      public bux.b.a m() {
         return this.q;
      }

      @Override
      protected void a(boolean $$0, float $$1) {
         this.q = new bux.b.a(this.n());
      }

      public static record a(dxq a) {
      }
   }

   static record c(int a, int b) implements bux.f {
      @Override
      public int get(float $$0) {
         return axk.a($$0, this.a, this.b);
      }
   }

   @FunctionalInterface
   public interface d {
      static bux.d constant(float $$0) {
         return $$1 -> $$0;
      }

      float get(float var1);
   }

   @FunctionalInterface
   public interface e<T> {
      static <T> bux.e<T> constant(T $$0) {
         return $$1 -> $$0;
      }

      T get(float var1);
   }

   @FunctionalInterface
   public interface f {
      static bux.f constant(int $$0) {
         return $$1 -> $$0;
      }

      int get(float var1);
   }

   public static class g extends bux {
      private static final String o = "item";
      private static final String p = "item_display";
      private static final ajx<cxh> q = akb.a(bux.g.class, ajz.h);
      private static final ajx<Byte> r = akb.a(bux.g.class, ajz.a);
      private final bwq s = bwq.a(this::n, this::a);
      @Nullable
      private bux.g.a t;

      public g(bvi<?> $$0, dgz $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a(akb.a $$0) {
         super.a($$0);
         $$0.a(q, cxh.k);
         $$0.a(r, cxf.a.a());
      }

      @Override
      public void a(ajx<?> $$0) {
         super.a($$0);
         if (q.equals($$0) || r.equals($$0)) {
            this.n = true;
         }
      }

      private cxh n() {
         return this.al.a(q);
      }

      private void a(cxh $$0) {
         this.al.a(q, $$0);
      }

      private void a(cxf $$0) {
         this.al.a(r, $$0.a());
      }

      private cxf o() {
         return cxf.k.apply(this.al.a(r));
      }

      @Override
      protected void a(tq $$0) {
         super.a($$0);
         if ($$0.e("item")) {
            this.a(cxh.a(this.dW(), (un)$$0.p("item")).orElse(cxh.k));
         } else {
            this.a(cxh.k);
         }

         if ($$0.b("item_display", 8)) {
            cxf.j.decode(ue.a, $$0.c("item_display")).resultOrPartial(af.a("Display entity", bux.o::error)).ifPresent($$0x -> this.a((cxf)$$0x.getFirst()));
         }
      }

      @Override
      protected void b(tq $$0) {
         super.b($$0);
         if (!this.n().f()) {
            $$0.a("item", this.n().a(this.dW()));
         }

         cxf.j.encodeStart(ue.a, this.o()).ifSuccess($$1 -> $$0.a("item_display", $$1));
      }

      @Override
      public bwq a_(int $$0) {
         return $$0 == 0 ? this.s : bwq.a;
      }

      @Nullable
      public bux.g.a m() {
         return this.t;
      }

      @Override
      protected void a(boolean $$0, float $$1) {
         cxh $$2 = this.n();
         $$2.a(this);
         this.t = new bux.g.a($$2, this.o());
      }

      public static record a(cxh a, cxf b) {
      }
   }

   static record h(float a, float b) implements bux.d {
      @Override
      public float get(float $$0) {
         return ayz.h($$0, this.a, this.b);
      }
   }

   static record i(int a, int b) implements bux.f {
      @Override
      public int get(float $$0) {
         return ayz.a($$0, this.a, this.b);
      }
   }

   public static record j(bux.e<j> a, bux.a b, int c, bux.d d, bux.d e, int f) {
   }

   public static class k extends bux {
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
      private static final ajx<wp> aG = akb.a(bux.k.class, ajz.f);
      private static final ajx<Integer> aH = akb.a(bux.k.class, ajz.b);
      private static final ajx<Integer> aI = akb.a(bux.k.class, ajz.b);
      private static final ajx<Byte> aJ = akb.a(bux.k.class, ajz.a);
      private static final ajx<Byte> aK = akb.a(bux.k.class, ajz.a);
      private static final IntSet aL = IntSet.of(new int[]{aG.a(), aH.a(), aI.a(), aJ.a(), aK.a()});
      @Nullable
      private bux.k.b aM;
      @Nullable
      private bux.k.e aN;

      public k(bvi<?> $$0, dgz $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a(akb.a $$0) {
         super.a($$0);
         $$0.a(aG, wp.i());
         $$0.a(aH, 200);
         $$0.a(aI, 1073741824);
         $$0.a(aJ, (byte)-1);
         $$0.a(aK, (byte)0);
      }

      @Override
      public void a(ajx<?> $$0) {
         super.a($$0);
         if (aL.contains($$0.a())) {
            this.n = true;
         }
      }

      private wp n() {
         return this.al.a(aG);
      }

      private void a(wp $$0) {
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

      private static byte a(byte $$0, tq $$1, String $$2, byte $$3) {
         return $$1.q($$2) ? (byte)($$0 | $$3) : $$0;
      }

      @Override
      protected void a(tq $$0) {
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
         Optional<bux.k.a> $$2 = bux.k.a.d.decode(ue.a, $$0.c("alignment")).resultOrPartial(af.a("Display entity", bux.o::error)).map(Pair::getFirst);
         if ($$2.isPresent()) {
            $$1 = switch ((bux.k.a)$$2.get()) {
               case a -> $$1;
               case b -> (byte)($$1 | 8);
               case c -> (byte)($$1 | 16);
            };
         }

         this.d($$1);
         un $$3 = $$0.c("text");
         if ($$3 != null) {
            aks<un> $$4 = this.dW().a(ue.a);

            try {
               wp $$5 = (wp)wr.a.parse($$4, $$3).getOrThrow();
               if ($$5 != null && this.dU() instanceof ard $$6) {
                  ex $$7 = this.d($$6).a(2);
                  wp $$8 = ws.a($$7, $$5, this, 0);
                  this.a($$8);
               } else {
                  this.a(wp.i());
               }
            } catch (Exception var10) {
               bux.o.warn("Failed to parse display entity text {}", $$3, var10);
            }
         }
      }

      private static void b(byte $$0, tq $$1, String $$2, byte $$3) {
         $$1.a($$2, ($$0 & $$3) != 0);
      }

      @Override
      protected void b(tq $$0) {
         super.b($$0);
         aks<un> $$1 = this.dW().a(ue.a);
         $$0.a("text", (un)wr.a.encodeStart($$1, this.n()).getOrThrow());
         $$0.a("line_width", this.o());
         $$0.a("background", this.s());
         $$0.a("text_opacity", this.q());
         byte $$2 = this.t();
         b($$2, $$0, "shadow", (byte)1);
         b($$2, $$0, "see_through", (byte)2);
         b($$2, $$0, "default_background", (byte)4);
         bux.k.a.d.encodeStart(ue.a, a($$2)).ifSuccess($$1x -> $$0.a("alignment", $$1x));
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
      public bux.k.e m() {
         return this.aN;
      }

      private bux.k.e u() {
         return new bux.k.e(this.n(), this.o(), bux.f.constant(this.q()), bux.f.constant(this.s()), this.t());
      }

      private bux.k.e a(bux.k.e $$0, float $$1) {
         int $$2 = $$0.d.get($$1);
         int $$3 = $$0.c.get($$1);
         return new bux.k.e(this.n(), this.o(), new bux.i($$3, this.q()), new bux.c($$2, this.s()), this.t());
      }

      public bux.k.b a(bux.k.d $$0) {
         if (this.aM == null) {
            if (this.aN != null) {
               this.aM = $$0.split(this.aN.a(), this.aN.b());
            } else {
               this.aM = new bux.k.b(List.of(), 0);
            }
         }

         return this.aM;
      }

      public static bux.k.a a(byte $$0) {
         if (($$0 & 8) != 0) {
            return bux.k.a.b;
         } else {
            return ($$0 & 16) != 0 ? bux.k.a.c : bux.k.a.a;
         }
      }

      public static enum a implements azv {
         a("center"),
         b("left"),
         c("right");

         public static final Codec<bux.k.a> d = azv.a(bux.k.a::values);
         private final String e;

         private a(final String $$0) {
            this.e = $$0;
         }

         @Override
         public String c() {
            return this.e;
         }
      }

      public static record b(List<bux.k.c> a, int b) {
      }

      public static record c(ayl a, int b) {
      }

      @FunctionalInterface
      public interface d {
         bux.k.b split(wp var1, int var2);
      }

      public static record e(wp a, int b, bux.f c, bux.f d, byte e) {
      }
   }

   static record l(j a, j b) implements bux.e<j> {
      public j a(float $$0) {
         return (double)$$0 >= 1.0 ? this.b : this.a.a(this.b, $$0);
      }
   }
}
