import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dxa(String m, dwd n, dpw o, dpw p, awn q, awn r) {
   private static final Map<String, dxa> s = new Object2ObjectArrayMap();
   public static final Codec<dxa> a = Codec.stringResolver(dxa::b, s::get);
   public static final dxa b = a(new dxa("oak", dwd.g));
   public static final dxa c = a(new dxa("spruce", dwd.h));
   public static final dxa d = a(new dxa("birch", dwd.i));
   public static final dxa e = a(new dxa("acacia", dwd.j));
   public static final dxa f = a(new dxa("cherry", dwd.k, dpw.aU, dpw.aX, awo.eN, awo.eO));
   public static final dxa g = a(new dxa("jungle", dwd.l));
   public static final dxa h = a(new dxa("dark_oak", dwd.m));
   public static final dxa i = a(new dxa("crimson", dwd.n, dpw.aT, dpw.aQ, awo.qV, awo.qW));
   public static final dxa j = a(new dxa("warped", dwd.o, dpw.aT, dpw.aQ, awo.qV, awo.qW));
   public static final dxa k = a(new dxa("mangrove", dwd.p));
   public static final dxa l = a(new dxa("bamboo", dwd.q, dpw.aS, dpw.aR, awo.bw, awo.bx));

   public dxa(String $$0, dwd $$1) {
      this($$0, $$1, dpw.b, dpw.aP, awo.iJ, awo.iK);
   }

   private static dxa a(dxa $$0) {
      s.put($$0.b(), $$0);
      return $$0;
   }

   public static Stream<dxa> a() {
      return s.values().stream();
   }

   public String b() {
      return this.m;
   }

   public dwd c() {
      return this.n;
   }

   public dpw d() {
      return this.o;
   }

   public dpw e() {
      return this.p;
   }

   public awn f() {
      return this.q;
   }

   public awn g() {
      return this.r;
   }
}
