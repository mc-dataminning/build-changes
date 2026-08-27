import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Optional;
import java.util.function.Function;

public class boj extends bnw<bmo> {
   public static final int c = 100;
   public static final double d = 2.5;
   public static final double e = 3.5;
   private final Function<bmf, Float> f;
   private final Function<bmf, Double> g;

   public boj(Function<bmf, Float> $$0) {
      this($$0, $$0x -> 2.5);
   }

   public boj(Function<bmf, Float> $$0, Function<bmf, Double> $$1) {
      super(ac.a(() -> {
         Builder<bvh<?>, bvi> $$0x = ImmutableMap.builder();
         $$0x.put(bvh.n, bvi.c);
         $$0x.put(bvh.m, bvi.c);
         $$0x.put(bvh.O, bvi.b);
         $$0x.put(bvh.Q, bvi.c);
         $$0x.put(bvh.N, bvi.a);
         $$0x.put(bvh.r, bvi.b);
         $$0x.put(bvh.Y, bvi.b);
         return $$0x.build();
      }));
      this.f = $$0;
      this.g = $$1;
   }

   protected float a(bmo $$0) {
      return this.f.apply($$0);
   }

   private Optional<cfb> b(bmo $$0) {
      return $$0.dO().c(bvh.N);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected boolean a(amz $$0, bmo $$1, long $$2) {
      return this.b($$1).isPresent() && !$$1.dO().a(bvh.r) && !$$1.dO().a(bvh.Y);
   }

   protected void b(amz $$0, bmo $$1, long $$2) {
      $$1.dO().a(bvh.Q, true);
   }

   protected void c(amz $$0, bmo $$1, long $$2) {
      bnf<?> $$3 = $$1.dO();
      $$3.a(bvh.O, 100);
      $$3.a(bvh.Q, false);
      $$3.b(bvh.m);
      $$3.b(bvh.n);
   }

   protected void d(amz $$0, bmo $$1, long $$2) {
      cfb $$3 = this.b($$1).get();
      bnf<?> $$4 = $$1.dO();
      $$4.a(bvh.n, new boh($$3, true));
      double $$5 = this.g.apply($$1);
      if ($$1.f($$3) < aui.k($$5)) {
         $$4.b(bvh.m);
      } else {
         $$4.a(bvh.m, new bvk(new boh($$3, false), this.a($$1), 2));
      }
   }
}
