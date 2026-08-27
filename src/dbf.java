import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dbf extends cyr implements dgf {
   public static final MapCodec<dbf> a = b(dbf::new);
   public static final ajc b = new ajc("sherds");
   private static final epo d = czf.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   private static final dmy e = dmu.R;
   public static final dmv c = dmu.bw;
   private static final dmv f = dmu.C;

   @Override
   public MapCodec<dbf> a() {
      return a;
   }

   protected dbf(dmd.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, ih.c).a(f, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, ehs.c, ehs.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dme a(crx $$0) {
      ehr $$1 = $$0.q().b_($$0.a());
      return this.o().a(e, $$0.g()).a(f, Boolean.valueOf($$1.a() == ehs.c)).a(c, Boolean.valueOf(false));
   }

   @Override
   protected bmn a(cpq $$0, dme $$1, cwe $$2, ib $$3, cia $$4, bmk $$5, eor $$6) {
      if ($$2.c_($$3) instanceof dkb $$7) {
         if ($$2.B) {
            return bmn.b;
         } else {
            cpq $$9 = $$7.f();
            if (!$$0.b() && ($$9.b() || cpq.c($$9, $$0) && $$9.M() < $$9.g())) {
               $$7.a(dkb.b.a);
               $$4.b(atz.c.b($$0.d()));
               cpq $$10 = $$4.f() ? $$0.c(1) : $$0.a(1);
               float $$11;
               if ($$7.aj_()) {
                  $$7.a($$10);
                  $$11 = (float)$$10.M() / (float)$$10.g();
               } else {
                  $$9.g(1);
                  $$11 = (float)$$9.M() / (float)$$9.g();
               }

               $$2.a(null, $$3, atp.gl, atq.e, 1.0F, 0.7F + 0.5F * $$11);
               if ($$2 instanceof apa $$13) {
                  $$13.a(kb.aU, (double)$$3.u() + 0.5, (double)$$3.v() + 1.2, (double)$$3.w() + 0.5, 7, 0.0, 0.0, 0.0, 0.0);
               }

               $$7.e();
               $$2.a($$4, dqr.c, $$3);
               return bmn.a;
            } else {
               return bmn.d;
            }
         }
      } else {
         return bmn.e;
      }
   }

   @Override
   protected bml a(dme $$0, cwe $$1, ib $$2, cia $$3, eor $$4) {
      if ($$1.c_($$2) instanceof dkb $$5) {
         $$1.a(null, $$2, atp.gm, atq.e, 1.0F, 1.0F);
         $$5.a(dkb.b.b);
         $$1.a($$3, dqr.c, $$2);
         return bml.a;
      } else {
         return bml.d;
      }
   }

   @Override
   public void a(cwe $$0, ib $$1, dme $$2, @Nullable box $$3, cpq $$4) {
      if ($$0.B) {
         $$0.a($$1, djn.O).ifPresent($$1x -> $$1x.b($$4));
      }
   }

   @Override
   protected boolean a(dme $$0, cvk $$1, ib $$2, eih $$3) {
      return false;
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return d;
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(e, f, c);
   }

   @Nullable
   @Override
   public djl a(ib $$0, dme $$1) {
      return new dkb($$0, $$1);
   }

   @Override
   protected void a(dme $$0, cwe $$1, ib $$2, dme $$3, boolean $$4) {
      bmh.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected List<cpq> a(dme $$0, eke.a $$1) {
      djl $$2 = $$1.b(emj.h);
      if ($$2 instanceof dkb $$3) {
         $$1.a(b, $$1x -> $$3.l().a().map(cpl::an_).forEach($$1x));
      }

      return super.a($$0, $$1);
   }

   @Override
   public dme a(cwe $$0, ib $$1, dme $$2, cia $$3) {
      cpq $$4 = $$3.eR();
      dme $$5 = $$2;
      if ($$4.a(aum.aY) && !cua.f($$4)) {
         $$5 = $$2.a(c, Boolean.valueOf(true));
         $$0.a($$1, $$5, 4);
      }

      return super.a($$0, $$1, $$5, $$3);
   }

   @Override
   protected ehr c_(dme $$0) {
      return $$0.c(f) ? ehs.c.a(false) : super.c_($$0);
   }

   @Override
   protected dgr h_(dme $$0) {
      return $$0.c(c) ? dgr.bc : dgr.bb;
   }

   @Override
   public void a(cpq $$0, @Nullable cvk $$1, List<vs> $$2, crh $$3, @Nullable iy $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dkb.a $$5 = dkb.a.b(cnl.a($$0));
      if (!$$5.equals(dkb.a.a)) {
         $$2.add(vr.a);
         Stream.of($$5.e(), $$5.c(), $$5.d(), $$5.b()).forEach($$1x -> $$2.add(new cpq($$1x, 1).z().e().a(n.h)));
      }
   }

   @Override
   protected void a(cwe $$0, dme $$1, eor $$2, cis $$3) {
      ib $$4 = $$2.a();
      if (!$$0.B && $$3.a($$0, $$4) && $$3.b($$0)) {
         $$0.a($$4, $$1.a(c, Boolean.valueOf(true)), 4);
         $$0.a($$4, true, $$3);
      }
   }

   @Override
   public cpq a(cwh $$0, ib $$1, dme $$2) {
      return $$0.c_($$1) instanceof dkb $$3 ? $$3.s() : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean d_(dme $$0) {
      return true;
   }

   @Override
   protected int a(dme $$0, cwe $$1, ib $$2) {
      return cku.a($$1.c_($$2));
   }
}
