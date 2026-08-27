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

public abstract class blo extends blp {
   static final Logger p = LogUtils.getLogger();
   public static final int b = -1;
   private static final agj<Integer> q = agm.a(blo.class, agl.b);
   private static final agj<Integer> r = agm.a(blo.class, agl.b);
   private static final agj<Integer> s = agm.a(blo.class, agl.b);
   private static final agj<Vector3f> t = agm.a(blo.class, agl.A);
   private static final agj<Vector3f> u = agm.a(blo.class, agl.A);
   private static final agj<Quaternionf> v = agm.a(blo.class, agl.B);
   private static final agj<Quaternionf> aE = agm.a(blo.class, agl.B);
   private static final agj<Byte> aF = agm.a(blo.class, agl.a);
   private static final agj<Integer> aG = agm.a(blo.class, agl.b);
   private static final agj<Float> aH = agm.a(blo.class, agl.d);
   private static final agj<Float> aI = agm.a(blo.class, agl.d);
   private static final agj<Float> aJ = agm.a(blo.class, agl.d);
   private static final agj<Float> aK = agm.a(blo.class, agl.d);
   private static final agj<Float> aL = agm.a(blo.class, agl.d);
   private static final agj<Integer> aM = agm.a(blo.class, agl.b);
   private static final IntSet aN = IntSet.of(new int[]{t.a(), u.a(), v.a(), aE.a(), aF.a(), aG.a(), aI.a(), aJ.a()});
   private static final float aO = 0.0F;
   private static final float aP = 1.0F;
   private static final int aQ = -1;
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
   private long aR = -2147483648L;
   private int aS;
   private float aT;
   private elh aU;
   protected boolean o;
   private boolean aV;
   private boolean aW;
   @Nullable
   private blo.k aX;
   @Nullable
   private blo.j aY;

   public blo(blt<?> $$0, cti $$1) {
      super($$0, $$1);
      this.af = true;
      this.at = true;
      this.aU = this.cH();
   }

   @Override
   public void a(agj<?> $$0) {
      super.a($$0);
      if (aL.equals($$0) || aK.equals($$0)) {
         this.H();
      }

      if (q.equals($$0)) {
         this.aV = true;
      }

      if (r.equals($$0)) {
         this.aW = true;
      }

      if (aN.contains($$0.a())) {
         this.o = true;
      }
   }

   private static j a(agm $$0) {
      Vector3f $$1 = $$0.b(t);
      Quaternionf $$2 = $$0.b(v);
      Vector3f $$3 = $$0.b(u);
      Quaternionf $$4 = $$0.b(aE);
      return new j($$1, $$2, $$3, $$4);
   }

   @Override
   public void l() {
      blp $$0 = this.cZ();
      if ($$0 != null && $$0.dH()) {
         this.ac();
      }

      if (this.dM().B) {
         if (this.aV) {
            this.aV = false;
            int $$1 = this.u();
            this.aR = (long)(this.ah + $$1);
         }

         if (this.aW) {
            this.aW = false;
            this.aS = this.s();
         }

         if (this.o) {
            this.o = false;
            boolean $$2 = this.aS != 0;
            if ($$2 && this.aX != null) {
               this.aX = this.a(this.aX, this.aT);
            } else {
               this.aX = this.I();
            }

            this.a($$2, this.aT);
         }

         if (this.aY != null) {
            if (this.aY.a == 0) {
               this.aY.a(this);
               this.bp();
               this.aY = null;
            } else {
               this.aY.b(this);
               this.aY.a--;
               if (this.aY.a == 0) {
                  this.aY = null;
               }
            }
         }
      }
   }

   protected abstract void a(boolean var1, float var2);

   @Override
   protected void c_() {
      this.an.a(s, 0);
      this.an.a(q, 0);
      this.an.a(r, 0);
      this.an.a(t, new Vector3f());
      this.an.a(u, new Vector3f(1.0F, 1.0F, 1.0F));
      this.an.a(aE, new Quaternionf());
      this.an.a(v, new Quaternionf());
      this.an.a(aF, blo.a.a.a());
      this.an.a(aG, -1);
      this.an.a(aH, 1.0F);
      this.an.a(aI, 0.0F);
      this.an.a(aJ, 1.0F);
      this.an.a(aK, 0.0F);
      this.an.a(aL, 0.0F);
      this.an.a(aM, -1);
   }

   @Override
   protected void a(sl $$0) {
      if ($$0.e("transformation")) {
         j.b.decode(sz.a, $$0.c("transformation")).resultOrPartial(ac.a("Display entity", p::error)).ifPresent($$0x -> this.a((j)$$0x.getFirst()));
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
         this.d(aui.a($$3, 0, 59));
      }

      if ($$0.b("billboard", 8)) {
         blo.a.e.decode(sz.a, $$0.c("billboard")).resultOrPartial(ac.a("Display entity", p::error)).ifPresent($$0x -> this.a((blo.a)$$0x.getFirst()));
      }

      if ($$0.b("view_range", 99)) {
         this.b($$0.j("view_range"));
      }

      if ($$0.b("shadow_radius", 99)) {
         this.c($$0.j("shadow_radius"));
      }

      if ($$0.b("shadow_strength", 99)) {
         this.u($$0.j("shadow_strength"));
      }

      if ($$0.b("width", 99)) {
         this.v($$0.j("width"));
      }

      if ($$0.b("height", 99)) {
         this.w($$0.j("height"));
      }

      if ($$0.b("glow_color_override", 99)) {
         this.m($$0.h("glow_color_override"));
      }

      if ($$0.b("brightness", 10)) {
         asz.b.decode(sz.a, $$0.c("brightness")).resultOrPartial(ac.a("Display entity", p::error)).ifPresent($$0x -> this.a((asz)$$0x.getFirst()));
      } else {
         this.a(null);
      }
   }

   private void a(j $$0) {
      this.an.b(t, $$0.d());
      this.an.b(v, $$0.e());
      this.an.b(u, $$0.f());
      this.an.b(aE, $$0.g());
   }

   @Override
   protected void b(sl $$0) {
      j.b.encodeStart(sz.a, a(this.an)).result().ifPresent($$1x -> $$0.a("transformation", $$1x));
      blo.a.e.encodeStart(sz.a, this.x()).result().ifPresent($$1x -> $$0.a("billboard", $$1x));
      $$0.a("interpolation_duration", this.s());
      $$0.a("teleport_duration", this.w());
      $$0.a("view_range", this.A());
      $$0.a("shadow_radius", this.B());
      $$0.a("shadow_strength", this.C());
      $$0.a("width", this.D());
      $$0.a("height", this.G());
      $$0.a("glow_color_override", this.E());
      asz $$1 = this.y();
      if ($$1 != null) {
         asz.b.encodeStart(sz.a, $$1).result().ifPresent($$1x -> $$0.a("brightness", $$1x));
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      int $$6 = this.w();
      this.aY = new blo.j($$6, $$0, $$1, $$2, (double)$$3, (double)$$4);
   }

   @Override
   public double p_() {
      return this.aY != null ? this.aY.b : this.dr();
   }

   @Override
   public double N_() {
      return this.aY != null ? this.aY.c : this.dt();
   }

   @Override
   public double O_() {
      return this.aY != null ? this.aY.d : this.dx();
   }

   @Override
   public float f_() {
      return this.aY != null ? (float)this.aY.f : this.dE();
   }

   @Override
   public float q_() {
      return this.aY != null ? (float)this.aY.e : this.dC();
   }

   @Override
   public elh i_() {
      return this.aU;
   }

   @Override
   public eep s_() {
      return eep.d;
   }

   @Override
   public boolean r_() {
      return true;
   }

   @Nullable
   public blo.k q() {
      return this.aX;
   }

   private void b(int $$0) {
      this.an.b(r, $$0);
   }

   private int s() {
      return this.an.b(r);
   }

   private void c(int $$0) {
      this.an.a(q, $$0, true);
   }

   private int u() {
      return this.an.b(q);
   }

   private void d(int $$0) {
      this.an.b(s, $$0);
   }

   private int w() {
      return this.an.b(s);
   }

   private void a(blo.a $$0) {
      this.an.b(aF, $$0.a());
   }

   private blo.a x() {
      return blo.a.f.apply(this.an.b(aF));
   }

   private void a(@Nullable asz $$0) {
      this.an.b(aG, $$0 != null ? $$0.a() : -1);
   }

   @Nullable
   private asz y() {
      int $$0 = this.an.b(aG);
      return $$0 != -1 ? asz.a($$0) : null;
   }

   private int z() {
      return this.an.b(aG);
   }

   private void b(float $$0) {
      this.an.b(aH, $$0);
   }

   private float A() {
      return this.an.b(aH);
   }

   private void c(float $$0) {
      this.an.b(aI, $$0);
   }

   private float B() {
      return this.an.b(aI);
   }

   private void u(float $$0) {
      this.an.b(aJ, $$0);
   }

   private float C() {
      return this.an.b(aJ);
   }

   private void v(float $$0) {
      this.an.b(aK, $$0);
   }

   private float D() {
      return this.an.b(aK);
   }

   private void w(float $$0) {
      this.an.b(aL, $$0);
   }

   private int E() {
      return this.an.b(aM);
   }

   private void m(int $$0) {
      this.an.b(aM, $$0);
   }

   public float a(float $$0) {
      int $$1 = this.aS;
      if ($$1 <= 0) {
         return 1.0F;
      } else {
         float $$2 = (float)((long)this.ah - this.aR);
         float $$3 = $$2 + $$0;
         float $$4 = aui.a(aui.g($$3, 0.0F, (float)$$1), 0.0F, 1.0F);
         this.aT = $$4;
         return $$4;
      }
   }

   private float G() {
      return this.an.b(aL);
   }

   @Override
   public void a_(double $$0, double $$1, double $$2) {
      super.a_($$0, $$1, $$2);
      this.H();
   }

   private void H() {
      float $$0 = this.D();
      float $$1 = this.G();
      if ($$0 != 0.0F && $$1 != 0.0F) {
         this.at = false;
         float $$2 = $$0 / 2.0F;
         double $$3 = this.dr();
         double $$4 = this.dt();
         double $$5 = this.dx();
         this.aU = new elh($$3 - (double)$$2, $$4, $$5 - (double)$$2, $$3 + (double)$$2, $$4 + (double)$$1, $$5 + (double)$$2);
      } else {
         this.at = true;
      }
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < aui.k((double)this.A() * 64.0 * cA());
   }

   @Override
   public int j_() {
      int $$0 = this.E();
      return $$0 != -1 ? $$0 : super.j_();
   }

   private blo.k I() {
      return new blo.k(blo.e.constant(a(this.an)), this.x(), this.z(), blo.d.constant(this.B()), blo.d.constant(this.C()), this.E());
   }

   private blo.k a(blo.k $$0, float $$1) {
      j $$2 = $$0.a.get($$1);
      float $$3 = $$0.d.get($$1);
      float $$4 = $$0.e.get($$1);
      return new blo.k(new blo.m($$2, a(this.an)), this.x(), this.z(), new blo.h($$3, this.B()), new blo.h($$4, this.C()), this.E());
   }

   public static enum a implements ave {
      a((byte)0, "fixed"),
      b((byte)1, "vertical"),
      c((byte)2, "horizontal"),
      d((byte)3, "center");

      public static final Codec<blo.a> e = ave.a(blo.a::values);
      public static final IntFunction<blo.a> f = ata.a(blo.a::a, values(), ata.a.a);
      private final byte g;
      private final String h;

      private a(byte $$0, String $$1) {
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

   public static class b extends blo {
      public static final String p = "block_state";
      private static final agj<dja> q = agm.a(blo.b.class, agl.i);
      @Nullable
      private blo.b.a r;

      public b(blt<?> $$0, cti $$1) {
         super($$0, $$1);
      }

      @Override
      protected void c_() {
         super.c_();
         this.an.a(q, cwl.a.o());
      }

      @Override
      public void a(agj<?> $$0) {
         super.a($$0);
         if ($$0.equals(q)) {
            this.o = true;
         }
      }

      private dja u() {
         return this.an.b(q);
      }

      private void c(dja $$0) {
         this.an.b(q, $$0);
      }

      @Override
      protected void a(sl $$0) {
         super.a($$0);
         this.c(ta.a(this.dM().a(ke.f), $$0.p("block_state")));
      }

      @Override
      protected void b(sl $$0) {
         super.b($$0);
         $$0.a("block_state", ta.a(this.u()));
      }

      @Nullable
      public blo.b.a s() {
         return this.r;
      }

      @Override
      protected void a(boolean $$0, float $$1) {
         this.r = new blo.b.a(this.u());
      }

      public static record a(dja a) {
      }
   }

   static record c(int a, int b) implements blo.f {
      @Override
      public int get(float $$0) {
         return ats.b.a($$0, this.a, this.b);
      }
   }

   @FunctionalInterface
   public interface d {
      static blo.d constant(float $$0) {
         return $$1 -> $$0;
      }

      float get(float var1);
   }

   @FunctionalInterface
   public interface e<T> {
      static <T> blo.e<T> constant(T $$0) {
         return $$1 -> $$0;
      }

      T get(float var1);
   }

   @FunctionalInterface
   public interface f {
      static blo.f constant(int $$0) {
         return $$1 -> $$0;
      }

      int get(float var1);
   }

   public static class g extends blo {
      private static final String p = "item";
      private static final String q = "item_display";
      private static final agj<cmr> r = agm.a(blo.g.class, agl.h);
      private static final agj<Byte> s = agm.a(blo.g.class, agl.a);
      private final bmx t = new bmx() {
         @Override
         public cmr a() {
            return g.this.u();
         }

         @Override
         public boolean a(cmr $$0) {
            g.this.a($$0);
            return true;
         }
      };
      @Nullable
      private blo.g.a u;

      public g(blt<?> $$0, cti $$1) {
         super($$0, $$1);
      }

      @Override
      protected void c_() {
         super.c_();
         this.an.a(r, cmr.f);
         this.an.a(s, cmo.a.a());
      }

      @Override
      public void a(agj<?> $$0) {
         super.a($$0);
         if (r.equals($$0) || s.equals($$0)) {
            this.o = true;
         }
      }

      cmr u() {
         return this.an.b(r);
      }

      void a(cmr $$0) {
         this.an.b(r, $$0);
      }

      private void a(cmo $$0) {
         this.an.b(s, $$0.a());
      }

      private cmo w() {
         return cmo.k.apply(this.an.b(s));
      }

      @Override
      protected void a(sl $$0) {
         super.a($$0);
         this.a(cmr.a($$0.p("item")));
         if ($$0.b("item_display", 8)) {
            cmo.j.decode(sz.a, $$0.c("item_display")).resultOrPartial(ac.a("Display entity", blo.p::error)).ifPresent($$0x -> this.a((cmo)$$0x.getFirst()));
         }
      }

      @Override
      protected void b(sl $$0) {
         super.b($$0);
         $$0.a("item", this.u().b(new sl()));
         cmo.j.encodeStart(sz.a, this.w()).result().ifPresent($$1 -> $$0.a("item_display", $$1));
      }

      @Override
      public bmx a_(int $$0) {
         return $$0 == 0 ? this.t : bmx.b;
      }

      @Nullable
      public blo.g.a s() {
         return this.u;
      }

      @Override
      protected void a(boolean $$0, float $$1) {
         cmr $$2 = this.u();
         $$2.a(this);
         this.u = new blo.g.a($$2, this.w());
      }

      public static record a(cmr a, cmo b) {
      }
   }

   static record h(float a, float b) implements blo.d {
      @Override
      public float get(float $$0) {
         return aui.i($$0, this.a, this.b);
      }
   }

   static record i(int a, int b) implements blo.f {
      @Override
      public int get(float $$0) {
         return aui.a($$0, this.a, this.b);
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

      void a(blp $$0) {
         $$0.a_(this.b, this.c, this.d);
         $$0.a((float)this.e, (float)this.f);
      }

      void b(blp $$0) {
         $$0.a(this.a, this.b, this.c, this.d, this.e, this.f);
      }
   }

   public static record k(blo.e<j> a, blo.a b, int c, blo.d d, blo.d e, int f) {
   }

   public static class l extends blo {
      public static final String p = "text";
      private static final String aE = "line_width";
      private static final String aF = "text_opacity";
      private static final String aG = "background";
      private static final String aH = "shadow";
      private static final String aI = "see_through";
      private static final String aJ = "default_background";
      private static final String aK = "alignment";
      public static final byte q = 1;
      public static final byte r = 2;
      public static final byte s = 4;
      public static final byte t = 8;
      public static final byte u = 16;
      private static final byte aL = -1;
      public static final int v = 1073741824;
      private static final agj<vd> aM = agm.a(blo.l.class, agl.f);
      private static final agj<Integer> aN = agm.a(blo.l.class, agl.b);
      private static final agj<Integer> aO = agm.a(blo.l.class, agl.b);
      private static final agj<Byte> aP = agm.a(blo.l.class, agl.a);
      private static final agj<Byte> aQ = agm.a(blo.l.class, agl.a);
      private static final IntSet aR = IntSet.of(new int[]{aM.a(), aN.a(), aO.a(), aP.a(), aQ.a()});
      @Nullable
      private blo.l.b aS;
      @Nullable
      private blo.l.e aT;

      public l(blt<?> $$0, cti $$1) {
         super($$0, $$1);
      }

      @Override
      protected void c_() {
         super.c_();
         this.an.a(aM, vd.i());
         this.an.a(aN, 200);
         this.an.a(aO, 1073741824);
         this.an.a(aP, (byte)-1);
         this.an.a(aQ, (byte)0);
      }

      @Override
      public void a(agj<?> $$0) {
         super.a($$0);
         if (aR.contains($$0.a())) {
            this.o = true;
         }
      }

      private vd u() {
         return this.an.b(aM);
      }

      private void c(vd $$0) {
         this.an.b(aM, $$0);
      }

      private int w() {
         return this.an.b(aN);
      }

      private void b(int $$0) {
         this.an.b(aN, $$0);
      }

      private byte x() {
         return this.an.b(aP);
      }

      private void c(byte $$0) {
         this.an.b(aP, $$0);
      }

      private int y() {
         return this.an.b(aO);
      }

      private void c(int $$0) {
         this.an.b(aO, $$0);
      }

      private byte z() {
         return this.an.b(aQ);
      }

      private void d(byte $$0) {
         this.an.b(aQ, $$0);
      }

      private static byte a(byte $$0, sl $$1, String $$2, byte $$3) {
         return $$1.q($$2) ? (byte)($$0 | $$3) : $$0;
      }

      @Override
      protected void a(sl $$0) {
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
         Optional<blo.l.a> $$2 = blo.l.a.d.decode(sz.a, $$0.c("alignment")).resultOrPartial(ac.a("Display entity", blo.p::error)).map(Pair::getFirst);
         if ($$2.isPresent()) {
            $$1 = switch ((blo.l.a)$$2.get()) {
               case a -> $$1;
               case b -> (byte)($$1 | 8);
               case c -> (byte)($$1 | 16);
            };
         }

         this.d($$1);
         if ($$0.b("text", 8)) {
            String $$3 = $$0.l("text");

            try {
               vd $$4 = vd.a.a($$3);
               if ($$4 != null) {
                  ds $$5 = this.dd().a(2);
                  vd $$6 = vg.a($$5, $$4, this, 0);
                  this.c($$6);
               } else {
                  this.c(vd.i());
               }
            } catch (Exception var8) {
               blo.p.warn("Failed to parse display entity text {}", $$3, var8);
            }
         }
      }

      private static void b(byte $$0, sl $$1, String $$2, byte $$3) {
         $$1.a($$2, ($$0 & $$3) != 0);
      }

      @Override
      protected void b(sl $$0) {
         super.b($$0);
         $$0.a("text", vd.a.a(this.u()));
         $$0.a("line_width", this.w());
         $$0.a("background", this.y());
         $$0.a("text_opacity", this.x());
         byte $$1 = this.z();
         b($$1, $$0, "shadow", (byte)1);
         b($$1, $$0, "see_through", (byte)2);
         b($$1, $$0, "default_background", (byte)4);
         blo.l.a.d.encodeStart(sz.a, a($$1)).result().ifPresent($$1x -> $$0.a("alignment", $$1x));
      }

      @Override
      protected void a(boolean $$0, float $$1) {
         if ($$0 && this.aT != null) {
            this.aT = this.a(this.aT, $$1);
         } else {
            this.aT = this.A();
         }

         this.aS = null;
      }

      @Nullable
      public blo.l.e s() {
         return this.aT;
      }

      private blo.l.e A() {
         return new blo.l.e(this.u(), this.w(), blo.f.constant(this.x()), blo.f.constant(this.y()), this.z());
      }

      private blo.l.e a(blo.l.e $$0, float $$1) {
         int $$2 = $$0.d.get($$1);
         int $$3 = $$0.c.get($$1);
         return new blo.l.e(this.u(), this.w(), new blo.i($$3, this.x()), new blo.c($$2, this.y()), this.z());
      }

      public blo.l.b a(blo.l.d $$0) {
         if (this.aS == null) {
            if (this.aT != null) {
               this.aS = $$0.split(this.aT.a(), this.aT.b());
            } else {
               this.aS = new blo.l.b(List.of(), 0);
            }
         }

         return this.aS;
      }

      public static blo.l.a a(byte $$0) {
         if (($$0 & 8) != 0) {
            return blo.l.a.b;
         } else {
            return ($$0 & 16) != 0 ? blo.l.a.c : blo.l.a.a;
         }
      }

      public static enum a implements ave {
         a("center"),
         b("left"),
         c("right");

         public static final Codec<blo.l.a> d = ave.a(blo.l.a::values);
         private final String e;

         private a(String $$0) {
            this.e = $$0;
         }

         @Override
         public String c() {
            return this.e;
         }
      }

      public static record b(List<blo.l.c> a, int b) {
      }

      public static record c(atu a, int b) {
      }

      @FunctionalInterface
      public interface d {
         blo.l.b split(vd var1, int var2);
      }

      public static record e(vd a, int b, blo.f c, blo.f d, byte e) {
      }
   }

   static record m(j a, j b) implements blo.e<j> {
      public j a(float $$0) {
         return (double)$$0 >= 1.0 ? this.b : this.a.a(this.b, $$0);
      }
   }
}
