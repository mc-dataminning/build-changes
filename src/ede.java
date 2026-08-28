import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record ede(String n, ecf o, dvl p, dvl q, awx r, awx s) {
   private static final Map<String, ede> t = new Object2ObjectArrayMap();
   public static final Codec<ede> a = Codec.stringResolver(ede::b, t::get);
   public static final ede b = a(new ede("oak", ecf.g));
   public static final ede c = a(new ede("spruce", ecf.h));
   public static final ede d = a(new ede("birch", ecf.i));
   public static final ede e = a(new ede("acacia", ecf.j));
   public static final ede f = a(new ede("cherry", ecf.k, dvl.aW, dvl.aZ, awy.eQ, awy.eR));
   public static final ede g = a(new ede("jungle", ecf.l));
   public static final ede h = a(new ede("dark_oak", ecf.m));
   public static final ede i = a(new ede("pale_oak", ecf.n));
   public static final ede j = a(new ede("crimson", ecf.o, dvl.aV, dvl.aS, awy.rI, awy.rJ));
   public static final ede k = a(new ede("warped", ecf.p, dvl.aV, dvl.aS, awy.rI, awy.rJ));
   public static final ede l = a(new ede("mangrove", ecf.q));
   public static final ede m = a(new ede("bamboo", ecf.r, dvl.aU, dvl.aT, awy.bw, awy.bx));

   public ede(String $$0, ecf $$1) {
      this($$0, $$1, dvl.b, dvl.aR, awy.jl, awy.jm);
   }

   private static ede a(ede $$0) {
      t.put($$0.b(), $$0);
      return $$0;
   }

   public static Stream<ede> a() {
      return t.values().stream();
   }

   public String b() {
      return this.n;
   }

   public ecf c() {
      return this.o;
   }

   public dvl d() {
      return this.p;
   }

   public dvl e() {
      return this.q;
   }

   public awx f() {
      return this.r;
   }

   public awx g() {
      return this.s;
   }
}
