import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record ecc(String n, ebd o, duj p, duj q, awm r, awm s) {
   private static final Map<String, ecc> t = new Object2ObjectArrayMap();
   public static final Codec<ecc> a = Codec.stringResolver(ecc::b, t::get);
   public static final ecc b = a(new ecc("oak", ebd.g));
   public static final ecc c = a(new ecc("spruce", ebd.h));
   public static final ecc d = a(new ecc("birch", ebd.i));
   public static final ecc e = a(new ecc("acacia", ebd.j));
   public static final ecc f = a(new ecc("cherry", ebd.k, duj.aW, duj.aZ, awn.eQ, awn.eR));
   public static final ecc g = a(new ecc("jungle", ebd.l));
   public static final ecc h = a(new ecc("dark_oak", ebd.m));
   public static final ecc i = a(new ecc("pale_oak", ebd.n));
   public static final ecc j = a(new ecc("crimson", ebd.o, duj.aV, duj.aS, awn.rI, awn.rJ));
   public static final ecc k = a(new ecc("warped", ebd.p, duj.aV, duj.aS, awn.rI, awn.rJ));
   public static final ecc l = a(new ecc("mangrove", ebd.q));
   public static final ecc m = a(new ecc("bamboo", ebd.r, duj.aU, duj.aT, awn.bw, awn.bx));

   public ecc(String $$0, ebd $$1) {
      this($$0, $$1, duj.b, duj.aR, awn.jl, awn.jm);
   }

   private static ecc a(ecc $$0) {
      t.put($$0.b(), $$0);
      return $$0;
   }

   public static Stream<ecc> a() {
      return t.values().stream();
   }

   public String b() {
      return this.n;
   }

   public ebd c() {
      return this.o;
   }

   public duj d() {
      return this.p;
   }

   public duj e() {
      return this.q;
   }

   public awm f() {
      return this.r;
   }

   public awm g() {
      return this.s;
   }
}
