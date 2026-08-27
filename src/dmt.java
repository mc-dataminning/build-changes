import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dmt(String r, boolean s, boolean t, boolean u, dmt.a v, dgr w, ato x, ato y, ato z, ato A, ato B, ato C, ato D, ato E) {
   private static final Map<String, dmt> F = new Object2ObjectArrayMap();
   public static final Codec<dmt> a = avu.a(dmt::b, F::get);
   public static final dmt b = a(new dmt("iron", false, false, false, dmt.a.a, dgr.g, atp.mO, atp.mP, atp.mW, atp.mX, atp.oh, atp.oi, atp.yx, atp.yy));
   public static final dmt c = a(new dmt("copper", true, true, false, dmt.a.a, dgr.aj, atp.fA, atp.fB, atp.fH, atp.fI, atp.oh, atp.oi, atp.yx, atp.yy));
   public static final dmt d = a(new dmt("gold", false, true, false, dmt.a.a, dgr.g, atp.mO, atp.mP, atp.mW, atp.mX, atp.oh, atp.oi, atp.yx, atp.yy));
   public static final dmt e = a(new dmt("stone", true, true, false, dmt.a.b, dgr.f, atp.mO, atp.mP, atp.mW, atp.mX, atp.yC, atp.yD, atp.yx, atp.yy));
   public static final dmt f = a(
      new dmt("polished_blackstone", true, true, false, dmt.a.b, dgr.f, atp.mO, atp.mP, atp.mW, atp.mX, atp.yC, atp.yD, atp.yx, atp.yy)
   );
   public static final dmt g = a(new dmt("oak"));
   public static final dmt h = a(new dmt("spruce"));
   public static final dmt i = a(new dmt("birch"));
   public static final dmt j = a(new dmt("acacia"));
   public static final dmt k = a(new dmt("cherry", true, true, true, dmt.a.a, dgr.aU, atp.ew, atp.ex, atp.ey, atp.ez, atp.eC, atp.eD, atp.eA, atp.eB));
   public static final dmt l = a(new dmt("jungle"));
   public static final dmt m = a(new dmt("dark_oak"));
   public static final dmt n = a(new dmt("crimson", true, true, true, dmt.a.a, dgr.aT, atp.qj, atp.qk, atp.ql, atp.qm, atp.qp, atp.qq, atp.qn, atp.qo));
   public static final dmt o = a(new dmt("warped", true, true, true, dmt.a.a, dgr.aT, atp.qj, atp.qk, atp.ql, atp.qm, atp.qp, atp.qq, atp.qn, atp.qo));
   public static final dmt p = a(new dmt("mangrove"));
   public static final dmt q = a(new dmt("bamboo", true, true, true, dmt.a.a, dgr.aS, atp.bm, atp.bn, atp.bo, atp.bp, atp.bs, atp.bt, atp.bq, atp.br));

   public dmt(String $$0) {
      this($$0, true, true, true, dmt.a.a, dgr.b, atp.Ch, atp.Ci, atp.Cj, atp.Ck, atp.Cn, atp.Co, atp.Cl, atp.Cm);
   }

   private static dmt a(dmt $$0) {
      F.put($$0.r, $$0);
      return $$0;
   }

   public static Stream<dmt> a() {
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

   public dmt.a f() {
      return this.v;
   }

   public dgr g() {
      return this.w;
   }

   public ato h() {
      return this.x;
   }

   public ato i() {
      return this.y;
   }

   public ato j() {
      return this.z;
   }

   public ato k() {
      return this.A;
   }

   public ato l() {
      return this.B;
   }

   public ato m() {
      return this.C;
   }

   public ato n() {
      return this.D;
   }

   public ato o() {
      return this.E;
   }

   public static enum a {
      a,
      b;
   }
}
