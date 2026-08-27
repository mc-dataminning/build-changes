import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bhl extends bhr<brl> {
   private static final int c = 3;
   private static final int d = 60;
   private static final int e = 110;
   private final bfn<? extends brl> f;
   private final float g;
   private long h;

   public bhl(bfn<? extends brl> $$0, float $$1) {
      super(ImmutableMap.of(bpb.h, bpc.a, bpb.r, bpc.b, bpb.m, bpc.c, bpb.n, bpc.c), 110);
      this.f = $$0;
      this.g = $$1;
   }

   protected boolean a(aif $$0, brl $$1) {
      return $$1.gc() && this.c($$1).isPresent();
   }

   protected void a(aif $$0, brl $$1, long $$2) {
      brl $$3 = this.c($$1).get();
      $$1.dK().a(bpb.r, $$3);
      $$3.dK().a(bpb.r, $$1);
      bht.a($$1, $$3, this.g);
      int $$4 = 60 + $$1.ec().a(50);
      this.h = $$2 + (long)$$4;
   }

   protected boolean b(aif $$0, brl $$1, long $$2) {
      if (!this.b($$1)) {
         return false;
      } else {
         brl $$3 = this.a($$1);
         return $$3.bs() && $$1.a($$3) && bht.a($$1.dK(), $$3) && $$2 <= this.h;
      }
   }

   protected void c(aif $$0, brl $$1, long $$2) {
      brl $$3 = this.a($$1);
      bht.a($$1, $$3, this.g);
      if ($$1.a($$3, 3.0)) {
         if ($$2 >= this.h) {
            $$1.a($$0, $$3);
            $$1.dK().b(bpb.r);
            $$3.dK().b(bpb.r);
         }
      }
   }

   protected void d(aif $$0, brl $$1, long $$2) {
      $$1.dK().b(bpb.r);
      $$1.dK().b(bpb.m);
      $$1.dK().b(bpb.n);
      this.h = 0L;
   }

   private brl a(brl $$0) {
      return (brl)$$0.dK().c(bpb.r).get();
   }

   private boolean b(brl $$0) {
      bha<?> $$1 = $$0.dK();
      return $$1.a(bpb.r) && $$1.c(bpb.r).get().ae() == this.f;
   }

   private Optional<? extends brl> c(brl $$0) {
      return $$0.dK().c(bpb.h).get().a($$1 -> {
         if ($$1.ae() == this.f && $$1 instanceof brl $$2 && $$0.a($$2)) {
            return true;
         }

         return false;
      }).map(brl.class::cast);
   }
}
