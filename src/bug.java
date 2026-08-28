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

public abstract class bug extends bui {
   static final Logger p = LogUtils.getLogger();
   public static final int b = -1;
   private static final ako<Integer> q = aks.a(bug.class, akq.b);
   private static final ako<Integer> r = aks.a(bug.class, akq.b);
   private static final ako<Integer> s = aks.a(bug.class, akq.b);
   private static final ako<Vector3f> t = aks.a(bug.class, akq.D);
   private static final ako<Vector3f> u = aks.a(bug.class, akq.D);
   private static final ako<Quaternionf> v = aks.a(bug.class, akq.E);
   private static final ako<Quaternionf> az = aks.a(bug.class, akq.E);
   private static final ako<Byte> aA = aks.a(bug.class, akq.a);
   private static final ako<Integer> aB = aks.a(bug.class, akq.b);
   private static final ako<Float> aC = aks.a(bug.class, akq.d);
   private static final ako<Float> aD = aks.a(bug.class, akq.d);
   private static final ako<Float> aE = aks.a(bug.class, akq.d);
   private static final ako<Float> aF = aks.a(bug.class, akq.d);
   private static final ako<Float> aG = aks.a(bug.class, akq.d);
   private static final ako<Integer> aH = aks.a(bug.class, akq.b);
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
   private ezm aP;
   private boolean aQ = true;
   protected boolean o;
   private boolean aR;
   private boolean aS;
   @Nullable
   private bug.k aT;
   @Nullable
   private bug.j aU;

   public bug(bup<?> $$0, dff $$1) {
      super($$0, $$1);
      this.ae = true;
      this.aP = this.cT();
   }

   @Override
   public void a(ako<?> $$0) {
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

   private static j a(aks $$0) {
      Vector3f $$1 = $$0.a(t);
      Quaternionf $$2 = $$0.a(v);
      Vector3f $$3 = $$0.a(u);
      Quaternionf $$4 = $$0.a(az);
      return new j($$1, $$2, $$3, $$4);
   }

   @Override
   public void l() {
      bui $$0 = this.dm();
      if ($$0 != null && $$0.dT()) {
         this.af();
      }

      if (this.dY().C) {
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
               this.bB();
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
   protected void a(aks.a $$0) {
      $$0.a(s, 0);
      $$0.a(q, 0);
      $$0.a(r, 0);
      $$0.a(t, new Vector3f());
      $$0.a(u, new Vector3f(1.0F, 1.0F, 1.0F));
      $$0.a(az, new Quaternionf());
      $$0.a(v, new Quaternionf());
      $$0.a(aA, bug.a.a.a());
      $$0.a(aB, -1);
      $$0.a(aC, 1.0F);
      $$0.a(aD, 0.0F);
      $$0.a(aE, 1.0F);
      $$0.a(aF, 0.0F);
      $$0.a(aG, 0.0F);
      $$0.a(aH, -1);
   }

   @Override
   protected void a(un $$0) {
      if ($$0.e("transformation")) {
         j.b.decode(vb.a, $$0.c("transformation")).resultOrPartial(ae.a("Display entity", p::error)).ifPresent($$0x -> this.a((j)$$0x.getFirst()));
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
         this.d(azn.a($$3, 0, 59));
      }

      if ($$0.b("billboard", 8)) {
         bug.a.e.decode(vb.a, $$0.c("billboard")).resultOrPartial(ae.a("Display entity", p::error)).ifPresent($$0x -> this.a((bug.a)$$0x.getFirst()));
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
         ayd.b.decode(vb.a, $$0.c("brightness")).resultOrPartial(ae.a("Display entity", p::error)).ifPresent($$0x -> this.a((ayd)$$0x.getFirst()));
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
   protected void b(un $$0) {
      j.b.encodeStart(vb.a, a(this.am)).ifSuccess($$1x -> $$0.a("transformation", $$1x));
      bug.a.e.encodeStart(vb.a, this.x()).ifSuccess($$1x -> $$0.a("billboard", $$1x));
      $$0.a("interpolation_duration", this.t());
      $$0.a("teleport_duration", this.w());
      $$0.a("view_range", this.A());
      $$0.a("shadow_radius", this.B());
      $$0.a("shadow_strength", this.C());
      $$0.a("width", this.D());
      $$0.a("height", this.F());
      $$0.a("glow_color_override", this.E());
      ayd $$1 = this.y();
      if ($$1 != null) {
         ayd.b.encodeStart(vb.a, $$1).ifSuccess($$1x -> $$0.a("brightness", $$1x));
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      int $$6 = this.w();
      this.aU = new bug.j($$6, $$0, $$1, $$2, (double)$$3, (double)$$4);
   }

   @Override
   public double d_() {
      return this.aU != null ? this.aU.b : this.dD();
   }

   @Override
   public double e_() {
      return this.aU != null ? this.aU.c : this.dF();
   }

   @Override
   public double P_() {
      return this.aU != null ? this.aU.d : this.dJ();
   }

   @Override
   public float Q_() {
      return this.aU != null ? (float)this.aU.f : this.dQ();
   }

   @Override
   public float f_() {
      return this.aU != null ? (float)this.aU.e : this.dO();
   }

   public ezm m() {
      return this.aP;
   }

   public boolean o() {
      return !this.aQ;
   }

   @Override
   public ert k_() {
      return ert.d;
   }

   @Override
   public boolean r_() {
      return true;
   }

   @Nullable
   public bug.k q() {
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

   private void a(bug.a $$0) {
      this.am.a(aA, $$0.a());
   }

   private bug.a x() {
      return bug.a.f.apply(this.am.a(aA));
   }

   private void a(@Nullable ayd $$0) {
      this.am.a(aB, $$0 != null ? $$0.a() : -1);
   }

   @Nullable
   private ayd y() {
      int $$0 = this.am.a(aB);
      return $$0 != -1 ? ayd.a($$0) : null;
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
         float $$4 = azn.a(azn.f($$3, 0.0F, (float)$$1), 0.0F, 1.0F);
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
      double $$3 = this.dD();
      double $$4 = this.dF();
      double $$5 = this.dJ();
      this.aP = new ezm($$3 - (double)$$2, $$4, $$5 - (double)$$2, $$3 + (double)$$2, $$4 + (double)$$1, $$5 + (double)$$2);
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < azn.k((double)this.A() * 64.0 * cM());
   }

   @Override
   public int i_() {
      int $$0 = this.E();
      return $$0 != -1 ? $$0 : super.i_();
   }

   private bug.k I() {
      return new bug.k(bug.e.constant(a(this.am)), this.x(), this.z(), bug.d.constant(this.B()), bug.d.constant(this.C()), this.E());
   }

   private bug.k a(bug.k $$0, float $$1) {
      j $$2 = $$0.a.get($$1);
      float $$3 = $$0.d.get($$1);
      float $$4 = $$0.e.get($$1);
      return new bug.k(new bug.m($$2, a(this.am)), this.x(), this.z(), new bug.h($$3, this.B()), new bug.h($$4, this.C()), this.E());
   }

   public static enum a implements baj {
      a((byte)0, "fixed"),
      b((byte)1, "vertical"),
      c((byte)2, "horizontal"),
      d((byte)3, "center");

      public static final Codec<bug.a> e = baj.a(bug.a::values);
      public static final IntFunction<bug.a> f = aye.a(bug.a::a, values(), aye.a.a);
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

   public static class b extends bug {
      public static final String p = "block_state";
      private static final ako<dvo> q = aks.a(bug.b.class, akq.i);
      @Nullable
      private bug.b.a r;

      public b(bup<?> $$0, dff $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a(aks.a $$0) {
         super.a($$0);
         $$0.a(q, dil.a.m());
      }

      @Override
      public void a(ako<?> $$0) {
         super.a($$0);
         if ($$0.equals(q)) {
            this.o = true;
         }
      }

      private dvo v() {
         return this.am.a(q);
      }

      private void c(dvo $$0) {
         this.am.a(q, $$0);
      }

      @Override
      protected void a(un $$0) {
         super.a($$0);
         this.c(vc.a(this.dY().a(ma.f), $$0.p("block_state")));
      }

      @Override
      protected void b(un $$0) {
         super.b($$0);
         $$0.a("block_state", vc.a(this.v()));
      }

      @Nullable
      public bug.b.a t() {
         return this.r;
      }

      @Override
      protected void a(boolean $$0, float $$1) {
         this.r = new bug.b.a(this.v());
      }

      public static record a(dvo a) {
      }
   }

   static record c(int a, int b) implements bug.f {
      @Override
      public int get(float $$0) {
         return axy.a($$0, this.a, this.b);
      }
   }

   @FunctionalInterface
   public interface d {
      static bug.d constant(float $$0) {
         return $$1 -> $$0;
      }

      float get(float var1);
   }

   @FunctionalInterface
   public interface e<T> {
      static <T> bug.e<T> constant(T $$0) {
         return $$1 -> $$0;
      }

      T get(float var1);
   }

   @FunctionalInterface
   public interface f {
      static bug.f constant(int $$0) {
         return $$1 -> $$0;
      }

      int get(float var1);
   }

   public static class g extends bug {
      private static final String p = "item";
      private static final String q = "item_display";
      private static final ako<cwf> r = aks.a(bug.g.class, akq.h);
      private static final ako<Byte> s = aks.a(bug.g.class, akq.a);
      private final bvw t = bvw.a(this::v, this::a);
      @Nullable
      private bug.g.a u;

      public g(bup<?> $$0, dff $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a(aks.a $$0) {
         super.a($$0);
         $$0.a(r, cwf.k);
         $$0.a(s, cwd.a.a());
      }

      @Override
      public void a(ako<?> $$0) {
         super.a($$0);
         if (r.equals($$0) || s.equals($$0)) {
            this.o = true;
         }
      }

      private cwf v() {
         return this.am.a(r);
      }

      private void a(cwf $$0) {
         this.am.a(r, $$0);
      }

      private void a(cwd $$0) {
         this.am.a(s, $$0.a());
      }

      private cwd w() {
         return cwd.k.apply(this.am.a(s));
      }

      @Override
      protected void a(un $$0) {
         super.a($$0);
         if ($$0.e("item")) {
            this.a(cwf.a(this.ea(), (vk)$$0.p("item")).orElse(cwf.k));
         } else {
            this.a(cwf.k);
         }

         if ($$0.b("item_display", 8)) {
            cwd.j.decode(vb.a, $$0.c("item_display")).resultOrPartial(ae.a("Display entity", bug.p::error)).ifPresent($$0x -> this.a((cwd)$$0x.getFirst()));
         }
      }

      @Override
      protected void b(un $$0) {
         super.b($$0);
         if (!this.v().f()) {
            $$0.a("item", this.v().a(this.ea()));
         }

         cwd.j.encodeStart(vb.a, this.w()).ifSuccess($$1 -> $$0.a("item_display", $$1));
      }

      @Override
      public bvw a_(int $$0) {
         return $$0 == 0 ? this.t : bvw.a;
      }

      @Nullable
      public bug.g.a t() {
         return this.u;
      }

      @Override
      protected void a(boolean $$0, float $$1) {
         cwf $$2 = this.v();
         $$2.a(this);
         this.u = new bug.g.a($$2, this.w());
      }

      public static record a(cwf a, cwd b) {
      }
   }

   static record h(float a, float b) implements bug.d {
      @Override
      public float get(float $$0) {
         return azn.h($$0, this.a, this.b);
      }
   }

   static record i(int a, int b) implements bug.f {
      @Override
      public int get(float $$0) {
         return azn.a($$0, this.a, this.b);
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

      void a(bui $$0) {
         $$0.a_(this.b, this.c, this.d);
         $$0.a((float)this.e, (float)this.f);
      }

      void b(bui $$0) {
         $$0.a(this.a, this.b, this.c, this.d, this.e, this.f);
      }
   }

   public static record k(bug.e<j> a, bug.a b, int c, bug.d d, bug.d e, int f) {
   }

   public static class l extends bug {
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
      private static final ako<xl> aH = aks.a(bug.l.class, akq.f);
      private static final ako<Integer> aI = aks.a(bug.l.class, akq.b);
      private static final ako<Integer> aJ = aks.a(bug.l.class, akq.b);
      private static final ako<Byte> aK = aks.a(bug.l.class, akq.a);
      private static final ako<Byte> aL = aks.a(bug.l.class, akq.a);
      private static final IntSet aM = IntSet.of(new int[]{aH.a(), aI.a(), aJ.a(), aK.a(), aL.a()});
      @Nullable
      private bug.l.b aN;
      @Nullable
      private bug.l.e aO;

      public l(bup<?> $$0, dff $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a(aks.a $$0) {
         super.a($$0);
         $$0.a(aH, xl.i());
         $$0.a(aI, 200);
         $$0.a(aJ, 1073741824);
         $$0.a(aK, (byte)-1);
         $$0.a(aL, (byte)0);
      }

      @Override
      public void a(ako<?> $$0) {
         super.a($$0);
         if (aM.contains($$0.a())) {
            this.o = true;
         }
      }

      private xl v() {
         return this.am.a(aH);
      }

      private void c(xl $$0) {
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

      private static byte a(byte $$0, un $$1, String $$2, byte $$3) {
         return $$1.q($$2) ? (byte)($$0 | $$3) : $$0;
      }

      @Override
      protected void a(un $$0) {
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
         Optional<bug.l.a> $$2 = bug.l.a.d.decode(vb.a, $$0.c("alignment")).resultOrPartial(ae.a("Display entity", bug.p::error)).map(Pair::getFirst);
         if ($$2.isPresent()) {
            $$1 = switch ((bug.l.a)$$2.get()) {
               case a -> $$1;
               case b -> (byte)($$1 | 8);
               case c -> (byte)($$1 | 16);
            };
         }

         this.d($$1);
         if ($$0.b("text", 8)) {
            String $$3 = $$0.l("text");

            try {
               xl $$4 = xl.a.a($$3, this.ea());
               if ($$4 != null) {
                  ew $$5 = this.dq().a(2);
                  xl $$6 = xo.a($$5, $$4, this, 0);
                  this.c($$6);
               } else {
                  this.c(xl.i());
               }
            } catch (Exception var8) {
               bug.p.warn("Failed to parse display entity text {}", $$3, var8);
            }
         }
      }

      private static void b(byte $$0, un $$1, String $$2, byte $$3) {
         $$1.a($$2, ($$0 & $$3) != 0);
      }

      @Override
      protected void b(un $$0) {
         super.b($$0);
         $$0.a("text", xl.a.a(this.v(), this.ea()));
         $$0.a("line_width", this.w());
         $$0.a("background", this.y());
         $$0.a("text_opacity", this.x());
         byte $$1 = this.z();
         b($$1, $$0, "shadow", (byte)1);
         b($$1, $$0, "see_through", (byte)2);
         b($$1, $$0, "default_background", (byte)4);
         bug.l.a.d.encodeStart(vb.a, a($$1)).ifSuccess($$1x -> $$0.a("alignment", $$1x));
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
      public bug.l.e t() {
         return this.aO;
      }

      private bug.l.e A() {
         return new bug.l.e(this.v(), this.w(), bug.f.constant(this.x()), bug.f.constant(this.y()), this.z());
      }

      private bug.l.e a(bug.l.e $$0, float $$1) {
         int $$2 = $$0.d.get($$1);
         int $$3 = $$0.c.get($$1);
         return new bug.l.e(this.v(), this.w(), new bug.i($$3, this.x()), new bug.c($$2, this.y()), this.z());
      }

      public bug.l.b a(bug.l.d $$0) {
         if (this.aN == null) {
            if (this.aO != null) {
               this.aN = $$0.split(this.aO.a(), this.aO.b());
            } else {
               this.aN = new bug.l.b(List.of(), 0);
            }
         }

         return this.aN;
      }

      public static bug.l.a a(byte $$0) {
         if (($$0 & 8) != 0) {
            return bug.l.a.b;
         } else {
            return ($$0 & 16) != 0 ? bug.l.a.c : bug.l.a.a;
         }
      }

      public static enum a implements baj {
         a("center"),
         b("left"),
         c("right");

         public static final Codec<bug.l.a> d = baj.a(bug.l.a::values);
         private final String e;

         private a(final String $$0) {
            this.e = $$0;
         }

         @Override
         public String c() {
            return this.e;
         }
      }

      public static record b(List<bug.l.c> a, int b) {
      }

      public static record c(ayz a, int b) {
      }

      @FunctionalInterface
      public interface d {
         bug.l.b split(xl var1, int var2);
      }

      public static record e(xl a, int b, bug.f c, bug.f d, byte e) {
      }
   }

   static record m(j a, j b) implements bug.e<j> {
      public j a(float $$0) {
         return (double)$$0 >= 1.0 ? this.b : this.a.a(this.b, $$0);
      }
   }
}
