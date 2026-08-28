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

public abstract class buj extends bul {
   static final Logger o = LogUtils.getLogger();
   public static final int a = -1;
   private static final akm<Integer> p = akq.a(buj.class, ako.b);
   private static final akm<Integer> q = akq.a(buj.class, ako.b);
   private static final akm<Integer> r = akq.a(buj.class, ako.b);
   private static final akm<Vector3f> s = akq.a(buj.class, ako.D);
   private static final akm<Vector3f> t = akq.a(buj.class, ako.D);
   private static final akm<Quaternionf> u = akq.a(buj.class, ako.E);
   private static final akm<Quaternionf> ay = akq.a(buj.class, ako.E);
   private static final akm<Byte> az = akq.a(buj.class, ako.a);
   private static final akm<Integer> aA = akq.a(buj.class, ako.b);
   private static final akm<Float> aB = akq.a(buj.class, ako.d);
   private static final akm<Float> aC = akq.a(buj.class, ako.d);
   private static final akm<Float> aD = akq.a(buj.class, ako.d);
   private static final akm<Float> aE = akq.a(buj.class, ako.d);
   private static final akm<Float> aF = akq.a(buj.class, ako.d);
   private static final akm<Integer> aG = akq.a(buj.class, ako.b);
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
   private ezt aO;
   private boolean aP = true;
   protected boolean n;
   private boolean aQ;
   private boolean aR;
   @Nullable
   private buj.k aS;
   @Nullable
   private buj.j aT;

   public buj(bus<?> $$0, dfm $$1) {
      super($$0, $$1);
      this.ad = true;
      this.aO = this.cR();
   }

   @Override
   public void a(akm<?> $$0) {
      super.a($$0);
      if (aF.equals($$0) || aE.equals($$0)) {
         this.D();
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
   public final boolean a(arp $$0, btb $$1, float $$2) {
      return false;
   }

   private static j a(akq $$0) {
      Vector3f $$1 = $$0.a(s);
      Quaternionf $$2 = $$0.a(u);
      Vector3f $$3 = $$0.a(t);
      Quaternionf $$4 = $$0.a(ay);
      return new j($$1, $$2, $$3, $$4);
   }

   @Override
   public void h() {
      bul $$0 = this.dk();
      if ($$0 != null && $$0.dQ()) {
         this.ae();
      }

      if (this.dV().C) {
         if (this.aQ) {
            this.aQ = false;
            int $$1 = this.s();
            this.aL = (long)(this.af + $$1);
         }

         if (this.aR) {
            this.aR = false;
            this.aM = this.q();
         }

         if (this.n) {
            this.n = false;
            boolean $$2 = this.aM != 0;
            if ($$2 && this.aS != null) {
               this.aS = this.a(this.aS, this.aN);
            } else {
               this.aS = this.E();
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
   protected void a(akq.a $$0) {
      $$0.a(r, 0);
      $$0.a(p, 0);
      $$0.a(q, 0);
      $$0.a(s, new Vector3f());
      $$0.a(t, new Vector3f(1.0F, 1.0F, 1.0F));
      $$0.a(ay, new Quaternionf());
      $$0.a(u, new Quaternionf());
      $$0.a(az, buj.a.a.a());
      $$0.a(aA, -1);
      $$0.a(aB, 1.0F);
      $$0.a(aC, 0.0F);
      $$0.a(aD, 1.0F);
      $$0.a(aE, 0.0F);
      $$0.a(aF, 0.0F);
      $$0.a(aG, -1);
   }

   @Override
   protected void a(ul $$0) {
      if ($$0.e("transformation")) {
         j.b.decode(uz.a, $$0.c("transformation")).resultOrPartial(ae.a("Display entity", o::error)).ifPresent($$0x -> this.a((j)$$0x.getFirst()));
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
         this.d(azm.a($$3, 0, 59));
      }

      if ($$0.b("billboard", 8)) {
         buj.a.e.decode(uz.a, $$0.c("billboard")).resultOrPartial(ae.a("Display entity", o::error)).ifPresent($$0x -> this.a((buj.a)$$0x.getFirst()));
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
         ayc.b.decode(uz.a, $$0.c("brightness")).resultOrPartial(ae.a("Display entity", o::error)).ifPresent($$0x -> this.a((ayc)$$0x.getFirst()));
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
   protected void b(ul $$0) {
      j.b.encodeStart(uz.a, a(this.al)).ifSuccess($$1x -> $$0.a("transformation", $$1x));
      buj.a.e.encodeStart(uz.a, this.u()).ifSuccess($$1x -> $$0.a("billboard", $$1x));
      $$0.a("interpolation_duration", this.q());
      $$0.a("teleport_duration", this.t());
      $$0.a("view_range", this.x());
      $$0.a("shadow_radius", this.y());
      $$0.a("shadow_strength", this.z());
      $$0.a("width", this.A());
      $$0.a("height", this.C());
      $$0.a("glow_color_override", this.B());
      ayc $$1 = this.v();
      if ($$1 != null) {
         ayc.b.encodeStart(uz.a, $$1).ifSuccess($$1x -> $$0.a("brightness", $$1x));
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      int $$6 = this.t();
      this.aT = new buj.j($$6, $$0, $$1, $$2, (double)$$3, (double)$$4);
   }

   @Override
   public double f_() {
      return this.aT != null ? this.aT.b : this.dA();
   }

   @Override
   public double P_() {
      return this.aT != null ? this.aT.c : this.dC();
   }

   @Override
   public double Q_() {
      return this.aT != null ? this.aT.d : this.dG();
   }

   @Override
   public float g_() {
      return this.aT != null ? (float)this.aT.f : this.dN();
   }

   @Override
   public float q_() {
      return this.aT != null ? (float)this.aT.e : this.dL();
   }

   public ezt j() {
      return this.aO;
   }

   public boolean l() {
      return !this.aP;
   }

   @Override
   public esa m_() {
      return esa.d;
   }

   @Override
   public boolean r_() {
      return true;
   }

   @Nullable
   public buj.k n() {
      return this.aS;
   }

   private void b(int $$0) {
      this.al.a(q, $$0);
   }

   private int q() {
      return this.al.a(q);
   }

   private void c(int $$0) {
      this.al.a(p, $$0, true);
   }

   private int s() {
      return this.al.a(p);
   }

   private void d(int $$0) {
      this.al.a(r, $$0);
   }

   private int t() {
      return this.al.a(r);
   }

   private void a(buj.a $$0) {
      this.al.a(az, $$0.a());
   }

   private buj.a u() {
      return buj.a.f.apply(this.al.a(az));
   }

   private void a(@Nullable ayc $$0) {
      this.al.a(aA, $$0 != null ? $$0.a() : -1);
   }

   @Nullable
   private ayc v() {
      int $$0 = this.al.a(aA);
      return $$0 != -1 ? ayc.a($$0) : null;
   }

   private int w() {
      return this.al.a(aA);
   }

   private void b(float $$0) {
      this.al.a(aB, $$0);
   }

   private float x() {
      return this.al.a(aB);
   }

   private void c(float $$0) {
      this.al.a(aC, $$0);
   }

   private float y() {
      return this.al.a(aC);
   }

   private void x(float $$0) {
      this.al.a(aD, $$0);
   }

   private float z() {
      return this.al.a(aD);
   }

   private void y(float $$0) {
      this.al.a(aE, $$0);
   }

   private float A() {
      return this.al.a(aE);
   }

   private void z(float $$0) {
      this.al.a(aF, $$0);
   }

   private int B() {
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
         float $$4 = azm.a(azm.f($$3, 0.0F, (float)$$1), 0.0F, 1.0F);
         this.aN = $$4;
         return $$4;
      }
   }

   private float C() {
      return this.al.a(aF);
   }

   @Override
   public void a_(double $$0, double $$1, double $$2) {
      super.a_($$0, $$1, $$2);
      this.D();
   }

   private void D() {
      float $$0 = this.A();
      float $$1 = this.C();
      this.aP = $$0 == 0.0F || $$1 == 0.0F;
      float $$2 = $$0 / 2.0F;
      double $$3 = this.dA();
      double $$4 = this.dC();
      double $$5 = this.dG();
      this.aO = new ezt($$3 - (double)$$2, $$4, $$5 - (double)$$2, $$3 + (double)$$2, $$4 + (double)$$1, $$5 + (double)$$2);
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < azm.k((double)this.x() * 64.0 * cK());
   }

   @Override
   public int j_() {
      int $$0 = this.B();
      return $$0 != -1 ? $$0 : super.j_();
   }

   private buj.k E() {
      return new buj.k(buj.e.constant(a(this.al)), this.u(), this.w(), buj.d.constant(this.y()), buj.d.constant(this.z()), this.B());
   }

   private buj.k a(buj.k $$0, float $$1) {
      j $$2 = $$0.a.get($$1);
      float $$3 = $$0.d.get($$1);
      float $$4 = $$0.e.get($$1);
      return new buj.k(new buj.m($$2, a(this.al)), this.u(), this.w(), new buj.h($$3, this.y()), new buj.h($$4, this.z()), this.B());
   }

   public static enum a implements bai {
      a((byte)0, "fixed"),
      b((byte)1, "vertical"),
      c((byte)2, "horizontal"),
      d((byte)3, "center");

      public static final Codec<buj.a> e = bai.a(buj.a::values);
      public static final IntFunction<buj.a> f = ayd.a(buj.a::a, values(), ayd.a.a);
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

   public static class b extends buj {
      public static final String o = "block_state";
      private static final akm<dvv> p = akq.a(buj.b.class, ako.i);
      @Nullable
      private buj.b.a q;

      public b(bus<?> $$0, dfm $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a(akq.a $$0) {
         super.a($$0);
         $$0.a(p, dis.a.m());
      }

      @Override
      public void a(akm<?> $$0) {
         super.a($$0);
         if ($$0.equals(p)) {
            this.n = true;
         }
      }

      private dvv s() {
         return this.al.a(p);
      }

      private void c(dvv $$0) {
         this.al.a(p, $$0);
      }

      @Override
      protected void a(ul $$0) {
         super.a($$0);
         this.c(va.a(this.dV().a(ma.f), $$0.p("block_state")));
      }

      @Override
      protected void b(ul $$0) {
         super.b($$0);
         $$0.a("block_state", va.a(this.s()));
      }

      @Nullable
      public buj.b.a q() {
         return this.q;
      }

      @Override
      protected void a(boolean $$0, float $$1) {
         this.q = new buj.b.a(this.s());
      }

      public static record a(dvv a) {
      }
   }

   static record c(int a, int b) implements buj.f {
      @Override
      public int get(float $$0) {
         return axx.a($$0, this.a, this.b);
      }
   }

   @FunctionalInterface
   public interface d {
      static buj.d constant(float $$0) {
         return $$1 -> $$0;
      }

      float get(float var1);
   }

   @FunctionalInterface
   public interface e<T> {
      static <T> buj.e<T> constant(T $$0) {
         return $$1 -> $$0;
      }

      T get(float var1);
   }

   @FunctionalInterface
   public interface f {
      static buj.f constant(int $$0) {
         return $$1 -> $$0;
      }

      int get(float var1);
   }

   public static class g extends buj {
      private static final String o = "item";
      private static final String p = "item_display";
      private static final akm<cwm> q = akq.a(buj.g.class, ako.h);
      private static final akm<Byte> r = akq.a(buj.g.class, ako.a);
      private final bvz s = bvz.a(this::s, this::a);
      @Nullable
      private buj.g.a t;

      public g(bus<?> $$0, dfm $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a(akq.a $$0) {
         super.a($$0);
         $$0.a(q, cwm.k);
         $$0.a(r, cwk.a.a());
      }

      @Override
      public void a(akm<?> $$0) {
         super.a($$0);
         if (q.equals($$0) || r.equals($$0)) {
            this.n = true;
         }
      }

      private cwm s() {
         return this.al.a(q);
      }

      private void a(cwm $$0) {
         this.al.a(q, $$0);
      }

      private void a(cwk $$0) {
         this.al.a(r, $$0.a());
      }

      private cwk t() {
         return cwk.k.apply(this.al.a(r));
      }

      @Override
      protected void a(ul $$0) {
         super.a($$0);
         if ($$0.e("item")) {
            this.a(cwm.a(this.dX(), (vi)$$0.p("item")).orElse(cwm.k));
         } else {
            this.a(cwm.k);
         }

         if ($$0.b("item_display", 8)) {
            cwk.j.decode(uz.a, $$0.c("item_display")).resultOrPartial(ae.a("Display entity", buj.o::error)).ifPresent($$0x -> this.a((cwk)$$0x.getFirst()));
         }
      }

      @Override
      protected void b(ul $$0) {
         super.b($$0);
         if (!this.s().f()) {
            $$0.a("item", this.s().a(this.dX()));
         }

         cwk.j.encodeStart(uz.a, this.t()).ifSuccess($$1 -> $$0.a("item_display", $$1));
      }

      @Override
      public bvz a_(int $$0) {
         return $$0 == 0 ? this.s : bvz.a;
      }

      @Nullable
      public buj.g.a q() {
         return this.t;
      }

      @Override
      protected void a(boolean $$0, float $$1) {
         cwm $$2 = this.s();
         $$2.a(this);
         this.t = new buj.g.a($$2, this.t());
      }

      public static record a(cwm a, cwk b) {
      }
   }

   static record h(float a, float b) implements buj.d {
      @Override
      public float get(float $$0) {
         return azm.h($$0, this.a, this.b);
      }
   }

   static record i(int a, int b) implements buj.f {
      @Override
      public int get(float $$0) {
         return azm.a($$0, this.a, this.b);
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

      void a(bul $$0) {
         $$0.a_(this.b, this.c, this.d);
         $$0.a((float)this.e, (float)this.f);
      }

      void b(bul $$0) {
         $$0.a(this.a, this.b, this.c, this.d, this.e, this.f);
      }
   }

   public static record k(buj.e<j> a, buj.a b, int c, buj.d d, buj.d e, int f) {
   }

   public static class l extends buj {
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
      private static final akm<xj> aG = akq.a(buj.l.class, ako.f);
      private static final akm<Integer> aH = akq.a(buj.l.class, ako.b);
      private static final akm<Integer> aI = akq.a(buj.l.class, ako.b);
      private static final akm<Byte> aJ = akq.a(buj.l.class, ako.a);
      private static final akm<Byte> aK = akq.a(buj.l.class, ako.a);
      private static final IntSet aL = IntSet.of(new int[]{aG.a(), aH.a(), aI.a(), aJ.a(), aK.a()});
      @Nullable
      private buj.l.b aM;
      @Nullable
      private buj.l.e aN;

      public l(bus<?> $$0, dfm $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a(akq.a $$0) {
         super.a($$0);
         $$0.a(aG, xj.i());
         $$0.a(aH, 200);
         $$0.a(aI, 1073741824);
         $$0.a(aJ, (byte)-1);
         $$0.a(aK, (byte)0);
      }

      @Override
      public void a(akm<?> $$0) {
         super.a($$0);
         if (aL.contains($$0.a())) {
            this.n = true;
         }
      }

      private xj s() {
         return this.al.a(aG);
      }

      private void a(xj $$0) {
         this.al.a(aG, $$0);
      }

      private int t() {
         return this.al.a(aH);
      }

      private void b(int $$0) {
         this.al.a(aH, $$0);
      }

      private byte u() {
         return this.al.a(aJ);
      }

      private void c(byte $$0) {
         this.al.a(aJ, $$0);
      }

      private int v() {
         return this.al.a(aI);
      }

      private void c(int $$0) {
         this.al.a(aI, $$0);
      }

      private byte w() {
         return this.al.a(aK);
      }

      private void d(byte $$0) {
         this.al.a(aK, $$0);
      }

      private static byte a(byte $$0, ul $$1, String $$2, byte $$3) {
         return $$1.q($$2) ? (byte)($$0 | $$3) : $$0;
      }

      @Override
      protected void a(ul $$0) {
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
         Optional<buj.l.a> $$2 = buj.l.a.d.decode(uz.a, $$0.c("alignment")).resultOrPartial(ae.a("Display entity", buj.o::error)).map(Pair::getFirst);
         if ($$2.isPresent()) {
            $$1 = switch ((buj.l.a)$$2.get()) {
               case a -> $$1;
               case b -> (byte)($$1 | 8);
               case c -> (byte)($$1 | 16);
            };
         }

         this.d($$1);
         if ($$0.b("text", 8)) {
            String $$3 = $$0.l("text");

            try {
               xj $$4 = xj.a.a($$3, this.dX());
               if ($$4 != null && this.dV() instanceof arp $$5) {
                  ew $$6 = this.d($$5).a(2);
                  xj $$7 = xm.a($$6, $$4, this, 0);
                  this.a($$7);
               } else {
                  this.a(xj.i());
               }
            } catch (Exception var9) {
               buj.o.warn("Failed to parse display entity text {}", $$3, var9);
            }
         }
      }

      private static void b(byte $$0, ul $$1, String $$2, byte $$3) {
         $$1.a($$2, ($$0 & $$3) != 0);
      }

      @Override
      protected void b(ul $$0) {
         super.b($$0);
         $$0.a("text", xj.a.a(this.s(), this.dX()));
         $$0.a("line_width", this.t());
         $$0.a("background", this.v());
         $$0.a("text_opacity", this.u());
         byte $$1 = this.w();
         b($$1, $$0, "shadow", (byte)1);
         b($$1, $$0, "see_through", (byte)2);
         b($$1, $$0, "default_background", (byte)4);
         buj.l.a.d.encodeStart(uz.a, a($$1)).ifSuccess($$1x -> $$0.a("alignment", $$1x));
      }

      @Override
      protected void a(boolean $$0, float $$1) {
         if ($$0 && this.aN != null) {
            this.aN = this.a(this.aN, $$1);
         } else {
            this.aN = this.x();
         }

         this.aM = null;
      }

      @Nullable
      public buj.l.e q() {
         return this.aN;
      }

      private buj.l.e x() {
         return new buj.l.e(this.s(), this.t(), buj.f.constant(this.u()), buj.f.constant(this.v()), this.w());
      }

      private buj.l.e a(buj.l.e $$0, float $$1) {
         int $$2 = $$0.d.get($$1);
         int $$3 = $$0.c.get($$1);
         return new buj.l.e(this.s(), this.t(), new buj.i($$3, this.u()), new buj.c($$2, this.v()), this.w());
      }

      public buj.l.b a(buj.l.d $$0) {
         if (this.aM == null) {
            if (this.aN != null) {
               this.aM = $$0.split(this.aN.a(), this.aN.b());
            } else {
               this.aM = new buj.l.b(List.of(), 0);
            }
         }

         return this.aM;
      }

      public static buj.l.a a(byte $$0) {
         if (($$0 & 8) != 0) {
            return buj.l.a.b;
         } else {
            return ($$0 & 16) != 0 ? buj.l.a.c : buj.l.a.a;
         }
      }

      public static enum a implements bai {
         a("center"),
         b("left"),
         c("right");

         public static final Codec<buj.l.a> d = bai.a(buj.l.a::values);
         private final String e;

         private a(final String $$0) {
            this.e = $$0;
         }

         @Override
         public String c() {
            return this.e;
         }
      }

      public static record b(List<buj.l.c> a, int b) {
      }

      public static record c(ayy a, int b) {
      }

      @FunctionalInterface
      public interface d {
         buj.l.b split(xj var1, int var2);
      }

      public static record e(xj a, int b, buj.f c, buj.f d, byte e) {
      }
   }

   static record m(j a, j b) implements buj.e<j> {
      public j a(float $$0) {
         return (double)$$0 >= 1.0 ? this.b : this.a.a(this.b, $$0);
      }
   }
}
