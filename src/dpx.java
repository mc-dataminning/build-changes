import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dpx(String r, boolean s, boolean t, boolean u, dpx.a v, djt w, aun x, aun y, aun z, aun A, aun B, aun C, aun D, aun E) {
   private static final Map<String, dpx> F = new Object2ObjectArrayMap();
   public static final Codec<dpx> a = awu.a(dpx::b, F::get);
   public static final dpx b = a(new dpx("iron", false, false, false, dpx.a.a, djt.g, auo.mX, auo.mY, auo.nf, auo.ng, auo.oq, auo.or, auo.yI, auo.yJ));
   public static final dpx c = a(new dpx("copper", true, true, false, dpx.a.a, djt.aj, auo.fI, auo.fJ, auo.fP, auo.fQ, auo.oq, auo.or, auo.yI, auo.yJ));
   public static final dpx d = a(new dpx("gold", false, true, false, dpx.a.a, djt.g, auo.mX, auo.mY, auo.nf, auo.ng, auo.oq, auo.or, auo.yI, auo.yJ));
   public static final dpx e = a(new dpx("stone", true, true, false, dpx.a.b, djt.f, auo.mX, auo.mY, auo.nf, auo.ng, auo.yN, auo.yO, auo.yI, auo.yJ));
   public static final dpx f = a(
      new dpx("polished_blackstone", true, true, false, dpx.a.b, djt.f, auo.mX, auo.mY, auo.nf, auo.ng, auo.yN, auo.yO, auo.yI, auo.yJ)
   );
   public static final dpx g = a(new dpx("oak"));
   public static final dpx h = a(new dpx("spruce"));
   public static final dpx i = a(new dpx("birch"));
   public static final dpx j = a(new dpx("acacia"));
   public static final dpx k = a(new dpx("cherry", true, true, true, dpx.a.a, djt.aU, auo.eE, auo.eF, auo.eG, auo.eH, auo.eK, auo.eL, auo.eI, auo.eJ));
   public static final dpx l = a(new dpx("jungle"));
   public static final dpx m = a(new dpx("dark_oak"));
   public static final dpx n = a(new dpx("crimson", true, true, true, dpx.a.a, djt.aT, auo.qt, auo.qu, auo.qv, auo.qw, auo.qz, auo.qA, auo.qx, auo.qy));
   public static final dpx o = a(new dpx("warped", true, true, true, dpx.a.a, djt.aT, auo.qt, auo.qu, auo.qv, auo.qw, auo.qz, auo.qA, auo.qx, auo.qy));
   public static final dpx p = a(new dpx("mangrove"));
   public static final dpx q = a(new dpx("bamboo", true, true, true, dpx.a.a, djt.aS, auo.bo, auo.bp, auo.bq, auo.br, auo.bu, auo.bv, auo.bs, auo.bt));

   public dpx(String $$0) {
      this($$0, true, true, true, dpx.a.a, djt.b, auo.Cy, auo.Cz, auo.CA, auo.CB, auo.CE, auo.CF, auo.CC, auo.CD);
   }

   private static dpx a(dpx $$0) {
      F.put($$0.r, $$0);
      return $$0;
   }

   public static Stream<dpx> a() {
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

   public dpx.a f() {
      return this.v;
   }

   public djt g() {
      return this.w;
   }

   public aun h() {
      return this.x;
   }

   public aun i() {
      return this.y;
   }

   public aun j() {
      return this.z;
   }

   public aun k() {
      return this.A;
   }

   public aun l() {
      return this.B;
   }

   public aun m() {
      return this.C;
   }

   public aun n() {
      return this.D;
   }

   public aun o() {
      return this.E;
   }

   public static enum a {
      a,
      b;
   }
}
