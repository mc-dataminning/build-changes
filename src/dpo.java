import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dpo(String r, boolean s, boolean t, boolean u, dpo.a v, djk w, aul x, aul y, aul z, aul A, aul B, aul C, aul D, aul E) {
   private static final Map<String, dpo> F = new Object2ObjectArrayMap();
   public static final Codec<dpo> a = aws.a(dpo::b, F::get);
   public static final dpo b = a(new dpo("iron", false, false, false, dpo.a.a, djk.g, aum.mX, aum.mY, aum.nf, aum.ng, aum.oq, aum.or, aum.yI, aum.yJ));
   public static final dpo c = a(new dpo("copper", true, true, false, dpo.a.a, djk.aj, aum.fI, aum.fJ, aum.fP, aum.fQ, aum.oq, aum.or, aum.yI, aum.yJ));
   public static final dpo d = a(new dpo("gold", false, true, false, dpo.a.a, djk.g, aum.mX, aum.mY, aum.nf, aum.ng, aum.oq, aum.or, aum.yI, aum.yJ));
   public static final dpo e = a(new dpo("stone", true, true, false, dpo.a.b, djk.f, aum.mX, aum.mY, aum.nf, aum.ng, aum.yN, aum.yO, aum.yI, aum.yJ));
   public static final dpo f = a(
      new dpo("polished_blackstone", true, true, false, dpo.a.b, djk.f, aum.mX, aum.mY, aum.nf, aum.ng, aum.yN, aum.yO, aum.yI, aum.yJ)
   );
   public static final dpo g = a(new dpo("oak"));
   public static final dpo h = a(new dpo("spruce"));
   public static final dpo i = a(new dpo("birch"));
   public static final dpo j = a(new dpo("acacia"));
   public static final dpo k = a(new dpo("cherry", true, true, true, dpo.a.a, djk.aU, aum.eE, aum.eF, aum.eG, aum.eH, aum.eK, aum.eL, aum.eI, aum.eJ));
   public static final dpo l = a(new dpo("jungle"));
   public static final dpo m = a(new dpo("dark_oak"));
   public static final dpo n = a(new dpo("crimson", true, true, true, dpo.a.a, djk.aT, aum.qt, aum.qu, aum.qv, aum.qw, aum.qz, aum.qA, aum.qx, aum.qy));
   public static final dpo o = a(new dpo("warped", true, true, true, dpo.a.a, djk.aT, aum.qt, aum.qu, aum.qv, aum.qw, aum.qz, aum.qA, aum.qx, aum.qy));
   public static final dpo p = a(new dpo("mangrove"));
   public static final dpo q = a(new dpo("bamboo", true, true, true, dpo.a.a, djk.aS, aum.bo, aum.bp, aum.bq, aum.br, aum.bu, aum.bv, aum.bs, aum.bt));

   public dpo(String $$0) {
      this($$0, true, true, true, dpo.a.a, djk.b, aum.Cy, aum.Cz, aum.CA, aum.CB, aum.CE, aum.CF, aum.CC, aum.CD);
   }

   private static dpo a(dpo $$0) {
      F.put($$0.r, $$0);
      return $$0;
   }

   public static Stream<dpo> a() {
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

   public dpo.a f() {
      return this.v;
   }

   public djk g() {
      return this.w;
   }

   public aul h() {
      return this.x;
   }

   public aul i() {
      return this.y;
   }

   public aul j() {
      return this.z;
   }

   public aul k() {
      return this.A;
   }

   public aul l() {
      return this.B;
   }

   public aul m() {
      return this.C;
   }

   public aul n() {
      return this.D;
   }

   public aul o() {
      return this.E;
   }

   public static enum a {
      a,
      b;
   }
}
