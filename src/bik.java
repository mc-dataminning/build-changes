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

public abstract class bik extends bil {
   static final Logger p = LogUtils.getLogger();
   public static final int b = -1;
   private static final aec<Integer> q = aef.a(bik.class, aee.b);
   private static final aec<Integer> r = aef.a(bik.class, aee.b);
   private static final aec<Integer> s = aef.a(bik.class, aee.b);
   private static final aec<Vector3f> t = aef.a(bik.class, aee.A);
   private static final aec<Vector3f> u = aef.a(bik.class, aee.A);
   private static final aec<Quaternionf> v = aef.a(bik.class, aee.B);
   private static final aec<Quaternionf> aE = aef.a(bik.class, aee.B);
   private static final aec<Byte> aF = aef.a(bik.class, aee.a);
   private static final aec<Integer> aG = aef.a(bik.class, aee.b);
   private static final aec<Float> aH = aef.a(bik.class, aee.d);
   private static final aec<Float> aI = aef.a(bik.class, aee.d);
   private static final aec<Float> aJ = aef.a(bik.class, aee.d);
   private static final aec<Float> aK = aef.a(bik.class, aee.d);
   private static final aec<Float> aL = aef.a(bik.class, aee.d);
   private static final aec<Integer> aM = aef.a(bik.class, aee.b);
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
   private ehd aU;
   protected boolean o;
   private boolean aV;
   private boolean aW;
   @Nullable
   private bik.k aX;
   @Nullable
   private bik.j aY;

   public bik(bip<?> $$0, cpq $$1) {
      super($$0, $$1);
      this.af = true;
      this.at = true;
      this.aU = this.cG();
   }

   @Override
   public void a(aec<?> $$0) {
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

   private static j a(aef $$0) {
      Vector3f $$1 = $$0.b(t);
      Quaternionf $$2 = $$0.b(v);
      Vector3f $$3 = $$0.b(u);
      Quaternionf $$4 = $$0.b(aE);
      return new j($$1, $$2, $$3, $$4);
   }

   @Override
   public void l() {
      bil $$0 = this.cY();
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
      this.an.a(aF, bik.a.a.a());
      this.an.a(aG, -1);
      this.an.a(aH, 1.0F);
      this.an.a(aI, 0.0F);
      this.an.a(aJ, 1.0F);
      this.an.a(aK, 0.0F);
      this.an.a(aL, 0.0F);
      this.an.a(aM, -1);
   }

   @Override
   protected void a(qu $$0) {
      if ($$0.e("transformation")) {
         j.b.decode(rf.a, $$0.c("transformation")).resultOrPartial(ac.a("Display entity", p::error)).ifPresent($$0x -> this.a((j)$$0x.getFirst()));
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
         this.d(ars.a($$3, 0, 59));
      }

      if ($$0.b("billboard", 8)) {
         bik.a.e.decode(rf.a, $$0.c("billboard")).resultOrPartial(ac.a("Display entity", p::error)).ifPresent($$0x -> this.a((bik.a)$$0x.getFirst()));
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
         aqm.b.decode(rf.a, $$0.c("brightness")).resultOrPartial(ac.a("Display entity", p::error)).ifPresent($$0x -> this.a((aqm)$$0x.getFirst()));
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
   protected void b(qu $$0) {
      j.b.encodeStart(rf.a, a(this.an)).result().ifPresent($$1x -> $$0.a("transformation", $$1x));
      bik.a.e.encodeStart(rf.a, this.q()).result().ifPresent($$1x -> $$0.a("billboard", $$1x));
      $$0.a("interpolation_duration", this.m());
      $$0.a("teleport_duration", this.p());
      $$0.a("view_range", this.t());
      $$0.a("shadow_radius", this.v());
      $$0.a("shadow_strength", this.w());
      $$0.a("width", this.x());
      $$0.a("height", this.z());
      $$0.a("glow_color_override", this.y());
      aqm $$1 = this.r();
      if ($$1 != null) {
         aqm.b.encodeStart(rf.a, $$1).result().ifPresent($$1x -> $$0.a("brightness", $$1x));
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      int $$6 = this.p();
      this.aY = new bik.j($$6, $$0, $$1, $$2, (double)$$3, (double)$$4);
   }

   @Override
   public ehd k_() {
      return this.aU;
   }

   @Override
   public eam l_() {
      return eam.d;
   }

   @Override
   public boolean d_() {
      return true;
   }

   @Nullable
   public bik.k j() {
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

   private void a(bik.a $$0) {
      this.an.b(aF, $$0.a());
   }

   private bik.a q() {
      return bik.a.f.apply(this.an.b(aF));
   }

   private void a(@Nullable aqm $$0) {
      this.an.b(aG, $$0 != null ? $$0.a() : -1);
   }

   @Nullable
   private aqm r() {
      int $$0 = this.an.b(aG);
      return $$0 != -1 ? aqm.a($$0) : null;
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
         float $$4 = ars.a(ars.g($$3, 0.0F, (float)$$1), 0.0F, 1.0F);
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
         this.aU = new ehd($$3 - (double)$$2, $$4, $$5 - (double)$$2, $$3 + (double)$$2, $$4 + (double)$$1, $$5 + (double)$$2);
      } else {
         this.at = true;
      }
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < ars.k((double)this.t() * 64.0 * cz());
   }

   @Override
   public int c_() {
      int $$0 = this.y();
      return $$0 != -1 ? $$0 : super.c_();
   }

   private bik.k B() {
      return new bik.k(bik.e.constant(a(this.an)), this.q(), this.s(), bik.d.constant(this.v()), bik.d.constant(this.w()), this.y());
   }

   private bik.k a(bik.k $$0, float $$1) {
      j $$2 = $$0.a.get($$1);
      float $$3 = $$0.d.get($$1);
      float $$4 = $$0.e.get($$1);
      return new bik.k(new bik.m($$2, a(this.an)), this.q(), this.s(), new bik.h($$3, this.v()), new bik.h($$4, this.w()), this.y());
   }

   public static enum a implements ask {
      a((byte)0, "fixed"),
      b((byte)1, "vertical"),
      c((byte)2, "horizontal"),
      d((byte)3, "center");

      public static final Codec<bik.a> e = ask.a(bik.a::values);
      public static final IntFunction<bik.a> f = aqn.a(bik.a::a, values(), aqn.a.a);
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

   public static class b extends bik {
      public static final String p = "block_state";
      private static final aec<dfe> q = aef.a(bik.b.class, aee.i);
      @Nullable
      private bik.b.a r;

      public b(bip<?> $$0, cpq $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a_() {
         super.a_();
         this.an.a(q, csr.a.n());
      }

      @Override
      public void a(aec<?> $$0) {
         super.a($$0);
         if ($$0.equals(q)) {
            this.o = true;
         }
      }

      private dfe o() {
         return this.an.b(q);
      }

      private void c(dfe $$0) {
         this.an.b(q, $$0);
      }

      @Override
      protected void a(qu $$0) {
         super.a($$0);
         this.c(rg.a(this.dK().a(je.e), $$0.p("block_state")));
      }

      @Override
      protected void b(qu $$0) {
         super.b($$0);
         $$0.a("block_state", rg.a(this.o()));
      }

      @Nullable
      public bik.b.a m() {
         return this.r;
      }

      @Override
      protected void a(boolean $$0, float $$1) {
         this.r = new bik.b.a(this.o());
      }

      public static record a(dfe a) {
      }
   }

   static record c(int a, int b) implements bik.f {
      @Override
      public int get(float $$0) {
         return ard.b.a($$0, this.a, this.b);
      }
   }

   @FunctionalInterface
   public interface d {
      static bik.d constant(float $$0) {
         return $$1 -> $$0;
      }

      float get(float var1);
   }

   @FunctionalInterface
   public interface e<T> {
      static <T> bik.e<T> constant(T $$0) {
         return $$1 -> $$0;
      }

      T get(float var1);
   }

   @FunctionalInterface
   public interface f {
      static bik.f constant(int $$0) {
         return $$1 -> $$0;
      }

      int get(float var1);
   }

   public static class g extends bik {
      private static final String p = "item";
      private static final String q = "item_display";
      private static final aec<cja> r = aef.a(bik.g.class, aee.h);
      private static final aec<Byte> s = aef.a(bik.g.class, aee.a);
      private final bjt t = new bjt() {
         @Override
         public cja a() {
            return g.this.o();
         }

         @Override
         public boolean a(cja $$0) {
            g.this.a($$0);
            return true;
         }
      };
      @Nullable
      private bik.g.a u;

      public g(bip<?> $$0, cpq $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a_() {
         super.a_();
         this.an.a(r, cja.b);
         this.an.a(s, cix.a.a());
      }

      @Override
      public void a(aec<?> $$0) {
         super.a($$0);
         if (r.equals($$0) || s.equals($$0)) {
            this.o = true;
         }
      }

      cja o() {
         return this.an.b(r);
      }

      void a(cja $$0) {
         this.an.b(r, $$0);
      }

      private void a(cix $$0) {
         this.an.b(s, $$0.a());
      }

      private cix p() {
         return cix.k.apply(this.an.b(s));
      }

      @Override
      protected void a(qu $$0) {
         super.a($$0);
         this.a(cja.a($$0.p("item")));
         if ($$0.b("item_display", 8)) {
            cix.j.decode(rf.a, $$0.c("item_display")).resultOrPartial(ac.a("Display entity", bik.p::error)).ifPresent($$0x -> this.a((cix)$$0x.getFirst()));
         }
      }

      @Override
      protected void b(qu $$0) {
         super.b($$0);
         $$0.a("item", this.o().b(new qu()));
         cix.j.encodeStart(rf.a, this.p()).result().ifPresent($$1 -> $$0.a("item_display", $$1));
      }

      @Override
      public bjt a_(int $$0) {
         return $$0 == 0 ? this.t : bjt.b;
      }

      @Nullable
      public bik.g.a m() {
         return this.u;
      }

      @Override
      protected void a(boolean $$0, float $$1) {
         this.u = new bik.g.a(this.o(), this.p());
      }

      public static record a(cja a, cix b) {
      }
   }

   static record h(float a, float b) implements bik.d {
      @Override
      public float get(float $$0) {
         return ars.i($$0, this.a, this.b);
      }
   }

   static record i(int a, int b) implements bik.f {
      @Override
      public int get(float $$0) {
         return ars.a($$0, this.a, this.b);
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

      void a(bil $$0) {
         $$0.e(this.b, this.c, this.d);
         $$0.a((float)this.e, (float)this.f);
      }

      void b(bil $$0) {
         $$0.a(this.a, this.b, this.c, this.d, this.e, this.f);
      }
   }

   public static record k(bik.e<j> a, bik.a b, int c, bik.d d, bik.d e, int f) {
   }

   public static class l extends bik {
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
      private static final aec<ti> aM = aef.a(bik.l.class, aee.f);
      private static final aec<Integer> aN = aef.a(bik.l.class, aee.b);
      private static final aec<Integer> aO = aef.a(bik.l.class, aee.b);
      private static final aec<Byte> aP = aef.a(bik.l.class, aee.a);
      private static final aec<Byte> aQ = aef.a(bik.l.class, aee.a);
      private static final IntSet aR = IntSet.of(new int[]{aM.a(), aN.a(), aO.a(), aP.a(), aQ.a()});
      @Nullable
      private bik.l.b aS;
      @Nullable
      private bik.l.e aT;

      public l(bip<?> $$0, cpq $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a_() {
         super.a_();
         this.an.a(aM, ti.h());
         this.an.a(aN, 200);
         this.an.a(aO, 1073741824);
         this.an.a(aP, (byte)-1);
         this.an.a(aQ, (byte)0);
      }

      @Override
      public void a(aec<?> $$0) {
         super.a($$0);
         if (aR.contains($$0.a())) {
            this.o = true;
         }
      }

      private ti o() {
         return this.an.b(aM);
      }

      private void c(ti $$0) {
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

      private static byte a(byte $$0, qu $$1, String $$2, byte $$3) {
         return $$1.q($$2) ? (byte)($$0 | $$3) : $$0;
      }

      @Override
      protected void a(qu $$0) {
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
         Optional<bik.l.a> $$2 = bik.l.a.d.decode(rf.a, $$0.c("alignment")).resultOrPartial(ac.a("Display entity", bik.p::error)).map(Pair::getFirst);
         if ($$2.isPresent()) {
            $$1 = switch ((bik.l.a)$$2.get()) {
               case a -> $$1;
               case b -> (byte)($$1 | 8);
               case c -> (byte)($$1 | 16);
            };
         }

         this.d($$1);
         if ($$0.b("text", 8)) {
            String $$3 = $$0.l("text");

            try {
               ti $$4 = ti.a.a($$3);
               if ($$4 != null) {
                  dt $$5 = this.dc().a(2);
                  ti $$6 = tk.a($$5, $$4, this, 0);
                  this.c($$6);
               } else {
                  this.c(ti.h());
               }
            } catch (Exception var8) {
               bik.p.warn("Failed to parse display entity text {}", $$3, var8);
            }
         }
      }

      private static void b(byte $$0, qu $$1, String $$2, byte $$3) {
         $$1.a($$2, ($$0 & $$3) != 0);
      }

      @Override
      protected void b(qu $$0) {
         super.b($$0);
         $$0.a("text", ti.a.a(this.o()));
         $$0.a("line_width", this.p());
         $$0.a("background", this.r());
         $$0.a("text_opacity", this.q());
         byte $$1 = this.s();
         b($$1, $$0, "shadow", (byte)1);
         b($$1, $$0, "see_through", (byte)2);
         b($$1, $$0, "default_background", (byte)4);
         bik.l.a.d.encodeStart(rf.a, a($$1)).result().ifPresent($$1x -> $$0.a("alignment", $$1x));
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
      public bik.l.e m() {
         return this.aT;
      }

      private bik.l.e t() {
         return new bik.l.e(this.o(), this.p(), bik.f.constant(this.q()), bik.f.constant(this.r()), this.s());
      }

      private bik.l.e a(bik.l.e $$0, float $$1) {
         int $$2 = $$0.d.get($$1);
         int $$3 = $$0.c.get($$1);
         return new bik.l.e(this.o(), this.p(), new bik.i($$3, this.q()), new bik.c($$2, this.r()), this.s());
      }

      public bik.l.b a(bik.l.d $$0) {
         if (this.aS == null) {
            if (this.aT != null) {
               this.aS = $$0.split(this.aT.a(), this.aT.b());
            } else {
               this.aS = new bik.l.b(List.of(), 0);
            }
         }

         return this.aS;
      }

      public static bik.l.a a(byte $$0) {
         if (($$0 & 8) != 0) {
            return bik.l.a.b;
         } else {
            return ($$0 & 16) != 0 ? bik.l.a.c : bik.l.a.a;
         }
      }

      public static enum a implements ask {
         a("center"),
         b("left"),
         c("right");

         public static final Codec<bik.l.a> d = ask.a(bik.l.a::values);
         private final String e;

         private a(String $$0) {
            this.e = $$0;
         }

         @Override
         public String c() {
            return this.e;
         }
      }

      public static record b(List<bik.l.c> a, int b) {
      }

      public static record c(arf a, int b) {
      }

      @FunctionalInterface
      public interface d {
         bik.l.b split(ti var1, int var2);
      }

      public static record e(ti a, int b, bik.f c, bik.f d, byte e) {
      }
   }

   static record m(j a, j b) implements bik.e<j> {
      public j a(float $$0) {
         return (double)$$0 >= 1.0 ? this.b : this.a.a(this.b, $$0);
      }
   }
}
