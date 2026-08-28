import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class cuv extends cwl {
   public static final List<wo> a = List.of(
      wo.c("item.op_block_warning.line1").a(n.m, n.r), wo.c("item.op_block_warning.line2").a(n.m), wo.c("item.op_block_warning.line3").a(n.m)
   );
   @Deprecated
   private final djm b;

   public cuv(djm $$0, cwl.a $$1) {
      super($$1);
      this.b = $$0;
   }

   @Override
   public bsj a(dai $$0) {
      bsj $$1 = this.a(new dag($$0));
      return !$$1.a() && $$0.n().b(kv.x) ? super.a($$0.q(), $$0.o(), $$0.p()) : $$1;
   }

   public bsj a(dag $$0) {
      if (!this.d().a($$0.q().K())) {
         return bsj.d;
      } else if (!$$0.b()) {
         return bsj.d;
      } else {
         dag $$1 = this.b($$0);
         if ($$1 == null) {
            return bsj.d;
         } else {
            dwx $$2 = this.c($$1);
            if ($$2 == null) {
               return bsj.d;
            } else if (!this.a($$1, $$2)) {
               return bsj.d;
            } else {
               ji $$3 = $$1.a();
               dgi $$4 = $$1.q();
               cox $$5 = $$1.o();
               cwp $$6 = $$1.n();
               dwx $$7 = $$4.a_($$3);
               if ($$7.a($$2.b())) {
                  $$7 = this.a($$3, $$4, $$6, $$7);
                  this.a($$3, $$4, $$5, $$6, $$7);
                  a($$4, $$3, $$6);
                  $$7.b().a($$4, $$3, $$7, $$5, $$6);
                  if ($$5 instanceof ard) {
                     ap.z.a((ard)$$5, $$3, $$6);
                  }
               }

               dre $$8 = $$7.A();
               $$4.a($$5, $$3, this.a($$7), awb.e, ($$8.a() + 1.0F) / 2.0F, $$8.b() * 0.8F);
               $$4.a(ebt.i, $$3, ebt.a.a($$5, $$7));
               $$6.a(1, $$5);
               return bsj.a;
            }
         }
      }
   }

   protected avz a(dwx $$0) {
      return $$0.A().e();
   }

   @Nullable
   public dag b(dag $$0) {
      return $$0;
   }

   private static void a(dgi $$0, ji $$1, cwp $$2) {
      dtz $$3 = $$0.c_($$1);
      if ($$3 != null) {
         $$3.a($$2);
         $$3.e();
      }
   }

   protected boolean a(ji $$0, dgi $$1, @Nullable cox $$2, cwp $$3, dwx $$4) {
      return a($$1, $$2, $$0, $$3);
   }

   @Nullable
   protected dwx c(dag $$0) {
      dwx $$1 = this.d().a($$0);
      return $$1 != null && this.b($$0, $$1) ? $$1 : null;
   }

   private dwx a(ji $$0, dgi $$1, cwp $$2, dwx $$3) {
      cyr $$4 = $$2.a(kv.am, cyr.a);
      if ($$4.a()) {
         return $$3;
      } else {
         dwx $$5 = $$4.a($$3);
         if ($$5 != $$3) {
            $$1.a($$0, $$5, 2);
         }

         return $$5;
      }
   }

   protected boolean b(dag $$0, dwx $$1) {
      cox $$2 = $$0.o();
      fbf $$3 = $$2 == null ? fbf.a() : fbf.a($$2);
      return (!this.c() || $$1.a((dgl)$$0.q(), $$0.a())) && $$0.q().a($$1, $$0.a(), $$3);
   }

   protected boolean c() {
      return true;
   }

   protected boolean a(dag $$0, dwx $$1) {
      return $$0.q().a($$0.a(), $$1, 11);
   }

   public static boolean a(dgi $$0, @Nullable cox $$1, ji $$2, cwp $$3) {
      if ($$0.C) {
         return false;
      } else {
         cyy $$4 = $$3.a(kv.Y, cyy.a);
         if (!$$4.c()) {
            dub<?> $$5 = a($$0.K_(), $$4);
            if ($$5 == null) {
               return false;
            }

            dtz $$6 = $$0.c_($$2);
            if ($$6 != null) {
               dub<?> $$7 = $$6.p();
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
   private static dub<?> a(jt.a $$0, cyy $$1) {
      aku $$2 = $$1.a();
      return $$2 == null ? null : $$0.a(mc.h).flatMap($$1x -> $$1x.a(akt.a(mc.h, $$2))).map(jr::a).orElse(null);
   }

   @Override
   public void a(cwp $$0, cwl.b $$1, List<wo> $$2, cyh $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.d().a($$0, $$1, $$2, $$3);
   }

   public static boolean a(cwp $$0, @Nullable cox $$1) {
      if ($$1 != null && $$1.G() >= 2) {
         cyy $$2 = $$0.a(kv.Y);
         if ($$2 != null) {
            dub<?> $$3 = a($$1.dW().K_(), $$2);
            return $$3 != null && $$3.b();
         }
      }

      return false;
   }

   public djm d() {
      return this.b;
   }

   public void a(Map<djm, cwl> $$0, cwl $$1) {
      $$0.put(this.d(), $$1);
   }

   @Override
   public boolean e() {
      return !(this.d() instanceof dqq);
   }

   @Override
   public void a(clb $$0) {
      czh $$1 = $$0.l().b(kv.al, czh.a);
      if ($$1 != null) {
         cws.a($$0, $$1.e());
      }
   }

   public static void a(cwp $$0, dub<?> $$1, tq $$2) {
      $$2.r("id");
      if ($$2.g()) {
         $$0.c(kv.Y);
      } else {
         dtz.a($$2, $$1);
         $$0.b(kv.Y, cyy.a($$2));
      }
   }

   @Override
   public crt i() {
      return this.d().i();
   }
}
