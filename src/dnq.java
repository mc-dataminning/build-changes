import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dnq(String r, boolean s, boolean t, boolean u, dnq.a v, dho w, atx x, atx y, atx z, atx A, atx B, atx C, atx D, atx E) {
   private static final Map<String, dnq> F = new Object2ObjectArrayMap();
   public static final Codec<dnq> a = awe.a(dnq::b, F::get);
   public static final dnq b = a(new dnq("iron", false, false, false, dnq.a.a, dho.g, aty.mV, aty.mW, aty.nd, aty.ne, aty.oo, aty.op, aty.yF, aty.yG));
   public static final dnq c = a(new dnq("copper", true, true, false, dnq.a.a, dho.aj, aty.fH, aty.fI, aty.fO, aty.fP, aty.oo, aty.op, aty.yF, aty.yG));
   public static final dnq d = a(new dnq("gold", false, true, false, dnq.a.a, dho.g, aty.mV, aty.mW, aty.nd, aty.ne, aty.oo, aty.op, aty.yF, aty.yG));
   public static final dnq e = a(new dnq("stone", true, true, false, dnq.a.b, dho.f, aty.mV, aty.mW, aty.nd, aty.ne, aty.yK, aty.yL, aty.yF, aty.yG));
   public static final dnq f = a(
      new dnq("polished_blackstone", true, true, false, dnq.a.b, dho.f, aty.mV, aty.mW, aty.nd, aty.ne, aty.yK, aty.yL, aty.yF, aty.yG)
   );
   public static final dnq g = a(new dnq("oak"));
   public static final dnq h = a(new dnq("spruce"));
   public static final dnq i = a(new dnq("birch"));
   public static final dnq j = a(new dnq("acacia"));
   public static final dnq k = a(new dnq("cherry", true, true, true, dnq.a.a, dho.aU, aty.eD, aty.eE, aty.eF, aty.eG, aty.eJ, aty.eK, aty.eH, aty.eI));
   public static final dnq l = a(new dnq("jungle"));
   public static final dnq m = a(new dnq("dark_oak"));
   public static final dnq n = a(new dnq("crimson", true, true, true, dnq.a.a, dho.aT, aty.qq, aty.qr, aty.qs, aty.qt, aty.qw, aty.qx, aty.qu, aty.qv));
   public static final dnq o = a(new dnq("warped", true, true, true, dnq.a.a, dho.aT, aty.qq, aty.qr, aty.qs, aty.qt, aty.qw, aty.qx, aty.qu, aty.qv));
   public static final dnq p = a(new dnq("mangrove"));
   public static final dnq q = a(new dnq("bamboo", true, true, true, dnq.a.a, dho.aS, aty.bo, aty.bp, aty.bq, aty.br, aty.bu, aty.bv, aty.bs, aty.bt));

   public dnq(String $$0) {
      this($$0, true, true, true, dnq.a.a, dho.b, aty.Cq, aty.Cr, aty.Cs, aty.Ct, aty.Cw, aty.Cx, aty.Cu, aty.Cv);
   }

   private static dnq a(dnq $$0) {
      F.put($$0.r, $$0);
      return $$0;
   }

   public static Stream<dnq> a() {
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

   public dnq.a f() {
      return this.v;
   }

   public dho g() {
      return this.w;
   }

   public atx h() {
      return this.x;
   }

   public atx i() {
      return this.y;
   }

   public atx j() {
      return this.z;
   }

   public atx k() {
      return this.A;
   }

   public atx l() {
      return this.B;
   }

   public atx m() {
      return this.C;
   }

   public atx n() {
      return this.D;
   }

   public atx o() {
      return this.E;
   }

   public static enum a {
      a,
      b;
   }
}
