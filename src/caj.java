import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class caj extends bwy<cog> {
   private static final int c = 300;
   private static final double d = 1.73;
   private long e;

   public caj() {
      super(ImmutableMap.of(cej.c, cek.a, cej.n, cek.c));
   }

   protected boolean b(arc $$0, cog $$1) {
      if ($$0.ad() - this.e < 300L) {
         return false;
      } else if ($$0.A.a(2) != 0) {
         return false;
      } else {
         this.e = $$0.ad();
         jq $$2 = $$1.ec().c(cej.c).get();
         return $$2.a() == $$0.ai() && $$2.b().a($$1.du(), 1.73);
      }
   }

   protected void a(arc $$0, cog $$1, long $$2) {
      bwh<cog> $$3 = $$1.ec();
      $$3.a(cej.J, $$2);
      $$3.c(cej.c).ifPresent($$1x -> $$3.a(cej.n, new bxb($$1x.b())));
      $$1.gE();
      this.a($$0, $$1);
      if ($$1.gD()) {
         $$1.gC();
      }
   }

   protected void a(arc $$0, cog $$1) {
   }

   protected boolean b(arc $$0, cog $$1, long $$2) {
      Optional<jq> $$3 = $$1.ec().c(cej.c);
      if ($$3.isEmpty()) {
         return false;
      } else {
         jq $$4 = $$3.get();
         return $$4.a() == $$0.ai() && $$4.b().a($$1.du(), 1.73);
      }
   }
}
