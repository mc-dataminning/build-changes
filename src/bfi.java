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

public abstract class bfi extends bfj {
   static final Logger o = LogUtils.getLogger();
   public static final int b = -1;
   private static final aby<Integer> p = acb.a(bfi.class, aca.b);
   private static final aby<Integer> q = acb.a(bfi.class, aca.b);
   private static final aby<Vector3f> r = acb.a(bfi.class, aca.A);
   private static final aby<Vector3f> s = acb.a(bfi.class, aca.A);
   private static final aby<Quaternionf> t = acb.a(bfi.class, aca.B);
   private static final aby<Quaternionf> u = acb.a(bfi.class, aca.B);
   private static final aby<Byte> aD = acb.a(bfi.class, aca.a);
   private static final aby<Integer> aE = acb.a(bfi.class, aca.b);
   private static final aby<Float> aF = acb.a(bfi.class, aca.d);
   private static final aby<Float> aG = acb.a(bfi.class, aca.d);
   private static final aby<Float> aH = acb.a(bfi.class, aca.d);
   private static final aby<Float> aI = acb.a(bfi.class, aca.d);
   private static final aby<Float> aJ = acb.a(bfi.class, aca.d);
   private static final aby<Integer> aK = acb.a(bfi.class, aca.b);
   private static final IntSet aL = IntSet.of(new int[]{r.a(), s.a(), t.a(), u.a(), aD.a(), aE.a(), aG.a(), aH.a()});
   private static final float aM = 0.0F;
   private static final float aN = 1.0F;
   private static final int aO = -1;
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
   private final Quaternionf aP = new Quaternionf();
   private long aQ = -2147483648L;
   private int aR;
   private float aS;
   private eed aT;
   protected boolean n;
   private boolean aU;
   private boolean aV;
   @Nullable
   private bfi.j aW;

   public bfi(bfn<?> $$0, cmm $$1) {
      super($$0, $$1);
      this.ae = true;
      this.as = true;
      this.aT = this.cE();
   }

   @Override
   public void a(aby<?> $$0) {
      super.a($$0);
      if (aJ.equals($$0) || aI.equals($$0)) {
         this.A();
      }

      if (p.equals($$0)) {
         this.aU = true;
      }

      if (q.equals($$0)) {
         this.aV = true;
      }

      if (aL.contains($$0.a())) {
         this.n = true;
      }
   }

   private static j a(acb $$0) {
      Vector3f $$1 = $$0.b(r);
      Quaternionf $$2 = $$0.b(t);
      Vector3f $$3 = $$0.b(s);
      Quaternionf $$4 = $$0.b(u);
      return new j($$1, $$2, $$3, $$4);
   }

   @Override
   public void l() {
      bfj $$0 = this.cW();
      if ($$0 != null && $$0.dD()) {
         this.Y();
      }

      if (this.dI().B) {
         if (this.aU) {
            this.aU = false;
            int $$1 = this.p();
            this.aQ = (long)(this.ag + $$1);
         }

         if (this.aV) {
            this.aV = false;
            this.aR = this.o();
         }

         if (this.n) {
            this.n = false;
            boolean $$2 = this.aR != 0;
            if ($$2 && this.aW != null) {
               this.aW = this.a(this.aW, this.aS);
            } else {
               this.aW = this.D();
            }

            this.a($$2, this.aS);
         }
      }
   }

   protected abstract void a(boolean var1, float var2);

   @Override
   protected void a_() {
      this.am.a(p, 0);
      this.am.a(q, 0);
      this.am.a(r, new Vector3f());
      this.am.a(s, new Vector3f(1.0F, 1.0F, 1.0F));
      this.am.a(u, new Quaternionf());
      this.am.a(t, new Quaternionf());
      this.am.a(aD, bfi.a.a.a());
      this.am.a(aE, -1);
      this.am.a(aF, 1.0F);
      this.am.a(aG, 0.0F);
      this.am.a(aH, 1.0F);
      this.am.a(aI, 0.0F);
      this.am.a(aJ, 0.0F);
      this.am.a(aK, -1);
   }

   @Override
   protected void a(qr $$0) {
      if ($$0.e("transformation")) {
         j.b.decode(rc.a, $$0.c("transformation")).resultOrPartial(ac.a("Display entity", o::error)).ifPresent($$0x -> this.a((j)$$0x.getFirst()));
      }

      if ($$0.b("interpolation_duration", 99)) {
         int $$1 = $$0.h("interpolation_duration");
         this.b($$1);
      }

      if ($$0.b("start_interpolation", 99)) {
         int $$2 = $$0.h("start_interpolation");
         this.c($$2);
      }

      if ($$0.b("billboard", 8)) {
         bfi.a.e.decode(rc.a, $$0.c("billboard")).resultOrPartial(ac.a("Display entity", o::error)).ifPresent($$0x -> this.a((bfi.a)$$0x.getFirst()));
      }

      if ($$0.b("view_range", 99)) {
         this.s($$0.j("view_range"));
      }

      if ($$0.b("shadow_radius", 99)) {
         this.t($$0.j("shadow_radius"));
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
         this.d($$0.h("glow_color_override"));
      }

      if ($$0.b("brightness", 10)) {
         ant.b.decode(rc.a, $$0.c("brightness")).resultOrPartial(ac.a("Display entity", o::error)).ifPresent($$0x -> this.a((ant)$$0x.getFirst()));
      } else {
         this.a(null);
      }
   }

   private void a(j $$0) {
      this.am.b(r, $$0.d());
      this.am.b(t, $$0.e());
      this.am.b(s, $$0.f());
      this.am.b(u, $$0.g());
   }

   @Override
   protected void b(qr $$0) {
      j.b.encodeStart(rc.a, a(this.am)).result().ifPresent($$1x -> $$0.a("transformation", $$1x));
      bfi.a.e.encodeStart(rc.a, this.q()).result().ifPresent($$1x -> $$0.a("billboard", $$1x));
      $$0.a("interpolation_duration", this.o());
      $$0.a("view_range", this.t());
      $$0.a("shadow_radius", this.v());
      $$0.a("shadow_strength", this.w());
      $$0.a("width", this.x());
      $$0.a("height", this.z());
      $$0.a("glow_color_override", this.y());
      ant $$1 = this.r();
      if ($$1 != null) {
         ant.b.encodeStart(rc.a, $$1).result().ifPresent($$1x -> $$0.a("brightness", $$1x));
      }
   }

   @Override
   public uo<ur> S() {
      return new us(this);
   }

   @Override
   public eed j_() {
      return this.aT;
   }

   @Override
   public dxj l_() {
      return dxj.d;
   }

   @Override
   public boolean c_() {
      return true;
   }

   public Quaternionf j() {
      return this.aP;
   }

   @Nullable
   public bfi.j k() {
      return this.aW;
   }

   private void b(int $$0) {
      this.am.b(q, $$0);
   }

   private int o() {
      return this.am.b(q);
   }

   private void c(int $$0) {
      this.am.a(p, $$0, true);
   }

   private int p() {
      return this.am.b(p);
   }

   private void a(bfi.a $$0) {
      this.am.b(aD, $$0.a());
   }

   private bfi.a q() {
      return bfi.a.f.apply(this.am.b(aD));
   }

   private void a(@Nullable ant $$0) {
      this.am.b(aE, $$0 != null ? $$0.a() : -1);
   }

   @Nullable
   private ant r() {
      int $$0 = this.am.b(aE);
      return $$0 != -1 ? ant.a($$0) : null;
   }

   private int s() {
      return this.am.b(aE);
   }

   private void s(float $$0) {
      this.am.b(aF, $$0);
   }

   private float t() {
      return this.am.b(aF);
   }

   private void t(float $$0) {
      this.am.b(aG, $$0);
   }

   private float v() {
      return this.am.b(aG);
   }

   private void u(float $$0) {
      this.am.b(aH, $$0);
   }

   private float w() {
      return this.am.b(aH);
   }

   private void v(float $$0) {
      this.am.b(aI, $$0);
   }

   private float x() {
      return this.am.b(aI);
   }

   private void w(float $$0) {
      this.am.b(aJ, $$0);
   }

   private int y() {
      return this.am.b(aK);
   }

   private void d(int $$0) {
      this.am.b(aK, $$0);
   }

   public float a(float $$0) {
      int $$1 = this.aR;
      if ($$1 <= 0) {
         return 1.0F;
      } else {
         float $$2 = (float)((long)this.ag - this.aQ);
         float $$3 = $$2 + $$0;
         float $$4 = apa.a(apa.g($$3, 0.0F, (float)$$1), 0.0F, 1.0F);
         this.aS = $$4;
         return $$4;
      }
   }

   private float z() {
      return this.am.b(aJ);
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
         this.as = false;
         float $$2 = $$0 / 2.0F;
         double $$3 = this.dn();
         double $$4 = this.dp();
         double $$5 = this.dt();
         this.aT = new eed($$3 - (double)$$2, $$4, $$5 - (double)$$2, $$3 + (double)$$2, $$4 + (double)$$1, $$5 + (double)$$2);
      } else {
         this.as = true;
      }
   }

   @Override
   public void b_(float $$0) {
      super.b_($$0);
      this.C();
   }

   @Override
   public void a_(float $$0) {
      super.a_($$0);
      this.C();
   }

   private void C() {
      this.aP.rotationYXZ((float) (-Math.PI / 180.0) * this.dy(), (float) (Math.PI / 180.0) * this.dA(), 0.0F);
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < apa.k((double)this.t() * 64.0 * cx());
   }

   @Override
   public int k_() {
      int $$0 = this.y();
      return $$0 != -1 ? $$0 : super.k_();
   }

   private bfi.j D() {
      return new bfi.j(bfi.e.constant(a(this.am)), this.q(), this.s(), bfi.d.constant(this.v()), bfi.d.constant(this.w()), this.y());
   }

   private bfi.j a(bfi.j $$0, float $$1) {
      j $$2 = $$0.a.get($$1);
      float $$3 = $$0.d.get($$1);
      float $$4 = $$0.e.get($$1);
      return new bfi.j(new bfi.l($$2, a(this.am)), this.q(), this.s(), new bfi.h($$3, this.v()), new bfi.h($$4, this.w()), this.y());
   }

   public static enum a implements apr {
      a((byte)0, "fixed"),
      b((byte)1, "vertical"),
      c((byte)2, "horizontal"),
      d((byte)3, "center");

      public static final Codec<bfi.a> e = apr.a(bfi.a::values);
      public static final IntFunction<bfi.a> f = anu.a(bfi.a::a, values(), anu.a.a);
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

   public static class b extends bfi {
      public static final String o = "block_state";
      private static final aby<dcb> p = acb.a(bfi.b.class, aca.i);
      @Nullable
      private bfi.b.a q;

      public b(bfn<?> $$0, cmm $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a_() {
         super.a_();
         this.am.a(p, cpo.a.n());
      }

      @Override
      public void a(aby<?> $$0) {
         super.a($$0);
         if ($$0.equals(p)) {
            this.n = true;
         }
      }

      private dcb p() {
         return this.am.b(p);
      }

      private void c(dcb $$0) {
         this.am.b(p, $$0);
      }

      @Override
      protected void a(qr $$0) {
         super.a($$0);
         this.c(rd.a(this.dI().a(jc.e), $$0.p("block_state")));
      }

      @Override
      protected void b(qr $$0) {
         super.b($$0);
         $$0.a("block_state", rd.a(this.p()));
      }

      @Nullable
      public bfi.b.a o() {
         return this.q;
      }

      @Override
      protected void a(boolean $$0, float $$1) {
         this.q = new bfi.b.a(this.p());
      }

      public static record a(dcb a) {
      }
   }

   static record c(int a, int b) implements bfi.f {
      @Override
      public int get(float $$0) {
         return aok.b.a($$0, this.a, this.b);
      }
   }

   @FunctionalInterface
   public interface d {
      static bfi.d constant(float $$0) {
         return $$1 -> $$0;
      }

      float get(float var1);
   }

   @FunctionalInterface
   public interface e<T> {
      static <T> bfi.e<T> constant(T $$0) {
         return $$1 -> $$0;
      }

      T get(float var1);
   }

   @FunctionalInterface
   public interface f {
      static bfi.f constant(int $$0) {
         return $$1 -> $$0;
      }

      int get(float var1);
   }

   public static class g extends bfi {
      private static final String o = "item";
      private static final String p = "item_display";
      private static final aby<cfz> q = acb.a(bfi.g.class, aca.h);
      private static final aby<Byte> r = acb.a(bfi.g.class, aca.a);
      private final bgs s = new bgs() {
         @Override
         public cfz a() {
            return g.this.p();
         }

         @Override
         public boolean a(cfz $$0) {
            g.this.a($$0);
            return true;
         }
      };
      @Nullable
      private bfi.g.a t;

      public g(bfn<?> $$0, cmm $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a_() {
         super.a_();
         this.am.a(q, cfz.b);
         this.am.a(r, cfw.a.a());
      }

      @Override
      public void a(aby<?> $$0) {
         super.a($$0);
         if (q.equals($$0) || r.equals($$0)) {
            this.n = true;
         }
      }

      cfz p() {
         return this.am.b(q);
      }

      void a(cfz $$0) {
         this.am.b(q, $$0);
      }

      private void a(cfw $$0) {
         this.am.b(r, $$0.a());
      }

      private cfw q() {
         return cfw.k.apply(this.am.b(r));
      }

      @Override
      protected void a(qr $$0) {
         super.a($$0);
         this.a(cfz.a($$0.p("item")));
         if ($$0.b("item_display", 8)) {
            cfw.j.decode(rc.a, $$0.c("item_display")).resultOrPartial(ac.a("Display entity", bfi.o::error)).ifPresent($$0x -> this.a((cfw)$$0x.getFirst()));
         }
      }

      @Override
      protected void b(qr $$0) {
         super.b($$0);
         $$0.a("item", this.p().b(new qr()));
         cfw.j.encodeStart(rc.a, this.q()).result().ifPresent($$1 -> $$0.a("item_display", $$1));
      }

      @Override
      public bgs a_(int $$0) {
         return $$0 == 0 ? this.s : bgs.b;
      }

      @Nullable
      public bfi.g.a o() {
         return this.t;
      }

      @Override
      protected void a(boolean $$0, float $$1) {
         this.t = new bfi.g.a(this.p(), this.q());
      }

      public static record a(cfz a, cfw b) {
      }
   }

   static record h(float a, float b) implements bfi.d {
      @Override
      public float get(float $$0) {
         return apa.i($$0, this.a, this.b);
      }
   }

   static record i(int a, int b) implements bfi.f {
      @Override
      public int get(float $$0) {
         return apa.a($$0, this.a, this.b);
      }
   }

   public static record j(bfi.e<j> a, bfi.a b, int c, bfi.d d, bfi.d e, int f) {
   }

   public static class k extends bfi {
      public static final String o = "text";
      private static final String aD = "line_width";
      private static final String aE = "text_opacity";
      private static final String aF = "background";
      private static final String aG = "shadow";
      private static final String aH = "see_through";
      private static final String aI = "default_background";
      private static final String aJ = "alignment";
      public static final byte p = 1;
      public static final byte q = 2;
      public static final byte r = 4;
      public static final byte s = 8;
      public static final byte t = 16;
      private static final byte aK = -1;
      public static final int u = 1073741824;
      private static final aby<sw> aL = acb.a(bfi.k.class, aca.f);
      private static final aby<Integer> aM = acb.a(bfi.k.class, aca.b);
      private static final aby<Integer> aN = acb.a(bfi.k.class, aca.b);
      private static final aby<Byte> aO = acb.a(bfi.k.class, aca.a);
      private static final aby<Byte> aP = acb.a(bfi.k.class, aca.a);
      private static final IntSet aQ = IntSet.of(new int[]{aL.a(), aM.a(), aN.a(), aO.a(), aP.a()});
      @Nullable
      private bfi.k.b aR;
      @Nullable
      private bfi.k.e aS;

      public k(bfn<?> $$0, cmm $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a_() {
         super.a_();
         this.am.a(aL, sw.h());
         this.am.a(aM, 200);
         this.am.a(aN, 1073741824);
         this.am.a(aO, (byte)-1);
         this.am.a(aP, (byte)0);
      }

      @Override
      public void a(aby<?> $$0) {
         super.a($$0);
         if (aQ.contains($$0.a())) {
            this.n = true;
         }
      }

      private sw p() {
         return this.am.b(aL);
      }

      private void c(sw $$0) {
         this.am.b(aL, $$0);
      }

      private int q() {
         return this.am.b(aM);
      }

      private void b(int $$0) {
         this.am.b(aM, $$0);
      }

      private byte r() {
         return this.am.b(aO);
      }

      private void c(byte $$0) {
         this.am.b(aO, $$0);
      }

      private int s() {
         return this.am.b(aN);
      }

      private void c(int $$0) {
         this.am.b(aN, $$0);
      }

      private byte t() {
         return this.am.b(aP);
      }

      private void d(byte $$0) {
         this.am.b(aP, $$0);
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
         Optional<bfi.k.a> $$2 = bfi.k.a.d.decode(rc.a, $$0.c("alignment")).resultOrPartial(ac.a("Display entity", bfi.o::error)).map(Pair::getFirst);
         if ($$2.isPresent()) {
            $$1 = switch ((bfi.k.a)$$2.get()) {
               case a -> $$1;
               case b -> (byte)($$1 | 8);
               case c -> (byte)($$1 | 16);
            };
         }

         this.d($$1);
         if ($$0.b("text", 8)) {
            String $$3 = $$0.l("text");

            try {
               sw $$4 = sw.a.a($$3);
               if ($$4 != null) {
                  ds $$5 = this.da().a(2);
                  sw $$6 = sy.a($$5, $$4, this, 0);
                  this.c($$6);
               } else {
                  this.c(sw.h());
               }
            } catch (Exception var8) {
               bfi.o.warn("Failed to parse display entity text {}", $$3, var8);
            }
         }
      }

      private static void b(byte $$0, qr $$1, String $$2, byte $$3) {
         $$1.a($$2, ($$0 & $$3) != 0);
      }

      @Override
      protected void b(qr $$0) {
         super.b($$0);
         $$0.a("text", sw.a.a(this.p()));
         $$0.a("line_width", this.q());
         $$0.a("background", this.s());
         $$0.a("text_opacity", this.r());
         byte $$1 = this.t();
         b($$1, $$0, "shadow", (byte)1);
         b($$1, $$0, "see_through", (byte)2);
         b($$1, $$0, "default_background", (byte)4);
         bfi.k.a.d.encodeStart(rc.a, a($$1)).result().ifPresent($$1x -> $$0.a("alignment", $$1x));
      }

      @Override
      protected void a(boolean $$0, float $$1) {
         if ($$0 && this.aS != null) {
            this.aS = this.a(this.aS, $$1);
         } else {
            this.aS = this.v();
         }

         this.aR = null;
      }

      @Nullable
      public bfi.k.e o() {
         return this.aS;
      }

      private bfi.k.e v() {
         return new bfi.k.e(this.p(), this.q(), bfi.f.constant(this.r()), bfi.f.constant(this.s()), this.t());
      }

      private bfi.k.e a(bfi.k.e $$0, float $$1) {
         int $$2 = $$0.d.get($$1);
         int $$3 = $$0.c.get($$1);
         return new bfi.k.e(this.p(), this.q(), new bfi.i($$3, this.r()), new bfi.c($$2, this.s()), this.t());
      }

      public bfi.k.b a(bfi.k.d $$0) {
         if (this.aR == null) {
            if (this.aS != null) {
               this.aR = $$0.split(this.aS.a(), this.aS.b());
            } else {
               this.aR = new bfi.k.b(List.of(), 0);
            }
         }

         return this.aR;
      }

      public static bfi.k.a a(byte $$0) {
         if (($$0 & 8) != 0) {
            return bfi.k.a.b;
         } else {
            return ($$0 & 16) != 0 ? bfi.k.a.c : bfi.k.a.a;
         }
      }

      public static enum a implements apr {
         a("center"),
         b("left"),
         c("right");

         public static final Codec<bfi.k.a> d = apr.a(bfi.k.a::values);
         private final String e;

         private a(String $$0) {
            this.e = $$0;
         }

         @Override
         public String c() {
            return this.e;
         }
      }

      public static record b(List<bfi.k.c> a, int b) {
      }

      public static record c(aom a, int b) {
      }

      @FunctionalInterface
      public interface d {
         bfi.k.b split(sw var1, int var2);
      }

      public static record e(sw a, int b, bfi.f c, bfi.f d, byte e) {
      }
   }

   static record l(j a, j b) implements bfi.e<j> {
      public j a(float $$0) {
         return (double)$$0 >= 1.0 ? this.b : this.a.a(this.b, $$0);
      }
   }
}
