import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class bpy extends bmx<cdh> {
   private static final int c = 80;
   private long d;
   private long e;
   private int f;
   private Optional<ht> g = Optional.empty();

   public bpy() {
      super(ImmutableMap.of(buh.n, bui.b, buh.m, bui.b));
   }

   protected boolean a(ame $$0, cdh $$1) {
      if ($$1.ah % 10 == 0 && (this.e == 0L || this.e + 160L <= (long)$$1.ah)) {
         if ($$1.A().a_(clm.rv) <= 0) {
            return false;
         } else {
            this.g = this.b($$0, $$1);
            return this.g.isPresent();
         }
      } else {
         return false;
      }
   }

   protected boolean a(ame $$0, cdh $$1, long $$2) {
      return this.f < 80 && this.g.isPresent();
   }

   private Optional<ht> b(ame $$0, cdh $$1) {
      ht.a $$2 = new ht.a();
      Optional<ht> $$3 = Optional.empty();
      int $$4 = 0;

      for (int $$5 = -1; $$5 <= 1; $$5++) {
         for (int $$6 = -1; $$6 <= 1; $$6++) {
            for (int $$7 = -1; $$7 <= 1; $$7++) {
               $$2.a($$1.dn(), $$5, $$6, $$7);
               if (this.a($$2, $$0)) {
                  if ($$0.z.a(++$$4) == 0) {
                     $$3 = Optional.of($$2.i());
                  }
               }
            }
         }
      }

      return $$3;
   }

   private boolean a(ht $$0, ame $$1) {
      dhi $$2 = $$1.a_($$0);
      cva $$3 = $$2.b();
      return $$3 instanceof cwv && !((cwv)$$3).h($$2);
   }

   protected void b(ame $$0, cdh $$1, long $$2) {
      this.a($$1);
      $$1.a(bkv.a, new clj(clm.rv));
      this.d = $$2;
      this.f = 0;
   }

   private void a(cdh $$0) {
      this.g.ifPresent($$1 -> {
         bna $$2 = new bna($$1);
         $$0.dP().a(buh.n, $$2);
         $$0.dP().a(buh.m, new buk($$2, 0.5F, 1));
      });
   }

   protected void c(ame $$0, cdh $$1, long $$2) {
      $$1.a(bkv.a, clj.b);
      this.e = (long)$$1.ah;
   }

   protected void d(ame $$0, cdh $$1, long $$2) {
      ht $$3 = this.g.get();
      if ($$2 >= this.d && $$3.a($$1.dl(), 1.0)) {
         clj $$4 = clj.b;
         bje $$5 = $$1.A();
         int $$6 = $$5.b();

         for (int $$7 = 0; $$7 < $$6; $$7++) {
            clj $$8 = $$5.a($$7);
            if ($$8.a(clm.rv)) {
               $$4 = $$8;
               break;
            }
         }

         if (!$$4.b() && cje.a($$4, $$0, $$3)) {
            $$0.c(1505, $$3, 0);
            this.g = this.b($$0, $$1);
            this.a($$1);
            this.d = $$2 + 40L;
         }

         this.f++;
      }
   }
}
