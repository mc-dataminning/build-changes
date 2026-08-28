import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dxh(String m, dwk n, dqd o, dqd p, awm q, awm r) {
   private static final Map<String, dxh> s = new Object2ObjectArrayMap();
   public static final Codec<dxh> a = Codec.stringResolver(dxh::b, s::get);
   public static final dxh b = a(new dxh("oak", dwk.g));
   public static final dxh c = a(new dxh("spruce", dwk.h));
   public static final dxh d = a(new dxh("birch", dwk.i));
   public static final dxh e = a(new dxh("acacia", dwk.j));
   public static final dxh f = a(new dxh("cherry", dwk.k, dqd.aU, dqd.aX, awn.eN, awn.eO));
   public static final dxh g = a(new dxh("jungle", dwk.l));
   public static final dxh h = a(new dxh("dark_oak", dwk.m));
   public static final dxh i = a(new dxh("crimson", dwk.n, dqd.aT, dqd.aQ, awn.qV, awn.qW));
   public static final dxh j = a(new dxh("warped", dwk.o, dqd.aT, dqd.aQ, awn.qV, awn.qW));
   public static final dxh k = a(new dxh("mangrove", dwk.p));
   public static final dxh l = a(new dxh("bamboo", dwk.q, dqd.aS, dqd.aR, awn.bw, awn.bx));

   public dxh(String $$0, dwk $$1) {
      this($$0, $$1, dqd.b, dqd.aP, awn.iJ, awn.iK);
   }

   private static dxh a(dxh $$0) {
      s.put($$0.b(), $$0);
      return $$0;
   }

   public static Stream<dxh> a() {
      return s.values().stream();
   }

   public String b() {
      return this.m;
   }

   public dwk c() {
      return this.n;
   }

   public dqd d() {
      return this.o;
   }

   public dqd e() {
      return this.p;
   }

   public awm f() {
      return this.q;
   }

   public awm g() {
      return this.r;
   }
}
