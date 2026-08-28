import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Objects;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dhg extends dgy {
   public static final MapCodec<dhg> a = b(dhg::new);
   public static final dvm b = dli.aF;
   public static final dvs c = dvi.aN;
   public static final int d = 5;
   private static final int e = 3;

   @Override
   public MapCodec<dhg> a() {
      return a;
   }

   public dhg(dur.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(0)).b(b, jk.c));
   }

   @Override
   protected boolean c_(dus $$0) {
      return true;
   }

   @Override
   protected int a(dus $$0, dej $$1, jf $$2) {
      return $$0.c(c);
   }

   @Override
   public void a(dej $$0, cnx $$1, jf $$2, dus $$3, @Nullable drv $$4, cvs $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$0.B && $$4 instanceof drs $$6) {
         if (!dbp.a($$5, awy.q)) {
            $$6.a($$1, $$3, drs.b.c);
            $$0.c($$2, this);
            this.b($$0, $$2);
         }

         an.L.a((ark)$$1, $$3, $$5, $$6.f());
      }
   }

   @Override
   protected void a(dus $$0, arj $$1, jf $$2, deb $$3, BiConsumer<cvs, jf> $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      this.b($$1, $$2);
   }

   private void b(dej $$0, jf $$1) {
      eyr $$2 = new eyr($$1).c(8.0, 6.0, 8.0);
      List<cge> $$3 = $$0.a(cge.class, $$2);
      if (!$$3.isEmpty()) {
         List<cnx> $$4 = $$0.a(cnx.class, $$2);
         if ($$4.isEmpty()) {
            return;
         }

         for (cge $$5 : $$3) {
            if ($$5.m() == null) {
               cnx $$6 = ad.a($$4, $$0.z);
               $$5.h($$6);
            }
         }
      }
   }

   public static void a(dej $$0, jf $$1) {
      a($$0, $$1, new cvs(cvw.wC, 3));
   }

   @Override
   protected brs a(cvs $$0, dus $$1, dej $$2, jf $$3, cnx $$4, brr $$5, eys $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = false;
      if ($$7 >= 5) {
         cvn $$9 = $$0.h();
         if ($$0.a(cvw.rW)) {
            $$2.a($$4, $$4.dx(), $$4.dz(), $$4.dD(), awg.bX, awh.e, 1.0F, 1.0F);
            a($$2, $$3);
            $$0.a(1, $$4, bun.d($$5));
            $$8 = true;
            $$2.a($$4, dzp.M, $$3);
         } else if ($$0.a(cvw.sl)) {
            $$0.h(1);
            $$2.a($$4, $$4.dx(), $$4.dz(), $$4.dD(), awg.cC, awh.e, 1.0F, 1.0F);
            if ($$0.f()) {
               $$4.a($$5, new cvs(cvw.wF));
            } else if (!$$4.gd().f(new cvs(cvw.wF))) {
               $$4.a(new cvs(cvw.wF), false);
            }

            $$8 = true;
            $$2.a($$4, dzp.y, $$3);
         }

         if (!$$2.x_() && $$8) {
            $$4.b(awq.c.b($$9));
         }
      }

      if ($$8) {
         if (!dia.a($$2, $$3)) {
            if (this.c($$2, $$3)) {
               this.b($$2, $$3);
            }

            this.a($$2, $$1, $$3, $$4, drs.b.c);
         } else {
            this.a($$2, $$1, $$3);
         }

         return brs.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private boolean c(dej $$0, jf $$1) {
      return $$0.c_($$1) instanceof drs $$3 ? !$$3.c() : false;
   }

   public void a(dej $$0, dus $$1, jf $$2, @Nullable cnx $$3, drs.b $$4) {
      this.a($$0, $$1, $$2);
      if ($$0.c_($$2) instanceof drs $$6) {
         $$6.a($$3, $$1, $$4);
      }
   }

   public void a(dej $$0, dus $$1, jf $$2) {
      $$0.a($$2, $$1.b(c, Integer.valueOf(0)), 3);
   }

   @Override
   public void a(dus $$0, dej $$1, jf $$2, azn $$3) {
      if ($$0.c(c) >= 5) {
         for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   private void a(dej $$0, jf $$1, dus $$2) {
      if ($$2.y().c() && !($$0.z.i() < 0.3F)) {
         ezq $$3 = $$2.g($$0, $$1);
         double $$4 = $$3.c(jk.a.b);
         if ($$4 >= 1.0 && !$$2.a(awv.ap)) {
            double $$5 = $$3.b(jk.a.b);
            if ($$5 > 0.0) {
               this.a($$0, $$1, $$3, (double)$$1.v() + $$5 - 0.05);
            } else {
               jf $$6 = $$1.e();
               dus $$7 = $$0.a_($$6);
               ezq $$8 = $$7.g($$0, $$6);
               double $$9 = $$8.c(jk.a.b);
               if (($$9 < 1.0 || !$$7.m($$0, $$6)) && $$7.y().c()) {
                  this.a($$0, $$1, $$3, (double)$$1.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(dej $$0, jf $$1, ezq $$2, double $$3) {
      this.a($$0, (double)$$1.u() + $$2.b(jk.a.a), (double)$$1.u() + $$2.c(jk.a.a), (double)$$1.w() + $$2.b(jk.a.c), (double)$$1.w() + $$2.c(jk.a.c), $$3);
   }

   private void a(dej $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      $$0.a(lo.av, azf.d($$0.z.j(), $$1, $$2), $$5, azf.d($$0.z.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   @Override
   public dus a(czn $$0) {
      return this.n().b(b, $$0.g().g());
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(c, b);
   }

   @Override
   protected dnt a_(dus $$0) {
      return dnt.c;
   }

   @Nullable
   @Override
   public drv a(jf $$0, dus $$1) {
      return new drs($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends drv> drw<T> a(dej $$0, dus $$1, drx<T> $$2) {
      return $$0.B ? null : a($$2, drx.H, drs::a);
   }

   @Override
   public dus a(dej $$0, jf $$1, dus $$2, cnx $$3) {
      if (!$$0.B && $$3.f() && $$0.ac().b(def.h) && $$0.c_($$1) instanceof drs $$5) {
         int $$6 = $$2.c(c);
         boolean $$7 = !$$5.c();
         if ($$7 || $$6 > 0) {
            cvs $$8 = new cvs(this);
            $$8.b($$5.r());
            $$8.b(ks.ah, cya.a.a(c, $$6));
            ckh $$9 = new ckh($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$8);
            $$9.q();
            $$0.b($$9);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<cvs> a(dus $$0, eto.a $$1) {
      btr $$2 = $$1.b(ewh.a);
      if ($$2 instanceof cki || $$2 instanceof ckp || $$2 instanceof cpf || $$2 instanceof cju || $$2 instanceof cqi) {
         drv $$3 = $$1.b(ewh.h);
         if ($$3 instanceof drs $$4) {
            $$4.a(null, $$0, drs.b.c);
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      if ($$3.a_($$5).b() instanceof dkm && $$3.c_($$4) instanceof drs $$7) {
         $$7.a(null, $$0, drs.b.c);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dus a(dus $$0, doa $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public dus a(dus $$0, dmj $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   public void a(cvs $$0, cvn.b $$1, List<xe> $$2, cxk $$3) {
      super.a($$0, $$1, $$2, $$3);
      cya $$4 = $$0.a(ks.ah, cya.a);
      int $$5 = Objects.requireNonNullElse($$4.a(c), 0);
      int $$6 = $$0.a(ks.ai, List.of()).size();
      $$2.add(xe.a("container.beehive.bees", $$6, 3).a(n.h));
      $$2.add(xe.a("container.beehive.honey", $$5, 5).a(n.h));
   }
}
