import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dyc(String s, boolean t, boolean u, boolean v, dyc.a w, dru x, axe y, axe z, axe A, axe B, axe C, axe D, axe E, axe F) {
   private static final Map<String, dyc> G = new Object2ObjectArrayMap();
   public static final Codec<dyc> a = Codec.stringResolver(dyc::b, G::get);
   public static final dyc b = a(new dyc("iron", false, false, false, dyc.a.a, dru.g, axf.nD, axf.nE, axf.nL, axf.nM, axf.oZ, axf.pa, axf.zC, axf.zD));
   public static final dyc c = a(new dyc("copper", true, true, false, dyc.a.a, dru.aj, axf.fO, axf.fP, axf.fV, axf.fW, axf.oZ, axf.pa, axf.zC, axf.zD));
   public static final dyc d = a(new dyc("gold", false, true, false, dyc.a.a, dru.g, axf.nD, axf.nE, axf.nL, axf.nM, axf.oZ, axf.pa, axf.zC, axf.zD));
   public static final dyc e = a(new dyc("stone", true, true, false, dyc.a.b, dru.f, axf.nD, axf.nE, axf.nL, axf.nM, axf.zH, axf.zI, axf.zC, axf.zD));
   public static final dyc f = a(
      new dyc("polished_blackstone", true, true, false, dyc.a.b, dru.f, axf.nD, axf.nE, axf.nL, axf.nM, axf.zH, axf.zI, axf.zC, axf.zD)
   );
   public static final dyc g = a(new dyc("oak"));
   public static final dyc h = a(new dyc("spruce"));
   public static final dyc i = a(new dyc("birch"));
   public static final dyc j = a(new dyc("acacia"));
   public static final dyc k = a(new dyc("cherry", true, true, true, dyc.a.a, dru.aU, axf.eF, axf.eG, axf.eH, axf.eI, axf.eL, axf.eM, axf.eJ, axf.eK));
   public static final dyc l = a(new dyc("jungle"));
   public static final dyc m = a(new dyc("dark_oak"));
   public static final dyc n = a(new dyc("pale_oak"));
   public static final dyc o = a(new dyc("crimson", true, true, true, dyc.a.a, dru.aT, axf.rf, axf.rg, axf.rh, axf.ri, axf.rl, axf.rm, axf.rj, axf.rk));
   public static final dyc p = a(new dyc("warped", true, true, true, dyc.a.a, dru.aT, axf.rf, axf.rg, axf.rh, axf.ri, axf.rl, axf.rm, axf.rj, axf.rk));
   public static final dyc q = a(new dyc("mangrove"));
   public static final dyc r = a(new dyc("bamboo", true, true, true, dyc.a.a, dru.aS, axf.bo, axf.bp, axf.bq, axf.br, axf.bu, axf.bv, axf.bs, axf.bt));

   public dyc(String $$0) {
      this($$0, true, true, true, dyc.a.a, dru.b, axf.Dt, axf.Du, axf.Dv, axf.Dw, axf.Dz, axf.DA, axf.Dx, axf.Dy);
   }

   private static dyc a(dyc $$0) {
      G.put($$0.s, $$0);
      return $$0;
   }

   public static Stream<dyc> a() {
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

   public dyc.a f() {
      return this.w;
   }

   public dru g() {
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
