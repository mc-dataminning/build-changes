import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dss(String r, boolean s, boolean t, boolean u, dss.a v, dmn w, avz x, avz y, avz z, avz A, avz B, avz C, avz D, avz E) {
   private static final Map<String, dss> F = new Object2ObjectArrayMap();
   public static final Codec<dss> a = Codec.stringResolver(dss::b, F::get);
   public static final dss b = a(new dss("iron", false, false, false, dss.a.a, dmn.g, awa.nm, awa.nn, awa.nu, awa.nv, awa.oI, awa.oJ, awa.zb, awa.zc));
   public static final dss c = a(new dss("copper", true, true, false, dss.a.a, dmn.aj, awa.fN, awa.fO, awa.fU, awa.fV, awa.oI, awa.oJ, awa.zb, awa.zc));
   public static final dss d = a(new dss("gold", false, true, false, dss.a.a, dmn.g, awa.nm, awa.nn, awa.nu, awa.nv, awa.oI, awa.oJ, awa.zb, awa.zc));
   public static final dss e = a(new dss("stone", true, true, false, dss.a.b, dmn.f, awa.nm, awa.nn, awa.nu, awa.nv, awa.zg, awa.zh, awa.zb, awa.zc));
   public static final dss f = a(
      new dss("polished_blackstone", true, true, false, dss.a.b, dmn.f, awa.nm, awa.nn, awa.nu, awa.nv, awa.zg, awa.zh, awa.zb, awa.zc)
   );
   public static final dss g = a(new dss("oak"));
   public static final dss h = a(new dss("spruce"));
   public static final dss i = a(new dss("birch"));
   public static final dss j = a(new dss("acacia"));
   public static final dss k = a(new dss("cherry", true, true, true, dss.a.a, dmn.aU, awa.eE, awa.eF, awa.eG, awa.eH, awa.eK, awa.eL, awa.eI, awa.eJ));
   public static final dss l = a(new dss("jungle"));
   public static final dss m = a(new dss("dark_oak"));
   public static final dss n = a(new dss("crimson", true, true, true, dss.a.a, dmn.aT, awa.qL, awa.qM, awa.qN, awa.qO, awa.qR, awa.qS, awa.qP, awa.qQ));
   public static final dss o = a(new dss("warped", true, true, true, dss.a.a, dmn.aT, awa.qL, awa.qM, awa.qN, awa.qO, awa.qR, awa.qS, awa.qP, awa.qQ));
   public static final dss p = a(new dss("mangrove"));
   public static final dss q = a(new dss("bamboo", true, true, true, dss.a.a, dmn.aS, awa.bo, awa.bp, awa.bq, awa.br, awa.bu, awa.bv, awa.bs, awa.bt));

   public dss(String $$0) {
      this($$0, true, true, true, dss.a.a, dmn.b, awa.CR, awa.CS, awa.CT, awa.CU, awa.CX, awa.CY, awa.CV, awa.CW);
   }

   private static dss a(dss $$0) {
      F.put($$0.r, $$0);
      return $$0;
   }

   public static Stream<dss> a() {
      return F.values().stream();
   }

   public String b() {
      return this.r;
   }

   public boolean c() {
      return this.s;
   }

   public boolean d() {
      return this.t;
   }

   public boolean e() {
      return this.u;
   }

   public dss.a f() {
      return this.v;
   }

   public dmn g() {
      return this.w;
   }

   public avz h() {
      return this.x;
   }

   public avz i() {
      return this.y;
   }

   public avz j() {
      return this.z;
   }

   public avz k() {
      return this.A;
   }

   public avz l() {
      return this.B;
   }

   public avz m() {
      return this.C;
   }

   public avz n() {
      return this.D;
   }

   public avz o() {
      return this.E;
   }

   public static enum a {
      a,
      b;
   }
}
