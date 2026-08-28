import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Optional;
import java.util.function.Function;

public class bye extends bxr<bwg> {
   public static final int c = 100;
   public static final double d = 2.5;
   public static final double e = 3.5;
   private final Function<bvy, Float> f;
   private final Function<bvy, Double> g;

   public bye(Function<bvy, Float> $$0) {
      this($$0, $$0x -> 2.5);
   }

   public bye(Function<bvy, Float> $$0, Function<bvy, Double> $$1) {
      super(af.a(() -> {
         Builder<cfc<?>, cfd> $$0x = ImmutableMap.builder();
         $$0x.put(cfc.n, cfd.c);
         $$0x.put(cfc.m, cfd.c);
         $$0x.put(cfc.P, cfd.b);
         $$0x.put(cfc.R, cfd.c);
         $$0x.put(cfc.O, cfd.a);
         $$0x.put(cfc.r, cfd.b);
         $$0x.put(cfc.Z, cfd.b);
         return $$0x.build();
      }));
      this.f = $$0;
      this.g = $$1;
   }

   protected float a(bwg $$0) {
      return this.f.apply($$0);
   }

   private Optional<cpr> b(bwg $$0) {
      return $$0.ea().c(cfc.O);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected boolean a(ard $$0, bwg $$1, long $$2) {
      return this.b($$1).isPresent() && !$$1.ea().a(cfc.r) && !$$1.ea().a(cfc.Z);
   }

   protected void b(ard $$0, bwg $$1, long $$2) {
      $$1.ea().a(cfc.R, true);
   }

   protected void c(ard $$0, bwg $$1, long $$2) {
      bxa<?> $$3 = $$1.ea();
      $$3.a(cfc.P, 100);
      $$3.a(cfc.R, false);
      $$3.b(cfc.m);
      $$3.b(cfc.n);
   }

   protected void d(ard $$0, bwg $$1, long $$2) {
      cpr $$3 = this.b($$1).get();
      bxa<?> $$4 = $$1.ea();
      $$4.a(cfc.n, new byc($$3, true));
      double $$5 = this.g.apply($$1);
      if ($$1.g($$3) < ayz.k($$5)) {
         $$4.b(cfc.m);
      } else {
         $$4.a(cfc.m, new cff(new byc($$3, false), this.a($$1), 2));
      }
   }
}
