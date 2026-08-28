import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class div extends dgh implements dnx {
   public static final MapCodec<div> a = b(div::new);
   public static final alb b = alb.b("sherds");
   private static final eyx d = dgv.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   private static final duu e = duq.R;
   public static final dur c = duq.bw;
   private static final dur f = duq.C;

   @Override
   public MapCodec<div> a() {
      return a;
   }

   protected div(dtz.d $$0) {
      super($$0);
      this.l(this.E.b().b(e, jj.c).b(f, Boolean.valueOf(false)).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, eqc.c, eqc.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dua a(cyw $$0) {
      eqb $$1 = $$0.q().b_($$0.a());
      return this.o().b(e, $$0.g()).b(f, Boolean.valueOf($$1.a() == eqc.c)).b(c, Boolean.valueOf(false));
   }

   @Override
   protected brk a(cvl $$0, dua $$1, dds $$2, je $$3, cnp $$4, brj $$5, eya $$6) {
      if ($$2.c_($$3) instanceof dru $$7) {
         if ($$2.B) {
            return brk.a;
         } else {
            cvl $$9 = $$7.f();
            if (!$$0.f() && ($$9.f() || cvl.c($$9, $$0) && $$9.J() < $$9.k())) {
               $$7.a(dru.a.a);
               $$4.b(awn.c.b($$0.h()));
               cvl $$10 = $$0.b(1, $$4);
               float $$11;
               if ($$7.c()) {
                  $$7.b($$10);
                  $$11 = (float)$$10.J() / (float)$$10.k();
               } else {
                  $$9.g(1);
                  $$11 = (float)$$9.J() / (float)$$9.k();
               }

               $$2.a(null, $$3, awd.gz, awe.e, 1.0F, 0.7F + 0.5F * $$11);
               if ($$2 instanceof arg $$13) {
                  $$13.a(ln.aX, (double)$$3.u() + 0.5, (double)$$3.v() + 1.2, (double)$$3.w() + 0.5, 7, 0.0, 0.0, 0.0, 0.0);
               }

               $$7.e();
               $$2.a($$4, dyx.c, $$3);
               return brk.a;
            } else {
               return brk.f;
            }
         }
      } else {
         return brk.e;
      }
   }

   @Override
   protected brk a(dua $$0, dds $$1, je $$2, cnp $$3, eya $$4) {
      if ($$1.c_($$2) instanceof dru $$5) {
         $$1.a(null, $$2, awd.gA, awe.e, 1.0F, 1.0F);
         $$5.a(dru.a.b);
         $$1.a($$3, dyx.c, $$2);
         return brk.a;
      } else {
         return brk.e;
      }
   }

   @Override
   protected boolean a(dua $$0, eqq $$1) {
      return false;
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return d;
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(e, f, c);
   }

   @Nullable
   @Override
   public dre a(je $$0, dua $$1) {
      return new dru($$0, $$1);
   }

   @Override
   protected void a(dua $$0, dds $$1, je $$2, dua $$3, boolean $$4) {
      brg.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected List<cvl> a(dua $$0, esw.a $$1) {
      dre $$2 = $$1.b(evp.h);
      if ($$2 instanceof dru $$3) {
         $$1.a(b, $$1x -> {
            for (cvg $$2x : $$3.t().a()) {
               $$1x.accept($$2x.w());
            }
         });
      }

      return super.a($$0, $$1);
   }

   @Override
   public dua a(dds $$0, je $$1, dua $$2, cnp $$3) {
      cvl $$4 = $$3.eW();
      dua $$5 = $$2;
      if ($$4.a(axb.bA) && !day.a($$4, awv.r)) {
         $$5 = $$2.b(c, Boolean.valueOf(true));
         $$0.a($$1, $$5, 4);
      }

      return super.a($$0, $$1, $$5, $$3);
   }

   @Override
   protected eqb b_(dua $$0) {
      return $$0.c(f) ? eqc.c.a(false) : super.b_($$0);
   }

   @Override
   protected doj h_(dua $$0) {
      return $$0.c(c) ? doj.bc : doj.bb;
   }

   @Override
   public void a(cvl $$0, cvg.b $$1, List<xd> $$2, cxf $$3) {
      super.a($$0, $$1, $$2, $$3);
      dsk $$4 = $$0.a(kr.ac, dsk.a);
      if (!$$4.equals(dsk.a)) {
         $$2.add(xc.a);
         Stream.of($$4.e(), $$4.c(), $$4.d(), $$4.b()).forEach($$1x -> $$2.add(new cvl($$1x.orElse(cvo.qM), 1).y().e().a(n.h)));
      }
   }

   @Override
   protected void a(dds $$0, dua $$1, eya $$2, coi $$3) {
      je $$4 = $$2.a();
      if (!$$0.B && $$3.a($$0, $$4) && $$3.b($$0)) {
         $$0.a($$4, $$1.b(c, Boolean.valueOf(true)), 4);
         $$0.a($$4, true, $$3);
      }
   }

   @Override
   public cvl a(ddv $$0, je $$1, dua $$2) {
      return $$0.c_($$1) instanceof dru $$3 ? $$3.u() : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean c_(dua $$0) {
      return true;
   }

   @Override
   protected int a(dua $$0, dds $$1, je $$2) {
      return cqq.a($$1.c_($$2));
   }

   @Override
   protected dua a(dua $$0, dnj $$1) {
      return $$0.b(e, $$1.a($$0.c(e)));
   }

   @Override
   protected dua a(dua $$0, dls $$1) {
      return $$0.a($$1.a($$0.c(e)));
   }
}
