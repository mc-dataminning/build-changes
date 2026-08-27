import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Optional;
import java.util.function.Function;

public class bsy extends bsl<brb> {
   public static final int c = 100;
   public static final double d = 2.5;
   public static final double e = 3.5;
   private final Function<bqt, Float> f;
   private final Function<bqt, Double> g;

   public bsy(Function<bqt, Float> $$0) {
      this($$0, $$0x -> 2.5);
   }

   public bsy(Function<bqt, Float> $$0, Function<bqt, Double> $$1) {
      super(ac.a(() -> {
         Builder<bzw<?>, bzx> $$0x = ImmutableMap.builder();
         $$0x.put(bzw.n, bzx.c);
         $$0x.put(bzw.m, bzx.c);
         $$0x.put(bzw.P, bzx.b);
         $$0x.put(bzw.R, bzx.c);
         $$0x.put(bzw.O, bzx.a);
         $$0x.put(bzw.r, bzx.b);
         $$0x.put(bzw.Z, bzx.b);
         return $$0x.build();
      }));
      this.f = $$0;
      this.g = $$1;
   }

   protected float a(brb $$0) {
      return this.f.apply($$0);
   }

   private Optional<cka> b(brb $$0) {
      return $$0.dP().c(bzw.O);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected boolean a(apu $$0, brb $$1, long $$2) {
      return this.b($$1).isPresent() && !$$1.dP().a(bzw.r) && !$$1.dP().a(bzw.Z);
   }

   protected void b(apu $$0, brb $$1, long $$2) {
      $$1.dP().a(bzw.R, true);
   }

   protected void c(apu $$0, brb $$1, long $$2) {
      bru<?> $$3 = $$1.dP();
      $$3.a(bzw.P, 100);
      $$3.a(bzw.R, false);
      $$3.b(bzw.m);
      $$3.b(bzw.n);
   }

   protected void d(apu $$0, brb $$1, long $$2) {
      cka $$3 = this.b($$1).get();
      bru<?> $$4 = $$1.dP();
      $$4.a(bzw.n, new bsw($$3, true));
      double $$5 = this.g.apply($$1);
      if ($$1.g($$3) < axm.k($$5)) {
         $$4.b(bzw.m);
      } else {
         $$4.a(bzw.m, new bzz(new bsw($$3, false), this.a($$1), 2));
      }
   }
}
