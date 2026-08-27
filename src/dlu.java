import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dlu(String r, boolean s, boolean t, boolean u, dlu.a v, dga w, atj x, atj y, atj z, atj A, atj B, atj C, atj D, atj E) {
   private static final Map<String, dlu> F = new Object2ObjectArrayMap();
   public static final Codec<dlu> a = avp.a(dlu::b, F::get);
   public static final dlu b = a(new dlu("iron", false, false, false, dlu.a.a, dga.g, atk.mN, atk.mO, atk.mV, atk.mW, atk.og, atk.oh, atk.yw, atk.yx));
   public static final dlu c = a(new dlu("copper", true, true, false, dlu.a.a, dga.aj, atk.fz, atk.fA, atk.fG, atk.fH, atk.og, atk.oh, atk.yw, atk.yx));
   public static final dlu d = a(new dlu("gold", false, true, false, dlu.a.a, dga.g, atk.mN, atk.mO, atk.mV, atk.mW, atk.og, atk.oh, atk.yw, atk.yx));
   public static final dlu e = a(new dlu("stone", true, true, false, dlu.a.b, dga.f, atk.mN, atk.mO, atk.mV, atk.mW, atk.yB, atk.yC, atk.yw, atk.yx));
   public static final dlu f = a(
      new dlu("polished_blackstone", true, true, false, dlu.a.b, dga.f, atk.mN, atk.mO, atk.mV, atk.mW, atk.yB, atk.yC, atk.yw, atk.yx)
   );
   public static final dlu g = a(new dlu("oak"));
   public static final dlu h = a(new dlu("spruce"));
   public static final dlu i = a(new dlu("birch"));
   public static final dlu j = a(new dlu("acacia"));
   public static final dlu k = a(new dlu("cherry", true, true, true, dlu.a.a, dga.aU, atk.ev, atk.ew, atk.ex, atk.ey, atk.eB, atk.eC, atk.ez, atk.eA));
   public static final dlu l = a(new dlu("jungle"));
   public static final dlu m = a(new dlu("dark_oak"));
   public static final dlu n = a(new dlu("crimson", true, true, true, dlu.a.a, dga.aT, atk.qi, atk.qj, atk.qk, atk.ql, atk.qo, atk.qp, atk.qm, atk.qn));
   public static final dlu o = a(new dlu("warped", true, true, true, dlu.a.a, dga.aT, atk.qi, atk.qj, atk.qk, atk.ql, atk.qo, atk.qp, atk.qm, atk.qn));
   public static final dlu p = a(new dlu("mangrove"));
   public static final dlu q = a(new dlu("bamboo", true, true, true, dlu.a.a, dga.aS, atk.bl, atk.bm, atk.bn, atk.bo, atk.br, atk.bs, atk.bp, atk.bq));

   public dlu(String $$0) {
      this($$0, true, true, true, dlu.a.a, dga.b, atk.BT, atk.BU, atk.BV, atk.BW, atk.BZ, atk.Ca, atk.BX, atk.BY);
   }

   private static dlu a(dlu $$0) {
      F.put($$0.r, $$0);
      return $$0;
   }

   public static Stream<dlu> a() {
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

   public dlu.a f() {
      return this.v;
   }

   public dga g() {
      return this.w;
   }

   public atj h() {
      return this.x;
   }

   public atj i() {
      return this.y;
   }

   public atj j() {
      return this.z;
   }

   public atj k() {
      return this.A;
   }

   public atj l() {
      return this.B;
   }

   public atj m() {
      return this.C;
   }

   public atj n() {
      return this.D;
   }

   public atj o() {
      return this.E;
   }

   public static enum a {
      a,
      b;
   }
}
