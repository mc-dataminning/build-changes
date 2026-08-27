import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import java.util.Optional;
import java.util.function.Function;

public class bmn extends bma<bks> {
   public static final int c = 100;
   public static final double d = 2.5;
   public static final double e = 3.5;
   private final Function<bkj, Float> f;
   private final Function<bkj, Double> g;

   public bmn(Function<bkj, Float> $$0) {
      this($$0, $$0x -> 2.5);
   }

   public bmn(Function<bkj, Float> $$0, Function<bkj, Double> $$1) {
      super(ac.a(() -> {
         Builder<btk<?>, btl> $$0x = ImmutableMap.builder();
         $$0x.put(btk.n, btl.c);
         $$0x.put(btk.m, btl.c);
         $$0x.put(btk.O, btl.b);
         $$0x.put(btk.Q, btl.c);
         $$0x.put(btk.N, btl.a);
         $$0x.put(btk.r, btl.b);
         $$0x.put(btk.Y, btl.b);
         return $$0x.build();
      }));
      this.f = $$0;
      this.g = $$1;
   }

   protected float a(bks $$0) {
      return this.f.apply($$0);
   }

   private Optional<ccx> b(bks $$0) {
      return $$0.dN().c(btk.N);
   }

   @Override
   protected boolean a(long $$0) {
      return false;
   }

   protected boolean a(alq $$0, bks $$1, long $$2) {
      return this.b($$1).isPresent() && !$$1.dN().a(btk.r) && !$$1.dN().a(btk.Y);
   }

   protected void b(alq $$0, bks $$1, long $$2) {
      $$1.dN().a(btk.Q, true);
   }

   protected void c(alq $$0, bks $$1, long $$2) {
      blj<?> $$3 = $$1.dN();
      $$3.a(btk.O, 100);
      $$3.a(btk.Q, false);
      $$3.b(btk.m);
      $$3.b(btk.n);
   }

   protected void d(alq $$0, bks $$1, long $$2) {
      ccx $$3 = this.b($$1).get();
      blj<?> $$4 = $$1.dN();
      $$4.a(btk.n, new bml($$3, true));
      double $$5 = this.g.apply($$1);
      if ($$1.f($$3) < asy.k($$5)) {
         $$4.b(btk.m);
      } else {
         $$4.a(btk.m, new btn(new bml($$3, false), this.a($$1), 2));
      }
   }
}
