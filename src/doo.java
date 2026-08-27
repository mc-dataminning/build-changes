import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record doo(String m, dnq n, dho o, dho p, atx q, atx r) {
   private static final Map<String, doo> s = new Object2ObjectArrayMap();
   public static final Codec<doo> a = awe.a(doo::b, s::get);
   public static final doo b = a(new doo("oak", dnq.g));
   public static final doo c = a(new doo("spruce", dnq.h));
   public static final doo d = a(new doo("birch", dnq.i));
   public static final doo e = a(new doo("acacia", dnq.j));
   public static final doo f = a(new doo("cherry", dnq.k, dho.aU, dho.aX, aty.eL, aty.eM));
   public static final doo g = a(new doo("jungle", dnq.l));
   public static final doo h = a(new doo("dark_oak", dnq.m));
   public static final doo i = a(new doo("crimson", dnq.n, dho.aT, dho.aQ, aty.qy, aty.qz));
   public static final doo j = a(new doo("warped", dnq.o, dho.aT, dho.aQ, aty.qy, aty.qz));
   public static final doo k = a(new doo("mangrove", dnq.p));
   public static final doo l = a(new doo("bamboo", dnq.q, dho.aS, dho.aR, aty.bw, aty.bx));

   public doo(String $$0, dnq $$1) {
      this($$0, $$1, dho.b, dho.aP, aty.iB, aty.iC);
   }

   private static doo a(doo $$0) {
      s.put($$0.b(), $$0);
      return $$0;
   }

   public static Stream<doo> a() {
      return s.values().stream();
   }

   public String b() {
      return this.m;
   }

   public dnq c() {
      return this.n;
   }

   public dho d() {
      return this.o;
   }

   public dho e() {
      return this.p;
   }

   public atx f() {
      return this.q;
   }

   public atx g() {
      return this.r;
   }
}
