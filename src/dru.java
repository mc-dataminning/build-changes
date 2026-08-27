import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dru(String m, dqw n, dkr o, dkr p, avb q, avb r) {
   private static final Map<String, dru> s = new Object2ObjectArrayMap();
   public static final Codec<dru> a = axh.a(dru::b, s::get);
   public static final dru b = a(new dru("oak", dqw.g));
   public static final dru c = a(new dru("spruce", dqw.h));
   public static final dru d = a(new dru("birch", dqw.i));
   public static final dru e = a(new dru("acacia", dqw.j));
   public static final dru f = a(new dru("cherry", dqw.k, dkr.aU, dkr.aX, avc.eM, avc.eN));
   public static final dru g = a(new dru("jungle", dqw.l));
   public static final dru h = a(new dru("dark_oak", dqw.m));
   public static final dru i = a(new dru("crimson", dqw.n, dkr.aT, dkr.aQ, avc.qJ, avc.qK));
   public static final dru j = a(new dru("warped", dqw.o, dkr.aT, dkr.aQ, avc.qJ, avc.qK));
   public static final dru k = a(new dru("mangrove", dqw.p));
   public static final dru l = a(new dru("bamboo", dqw.q, dkr.aS, dkr.aR, avc.bw, avc.bx));

   public dru(String $$0, dqw $$1) {
      this($$0, $$1, dkr.b, dkr.aP, avc.iD, avc.iE);
   }

   private static dru a(dru $$0) {
      s.put($$0.b(), $$0);
      return $$0;
   }

   public static Stream<dru> a() {
      return s.values().stream();
   }

   public String b() {
      return this.m;
   }

   public dqw c() {
      return this.n;
   }

   public dkr d() {
      return this.o;
   }

   public dkr e() {
      return this.p;
   }

   public avb f() {
      return this.q;
   }

   public avb g() {
      return this.r;
   }
}
