import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dwk(String r, boolean s, boolean t, boolean u, dwk.a v, dqd w, awm x, awm y, awm z, awm A, awm B, awm C, awm D, awm E) {
   private static final Map<String, dwk> F = new Object2ObjectArrayMap();
   public static final Codec<dwk> a = Codec.stringResolver(dwk::b, F::get);
   public static final dwk b = a(new dwk("iron", false, false, false, dwk.a.a, dqd.g, awn.nl, awn.nm, awn.nt, awn.nu, awn.oH, awn.oI, awn.zi, awn.zj));
   public static final dwk c = a(new dwk("copper", true, true, false, dwk.a.a, dqd.aj, awn.fO, awn.fP, awn.fV, awn.fW, awn.oH, awn.oI, awn.zi, awn.zj));
   public static final dwk d = a(new dwk("gold", false, true, false, dwk.a.a, dqd.g, awn.nl, awn.nm, awn.nt, awn.nu, awn.oH, awn.oI, awn.zi, awn.zj));
   public static final dwk e = a(new dwk("stone", true, true, false, dwk.a.b, dqd.f, awn.nl, awn.nm, awn.nt, awn.nu, awn.zn, awn.zo, awn.zi, awn.zj));
   public static final dwk f = a(
      new dwk("polished_blackstone", true, true, false, dwk.a.b, dqd.f, awn.nl, awn.nm, awn.nt, awn.nu, awn.zn, awn.zo, awn.zi, awn.zj)
   );
   public static final dwk g = a(new dwk("oak"));
   public static final dwk h = a(new dwk("spruce"));
   public static final dwk i = a(new dwk("birch"));
   public static final dwk j = a(new dwk("acacia"));
   public static final dwk k = a(new dwk("cherry", true, true, true, dwk.a.a, dqd.aU, awn.eF, awn.eG, awn.eH, awn.eI, awn.eL, awn.eM, awn.eJ, awn.eK));
   public static final dwk l = a(new dwk("jungle"));
   public static final dwk m = a(new dwk("dark_oak"));
   public static final dwk n = a(new dwk("crimson", true, true, true, dwk.a.a, dqd.aT, awn.qN, awn.qO, awn.qP, awn.qQ, awn.qT, awn.qU, awn.qR, awn.qS));
   public static final dwk o = a(new dwk("warped", true, true, true, dwk.a.a, dqd.aT, awn.qN, awn.qO, awn.qP, awn.qQ, awn.qT, awn.qU, awn.qR, awn.qS));
   public static final dwk p = a(new dwk("mangrove"));
   public static final dwk q = a(new dwk("bamboo", true, true, true, dwk.a.a, dqd.aS, awn.bo, awn.bp, awn.bq, awn.br, awn.bu, awn.bv, awn.bs, awn.bt));

   public dwk(String $$0) {
      this($$0, true, true, true, dwk.a.a, dqd.b, awn.CZ, awn.Da, awn.Db, awn.Dc, awn.Df, awn.Dg, awn.Dd, awn.De);
   }

   private static dwk a(dwk $$0) {
      F.put($$0.r, $$0);
      return $$0;
   }

   public static Stream<dwk> a() {
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

   public dwk.a f() {
      return this.v;
   }

   public dqd g() {
      return this.w;
   }

   public awm h() {
      return this.x;
   }

   public awm i() {
      return this.y;
   }

   public awm j() {
      return this.z;
   }

   public awm k() {
      return this.A;
   }

   public awm l() {
      return this.B;
   }

   public awm m() {
      return this.C;
   }

   public awm n() {
      return this.D;
   }

   public awm o() {
      return this.E;
   }

   public static enum a {
      a,
      b;
   }
}
