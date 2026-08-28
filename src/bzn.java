import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Optional;
import java.util.function.Function;

public class bzn extends bza<bxr> {
   public static final int c = 100;
   public static final double d = 2.5;
   public static final double e = 3.5;
   private final Function<bxj, Float> f;
   private final Function<bxj, Double> g;

   public bzn(Function<bxj, Float> $$0) {
      this($$0, $$0x -> 2.5);
   }

   public bzn(Function<bxj, Float> $$0, Function<bxj, Double> $$1) {
      super(ag.a(() -> {
         Builder<cgl<?>, cgm> $$0x = ImmutableMap.builder();
         $$0x.put(cgl.o, cgm.c);
         $$0x.put(cgl.n, cgm.c);
         $$0x.put(cgl.Q, cgm.b);
         $$0x.put(cgl.S, cgm.c);
         $$0x.put(cgl.P, cgm.a);
         $$0x.put(cgl.s, cgm.b);
         $$0x.put(cgl.aa, cgm.b);
         return $$0x.build();
      }));
      this.f = $$0;
      this.g = $$1;
   }

   protected float a(bxr $$0) {
      return this.f.apply($$0);
   }

   private Optional<crj> b(bxr $$0) {
      return $$0.eb().c(cgl.P);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected boolean a(arq $$0, bxr $$1, long $$2) {
      return this.b($$1).isPresent() && !$$1.eb().a(cgl.s) && !$$1.eb().a(cgl.aa);
   }

   protected void b(arq $$0, bxr $$1, long $$2) {
      $$1.eb().a(cgl.S, true);
   }

   protected void c(arq $$0, bxr $$1, long $$2) {
      byj<?> $$3 = $$1.eb();
      $$3.a(cgl.Q, 100);
      $$3.a(cgl.S, false);
      $$3.b(cgl.n);
      $$3.b(cgl.o);
   }

   protected void d(arq $$0, bxr $$1, long $$2) {
      crj $$3 = this.b($$1).get();
      byj<?> $$4 = $$1.eb();
      $$4.a(cgl.o, new bzl($$3, true));
      double $$5 = this.g.apply($$1);
      if ($$1.g($$3) < azm.k($$5)) {
         $$4.b(cgl.n);
      } else {
         $$4.a(cgl.n, new cgo(new bzl($$3, false), this.a($$1), 2));
      }
   }
}
