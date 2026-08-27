import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dev extends dch implements djw {
   public static final MapCodec<dev> a = b(dev::new);
   public static final akf b = new akf("sherds");
   private static final ety d = dcv.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   private static final dqs e = dqo.R;
   public static final dqp c = dqo.bw;
   private static final dqp f = dqo.C;

   @Override
   public MapCodec<dev> a() {
      return a;
   }

   protected dev(dpx.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, ir.c).a(f, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, els.c, els.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dpy a(cvl $$0) {
      elr $$1 = $$0.q().b_($$0.a());
      return this.n().a(e, $$0.g()).a(f, Boolean.valueOf($$1.a() == els.c)).a(c, Boolean.valueOf(false));
   }

   @Override
   protected bos a(csd $$0, dpy $$1, czu $$2, im $$3, ckl $$4, bop $$5, etb $$6) {
      if ($$2.c_($$3) instanceof dnt $$7) {
         if ($$2.B) {
            return bos.b;
         } else {
            csd $$9 = $$7.f();
            if (!$$0.d() && ($$9.d() || csd.c($$9, $$0) && $$9.G() < $$9.i())) {
               $$7.a(dnt.a.a);
               $$4.b(avj.c.b($$0.f()));
               csd $$10 = $$4.f() ? $$0.c(1) : $$0.a(1);
               float $$11;
               if ($$7.c()) {
                  $$7.a($$10);
                  $$11 = (float)$$10.G() / (float)$$10.i();
               } else {
                  $$9.f(1);
                  $$11 = (float)$$9.G() / (float)$$9.i();
               }

               $$2.a(null, $$3, auz.gt, ava.e, 1.0F, 0.7F + 0.5F * $$11);
               if ($$2 instanceof aqe $$13) {
                  $$13.a(kw.aU, (double)$$3.u() + 0.5, (double)$$3.v() + 1.2, (double)$$3.w() + 0.5, 7, 0.0, 0.0, 0.0, 0.0);
               }

               $$7.e();
               $$2.a($$4, dur.c, $$3);
               return bos.a;
            } else {
               return bos.d;
            }
         }
      } else {
         return bos.e;
      }
   }

   @Override
   protected boq a(dpy $$0, czu $$1, im $$2, ckl $$3, etb $$4) {
      if ($$1.c_($$2) instanceof dnt $$5) {
         $$1.a(null, $$2, auz.gu, ava.e, 1.0F, 1.0F);
         $$5.a(dnt.a.b);
         $$1.a($$3, dur.c, $$2);
         return boq.a;
      } else {
         return boq.d;
      }
   }

   @Override
   protected boolean a(dpy $$0, emg $$1) {
      return false;
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return d;
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(e, f, c);
   }

   @Nullable
   @Override
   public dnd a(im $$0, dpy $$1) {
      return new dnt($$0, $$1);
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, dpy $$3, boolean $$4) {
      bom.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected List<csd> a(dpy $$0, eog.a $$1) {
      dnd $$2 = $$1.b(eqt.h);
      if ($$2 instanceof dnt $$3) {
         $$1.a(b, $$1x -> {
            for (cry $$2x : $$3.l().a()) {
               $$1x.accept($$2x.x());
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   public dpy a(czu $$0, im $$1, dpy $$2, ckl $$3) {
      csd $$4 = $$3.eV();
      dpy $$5 = $$2;
      if ($$4.a(avw.aY) && !cxo.h($$4)) {
         $$5 = $$2.a(c, Boolean.valueOf(true));
         $$0.a($$1, $$5, 4);
      }

      return super.a($$0, $$1, $$5, $$3);
   }

   @Override
   protected elr c_(dpy $$0) {
      return $$0.c(f) ? els.c.a(false) : super.c_($$0);
   }

   @Override
   protected dki h_(dpy $$0) {
      return $$0.c(c) ? dki.bc : dki.bb;
   }

   @Override
   public void a(csd $$0, @Nullable cza $$1, List<ws> $$2, ctu $$3, @Nullable jj $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      doh $$5 = $$0.a(jz.P, doh.a);
      if (!$$5.equals(doh.a)) {
         $$2.add(wr.a);
         Stream.of($$5.e(), $$5.c(), $$5.d(), $$5.b()).forEach($$1x -> $$2.add(new csd($$1x.orElse(csg.qL), 1).w().e().a(n.h)));
      }
   }

   @Override
   protected void a(czu $$0, dpy $$1, etb $$2, cld $$3) {
      im $$4 = $$2.a();
      if (!$$0.B && $$3.a($$0, $$4) && $$3.b($$0)) {
         $$0.a($$4, $$1.a(c, Boolean.valueOf(true)), 4);
         $$0.a($$4, true, $$3);
      }
   }

   @Override
   public csd a(czx $$0, im $$1, dpy $$2) {
      return $$0.c_($$1) instanceof dnt $$3 ? $$3.t() : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean d_(dpy $$0) {
      return true;
   }

   @Override
   protected int a(dpy $$0, czu $$1, im $$2) {
      return cnh.a($$1.c_($$2));
   }

   @Override
   protected dpy a(dpy $$0, dji $$1) {
      return $$0.a(e, $$1.a($$0.c(e)));
   }

   @Override
   protected dpy a(dpy $$0, dhs $$1) {
      return $$0.a($$1.a($$0.c(e)));
   }
}
