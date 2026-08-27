import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dkn(String m, djp n, ddv o, ddv p, arl q, arl r) {
   private static final Map<String, dkn> s = new Object2ObjectArrayMap();
   public static final Codec<dkn> a = atq.a(dkn::b, s::get);
   public static final dkn b = a(new dkn("oak", djp.g));
   public static final dkn c = a(new dkn("spruce", djp.h));
   public static final dkn d = a(new dkn("birch", djp.i));
   public static final dkn e = a(new dkn("acacia", djp.j));
   public static final dkn f = a(new dkn("cherry", djp.k, ddv.aU, ddv.aX, arm.eo, arm.ep));
   public static final dkn g = a(new dkn("jungle", djp.l));
   public static final dkn h = a(new dkn("dark_oak", djp.m));
   public static final dkn i = a(new dkn("crimson", djp.n, ddv.aT, ddv.aQ, arm.qb, arm.qc));
   public static final dkn j = a(new dkn("warped", djp.o, ddv.aT, ddv.aQ, arm.qb, arm.qc));
   public static final dkn k = a(new dkn("mangrove", djp.p));
   public static final dkn l = a(new dkn("bamboo", djp.q, ddv.aS, ddv.aR, arm.bh, arm.bi));

   public dkn(String $$0, djp $$1) {
      this($$0, $$1, ddv.b, ddv.aP, arm.ie, arm.if);
   }

   private static dkn a(dkn $$0) {
      s.put($$0.b(), $$0);
      return $$0;
   }

   public static Stream<dkn> a() {
      return s.values().stream();
   }

   public String b() {
      return this.m;
   }

   public djp c() {
      return this.n;
   }

   public ddv d() {
      return this.o;
   }

   public ddv e() {
      return this.p;
   }

   public arl f() {
      return this.q;
   }

   public arl g() {
      return this.r;
   }
}
