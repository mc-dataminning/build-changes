import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dwq(String m, dvs n, dpl o, dpl p, awj q, awj r) {
   private static final Map<String, dwq> s = new Object2ObjectArrayMap();
   public static final Codec<dwq> a = Codec.stringResolver(dwq::b, s::get);
   public static final dwq b = a(new dwq("oak", dvs.g));
   public static final dwq c = a(new dwq("spruce", dvs.h));
   public static final dwq d = a(new dwq("birch", dvs.i));
   public static final dwq e = a(new dwq("acacia", dvs.j));
   public static final dwq f = a(new dwq("cherry", dvs.k, dpl.aU, dpl.aX, awk.eN, awk.eO));
   public static final dwq g = a(new dwq("jungle", dvs.l));
   public static final dwq h = a(new dwq("dark_oak", dvs.m));
   public static final dwq i = a(new dwq("crimson", dvs.n, dpl.aT, dpl.aQ, awk.qV, awk.qW));
   public static final dwq j = a(new dwq("warped", dvs.o, dpl.aT, dpl.aQ, awk.qV, awk.qW));
   public static final dwq k = a(new dwq("mangrove", dvs.p));
   public static final dwq l = a(new dwq("bamboo", dvs.q, dpl.aS, dpl.aR, awk.bw, awk.bx));

   public dwq(String $$0, dvs $$1) {
      this($$0, $$1, dpl.b, dpl.aP, awk.iJ, awk.iK);
   }

   private static dwq a(dwq $$0) {
      s.put($$0.b(), $$0);
      return $$0;
   }

   public static Stream<dwq> a() {
      return s.values().stream();
   }

   public String b() {
      return this.m;
   }

   public dvs c() {
      return this.n;
   }

   public dpl d() {
      return this.o;
   }

   public dpl e() {
      return this.p;
   }

   public awj f() {
      return this.q;
   }

   public awj g() {
      return this.r;
   }
}
