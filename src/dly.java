import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dly(String r, boolean s, boolean t, boolean u, dly.a v, dge w, atk x, atk y, atk z, atk A, atk B, atk C, atk D, atk E) {
   private static final Map<String, dly> F = new Object2ObjectArrayMap();
   public static final Codec<dly> a = avq.a(dly::b, F::get);
   public static final dly b = a(new dly("iron", false, false, false, dly.a.a, dge.g, atl.mO, atl.mP, atl.mW, atl.mX, atl.oh, atl.oi, atl.yx, atl.yy));
   public static final dly c = a(new dly("copper", true, true, false, dly.a.a, dge.aj, atl.fA, atl.fB, atl.fH, atl.fI, atl.oh, atl.oi, atl.yx, atl.yy));
   public static final dly d = a(new dly("gold", false, true, false, dly.a.a, dge.g, atl.mO, atl.mP, atl.mW, atl.mX, atl.oh, atl.oi, atl.yx, atl.yy));
   public static final dly e = a(new dly("stone", true, true, false, dly.a.b, dge.f, atl.mO, atl.mP, atl.mW, atl.mX, atl.yC, atl.yD, atl.yx, atl.yy));
   public static final dly f = a(
      new dly("polished_blackstone", true, true, false, dly.a.b, dge.f, atl.mO, atl.mP, atl.mW, atl.mX, atl.yC, atl.yD, atl.yx, atl.yy)
   );
   public static final dly g = a(new dly("oak"));
   public static final dly h = a(new dly("spruce"));
   public static final dly i = a(new dly("birch"));
   public static final dly j = a(new dly("acacia"));
   public static final dly k = a(new dly("cherry", true, true, true, dly.a.a, dge.aU, atl.ew, atl.ex, atl.ey, atl.ez, atl.eC, atl.eD, atl.eA, atl.eB));
   public static final dly l = a(new dly("jungle"));
   public static final dly m = a(new dly("dark_oak"));
   public static final dly n = a(new dly("crimson", true, true, true, dly.a.a, dge.aT, atl.qj, atl.qk, atl.ql, atl.qm, atl.qp, atl.qq, atl.qn, atl.qo));
   public static final dly o = a(new dly("warped", true, true, true, dly.a.a, dge.aT, atl.qj, atl.qk, atl.ql, atl.qm, atl.qp, atl.qq, atl.qn, atl.qo));
   public static final dly p = a(new dly("mangrove"));
   public static final dly q = a(new dly("bamboo", true, true, true, dly.a.a, dge.aS, atl.bm, atl.bn, atl.bo, atl.bp, atl.bs, atl.bt, atl.bq, atl.br));

   public dly(String $$0) {
      this($$0, true, true, true, dly.a.a, dge.b, atl.BU, atl.BV, atl.BW, atl.BX, atl.Ca, atl.Cb, atl.BY, atl.BZ);
   }

   private static dly a(dly $$0) {
      F.put($$0.r, $$0);
      return $$0;
   }

   public static Stream<dly> a() {
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

   public dly.a f() {
      return this.v;
   }

   public dge g() {
      return this.w;
   }

   public atk h() {
      return this.x;
   }

   public atk i() {
      return this.y;
   }

   public atk j() {
      return this.z;
   }

   public atk k() {
      return this.A;
   }

   public atk l() {
      return this.B;
   }

   public atk m() {
      return this.C;
   }

   public atk n() {
      return this.D;
   }

   public atk o() {
      return this.E;
   }

   public static enum a {
      a,
      b;
   }
}
