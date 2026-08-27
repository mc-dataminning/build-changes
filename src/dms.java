import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dms(String m, dlu n, dga o, dga p, atj q, atj r) {
   private static final Map<String, dms> s = new Object2ObjectArrayMap();
   public static final Codec<dms> a = avp.a(dms::b, s::get);
   public static final dms b = a(new dms("oak", dlu.g));
   public static final dms c = a(new dms("spruce", dlu.h));
   public static final dms d = a(new dms("birch", dlu.i));
   public static final dms e = a(new dms("acacia", dlu.j));
   public static final dms f = a(new dms("cherry", dlu.k, dga.aU, dga.aX, atk.eD, atk.eE));
   public static final dms g = a(new dms("jungle", dlu.l));
   public static final dms h = a(new dms("dark_oak", dlu.m));
   public static final dms i = a(new dms("crimson", dlu.n, dga.aT, dga.aQ, atk.qq, atk.qr));
   public static final dms j = a(new dms("warped", dlu.o, dga.aT, dga.aQ, atk.qq, atk.qr));
   public static final dms k = a(new dms("mangrove", dlu.p));
   public static final dms l = a(new dms("bamboo", dlu.q, dga.aS, dga.aR, atk.bt, atk.bu));

   public dms(String $$0, dlu $$1) {
      this($$0, $$1, dga.b, dga.aP, atk.it, atk.iu);
   }

   private static dms a(dms $$0) {
      s.put($$0.b(), $$0);
      return $$0;
   }

   public static Stream<dms> a() {
      return s.values().stream();
   }

   public String b() {
      return this.m;
   }

   public dlu c() {
      return this.n;
   }

   public dga d() {
      return this.o;
   }

   public dga e() {
      return this.p;
   }

   public atj f() {
      return this.q;
   }

   public atj g() {
      return this.r;
   }
}
