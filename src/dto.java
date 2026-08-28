import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dto(String m, dsq n, dml o, dml p, avy q, avy r) {
   private static final Map<String, dto> s = new Object2ObjectArrayMap();
   public static final Codec<dto> a = Codec.stringResolver(dto::b, s::get);
   public static final dto b = a(new dto("oak", dsq.g));
   public static final dto c = a(new dto("spruce", dsq.h));
   public static final dto d = a(new dto("birch", dsq.i));
   public static final dto e = a(new dto("acacia", dsq.j));
   public static final dto f = a(new dto("cherry", dsq.k, dml.aU, dml.aX, avz.eM, avz.eN));
   public static final dto g = a(new dto("jungle", dsq.l));
   public static final dto h = a(new dto("dark_oak", dsq.m));
   public static final dto i = a(new dto("crimson", dsq.n, dml.aT, dml.aQ, avz.qT, avz.qU));
   public static final dto j = a(new dto("warped", dsq.o, dml.aT, dml.aQ, avz.qT, avz.qU));
   public static final dto k = a(new dto("mangrove", dsq.p));
   public static final dto l = a(new dto("bamboo", dsq.q, dml.aS, dml.aR, avz.bw, avz.bx));

   public dto(String $$0, dsq $$1) {
      this($$0, $$1, dml.b, dml.aP, avz.iI, avz.iJ);
   }

   private static dto a(dto $$0) {
      s.put($$0.b(), $$0);
      return $$0;
   }

   public static Stream<dto> a() {
      return s.values().stream();
   }

   public String b() {
      return this.m;
   }

   public dsq c() {
      return this.n;
   }

   public dml d() {
      return this.o;
   }

   public dml e() {
      return this.p;
   }

   public avy f() {
      return this.q;
   }

   public avy g() {
      return this.r;
   }
}
