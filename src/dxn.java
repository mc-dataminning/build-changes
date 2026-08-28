import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dxn(String s, boolean t, boolean u, boolean v, dxn.a w, drf x, avz y, avz z, avz A, avz B, avz C, avz D, avz E, avz F) {
   private static final Map<String, dxn> G = new Object2ObjectArrayMap();
   public static final Codec<dxn> a = Codec.stringResolver(dxn::b, G::get);
   public static final dxn b = a(new dxn("iron", false, false, false, dxn.a.a, drf.g, awa.nK, awa.nL, awa.nS, awa.nT, awa.pg, awa.ph, awa.zS, awa.zT));
   public static final dxn c = a(new dxn("copper", true, true, false, dxn.a.a, drf.aj, awa.fP, awa.fQ, awa.fW, awa.fX, awa.pg, awa.ph, awa.zS, awa.zT));
   public static final dxn d = a(new dxn("gold", false, true, false, dxn.a.a, drf.g, awa.nK, awa.nL, awa.nS, awa.nT, awa.pg, awa.ph, awa.zS, awa.zT));
   public static final dxn e = a(new dxn("stone", true, true, false, dxn.a.b, drf.f, awa.nK, awa.nL, awa.nS, awa.nT, awa.zX, awa.zY, awa.zS, awa.zT));
   public static final dxn f = a(
      new dxn("polished_blackstone", true, true, false, dxn.a.b, drf.f, awa.nK, awa.nL, awa.nS, awa.nT, awa.zX, awa.zY, awa.zS, awa.zT)
   );
   public static final dxn g = a(new dxn("oak"));
   public static final dxn h = a(new dxn("spruce"));
   public static final dxn i = a(new dxn("birch"));
   public static final dxn j = a(new dxn("acacia"));
   public static final dxn k = a(new dxn("cherry", true, true, true, dxn.a.a, drf.aU, awa.eG, awa.eH, awa.eI, awa.eJ, awa.eM, awa.eN, awa.eK, awa.eL));
   public static final dxn l = a(new dxn("jungle"));
   public static final dxn m = a(new dxn("dark_oak"));
   public static final dxn n = a(new dxn("pale_oak"));
   public static final dxn o = a(new dxn("crimson", true, true, true, dxn.a.a, drf.aT, awa.rm, awa.rn, awa.ro, awa.rp, awa.rs, awa.rt, awa.rq, awa.rr));
   public static final dxn p = a(new dxn("warped", true, true, true, dxn.a.a, drf.aT, awa.rm, awa.rn, awa.ro, awa.rp, awa.rs, awa.rt, awa.rq, awa.rr));
   public static final dxn q = a(new dxn("mangrove"));
   public static final dxn r = a(new dxn("bamboo", true, true, true, dxn.a.a, drf.aS, awa.bo, awa.bp, awa.bq, awa.br, awa.bu, awa.bv, awa.bs, awa.bt));

   public dxn(String $$0) {
      this($$0, true, true, true, dxn.a.a, drf.b, awa.DJ, awa.DK, awa.DL, awa.DM, awa.DP, awa.DQ, awa.DN, awa.DO);
   }

   private static dxn a(dxn $$0) {
      G.put($$0.s, $$0);
      return $$0;
   }

   public static Stream<dxn> a() {
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

   public dxn.a f() {
      return this.w;
   }

   public drf g() {
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
