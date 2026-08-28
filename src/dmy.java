import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dmy extends dmq {
   public static final MapCodec<dmy> a = b(dmy::new);
   public static final ece<jc> b = drf.e;
   public static final ecg c = ebw.aQ;
   public static final int d = 5;
   private static final int e = 3;

   @Override
   public MapCodec<dmy> a() {
      return a;
   }

   public dmy(ebf.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, Integer.valueOf(0)).b(b, jc.c));
   }

   @Override
   protected boolean c_(ebg $$0) {
      return true;
   }

   @Override
   protected int a(ebg $$0, djz $$1, iw $$2) {
      return $$0.c(c);
   }

   @Override
   public void a(djz $$0, crz $$1, iw $$2, ebg $$3, @Nullable dye $$4, daa $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$0.C && $$4 instanceof dyb $$6) {
         if (!dgp.a($$5, axi.q)) {
            $$6.a($$1, $$3, dyb.b.c);
            bup.a($$3, $$0, $$2);
            this.b($$0, $$2);
         }

         aq.L.a((arv)$$1, $$3, $$5, $$6.f());
      }
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, djs $$3, BiConsumer<daa, iw> $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      this.b($$1, $$2);
   }

   private void b(djz $$0, iw $$1) {
      ffn $$2 = new ffn($$1).c(8.0, 6.0, 8.0);
      List<cjn> $$3 = $$0.a(cjn.class, $$2);
      if (!$$3.isEmpty()) {
         List<crz> $$4 = $$0.a(crz.class, $$2);
         if ($$4.isEmpty()) {
            return;
         }

         for (cjn $$5 : $$3) {
            if ($$5.f() == null) {
               crz $$6 = ag.a($$4, $$0.A);
               $$5.g($$6);
            }
         }
      }
   }

   public static void a(djz $$0, iw $$1) {
      a($$0, $$1, new daa(dae.xL, 3));
   }

   @Override
   protected but a(daa $$0, ebg $$1, djz $$2, iw $$3, crz $$4, bus $$5, ffo $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = false;
      if ($$7 >= 5) {
         czw $$9 = $$0.h();
         if ($$0.a(dae.td)) {
            $$2.a($$4, $$4.dA(), $$4.dC(), $$4.dG(), awr.bX, aws.e, 1.0F, 1.0F);
            a($$2, $$3);
            $$0.a(1, $$4, bxw.d($$5));
            $$8 = true;
            $$2.a($$4, egg.M, $$3);
         } else if ($$0.a(dae.ts)) {
            $$0.h(1);
            $$2.a($$4, $$4.dA(), $$4.dC(), $$4.dG(), awr.cC, aws.e, 1.0F, 1.0F);
            if ($$0.f()) {
               $$4.a($$5, new daa(dae.xO));
            } else if (!$$4.gj().g(new daa(dae.xO))) {
               $$4.a(new daa(dae.xO), false);
            }

            $$8 = true;
            $$2.a($$4, egg.y, $$3);
         }

         if (!$$2.A_() && $$8) {
            $$4.b(axb.c.b($$9));
         }
      }

      if ($$8) {
         if (!dnu.a($$2, $$3)) {
            if (this.c($$2, $$3)) {
               this.b($$2, $$3);
            }

            this.a($$2, $$1, $$3, $$4, dyb.b.c);
         } else {
            this.a($$2, $$1, $$3);
         }

         return but.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   private boolean c(djz $$0, iw $$1) {
      return $$0.c_($$1) instanceof dyb $$3 ? !$$3.c() : false;
   }

   public void a(djz $$0, ebg $$1, iw $$2, @Nullable crz $$3, dyb.b $$4) {
      this.a($$0, $$1, $$2);
      if ($$0.c_($$2) instanceof dyb $$6) {
         $$6.a($$3, $$1, $$4);
      }
   }

   public void a(djz $$0, ebg $$1, iw $$2) {
      $$0.a($$2, $$1.b(c, Integer.valueOf(0)), 3);
   }

   @Override
   public void a(ebg $$0, djz $$1, iw $$2, azz $$3) {
      if ($$0.c(c) >= 5) {
         for (int $$4 = 0; $$4 < $$3.a(1) + 1; $$4++) {
            this.a($$1, $$2, $$0);
         }
      }
   }

   private void a(djz $$0, iw $$1, ebg $$2) {
      if ($$2.y().c() && !($$0.A.i() < 0.3F)) {
         fgm $$3 = $$2.g($$0, $$1);
         double $$4 = $$3.c(jc.a.b);
         if ($$4 >= 1.0 && !$$2.a(axg.ar)) {
            double $$5 = $$3.b(jc.a.b);
            if ($$5 > 0.0) {
               this.a($$0, $$1, $$3, (double)$$1.v() + $$5 - 0.05);
            } else {
               iw $$6 = $$1.e();
               ebg $$7 = $$0.a_($$6);
               fgm $$8 = $$7.g($$0, $$6);
               double $$9 = $$8.c(jc.a.b);
               if (($$9 < 1.0 || !$$7.m($$0, $$6)) && $$7.y().c()) {
                  this.a($$0, $$1, $$3, (double)$$1.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(djz $$0, iw $$1, fgm $$2, double $$3) {
      this.a($$0, (double)$$1.u() + $$2.b(jc.a.a), (double)$$1.u() + $$2.c(jc.a.a), (double)$$1.w() + $$2.b(jc.a.c), (double)$$1.w() + $$2.c(jc.a.c), $$3);
   }

   private void a(djz $$0, double $$1, double $$2, double $$3, double $$4, double $$5) {
      $$0.a(lz.ay, azq.d($$0.A.j(), $$1, $$2), $$5, azq.d($$0.A.j(), $$3, $$4), 0.0, 0.0, 0.0);
   }

   @Override
   public ebg a(ddt $$0) {
      return this.m().b(b, $$0.g().g());
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(c, b);
   }

   @Nullable
   @Override
   public dye a(iw $$0, ebg $$1) {
      return new dyb($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dye> dyf<T> a(djz $$0, ebg $$1, dyg<T> $$2) {
      return $$0.C ? null : a($$2, dyg.I, dyb::a);
   }

   @Override
   public ebg a(djz $$0, iw $$1, ebg $$2, crz $$3) {
      if ($$0 instanceof aru $$4 && $$3.gl() && $$4.O().c(djv.i) && $$0.c_($$1) instanceof dyb $$6) {
         int $$7 = $$2.c(c);
         boolean $$8 = !$$6.c();
         if ($$8 || $$7 > 0) {
            daa $$9 = new daa(this);
            $$9.b($$6.q());
            $$9.b(kl.aq, dca.a.a(c, $$7));
            coe $$10 = new coe($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$9);
            $$10.j();
            $$0.b($$10);
         }
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected List<daa> a(ebg $$0, fam.a $$1) {
      bwv $$2 = $$1.b(fdd.a);
      if ($$2 instanceof cof || $$2 instanceof com || $$2 instanceof ctj || $$2 instanceof cnr || $$2 instanceof cva) {
         dye $$3 = $$1.b(fdd.h);
         if ($$3 instanceof dyb $$4) {
            $$4.a(null, $$0, dyb.b.c);
         }
      }

      return super.a($$0, $$1);
   }

   @Override
   protected daa a(dkc $$0, iw $$1, ebg $$2, boolean $$3) {
      daa $$4 = super.a($$0, $$1, $$2, $$3);
      if ($$3) {
         $$4.b(kl.aq, dca.a.a(c, $$2.c(c)));
      }

      return $$4;
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      if ($$1.a_($$5).b() instanceof dqg && $$1.c_($$3) instanceof dyb $$9) {
         $$9.a(null, $$0, dyb.b.c);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public ebg a(ebg $$0, dty $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   public ebg a(ebg $$0, dsh $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
