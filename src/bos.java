import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Optional;
import java.util.function.Function;

public class bos extends bof<bmx> {
   public static final int c = 100;
   public static final double d = 2.5;
   public static final double e = 3.5;
   private final Function<bmo, Float> f;
   private final Function<bmo, Double> g;

   public bos(Function<bmo, Float> $$0) {
      this($$0, $$0x -> 2.5);
   }

   public bos(Function<bmo, Float> $$0, Function<bmo, Double> $$1) {
      super(ac.a(() -> {
         Builder<bvq<?>, bvr> $$0x = ImmutableMap.builder();
         $$0x.put(bvq.n, bvr.c);
         $$0x.put(bvq.m, bvr.c);
         $$0x.put(bvq.P, bvr.b);
         $$0x.put(bvq.R, bvr.c);
         $$0x.put(bvq.O, bvr.a);
         $$0x.put(bvq.r, bvr.b);
         $$0x.put(bvq.Z, bvr.b);
         return $$0x.build();
      }));
      this.f = $$0;
      this.g = $$1;
   }

   protected float a(bmx $$0) {
      return this.f.apply($$0);
   }

   private Optional<cfq> b(bmx $$0) {
      return $$0.dN().c(bvq.O);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected boolean a(ane $$0, bmx $$1, long $$2) {
      return this.b($$1).isPresent() && !$$1.dN().a(bvq.r) && !$$1.dN().a(bvq.Z);
   }

   protected void b(ane $$0, bmx $$1, long $$2) {
      $$1.dN().a(bvq.R, true);
   }

   protected void c(ane $$0, bmx $$1, long $$2) {
      bno<?> $$3 = $$1.dN();
      $$3.a(bvq.P, 100);
      $$3.a(bvq.R, false);
      $$3.b(bvq.m);
      $$3.b(bvq.n);
   }

   protected void d(ane $$0, bmx $$1, long $$2) {
      cfq $$3 = this.b($$1).get();
      bno<?> $$4 = $$1.dN();
      $$4.a(bvq.n, new boq($$3, true));
      double $$5 = this.g.apply($$1);
      if ($$1.f($$3) < aup.k($$5)) {
         $$4.b(bvq.m);
      } else {
         $$4.a(bvq.m, new bvt(new boq($$3, false), this.a($$1), 2));
      }
   }
}
