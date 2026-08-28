import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record ebn(String n, eao o, dtv p, dtv q, awm r, awm s) {
   private static final Map<String, ebn> t = new Object2ObjectArrayMap();
   public static final Codec<ebn> a = Codec.stringResolver(ebn::b, t::get);
   public static final ebn b = a(new ebn("oak", eao.g));
   public static final ebn c = a(new ebn("spruce", eao.h));
   public static final ebn d = a(new ebn("birch", eao.i));
   public static final ebn e = a(new ebn("acacia", eao.j));
   public static final ebn f = a(new ebn("cherry", eao.k, dtv.aV, dtv.aY, awn.eO, awn.eP));
   public static final ebn g = a(new ebn("jungle", eao.l));
   public static final ebn h = a(new ebn("dark_oak", eao.m));
   public static final ebn i = a(new ebn("pale_oak", eao.n));
   public static final ebn j = a(new ebn("crimson", eao.o, dtv.aU, dtv.aR, awn.rF, awn.rG));
   public static final ebn k = a(new ebn("warped", eao.p, dtv.aU, dtv.aR, awn.rF, awn.rG));
   public static final ebn l = a(new ebn("mangrove", eao.q));
   public static final ebn m = a(new ebn("bamboo", eao.r, dtv.aT, dtv.aS, awn.bw, awn.bx));

   public ebn(String $$0, eao $$1) {
      this($$0, $$1, dtv.b, dtv.aQ, awn.jj, awn.jk);
   }

   private static ebn a(ebn $$0) {
      t.put($$0.b(), $$0);
      return $$0;
   }

   public static Stream<ebn> a() {
      return t.values().stream();
   }

   public String b() {
      return this.n;
   }

   public eao c() {
      return this.o;
   }

   public dtv d() {
      return this.p;
   }

   public dtv e() {
      return this.q;
   }

   public awm f() {
      return this.r;
   }

   public awm g() {
      return this.s;
   }
}
