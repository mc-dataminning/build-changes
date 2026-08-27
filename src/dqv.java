import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dqv(String m, dpx n, djt o, djt p, aun q, aun r) {
   private static final Map<String, dqv> s = new Object2ObjectArrayMap();
   public static final Codec<dqv> a = awu.a(dqv::b, s::get);
   public static final dqv b = a(new dqv("oak", dpx.g));
   public static final dqv c = a(new dqv("spruce", dpx.h));
   public static final dqv d = a(new dqv("birch", dpx.i));
   public static final dqv e = a(new dqv("acacia", dpx.j));
   public static final dqv f = a(new dqv("cherry", dpx.k, djt.aU, djt.aX, auo.eM, auo.eN));
   public static final dqv g = a(new dqv("jungle", dpx.l));
   public static final dqv h = a(new dqv("dark_oak", dpx.m));
   public static final dqv i = a(new dqv("crimson", dpx.n, djt.aT, djt.aQ, auo.qB, auo.qC));
   public static final dqv j = a(new dqv("warped", dpx.o, djt.aT, djt.aQ, auo.qB, auo.qC));
   public static final dqv k = a(new dqv("mangrove", dpx.p));
   public static final dqv l = a(new dqv("bamboo", dpx.q, djt.aS, djt.aR, auo.bw, auo.bx));

   public dqv(String $$0, dpx $$1) {
      this($$0, $$1, djt.b, djt.aP, auo.iD, auo.iE);
   }

   private static dqv a(dqv $$0) {
      s.put($$0.b(), $$0);
      return $$0;
   }

   public static Stream<dqv> a() {
      return s.values().stream();
   }

   public String b() {
      return this.m;
   }

   public dpx c() {
      return this.n;
   }

   public djt d() {
      return this.o;
   }

   public djt e() {
      return this.p;
   }

   public aun f() {
      return this.q;
   }

   public aun g() {
      return this.r;
   }
}
