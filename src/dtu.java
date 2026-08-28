import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dtu(String m, dsw n, dms o, dms p, ave q, ave r) {
   private static final Map<String, dtu> s = new Object2ObjectArrayMap();
   public static final Codec<dtu> a = Codec.stringResolver(dtu::b, s::get);
   public static final dtu b = a(new dtu("oak", dsw.g));
   public static final dtu c = a(new dtu("spruce", dsw.h));
   public static final dtu d = a(new dtu("birch", dsw.i));
   public static final dtu e = a(new dtu("acacia", dsw.j));
   public static final dtu f = a(new dtu("cherry", dsw.k, dms.aU, dms.aX, avf.eM, avf.eN));
   public static final dtu g = a(new dtu("jungle", dsw.l));
   public static final dtu h = a(new dtu("dark_oak", dsw.m));
   public static final dtu i = a(new dtu("crimson", dsw.n, dms.aT, dms.aQ, avf.qW, avf.qX));
   public static final dtu j = a(new dtu("warped", dsw.o, dms.aT, dms.aQ, avf.qW, avf.qX));
   public static final dtu k = a(new dtu("mangrove", dsw.p));
   public static final dtu l = a(new dtu("bamboo", dsw.q, dms.aS, dms.aR, avf.bw, avf.bx));

   public dtu(String $$0, dsw $$1) {
      this($$0, $$1, dms.b, dms.aP, avf.iI, avf.iJ);
   }

   private static dtu a(dtu $$0) {
      s.put($$0.b(), $$0);
      return $$0;
   }

   public static Stream<dtu> a() {
      return s.values().stream();
   }

   public String b() {
      return this.m;
   }

   public dsw c() {
      return this.n;
   }

   public dms d() {
      return this.o;
   }

   public dms e() {
      return this.p;
   }

   public ave f() {
      return this.q;
   }

   public ave g() {
      return this.r;
   }
}
