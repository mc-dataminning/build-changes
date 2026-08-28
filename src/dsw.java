import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dsw(String r, boolean s, boolean t, boolean u, dsw.a v, dms w, ave x, ave y, ave z, ave A, ave B, ave C, ave D, ave E) {
   private static final Map<String, dsw> F = new Object2ObjectArrayMap();
   public static final Codec<dsw> a = Codec.stringResolver(dsw::b, F::get);
   public static final dsw b = a(new dsw("iron", false, false, false, dsw.a.a, dms.g, avf.nm, avf.nn, avf.nu, avf.nv, avf.oI, avf.oJ, avf.ze, avf.zf));
   public static final dsw c = a(new dsw("copper", true, true, false, dsw.a.a, dms.aj, avf.fN, avf.fO, avf.fU, avf.fV, avf.oI, avf.oJ, avf.ze, avf.zf));
   public static final dsw d = a(new dsw("gold", false, true, false, dsw.a.a, dms.g, avf.nm, avf.nn, avf.nu, avf.nv, avf.oI, avf.oJ, avf.ze, avf.zf));
   public static final dsw e = a(new dsw("stone", true, true, false, dsw.a.b, dms.f, avf.nm, avf.nn, avf.nu, avf.nv, avf.zj, avf.zk, avf.ze, avf.zf));
   public static final dsw f = a(
      new dsw("polished_blackstone", true, true, false, dsw.a.b, dms.f, avf.nm, avf.nn, avf.nu, avf.nv, avf.zj, avf.zk, avf.ze, avf.zf)
   );
   public static final dsw g = a(new dsw("oak"));
   public static final dsw h = a(new dsw("spruce"));
   public static final dsw i = a(new dsw("birch"));
   public static final dsw j = a(new dsw("acacia"));
   public static final dsw k = a(new dsw("cherry", true, true, true, dsw.a.a, dms.aU, avf.eE, avf.eF, avf.eG, avf.eH, avf.eK, avf.eL, avf.eI, avf.eJ));
   public static final dsw l = a(new dsw("jungle"));
   public static final dsw m = a(new dsw("dark_oak"));
   public static final dsw n = a(new dsw("crimson", true, true, true, dsw.a.a, dms.aT, avf.qO, avf.qP, avf.qQ, avf.qR, avf.qU, avf.qV, avf.qS, avf.qT));
   public static final dsw o = a(new dsw("warped", true, true, true, dsw.a.a, dms.aT, avf.qO, avf.qP, avf.qQ, avf.qR, avf.qU, avf.qV, avf.qS, avf.qT));
   public static final dsw p = a(new dsw("mangrove"));
   public static final dsw q = a(new dsw("bamboo", true, true, true, dsw.a.a, dms.aS, avf.bo, avf.bp, avf.bq, avf.br, avf.bu, avf.bv, avf.bs, avf.bt));

   public dsw(String $$0) {
      this($$0, true, true, true, dsw.a.a, dms.b, avf.CU, avf.CV, avf.CW, avf.CX, avf.Da, avf.Db, avf.CY, avf.CZ);
   }

   private static dsw a(dsw $$0) {
      F.put($$0.r, $$0);
      return $$0;
   }

   public static Stream<dsw> a() {
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

   public dsw.a f() {
      return this.v;
   }

   public dms g() {
      return this.w;
   }

   public ave h() {
      return this.x;
   }

   public ave i() {
      return this.y;
   }

   public ave j() {
      return this.z;
   }

   public ave k() {
      return this.A;
   }

   public ave l() {
      return this.B;
   }

   public ave m() {
      return this.C;
   }

   public ave n() {
      return this.D;
   }

   public ave o() {
      return this.E;
   }

   public static enum a {
      a,
      b;
   }
}
