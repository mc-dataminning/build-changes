import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class cvm extends cxc {
   private static final xk a = xk.c("item.op_block_warning.line1").a(n.m, n.r);
   private static final xk b = xk.c("item.op_block_warning.line2").a(n.m);
   private static final xk c = xk.c("item.op_block_warning.line3").a(n.m);
   @Deprecated
   private final dkd d;

   public cvm(dkd $$0, cxc.a $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   public bta a(daz $$0) {
      bta $$1 = this.a(new dax($$0));
      return !$$1.a() && $$0.n().b(ku.x) ? super.a($$0.q(), $$0.o(), $$0.p()) : $$1;
   }

   public bta a(dax $$0) {
      if (!this.d().a($$0.q().K())) {
         return bta.d;
      } else if (!$$0.b()) {
         return bta.d;
      } else {
         dax $$1 = this.b($$0);
         if ($$1 == null) {
            return bta.d;
         } else {
            dxo $$2 = this.c($$1);
            if ($$2 == null) {
               return bta.d;
            } else if (!this.a($$1, $$2)) {
               return bta.d;
            } else {
               jh $$3 = $$1.a();
               dgz $$4 = $$1.q();
               cpo $$5 = $$1.o();
               cxg $$6 = $$1.n();
               dxo $$7 = $$4.a_($$3);
               if ($$7.a($$2.b())) {
                  $$7 = this.a($$3, $$4, $$6, $$7);
                  this.a($$3, $$4, $$5, $$6, $$7);
                  a($$4, $$3, $$6);
                  $$7.b().a($$4, $$3, $$7, $$5, $$6);
                  if ($$5 instanceof ary) {
                     ao.z.a((ary)$$5, $$3, $$6);
                  }
               }

               drv $$8 = $$7.A();
               $$4.a($$5, $$3, this.a($$7), aww.e, ($$8.a() + 1.0F) / 2.0F, $$8.b() * 0.8F);
               $$4.a(eck.i, $$3, eck.a.a($$5, $$7));
               $$6.a(1, $$5);
               return bta.a;
            }
         }
      }
   }

   protected awu a(dxo $$0) {
      return $$0.A().e();
   }

   @Nullable
   public dax b(dax $$0) {
      return $$0;
   }

   private static void a(dgz $$0, jh $$1, cxg $$2) {
      duq $$3 = $$0.c_($$1);
      if ($$3 != null) {
         $$3.a($$2);
         $$3.e();
      }
   }

   protected boolean a(jh $$0, dgz $$1, @Nullable cpo $$2, cxg $$3, dxo $$4) {
      return a($$1, $$2, $$0, $$3);
   }

   @Nullable
   protected dxo c(dax $$0) {
      dxo $$1 = this.d().a($$0);
      return $$1 != null && this.b($$0, $$1) ? $$1 : null;
   }

   private dxo a(jh $$0, dgz $$1, cxg $$2, dxo $$3) {
      czi $$4 = $$2.a(ku.am, czi.a);
      if ($$4.a()) {
         return $$3;
      } else {
         dxo $$5 = $$4.a($$3);
         if ($$5 != $$3) {
            $$1.a($$0, $$5, 2);
         }

         return $$5;
      }
   }

   protected boolean b(dax $$0, dxo $$1) {
      cpo $$2 = $$0.o();
      fbw $$3 = $$2 == null ? fbw.a() : fbw.a($$2);
      return (!this.c() || $$1.a((dhc)$$0.q(), $$0.a())) && $$0.q().a($$1, $$0.a(), $$3);
   }

   protected boolean c() {
      return true;
   }

   protected boolean a(dax $$0, dxo $$1) {
      return $$0.q().a($$0.a(), $$1, 11);
   }

   public static boolean a(dgz $$0, @Nullable cpo $$1, jh $$2, cxg $$3) {
      if ($$0.C) {
         return false;
      } else {
         czp $$4 = $$3.a(ku.Y, czp.a);
         if (!$$4.c()) {
            dus<?> $$5 = a($$0.K_(), $$4);
            if ($$5 == null) {
               return false;
            }

            duq $$6 = $$0.c_($$2);
            if ($$6 != null) {
               dus<?> $$7 = $$6.p();
               if ($$7 != $$5) {
                  return false;
               }

               if (!$$7.b() || $$1 != null && $$1.gG()) {
                  return $$4.a($$6, $$0.K_());
               }

               return false;
            }
         }

         return false;
      }
   }

   @Nullable
   private static dus<?> a(js.a $$0, czp $$1) {
      alp $$2 = $$1.a();
      return $$2 == null ? null : $$0.a(mb.h).flatMap($$1x -> $$1x.a(alo.a(mb.h, $$2))).map(jq::a).orElse(null);
   }

   @Override
   public void a(cxg $$0, cxc.b $$1, List<xk> $$2, cyy $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.d().a($$0, $$1, $$2, $$3);
      czp $$4 = $$0.a(ku.Y);
      if ($$4 != null && $$1.c() >= 2) {
         dus<?> $$5 = a($$1.a(), $$4);
         if ($$5 != null && $$5.b()) {
            $$2.add(a);
            $$2.add(b);
            $$2.add(c);
         }
      }
   }

   public dkd d() {
      return this.d;
   }

   public void a(Map<dkd, cxc> $$0, cxc $$1) {
      $$0.put(this.d(), $$1);
   }

   @Override
   public boolean e() {
      return !(this.d() instanceof drh);
   }

   @Override
   public void a(cls $$0) {
      czy $$1 = $$0.l().b(ku.al, czy.a);
      if ($$1 != null) {
         cxj.a($$0, $$1.e());
      }
   }

   public static void a(cxg $$0, dus<?> $$1, um $$2) {
      $$2.r("id");
      if ($$2.g()) {
         $$0.c(ku.Y);
      } else {
         duq.a($$2, $$1);
         $$0.b(ku.Y, czp.a($$2));
      }
   }

   @Override
   public csk i() {
      return this.d().i();
   }
}
