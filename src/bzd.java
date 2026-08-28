import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Optional;
import java.util.function.Function;

public class bzd extends byq<bxh> {
   public static final int c = 100;
   public static final double d = 2.5;
   public static final double e = 3.5;
   private final Function<bwz, Float> f;
   private final Function<bwz, Double> g;

   public bzd(Function<bwz, Float> $$0) {
      this($$0, $$0x -> 2.5);
   }

   public bzd(Function<bwz, Float> $$0, Function<bwz, Double> $$1) {
      super(af.a(() -> {
         Builder<cgb<?>, cgc> $$0x = ImmutableMap.builder();
         $$0x.put(cgb.o, cgc.c);
         $$0x.put(cgb.n, cgc.c);
         $$0x.put(cgb.Q, cgc.b);
         $$0x.put(cgb.S, cgc.c);
         $$0x.put(cgb.P, cgc.a);
         $$0x.put(cgb.s, cgc.b);
         $$0x.put(cgb.aa, cgc.b);
         return $$0x.build();
      }));
      this.f = $$0;
      this.g = $$1;
   }

   protected float a(bxh $$0) {
      return this.f.apply($$0);
   }

   private Optional<cqs> b(bxh $$0) {
      return $$0.eb().c(cgb.P);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected boolean a(aro $$0, bxh $$1, long $$2) {
      return this.b($$1).isPresent() && !$$1.eb().a(cgb.s) && !$$1.eb().a(cgb.aa);
   }

   protected void b(aro $$0, bxh $$1, long $$2) {
      $$1.eb().a(cgb.S, true);
   }

   protected void c(aro $$0, bxh $$1, long $$2) {
      bxz<?> $$3 = $$1.eb();
      $$3.a(cgb.Q, 100);
      $$3.a(cgb.S, false);
      $$3.b(cgb.n);
      $$3.b(cgb.o);
   }

   protected void d(aro $$0, bxh $$1, long $$2) {
      cqs $$3 = this.b($$1).get();
      bxz<?> $$4 = $$1.eb();
      $$4.a(cgb.o, new bzb($$3, true));
      double $$5 = this.g.apply($$1);
      if ($$1.g($$3) < azk.k($$5)) {
         $$4.b(cgb.n);
      } else {
         $$4.a(cgb.n, new cge(new bzb($$3, false), this.a($$1), 2));
      }
   }
}
