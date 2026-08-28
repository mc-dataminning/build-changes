import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dxl(String s, boolean t, boolean u, boolean v, dxl.a w, drd x, avz y, avz z, avz A, avz B, avz C, avz D, avz E, avz F) {
   private static final Map<String, dxl> G = new Object2ObjectArrayMap();
   public static final Codec<dxl> a = Codec.stringResolver(dxl::b, G::get);
   public static final dxl b = a(new dxl("iron", false, false, false, dxl.a.a, drd.g, awa.nK, awa.nL, awa.nS, awa.nT, awa.pg, awa.ph, awa.zS, awa.zT));
   public static final dxl c = a(new dxl("copper", true, true, false, dxl.a.a, drd.aj, awa.fP, awa.fQ, awa.fW, awa.fX, awa.pg, awa.ph, awa.zS, awa.zT));
   public static final dxl d = a(new dxl("gold", false, true, false, dxl.a.a, drd.g, awa.nK, awa.nL, awa.nS, awa.nT, awa.pg, awa.ph, awa.zS, awa.zT));
   public static final dxl e = a(new dxl("stone", true, true, false, dxl.a.b, drd.f, awa.nK, awa.nL, awa.nS, awa.nT, awa.zX, awa.zY, awa.zS, awa.zT));
   public static final dxl f = a(
      new dxl("polished_blackstone", true, true, false, dxl.a.b, drd.f, awa.nK, awa.nL, awa.nS, awa.nT, awa.zX, awa.zY, awa.zS, awa.zT)
   );
   public static final dxl g = a(new dxl("oak"));
   public static final dxl h = a(new dxl("spruce"));
   public static final dxl i = a(new dxl("birch"));
   public static final dxl j = a(new dxl("acacia"));
   public static final dxl k = a(new dxl("cherry", true, true, true, dxl.a.a, drd.aU, awa.eG, awa.eH, awa.eI, awa.eJ, awa.eM, awa.eN, awa.eK, awa.eL));
   public static final dxl l = a(new dxl("jungle"));
   public static final dxl m = a(new dxl("dark_oak"));
   public static final dxl n = a(new dxl("pale_oak"));
   public static final dxl o = a(new dxl("crimson", true, true, true, dxl.a.a, drd.aT, awa.rm, awa.rn, awa.ro, awa.rp, awa.rs, awa.rt, awa.rq, awa.rr));
   public static final dxl p = a(new dxl("warped", true, true, true, dxl.a.a, drd.aT, awa.rm, awa.rn, awa.ro, awa.rp, awa.rs, awa.rt, awa.rq, awa.rr));
   public static final dxl q = a(new dxl("mangrove"));
   public static final dxl r = a(new dxl("bamboo", true, true, true, dxl.a.a, drd.aS, awa.bo, awa.bp, awa.bq, awa.br, awa.bu, awa.bv, awa.bs, awa.bt));

   public dxl(String $$0) {
      this($$0, true, true, true, dxl.a.a, drd.b, awa.DJ, awa.DK, awa.DL, awa.DM, awa.DP, awa.DQ, awa.DN, awa.DO);
   }

   private static dxl a(dxl $$0) {
      G.put($$0.s, $$0);
      return $$0;
   }

   public static Stream<dxl> a() {
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

   public dxl.a f() {
      return this.w;
   }

   public drd g() {
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
