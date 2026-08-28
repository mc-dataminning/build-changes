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

public abstract class bui extends buk {
   static final Logger o = LogUtils.getLogger();
   public static final int a = -1;
   private static final ajy<Integer> p = akc.a(bui.class, aka.b);
   private static final ajy<Integer> q = akc.a(bui.class, aka.b);
   private static final ajy<Integer> r = akc.a(bui.class, aka.b);
   private static final ajy<Vector3f> s = akc.a(bui.class, aka.D);
   private static final ajy<Vector3f> t = akc.a(bui.class, aka.D);
   private static final ajy<Quaternionf> u = akc.a(bui.class, aka.E);
   private static final ajy<Quaternionf> ay = akc.a(bui.class, aka.E);
   private static final ajy<Byte> az = akc.a(bui.class, aka.a);
   private static final ajy<Integer> aA = akc.a(bui.class, aka.b);
   private static final ajy<Float> aB = akc.a(bui.class, aka.d);
   private static final ajy<Float> aC = akc.a(bui.class, aka.d);
   private static final ajy<Float> aD = akc.a(bui.class, aka.d);
   private static final ajy<Float> aE = akc.a(bui.class, aka.d);
   private static final ajy<Float> aF = akc.a(bui.class, aka.d);
   private static final ajy<Integer> aG = akc.a(bui.class, aka.b);
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
   private fau aO;
   private boolean aP = true;
   protected boolean n;
   private boolean aQ;
   private boolean aR;
   @Nullable
   private bui.k aS;
   @Nullable
   private bui.j aT;

   public bui(bur<?> $$0, dgh $$1) {
      super($$0, $$1);
      this.ad = true;
      this.aO = this.cR();
   }

   @Override
   public void a(ajy<?> $$0) {
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
   public final boolean a(ard $$0, bta $$1, float $$2) {
      return false;
   }

   private static j a(akc $$0) {
      Vector3f $$1 = $$0.a(s);
      Quaternionf $$2 = $$0.a(u);
      Vector3f $$3 = $$0.a(t);
      Quaternionf $$4 = $$0.a(ay);
      return new j($$1, $$2, $$3, $$4);
   }

   @Override
   public void h() {
      buk $$0 = this.dk();
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
   protected void a(akc.a $$0) {
      $$0.a(r, 0);
      $$0.a(p, 0);
      $$0.a(q, 0);
      $$0.a(s, new Vector3f());
      $$0.a(t, new Vector3f(1.0F, 1.0F, 1.0F));
      $$0.a(ay, new Quaternionf());
      $$0.a(u, new Quaternionf());
      $$0.a(az, bui.a.a.a());
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
         bui.a.e.decode(ue.a, $$0.c("billboard")).resultOrPartial(af.a("Display entity", o::error)).ifPresent($$0x -> this.a((bui.a)$$0x.getFirst()));
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
      bui.a.e.encodeStart(ue.a, this.v()).ifSuccess($$1x -> $$0.a("billboard", $$1x));
      $$0.a("interpolation_duration", this.s());
      $$0.a("teleport_duration", this.u());
      $$0.a("view_range", this.y());
      $$0.a("shadow_radius", this.z());
      $$0.a("shadow_strength", this.A());
      $$0.a("width", this.B());
      $$0.a("height", this.D());
      $$0.a("glow_color_override", this.C());
      axp $$1 = this.w();
      if ($$1 != null) {
         axp.b.encodeStart(ue.a, $$1).ifSuccess($$1x -> $$0.a("brightness", $$1x));
      }
   }

   @Override
   public void f_() {
      this.aT = null;
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      int $$6 = this.u();
      this.aT = new bui.j($$6, $$0, $$1, $$2, (double)$$3, (double)$$4);
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

   public fau l() {
      return this.aO;
   }

   public boolean m() {
      return !this.aP;
   }

   @Override
   public etd n_() {
      return etd.d;
   }

   @Override
   public boolean s_() {
      return true;
   }

   @Nullable
   public bui.k p() {
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

   private void a(bui.a $$0) {
      this.al.a(az, $$0.a());
   }

   private bui.a v() {
      return bui.a.f.apply(this.al.a(az));
   }

   private void a(@Nullable axp $$0) {
      this.al.a(aA, $$0 != null ? $$0.a() : -1);
   }

   @Nullable
   private axp w() {
      int $$0 = this.al.a(aA);
      return $$0 != -1 ? axp.a($$0) : null;
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
         float $$4 = ayz.a(ayz.f($$3, 0.0F, (float)$$1), 0.0F, 1.0F);
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
      this.aO = new fau($$3 - (double)$$2, $$4, $$5 - (double)$$2, $$3 + (double)$$2, $$4 + (double)$$1, $$5 + (double)$$2);
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < ayz.k((double)this.y() * 64.0 * cK());
   }

   @Override
   public int k_() {
      int $$0 = this.C();
      return $$0 != -1 ? $$0 : super.k_();
   }

   private bui.k F() {
      return new bui.k(bui.e.constant(a(this.al)), this.v(), this.x(), bui.d.constant(this.z()), bui.d.constant(this.A()), this.C());
   }

   private bui.k a(bui.k $$0, float $$1) {
      j $$2 = $$0.a.get($$1);
      float $$3 = $$0.d.get($$1);
      float $$4 = $$0.e.get($$1);
      return new bui.k(new bui.m($$2, a(this.al)), this.v(), this.x(), new bui.h($$3, this.z()), new bui.h($$4, this.A()), this.C());
   }

   public static enum a implements azv {
      a((byte)0, "fixed"),
      b((byte)1, "vertical"),
      c((byte)2, "horizontal"),
      d((byte)3, "center");

      public static final Codec<bui.a> e = azv.a(bui.a::values);
      public static final IntFunction<bui.a> f = axq.a(bui.a::a, values(), axq.a.a);
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

   public static class b extends bui {
      public static final String o = "block_state";
      private static final ajy<dww> p = akc.a(bui.b.class, aka.i);
      @Nullable
      private bui.b.a q;

      public b(bur<?> $$0, dgh $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a(akc.a $$0) {
         super.a($$0);
         $$0.a(p, djn.a.m());
      }

      @Override
      public void a(ajy<?> $$0) {
         super.a($$0);
         if ($$0.equals(p)) {
            this.n = true;
         }
      }

      private dww t() {
         return this.al.a(p);
      }

      private void c(dww $$0) {
         this.al.a(p, $$0);
      }

      @Override
      protected void a(tq $$0) {
         super.a($$0);
         this.c(uf.a(this.dV().a(mc.f), $$0.p("block_state")));
      }

      @Override
      protected void b(tq $$0) {
         super.b($$0);
         $$0.a("block_state", uf.a(this.t()));
      }

      @Nullable
      public bui.b.a s() {
         return this.q;
      }

      @Override
      protected void a(boolean $$0, float $$1) {
         this.q = new bui.b.a(this.t());
      }

      public static record a(dww a) {
      }
   }

   static record c(int a, int b) implements bui.f {
      @Override
      public int get(float $$0) {
         return axk.a($$0, this.a, this.b);
      }
   }

   @FunctionalInterface
   public interface d {
      static bui.d constant(float $$0) {
         return $$1 -> $$0;
      }

      float get(float var1);
   }

   @FunctionalInterface
   public interface e<T> {
      static <T> bui.e<T> constant(T $$0) {
         return $$1 -> $$0;
      }

      T get(float var1);
   }

   @FunctionalInterface
   public interface f {
      static bui.f constant(int $$0) {
         return $$1 -> $$0;
      }

      int get(float var1);
   }

   public static class g extends bui {
      private static final String o = "item";
      private static final String p = "item_display";
      private static final ajy<cwo> q = akc.a(bui.g.class, aka.h);
      private static final ajy<Byte> r = akc.a(bui.g.class, aka.a);
      private final bvy s = bvy.a(this::t, this::a);
      @Nullable
      private bui.g.a t;

      public g(bur<?> $$0, dgh $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a(akc.a $$0) {
         super.a($$0);
         $$0.a(q, cwo.j);
         $$0.a(r, cwm.a.a());
      }

      @Override
      public void a(ajy<?> $$0) {
         super.a($$0);
         if (q.equals($$0) || r.equals($$0)) {
            this.n = true;
         }
      }

      private cwo t() {
         return this.al.a(q);
      }

      private void a(cwo $$0) {
         this.al.a(q, $$0);
      }

      private void a(cwm $$0) {
         this.al.a(r, $$0.a());
      }

      private cwm u() {
         return cwm.k.apply(this.al.a(r));
      }

      @Override
      protected void a(tq $$0) {
         super.a($$0);
         if ($$0.e("item")) {
            this.a(cwo.a(this.dX(), (un)$$0.p("item")).orElse(cwo.j));
         } else {
            this.a(cwo.j);
         }

         if ($$0.b("item_display", 8)) {
            cwm.j.decode(ue.a, $$0.c("item_display")).resultOrPartial(af.a("Display entity", bui.o::error)).ifPresent($$0x -> this.a((cwm)$$0x.getFirst()));
         }
      }

      @Override
      protected void b(tq $$0) {
         super.b($$0);
         if (!this.t().f()) {
            $$0.a("item", this.t().a(this.dX()));
         }

         cwm.j.encodeStart(ue.a, this.u()).ifSuccess($$1 -> $$0.a("item_display", $$1));
      }

      @Override
      public bvy a_(int $$0) {
         return $$0 == 0 ? this.s : bvy.a;
      }

      @Nullable
      public bui.g.a s() {
         return this.t;
      }

      @Override
      protected void a(boolean $$0, float $$1) {
         cwo $$2 = this.t();
         $$2.a(this);
         this.t = new bui.g.a($$2, this.u());
      }

      public static record a(cwo a, cwm b) {
      }
   }

   static record h(float a, float b) implements bui.d {
      @Override
      public float get(float $$0) {
         return ayz.h($$0, this.a, this.b);
      }
   }

   static record i(int a, int b) implements bui.f {
      @Override
      public int get(float $$0) {
         return ayz.a($$0, this.a, this.b);
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

      void a(buk $$0) {
         $$0.a_(this.b, this.c, this.d);
         $$0.b((float)this.e, (float)this.f);
      }

      void b(buk $$0) {
         $$0.a(this.a, this.b, this.c, this.d, this.e, this.f);
      }
   }

   public static record k(bui.e<j> a, bui.a b, int c, bui.d d, bui.d e, int f) {
   }

   public static class l extends bui {
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
      private static final ajy<wp> aG = akc.a(bui.l.class, aka.f);
      private static final ajy<Integer> aH = akc.a(bui.l.class, aka.b);
      private static final ajy<Integer> aI = akc.a(bui.l.class, aka.b);
      private static final ajy<Byte> aJ = akc.a(bui.l.class, aka.a);
      private static final ajy<Byte> aK = akc.a(bui.l.class, aka.a);
      private static final IntSet aL = IntSet.of(new int[]{aG.a(), aH.a(), aI.a(), aJ.a(), aK.a()});
      @Nullable
      private bui.l.b aM;
      @Nullable
      private bui.l.e aN;

      public l(bur<?> $$0, dgh $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a(akc.a $$0) {
         super.a($$0);
         $$0.a(aG, wp.i());
         $$0.a(aH, 200);
         $$0.a(aI, 1073741824);
         $$0.a(aJ, (byte)-1);
         $$0.a(aK, (byte)0);
      }

      @Override
      public void a(ajy<?> $$0) {
         super.a($$0);
         if (aL.contains($$0.a())) {
            this.n = true;
         }
      }

      private wp t() {
         return this.al.a(aG);
      }

      private void a(wp $$0) {
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
         Optional<bui.l.a> $$2 = bui.l.a.d.decode(ue.a, $$0.c("alignment")).resultOrPartial(af.a("Display entity", bui.o::error)).map(Pair::getFirst);
         if ($$2.isPresent()) {
            $$1 = switch ((bui.l.a)$$2.get()) {
               case a -> $$1;
               case b -> (byte)($$1 | 8);
               case c -> (byte)($$1 | 16);
            };
         }

         this.d($$1);
         if ($$0.b("text", 8)) {
            String $$3 = $$0.l("text");

            try {
               wp $$4 = wp.a.a($$3, this.dX());
               if ($$4 != null && this.dV() instanceof ard $$5) {
                  ex $$6 = this.d($$5).a(2);
                  wp $$7 = ws.a($$6, $$4, this, 0);
                  this.a($$7);
               } else {
                  this.a(wp.i());
               }
            } catch (Exception var9) {
               bui.o.warn("Failed to parse display entity text {}", $$3, var9);
            }
         }
      }

      private static void b(byte $$0, tq $$1, String $$2, byte $$3) {
         $$1.a($$2, ($$0 & $$3) != 0);
      }

      @Override
      protected void b(tq $$0) {
         super.b($$0);
         $$0.a("text", wp.a.a(this.t(), this.dX()));
         $$0.a("line_width", this.u());
         $$0.a("background", this.w());
         $$0.a("text_opacity", this.v());
         byte $$1 = this.x();
         b($$1, $$0, "shadow", (byte)1);
         b($$1, $$0, "see_through", (byte)2);
         b($$1, $$0, "default_background", (byte)4);
         bui.l.a.d.encodeStart(ue.a, a($$1)).ifSuccess($$1x -> $$0.a("alignment", $$1x));
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
      public bui.l.e s() {
         return this.aN;
      }

      private bui.l.e y() {
         return new bui.l.e(this.t(), this.u(), bui.f.constant(this.v()), bui.f.constant(this.w()), this.x());
      }

      private bui.l.e a(bui.l.e $$0, float $$1) {
         int $$2 = $$0.d.get($$1);
         int $$3 = $$0.c.get($$1);
         return new bui.l.e(this.t(), this.u(), new bui.i($$3, this.v()), new bui.c($$2, this.w()), this.x());
      }

      public bui.l.b a(bui.l.d $$0) {
         if (this.aM == null) {
            if (this.aN != null) {
               this.aM = $$0.split(this.aN.a(), this.aN.b());
            } else {
               this.aM = new bui.l.b(List.of(), 0);
            }
         }

         return this.aM;
      }

      public static bui.l.a a(byte $$0) {
         if (($$0 & 8) != 0) {
            return bui.l.a.b;
         } else {
            return ($$0 & 16) != 0 ? bui.l.a.c : bui.l.a.a;
         }
      }

      public static enum a implements azv {
         a("center"),
         b("left"),
         c("right");

         public static final Codec<bui.l.a> d = azv.a(bui.l.a::values);
         private final String e;

         private a(final String $$0) {
            this.e = $$0;
         }

         @Override
         public String c() {
            return this.e;
         }
      }

      public static record b(List<bui.l.c> a, int b) {
      }

      public static record c(ayl a, int b) {
      }

      @FunctionalInterface
      public interface d {
         bui.l.b split(wp var1, int var2);
      }

      public static record e(wp a, int b, bui.f c, bui.f d, byte e) {
      }
   }

   static record m(j a, j b) implements bui.e<j> {
      public j a(float $$0) {
         return (double)$$0 >= 1.0 ? this.b : this.a.a(this.b, $$0);
      }
   }
}
