import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dyd(String s, boolean t, boolean u, boolean v, dyd.a w, drv x, awu y, awu z, awu A, awu B, awu C, awu D, awu E, awu F) {
   private static final Map<String, dyd> G = new Object2ObjectArrayMap();
   public static final Codec<dyd> a = Codec.stringResolver(dyd::b, G::get);
   public static final dyd b = a(new dyd("iron", false, false, false, dyd.a.a, drv.g, awv.nK, awv.nL, awv.nS, awv.nT, awv.pg, awv.ph, awv.zT, awv.zU));
   public static final dyd c = a(new dyd("copper", true, true, false, dyd.a.a, drv.aj, awv.fP, awv.fQ, awv.fW, awv.fX, awv.pg, awv.ph, awv.zT, awv.zU));
   public static final dyd d = a(new dyd("gold", false, true, false, dyd.a.a, drv.g, awv.nK, awv.nL, awv.nS, awv.nT, awv.pg, awv.ph, awv.zT, awv.zU));
   public static final dyd e = a(new dyd("stone", true, true, false, dyd.a.b, drv.f, awv.nK, awv.nL, awv.nS, awv.nT, awv.zY, awv.zZ, awv.zT, awv.zU));
   public static final dyd f = a(
      new dyd("polished_blackstone", true, true, false, dyd.a.b, drv.f, awv.nK, awv.nL, awv.nS, awv.nT, awv.zY, awv.zZ, awv.zT, awv.zU)
   );
   public static final dyd g = a(new dyd("oak"));
   public static final dyd h = a(new dyd("spruce"));
   public static final dyd i = a(new dyd("birch"));
   public static final dyd j = a(new dyd("acacia"));
   public static final dyd k = a(new dyd("cherry", true, true, true, dyd.a.a, drv.aU, awv.eG, awv.eH, awv.eI, awv.eJ, awv.eM, awv.eN, awv.eK, awv.eL));
   public static final dyd l = a(new dyd("jungle"));
   public static final dyd m = a(new dyd("dark_oak"));
   public static final dyd n = a(new dyd("pale_oak"));
   public static final dyd o = a(new dyd("crimson", true, true, true, dyd.a.a, drv.aT, awv.rm, awv.rn, awv.ro, awv.rp, awv.rs, awv.rt, awv.rq, awv.rr));
   public static final dyd p = a(new dyd("warped", true, true, true, dyd.a.a, drv.aT, awv.rm, awv.rn, awv.ro, awv.rp, awv.rs, awv.rt, awv.rq, awv.rr));
   public static final dyd q = a(new dyd("mangrove"));
   public static final dyd r = a(new dyd("bamboo", true, true, true, dyd.a.a, drv.aS, awv.bo, awv.bp, awv.bq, awv.br, awv.bu, awv.bv, awv.bs, awv.bt));

   public dyd(String $$0) {
      this($$0, true, true, true, dyd.a.a, drv.b, awv.DK, awv.DL, awv.DM, awv.DN, awv.DQ, awv.DR, awv.DO, awv.DP);
   }

   private static dyd a(dyd $$0) {
      G.put($$0.s, $$0);
      return $$0;
   }

   public static Stream<dyd> a() {
      return G.values().stream();
   }

   public String b() {
      return this.s;
   }

   public boolean c() {
      return this.t;
   }

   public boolean d() {
      return this.u;
   }

   public boolean e() {
      return this.v;
   }

   public dyd.a f() {
      return this.w;
   }

   public drv g() {
      return this.x;
   }

   public awu h() {
      return this.y;
   }

   public awu i() {
      return this.z;
   }

   public awu j() {
      return this.A;
   }

   public awu k() {
      return this.B;
   }

   public awu l() {
      return this.C;
   }

   public awu m() {
      return this.D;
   }

   public awu n() {
      return this.E;
   }

   public awu o() {
      return this.F;
   }

   public static enum a {
      a,
      b;
   }
}
