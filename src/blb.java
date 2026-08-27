import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class blb extends bhr<byb> {
   private static final int c = 300;
   private static final double d = 1.73;
   private long e;

   public blb() {
      super(ImmutableMap.of(bpb.c, bpc.a, bpb.n, bpc.c));
   }

   protected boolean b(aif $$0, byb $$1) {
      if ($$0.V() - this.e < 300L) {
         return false;
      } else if ($$0.z.a(2) != 0) {
         return false;
      } else {
         this.e = $$0.V();
         hd $$2 = $$1.dK().c(bpb.c).get();
         return $$2.a() == $$0.ac() && $$2.b().a($$1.dg(), 1.73);
      }
   }

   protected void a(aif $$0, byb $$1, long $$2) {
      bha<byb> $$3 = $$1.dK();
      $$3.a(bpb.I, $$2);
      $$3.c(bpb.c).ifPresent($$1x -> $$3.a(bpb.n, new bhu($$1x.b())));
      $$1.gn();
      this.a($$0, $$1);
      if ($$1.gm()) {
         $$1.gl();
      }
   }

   protected void a(aif $$0, byb $$1) {
   }

   protected boolean b(aif $$0, byb $$1, long $$2) {
      Optional<hd> $$3 = $$1.dK().c(bpb.c);
      if (!$$3.isPresent()) {
         return false;
      } else {
         hd $$4 = $$3.get();
         return $$4.a() == $$0.ac() && $$4.b().a($$1.dg(), 1.73);
      }
   }
}
