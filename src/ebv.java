import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record ebv(String n, eaw o, duc p, duc q, awm r, awm s) {
   private static final Map<String, ebv> t = new Object2ObjectArrayMap();
   public static final Codec<ebv> a = Codec.stringResolver(ebv::b, t::get);
   public static final ebv b = a(new ebv("oak", eaw.g));
   public static final ebv c = a(new ebv("spruce", eaw.h));
   public static final ebv d = a(new ebv("birch", eaw.i));
   public static final ebv e = a(new ebv("acacia", eaw.j));
   public static final ebv f = a(new ebv("cherry", eaw.k, duc.aW, duc.aZ, awn.eQ, awn.eR));
   public static final ebv g = a(new ebv("jungle", eaw.l));
   public static final ebv h = a(new ebv("dark_oak", eaw.m));
   public static final ebv i = a(new ebv("pale_oak", eaw.n));
   public static final ebv j = a(new ebv("crimson", eaw.o, duc.aV, duc.aS, awn.rI, awn.rJ));
   public static final ebv k = a(new ebv("warped", eaw.p, duc.aV, duc.aS, awn.rI, awn.rJ));
   public static final ebv l = a(new ebv("mangrove", eaw.q));
   public static final ebv m = a(new ebv("bamboo", eaw.r, duc.aU, duc.aT, awn.bw, awn.bx));

   public ebv(String $$0, eaw $$1) {
      this($$0, $$1, duc.b, duc.aR, awn.jl, awn.jm);
   }

   private static ebv a(ebv $$0) {
      t.put($$0.b(), $$0);
      return $$0;
   }

   public static Stream<ebv> a() {
      return t.values().stream();
   }

   public String b() {
      return this.n;
   }

   public eaw c() {
      return this.o;
   }

   public duc d() {
      return this.p;
   }

   public duc e() {
      return this.q;
   }

   public awm f() {
      return this.r;
   }

   public awm g() {
      return this.s;
   }
}
