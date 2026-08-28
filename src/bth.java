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

public abstract class bth extends btj {
   static final Logger p = LogUtils.getLogger();
   public static final int b = -1;
   private static final akg<Integer> q = akk.a(bth.class, aki.b);
   private static final akg<Integer> r = akk.a(bth.class, aki.b);
   private static final akg<Integer> s = akk.a(bth.class, aki.b);
   private static final akg<Vector3f> t = akk.a(bth.class, aki.D);
   private static final akg<Vector3f> u = akk.a(bth.class, aki.D);
   private static final akg<Quaternionf> v = akk.a(bth.class, aki.E);
   private static final akg<Quaternionf> az = akk.a(bth.class, aki.E);
   private static final akg<Byte> aA = akk.a(bth.class, aki.a);
   private static final akg<Integer> aB = akk.a(bth.class, aki.b);
   private static final akg<Float> aC = akk.a(bth.class, aki.d);
   private static final akg<Float> aD = akk.a(bth.class, aki.d);
   private static final akg<Float> aE = akk.a(bth.class, aki.d);
   private static final akg<Float> aF = akk.a(bth.class, aki.d);
   private static final akg<Float> aG = akk.a(bth.class, aki.d);
   private static final akg<Integer> aH = akk.a(bth.class, aki.b);
   private static final IntSet aI = IntSet.of(new int[]{t.a(), u.a(), v.a(), az.a(), aA.a(), aB.a(), aD.a(), aE.a()});
   private static final float aJ = 0.0F;
   private static final float aK = 1.0F;
   private static final int aL = -1;
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
   private long aM = -2147483648L;
   private int aN;
   private float aO;
   private exz aP;
   private boolean aQ = true;
   protected boolean o;
   private boolean aR;
   private boolean aS;
   @Nullable
   private bth.k aT;
   @Nullable
   private bth.j aU;

   public bth(btq<?> $$0, dds $$1) {
      super($$0, $$1);
      this.ae = true;
      this.aP = this.cO();
   }

   @Override
   public void a(akg<?> $$0) {
      super.a($$0);
      if (aG.equals($$0) || aF.equals($$0)) {
         this.G();
      }

      if (q.equals($$0)) {
         this.aR = true;
      }

      if (r.equals($$0)) {
         this.aS = true;
      }

      if (aI.contains($$0.a())) {
         this.o = true;
      }
   }

   private static j a(akk $$0) {
      Vector3f $$1 = $$0.a(t);
      Quaternionf $$2 = $$0.a(v);
      Vector3f $$3 = $$0.a(u);
      Quaternionf $$4 = $$0.a(az);
      return new j($$1, $$2, $$3, $$4);
   }

   @Override
   public void l() {
      btj $$0 = this.dg();
      if ($$0 != null && $$0.dN()) {
         this.af();
      }

      if (this.dS().B) {
         if (this.aR) {
            this.aR = false;
            int $$1 = this.v();
            this.aM = (long)(this.ag + $$1);
         }

         if (this.aS) {
            this.aS = false;
            this.aN = this.t();
         }

         if (this.o) {
            this.o = false;
            boolean $$2 = this.aN != 0;
            if ($$2 && this.aT != null) {
               this.aT = this.a(this.aT, this.aO);
            } else {
               this.aT = this.I();
            }

            this.a($$2, this.aO);
         }

         if (this.aU != null) {
            if (this.aU.a == 0) {
               this.aU.a(this);
               this.by();
               this.aU = null;
            } else {
               this.aU.b(this);
               this.aU.a--;
               if (this.aU.a == 0) {
                  this.aU = null;
               }
            }
         }
      }
   }

   protected abstract void a(boolean var1, float var2);

   @Override
   protected void a(akk.a $$0) {
      $$0.a(s, 0);
      $$0.a(q, 0);
      $$0.a(r, 0);
      $$0.a(t, new Vector3f());
      $$0.a(u, new Vector3f(1.0F, 1.0F, 1.0F));
      $$0.a(az, new Quaternionf());
      $$0.a(v, new Quaternionf());
      $$0.a(aA, bth.a.a.a());
      $$0.a(aB, -1);
      $$0.a(aC, 1.0F);
      $$0.a(aD, 0.0F);
      $$0.a(aE, 1.0F);
      $$0.a(aF, 0.0F);
      $$0.a(aG, 0.0F);
      $$0.a(aH, -1);
   }

   @Override
   protected void a(uf $$0) {
      if ($$0.e("transformation")) {
         j.b.decode(ut.a, $$0.c("transformation")).resultOrPartial(ad.a("Display entity", p::error)).ifPresent($$0x -> this.a((j)$$0x.getFirst()));
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
         this.d(azc.a($$3, 0, 59));
      }

      if ($$0.b("billboard", 8)) {
         bth.a.e.decode(ut.a, $$0.c("billboard")).resultOrPartial(ad.a("Display entity", p::error)).ifPresent($$0x -> this.a((bth.a)$$0x.getFirst()));
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
         this.m($$0.h("glow_color_override"));
      }

      if ($$0.b("brightness", 10)) {
         axs.b.decode(ut.a, $$0.c("brightness")).resultOrPartial(ad.a("Display entity", p::error)).ifPresent($$0x -> this.a((axs)$$0x.getFirst()));
      } else {
         this.a(null);
      }
   }

   private void a(j $$0) {
      this.am.a(t, $$0.d());
      this.am.a(v, $$0.e());
      this.am.a(u, $$0.f());
      this.am.a(az, $$0.g());
   }

   @Override
   protected void b(uf $$0) {
      j.b.encodeStart(ut.a, a(this.am)).ifSuccess($$1x -> $$0.a("transformation", $$1x));
      bth.a.e.encodeStart(ut.a, this.x()).ifSuccess($$1x -> $$0.a("billboard", $$1x));
      $$0.a("interpolation_duration", this.t());
      $$0.a("teleport_duration", this.w());
      $$0.a("view_range", this.A());
      $$0.a("shadow_radius", this.B());
      $$0.a("shadow_strength", this.C());
      $$0.a("width", this.D());
      $$0.a("height", this.F());
      $$0.a("glow_color_override", this.E());
      axs $$1 = this.y();
      if ($$1 != null) {
         axs.b.encodeStart(ut.a, $$1).ifSuccess($$1x -> $$0.a("brightness", $$1x));
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      int $$6 = this.w();
      this.aU = new bth.j($$6, $$0, $$1, $$2, (double)$$3, (double)$$4);
   }

   @Override
   public double c_() {
      return this.aU != null ? this.aU.b : this.dx();
   }

   @Override
   public double d_() {
      return this.aU != null ? this.aU.c : this.dz();
   }

   @Override
   public double N_() {
      return this.aU != null ? this.aU.d : this.dD();
   }

   @Override
   public float O_() {
      return this.aU != null ? (float)this.aU.f : this.dK();
   }

   @Override
   public float e_() {
      return this.aU != null ? (float)this.aU.e : this.dI();
   }

   public exz m() {
      return this.aP;
   }

   public boolean o() {
      return !this.aQ;
   }

   @Override
   public eqg j_() {
      return eqg.d;
   }

   @Override
   public boolean q_() {
      return true;
   }

   @Nullable
   public bth.k q() {
      return this.aT;
   }

   private void b(int $$0) {
      this.am.a(r, $$0);
   }

   private int t() {
      return this.am.a(r);
   }

   private void c(int $$0) {
      this.am.a(q, $$0, true);
   }

   private int v() {
      return this.am.a(q);
   }

   private void d(int $$0) {
      this.am.a(s, $$0);
   }

   private int w() {
      return this.am.a(s);
   }

   private void a(bth.a $$0) {
      this.am.a(aA, $$0.a());
   }

   private bth.a x() {
      return bth.a.f.apply(this.am.a(aA));
   }

   private void a(@Nullable axs $$0) {
      this.am.a(aB, $$0 != null ? $$0.a() : -1);
   }

   @Nullable
   private axs y() {
      int $$0 = this.am.a(aB);
      return $$0 != -1 ? axs.a($$0) : null;
   }

   private int z() {
      return this.am.a(aB);
   }

   private void b(float $$0) {
      this.am.a(aC, $$0);
   }

   private float A() {
      return this.am.a(aC);
   }

   private void c(float $$0) {
      this.am.a(aD, $$0);
   }

   private float B() {
      return this.am.a(aD);
   }

   private void x(float $$0) {
      this.am.a(aE, $$0);
   }

   private float C() {
      return this.am.a(aE);
   }

   private void y(float $$0) {
      this.am.a(aF, $$0);
   }

   private float D() {
      return this.am.a(aF);
   }

   private void z(float $$0) {
      this.am.a(aG, $$0);
   }

   private int E() {
      return this.am.a(aH);
   }

   private void m(int $$0) {
      this.am.a(aH, $$0);
   }

   public float a(float $$0) {
      int $$1 = this.aN;
      if ($$1 <= 0) {
         return 1.0F;
      } else {
         float $$2 = (float)((long)this.ag - this.aM);
         float $$3 = $$2 + $$0;
         float $$4 = azc.a(azc.f($$3, 0.0F, (float)$$1), 0.0F, 1.0F);
         this.aO = $$4;
         return $$4;
      }
   }

   private float F() {
      return this.am.a(aG);
   }

   @Override
   public void a_(double $$0, double $$1, double $$2) {
      super.a_($$0, $$1, $$2);
      this.G();
   }

   private void G() {
      float $$0 = this.D();
      float $$1 = this.F();
      this.aQ = $$0 == 0.0F || $$1 == 0.0F;
      float $$2 = $$0 / 2.0F;
      double $$3 = this.dx();
      double $$4 = this.dz();
      double $$5 = this.dD();
      this.aP = new exz($$3 - (double)$$2, $$4, $$5 - (double)$$2, $$3 + (double)$$2, $$4 + (double)$$1, $$5 + (double)$$2);
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < azc.k((double)this.A() * 64.0 * cH());
   }

   @Override
   public int h_() {
      int $$0 = this.E();
      return $$0 != -1 ? $$0 : super.h_();
   }

   private bth.k I() {
      return new bth.k(bth.e.constant(a(this.am)), this.x(), this.z(), bth.d.constant(this.B()), bth.d.constant(this.C()), this.E());
   }

   private bth.k a(bth.k $$0, float $$1) {
      j $$2 = $$0.a.get($$1);
      float $$3 = $$0.d.get($$1);
      float $$4 = $$0.e.get($$1);
      return new bth.k(new bth.m($$2, a(this.am)), this.x(), this.z(), new bth.h($$3, this.B()), new bth.h($$4, this.C()), this.E());
   }

   public static enum a implements azy {
      a((byte)0, "fixed"),
      b((byte)1, "vertical"),
      c((byte)2, "horizontal"),
      d((byte)3, "center");

      public static final Codec<bth.a> e = azy.a(bth.a::values);
      public static final IntFunction<bth.a> f = axt.a(bth.a::a, values(), axt.a.a);
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

   public static class b extends bth {
      public static final String p = "block_state";
      private static final akg<dua> q = akk.a(bth.b.class, aki.i);
      @Nullable
      private bth.b.a r;

      public b(btq<?> $$0, dds $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a(akk.a $$0) {
         super.a($$0);
         $$0.a(q, dgx.a.o());
      }

      @Override
      public void a(akg<?> $$0) {
         super.a($$0);
         if ($$0.equals(q)) {
            this.o = true;
         }
      }

      private dua v() {
         return this.am.a(q);
      }

      private void c(dua $$0) {
         this.am.a(q, $$0);
      }

      @Override
      protected void a(uf $$0) {
         super.a($$0);
         this.c(uu.a(this.dS().a(lv.f), $$0.p("block_state")));
      }

      @Override
      protected void b(uf $$0) {
         super.b($$0);
         $$0.a("block_state", uu.a(this.v()));
      }

      @Nullable
      public bth.b.a t() {
         return this.r;
      }

      @Override
      protected void a(boolean $$0, float $$1) {
         this.r = new bth.b.a(this.v());
      }

      public static record a(dua a) {
      }
   }

   static record c(int a, int b) implements bth.f {
      @Override
      public int get(float $$0) {
         return axn.a($$0, this.a, this.b);
      }
   }

   @FunctionalInterface
   public interface d {
      static bth.d constant(float $$0) {
         return $$1 -> $$0;
      }

      float get(float var1);
   }

   @FunctionalInterface
   public interface e<T> {
      static <T> bth.e<T> constant(T $$0) {
         return $$1 -> $$0;
      }

      T get(float var1);
   }

   @FunctionalInterface
   public interface f {
      static bth.f constant(int $$0) {
         return $$1 -> $$0;
      }

      int get(float var1);
   }

   public static class g extends bth {
      private static final String p = "item";
      private static final String q = "item_display";
      private static final akg<cvl> r = akk.a(bth.g.class, aki.h);
      private static final akg<Byte> s = akk.a(bth.g.class, aki.a);
      private final buw t = buw.a(this::v, this::a);
      @Nullable
      private bth.g.a u;

      public g(btq<?> $$0, dds $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a(akk.a $$0) {
         super.a($$0);
         $$0.a(r, cvl.k);
         $$0.a(s, cvi.a.a());
      }

      @Override
      public void a(akg<?> $$0) {
         super.a($$0);
         if (r.equals($$0) || s.equals($$0)) {
            this.o = true;
         }
      }

      private cvl v() {
         return this.am.a(r);
      }

      private void a(cvl $$0) {
         this.am.a(r, $$0);
      }

      private void a(cvi $$0) {
         this.am.a(s, $$0.a());
      }

      private cvi w() {
         return cvi.k.apply(this.am.a(s));
      }

      @Override
      protected void a(uf $$0) {
         super.a($$0);
         if ($$0.e("item")) {
            this.a(cvl.a(this.dU(), (vc)$$0.p("item")).orElse(cvl.k));
         } else {
            this.a(cvl.k);
         }

         if ($$0.b("item_display", 8)) {
            cvi.j.decode(ut.a, $$0.c("item_display")).resultOrPartial(ad.a("Display entity", bth.p::error)).ifPresent($$0x -> this.a((cvi)$$0x.getFirst()));
         }
      }

      @Override
      protected void b(uf $$0) {
         super.b($$0);
         if (!this.v().f()) {
            $$0.a("item", this.v().a(this.dU()));
         }

         cvi.j.encodeStart(ut.a, this.w()).ifSuccess($$1 -> $$0.a("item_display", $$1));
      }

      @Override
      public buw a_(int $$0) {
         return $$0 == 0 ? this.t : buw.a;
      }

      @Nullable
      public bth.g.a t() {
         return this.u;
      }

      @Override
      protected void a(boolean $$0, float $$1) {
         cvl $$2 = this.v();
         $$2.a(this);
         this.u = new bth.g.a($$2, this.w());
      }

      public static record a(cvl a, cvi b) {
      }
   }

   static record h(float a, float b) implements bth.d {
      @Override
      public float get(float $$0) {
         return azc.h($$0, this.a, this.b);
      }
   }

   static record i(int a, int b) implements bth.f {
      @Override
      public int get(float $$0) {
         return azc.a($$0, this.a, this.b);
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

      void a(btj $$0) {
         $$0.a_(this.b, this.c, this.d);
         $$0.a((float)this.e, (float)this.f);
      }

      void b(btj $$0) {
         $$0.a(this.a, this.b, this.c, this.d, this.e, this.f);
      }
   }

   public static record k(bth.e<j> a, bth.a b, int c, bth.d d, bth.d e, int f) {
   }

   public static class l extends bth {
      public static final String p = "text";
      private static final String az = "line_width";
      private static final String aA = "text_opacity";
      private static final String aB = "background";
      private static final String aC = "shadow";
      private static final String aD = "see_through";
      private static final String aE = "default_background";
      private static final String aF = "alignment";
      public static final byte q = 1;
      public static final byte r = 2;
      public static final byte s = 4;
      public static final byte t = 8;
      public static final byte u = 16;
      private static final byte aG = -1;
      public static final int v = 1073741824;
      private static final akg<xd> aH = akk.a(bth.l.class, aki.f);
      private static final akg<Integer> aI = akk.a(bth.l.class, aki.b);
      private static final akg<Integer> aJ = akk.a(bth.l.class, aki.b);
      private static final akg<Byte> aK = akk.a(bth.l.class, aki.a);
      private static final akg<Byte> aL = akk.a(bth.l.class, aki.a);
      private static final IntSet aM = IntSet.of(new int[]{aH.a(), aI.a(), aJ.a(), aK.a(), aL.a()});
      @Nullable
      private bth.l.b aN;
      @Nullable
      private bth.l.e aO;

      public l(btq<?> $$0, dds $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a(akk.a $$0) {
         super.a($$0);
         $$0.a(aH, xd.i());
         $$0.a(aI, 200);
         $$0.a(aJ, 1073741824);
         $$0.a(aK, (byte)-1);
         $$0.a(aL, (byte)0);
      }

      @Override
      public void a(akg<?> $$0) {
         super.a($$0);
         if (aM.contains($$0.a())) {
            this.o = true;
         }
      }

      private xd v() {
         return this.am.a(aH);
      }

      private void c(xd $$0) {
         this.am.a(aH, $$0);
      }

      private int w() {
         return this.am.a(aI);
      }

      private void b(int $$0) {
         this.am.a(aI, $$0);
      }

      private byte x() {
         return this.am.a(aK);
      }

      private void c(byte $$0) {
         this.am.a(aK, $$0);
      }

      private int y() {
         return this.am.a(aJ);
      }

      private void c(int $$0) {
         this.am.a(aJ, $$0);
      }

      private byte z() {
         return this.am.a(aL);
      }

      private void d(byte $$0) {
         this.am.a(aL, $$0);
      }

      private static byte a(byte $$0, uf $$1, String $$2, byte $$3) {
         return $$1.q($$2) ? (byte)($$0 | $$3) : $$0;
      }

      @Override
      protected void a(uf $$0) {
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
         Optional<bth.l.a> $$2 = bth.l.a.d.decode(ut.a, $$0.c("alignment")).resultOrPartial(ad.a("Display entity", bth.p::error)).map(Pair::getFirst);
         if ($$2.isPresent()) {
            $$1 = switch ((bth.l.a)$$2.get()) {
               case a -> $$1;
               case b -> (byte)($$1 | 8);
               case c -> (byte)($$1 | 16);
            };
         }

         this.d($$1);
         if ($$0.b("text", 8)) {
            String $$3 = $$0.l("text");

            try {
               xd $$4 = xd.a.a($$3, this.dU());
               if ($$4 != null) {
                  et $$5 = this.dk().a(2);
                  xd $$6 = xg.a($$5, $$4, this, 0);
                  this.c($$6);
               } else {
                  this.c(xd.i());
               }
            } catch (Exception var8) {
               bth.p.warn("Failed to parse display entity text {}", $$3, var8);
            }
         }
      }

      private static void b(byte $$0, uf $$1, String $$2, byte $$3) {
         $$1.a($$2, ($$0 & $$3) != 0);
      }

      @Override
      protected void b(uf $$0) {
         super.b($$0);
         $$0.a("text", xd.a.a(this.v(), this.dU()));
         $$0.a("line_width", this.w());
         $$0.a("background", this.y());
         $$0.a("text_opacity", this.x());
         byte $$1 = this.z();
         b($$1, $$0, "shadow", (byte)1);
         b($$1, $$0, "see_through", (byte)2);
         b($$1, $$0, "default_background", (byte)4);
         bth.l.a.d.encodeStart(ut.a, a($$1)).ifSuccess($$1x -> $$0.a("alignment", $$1x));
      }

      @Override
      protected void a(boolean $$0, float $$1) {
         if ($$0 && this.aO != null) {
            this.aO = this.a(this.aO, $$1);
         } else {
            this.aO = this.A();
         }

         this.aN = null;
      }

      @Nullable
      public bth.l.e t() {
         return this.aO;
      }

      private bth.l.e A() {
         return new bth.l.e(this.v(), this.w(), bth.f.constant(this.x()), bth.f.constant(this.y()), this.z());
      }

      private bth.l.e a(bth.l.e $$0, float $$1) {
         int $$2 = $$0.d.get($$1);
         int $$3 = $$0.c.get($$1);
         return new bth.l.e(this.v(), this.w(), new bth.i($$3, this.x()), new bth.c($$2, this.y()), this.z());
      }

      public bth.l.b a(bth.l.d $$0) {
         if (this.aN == null) {
            if (this.aO != null) {
               this.aN = $$0.split(this.aO.a(), this.aO.b());
            } else {
               this.aN = new bth.l.b(List.of(), 0);
            }
         }

         return this.aN;
      }

      public static bth.l.a a(byte $$0) {
         if (($$0 & 8) != 0) {
            return bth.l.a.b;
         } else {
            return ($$0 & 16) != 0 ? bth.l.a.c : bth.l.a.a;
         }
      }

      public static enum a implements azy {
         a("center"),
         b("left"),
         c("right");

         public static final Codec<bth.l.a> d = azy.a(bth.l.a::values);
         private final String e;

         private a(final String $$0) {
            this.e = $$0;
         }

         @Override
         public String c() {
            return this.e;
         }
      }

      public static record b(List<bth.l.c> a, int b) {
      }

      public static record c(ayo a, int b) {
      }

      @FunctionalInterface
      public interface d {
         bth.l.b split(xd var1, int var2);
      }

      public static record e(xd a, int b, bth.f c, bth.f d, byte e) {
      }
   }

   static record m(j a, j b) implements bth.e<j> {
      public j a(float $$0) {
         return (double)$$0 >= 1.0 ? this.b : this.a.a(this.b, $$0);
      }
   }
}
