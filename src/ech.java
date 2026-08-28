import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record ech(String n, ebi o, duo p, duo q, awm r, awm s) {
   private static final Map<String, ech> t = new Object2ObjectArrayMap();
   public static final Codec<ech> a = Codec.stringResolver(ech::b, t::get);
   public static final ech b = a(new ech("oak", ebi.g));
   public static final ech c = a(new ech("spruce", ebi.h));
   public static final ech d = a(new ech("birch", ebi.i));
   public static final ech e = a(new ech("acacia", ebi.j));
   public static final ech f = a(new ech("cherry", ebi.k, duo.aW, duo.aZ, awn.eQ, awn.eR));
   public static final ech g = a(new ech("jungle", ebi.l));
   public static final ech h = a(new ech("dark_oak", ebi.m));
   public static final ech i = a(new ech("pale_oak", ebi.n));
   public static final ech j = a(new ech("crimson", ebi.o, duo.aV, duo.aS, awn.rI, awn.rJ));
   public static final ech k = a(new ech("warped", ebi.p, duo.aV, duo.aS, awn.rI, awn.rJ));
   public static final ech l = a(new ech("mangrove", ebi.q));
   public static final ech m = a(new ech("bamboo", ebi.r, duo.aU, duo.aT, awn.bw, awn.bx));

   public ech(String $$0, ebi $$1) {
      this($$0, $$1, duo.b, duo.aR, awn.jl, awn.jm);
   }

   private static ech a(ech $$0) {
      t.put($$0.b(), $$0);
      return $$0;
   }

   public static Stream<ech> a() {
      return t.values().stream();
   }

   public String b() {
      return this.n;
   }

   public ebi c() {
      return this.o;
   }

   public duo d() {
      return this.p;
   }

   public duo e() {
      return this.q;
   }

   public awm f() {
      return this.r;
   }

   public awm g() {
      return this.s;
   }
}
