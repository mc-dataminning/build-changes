import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dwb(String m, dvd n, dox o, dox p, awd q, awd r) {
   private static final Map<String, dwb> s = new Object2ObjectArrayMap();
   public static final Codec<dwb> a = Codec.stringResolver(dwb::b, s::get);
   public static final dwb b = a(new dwb("oak", dvd.g));
   public static final dwb c = a(new dwb("spruce", dvd.h));
   public static final dwb d = a(new dwb("birch", dvd.i));
   public static final dwb e = a(new dwb("acacia", dvd.j));
   public static final dwb f = a(new dwb("cherry", dvd.k, dox.aU, dox.aX, awe.eN, awe.eO));
   public static final dwb g = a(new dwb("jungle", dvd.l));
   public static final dwb h = a(new dwb("dark_oak", dvd.m));
   public static final dwb i = a(new dwb("crimson", dvd.n, dox.aT, dox.aQ, awe.qX, awe.qY));
   public static final dwb j = a(new dwb("warped", dvd.o, dox.aT, dox.aQ, awe.qX, awe.qY));
   public static final dwb k = a(new dwb("mangrove", dvd.p));
   public static final dwb l = a(new dwb("bamboo", dvd.q, dox.aS, dox.aR, awe.bw, awe.bx));

   public dwb(String $$0, dvd $$1) {
      this($$0, $$1, dox.b, dox.aP, awe.iJ, awe.iK);
   }

   private static dwb a(dwb $$0) {
      s.put($$0.b(), $$0);
      return $$0;
   }

   public static Stream<dwb> a() {
      return s.values().stream();
   }

   public String b() {
      return this.m;
   }

   public dvd c() {
      return this.n;
   }

   public dox d() {
      return this.o;
   }

   public dox e() {
      return this.p;
   }

   public awd f() {
      return this.q;
   }

   public awd g() {
      return this.r;
   }
}
