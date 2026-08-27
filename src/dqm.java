import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dqm(String m, dpo n, djk o, djk p, aul q, aul r) {
   private static final Map<String, dqm> s = new Object2ObjectArrayMap();
   public static final Codec<dqm> a = aws.a(dqm::b, s::get);
   public static final dqm b = a(new dqm("oak", dpo.g));
   public static final dqm c = a(new dqm("spruce", dpo.h));
   public static final dqm d = a(new dqm("birch", dpo.i));
   public static final dqm e = a(new dqm("acacia", dpo.j));
   public static final dqm f = a(new dqm("cherry", dpo.k, djk.aU, djk.aX, aum.eM, aum.eN));
   public static final dqm g = a(new dqm("jungle", dpo.l));
   public static final dqm h = a(new dqm("dark_oak", dpo.m));
   public static final dqm i = a(new dqm("crimson", dpo.n, djk.aT, djk.aQ, aum.qB, aum.qC));
   public static final dqm j = a(new dqm("warped", dpo.o, djk.aT, djk.aQ, aum.qB, aum.qC));
   public static final dqm k = a(new dqm("mangrove", dpo.p));
   public static final dqm l = a(new dqm("bamboo", dpo.q, djk.aS, djk.aR, aum.bw, aum.bx));

   public dqm(String $$0, dpo $$1) {
      this($$0, $$1, djk.b, djk.aP, aum.iD, aum.iE);
   }

   private static dqm a(dqm $$0) {
      s.put($$0.b(), $$0);
      return $$0;
   }

   public static Stream<dqm> a() {
      return s.values().stream();
   }

   public String b() {
      return this.m;
   }

   public dpo c() {
      return this.n;
   }

   public djk d() {
      return this.o;
   }

   public djk e() {
      return this.p;
   }

   public aul f() {
      return this.q;
   }

   public aul g() {
      return this.r;
   }
}
