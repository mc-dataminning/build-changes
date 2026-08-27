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

public abstract class bku extends bkv {
   static final Logger p = LogUtils.getLogger();
   public static final int b = -1;
   private static final afs<Integer> q = afv.a(bku.class, afu.b);
   private static final afs<Integer> r = afv.a(bku.class, afu.b);
   private static final afs<Integer> s = afv.a(bku.class, afu.b);
   private static final afs<Vector3f> t = afv.a(bku.class, afu.A);
   private static final afs<Vector3f> u = afv.a(bku.class, afu.A);
   private static final afs<Quaternionf> v = afv.a(bku.class, afu.B);
   private static final afs<Quaternionf> aE = afv.a(bku.class, afu.B);
   private static final afs<Byte> aF = afv.a(bku.class, afu.a);
   private static final afs<Integer> aG = afv.a(bku.class, afu.b);
   private static final afs<Float> aH = afv.a(bku.class, afu.d);
   private static final afs<Float> aI = afv.a(bku.class, afu.d);
   private static final afs<Float> aJ = afv.a(bku.class, afu.d);
   private static final afs<Float> aK = afv.a(bku.class, afu.d);
   private static final afs<Float> aL = afv.a(bku.class, afu.d);
   private static final afs<Integer> aM = afv.a(bku.class, afu.b);
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
   private eju aU;
   protected boolean o;
   private boolean aV;
   private boolean aW;
   @Nullable
   private bku.k aX;
   @Nullable
   private bku.j aY;

   public bku(bkz<?> $$0, csf $$1) {
      super($$0, $$1);
      this.af = true;
      this.at = true;
      this.aU = this.cH();
   }

   @Override
   public void a(afs<?> $$0) {
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

   private static j a(afv $$0) {
      Vector3f $$1 = $$0.b(t);
      Quaternionf $$2 = $$0.b(v);
      Vector3f $$3 = $$0.b(u);
      Quaternionf $$4 = $$0.b(aE);
      return new j($$1, $$2, $$3, $$4);
   }

   @Override
   public void l() {
      bkv $$0 = this.da();
      if ($$0 != null && $$0.dI()) {
         this.ac();
      }

      if (this.dN().B) {
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
      this.an.a(aF, bku.a.a.a());
      this.an.a(aG, -1);
      this.an.a(aH, 1.0F);
      this.an.a(aI, 0.0F);
      this.an.a(aJ, 1.0F);
      this.an.a(aK, 0.0F);
      this.an.a(aL, 0.0F);
      this.an.a(aM, -1);
   }

   @Override
   protected void a(sd $$0) {
      if ($$0.e("transformation")) {
         j.b.decode(sr.a, $$0.c("transformation")).resultOrPartial(ac.a("Display entity", p::error)).ifPresent($$0x -> this.a((j)$$0x.getFirst()));
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
         this.d(atq.a($$3, 0, 59));
      }

      if ($$0.b("billboard", 8)) {
         bku.a.e.decode(sr.a, $$0.c("billboard")).resultOrPartial(ac.a("Display entity", p::error)).ifPresent($$0x -> this.a((bku.a)$$0x.getFirst()));
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
         asi.b.decode(sr.a, $$0.c("brightness")).resultOrPartial(ac.a("Display entity", p::error)).ifPresent($$0x -> this.a((asi)$$0x.getFirst()));
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
   protected void b(sd $$0) {
      j.b.encodeStart(sr.a, a(this.an)).result().ifPresent($$1x -> $$0.a("transformation", $$1x));
      bku.a.e.encodeStart(sr.a, this.x()).result().ifPresent($$1x -> $$0.a("billboard", $$1x));
      $$0.a("interpolation_duration", this.s());
      $$0.a("teleport_duration", this.w());
      $$0.a("view_range", this.A());
      $$0.a("shadow_radius", this.B());
      $$0.a("shadow_strength", this.C());
      $$0.a("width", this.D());
      $$0.a("height", this.G());
      $$0.a("glow_color_override", this.E());
      asi $$1 = this.y();
      if ($$1 != null) {
         asi.b.encodeStart(sr.a, $$1).result().ifPresent($$1x -> $$0.a("brightness", $$1x));
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      int $$6 = this.w();
      this.aY = new bku.j($$6, $$0, $$1, $$2, (double)$$3, (double)$$4);
   }

   @Override
   public double p_() {
      return this.aY != null ? this.aY.b : this.ds();
   }

   @Override
   public double N_() {
      return this.aY != null ? this.aY.c : this.du();
   }

   @Override
   public double O_() {
      return this.aY != null ? this.aY.d : this.dy();
   }

   @Override
   public float f_() {
      return this.aY != null ? (float)this.aY.f : this.dF();
   }

   @Override
   public float q_() {
      return this.aY != null ? (float)this.aY.e : this.dD();
   }

   @Override
   public eju i_() {
      return this.aU;
   }

   @Override
   public edc s_() {
      return edc.d;
   }

   @Override
   public boolean r_() {
      return true;
   }

   @Nullable
   public bku.k q() {
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

   private void a(bku.a $$0) {
      this.an.b(aF, $$0.a());
   }

   private bku.a x() {
      return bku.a.f.apply(this.an.b(aF));
   }

   private void a(@Nullable asi $$0) {
      this.an.b(aG, $$0 != null ? $$0.a() : -1);
   }

   @Nullable
   private asi y() {
      int $$0 = this.an.b(aG);
      return $$0 != -1 ? asi.a($$0) : null;
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
         float $$4 = atq.a(atq.g($$3, 0.0F, (float)$$1), 0.0F, 1.0F);
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
         double $$3 = this.ds();
         double $$4 = this.du();
         double $$5 = this.dy();
         this.aU = new eju($$3 - (double)$$2, $$4, $$5 - (double)$$2, $$3 + (double)$$2, $$4 + (double)$$1, $$5 + (double)$$2);
      } else {
         this.at = true;
      }
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < atq.k((double)this.A() * 64.0 * cA());
   }

   @Override
   public int j_() {
      int $$0 = this.E();
      return $$0 != -1 ? $$0 : super.j_();
   }

   private bku.k I() {
      return new bku.k(bku.e.constant(a(this.an)), this.x(), this.z(), bku.d.constant(this.B()), bku.d.constant(this.C()), this.E());
   }

   private bku.k a(bku.k $$0, float $$1) {
      j $$2 = $$0.a.get($$1);
      float $$3 = $$0.d.get($$1);
      float $$4 = $$0.e.get($$1);
      return new bku.k(new bku.m($$2, a(this.an)), this.x(), this.z(), new bku.h($$3, this.B()), new bku.h($$4, this.C()), this.E());
   }

   public static enum a implements auk {
      a((byte)0, "fixed"),
      b((byte)1, "vertical"),
      c((byte)2, "horizontal"),
      d((byte)3, "center");

      public static final Codec<bku.a> e = auk.a(bku.a::values);
      public static final IntFunction<bku.a> f = asj.a(bku.a::a, values(), asj.a.a);
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

   public static class b extends bku {
      public static final String p = "block_state";
      private static final afs<dhn> q = afv.a(bku.b.class, afu.i);
      @Nullable
      private bku.b.a r;

      public b(bkz<?> $$0, csf $$1) {
         super($$0, $$1);
      }

      @Override
      protected void c_() {
         super.c_();
         this.an.a(q, cvh.a.o());
      }

      @Override
      public void a(afs<?> $$0) {
         super.a($$0);
         if ($$0.equals(q)) {
            this.o = true;
         }
      }

      private dhn u() {
         return this.an.b(q);
      }

      private void c(dhn $$0) {
         this.an.b(q, $$0);
      }

      @Override
      protected void a(sd $$0) {
         super.a($$0);
         this.c(ss.a(this.dN().a(kd.e), $$0.p("block_state")));
      }

      @Override
      protected void b(sd $$0) {
         super.b($$0);
         $$0.a("block_state", ss.a(this.u()));
      }

      @Nullable
      public bku.b.a s() {
         return this.r;
      }

      @Override
      protected void a(boolean $$0, float $$1) {
         this.r = new bku.b.a(this.u());
      }

      public static record a(dhn a) {
      }
   }

   static record c(int a, int b) implements bku.f {
      @Override
      public int get(float $$0) {
         return ata.b.a($$0, this.a, this.b);
      }
   }

   @FunctionalInterface
   public interface d {
      static bku.d constant(float $$0) {
         return $$1 -> $$0;
      }

      float get(float var1);
   }

   @FunctionalInterface
   public interface e<T> {
      static <T> bku.e<T> constant(T $$0) {
         return $$1 -> $$0;
      }

      T get(float var1);
   }

   @FunctionalInterface
   public interface f {
      static bku.f constant(int $$0) {
         return $$1 -> $$0;
      }

      int get(float var1);
   }

   public static class g extends bku {
      private static final String p = "item";
      private static final String q = "item_display";
      private static final afs<clo> r = afv.a(bku.g.class, afu.h);
      private static final afs<Byte> s = afv.a(bku.g.class, afu.a);
      private final bmd t = new bmd() {
         @Override
         public clo a() {
            return g.this.u();
         }

         @Override
         public boolean a(clo $$0) {
            g.this.a($$0);
            return true;
         }
      };
      @Nullable
      private bku.g.a u;

      public g(bkz<?> $$0, csf $$1) {
         super($$0, $$1);
      }

      @Override
      protected void c_() {
         super.c_();
         this.an.a(r, clo.b);
         this.an.a(s, cll.a.a());
      }

      @Override
      public void a(afs<?> $$0) {
         super.a($$0);
         if (r.equals($$0) || s.equals($$0)) {
            this.o = true;
         }
      }

      clo u() {
         return this.an.b(r);
      }

      void a(clo $$0) {
         this.an.b(r, $$0);
      }

      private void a(cll $$0) {
         this.an.b(s, $$0.a());
      }

      private cll w() {
         return cll.k.apply(this.an.b(s));
      }

      @Override
      protected void a(sd $$0) {
         super.a($$0);
         this.a(clo.a($$0.p("item")));
         if ($$0.b("item_display", 8)) {
            cll.j.decode(sr.a, $$0.c("item_display")).resultOrPartial(ac.a("Display entity", bku.p::error)).ifPresent($$0x -> this.a((cll)$$0x.getFirst()));
         }
      }

      @Override
      protected void b(sd $$0) {
         super.b($$0);
         $$0.a("item", this.u().b(new sd()));
         cll.j.encodeStart(sr.a, this.w()).result().ifPresent($$1 -> $$0.a("item_display", $$1));
      }

      @Override
      public bmd a_(int $$0) {
         return $$0 == 0 ? this.t : bmd.b;
      }

      @Nullable
      public bku.g.a s() {
         return this.u;
      }

      @Override
      protected void a(boolean $$0, float $$1) {
         clo $$2 = this.u();
         $$2.a(this);
         this.u = new bku.g.a($$2, this.w());
      }

      public static record a(clo a, cll b) {
      }
   }

   static record h(float a, float b) implements bku.d {
      @Override
      public float get(float $$0) {
         return atq.i($$0, this.a, this.b);
      }
   }

   static record i(int a, int b) implements bku.f {
      @Override
      public int get(float $$0) {
         return atq.a($$0, this.a, this.b);
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

      void a(bkv $$0) {
         $$0.a_(this.b, this.c, this.d);
         $$0.a((float)this.e, (float)this.f);
      }

      void b(bkv $$0) {
         $$0.a(this.a, this.b, this.c, this.d, this.e, this.f);
      }
   }

   public static record k(bku.e<j> a, bku.a b, int c, bku.d d, bku.d e, int f) {
   }

   public static class l extends bku {
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
      private static final afs<uv> aM = afv.a(bku.l.class, afu.f);
      private static final afs<Integer> aN = afv.a(bku.l.class, afu.b);
      private static final afs<Integer> aO = afv.a(bku.l.class, afu.b);
      private static final afs<Byte> aP = afv.a(bku.l.class, afu.a);
      private static final afs<Byte> aQ = afv.a(bku.l.class, afu.a);
      private static final IntSet aR = IntSet.of(new int[]{aM.a(), aN.a(), aO.a(), aP.a(), aQ.a()});
      @Nullable
      private bku.l.b aS;
      @Nullable
      private bku.l.e aT;

      public l(bkz<?> $$0, csf $$1) {
         super($$0, $$1);
      }

      @Override
      protected void c_() {
         super.c_();
         this.an.a(aM, uv.i());
         this.an.a(aN, 200);
         this.an.a(aO, 1073741824);
         this.an.a(aP, (byte)-1);
         this.an.a(aQ, (byte)0);
      }

      @Override
      public void a(afs<?> $$0) {
         super.a($$0);
         if (aR.contains($$0.a())) {
            this.o = true;
         }
      }

      private uv u() {
         return this.an.b(aM);
      }

      private void c(uv $$0) {
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

      private static byte a(byte $$0, sd $$1, String $$2, byte $$3) {
         return $$1.q($$2) ? (byte)($$0 | $$3) : $$0;
      }

      @Override
      protected void a(sd $$0) {
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
         Optional<bku.l.a> $$2 = bku.l.a.d.decode(sr.a, $$0.c("alignment")).resultOrPartial(ac.a("Display entity", bku.p::error)).map(Pair::getFirst);
         if ($$2.isPresent()) {
            $$1 = switch ((bku.l.a)$$2.get()) {
               case a -> $$1;
               case b -> (byte)($$1 | 8);
               case c -> (byte)($$1 | 16);
            };
         }

         this.d($$1);
         if ($$0.b("text", 8)) {
            String $$3 = $$0.l("text");

            try {
               uv $$4 = uv.a.a($$3);
               if ($$4 != null) {
                  du $$5 = this.de().a(2);
                  uv $$6 = uy.a($$5, $$4, this, 0);
                  this.c($$6);
               } else {
                  this.c(uv.i());
               }
            } catch (Exception var8) {
               bku.p.warn("Failed to parse display entity text {}", $$3, var8);
            }
         }
      }

      private static void b(byte $$0, sd $$1, String $$2, byte $$3) {
         $$1.a($$2, ($$0 & $$3) != 0);
      }

      @Override
      protected void b(sd $$0) {
         super.b($$0);
         $$0.a("text", uv.a.a(this.u()));
         $$0.a("line_width", this.w());
         $$0.a("background", this.y());
         $$0.a("text_opacity", this.x());
         byte $$1 = this.z();
         b($$1, $$0, "shadow", (byte)1);
         b($$1, $$0, "see_through", (byte)2);
         b($$1, $$0, "default_background", (byte)4);
         bku.l.a.d.encodeStart(sr.a, a($$1)).result().ifPresent($$1x -> $$0.a("alignment", $$1x));
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
      public bku.l.e s() {
         return this.aT;
      }

      private bku.l.e A() {
         return new bku.l.e(this.u(), this.w(), bku.f.constant(this.x()), bku.f.constant(this.y()), this.z());
      }

      private bku.l.e a(bku.l.e $$0, float $$1) {
         int $$2 = $$0.d.get($$1);
         int $$3 = $$0.c.get($$1);
         return new bku.l.e(this.u(), this.w(), new bku.i($$3, this.x()), new bku.c($$2, this.y()), this.z());
      }

      public bku.l.b a(bku.l.d $$0) {
         if (this.aS == null) {
            if (this.aT != null) {
               this.aS = $$0.split(this.aT.a(), this.aT.b());
            } else {
               this.aS = new bku.l.b(List.of(), 0);
            }
         }

         return this.aS;
      }

      public static bku.l.a a(byte $$0) {
         if (($$0 & 8) != 0) {
            return bku.l.a.b;
         } else {
            return ($$0 & 16) != 0 ? bku.l.a.c : bku.l.a.a;
         }
      }

      public static enum a implements auk {
         a("center"),
         b("left"),
         c("right");

         public static final Codec<bku.l.a> d = auk.a(bku.l.a::values);
         private final String e;

         private a(String $$0) {
            this.e = $$0;
         }

         @Override
         public String c() {
            return this.e;
         }
      }

      public static record b(List<bku.l.c> a, int b) {
      }

      public static record c(atc a, int b) {
      }

      @FunctionalInterface
      public interface d {
         bku.l.b split(uv var1, int var2);
      }

      public static record e(uv a, int b, bku.f c, bku.f d, byte e) {
      }
   }

   static record m(j a, j b) implements bku.e<j> {
      public j a(float $$0) {
         return (double)$$0 >= 1.0 ? this.b : this.a.a(this.b, $$0);
      }
   }
}
