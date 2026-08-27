import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dke(String r, boolean s, boolean t, boolean u, dke.a v, dek w, ars x, ars y, ars z, ars A, ars B, ars C, ars D, ars E) {
   private static final Map<String, dke> F = new Object2ObjectArrayMap();
   public static final Codec<dke> a = atx.a(dke::b, F::get);
   public static final dke b = a(new dke("iron", false, false, false, dke.a.a, dek.g, art.mN, art.mO, art.mV, art.mW, art.og, art.oh, art.yw, art.yx));
   public static final dke c = a(new dke("copper", true, true, false, dke.a.a, dek.aj, art.fz, art.fA, art.fG, art.fH, art.og, art.oh, art.yw, art.yx));
   public static final dke d = a(new dke("gold", false, true, false, dke.a.a, dek.g, art.mN, art.mO, art.mV, art.mW, art.og, art.oh, art.yw, art.yx));
   public static final dke e = a(new dke("stone", true, true, false, dke.a.b, dek.f, art.mN, art.mO, art.mV, art.mW, art.yB, art.yC, art.yw, art.yx));
   public static final dke f = a(
      new dke("polished_blackstone", true, true, false, dke.a.b, dek.f, art.mN, art.mO, art.mV, art.mW, art.yB, art.yC, art.yw, art.yx)
   );
   public static final dke g = a(new dke("oak"));
   public static final dke h = a(new dke("spruce"));
   public static final dke i = a(new dke("birch"));
   public static final dke j = a(new dke("acacia"));
   public static final dke k = a(new dke("cherry", true, true, true, dke.a.a, dek.aU, art.ev, art.ew, art.ex, art.ey, art.eB, art.eC, art.ez, art.eA));
   public static final dke l = a(new dke("jungle"));
   public static final dke m = a(new dke("dark_oak"));
   public static final dke n = a(new dke("crimson", true, true, true, dke.a.a, dek.aT, art.qi, art.qj, art.qk, art.ql, art.qo, art.qp, art.qm, art.qn));
   public static final dke o = a(new dke("warped", true, true, true, dke.a.a, dek.aT, art.qi, art.qj, art.qk, art.ql, art.qo, art.qp, art.qm, art.qn));
   public static final dke p = a(new dke("mangrove"));
   public static final dke q = a(new dke("bamboo", true, true, true, dke.a.a, dek.aS, art.bl, art.bm, art.bn, art.bo, art.br, art.bs, art.bp, art.bq));

   public dke(String $$0) {
      this($$0, true, true, true, dke.a.a, dek.b, art.BT, art.BU, art.BV, art.BW, art.BZ, art.Ca, art.BX, art.BY);
   }

   private static dke a(dke $$0) {
      F.put($$0.r, $$0);
      return $$0;
   }

   public static Stream<dke> a() {
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

   public dke.a f() {
      return this.v;
   }

   public dek g() {
      return this.w;
   }

   public ars h() {
      return this.x;
   }

   public ars i() {
      return this.y;
   }

   public ars j() {
      return this.z;
   }

   public ars k() {
      return this.A;
   }

   public ars l() {
      return this.B;
   }

   public ars m() {
      return this.C;
   }

   public ars n() {
      return this.D;
   }

   public ars o() {
      return this.E;
   }

   public static enum a {
      a,
      b;
   }
}
