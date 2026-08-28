import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record ecs(String n, ebt o, duz p, duz q, awo r, awo s) {
   private static final Map<String, ecs> t = new Object2ObjectArrayMap();
   public static final Codec<ecs> a = Codec.stringResolver(ecs::b, t::get);
   public static final ecs b = a(new ecs("oak", ebt.g));
   public static final ecs c = a(new ecs("spruce", ebt.h));
   public static final ecs d = a(new ecs("birch", ebt.i));
   public static final ecs e = a(new ecs("acacia", ebt.j));
   public static final ecs f = a(new ecs("cherry", ebt.k, duz.aW, duz.aZ, awp.eQ, awp.eR));
   public static final ecs g = a(new ecs("jungle", ebt.l));
   public static final ecs h = a(new ecs("dark_oak", ebt.m));
   public static final ecs i = a(new ecs("pale_oak", ebt.n));
   public static final ecs j = a(new ecs("crimson", ebt.o, duz.aV, duz.aS, awp.rI, awp.rJ));
   public static final ecs k = a(new ecs("warped", ebt.p, duz.aV, duz.aS, awp.rI, awp.rJ));
   public static final ecs l = a(new ecs("mangrove", ebt.q));
   public static final ecs m = a(new ecs("bamboo", ebt.r, duz.aU, duz.aT, awp.bw, awp.bx));

   public ecs(String $$0, ebt $$1) {
      this($$0, $$1, duz.b, duz.aR, awp.jl, awp.jm);
   }

   private static ecs a(ecs $$0) {
      t.put($$0.b(), $$0);
      return $$0;
   }

   public static Stream<ecs> a() {
      return t.values().stream();
   }

   public String b() {
      return this.n;
   }

   public ebt c() {
      return this.o;
   }

   public duz d() {
      return this.p;
   }

   public duz e() {
      return this.q;
   }

   public awo f() {
      return this.r;
   }

   public awo g() {
      return this.s;
   }
}
