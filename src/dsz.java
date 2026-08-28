import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dsz(String r, boolean s, boolean t, boolean u, dsz.a v, dmu w, avg x, avg y, avg z, avg A, avg B, avg C, avg D, avg E) {
   private static final Map<String, dsz> F = new Object2ObjectArrayMap();
   public static final Codec<dsz> a = Codec.stringResolver(dsz::b, F::get);
   public static final dsz b = a(new dsz("iron", false, false, false, dsz.a.a, dmu.g, avh.nm, avh.nn, avh.nu, avh.nv, avh.oI, avh.oJ, avh.ze, avh.zf));
   public static final dsz c = a(new dsz("copper", true, true, false, dsz.a.a, dmu.aj, avh.fN, avh.fO, avh.fU, avh.fV, avh.oI, avh.oJ, avh.ze, avh.zf));
   public static final dsz d = a(new dsz("gold", false, true, false, dsz.a.a, dmu.g, avh.nm, avh.nn, avh.nu, avh.nv, avh.oI, avh.oJ, avh.ze, avh.zf));
   public static final dsz e = a(new dsz("stone", true, true, false, dsz.a.b, dmu.f, avh.nm, avh.nn, avh.nu, avh.nv, avh.zj, avh.zk, avh.ze, avh.zf));
   public static final dsz f = a(
      new dsz("polished_blackstone", true, true, false, dsz.a.b, dmu.f, avh.nm, avh.nn, avh.nu, avh.nv, avh.zj, avh.zk, avh.ze, avh.zf)
   );
   public static final dsz g = a(new dsz("oak"));
   public static final dsz h = a(new dsz("spruce"));
   public static final dsz i = a(new dsz("birch"));
   public static final dsz j = a(new dsz("acacia"));
   public static final dsz k = a(new dsz("cherry", true, true, true, dsz.a.a, dmu.aU, avh.eE, avh.eF, avh.eG, avh.eH, avh.eK, avh.eL, avh.eI, avh.eJ));
   public static final dsz l = a(new dsz("jungle"));
   public static final dsz m = a(new dsz("dark_oak"));
   public static final dsz n = a(new dsz("crimson", true, true, true, dsz.a.a, dmu.aT, avh.qO, avh.qP, avh.qQ, avh.qR, avh.qU, avh.qV, avh.qS, avh.qT));
   public static final dsz o = a(new dsz("warped", true, true, true, dsz.a.a, dmu.aT, avh.qO, avh.qP, avh.qQ, avh.qR, avh.qU, avh.qV, avh.qS, avh.qT));
   public static final dsz p = a(new dsz("mangrove"));
   public static final dsz q = a(new dsz("bamboo", true, true, true, dsz.a.a, dmu.aS, avh.bo, avh.bp, avh.bq, avh.br, avh.bu, avh.bv, avh.bs, avh.bt));

   public dsz(String $$0) {
      this($$0, true, true, true, dsz.a.a, dmu.b, avh.CU, avh.CV, avh.CW, avh.CX, avh.Da, avh.Db, avh.CY, avh.CZ);
   }

   private static dsz a(dsz $$0) {
      F.put($$0.r, $$0);
      return $$0;
   }

   public static Stream<dsz> a() {
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

   public dsz.a f() {
      return this.v;
   }

   public dmu g() {
      return this.w;
   }

   public avg h() {
      return this.x;
   }

   public avg i() {
      return this.y;
   }

   public avg j() {
      return this.z;
   }

   public avg k() {
      return this.A;
   }

   public avg l() {
      return this.B;
   }

   public avg m() {
      return this.C;
   }

   public avg n() {
      return this.D;
   }

   public avg o() {
      return this.E;
   }

   public static enum a {
      a,
      b;
   }
}
