import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record drq(String r, boolean s, boolean t, boolean u, drq.a v, dll w, avg x, avg y, avg z, avg A, avg B, avg C, avg D, avg E) {
   private static final Map<String, drq> F = new Object2ObjectArrayMap();
   public static final Codec<drq> a = Codec.stringResolver(drq::b, F::get);
   public static final drq b = a(new drq("iron", false, false, false, drq.a.a, dll.g, avh.nm, avh.nn, avh.nu, avh.nv, avh.oI, avh.oJ, avh.zb, avh.zc));
   public static final drq c = a(new drq("copper", true, true, false, drq.a.a, dll.aj, avh.fN, avh.fO, avh.fU, avh.fV, avh.oI, avh.oJ, avh.zb, avh.zc));
   public static final drq d = a(new drq("gold", false, true, false, drq.a.a, dll.g, avh.nm, avh.nn, avh.nu, avh.nv, avh.oI, avh.oJ, avh.zb, avh.zc));
   public static final drq e = a(new drq("stone", true, true, false, drq.a.b, dll.f, avh.nm, avh.nn, avh.nu, avh.nv, avh.zg, avh.zh, avh.zb, avh.zc));
   public static final drq f = a(
      new drq("polished_blackstone", true, true, false, drq.a.b, dll.f, avh.nm, avh.nn, avh.nu, avh.nv, avh.zg, avh.zh, avh.zb, avh.zc)
   );
   public static final drq g = a(new drq("oak"));
   public static final drq h = a(new drq("spruce"));
   public static final drq i = a(new drq("birch"));
   public static final drq j = a(new drq("acacia"));
   public static final drq k = a(new drq("cherry", true, true, true, drq.a.a, dll.aU, avh.eE, avh.eF, avh.eG, avh.eH, avh.eK, avh.eL, avh.eI, avh.eJ));
   public static final drq l = a(new drq("jungle"));
   public static final drq m = a(new drq("dark_oak"));
   public static final drq n = a(new drq("crimson", true, true, true, drq.a.a, dll.aT, avh.qL, avh.qM, avh.qN, avh.qO, avh.qR, avh.qS, avh.qP, avh.qQ));
   public static final drq o = a(new drq("warped", true, true, true, drq.a.a, dll.aT, avh.qL, avh.qM, avh.qN, avh.qO, avh.qR, avh.qS, avh.qP, avh.qQ));
   public static final drq p = a(new drq("mangrove"));
   public static final drq q = a(new drq("bamboo", true, true, true, drq.a.a, dll.aS, avh.bo, avh.bp, avh.bq, avh.br, avh.bu, avh.bv, avh.bs, avh.bt));

   public drq(String $$0) {
      this($$0, true, true, true, drq.a.a, dll.b, avh.CR, avh.CS, avh.CT, avh.CU, avh.CX, avh.CY, avh.CV, avh.CW);
   }

   private static drq a(drq $$0) {
      F.put($$0.r, $$0);
      return $$0;
   }

   public static Stream<drq> a() {
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

   public drq.a f() {
      return this.v;
   }

   public dll g() {
      return this.w;
   }

   public avg h() {
      return this.x;
   }

   public avg i() {
      return this.y;
   }

   public avg j() {
      return this.z;
   }

   public avg k() {
      return this.A;
   }

   public avg l() {
      return this.B;
   }

   public avg m() {
      return this.C;
   }

   public avg n() {
      return this.D;
   }

   public avg o() {
      return this.E;
   }

   public static enum a {
      a,
      b;
   }
}
