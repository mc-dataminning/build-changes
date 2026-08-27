import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bua extends bqp<chn> {
   private static final int c = 300;
   private static final double d = 1.73;
   private long e;

   public bua() {
      super(ImmutableMap.of(bya.c, byb.a, bya.n, byb.c));
   }

   protected boolean b(apa $$0, chn $$1) {
      if ($$0.X() - this.e < 300L) {
         return false;
      } else if ($$0.z.a(2) != 0) {
         return false;
      } else {
         this.e = $$0.X();
         ik $$2 = $$1.dM().c(bya.c).get();
         return $$2.a() == $$0.ad() && $$2.b().a($$1.dh(), 1.73);
      }
   }

   protected void a(apa $$0, chn $$1, long $$2) {
      bpy<chn> $$3 = $$1.dM();
      $$3.a(bya.J, $$2);
      $$3.c(bya.c).ifPresent($$1x -> $$3.a(bya.n, new bqs($$1x.b())));
      $$1.gA();
      this.a($$0, $$1);
      if ($$1.gz()) {
         $$1.gy();
      }
   }

   protected void a(apa $$0, chn $$1) {
   }

   protected boolean b(apa $$0, chn $$1, long $$2) {
      Optional<ik> $$3 = $$1.dM().c(bya.c);
      if ($$3.isEmpty()) {
         return false;
      } else {
         ik $$4 = $$3.get();
         return $$4.a() == $$0.ad() && $$4.b().a($$1.dh(), 1.73);
      }
   }
}
