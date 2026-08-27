import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bwh extends bsw<cjy> {
   private static final int c = 300;
   private static final double d = 1.73;
   private long e;

   public bwh() {
      super(ImmutableMap.of(cah.c, cai.a, cah.n, cai.c));
   }

   protected boolean b(aqe $$0, cjy $$1) {
      if ($$0.Y() - this.e < 300L) {
         return false;
      } else if ($$0.z.a(2) != 0) {
         return false;
      } else {
         this.e = $$0.Y();
         iu $$2 = $$1.dQ().c(cah.c).get();
         return $$2.a() == $$0.ae() && $$2.b().a($$1.dl(), 1.73);
      }
   }

   protected void a(aqe $$0, cjy $$1, long $$2) {
      bsf<cjy> $$3 = $$1.dQ();
      $$3.a(cah.J, $$2);
      $$3.c(cah.c).ifPresent($$1x -> $$3.a(cah.n, new bsz($$1x.b())));
      $$1.gE();
      this.a($$0, $$1);
      if ($$1.gD()) {
         $$1.gC();
      }
   }

   protected void a(aqe $$0, cjy $$1) {
   }

   protected boolean b(aqe $$0, cjy $$1, long $$2) {
      Optional<iu> $$3 = $$1.dQ().c(cah.c);
      if ($$3.isEmpty()) {
         return false;
      } else {
         iu $$4 = $$3.get();
         return $$4.a() == $$0.ae() && $$4.b().a($$1.dl(), 1.73);
      }
   }
}
