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

public abstract class bih extends bii {
   static final Logger p = LogUtils.getLogger();
   public static final int b = -1;
   private static final adz<Integer> q = aec.a(bih.class, aeb.b);
   private static final adz<Integer> r = aec.a(bih.class, aeb.b);
   private static final adz<Integer> s = aec.a(bih.class, aeb.b);
   private static final adz<Vector3f> t = aec.a(bih.class, aeb.A);
   private static final adz<Vector3f> u = aec.a(bih.class, aeb.A);
   private static final adz<Quaternionf> v = aec.a(bih.class, aeb.B);
   private static final adz<Quaternionf> aE = aec.a(bih.class, aeb.B);
   private static final adz<Byte> aF = aec.a(bih.class, aeb.a);
   private static final adz<Integer> aG = aec.a(bih.class, aeb.b);
   private static final adz<Float> aH = aec.a(bih.class, aeb.d);
   private static final adz<Float> aI = aec.a(bih.class, aeb.d);
   private static final adz<Float> aJ = aec.a(bih.class, aeb.d);
   private static final adz<Float> aK = aec.a(bih.class, aeb.d);
   private static final adz<Float> aL = aec.a(bih.class, aeb.d);
   private static final adz<Integer> aM = aec.a(bih.class, aeb.b);
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
   private egy aU;
   protected boolean o;
   private boolean aV;
   private boolean aW;
   @Nullable
   private bih.k aX;
   @Nullable
   private bih.j aY;

   public bih(bim<?> $$0, cpl $$1) {
      super($$0, $$1);
      this.af = true;
      this.at = true;
      this.aU = this.cG();
   }

   @Override
   public void a(adz<?> $$0) {
      super.a($$0);
      if (aL.equals($$0) || aK.equals($$0)) {
         this.A();
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

   private static j a(aec $$0) {
      Vector3f $$1 = $$0.b(t);
      Quaternionf $$2 = $$0.b(v);
      Vector3f $$3 = $$0.b(u);
      Quaternionf $$4 = $$0.b(aE);
      return new j($$1, $$2, $$3, $$4);
   }

   @Override
   public void l() {
      bii $$0 = this.cY();
      if ($$0 != null && $$0.dF()) {
         this.aa();
      }

      if (this.dK().B) {
         if (this.aV) {
            this.aV = false;
            int $$1 = this.o();
            this.aR = (long)(this.ah + $$1);
         }

         if (this.aW) {
            this.aW = false;
            this.aS = this.m();
         }

         if (this.o) {
            this.o = false;
            boolean $$2 = this.aS != 0;
            if ($$2 && this.aX != null) {
               this.aX = this.a(this.aX, this.aT);
            } else {
               this.aX = this.B();
            }

            this.a($$2, this.aT);
         }

         if (this.aY != null) {
            if (this.aY.a == 0) {
               this.aY.a(this);
               this.bn();
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
   protected void a_() {
      this.an.a(s, 0);
      this.an.a(q, 0);
      this.an.a(r, 0);
      this.an.a(t, new Vector3f());
      this.an.a(u, new Vector3f(1.0F, 1.0F, 1.0F));
      this.an.a(aE, new Quaternionf());
      this.an.a(v, new Quaternionf());
      this.an.a(aF, bih.a.a.a());
      this.an.a(aG, -1);
      this.an.a(aH, 1.0F);
      this.an.a(aI, 0.0F);
      this.an.a(aJ, 1.0F);
      this.an.a(aK, 0.0F);
      this.an.a(aL, 0.0F);
      this.an.a(aM, -1);
   }

   @Override
   protected void a(qr $$0) {
      if ($$0.e("transformation")) {
         j.b.decode(rc.a, $$0.c("transformation")).resultOrPartial(ac.a("Display entity", p::error)).ifPresent($$0x -> this.a((j)$$0x.getFirst()));
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
         this.d(arp.a($$3, 0, 59));
      }

      if ($$0.b("billboard", 8)) {
         bih.a.e.decode(rc.a, $$0.c("billboard")).resultOrPartial(ac.a("Display entity", p::error)).ifPresent($$0x -> this.a((bih.a)$$0x.getFirst()));
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
         aqj.b.decode(rc.a, $$0.c("brightness")).resultOrPartial(ac.a("Display entity", p::error)).ifPresent($$0x -> this.a((aqj)$$0x.getFirst()));
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
   protected void b(qr $$0) {
      j.b.encodeStart(rc.a, a(this.an)).result().ifPresent($$1x -> $$0.a("transformation", $$1x));
      bih.a.e.encodeStart(rc.a, this.q()).result().ifPresent($$1x -> $$0.a("billboard", $$1x));
      $$0.a("interpolation_duration", this.m());
      $$0.a("teleport_duration", this.p());
      $$0.a("view_range", this.t());
      $$0.a("shadow_radius", this.v());
      $$0.a("shadow_strength", this.w());
      $$0.a("width", this.x());
      $$0.a("height", this.z());
      $$0.a("glow_color_override", this.y());
      aqj $$1 = this.r();
      if ($$1 != null) {
         aqj.b.encodeStart(rc.a, $$1).result().ifPresent($$1x -> $$0.a("brightness", $$1x));
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      int $$6 = this.p();
      this.aY = new bih.j($$6, $$0, $$1, $$2, (double)$$3, (double)$$4);
   }

   @Override
   public egy k_() {
      return this.aU;
   }

   @Override
   public eah l_() {
      return eah.d;
   }

   @Override
   public boolean d_() {
      return true;
   }

   @Nullable
   public bih.k j() {
      return this.aX;
   }

   private void b(int $$0) {
      this.an.b(r, $$0);
   }

   private int m() {
      return this.an.b(r);
   }

   private void c(int $$0) {
      this.an.a(q, $$0, true);
   }

   private int o() {
      return this.an.b(q);
   }

   private void d(int $$0) {
      this.an.b(s, $$0);
   }

   private int p() {
      return this.an.b(s);
   }

   private void a(bih.a $$0) {
      this.an.b(aF, $$0.a());
   }

   private bih.a q() {
      return bih.a.f.apply(this.an.b(aF));
   }

   private void a(@Nullable aqj $$0) {
      this.an.b(aG, $$0 != null ? $$0.a() : -1);
   }

   @Nullable
   private aqj r() {
      int $$0 = this.an.b(aG);
      return $$0 != -1 ? aqj.a($$0) : null;
   }

   private int s() {
      return this.an.b(aG);
   }

   private void b(float $$0) {
      this.an.b(aH, $$0);
   }

   private float t() {
      return this.an.b(aH);
   }

   private void c(float $$0) {
      this.an.b(aI, $$0);
   }

   private float v() {
      return this.an.b(aI);
   }

   private void u(float $$0) {
      this.an.b(aJ, $$0);
   }

   private float w() {
      return this.an.b(aJ);
   }

   private void v(float $$0) {
      this.an.b(aK, $$0);
   }

   private float x() {
      return this.an.b(aK);
   }

   private void w(float $$0) {
      this.an.b(aL, $$0);
   }

   private int y() {
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
         float $$4 = arp.a(arp.g($$3, 0.0F, (float)$$1), 0.0F, 1.0F);
         this.aT = $$4;
         return $$4;
      }
   }

   private float z() {
      return this.an.b(aL);
   }

   @Override
   public void e(double $$0, double $$1, double $$2) {
      super.e($$0, $$1, $$2);
      this.A();
   }

   private void A() {
      float $$0 = this.x();
      float $$1 = this.z();
      if ($$0 != 0.0F && $$1 != 0.0F) {
         this.at = false;
         float $$2 = $$0 / 2.0F;
         double $$3 = this.dp();
         double $$4 = this.dr();
         double $$5 = this.dv();
         this.aU = new egy($$3 - (double)$$2, $$4, $$5 - (double)$$2, $$3 + (double)$$2, $$4 + (double)$$1, $$5 + (double)$$2);
      } else {
         this.at = true;
      }
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < arp.k((double)this.t() * 64.0 * cz());
   }

   @Override
   public int c_() {
      int $$0 = this.y();
      return $$0 != -1 ? $$0 : super.c_();
   }

   private bih.k B() {
      return new bih.k(bih.e.constant(a(this.an)), this.q(), this.s(), bih.d.constant(this.v()), bih.d.constant(this.w()), this.y());
   }

   private bih.k a(bih.k $$0, float $$1) {
      j $$2 = $$0.a.get($$1);
      float $$3 = $$0.d.get($$1);
      float $$4 = $$0.e.get($$1);
      return new bih.k(new bih.m($$2, a(this.an)), this.q(), this.s(), new bih.h($$3, this.v()), new bih.h($$4, this.w()), this.y());
   }

   public static enum a implements ash {
      a((byte)0, "fixed"),
      b((byte)1, "vertical"),
      c((byte)2, "horizontal"),
      d((byte)3, "center");

      public static final Codec<bih.a> e = ash.a(bih.a::values);
      public static final IntFunction<bih.a> f = aqk.a(bih.a::a, values(), aqk.a.a);
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

   public static class b extends bih {
      public static final String p = "block_state";
      private static final adz<dez> q = aec.a(bih.b.class, aeb.i);
      @Nullable
      private bih.b.a r;

      public b(bim<?> $$0, cpl $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a_() {
         super.a_();
         this.an.a(q, csm.a.n());
      }

      @Override
      public void a(adz<?> $$0) {
         super.a($$0);
         if ($$0.equals(q)) {
            this.o = true;
         }
      }

      private dez o() {
         return this.an.b(q);
      }

      private void c(dez $$0) {
         this.an.b(q, $$0);
      }

      @Override
      protected void a(qr $$0) {
         super.a($$0);
         this.c(rd.a(this.dK().a(jc.e), $$0.p("block_state")));
      }

      @Override
      protected void b(qr $$0) {
         super.b($$0);
         $$0.a("block_state", rd.a(this.o()));
      }

      @Nullable
      public bih.b.a m() {
         return this.r;
      }

      @Override
      protected void a(boolean $$0, float $$1) {
         this.r = new bih.b.a(this.o());
      }

      public static record a(dez a) {
      }
   }

   static record c(int a, int b) implements bih.f {
      @Override
      public int get(float $$0) {
         return ara.b.a($$0, this.a, this.b);
      }
   }

   @FunctionalInterface
   public interface d {
      static bih.d constant(float $$0) {
         return $$1 -> $$0;
      }

      float get(float var1);
   }

   @FunctionalInterface
   public interface e<T> {
      static <T> bih.e<T> constant(T $$0) {
         return $$1 -> $$0;
      }

      T get(float var1);
   }

   @FunctionalInterface
   public interface f {
      static bih.f constant(int $$0) {
         return $$1 -> $$0;
      }

      int get(float var1);
   }

   public static class g extends bih {
      private static final String p = "item";
      private static final String q = "item_display";
      private static final adz<cix> r = aec.a(bih.g.class, aeb.h);
      private static final adz<Byte> s = aec.a(bih.g.class, aeb.a);
      private final bjq t = new bjq() {
         @Override
         public cix a() {
            return g.this.o();
         }

         @Override
         public boolean a(cix $$0) {
            g.this.a($$0);
            return true;
         }
      };
      @Nullable
      private bih.g.a u;

      public g(bim<?> $$0, cpl $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a_() {
         super.a_();
         this.an.a(r, cix.b);
         this.an.a(s, ciu.a.a());
      }

      @Override
      public void a(adz<?> $$0) {
         super.a($$0);
         if (r.equals($$0) || s.equals($$0)) {
            this.o = true;
         }
      }

      cix o() {
         return this.an.b(r);
      }

      void a(cix $$0) {
         this.an.b(r, $$0);
      }

      private void a(ciu $$0) {
         this.an.b(s, $$0.a());
      }

      private ciu p() {
         return ciu.k.apply(this.an.b(s));
      }

      @Override
      protected void a(qr $$0) {
         super.a($$0);
         this.a(cix.a($$0.p("item")));
         if ($$0.b("item_display", 8)) {
            ciu.j.decode(rc.a, $$0.c("item_display")).resultOrPartial(ac.a("Display entity", bih.p::error)).ifPresent($$0x -> this.a((ciu)$$0x.getFirst()));
         }
      }

      @Override
      protected void b(qr $$0) {
         super.b($$0);
         $$0.a("item", this.o().b(new qr()));
         ciu.j.encodeStart(rc.a, this.p()).result().ifPresent($$1 -> $$0.a("item_display", $$1));
      }

      @Override
      public bjq a_(int $$0) {
         return $$0 == 0 ? this.t : bjq.b;
      }

      @Nullable
      public bih.g.a m() {
         return this.u;
      }

      @Override
      protected void a(boolean $$0, float $$1) {
         this.u = new bih.g.a(this.o(), this.p());
      }

      public static record a(cix a, ciu b) {
      }
   }

   static record h(float a, float b) implements bih.d {
      @Override
      public float get(float $$0) {
         return arp.i($$0, this.a, this.b);
      }
   }

   static record i(int a, int b) implements bih.f {
      @Override
      public int get(float $$0) {
         return arp.a($$0, this.a, this.b);
      }
   }

   static class j {
      int a;
      private final double b;
      private final double c;
      private final double d;
      private final double e;
      private final double f;

      j(int $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
         this.f = $$5;
      }

      void a(bii $$0) {
         $$0.e(this.b, this.c, this.d);
         $$0.a((float)this.e, (float)this.f);
      }

      void b(bii $$0) {
         $$0.a(this.a, this.b, this.c, this.d, this.e, this.f);
      }
   }

   public static record k(bih.e<j> a, bih.a b, int c, bih.d d, bih.d e, int f) {
   }

   public static class l extends bih {
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
      private static final adz<tf> aM = aec.a(bih.l.class, aeb.f);
      private static final adz<Integer> aN = aec.a(bih.l.class, aeb.b);
      private static final adz<Integer> aO = aec.a(bih.l.class, aeb.b);
      private static final adz<Byte> aP = aec.a(bih.l.class, aeb.a);
      private static final adz<Byte> aQ = aec.a(bih.l.class, aeb.a);
      private static final IntSet aR = IntSet.of(new int[]{aM.a(), aN.a(), aO.a(), aP.a(), aQ.a()});
      @Nullable
      private bih.l.b aS;
      @Nullable
      private bih.l.e aT;

      public l(bim<?> $$0, cpl $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a_() {
         super.a_();
         this.an.a(aM, tf.h());
         this.an.a(aN, 200);
         this.an.a(aO, 1073741824);
         this.an.a(aP, (byte)-1);
         this.an.a(aQ, (byte)0);
      }

      @Override
      public void a(adz<?> $$0) {
         super.a($$0);
         if (aR.contains($$0.a())) {
            this.o = true;
         }
      }

      private tf o() {
         return this.an.b(aM);
      }

      private void c(tf $$0) {
         this.an.b(aM, $$0);
      }

      private int p() {
         return this.an.b(aN);
      }

      private void b(int $$0) {
         this.an.b(aN, $$0);
      }

      private byte q() {
         return this.an.b(aP);
      }

      private void c(byte $$0) {
         this.an.b(aP, $$0);
      }

      private int r() {
         return this.an.b(aO);
      }

      private void c(int $$0) {
         this.an.b(aO, $$0);
      }

      private byte s() {
         return this.an.b(aQ);
      }

      private void d(byte $$0) {
         this.an.b(aQ, $$0);
      }

      private static byte a(byte $$0, qr $$1, String $$2, byte $$3) {
         return $$1.q($$2) ? (byte)($$0 | $$3) : $$0;
      }

      @Override
      protected void a(qr $$0) {
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
         Optional<bih.l.a> $$2 = bih.l.a.d.decode(rc.a, $$0.c("alignment")).resultOrPartial(ac.a("Display entity", bih.p::error)).map(Pair::getFirst);
         if ($$2.isPresent()) {
            $$1 = switch ((bih.l.a)$$2.get()) {
               case a -> $$1;
               case b -> (byte)($$1 | 8);
               case c -> (byte)($$1 | 16);
            };
         }

         this.d($$1);
         if ($$0.b("text", 8)) {
            String $$3 = $$0.l("text");

            try {
               tf $$4 = tf.a.a($$3);
               if ($$4 != null) {
                  dr $$5 = this.dc().a(2);
                  tf $$6 = th.a($$5, $$4, this, 0);
                  this.c($$6);
               } else {
                  this.c(tf.h());
               }
            } catch (Exception var8) {
               bih.p.warn("Failed to parse display entity text {}", $$3, var8);
            }
         }
      }

      private static void b(byte $$0, qr $$1, String $$2, byte $$3) {
         $$1.a($$2, ($$0 & $$3) != 0);
      }

      @Override
      protected void b(qr $$0) {
         super.b($$0);
         $$0.a("text", tf.a.a(this.o()));
         $$0.a("line_width", this.p());
         $$0.a("background", this.r());
         $$0.a("text_opacity", this.q());
         byte $$1 = this.s();
         b($$1, $$0, "shadow", (byte)1);
         b($$1, $$0, "see_through", (byte)2);
         b($$1, $$0, "default_background", (byte)4);
         bih.l.a.d.encodeStart(rc.a, a($$1)).result().ifPresent($$1x -> $$0.a("alignment", $$1x));
      }

      @Override
      protected void a(boolean $$0, float $$1) {
         if ($$0 && this.aT != null) {
            this.aT = this.a(this.aT, $$1);
         } else {
            this.aT = this.t();
         }

         this.aS = null;
      }

      @Nullable
      public bih.l.e m() {
         return this.aT;
      }

      private bih.l.e t() {
         return new bih.l.e(this.o(), this.p(), bih.f.constant(this.q()), bih.f.constant(this.r()), this.s());
      }

      private bih.l.e a(bih.l.e $$0, float $$1) {
         int $$2 = $$0.d.get($$1);
         int $$3 = $$0.c.get($$1);
         return new bih.l.e(this.o(), this.p(), new bih.i($$3, this.q()), new bih.c($$2, this.r()), this.s());
      }

      public bih.l.b a(bih.l.d $$0) {
         if (this.aS == null) {
            if (this.aT != null) {
               this.aS = $$0.split(this.aT.a(), this.aT.b());
            } else {
               this.aS = new bih.l.b(List.of(), 0);
            }
         }

         return this.aS;
      }

      public static bih.l.a a(byte $$0) {
         if (($$0 & 8) != 0) {
            return bih.l.a.b;
         } else {
            return ($$0 & 16) != 0 ? bih.l.a.c : bih.l.a.a;
         }
      }

      public static enum a implements ash {
         a("center"),
         b("left"),
         c("right");

         public static final Codec<bih.l.a> d = ash.a(bih.l.a::values);
         private final String e;

         private a(String $$0) {
            this.e = $$0;
         }

         @Override
         public String c() {
            return this.e;
         }
      }

      public static record b(List<bih.l.c> a, int b) {
      }

      public static record c(arc a, int b) {
      }

      @FunctionalInterface
      public interface d {
         bih.l.b split(tf var1, int var2);
      }

      public static record e(tf a, int b, bih.f c, bih.f d, byte e) {
      }
   }

   static record m(j a, j b) implements bih.e<j> {
      public j a(float $$0) {
         return (double)$$0 >= 1.0 ? this.b : this.a.a(this.b, $$0);
      }
   }
}
