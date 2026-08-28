import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dtr(String r, boolean s, boolean t, boolean u, dtr.a v, dnm w, avo x, avo y, avo z, avo A, avo B, avo C, avo D, avo E) {
   private static final Map<String, dtr> F = new Object2ObjectArrayMap();
   public static final Codec<dtr> a = Codec.stringResolver(dtr::b, F::get);
   public static final dtr b = a(new dtr("iron", false, false, false, dtr.a.a, dnm.g, avp.nm, avp.nn, avp.nu, avp.nv, avp.oI, avp.oJ, avp.ze, avp.zf));
   public static final dtr c = a(new dtr("copper", true, true, false, dtr.a.a, dnm.aj, avp.fN, avp.fO, avp.fU, avp.fV, avp.oI, avp.oJ, avp.ze, avp.zf));
   public static final dtr d = a(new dtr("gold", false, true, false, dtr.a.a, dnm.g, avp.nm, avp.nn, avp.nu, avp.nv, avp.oI, avp.oJ, avp.ze, avp.zf));
   public static final dtr e = a(new dtr("stone", true, true, false, dtr.a.b, dnm.f, avp.nm, avp.nn, avp.nu, avp.nv, avp.zj, avp.zk, avp.ze, avp.zf));
   public static final dtr f = a(
      new dtr("polished_blackstone", true, true, false, dtr.a.b, dnm.f, avp.nm, avp.nn, avp.nu, avp.nv, avp.zj, avp.zk, avp.ze, avp.zf)
   );
   public static final dtr g = a(new dtr("oak"));
   public static final dtr h = a(new dtr("spruce"));
   public static final dtr i = a(new dtr("birch"));
   public static final dtr j = a(new dtr("acacia"));
   public static final dtr k = a(new dtr("cherry", true, true, true, dtr.a.a, dnm.aU, avp.eE, avp.eF, avp.eG, avp.eH, avp.eK, avp.eL, avp.eI, avp.eJ));
   public static final dtr l = a(new dtr("jungle"));
   public static final dtr m = a(new dtr("dark_oak"));
   public static final dtr n = a(new dtr("crimson", true, true, true, dtr.a.a, dnm.aT, avp.qO, avp.qP, avp.qQ, avp.qR, avp.qU, avp.qV, avp.qS, avp.qT));
   public static final dtr o = a(new dtr("warped", true, true, true, dtr.a.a, dnm.aT, avp.qO, avp.qP, avp.qQ, avp.qR, avp.qU, avp.qV, avp.qS, avp.qT));
   public static final dtr p = a(new dtr("mangrove"));
   public static final dtr q = a(new dtr("bamboo", true, true, true, dtr.a.a, dnm.aS, avp.bo, avp.bp, avp.bq, avp.br, avp.bu, avp.bv, avp.bs, avp.bt));

   public dtr(String $$0) {
      this($$0, true, true, true, dtr.a.a, dnm.b, avp.CV, avp.CW, avp.CX, avp.CY, avp.Db, avp.Dc, avp.CZ, avp.Da);
   }

   private static dtr a(dtr $$0) {
      F.put($$0.r, $$0);
      return $$0;
   }

   public static Stream<dtr> a() {
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

   public dtr.a f() {
      return this.v;
   }

   public dnm g() {
      return this.w;
   }

   public avo h() {
      return this.x;
   }

   public avo i() {
      return this.y;
   }

   public avo j() {
      return this.z;
   }

   public avo k() {
      return this.A;
   }

   public avo l() {
      return this.B;
   }

   public avo m() {
      return this.C;
   }

   public avo n() {
      return this.D;
   }

   public avo o() {
      return this.E;
   }

   public static enum a {
      a,
      b;
   }
}
