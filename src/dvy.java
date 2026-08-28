import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dvy(String r, boolean s, boolean t, boolean u, dvy.a v, dpr w, awk x, awk y, awk z, awk A, awk B, awk C, awk D, awk E) {
   private static final Map<String, dvy> F = new Object2ObjectArrayMap();
   public static final Codec<dvy> a = Codec.stringResolver(dvy::b, F::get);
   public static final dvy b = a(new dvy("iron", false, false, false, dvy.a.a, dpr.g, awl.nl, awl.nm, awl.nt, awl.nu, awl.oH, awl.oI, awl.zi, awl.zj));
   public static final dvy c = a(new dvy("copper", true, true, false, dvy.a.a, dpr.aj, awl.fO, awl.fP, awl.fV, awl.fW, awl.oH, awl.oI, awl.zi, awl.zj));
   public static final dvy d = a(new dvy("gold", false, true, false, dvy.a.a, dpr.g, awl.nl, awl.nm, awl.nt, awl.nu, awl.oH, awl.oI, awl.zi, awl.zj));
   public static final dvy e = a(new dvy("stone", true, true, false, dvy.a.b, dpr.f, awl.nl, awl.nm, awl.nt, awl.nu, awl.zn, awl.zo, awl.zi, awl.zj));
   public static final dvy f = a(
      new dvy("polished_blackstone", true, true, false, dvy.a.b, dpr.f, awl.nl, awl.nm, awl.nt, awl.nu, awl.zn, awl.zo, awl.zi, awl.zj)
   );
   public static final dvy g = a(new dvy("oak"));
   public static final dvy h = a(new dvy("spruce"));
   public static final dvy i = a(new dvy("birch"));
   public static final dvy j = a(new dvy("acacia"));
   public static final dvy k = a(new dvy("cherry", true, true, true, dvy.a.a, dpr.aU, awl.eF, awl.eG, awl.eH, awl.eI, awl.eL, awl.eM, awl.eJ, awl.eK));
   public static final dvy l = a(new dvy("jungle"));
   public static final dvy m = a(new dvy("dark_oak"));
   public static final dvy n = a(new dvy("crimson", true, true, true, dvy.a.a, dpr.aT, awl.qN, awl.qO, awl.qP, awl.qQ, awl.qT, awl.qU, awl.qR, awl.qS));
   public static final dvy o = a(new dvy("warped", true, true, true, dvy.a.a, dpr.aT, awl.qN, awl.qO, awl.qP, awl.qQ, awl.qT, awl.qU, awl.qR, awl.qS));
   public static final dvy p = a(new dvy("mangrove"));
   public static final dvy q = a(new dvy("bamboo", true, true, true, dvy.a.a, dpr.aS, awl.bo, awl.bp, awl.bq, awl.br, awl.bu, awl.bv, awl.bs, awl.bt));

   public dvy(String $$0) {
      this($$0, true, true, true, dvy.a.a, dpr.b, awl.CZ, awl.Da, awl.Db, awl.Dc, awl.Df, awl.Dg, awl.Dd, awl.De);
   }

   private static dvy a(dvy $$0) {
      F.put($$0.r, $$0);
      return $$0;
   }

   public static Stream<dvy> a() {
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

   public dvy.a f() {
      return this.v;
   }

   public dpr g() {
      return this.w;
   }

   public awk h() {
      return this.x;
   }

   public awk i() {
      return this.y;
   }

   public awk j() {
      return this.z;
   }

   public awk k() {
      return this.A;
   }

   public awk l() {
      return this.B;
   }

   public awk m() {
      return this.C;
   }

   public awk n() {
      return this.D;
   }

   public awk o() {
      return this.E;
   }

   public static enum a {
      a,
      b;
   }
}
