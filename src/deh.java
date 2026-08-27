import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class deh extends dbt implements djh {
   public static final MapCodec<deh> a = b(deh::new);
   public static final ajv b = new ajv("sherds");
   private static final etc d = dch.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   private static final dqc e = dpy.R;
   public static final dpz c = dpy.bw;
   private static final dpz f = dpy.C;

   @Override
   public MapCodec<deh> a() {
      return a;
   }

   protected deh(dph.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, ij.c).a(f, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, elc.c, elc.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dpi a(cux $$0) {
      elb $$1 = $$0.q().b_($$0.a());
      return this.n().a(e, $$0.g()).a(f, Boolean.valueOf($$1.a() == elc.c)).a(c, Boolean.valueOf(false));
   }

   @Override
   protected boh a(crs $$0, dpi $$1, czg $$2, id $$3, cka $$4, boe $$5, esf $$6) {
      if ($$2.c_($$3) instanceof dne $$7) {
         if ($$2.B) {
            return boh.b;
         } else {
            crs $$9 = $$7.f();
            if (!$$0.d() && ($$9.d() || crs.c($$9, $$0) && $$9.G() < $$9.i())) {
               $$7.a(dne.a.a);
               $$4.b(auz.c.b($$0.f()));
               crs $$10 = $$4.f() ? $$0.c(1) : $$0.a(1);
               float $$11;
               if ($$7.c()) {
                  $$7.a($$10);
                  $$11 = (float)$$10.G() / (float)$$10.i();
               } else {
                  $$9.f(1);
                  $$11 = (float)$$9.G() / (float)$$9.i();
               }

               $$2.a(null, $$3, auo.gt, aup.e, 1.0F, 0.7F + 0.5F * $$11);
               if ($$2 instanceof apu $$13) {
                  $$13.a(kn.aV, (double)$$3.u() + 0.5, (double)$$3.v() + 1.2, (double)$$3.w() + 0.5, 7, 0.0, 0.0, 0.0, 0.0);
               }

               $$7.e();
               $$2.a($$4, dub.c, $$3);
               return boh.a;
            } else {
               return boh.d;
            }
         }
      } else {
         return boh.e;
      }
   }

   @Override
   protected bof a(dpi $$0, czg $$1, id $$2, cka $$3, esf $$4) {
      if ($$1.c_($$2) instanceof dne $$5) {
         $$1.a(null, $$2, auo.gu, aup.e, 1.0F, 1.0F);
         $$5.a(dne.a.b);
         $$1.a($$3, dub.c, $$2);
         return bof.a;
      } else {
         return bof.d;
      }
   }

   @Override
   protected boolean a(dpi $$0, elq $$1) {
      return false;
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return d;
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(e, f, c);
   }

   @Nullable
   @Override
   public dmo a(id $$0, dpi $$1) {
      return new dne($$0, $$1);
   }

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, dpi $$3, boolean $$4) {
      bob.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected List<crs> a(dpi $$0, enq.a $$1) {
      dmo $$2 = $$1.b(epx.h);
      if ($$2 instanceof dne $$3) {
         $$1.a(b, $$1x -> {
            for (crn $$2x : $$3.l().a()) {
               $$1x.accept($$2x.x());
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   public dpi a(czg $$0, id $$1, dpi $$2, cka $$3) {
      crs $$4 = $$3.eU();
      dpi $$5 = $$2;
      if ($$4.a(avm.aY) && !cxa.h($$4)) {
         $$5 = $$2.a(c, Boolean.valueOf(true));
         $$0.a($$1, $$5, 4);
      }

      return super.a($$0, $$1, $$5, $$3);
   }

   @Override
   protected elb c_(dpi $$0) {
      return $$0.c(f) ? elc.c.a(false) : super.c_($$0);
   }

   @Override
   protected djt h_(dpi $$0) {
      return $$0.c(c) ? djt.bc : djt.bb;
   }

   @Override
   public void a(crs $$0, @Nullable cym $$1, List<wi> $$2, cti $$3, @Nullable jb $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dns $$5 = $$0.a(jr.P, dns.a);
      if (!$$5.equals(dns.a)) {
         $$2.add(wh.a);
         Stream.of($$5.e(), $$5.c(), $$5.d(), $$5.b()).forEach($$1x -> $$2.add(new crs($$1x.orElse(crv.qK), 1).w().e().a(n.h)));
      }
   }

   @Override
   protected void a(czg $$0, dpi $$1, esf $$2, cks $$3) {
      id $$4 = $$2.a();
      if (!$$0.B && $$3.a($$0, $$4) && $$3.b($$0)) {
         $$0.a($$4, $$1.a(c, Boolean.valueOf(true)), 4);
         $$0.a($$4, true, $$3);
      }
   }

   @Override
   public crs a(czj $$0, id $$1, dpi $$2) {
      return $$0.c_($$1) instanceof dne $$3 ? $$3.t() : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean d_(dpi $$0) {
      return true;
   }

   @Override
   protected int a(dpi $$0, czg $$1, id $$2) {
      return cmw.a($$1.c_($$2));
   }
}
