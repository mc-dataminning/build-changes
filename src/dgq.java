import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dgq(String m, dfs n, dan o, dan p, apf q, apf r) {
   private static final Map<String, dgq> s = new Object2ObjectArrayMap();
   public static final Codec<dgq> a = arj.a(dgq::b, s::get);
   public static final dgq b = a(new dgq("oak", dfs.f));
   public static final dgq c = a(new dgq("spruce", dfs.g));
   public static final dgq d = a(new dgq("birch", dfs.h));
   public static final dgq e = a(new dgq("acacia", dfs.i));
   public static final dgq f = a(new dgq("cherry", dfs.j, dan.aQ, dan.aT, apg.ef, apg.eg));
   public static final dgq g = a(new dgq("jungle", dfs.k));
   public static final dgq h = a(new dgq("dark_oak", dfs.l));
   public static final dgq i = a(new dgq("crimson", dfs.m, dan.aP, dan.aM, apg.pn, apg.po));
   public static final dgq j = a(new dgq("warped", dfs.n, dan.aP, dan.aM, apg.pn, apg.po));
   public static final dgq k = a(new dgq("mangrove", dfs.o));
   public static final dgq l = a(new dgq("bamboo", dfs.p, dan.aO, dan.aN, apg.bh, apg.bi));

   public dgq(String $$0, dfs $$1) {
      this($$0, $$1, dan.b, dan.aL, apg.hB, apg.hC);
   }

   private static dgq a(dgq $$0) {
      s.put($$0.b(), $$0);
      return $$0;
   }

   public static Stream<dgq> a() {
      return s.values().stream();
   }

   public String b() {
      return this.m;
   }

   public dfs c() {
      return this.n;
   }

   public dan d() {
      return this.o;
   }

   public dan e() {
      return this.p;
   }

   public apf f() {
      return this.q;
   }

   public apf g() {
      return this.r;
   }
}
