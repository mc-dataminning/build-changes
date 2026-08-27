import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dso(String m, drq n, dll o, dll p, avg q, avg r) {
   private static final Map<String, dso> s = new Object2ObjectArrayMap();
   public static final Codec<dso> a = Codec.stringResolver(dso::b, s::get);
   public static final dso b = a(new dso("oak", drq.g));
   public static final dso c = a(new dso("spruce", drq.h));
   public static final dso d = a(new dso("birch", drq.i));
   public static final dso e = a(new dso("acacia", drq.j));
   public static final dso f = a(new dso("cherry", drq.k, dll.aU, dll.aX, avh.eM, avh.eN));
   public static final dso g = a(new dso("jungle", drq.l));
   public static final dso h = a(new dso("dark_oak", drq.m));
   public static final dso i = a(new dso("crimson", drq.n, dll.aT, dll.aQ, avh.qT, avh.qU));
   public static final dso j = a(new dso("warped", drq.o, dll.aT, dll.aQ, avh.qT, avh.qU));
   public static final dso k = a(new dso("mangrove", drq.p));
   public static final dso l = a(new dso("bamboo", drq.q, dll.aS, dll.aR, avh.bw, avh.bx));

   public dso(String $$0, drq $$1) {
      this($$0, $$1, dll.b, dll.aP, avh.iI, avh.iJ);
   }

   private static dso a(dso $$0) {
      s.put($$0.b(), $$0);
      return $$0;
   }

   public static Stream<dso> a() {
      return s.values().stream();
   }

   public String b() {
      return this.m;
   }

   public drq c() {
      return this.n;
   }

   public dll d() {
      return this.o;
   }

   public dll e() {
      return this.p;
   }

   public avg f() {
      return this.q;
   }

   public avg g() {
      return this.r;
   }
}
