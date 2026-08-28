import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Optional;
import java.util.function.Function;

public class bxg extends bwt<bvi> {
   public static final int c = 100;
   public static final double d = 2.5;
   public static final double e = 3.5;
   private final Function<bva, Float> f;
   private final Function<bva, Double> g;

   public bxg(Function<bva, Float> $$0) {
      this($$0, $$0x -> 2.5);
   }

   public bxg(Function<bva, Float> $$0, Function<bva, Double> $$1) {
      super(ae.a(() -> {
         Builder<cee<?>, cef> $$0x = ImmutableMap.builder();
         $$0x.put(cee.n, cef.c);
         $$0x.put(cee.m, cef.c);
         $$0x.put(cee.P, cef.b);
         $$0x.put(cee.R, cef.c);
         $$0x.put(cee.O, cef.a);
         $$0x.put(cee.r, cef.b);
         $$0x.put(cee.Z, cef.b);
         return $$0x.build();
      }));
      this.f = $$0;
      this.g = $$1;
   }

   protected float a(bvi $$0) {
      return this.f.apply($$0);
   }

   private Optional<com> b(bvi $$0) {
      return $$0.ed().c(cee.O);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected boolean a(arn $$0, bvi $$1, long $$2) {
      return this.b($$1).isPresent() && !$$1.ed().a(cee.r) && !$$1.ed().a(cee.Z);
   }

   protected void b(arn $$0, bvi $$1, long $$2) {
      $$1.ed().a(cee.R, true);
   }

   protected void c(arn $$0, bvi $$1, long $$2) {
      bwc<?> $$3 = $$1.ed();
      $$3.a(cee.P, 100);
      $$3.a(cee.R, false);
      $$3.b(cee.m);
      $$3.b(cee.n);
   }

   protected void d(arn $$0, bvi $$1, long $$2) {
      com $$3 = this.b($$1).get();
      bwc<?> $$4 = $$1.ed();
      $$4.a(cee.n, new bxe($$3, true));
      double $$5 = this.g.apply($$1);
      if ($$1.g($$3) < azk.k($$5)) {
         $$4.b(cee.m);
      } else {
         $$4.a(cee.m, new ceh(new bxe($$3, false), this.a($$1), 2));
      }
   }
}
