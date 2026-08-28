import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dun(String m, dtp n, dnk o, dnk p, avn q, avn r) {
   private static final Map<String, dun> s = new Object2ObjectArrayMap();
   public static final Codec<dun> a = Codec.stringResolver(dun::b, s::get);
   public static final dun b = a(new dun("oak", dtp.g));
   public static final dun c = a(new dun("spruce", dtp.h));
   public static final dun d = a(new dun("birch", dtp.i));
   public static final dun e = a(new dun("acacia", dtp.j));
   public static final dun f = a(new dun("cherry", dtp.k, dnk.aU, dnk.aX, avo.eM, avo.eN));
   public static final dun g = a(new dun("jungle", dtp.l));
   public static final dun h = a(new dun("dark_oak", dtp.m));
   public static final dun i = a(new dun("crimson", dtp.n, dnk.aT, dnk.aQ, avo.qW, avo.qX));
   public static final dun j = a(new dun("warped", dtp.o, dnk.aT, dnk.aQ, avo.qW, avo.qX));
   public static final dun k = a(new dun("mangrove", dtp.p));
   public static final dun l = a(new dun("bamboo", dtp.q, dnk.aS, dnk.aR, avo.bw, avo.bx));

   public dun(String $$0, dtp $$1) {
      this($$0, $$1, dnk.b, dnk.aP, avo.iI, avo.iJ);
   }

   private static dun a(dun $$0) {
      s.put($$0.b(), $$0);
      return $$0;
   }

   public static Stream<dun> a() {
      return s.values().stream();
   }

   public String b() {
      return this.m;
   }

   public dtp c() {
      return this.n;
   }

   public dnk d() {
      return this.o;
   }

   public dnk e() {
      return this.p;
   }

   public avn f() {
      return this.q;
   }

   public avn g() {
      return this.r;
   }
}
