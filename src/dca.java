import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class dca extends czm implements dha {
   public static final MapCodec<dca> a = b(dca::new);
   public static final ajh b = new ajh("sherds");
   private static final eqk d = daa.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   private static final dnt e = dnp.R;
   public static final dnq c = dnp.bw;
   private static final dnq f = dnp.C;

   @Override
   public MapCodec<dca> a() {
      return a;
   }

   protected dca(dmy.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, ih.c).a(f, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, eio.c, eio.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dmz a(css $$0) {
      ein $$1 = $$0.q().b_($$0.a());
      return this.o().a(e, $$0.g()).a(f, Boolean.valueOf($$1.a() == eio.c)).a(c, Boolean.valueOf(false));
   }

   @Override
   protected bne a(cqk $$0, dmz $$1, cwz $$2, ib $$3, cis $$4, bnb $$5, epn $$6) {
      if ($$2.c_($$3) instanceof dkw $$7) {
         if ($$2.B) {
            return bne.b;
         } else {
            cqk $$9 = $$7.f();
            if (!$$0.b() && ($$9.b() || cqk.c($$9, $$0) && $$9.M() < $$9.g())) {
               $$7.a(dkw.b.a);
               $$4.b(aui.c.b($$0.d()));
               cqk $$10 = $$4.f() ? $$0.c(1) : $$0.a(1);
               float $$11;
               if ($$7.ai_()) {
                  $$7.a($$10);
                  $$11 = (float)$$10.M() / (float)$$10.g();
               } else {
                  $$9.g(1);
                  $$11 = (float)$$9.M() / (float)$$9.g();
               }

               $$2.a(null, $$3, aty.go, atz.e, 1.0F, 0.7F + 0.5F * $$11);
               if ($$2 instanceof apf $$13) {
                  $$13.a(kc.aV, (double)$$3.u() + 0.5, (double)$$3.v() + 1.2, (double)$$3.w() + 0.5, 7, 0.0, 0.0, 0.0, 0.0);
               }

               $$7.e();
               $$2.a($$4, drn.c, $$3);
               return bne.a;
            } else {
               return bne.d;
            }
         }
      } else {
         return bne.e;
      }
   }

   @Override
   protected bnc a(dmz $$0, cwz $$1, ib $$2, cis $$3, epn $$4) {
      if ($$1.c_($$2) instanceof dkw $$5) {
         $$1.a(null, $$2, aty.gp, atz.e, 1.0F, 1.0F);
         $$5.a(dkw.b.b);
         $$1.a($$3, drn.c, $$2);
         return bnc.a;
      } else {
         return bnc.d;
      }
   }

   @Override
   public void a(cwz $$0, ib $$1, dmz $$2, @Nullable bpo $$3, cqk $$4) {
      if ($$0.B) {
         $$0.a($$1, dki.O).ifPresent($$1x -> $$1x.b($$4));
      }
   }

   @Override
   protected boolean a(dmz $$0, cwf $$1, ib $$2, ejd $$3) {
      return false;
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return d;
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(e, f, c);
   }

   @Nullable
   @Override
   public dkg a(ib $$0, dmz $$1) {
      return new dkw($$0, $$1);
   }

   @Override
   protected void a(dmz $$0, cwz $$1, ib $$2, dmz $$3, boolean $$4) {
      bmy.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected List<cqk> a(dmz $$0, ela.a $$1) {
      dkg $$2 = $$1.b(enf.h);
      if ($$2 instanceof dkw $$3) {
         $$1.a(b, $$1x -> $$3.l().a().map(cqf::am_).forEach($$1x));
      }

      return super.a($$0, $$1);
   }

   @Override
   public dmz a(cwz $$0, ib $$1, dmz $$2, cis $$3) {
      cqk $$4 = $$3.eU();
      dmz $$5 = $$2;
      if ($$4.a(auv.aY) && !cuv.f($$4)) {
         $$5 = $$2.a(c, Boolean.valueOf(true));
         $$0.a($$1, $$5, 4);
      }

      return super.a($$0, $$1, $$5, $$3);
   }

   @Override
   protected ein c_(dmz $$0) {
      return $$0.c(f) ? eio.c.a(false) : super.c_($$0);
   }

   @Override
   protected dhm h_(dmz $$0) {
      return $$0.c(c) ? dhm.bc : dhm.bb;
   }

   @Override
   public void a(cqk $$0, @Nullable cwf $$1, List<vu> $$2, csb $$3, @Nullable iz $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dkw.a $$5 = dkw.a.b(cof.a($$0));
      if (!$$5.equals(dkw.a.a)) {
         $$2.add(vt.a);
         Stream.of($$5.e(), $$5.c(), $$5.d(), $$5.b()).forEach($$1x -> $$2.add(new cqk($$1x, 1).z().e().a(n.h)));
      }
   }

   @Override
   protected void a(cwz $$0, dmz $$1, epn $$2, cjk $$3) {
      ib $$4 = $$2.a();
      if (!$$0.B && $$3.a($$0, $$4) && $$3.b($$0)) {
         $$0.a($$4, $$1.a(c, Boolean.valueOf(true)), 4);
         $$0.a($$4, true, $$3);
      }
   }

   @Override
   public cqk a(cxc $$0, ib $$1, dmz $$2) {
      return $$0.c_($$1) instanceof dkw $$3 ? $$3.s() : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean d_(dmz $$0) {
      return true;
   }

   @Override
   protected int a(dmz $$0, cwz $$1, ib $$2) {
      return clo.a($$1.c_($$2));
   }
}
