import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record ecu(String n, ebv o, dvb p, dvb q, awq r, awq s) {
   private static final Map<String, ecu> t = new Object2ObjectArrayMap();
   public static final Codec<ecu> a = Codec.stringResolver(ecu::b, t::get);
   public static final ecu b = a(new ecu("oak", ebv.g));
   public static final ecu c = a(new ecu("spruce", ebv.h));
   public static final ecu d = a(new ecu("birch", ebv.i));
   public static final ecu e = a(new ecu("acacia", ebv.j));
   public static final ecu f = a(new ecu("cherry", ebv.k, dvb.aW, dvb.aZ, awr.eQ, awr.eR));
   public static final ecu g = a(new ecu("jungle", ebv.l));
   public static final ecu h = a(new ecu("dark_oak", ebv.m));
   public static final ecu i = a(new ecu("pale_oak", ebv.n));
   public static final ecu j = a(new ecu("crimson", ebv.o, dvb.aV, dvb.aS, awr.rI, awr.rJ));
   public static final ecu k = a(new ecu("warped", ebv.p, dvb.aV, dvb.aS, awr.rI, awr.rJ));
   public static final ecu l = a(new ecu("mangrove", ebv.q));
   public static final ecu m = a(new ecu("bamboo", ebv.r, dvb.aU, dvb.aT, awr.bw, awr.bx));

   public ecu(String $$0, ebv $$1) {
      this($$0, $$1, dvb.b, dvb.aR, awr.jl, awr.jm);
   }

   private static ecu a(ecu $$0) {
      t.put($$0.b(), $$0);
      return $$0;
   }

   public static Stream<ecu> a() {
      return t.values().stream();
   }

   public String b() {
      return this.n;
   }

   public ebv c() {
      return this.o;
   }

   public dvb d() {
      return this.p;
   }

   public dvb e() {
      return this.q;
   }

   public awq f() {
      return this.r;
   }

   public awq g() {
      return this.s;
   }
}
