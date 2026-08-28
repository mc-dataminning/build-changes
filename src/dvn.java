import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dvn(String m, dup n, doj o, doj p, awc q, awc r) {
   private static final Map<String, dvn> s = new Object2ObjectArrayMap();
   public static final Codec<dvn> a = Codec.stringResolver(dvn::b, s::get);
   public static final dvn b = a(new dvn("oak", dup.g));
   public static final dvn c = a(new dvn("spruce", dup.h));
   public static final dvn d = a(new dvn("birch", dup.i));
   public static final dvn e = a(new dvn("acacia", dup.j));
   public static final dvn f = a(new dvn("cherry", dup.k, doj.aU, doj.aX, awd.eN, awd.eO));
   public static final dvn g = a(new dvn("jungle", dup.l));
   public static final dvn h = a(new dvn("dark_oak", dup.m));
   public static final dvn i = a(new dvn("crimson", dup.n, doj.aT, doj.aQ, awd.qX, awd.qY));
   public static final dvn j = a(new dvn("warped", dup.o, doj.aT, doj.aQ, awd.qX, awd.qY));
   public static final dvn k = a(new dvn("mangrove", dup.p));
   public static final dvn l = a(new dvn("bamboo", dup.q, doj.aS, doj.aR, awd.bw, awd.bx));

   public dvn(String $$0, dup $$1) {
      this($$0, $$1, doj.b, doj.aP, awd.iJ, awd.iK);
   }

   private static dvn a(dvn $$0) {
      s.put($$0.b(), $$0);
      return $$0;
   }

   public static Stream<dvn> a() {
      return s.values().stream();
   }

   public String b() {
      return this.m;
   }

   public dup c() {
      return this.n;
   }

   public doj d() {
      return this.o;
   }

   public doj e() {
      return this.p;
   }

   public awc f() {
      return this.q;
   }

   public awc g() {
      return this.r;
   }
}
