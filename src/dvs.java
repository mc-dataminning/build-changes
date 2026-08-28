import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dvs(String r, boolean s, boolean t, boolean u, dvs.a v, dpl w, awj x, awj y, awj z, awj A, awj B, awj C, awj D, awj E) {
   private static final Map<String, dvs> F = new Object2ObjectArrayMap();
   public static final Codec<dvs> a = Codec.stringResolver(dvs::b, F::get);
   public static final dvs b = a(new dvs("iron", false, false, false, dvs.a.a, dpl.g, awk.nl, awk.nm, awk.nt, awk.nu, awk.oH, awk.oI, awk.zi, awk.zj));
   public static final dvs c = a(new dvs("copper", true, true, false, dvs.a.a, dpl.aj, awk.fO, awk.fP, awk.fV, awk.fW, awk.oH, awk.oI, awk.zi, awk.zj));
   public static final dvs d = a(new dvs("gold", false, true, false, dvs.a.a, dpl.g, awk.nl, awk.nm, awk.nt, awk.nu, awk.oH, awk.oI, awk.zi, awk.zj));
   public static final dvs e = a(new dvs("stone", true, true, false, dvs.a.b, dpl.f, awk.nl, awk.nm, awk.nt, awk.nu, awk.zn, awk.zo, awk.zi, awk.zj));
   public static final dvs f = a(
      new dvs("polished_blackstone", true, true, false, dvs.a.b, dpl.f, awk.nl, awk.nm, awk.nt, awk.nu, awk.zn, awk.zo, awk.zi, awk.zj)
   );
   public static final dvs g = a(new dvs("oak"));
   public static final dvs h = a(new dvs("spruce"));
   public static final dvs i = a(new dvs("birch"));
   public static final dvs j = a(new dvs("acacia"));
   public static final dvs k = a(new dvs("cherry", true, true, true, dvs.a.a, dpl.aU, awk.eF, awk.eG, awk.eH, awk.eI, awk.eL, awk.eM, awk.eJ, awk.eK));
   public static final dvs l = a(new dvs("jungle"));
   public static final dvs m = a(new dvs("dark_oak"));
   public static final dvs n = a(new dvs("crimson", true, true, true, dvs.a.a, dpl.aT, awk.qN, awk.qO, awk.qP, awk.qQ, awk.qT, awk.qU, awk.qR, awk.qS));
   public static final dvs o = a(new dvs("warped", true, true, true, dvs.a.a, dpl.aT, awk.qN, awk.qO, awk.qP, awk.qQ, awk.qT, awk.qU, awk.qR, awk.qS));
   public static final dvs p = a(new dvs("mangrove"));
   public static final dvs q = a(new dvs("bamboo", true, true, true, dvs.a.a, dpl.aS, awk.bo, awk.bp, awk.bq, awk.br, awk.bu, awk.bv, awk.bs, awk.bt));

   public dvs(String $$0) {
      this($$0, true, true, true, dvs.a.a, dpl.b, awk.CZ, awk.Da, awk.Db, awk.Dc, awk.Df, awk.Dg, awk.Dd, awk.De);
   }

   private static dvs a(dvs $$0) {
      F.put($$0.r, $$0);
      return $$0;
   }

   public static Stream<dvs> a() {
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

   public dvs.a f() {
      return this.v;
   }

   public dpl g() {
      return this.w;
   }

   public awj h() {
      return this.x;
   }

   public awj i() {
      return this.y;
   }

   public awj j() {
      return this.z;
   }

   public awj k() {
      return this.A;
   }

   public awj l() {
      return this.B;
   }

   public awj m() {
      return this.C;
   }

   public awj n() {
      return this.D;
   }

   public awj o() {
      return this.E;
   }

   public static enum a {
      a,
      b;
   }
}
