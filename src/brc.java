import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Optional;
import java.util.function.Function;

public class brc extends bqp<bpf> {
   public static final int c = 100;
   public static final double d = 2.5;
   public static final double e = 3.5;
   private final Function<box, Float> f;
   private final Function<box, Double> g;

   public brc(Function<box, Float> $$0) {
      this($$0, $$0x -> 2.5);
   }

   public brc(Function<box, Float> $$0, Function<box, Double> $$1) {
      super(ac.a(() -> {
         Builder<bya<?>, byb> $$0x = ImmutableMap.builder();
         $$0x.put(bya.n, byb.c);
         $$0x.put(bya.m, byb.c);
         $$0x.put(bya.P, byb.b);
         $$0x.put(bya.R, byb.c);
         $$0x.put(bya.O, byb.a);
         $$0x.put(bya.r, byb.b);
         $$0x.put(bya.Z, byb.b);
         return $$0x.build();
      }));
      this.f = $$0;
      this.g = $$1;
   }

   protected float a(bpf $$0) {
      return this.f.apply($$0);
   }

   private Optional<cia> b(bpf $$0) {
      return $$0.dM().c(bya.O);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected boolean a(apa $$0, bpf $$1, long $$2) {
      return this.b($$1).isPresent() && !$$1.dM().a(bya.r) && !$$1.dM().a(bya.Z);
   }

   protected void b(apa $$0, bpf $$1, long $$2) {
      $$1.dM().a(bya.R, true);
   }

   protected void c(apa $$0, bpf $$1, long $$2) {
      bpy<?> $$3 = $$1.dM();
      $$3.a(bya.P, 100);
      $$3.a(bya.R, false);
      $$3.b(bya.m);
      $$3.b(bya.n);
   }

   protected void d(apa $$0, bpf $$1, long $$2) {
      cia $$3 = this.b($$1).get();
      bpy<?> $$4 = $$1.dM();
      $$4.a(bya.n, new bra($$3, true));
      double $$5 = this.g.apply($$1);
      if ($$1.f($$3) < awm.k($$5)) {
         $$4.b(bya.m);
      } else {
         $$4.a(bya.m, new byd(new bra($$3, false), this.a($$1), 2));
      }
   }
}
