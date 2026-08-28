import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dyk(String s, boolean t, boolean u, boolean v, dyk.a w, dsc x, axe y, axe z, axe A, axe B, axe C, axe D, axe E, axe F) {
   private static final Map<String, dyk> G = new Object2ObjectArrayMap();
   public static final Codec<dyk> a = Codec.stringResolver(dyk::b, G::get);
   public static final dyk b = a(new dyk("iron", false, false, false, dyk.a.a, dsc.g, axf.nE, axf.nF, axf.nM, axf.nN, axf.pa, axf.pb, axf.zD, axf.zE));
   public static final dyk c = a(new dyk("copper", true, true, false, dyk.a.a, dsc.aj, axf.fP, axf.fQ, axf.fW, axf.fX, axf.pa, axf.pb, axf.zD, axf.zE));
   public static final dyk d = a(new dyk("gold", false, true, false, dyk.a.a, dsc.g, axf.nE, axf.nF, axf.nM, axf.nN, axf.pa, axf.pb, axf.zD, axf.zE));
   public static final dyk e = a(new dyk("stone", true, true, false, dyk.a.b, dsc.f, axf.nE, axf.nF, axf.nM, axf.nN, axf.zI, axf.zJ, axf.zD, axf.zE));
   public static final dyk f = a(
      new dyk("polished_blackstone", true, true, false, dyk.a.b, dsc.f, axf.nE, axf.nF, axf.nM, axf.nN, axf.zI, axf.zJ, axf.zD, axf.zE)
   );
   public static final dyk g = a(new dyk("oak"));
   public static final dyk h = a(new dyk("spruce"));
   public static final dyk i = a(new dyk("birch"));
   public static final dyk j = a(new dyk("acacia"));
   public static final dyk k = a(new dyk("cherry", true, true, true, dyk.a.a, dsc.aU, axf.eG, axf.eH, axf.eI, axf.eJ, axf.eM, axf.eN, axf.eK, axf.eL));
   public static final dyk l = a(new dyk("jungle"));
   public static final dyk m = a(new dyk("dark_oak"));
   public static final dyk n = a(new dyk("pale_oak"));
   public static final dyk o = a(new dyk("crimson", true, true, true, dyk.a.a, dsc.aT, axf.rg, axf.rh, axf.ri, axf.rj, axf.rm, axf.rn, axf.rk, axf.rl));
   public static final dyk p = a(new dyk("warped", true, true, true, dyk.a.a, dsc.aT, axf.rg, axf.rh, axf.ri, axf.rj, axf.rm, axf.rn, axf.rk, axf.rl));
   public static final dyk q = a(new dyk("mangrove"));
   public static final dyk r = a(new dyk("bamboo", true, true, true, dyk.a.a, dsc.aS, axf.bo, axf.bp, axf.bq, axf.br, axf.bu, axf.bv, axf.bs, axf.bt));

   public dyk(String $$0) {
      this($$0, true, true, true, dyk.a.a, dsc.b, axf.Du, axf.Dv, axf.Dw, axf.Dx, axf.DA, axf.DB, axf.Dy, axf.Dz);
   }

   private static dyk a(dyk $$0) {
      G.put($$0.s, $$0);
      return $$0;
   }

   public static Stream<dyk> a() {
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

   public dyk.a f() {
      return this.w;
   }

   public dsc g() {
      return this.x;
   }

   public axe h() {
      return this.y;
   }

   public axe i() {
      return this.z;
   }

   public axe j() {
      return this.A;
   }

   public axe k() {
      return this.B;
   }

   public axe l() {
      return this.C;
   }

   public axe m() {
      return this.D;
   }

   public axe n() {
      return this.E;
   }

   public axe o() {
      return this.F;
   }

   public static enum a {
      a,
      b;
   }
}
