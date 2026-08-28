import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dgp extends dgh {
   public static final MapCodec<dgp> a = b(dgp::new);
   public static final duu b = dkr.aE;
   public static final dva c = duq.aN;
   public static final int d = 5;
   private static final int e = 3;

   @Override
   public MapCodec<dgp> a() {
      return a;
   }

   public dgp(dtz.d $$0) {
      super($$0);
      this.l(this.E.b().b(c, Integer.valueOf(0)).b(b, jj.c));
   }

   @Override
   protected boolean c_(dua $$0) {
      return true;
   }

   @Override
   protected int a(dua $$0, dds $$1, je $$2) {
      return $$0.c(c);
   }

   @Override
   public void a(dds $$0, cnp $$1, je $$2, dua $$3, @Nullable dre $$4, cvl $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$0.B && $$4 instanceof drb $$6) {
         if (!day.a($$5, awv.q)) {
            $$6.a($$1, $$3, drb.b.c);
            $$0.c($$2, this);
            this.b($$0, $$2);
         }

         an.L.a((arh)$$1, $$3, $$5, $$6.f());
      }
   }

   @Override
   protected void a(dua $$0, arg $$1, je $$2, ddk $$3, BiConsumer<cvl, je> $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      this.b($$1, $$2);
   }

   private void b(dds $$0, je $$1) {
      exz $$2 = new exz($$1).c(8.0, 6.0, 8.0);
      List<cfw> $$3 = $$0.a(cfw.class, $$2);
      if (!$$3.isEmpty()) {
         List<cnp> $$4 = $$0.a(cnp.class, $$2);
         if ($$4.isEmpty()) {
            return;
         }

         for (cfw $$5 : $$3) {
            if ($$5.m() == null) {
               cnp $$6 = ad.a($$4, $$0.z);
               $$5.h($$6);
            }
         }
      }
   }

   public static void a(dds $$0, je $$1) {
      a($$0, $$1, new cvl(cvo.wC, 3));
   }

   @Override
   protected brk a(cvl $$0, dua $$1, dds $$2, je $$3, cnp $$4, brj $$5, eya $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = false;
      if ($$7 >= 5) {
         cvg $$9 = $$0.h();
         if ($$0.a(cvo.rW)) {
            $$2.a($$4, $$4.dx(), $$4.dz(), $$4.dD(), awd.bX, awe.e, 1.0F, 1.0F);
            a($$2, $$3);
            $$0.a(1, $$4, buf.d($$5));
            $$8 = true;
            $$2.a($$4, dyx.M, $$3);
         } else if ($$0.a(cvo.sm)) {
            $$0.h(1);
            $$2.a($$4, $$4.dx(), $$4.dz(), $$4.dD(), awd.cC, awe.e, 1.0F, 1.0F);
            if ($$0.f()) {
               $$4.a($$5, new cvl(cvo.wF));
            } else if (!$$4.gc().f(new cvl(cvo.wF))) {
               $$4.a(new cvl(cvo.wF), false);
            }

            $$8 = true;
            $$2.a($$4, dyx.y, $$3);
         }

         if (!$$2.w_() && $$8) {
            $$4.b(awn.c.b($$9));
         }
      }

      if ($$8) {
         if (!dhj.a($$2, $$3)) {
            if (this.c($$2, $$3)) {
               this.b($$2, $$3);
            }

            this.a($$2, $$1, $$3, $$4, drb.b.c);
         } else {
            this.a($$2, $$1, $$3);
         }

         return brk.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private boolean c(dds $$0, je $$1) {
      return $$0.c_($$1) instanceof drb $$3 ? !$$3.c() : false;
   }

   public void a(dds $$0, dua $$1, je $$2, @Nullable cnp $$3, drb.b $$4) {
      this.a($$0, $$1, $$2);
      if ($$0.c_($$2) instanceof drb $$6) {
         $$6.a($$3, $$1, $$4);
      }
   }

   public void a(dds $$0, dua $$1, je $$2) {
      $$0.a($$2, $$1.b(c, Integer.valueOf(0)), 3);
   }

   @Override
   public void a(dua $$0, dds $$1, je $$2, azk $$3) {
      if ($$0.c(c) >= 5) {
         for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   private void a(dds $$0, je $$1, dua $$2) {
      if ($$2.y().c() && !($$0.z.i() < 0.3F)) {
         eyx $$3 = $$2.g($$0, $$1);
         double $$4 = $$3.c(jj.a.b);
         if ($$4 >= 1.0 && !$$2.a(aws.ap)) {
            double $$5 = $$3.b(jj.a.b);
            if ($$5 > 0.0) {
               this.a($$0, $$1, $$3, (double)$$1.v() + $$5 - 0.05);
            } else {
               je $$6 = $$1.e();
               dua $$7 = $$0.a_($$6);
               eyx $$8 = $$7.g($$0, $$6);
               double $$9 = $$8.c(jj.a.b);
               if (($$9 < 1.0 || !$$7.m($$0, $$6)) && $$7.y().c()) {
                  this.a($$0, $$1, $$3, (double)$$1.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(dds $$0, je $$1, eyx $$2, double $$3) {
      this.a($$0, (double)$$1.u() + $$2.b(jj.a.a), (double)$$1.u() + $$2.c(jj.a.a), (double)$$1.w() + $$2.b(jj.a.c), (double)$$1.w() + $$2.c(jj.a.c), $$3);
   }

   private void a(dds $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      $$0.a(ln.av, azc.d($$0.z.j(), $$1, $$2), $$5, azc.d($$0.z.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   @Override
   public dua a(cyw $$0) {
      return this.o().b(b, $$0.g().g());
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(c, b);
   }

   @Override
   protected dnc a_(dua $$0) {
      return dnc.c;
   }

   @Nullable
   @Override
   public dre a(je $$0, dua $$1) {
      return new drb($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dre> drf<T> a(dds $$0, dua $$1, drg<T> $$2) {
      return $$0.B ? null : a($$2, drg.H, drb::a);
   }

   @Override
   public dua a(dds $$0, je $$1, dua $$2, cnp $$3) {
      if (!$$0.B && $$3.f() && $$0.ac().b(ddo.h) && $$0.c_($$1) instanceof drb $$5) {
         int $$6 = $$2.c(c);
         boolean $$7 = !$$5.c();
         if ($$7 || $$6 > 0) {
            cvl $$8 = new cvl(this);
            $$8.b($$5.r());
            $$8.b(kr.ae, cxw.a.a(c, $$6));
            cjz $$9 = new cjz($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$8);
            $$9.q();
            $$0.b($$9);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<cvl> a(dua $$0, esw.a $$1) {
      btj $$2 = $$1.b(evp.a);
      if ($$2 instanceof cka || $$2 instanceof ckh || $$2 instanceof cox || $$2 instanceof cjm || $$2 instanceof cpz) {
         dre $$3 = $$1.b(evp.h);
         if ($$3 instanceof drb $$4) {
            $$4.a(null, $$0, drb.b.c);
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      if ($$3.a_($$5).b() instanceof djv && $$3.c_($$4) instanceof drb $$7) {
         $$7.a(null, $$0, drb.b.c);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dua a(dua $$0, dnj $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public dua a(dua $$0, dls $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
