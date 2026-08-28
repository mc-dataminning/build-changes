import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dsr(String r, boolean s, boolean t, boolean u, dsr.a v, dmm w, avz x, avz y, avz z, avz A, avz B, avz C, avz D, avz E) {
   private static final Map<String, dsr> F = new Object2ObjectArrayMap();
   public static final Codec<dsr> a = Codec.stringResolver(dsr::b, F::get);
   public static final dsr b = a(new dsr("iron", false, false, false, dsr.a.a, dmm.g, awa.nm, awa.nn, awa.nu, awa.nv, awa.oI, awa.oJ, awa.zb, awa.zc));
   public static final dsr c = a(new dsr("copper", true, true, false, dsr.a.a, dmm.aj, awa.fN, awa.fO, awa.fU, awa.fV, awa.oI, awa.oJ, awa.zb, awa.zc));
   public static final dsr d = a(new dsr("gold", false, true, false, dsr.a.a, dmm.g, awa.nm, awa.nn, awa.nu, awa.nv, awa.oI, awa.oJ, awa.zb, awa.zc));
   public static final dsr e = a(new dsr("stone", true, true, false, dsr.a.b, dmm.f, awa.nm, awa.nn, awa.nu, awa.nv, awa.zg, awa.zh, awa.zb, awa.zc));
   public static final dsr f = a(
      new dsr("polished_blackstone", true, true, false, dsr.a.b, dmm.f, awa.nm, awa.nn, awa.nu, awa.nv, awa.zg, awa.zh, awa.zb, awa.zc)
   );
   public static final dsr g = a(new dsr("oak"));
   public static final dsr h = a(new dsr("spruce"));
   public static final dsr i = a(new dsr("birch"));
   public static final dsr j = a(new dsr("acacia"));
   public static final dsr k = a(new dsr("cherry", true, true, true, dsr.a.a, dmm.aU, awa.eE, awa.eF, awa.eG, awa.eH, awa.eK, awa.eL, awa.eI, awa.eJ));
   public static final dsr l = a(new dsr("jungle"));
   public static final dsr m = a(new dsr("dark_oak"));
   public static final dsr n = a(new dsr("crimson", true, true, true, dsr.a.a, dmm.aT, awa.qL, awa.qM, awa.qN, awa.qO, awa.qR, awa.qS, awa.qP, awa.qQ));
   public static final dsr o = a(new dsr("warped", true, true, true, dsr.a.a, dmm.aT, awa.qL, awa.qM, awa.qN, awa.qO, awa.qR, awa.qS, awa.qP, awa.qQ));
   public static final dsr p = a(new dsr("mangrove"));
   public static final dsr q = a(new dsr("bamboo", true, true, true, dsr.a.a, dmm.aS, awa.bo, awa.bp, awa.bq, awa.br, awa.bu, awa.bv, awa.bs, awa.bt));

   public dsr(String $$0) {
      this($$0, true, true, true, dsr.a.a, dmm.b, awa.CR, awa.CS, awa.CT, awa.CU, awa.CX, awa.CY, awa.CV, awa.CW);
   }

   private static dsr a(dsr $$0) {
      F.put($$0.r, $$0);
      return $$0;
   }

   public static Stream<dsr> a() {
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

   public dsr.a f() {
      return this.v;
   }

   public dmm g() {
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
