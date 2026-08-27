import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dkc(String m, dje n, ddl o, ddl p, arb q, arb r) {
   private static final Map<String, dkc> s = new Object2ObjectArrayMap();
   public static final Codec<dkc> a = atg.a(dkc::b, s::get);
   public static final dkc b = a(new dkc("oak", dje.g));
   public static final dkc c = a(new dkc("spruce", dje.h));
   public static final dkc d = a(new dkc("birch", dje.i));
   public static final dkc e = a(new dkc("acacia", dje.j));
   public static final dkc f = a(new dkc("cherry", dje.k, ddl.aU, ddl.aX, arc.eo, arc.ep));
   public static final dkc g = a(new dkc("jungle", dje.l));
   public static final dkc h = a(new dkc("dark_oak", dje.m));
   public static final dkc i = a(new dkc("crimson", dje.n, ddl.aT, ddl.aQ, arc.qb, arc.qc));
   public static final dkc j = a(new dkc("warped", dje.o, ddl.aT, ddl.aQ, arc.qb, arc.qc));
   public static final dkc k = a(new dkc("mangrove", dje.p));
   public static final dkc l = a(new dkc("bamboo", dje.q, ddl.aS, ddl.aR, arc.bh, arc.bi));

   public dkc(String $$0, dje $$1) {
      this($$0, $$1, ddl.b, ddl.aP, arc.ie, arc.if);
   }

   private static dkc a(dkc $$0) {
      s.put($$0.b(), $$0);
      return $$0;
   }

   public static Stream<dkc> a() {
      return s.values().stream();
   }

   public String b() {
      return this.m;
   }

   public dje c() {
      return this.n;
   }

   public ddl d() {
      return this.o;
   }

   public ddl e() {
      return this.p;
   }

   public arb f() {
      return this.q;
   }

   public arb g() {
      return this.r;
   }
}
