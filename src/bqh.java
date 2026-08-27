import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bqh extends bmx<cdh> {
   private static final int c = 300;
   private static final double d = 1.73;
   private long e;

   public bqh() {
      super(ImmutableMap.of(buh.c, bui.a, buh.n, bui.c));
   }

   protected boolean b(ame $$0, cdh $$1) {
      if ($$0.W() - this.e < 300L) {
         return false;
      } else if ($$0.z.a(2) != 0) {
         return false;
      } else {
         this.e = $$0.W();
         ia $$2 = $$1.dP().c(buh.c).get();
         return $$2.a() == $$0.ad() && $$2.b().a($$1.dl(), 1.73);
      }
   }

   protected void a(ame $$0, cdh $$1, long $$2) {
      bmg<cdh> $$3 = $$1.dP();
      $$3.a(buh.I, $$2);
      $$3.c(buh.c).ifPresent($$1x -> $$3.a(buh.n, new bna($$1x.b())));
      $$1.gu();
      this.a($$0, $$1);
      if ($$1.gt()) {
         $$1.gs();
      }
   }

   protected void a(ame $$0, cdh $$1) {
   }

   protected boolean b(ame $$0, cdh $$1, long $$2) {
      Optional<ia> $$3 = $$1.dP().c(buh.c);
      if ($$3.isEmpty()) {
         return false;
      } else {
         ia $$4 = $$3.get();
         return $$4.a() == $$0.ad() && $$4.b().a($$1.dl(), 1.73);
      }
   }
}
