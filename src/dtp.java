import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dtp(String r, boolean s, boolean t, boolean u, dtp.a v, dnk w, avn x, avn y, avn z, avn A, avn B, avn C, avn D, avn E) {
   private static final Map<String, dtp> F = new Object2ObjectArrayMap();
   public static final Codec<dtp> a = Codec.stringResolver(dtp::b, F::get);
   public static final dtp b = a(new dtp("iron", false, false, false, dtp.a.a, dnk.g, avo.nm, avo.nn, avo.nu, avo.nv, avo.oI, avo.oJ, avo.ze, avo.zf));
   public static final dtp c = a(new dtp("copper", true, true, false, dtp.a.a, dnk.aj, avo.fN, avo.fO, avo.fU, avo.fV, avo.oI, avo.oJ, avo.ze, avo.zf));
   public static final dtp d = a(new dtp("gold", false, true, false, dtp.a.a, dnk.g, avo.nm, avo.nn, avo.nu, avo.nv, avo.oI, avo.oJ, avo.ze, avo.zf));
   public static final dtp e = a(new dtp("stone", true, true, false, dtp.a.b, dnk.f, avo.nm, avo.nn, avo.nu, avo.nv, avo.zj, avo.zk, avo.ze, avo.zf));
   public static final dtp f = a(
      new dtp("polished_blackstone", true, true, false, dtp.a.b, dnk.f, avo.nm, avo.nn, avo.nu, avo.nv, avo.zj, avo.zk, avo.ze, avo.zf)
   );
   public static final dtp g = a(new dtp("oak"));
   public static final dtp h = a(new dtp("spruce"));
   public static final dtp i = a(new dtp("birch"));
   public static final dtp j = a(new dtp("acacia"));
   public static final dtp k = a(new dtp("cherry", true, true, true, dtp.a.a, dnk.aU, avo.eE, avo.eF, avo.eG, avo.eH, avo.eK, avo.eL, avo.eI, avo.eJ));
   public static final dtp l = a(new dtp("jungle"));
   public static final dtp m = a(new dtp("dark_oak"));
   public static final dtp n = a(new dtp("crimson", true, true, true, dtp.a.a, dnk.aT, avo.qO, avo.qP, avo.qQ, avo.qR, avo.qU, avo.qV, avo.qS, avo.qT));
   public static final dtp o = a(new dtp("warped", true, true, true, dtp.a.a, dnk.aT, avo.qO, avo.qP, avo.qQ, avo.qR, avo.qU, avo.qV, avo.qS, avo.qT));
   public static final dtp p = a(new dtp("mangrove"));
   public static final dtp q = a(new dtp("bamboo", true, true, true, dtp.a.a, dnk.aS, avo.bo, avo.bp, avo.bq, avo.br, avo.bu, avo.bv, avo.bs, avo.bt));

   public dtp(String $$0) {
      this($$0, true, true, true, dtp.a.a, dnk.b, avo.CV, avo.CW, avo.CX, avo.CY, avo.Db, avo.Dc, avo.CZ, avo.Da);
   }

   private static dtp a(dtp $$0) {
      F.put($$0.r, $$0);
      return $$0;
   }

   public static Stream<dtp> a() {
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

   public dtp.a f() {
      return this.v;
   }

   public dnk g() {
      return this.w;
   }

   public avn h() {
      return this.x;
   }

   public avn i() {
      return this.y;
   }

   public avn j() {
      return this.z;
   }

   public avn k() {
      return this.A;
   }

   public avn l() {
      return this.B;
   }

   public avn m() {
      return this.C;
   }

   public avn n() {
      return this.D;
   }

   public avn o() {
      return this.E;
   }

   public static enum a {
      a,
      b;
   }
}
