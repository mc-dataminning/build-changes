import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dyj(String s, boolean t, boolean u, boolean v, dyj.a w, dsb x, axe y, axe z, axe A, axe B, axe C, axe D, axe E, axe F) {
   private static final Map<String, dyj> G = new Object2ObjectArrayMap();
   public static final Codec<dyj> a = Codec.stringResolver(dyj::b, G::get);
   public static final dyj b = a(new dyj("iron", false, false, false, dyj.a.a, dsb.g, axf.nE, axf.nF, axf.nM, axf.nN, axf.pa, axf.pb, axf.zD, axf.zE));
   public static final dyj c = a(new dyj("copper", true, true, false, dyj.a.a, dsb.aj, axf.fP, axf.fQ, axf.fW, axf.fX, axf.pa, axf.pb, axf.zD, axf.zE));
   public static final dyj d = a(new dyj("gold", false, true, false, dyj.a.a, dsb.g, axf.nE, axf.nF, axf.nM, axf.nN, axf.pa, axf.pb, axf.zD, axf.zE));
   public static final dyj e = a(new dyj("stone", true, true, false, dyj.a.b, dsb.f, axf.nE, axf.nF, axf.nM, axf.nN, axf.zI, axf.zJ, axf.zD, axf.zE));
   public static final dyj f = a(
      new dyj("polished_blackstone", true, true, false, dyj.a.b, dsb.f, axf.nE, axf.nF, axf.nM, axf.nN, axf.zI, axf.zJ, axf.zD, axf.zE)
   );
   public static final dyj g = a(new dyj("oak"));
   public static final dyj h = a(new dyj("spruce"));
   public static final dyj i = a(new dyj("birch"));
   public static final dyj j = a(new dyj("acacia"));
   public static final dyj k = a(new dyj("cherry", true, true, true, dyj.a.a, dsb.aU, axf.eG, axf.eH, axf.eI, axf.eJ, axf.eM, axf.eN, axf.eK, axf.eL));
   public static final dyj l = a(new dyj("jungle"));
   public static final dyj m = a(new dyj("dark_oak"));
   public static final dyj n = a(new dyj("pale_oak"));
   public static final dyj o = a(new dyj("crimson", true, true, true, dyj.a.a, dsb.aT, axf.rg, axf.rh, axf.ri, axf.rj, axf.rm, axf.rn, axf.rk, axf.rl));
   public static final dyj p = a(new dyj("warped", true, true, true, dyj.a.a, dsb.aT, axf.rg, axf.rh, axf.ri, axf.rj, axf.rm, axf.rn, axf.rk, axf.rl));
   public static final dyj q = a(new dyj("mangrove"));
   public static final dyj r = a(new dyj("bamboo", true, true, true, dyj.a.a, dsb.aS, axf.bo, axf.bp, axf.bq, axf.br, axf.bu, axf.bv, axf.bs, axf.bt));

   public dyj(String $$0) {
      this($$0, true, true, true, dyj.a.a, dsb.b, axf.Du, axf.Dv, axf.Dw, axf.Dx, axf.DA, axf.DB, axf.Dy, axf.Dz);
   }

   private static dyj a(dyj $$0) {
      G.put($$0.s, $$0);
      return $$0;
   }

   public static Stream<dyj> a() {
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

   public dyj.a f() {
      return this.w;
   }

   public dsb g() {
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
