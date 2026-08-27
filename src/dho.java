import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dho(String m, dgq n, dbl o, dbl p, aqc q, aqc r) {
   private static final Map<String, dho> s = new Object2ObjectArrayMap();
   public static final Codec<dho> a = asg.a(dho::b, s::get);
   public static final dho b = a(new dho("oak", dgq.f));
   public static final dho c = a(new dho("spruce", dgq.g));
   public static final dho d = a(new dho("birch", dgq.h));
   public static final dho e = a(new dho("acacia", dgq.i));
   public static final dho f = a(new dho("cherry", dgq.j, dbl.aQ, dbl.aT, aqd.ef, aqd.eg));
   public static final dho g = a(new dho("jungle", dgq.k));
   public static final dho h = a(new dho("dark_oak", dgq.l));
   public static final dho i = a(new dho("crimson", dgq.m, dbl.aP, dbl.aM, aqd.pp, aqd.pq));
   public static final dho j = a(new dho("warped", dgq.n, dbl.aP, dbl.aM, aqd.pp, aqd.pq));
   public static final dho k = a(new dho("mangrove", dgq.o));
   public static final dho l = a(new dho("bamboo", dgq.p, dbl.aO, dbl.aN, aqd.bh, aqd.bi));

   public dho(String $$0, dgq $$1) {
      this($$0, $$1, dbl.b, dbl.aL, aqd.hD, aqd.hE);
   }

   private static dho a(dho $$0) {
      s.put($$0.b(), $$0);
      return $$0;
   }

   public static Stream<dho> a() {
      return s.values().stream();
   }

   public String b() {
      return this.m;
   }

   public dgq c() {
      return this.n;
   }

   public dbl d() {
      return this.o;
   }

   public dbl e() {
      return this.p;
   }

   public aqc f() {
      return this.q;
   }

   public aqc g() {
      return this.r;
   }
}
