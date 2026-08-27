import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record drl(String m, dqn n, dki o, dki p, auy q, auy r) {
   private static final Map<String, drl> s = new Object2ObjectArrayMap();
   public static final Codec<drl> a = axe.a(drl::b, s::get);
   public static final drl b = a(new drl("oak", dqn.g));
   public static final drl c = a(new drl("spruce", dqn.h));
   public static final drl d = a(new drl("birch", dqn.i));
   public static final drl e = a(new drl("acacia", dqn.j));
   public static final drl f = a(new drl("cherry", dqn.k, dki.aU, dki.aX, auz.eM, auz.eN));
   public static final drl g = a(new drl("jungle", dqn.l));
   public static final drl h = a(new drl("dark_oak", dqn.m));
   public static final drl i = a(new drl("crimson", dqn.n, dki.aT, dki.aQ, auz.qI, auz.qJ));
   public static final drl j = a(new drl("warped", dqn.o, dki.aT, dki.aQ, auz.qI, auz.qJ));
   public static final drl k = a(new drl("mangrove", dqn.p));
   public static final drl l = a(new drl("bamboo", dqn.q, dki.aS, dki.aR, auz.bw, auz.bx));

   public drl(String $$0, dqn $$1) {
      this($$0, $$1, dki.b, dki.aP, auz.iD, auz.iE);
   }

   private static drl a(drl $$0) {
      s.put($$0.b(), $$0);
      return $$0;
   }

   public static Stream<drl> a() {
      return s.values().stream();
   }

   public String b() {
      return this.m;
   }

   public dqn c() {
      return this.n;
   }

   public dki d() {
      return this.o;
   }

   public dki e() {
      return this.p;
   }

   public auy f() {
      return this.q;
   }

   public auy g() {
      return this.r;
   }
}
