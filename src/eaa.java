import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record eaa(String n, dzb o, dsn p, dsn q, awj r, awj s) {
   private static final Map<String, eaa> t = new Object2ObjectArrayMap();
   public static final Codec<eaa> a = Codec.stringResolver(eaa::b, t::get);
   public static final eaa b = a(new eaa("oak", dzb.g));
   public static final eaa c = a(new eaa("spruce", dzb.h));
   public static final eaa d = a(new eaa("birch", dzb.i));
   public static final eaa e = a(new eaa("acacia", dzb.j));
   public static final eaa f = a(new eaa("cherry", dzb.k, dsn.aV, dsn.aY, awk.eO, awk.eP));
   public static final eaa g = a(new eaa("jungle", dzb.l));
   public static final eaa h = a(new eaa("dark_oak", dzb.m));
   public static final eaa i = a(new eaa("pale_oak", dzb.n));
   public static final eaa j = a(new eaa("crimson", dzb.o, dsn.aU, dsn.aR, awk.rE, awk.rF));
   public static final eaa k = a(new eaa("warped", dzb.p, dsn.aU, dsn.aR, awk.rE, awk.rF));
   public static final eaa l = a(new eaa("mangrove", dzb.q));
   public static final eaa m = a(new eaa("bamboo", dzb.r, dsn.aT, dsn.aS, awk.bw, awk.bx));

   public eaa(String $$0, dzb $$1) {
      this($$0, $$1, dsn.b, dsn.aQ, awk.ji, awk.jj);
   }

   private static eaa a(eaa $$0) {
      t.put($$0.b(), $$0);
      return $$0;
   }

   public static Stream<eaa> a() {
      return t.values().stream();
   }

   public String b() {
      return this.n;
   }

   public dzb c() {
      return this.o;
   }

   public dsn d() {
      return this.p;
   }

   public dsn e() {
      return this.q;
   }

   public awj f() {
      return this.r;
   }

   public awj g() {
      return this.s;
   }
}
