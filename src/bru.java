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

public abstract class bru extends brv {
   static final Logger p = LogUtils.getLogger();
   public static final int b = -1;
   private static final ajy<Integer> q = akc.a(bru.class, aka.b);
   private static final ajy<Integer> r = akc.a(bru.class, aka.b);
   private static final ajy<Integer> s = akc.a(bru.class, aka.b);
   private static final ajy<Vector3f> t = akc.a(bru.class, aka.D);
   private static final ajy<Vector3f> u = akc.a(bru.class, aka.D);
   private static final ajy<Quaternionf> v = akc.a(bru.class, aka.E);
   private static final ajy<Quaternionf> aN = akc.a(bru.class, aka.E);
   private static final ajy<Byte> aO = akc.a(bru.class, aka.a);
   private static final ajy<Integer> aP = akc.a(bru.class, aka.b);
   private static final ajy<Float> aQ = akc.a(bru.class, aka.d);
   private static final ajy<Float> aR = akc.a(bru.class, aka.d);
   private static final ajy<Float> aS = akc.a(bru.class, aka.d);
   private static final ajy<Float> aT = akc.a(bru.class, aka.d);
   private static final ajy<Float> aU = akc.a(bru.class, aka.d);
   private static final ajy<Integer> aV = akc.a(bru.class, aka.b);
   private static final IntSet aW = IntSet.of(new int[]{t.a(), u.a(), v.a(), aN.a(), aO.a(), aP.a(), aR.a(), aS.a()});
   private static final float aX = 0.0F;
   private static final float aY = 1.0F;
   private static final int aZ = -1;
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
   private long ba = -2147483648L;
   private int bb;
   private float bc;
   private ewp bd;
   protected boolean o;
   private boolean be;
   private boolean bf;
   @Nullable
   private bru.k bg;
   @Nullable
   private bru.j bh;

   public bru(bsb<?> $$0, dca $$1) {
      super($$0, $$1);
      this.ah = true;
      this.ay = true;
      this.bd = this.cP();
   }

   @Override
   public void a(ajy<?> $$0) {
      super.a($$0);
      if (aU.equals($$0) || aT.equals($$0)) {
         this.F();
      }

      if (q.equals($$0)) {
         this.be = true;
      }

      if (r.equals($$0)) {
         this.bf = true;
      }

      if (aW.contains($$0.a())) {
         this.o = true;
      }
   }

   private static j a(akc $$0) {
      Vector3f $$1 = $$0.a(t);
      Quaternionf $$2 = $$0.a(v);
      Vector3f $$3 = $$0.a(u);
      Quaternionf $$4 = $$0.a(aN);
      return new j($$1, $$2, $$3, $$4);
   }

   @Override
   public void l() {
      brv $$0 = this.dh();
      if ($$0 != null && $$0.dP()) {
         this.ae();
      }

      if (this.dU().C) {
         if (this.be) {
            this.be = false;
            int $$1 = this.t();
            this.ba = (long)(this.am + $$1);
         }

         if (this.bf) {
            this.bf = false;
            this.bb = this.r();
         }

         if (this.o) {
            this.o = false;
            boolean $$2 = this.bb != 0;
            if ($$2 && this.bg != null) {
               this.bg = this.a(this.bg, this.bc);
            } else {
               this.bg = this.G();
            }

            this.a($$2, this.bc);
         }

         if (this.bh != null) {
            if (this.bh.a == 0) {
               this.bh.a(this);
               this.bz();
               this.bh = null;
            } else {
               this.bh.b(this);
               this.bh.a--;
               if (this.bh.a == 0) {
                  this.bh = null;
               }
            }
         }
      }
   }

   protected abstract void a(boolean var1, float var2);

   @Override
   protected void a(akc.a $$0) {
      $$0.a(s, 0);
      $$0.a(q, 0);
      $$0.a(r, 0);
      $$0.a(t, new Vector3f());
      $$0.a(u, new Vector3f(1.0F, 1.0F, 1.0F));
      $$0.a(aN, new Quaternionf());
      $$0.a(v, new Quaternionf());
      $$0.a(aO, bru.a.a.a());
      $$0.a(aP, -1);
      $$0.a(aQ, 1.0F);
      $$0.a(aR, 0.0F);
      $$0.a(aS, 1.0F);
      $$0.a(aT, 0.0F);
      $$0.a(aU, 0.0F);
      $$0.a(aV, -1);
   }

   @Override
   protected void a(uk $$0) {
      if ($$0.e("transformation")) {
         j.b.decode(uy.a, $$0.c("transformation")).resultOrPartial(ad.a("Display entity", p::error)).ifPresent($$0x -> this.a((j)$$0x.getFirst()));
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
         this.d(aym.a($$3, 0, 59));
      }

      if ($$0.b("billboard", 8)) {
         bru.a.e.decode(uy.a, $$0.c("billboard")).resultOrPartial(ad.a("Display entity", p::error)).ifPresent($$0x -> this.a((bru.a)$$0x.getFirst()));
      }

      if ($$0.b("view_range", 99)) {
         this.b($$0.j("view_range"));
      }

      if ($$0.b("shadow_radius", 99)) {
         this.c($$0.j("shadow_radius"));
      }

      if ($$0.b("shadow_strength", 99)) {
         this.t($$0.j("shadow_strength"));
      }

      if ($$0.b("width", 99)) {
         this.u($$0.j("width"));
      }

      if ($$0.b("height", 99)) {
         this.v($$0.j("height"));
      }

      if ($$0.b("glow_color_override", 99)) {
         this.n($$0.h("glow_color_override"));
      }

      if ($$0.b("brightness", 10)) {
         axc.b.decode(uy.a, $$0.c("brightness")).resultOrPartial(ad.a("Display entity", p::error)).ifPresent($$0x -> this.a((axc)$$0x.getFirst()));
      } else {
         this.a(null);
      }
   }

   private void a(j $$0) {
      this.as.a(t, $$0.d());
      this.as.a(v, $$0.e());
      this.as.a(u, $$0.f());
      this.as.a(aN, $$0.g());
   }

   @Override
   protected void b(uk $$0) {
      j.b.encodeStart(uy.a, a(this.as)).result().ifPresent($$1x -> $$0.a("transformation", $$1x));
      bru.a.e.encodeStart(uy.a, this.w()).result().ifPresent($$1x -> $$0.a("billboard", $$1x));
      $$0.a("interpolation_duration", this.r());
      $$0.a("teleport_duration", this.u());
      $$0.a("view_range", this.z());
      $$0.a("shadow_radius", this.A());
      $$0.a("shadow_strength", this.B());
      $$0.a("width", this.C());
      $$0.a("height", this.E());
      $$0.a("glow_color_override", this.D());
      axc $$1 = this.x();
      if ($$1 != null) {
         axc.b.encodeStart(uy.a, $$1).result().ifPresent($$1x -> $$0.a("brightness", $$1x));
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2, float $$3, float $$4, int $$5) {
      int $$6 = this.u();
      this.bh = new bru.j($$6, $$0, $$1, $$2, (double)$$3, (double)$$4);
   }

   @Override
   public double c_() {
      return this.bh != null ? this.bh.b : this.dz();
   }

   @Override
   public double d_() {
      return this.bh != null ? this.bh.c : this.dB();
   }

   @Override
   public double M_() {
      return this.bh != null ? this.bh.d : this.dF();
   }

   @Override
   public float N_() {
      return this.bh != null ? (float)this.bh.f : this.dM();
   }

   @Override
   public float e_() {
      return this.bh != null ? (float)this.bh.e : this.dK();
   }

   @Override
   public ewp h_() {
      return this.bd;
   }

   @Override
   public epj j_() {
      return epj.d;
   }

   @Override
   public boolean r_() {
      return true;
   }

   @Nullable
   public bru.k p() {
      return this.bg;
   }

   private void b(int $$0) {
      this.as.a(r, $$0);
   }

   private int r() {
      return this.as.a(r);
   }

   private void c(int $$0) {
      this.as.a(q, $$0, true);
   }

   private int t() {
      return this.as.a(q);
   }

   private void d(int $$0) {
      this.as.a(s, $$0);
   }

   private int u() {
      return this.as.a(s);
   }

   private void a(bru.a $$0) {
      this.as.a(aO, $$0.a());
   }

   private bru.a w() {
      return bru.a.f.apply(this.as.a(aO));
   }

   private void a(@Nullable axc $$0) {
      this.as.a(aP, $$0 != null ? $$0.a() : -1);
   }

   @Nullable
   private axc x() {
      int $$0 = this.as.a(aP);
      return $$0 != -1 ? axc.a($$0) : null;
   }

   private int y() {
      return this.as.a(aP);
   }

   private void b(float $$0) {
      this.as.a(aQ, $$0);
   }

   private float z() {
      return this.as.a(aQ);
   }

   private void c(float $$0) {
      this.as.a(aR, $$0);
   }

   private float A() {
      return this.as.a(aR);
   }

   private void t(float $$0) {
      this.as.a(aS, $$0);
   }

   private float B() {
      return this.as.a(aS);
   }

   private void u(float $$0) {
      this.as.a(aT, $$0);
   }

   private float C() {
      return this.as.a(aT);
   }

   private void v(float $$0) {
      this.as.a(aU, $$0);
   }

   private int D() {
      return this.as.a(aV);
   }

   private void n(int $$0) {
      this.as.a(aV, $$0);
   }

   public float a(float $$0) {
      int $$1 = this.bb;
      if ($$1 <= 0) {
         return 1.0F;
      } else {
         float $$2 = (float)((long)this.am - this.ba);
         float $$3 = $$2 + $$0;
         float $$4 = aym.a(aym.g($$3, 0.0F, (float)$$1), 0.0F, 1.0F);
         this.bc = $$4;
         return $$4;
      }
   }

   private float E() {
      return this.as.a(aU);
   }

   @Override
   public void a_(double $$0, double $$1, double $$2) {
      super.a_($$0, $$1, $$2);
      this.F();
   }

   private void F() {
      float $$0 = this.C();
      float $$1 = this.E();
      if ($$0 != 0.0F && $$1 != 0.0F) {
         this.ay = false;
         float $$2 = $$0 / 2.0F;
         double $$3 = this.dz();
         double $$4 = this.dB();
         double $$5 = this.dF();
         this.bd = new ewp($$3 - (double)$$2, $$4, $$5 - (double)$$2, $$3 + (double)$$2, $$4 + (double)$$1, $$5 + (double)$$2);
      } else {
         this.ay = true;
      }
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < aym.k((double)this.z() * 64.0 * cI());
   }

   @Override
   public int q_() {
      int $$0 = this.D();
      return $$0 != -1 ? $$0 : super.q_();
   }

   private bru.k G() {
      return new bru.k(bru.e.constant(a(this.as)), this.w(), this.y(), bru.d.constant(this.A()), bru.d.constant(this.B()), this.D());
   }

   private bru.k a(bru.k $$0, float $$1) {
      j $$2 = $$0.a.get($$1);
      float $$3 = $$0.d.get($$1);
      float $$4 = $$0.e.get($$1);
      return new bru.k(new bru.m($$2, a(this.as)), this.w(), this.y(), new bru.h($$3, this.A()), new bru.h($$4, this.B()), this.D());
   }

   public static enum a implements azg {
      a((byte)0, "fixed"),
      b((byte)1, "vertical"),
      c((byte)2, "horizontal"),
      d((byte)3, "center");

      public static final Codec<bru.a> e = azg.a(bru.a::values);
      public static final IntFunction<bru.a> f = axd.a(bru.a::a, values(), axd.a.a);
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

   public static class b extends bru {
      public static final String p = "block_state";
      private static final ajy<dtc> q = akc.a(bru.b.class, aka.i);
      @Nullable
      private bru.b.a r;

      public b(bsb<?> $$0, dca $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a(akc.a $$0) {
         super.a($$0);
         $$0.a(q, dfe.a.n());
      }

      @Override
      public void a(ajy<?> $$0) {
         super.a($$0);
         if ($$0.equals(q)) {
            this.o = true;
         }
      }

      private dtc t() {
         return this.as.a(q);
      }

      private void c(dtc $$0) {
         this.as.a(q, $$0);
      }

      @Override
      protected void a(uk $$0) {
         super.a($$0);
         this.c(uz.a(this.dU().a(li.f), $$0.p("block_state")));
      }

      @Override
      protected void b(uk $$0) {
         super.b($$0);
         $$0.a("block_state", uz.a(this.t()));
      }

      @Nullable
      public bru.b.a r() {
         return this.r;
      }

      @Override
      protected void a(boolean $$0, float $$1) {
         this.r = new bru.b.a(this.t());
      }

      public static record a(dtc a) {
      }
   }

   static record c(int a, int b) implements bru.f {
      @Override
      public int get(float $$0) {
         return axw.b.a($$0, this.a, this.b);
      }
   }

   @FunctionalInterface
   public interface d {
      static bru.d constant(float $$0) {
         return $$1 -> $$0;
      }

      float get(float var1);
   }

   @FunctionalInterface
   public interface e<T> {
      static <T> bru.e<T> constant(T $$0) {
         return $$1 -> $$0;
      }

      T get(float var1);
   }

   @FunctionalInterface
   public interface f {
      static bru.f constant(int $$0) {
         return $$1 -> $$0;
      }

      int get(float var1);
   }

   public static class g extends bru {
      private static final String p = "item";
      private static final String q = "item_display";
      private static final ajy<cuh> r = akc.a(bru.g.class, aka.h);
      private static final ajy<Byte> s = akc.a(bru.g.class, aka.a);
      private final btf t = new btf() {
         @Override
         public cuh a() {
            return g.this.t();
         }

         @Override
         public boolean a(cuh $$0) {
            g.this.a($$0);
            return true;
         }
      };
      @Nullable
      private bru.g.a u;

      public g(bsb<?> $$0, dca $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a(akc.a $$0) {
         super.a($$0);
         $$0.a(r, cuh.i);
         $$0.a(s, cue.a.a());
      }

      @Override
      public void a(ajy<?> $$0) {
         super.a($$0);
         if (r.equals($$0) || s.equals($$0)) {
            this.o = true;
         }
      }

      cuh t() {
         return this.as.a(r);
      }

      void a(cuh $$0) {
         this.as.a(r, $$0);
      }

      private void a(cue $$0) {
         this.as.a(s, $$0.a());
      }

      private cue u() {
         return cue.k.apply(this.as.a(s));
      }

      @Override
      protected void a(uk $$0) {
         super.a($$0);
         if ($$0.e("item")) {
            this.a(cuh.a(this.dY(), (vh)$$0.p("item")).orElse(cuh.i));
         } else {
            this.a(cuh.i);
         }

         if ($$0.b("item_display", 8)) {
            cue.j.decode(uy.a, $$0.c("item_display")).resultOrPartial(ad.a("Display entity", bru.p::error)).ifPresent($$0x -> this.a((cue)$$0x.getFirst()));
         }
      }

      @Override
      protected void b(uk $$0) {
         super.b($$0);
         if (!this.t().d()) {
            $$0.a("item", this.t().a(this.dY()));
         }

         cue.j.encodeStart(uy.a, this.u()).result().ifPresent($$1 -> $$0.a("item_display", $$1));
      }

      @Override
      public btf a_(int $$0) {
         return $$0 == 0 ? this.t : btf.b;
      }

      @Nullable
      public bru.g.a r() {
         return this.u;
      }

      @Override
      protected void a(boolean $$0, float $$1) {
         cuh $$2 = this.t();
         $$2.a(this);
         this.u = new bru.g.a($$2, this.u());
      }

      public static record a(cuh a, cue b) {
      }
   }

   static record h(float a, float b) implements bru.d {
      @Override
      public float get(float $$0) {
         return aym.i($$0, this.a, this.b);
      }
   }

   static record i(int a, int b) implements bru.f {
      @Override
      public int get(float $$0) {
         return aym.a($$0, this.a, this.b);
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

      void a(brv $$0) {
         $$0.a_(this.b, this.c, this.d);
         $$0.a((float)this.e, (float)this.f);
      }

      void b(brv $$0) {
         $$0.a(this.a, this.b, this.c, this.d, this.e, this.f);
      }
   }

   public static record k(bru.e<j> a, bru.a b, int c, bru.d d, bru.d e, int f) {
   }

   public static class l extends bru {
      public static final String p = "text";
      private static final String aN = "line_width";
      private static final String aO = "text_opacity";
      private static final String aP = "background";
      private static final String aQ = "shadow";
      private static final String aR = "see_through";
      private static final String aS = "default_background";
      private static final String aT = "alignment";
      public static final byte q = 1;
      public static final byte r = 2;
      public static final byte s = 4;
      public static final byte t = 8;
      public static final byte u = 16;
      private static final byte aU = -1;
      public static final int v = 1073741824;
      private static final ajy<xe> aV = akc.a(bru.l.class, aka.f);
      private static final ajy<Integer> aW = akc.a(bru.l.class, aka.b);
      private static final ajy<Integer> aX = akc.a(bru.l.class, aka.b);
      private static final ajy<Byte> aY = akc.a(bru.l.class, aka.a);
      private static final ajy<Byte> aZ = akc.a(bru.l.class, aka.a);
      private static final IntSet ba = IntSet.of(new int[]{aV.a(), aW.a(), aX.a(), aY.a(), aZ.a()});
      @Nullable
      private bru.l.b bb;
      @Nullable
      private bru.l.e bc;

      public l(bsb<?> $$0, dca $$1) {
         super($$0, $$1);
      }

      @Override
      protected void a(akc.a $$0) {
         super.a($$0);
         $$0.a(aV, xe.i());
         $$0.a(aW, 200);
         $$0.a(aX, 1073741824);
         $$0.a(aY, (byte)-1);
         $$0.a(aZ, (byte)0);
      }

      @Override
      public void a(ajy<?> $$0) {
         super.a($$0);
         if (ba.contains($$0.a())) {
            this.o = true;
         }
      }

      private xe t() {
         return this.as.a(aV);
      }

      private void c(xe $$0) {
         this.as.a(aV, $$0);
      }

      private int u() {
         return this.as.a(aW);
      }

      private void b(int $$0) {
         this.as.a(aW, $$0);
      }

      private byte w() {
         return this.as.a(aY);
      }

      private void c(byte $$0) {
         this.as.a(aY, $$0);
      }

      private int x() {
         return this.as.a(aX);
      }

      private void c(int $$0) {
         this.as.a(aX, $$0);
      }

      private byte y() {
         return this.as.a(aZ);
      }

      private void d(byte $$0) {
         this.as.a(aZ, $$0);
      }

      private static byte a(byte $$0, uk $$1, String $$2, byte $$3) {
         return $$1.q($$2) ? (byte)($$0 | $$3) : $$0;
      }

      @Override
      protected void a(uk $$0) {
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
         Optional<bru.l.a> $$2 = bru.l.a.d.decode(uy.a, $$0.c("alignment")).resultOrPartial(ad.a("Display entity", bru.p::error)).map(Pair::getFirst);
         if ($$2.isPresent()) {
            $$1 = switch ((bru.l.a)$$2.get()) {
               case a -> $$1;
               case b -> (byte)($$1 | 8);
               case c -> (byte)($$1 | 16);
            };
         }

         this.d($$1);
         if ($$0.b("text", 8)) {
            String $$3 = $$0.l("text");

            try {
               xe $$4 = xe.a.a($$3, this.dY());
               if ($$4 != null) {
                  eh $$5 = this.dl().a(2);
                  xe $$6 = xh.a($$5, $$4, this, 0);
                  this.c($$6);
               } else {
                  this.c(xe.i());
               }
            } catch (Exception var8) {
               bru.p.warn("Failed to parse display entity text {}", $$3, var8);
            }
         }
      }

      private static void b(byte $$0, uk $$1, String $$2, byte $$3) {
         $$1.a($$2, ($$0 & $$3) != 0);
      }

      @Override
      protected void b(uk $$0) {
         super.b($$0);
         $$0.a("text", xe.a.a(this.t(), this.dY()));
         $$0.a("line_width", this.u());
         $$0.a("background", this.x());
         $$0.a("text_opacity", this.w());
         byte $$1 = this.y();
         b($$1, $$0, "shadow", (byte)1);
         b($$1, $$0, "see_through", (byte)2);
         b($$1, $$0, "default_background", (byte)4);
         bru.l.a.d.encodeStart(uy.a, a($$1)).result().ifPresent($$1x -> $$0.a("alignment", $$1x));
      }

      @Override
      protected void a(boolean $$0, float $$1) {
         if ($$0 && this.bc != null) {
            this.bc = this.a(this.bc, $$1);
         } else {
            this.bc = this.z();
         }

         this.bb = null;
      }

      @Nullable
      public bru.l.e r() {
         return this.bc;
      }

      private bru.l.e z() {
         return new bru.l.e(this.t(), this.u(), bru.f.constant(this.w()), bru.f.constant(this.x()), this.y());
      }

      private bru.l.e a(bru.l.e $$0, float $$1) {
         int $$2 = $$0.d.get($$1);
         int $$3 = $$0.c.get($$1);
         return new bru.l.e(this.t(), this.u(), new bru.i($$3, this.w()), new bru.c($$2, this.x()), this.y());
      }

      public bru.l.b a(bru.l.d $$0) {
         if (this.bb == null) {
            if (this.bc != null) {
               this.bb = $$0.split(this.bc.a(), this.bc.b());
            } else {
               this.bb = new bru.l.b(List.of(), 0);
            }
         }

         return this.bb;
      }

      public static bru.l.a a(byte $$0) {
         if (($$0 & 8) != 0) {
            return bru.l.a.b;
         } else {
            return ($$0 & 16) != 0 ? bru.l.a.c : bru.l.a.a;
         }
      }

      public static enum a implements azg {
         a("center"),
         b("left"),
         c("right");

         public static final Codec<bru.l.a> d = azg.a(bru.l.a::values);
         private final String e;

         private a(String $$0) {
            this.e = $$0;
         }

         @Override
         public String c() {
            return this.e;
         }
      }

      public static record b(List<bru.l.c> a, int b) {
      }

      public static record c(axy a, int b) {
      }

      @FunctionalInterface
      public interface d {
         bru.l.b split(xe var1, int var2);
      }

      public static record e(xe a, int b, bru.f c, bru.f d, byte e) {
      }
   }

   static record m(j a, j b) implements bru.e<j> {
      public j a(float $$0) {
         return (double)$$0 >= 1.0 ? this.b : this.a.a(this.b, $$0);
      }
   }
}
