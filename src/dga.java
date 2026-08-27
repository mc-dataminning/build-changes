import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dga extends ddm implements dlb {
   public static final MapCodec<dga> a = b(dga::new);
   public static final akn b = new akn("sherds");
   private static final evf d = dea.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   private static final drx e = drt.R;
   public static final dru c = drt.bw;
   private static final dru f = drt.C;

   @Override
   public MapCodec<dga> a() {
      return a;
   }

   protected dga(drc.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, it.c).a(f, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, emx.c, emx.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public drd a(cxb $$0) {
      emw $$1 = $$0.q().b_($$0.a());
      return this.n().a(e, $$0.g()).a(f, Boolean.valueOf($$1.a() == emx.c)).a(c, Boolean.valueOf(false));
   }

   @Override
   protected bpy a(ctq $$0, drd $$1, daz $$2, io $$3, cly $$4, bpv $$5, eui $$6) {
      if ($$2.c_($$3) instanceof doy $$7) {
         if ($$2.B) {
            return bpy.b;
         } else {
            ctq $$9 = $$7.f();
            if (!$$0.e() && ($$9.e() || ctq.c($$9, $$0) && $$9.I() < $$9.j())) {
               $$7.a(doy.a.a);
               $$4.b(avs.c.b($$0.g()));
               ctq $$10 = $$4.f() ? $$0.c(1) : $$0.a(1);
               float $$11;
               if ($$7.c()) {
                  $$7.b($$10);
                  $$11 = (float)$$10.I() / (float)$$10.j();
               } else {
                  $$9.g(1);
                  $$11 = (float)$$9.I() / (float)$$9.j();
               }

               $$2.a(null, $$3, avi.gy, avj.e, 1.0F, 0.7F + 0.5F * $$11);
               if ($$2 instanceof aqn $$13) {
                  $$13.a(ky.aX, (double)$$3.u() + 0.5, (double)$$3.v() + 1.2, (double)$$3.w() + 0.5, 7, 0.0, 0.0, 0.0, 0.0);
               }

               $$7.e();
               $$2.a($$4, dvw.c, $$3);
               return bpy.a;
            } else {
               return bpy.d;
            }
         }
      } else {
         return bpy.e;
      }
   }

   @Override
   protected bpw a(drd $$0, daz $$1, io $$2, cly $$3, eui $$4) {
      if ($$1.c_($$2) instanceof doy $$5) {
         $$1.a(null, $$2, avi.gz, avj.e, 1.0F, 1.0F);
         $$5.a(doy.a.b);
         $$1.a($$3, dvw.c, $$2);
         return bpw.a;
      } else {
         return bpw.d;
      }
   }

   @Override
   protected boolean a(drd $$0, enl $$1) {
      return false;
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return d;
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(e, f, c);
   }

   @Nullable
   @Override
   public doi a(io $$0, drd $$1) {
      return new doy($$0, $$1);
   }

   @Override
   protected void a(drd $$0, daz $$1, io $$2, drd $$3, boolean $$4) {
      bps.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected List<ctq> a(drd $$0, epk.a $$1) {
      doi $$2 = $$1.b(erz.h);
      if ($$2 instanceof doy $$3) {
         $$1.a(b, $$1x -> {
            for (ctl $$2x : $$3.l().a()) {
               $$1x.accept($$2x.w());
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   public drd a(daz $$0, io $$1, drd $$2, cly $$3) {
      ctq $$4 = $$3.eX();
      drd $$5 = $$2;
      if ($$4.a(awf.bx) && !czc.h($$4)) {
         $$5 = $$2.a(c, Boolean.valueOf(true));
         $$0.a($$1, $$5, 4);
      }

      return super.a($$0, $$1, $$5, $$3);
   }

   @Override
   protected emw b_(drd $$0) {
      return $$0.c(f) ? emx.c.a(false) : super.b_($$0);
   }

   @Override
   protected dln g_(drd $$0) {
      return $$0.c(c) ? dln.bc : dln.bb;
   }

   @Override
   public void a(ctq $$0, ctl.b $$1, List<wx> $$2, cvj $$3) {
      super.a($$0, $$1, $$2, $$3);
      dpm $$4 = $$0.a(kb.Y, dpm.a);
      if (!$$4.equals(dpm.a)) {
         $$2.add(ww.a);
         Stream.of($$4.e(), $$4.c(), $$4.d(), $$4.b()).forEach($$1x -> $$2.add(new ctq($$1x.orElse(ctt.qL), 1).x().e().a(n.h)));
      }
   }

   @Override
   protected void a(daz $$0, drd $$1, eui $$2, cmq $$3) {
      io $$4 = $$2.a();
      if (!$$0.B && $$3.a($$0, $$4) && $$3.b($$0)) {
         $$0.a($$4, $$1.a(c, Boolean.valueOf(true)), 4);
         $$0.a($$4, true, $$3);
      }
   }

   @Override
   public ctq a(dbc $$0, io $$1, drd $$2) {
      return $$0.c_($$1) instanceof doy $$3 ? $$3.u() : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean c_(drd $$0) {
      return true;
   }

   @Override
   protected int a(drd $$0, daz $$1, io $$2) {
      return cov.a($$1.c_($$2));
   }

   @Override
   protected drd a(drd $$0, dkn $$1) {
      return $$0.a(e, $$1.a($$0.c(e)));
   }

   @Override
   protected drd a(drd $$0, dix $$1) {
      return $$0.a($$1.a($$0.c(e)));
   }
}
