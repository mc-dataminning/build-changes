import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Optional;
import java.util.function.Function;

public class bie extends bhr<bgi> {
   public static final int c = 100;
   public static final double d = 2.5;
   private final Function<bfz, Float> e;
   private final Function<bfz, Double> f;

   public bie(Function<bfz, Float> $$0) {
      this($$0, $$0x -> 2.5);
   }

   public bie(Function<bfz, Float> $$0, Function<bfz, Double> $$1) {
      super(ac.a(() -> {
         Builder<bpb<?>, bpc> $$0x = ImmutableMap.builder();
         $$0x.put(bpb.n, bpc.c);
         $$0x.put(bpb.m, bpc.c);
         $$0x.put(bpb.O, bpc.b);
         $$0x.put(bpb.Q, bpc.c);
         $$0x.put(bpb.N, bpc.a);
         $$0x.put(bpb.r, bpc.b);
         $$0x.put(bpb.Y, bpc.b);
         return $$0x.build();
      }));
      this.e = $$0;
      this.f = $$1;
   }

   protected float a(bgi $$0) {
      return this.e.apply($$0);
   }

   private Optional<byo> b(bgi $$0) {
      return $$0.dK().c(bpb.N);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected boolean a(aif $$0, bgi $$1, long $$2) {
      return this.b($$1).isPresent() && !$$1.dK().a(bpb.r) && !$$1.dK().a(bpb.Y);
   }

   protected void b(aif $$0, bgi $$1, long $$2) {
      $$1.dK().a(bpb.Q, true);
   }

   protected void c(aif $$0, bgi $$1, long $$2) {
      bha<?> $$3 = $$1.dK();
      $$3.a(bpb.O, 100);
      $$3.a(bpb.Q, false);
      $$3.b(bpb.m);
      $$3.b(bpb.n);
   }

   protected void d(aif $$0, bgi $$1, long $$2) {
      byo $$3 = this.b($$1).get();
      bha<?> $$4 = $$1.dK();
      $$4.a(bpb.n, new bic($$3, true));
      double $$5 = this.f.apply($$1);
      if ($$1.f($$3) < apa.k($$5)) {
         $$4.b(bpb.m);
      } else {
         $$4.a(bpb.m, new bpe(new bic($$3, false), this.a($$1), 2));
      }
   }
}
