import java.util.Map;
import javax.annotation.Nullable;

public class cxg extends cyu {
   @Deprecated
   private final dma a;

   public cxg(dma $$0, cyu.a $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   public bub a(dct $$0) {
      bub $$1 = this.a(new dcr($$0));
      return !$$1.a() && $$0.n().c(kj.w) ? super.a($$0.q(), $$0.o(), $$0.p()) : $$1;
   }

   public bub a(dcr $$0) {
      if (!this.c().a($$0.q().K())) {
         return bub.d;
      } else if (!$$0.b()) {
         return bub.d;
      } else {
         dcr $$1 = this.b($$0);
         if ($$1 == null) {
            return bub.d;
         } else {
            dzz $$2 = this.c($$1);
            if ($$2 == null) {
               return bub.d;
            } else if (!this.a($$1, $$2)) {
               return bub.d;
            } else {
               iu $$3 = $$1.a();
               div $$4 = $$1.q();
               cqy $$5 = $$1.o();
               cyy $$6 = $$1.n();
               dzz $$7 = $$4.a_($$3);
               if ($$7.a($$2.b())) {
                  $$7 = this.a($$3, $$4, $$6, $$7);
                  this.a($$3, $$4, $$5, $$6, $$7);
                  a($$4, $$3, $$6);
                  $$7.b().a($$4, $$3, $$7, $$5, $$6);
                  if ($$5 instanceof arr) {
                     ap.z.a((arr)$$5, $$3, $$6);
                  }
               }

               dtv $$8 = $$7.A();
               $$4.a($$5, $$3, this.a($$7), awo.e, ($$8.a() + 1.0F) / 2.0F, $$8.b() * 0.8F);
               $$4.a(eez.i, $$3, eez.a.a($$5, $$7));
               $$6.a(1, $$5);
               return bub.a;
            }
         }
      }
   }

   protected awm a(dzz $$0) {
      return $$0.A().e();
   }

   @Nullable
   public dcr b(dcr $$0) {
      return $$0;
   }

   private static void a(div $$0, iu $$1, cyy $$2) {
      dwx $$3 = $$0.c_($$1);
      if ($$3 != null) {
         $$3.a($$2);
         $$3.e();
      }
   }

   protected boolean a(iu $$0, div $$1, @Nullable cqy $$2, cyy $$3, dzz $$4) {
      return a($$1, $$2, $$0, $$3);
   }

   @Nullable
   protected dzz c(dcr $$0) {
      dzz $$1 = this.c().a($$0);
      return $$1 != null && this.b($$0, $$1) ? $$1 : null;
   }

   private dzz a(iu $$0, div $$1, cyy $$2, dzz $$3) {
      day $$4 = $$2.a(kj.aq, day.a);
      if ($$4.a()) {
         return $$3;
      } else {
         dzz $$5 = $$4.a($$3);
         if ($$5 != $$3) {
            $$1.a($$0, $$5, 2);
         }

         return $$5;
      }
   }

   protected boolean b(dcr $$0, dzz $$1) {
      return (!this.b() || $$1.a((diy)$$0.q(), $$0.a())) && $$0.q().a($$1, $$0.a(), fen.a());
   }

   protected boolean b() {
      return true;
   }

   protected boolean a(dcr $$0, dzz $$1) {
      return $$0.q().a($$0.a(), $$1, 11);
   }

   public static boolean a(div $$0, @Nullable cqy $$1, iu $$2, cyy $$3) {
      if ($$0.C) {
         return false;
      } else {
         dbg $$4 = $$3.a(kj.aa, dbg.a);
         if (!$$4.c()) {
            dwz<?> $$5 = $$4.a($$0.F_(), mg.e);
            if ($$5 == null) {
               return false;
            }

            dwx $$6 = $$0.c_($$2);
            if ($$6 != null) {
               dwz<?> $$7 = $$6.p();
               if ($$7 != $$5) {
                  return false;
               }

               if (!$$7.b() || $$1 != null && $$1.gF()) {
                  return $$4.a($$6, $$0.F_());
               }

               return false;
            }
         }

         return false;
      }
   }

   @Override
   public boolean a(cyy $$0, @Nullable cqy $$1) {
      if ($$1 != null && $$1.G() >= 2) {
         dbg $$2 = $$0.a(kj.aa);
         if ($$2 != null) {
            dwz<?> $$3 = $$2.a($$1.dV().F_(), mg.e);
            return $$3 != null && $$3.b();
         }
      }

      return false;
   }

   public dma c() {
      return this.a;
   }

   public void a(Map<dma, cyu> $$0, cyu $$1) {
      $$0.put(this.c(), $$1);
   }

   @Override
   public boolean d() {
      return !(this.c() instanceof dth);
   }

   @Override
   public void a(cnd $$0) {
      dbq $$1 = $$0.f().b(kj.ap, dbq.a);
      if ($$1 != null) {
         czb.a($$0, $$1.e());
      }
   }

   public static void a(cyy $$0, dwz<?> $$1, tz $$2) {
      $$2.r("id");
      if ($$2.g()) {
         $$0.e(kj.aa);
      } else {
         dwx.a($$2, $$1);
         $$0.b(kj.aa, dbg.a($$2));
      }
   }

   @Override
   public cuh k() {
      return this.c().k();
   }
}
