import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dwd(String r, boolean s, boolean t, boolean u, dwd.a v, dpw w, awn x, awn y, awn z, awn A, awn B, awn C, awn D, awn E) {
   private static final Map<String, dwd> F = new Object2ObjectArrayMap();
   public static final Codec<dwd> a = Codec.stringResolver(dwd::b, F::get);
   public static final dwd b = a(new dwd("iron", false, false, false, dwd.a.a, dpw.g, awo.nl, awo.nm, awo.nt, awo.nu, awo.oH, awo.oI, awo.zi, awo.zj));
   public static final dwd c = a(new dwd("copper", true, true, false, dwd.a.a, dpw.aj, awo.fO, awo.fP, awo.fV, awo.fW, awo.oH, awo.oI, awo.zi, awo.zj));
   public static final dwd d = a(new dwd("gold", false, true, false, dwd.a.a, dpw.g, awo.nl, awo.nm, awo.nt, awo.nu, awo.oH, awo.oI, awo.zi, awo.zj));
   public static final dwd e = a(new dwd("stone", true, true, false, dwd.a.b, dpw.f, awo.nl, awo.nm, awo.nt, awo.nu, awo.zn, awo.zo, awo.zi, awo.zj));
   public static final dwd f = a(
      new dwd("polished_blackstone", true, true, false, dwd.a.b, dpw.f, awo.nl, awo.nm, awo.nt, awo.nu, awo.zn, awo.zo, awo.zi, awo.zj)
   );
   public static final dwd g = a(new dwd("oak"));
   public static final dwd h = a(new dwd("spruce"));
   public static final dwd i = a(new dwd("birch"));
   public static final dwd j = a(new dwd("acacia"));
   public static final dwd k = a(new dwd("cherry", true, true, true, dwd.a.a, dpw.aU, awo.eF, awo.eG, awo.eH, awo.eI, awo.eL, awo.eM, awo.eJ, awo.eK));
   public static final dwd l = a(new dwd("jungle"));
   public static final dwd m = a(new dwd("dark_oak"));
   public static final dwd n = a(new dwd("crimson", true, true, true, dwd.a.a, dpw.aT, awo.qN, awo.qO, awo.qP, awo.qQ, awo.qT, awo.qU, awo.qR, awo.qS));
   public static final dwd o = a(new dwd("warped", true, true, true, dwd.a.a, dpw.aT, awo.qN, awo.qO, awo.qP, awo.qQ, awo.qT, awo.qU, awo.qR, awo.qS));
   public static final dwd p = a(new dwd("mangrove"));
   public static final dwd q = a(new dwd("bamboo", true, true, true, dwd.a.a, dpw.aS, awo.bo, awo.bp, awo.bq, awo.br, awo.bu, awo.bv, awo.bs, awo.bt));

   public dwd(String $$0) {
      this($$0, true, true, true, dwd.a.a, dpw.b, awo.CZ, awo.Da, awo.Db, awo.Dc, awo.Df, awo.Dg, awo.Dd, awo.De);
   }

   private static dwd a(dwd $$0) {
      F.put($$0.r, $$0);
      return $$0;
   }

   public static Stream<dwd> a() {
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

   public dwd.a f() {
      return this.v;
   }

   public dpw g() {
      return this.w;
   }

   public awn h() {
      return this.x;
   }

   public awn i() {
      return this.y;
   }

   public awn j() {
      return this.z;
   }

   public awn k() {
      return this.A;
   }

   public awn l() {
      return this.B;
   }

   public awn m() {
      return this.C;
   }

   public awn n() {
      return this.D;
   }

   public awn o() {
      return this.E;
   }

   public static enum a {
      a,
      b;
   }
}
