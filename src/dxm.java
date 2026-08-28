import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dxm(String s, boolean t, boolean u, boolean v, dxm.a w, dre x, avz y, avz z, avz A, avz B, avz C, avz D, avz E, avz F) {
   private static final Map<String, dxm> G = new Object2ObjectArrayMap();
   public static final Codec<dxm> a = Codec.stringResolver(dxm::b, G::get);
   public static final dxm b = a(new dxm("iron", false, false, false, dxm.a.a, dre.g, awa.nK, awa.nL, awa.nS, awa.nT, awa.pg, awa.ph, awa.zS, awa.zT));
   public static final dxm c = a(new dxm("copper", true, true, false, dxm.a.a, dre.aj, awa.fP, awa.fQ, awa.fW, awa.fX, awa.pg, awa.ph, awa.zS, awa.zT));
   public static final dxm d = a(new dxm("gold", false, true, false, dxm.a.a, dre.g, awa.nK, awa.nL, awa.nS, awa.nT, awa.pg, awa.ph, awa.zS, awa.zT));
   public static final dxm e = a(new dxm("stone", true, true, false, dxm.a.b, dre.f, awa.nK, awa.nL, awa.nS, awa.nT, awa.zX, awa.zY, awa.zS, awa.zT));
   public static final dxm f = a(
      new dxm("polished_blackstone", true, true, false, dxm.a.b, dre.f, awa.nK, awa.nL, awa.nS, awa.nT, awa.zX, awa.zY, awa.zS, awa.zT)
   );
   public static final dxm g = a(new dxm("oak"));
   public static final dxm h = a(new dxm("spruce"));
   public static final dxm i = a(new dxm("birch"));
   public static final dxm j = a(new dxm("acacia"));
   public static final dxm k = a(new dxm("cherry", true, true, true, dxm.a.a, dre.aU, awa.eG, awa.eH, awa.eI, awa.eJ, awa.eM, awa.eN, awa.eK, awa.eL));
   public static final dxm l = a(new dxm("jungle"));
   public static final dxm m = a(new dxm("dark_oak"));
   public static final dxm n = a(new dxm("pale_oak"));
   public static final dxm o = a(new dxm("crimson", true, true, true, dxm.a.a, dre.aT, awa.rm, awa.rn, awa.ro, awa.rp, awa.rs, awa.rt, awa.rq, awa.rr));
   public static final dxm p = a(new dxm("warped", true, true, true, dxm.a.a, dre.aT, awa.rm, awa.rn, awa.ro, awa.rp, awa.rs, awa.rt, awa.rq, awa.rr));
   public static final dxm q = a(new dxm("mangrove"));
   public static final dxm r = a(new dxm("bamboo", true, true, true, dxm.a.a, dre.aS, awa.bo, awa.bp, awa.bq, awa.br, awa.bu, awa.bv, awa.bs, awa.bt));

   public dxm(String $$0) {
      this($$0, true, true, true, dxm.a.a, dre.b, awa.DJ, awa.DK, awa.DL, awa.DM, awa.DP, awa.DQ, awa.DN, awa.DO);
   }

   private static dxm a(dxm $$0) {
      G.put($$0.s, $$0);
      return $$0;
   }

   public static Stream<dxm> a() {
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

   public dxm.a f() {
      return this.w;
   }

   public dre g() {
      return this.x;
   }

   public avz h() {
      return this.y;
   }

   public avz i() {
      return this.z;
   }

   public avz j() {
      return this.A;
   }

   public avz k() {
      return this.B;
   }

   public avz l() {
      return this.C;
   }

   public avz m() {
      return this.D;
   }

   public avz n() {
      return this.E;
   }

   public avz o() {
      return this.F;
   }

   public static enum a {
      a,
      b;
   }
}
