import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.stream.Stream;

public record dup(String n, dtr o, dnd p, dnd q, avn r, avn s) {
   private static final Map<String, dup> t = new Object2ObjectArrayMap();
   public static final Codec<dup> a = axu.a(dup::b, t::get);
   public static final dup b = a(new dup("oak", dtr.g));
   public static final dup c = a(new dup("spruce", dtr.h));
   public static final dup d = a(new dup("birch", dtr.i));
   public static final dup e = a(new dup("acacia", dtr.j));
   public static final dup f = a(new dup("cherry", dtr.k, dnd.aZ, dnd.bc, avo.eR, avo.eS));
   public static final dup g = a(new dup("jungle", dtr.l));
   public static final dup h = a(new dup("dark_oak", dtr.m));
   public static final dup i = a(new dup("crimson", dtr.n, dnd.aT, dnd.aQ, avo.rs, avo.rt));
   public static final dup j = a(new dup("warped", dtr.o, dnd.aT, dnd.aQ, avo.rs, avo.rt));
   public static final dup k = a(new dup("potato", dtr.p, dnd.aT, dnd.aQ, avo.rs, avo.rt));
   public static final dup l = a(new dup("mangrove", dtr.q));
   public static final dup m = a(new dup("bamboo", dtr.r, dnd.aS, dnd.aR, avo.bB, avo.bC));

   public dup(String $$0, dtr $$1) {
      this($$0, $$1, dnd.b, dnd.aP, avo.iV, avo.iW);
   }

   private static dup a(dup $$0) {
      t.put($$0.b(), $$0);
      return $$0;
   }

   public static Stream<dup> a() {
      return t.values().stream();
   }

   public String b() {
      return this.n;
   }

   public dtr c() {
      return this.o;
   }

   public dnd d() {
      return this.p;
   }

   public dnd e() {
      return this.q;
   }

   public avn f() {
      return this.r;
   }

   public avn g() {
      return this.s;
   }
}
