import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Optional;
import java.util.function.Function;

public class bst extends bsg<bqw> {
   public static final int c = 100;
   public static final double d = 2.5;
   public static final double e = 3.5;
   private final Function<bqo, Float> f;
   private final Function<bqo, Double> g;

   public bst(Function<bqo, Float> $$0) {
      this($$0, $$0x -> 2.5);
   }

   public bst(Function<bqo, Float> $$0, Function<bqo, Double> $$1) {
      super(ac.a(() -> {
         Builder<bzr<?>, bzs> $$0x = ImmutableMap.builder();
         $$0x.put(bzr.n, bzs.c);
         $$0x.put(bzr.m, bzs.c);
         $$0x.put(bzr.P, bzs.b);
         $$0x.put(bzr.R, bzs.c);
         $$0x.put(bzr.O, bzs.a);
         $$0x.put(bzr.r, bzs.b);
         $$0x.put(bzr.Z, bzs.b);
         return $$0x.build();
      }));
      this.f = $$0;
      this.g = $$1;
   }

   protected float a(bqw $$0) {
      return this.f.apply($$0);
   }

   private Optional<cjt> b(bqw $$0) {
      return $$0.dP().c(bzr.O);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected boolean a(aps $$0, bqw $$1, long $$2) {
      return this.b($$1).isPresent() && !$$1.dP().a(bzr.r) && !$$1.dP().a(bzr.Z);
   }

   protected void b(aps $$0, bqw $$1, long $$2) {
      $$1.dP().a(bzr.R, true);
   }

   protected void c(aps $$0, bqw $$1, long $$2) {
      brp<?> $$3 = $$1.dP();
      $$3.a(bzr.P, 100);
      $$3.a(bzr.R, false);
      $$3.b(bzr.m);
      $$3.b(bzr.n);
   }

   protected void d(aps $$0, bqw $$1, long $$2) {
      cjt $$3 = this.b($$1).get();
      brp<?> $$4 = $$1.dP();
      $$4.a(bzr.n, new bsr($$3, true));
      double $$5 = this.g.apply($$1);
      if ($$1.g($$3) < axk.k($$5)) {
         $$4.b(bzr.m);
      } else {
         $$4.a(bzr.m, new bzu(new bsr($$3, false), this.a($$1), 2));
      }
   }
}
