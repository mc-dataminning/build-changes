import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record ebc(String n, ead o, dtn p, dtn q, awk r, awk s) {
   private static final Map<String, ebc> t = new Object2ObjectArrayMap();
   public static final Codec<ebc> a = Codec.stringResolver(ebc::b, t::get);
   public static final ebc b = a(new ebc("oak", ead.g));
   public static final ebc c = a(new ebc("spruce", ead.h));
   public static final ebc d = a(new ebc("birch", ead.i));
   public static final ebc e = a(new ebc("acacia", ead.j));
   public static final ebc f = a(new ebc("cherry", ead.k, dtn.aV, dtn.aY, awl.eO, awl.eP));
   public static final ebc g = a(new ebc("jungle", ead.l));
   public static final ebc h = a(new ebc("dark_oak", ead.m));
   public static final ebc i = a(new ebc("pale_oak", ead.n));
   public static final ebc j = a(new ebc("crimson", ead.o, dtn.aU, dtn.aR, awl.rE, awl.rF));
   public static final ebc k = a(new ebc("warped", ead.p, dtn.aU, dtn.aR, awl.rE, awl.rF));
   public static final ebc l = a(new ebc("mangrove", ead.q));
   public static final ebc m = a(new ebc("bamboo", ead.r, dtn.aT, dtn.aS, awl.bw, awl.bx));

   public ebc(String $$0, ead $$1) {
      this($$0, $$1, dtn.b, dtn.aQ, awl.ji, awl.jj);
   }

   private static ebc a(ebc $$0) {
      t.put($$0.b(), $$0);
      return $$0;
   }

   public static Stream<ebc> a() {
      return t.values().stream();
   }

   public String b() {
      return this.n;
   }

   public ead c() {
      return this.o;
   }

   public dtn d() {
      return this.p;
   }

   public dtn e() {
      return this.q;
   }

   public awk f() {
      return this.r;
   }

   public awk g() {
      return this.s;
   }
}
