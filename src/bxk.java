import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Optional;
import java.util.function.Function;

public class bxk extends bwx<bvm> {
   public static final int c = 100;
   public static final double d = 2.5;
   public static final double e = 3.5;
   private final Function<bve, Float> f;
   private final Function<bve, Double> g;

   public bxk(Function<bve, Float> $$0) {
      this($$0, $$0x -> 2.5);
   }

   public bxk(Function<bve, Float> $$0, Function<bve, Double> $$1) {
      super(ae.a(() -> {
         Builder<cei<?>, cej> $$0x = ImmutableMap.builder();
         $$0x.put(cei.n, cej.c);
         $$0x.put(cei.m, cej.c);
         $$0x.put(cei.P, cej.b);
         $$0x.put(cei.R, cej.c);
         $$0x.put(cei.O, cej.a);
         $$0x.put(cei.r, cej.b);
         $$0x.put(cei.Z, cej.b);
         return $$0x.build();
      }));
      this.f = $$0;
      this.g = $$1;
   }

   protected float a(bvm $$0) {
      return this.f.apply($$0);
   }

   private Optional<cor> b(bvm $$0) {
      return $$0.ee().c(cei.O);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected boolean a(arq $$0, bvm $$1, long $$2) {
      return this.b($$1).isPresent() && !$$1.ee().a(cei.r) && !$$1.ee().a(cei.Z);
   }

   protected void b(arq $$0, bvm $$1, long $$2) {
      $$1.ee().a(cei.R, true);
   }

   protected void c(arq $$0, bvm $$1, long $$2) {
      bwg<?> $$3 = $$1.ee();
      $$3.a(cei.P, 100);
      $$3.a(cei.R, false);
      $$3.b(cei.m);
      $$3.b(cei.n);
   }

   protected void d(arq $$0, bvm $$1, long $$2) {
      cor $$3 = this.b($$1).get();
      bwg<?> $$4 = $$1.ee();
      $$4.a(cei.n, new bxi($$3, true));
      double $$5 = this.g.apply($$1);
      if ($$1.g($$3) < azn.k($$5)) {
         $$4.b(cei.m);
      } else {
         $$4.a(cei.m, new cel(new bxi($$3, false), this.a($$1), 2));
      }
   }
}
