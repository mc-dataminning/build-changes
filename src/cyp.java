import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class cyp extends cwb implements ddp {
   public static final MapCodec<cyp> a = b(cyp::new);
   public static final ahg b = new ahg("sherds");
   private static final eml d = cwp.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   private static final dka e = djw.R;
   public static final djx c = djw.bw;
   private static final djx f = djw.C;

   @Override
   public MapCodec<cyp> a() {
      return a;
   }

   protected cyp(djf.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, ic.c).a(f, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, eer.c, eer.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public djg a(cpg $$0) {
      eeq $$1 = $$0.q().b_($$0.a());
      return this.o().a(e, $$0.g()).a(f, Boolean.valueOf($$1.a() == eer.c)).a(c, Boolean.valueOf(false));
   }

   @Override
   public bka a(djg $$0, cto $$1, hx $$2, cfh $$3, bjz $$4, elo $$5) {
      if ($$1.c_($$2) instanceof dhk $$6) {
         if ($$1.B) {
            return bka.b;
         } else {
            cmx $$8 = $$3.b($$4);
            cmx $$9 = $$6.x();
            if (!$$8.b() && ($$9.b() || cmx.c($$9, $$8) && $$9.L() < $$9.g())) {
               $$6.a(dhk.b.a);
               $$3.b(asb.c.b($$8.d()));
               cmx $$10 = $$3.f() ? $$8.c(1) : $$8.a(1);
               float $$11;
               if ($$6.ai_()) {
                  $$6.b($$10);
                  $$11 = (float)$$10.L() / (float)$$10.g();
               } else {
                  $$9.g(1);
                  $$11 = (float)$$9.L() / (float)$$9.g();
               }

               $$1.a(null, $$2, arr.fV, ars.e, 1.0F, 0.7F + 0.5F * $$11);
               if ($$1 instanceof and $$13) {
                  $$13.a(jx.aU, (double)$$2.u() + 0.5, (double)$$2.v() + 1.2, (double)$$2.w() + 0.5, 7, 0.0, 0.0, 0.0, 0.0);
               }

               $$1.c($$2, this);
            } else {
               $$1.a(null, $$2, arr.fW, ars.e, 1.0F, 1.0F);
               $$6.a(dhk.b.b);
            }

            $$1.a($$3, dnq.c, $$2);
            return bka.a;
         }
      } else {
         return bka.d;
      }
   }

   @Override
   public void a(cto $$0, hx $$1, djg $$2, @Nullable bmk $$3, cmx $$4) {
      if ($$0.B) {
         $$0.a($$1, dgw.O).ifPresent($$1x -> $$1x.a($$4));
      }
   }

   @Override
   public boolean a(djg $$0, csu $$1, hx $$2, efg $$3) {
      return false;
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      return d;
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(e, f, c);
   }

   @Nullable
   @Override
   public dgu a(hx $$0, djg $$1) {
      return new dhk($$0, $$1);
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, djg $$3, boolean $$4) {
      bjw.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public List<cmx> a(djg $$0, ehb.a $$1) {
      dgu $$2 = $$1.b(ejg.h);
      if ($$2 instanceof dhk $$3) {
         $$1.a(b, $$1x -> $$3.m().a().map(cms::am_).forEach($$1x));
      }

      return super.a($$0, $$1);
   }

   @Override
   public djg a(cto $$0, hx $$1, djg $$2, cfh $$3) {
      cmx $$4 = $$3.eT();
      djg $$5 = $$2;
      if ($$4.a(aso.aT) && !crk.f($$4)) {
         $$5 = $$2.a(c, Boolean.valueOf(true));
         $$0.a($$1, $$5, 4);
      }

      return super.a($$0, $$1, $$5, $$3);
   }

   @Override
   public eeq c_(djg $$0) {
      return $$0.c(f) ? eer.c.a(false) : super.c_($$0);
   }

   @Override
   public deb m(djg $$0) {
      return $$0.c(c) ? deb.bc : deb.bb;
   }

   @Override
   public void a(cmx $$0, @Nullable csu $$1, List<vf> $$2, cop $$3) {
      super.a($$0, $$1, $$2, $$3);
      dhk.a $$4 = dhk.a.b(ckq.a($$0));
      if (!$$4.equals(dhk.a.a)) {
         $$2.add(ve.a);
         Stream.of($$4.e(), $$4.c(), $$4.d(), $$4.b()).forEach($$1x -> $$2.add(new cmx($$1x, 1).y().e().a(n.h)));
      }
   }

   @Override
   public void a(cto $$0, djg $$1, elo $$2, cfz $$3) {
      hx $$4 = $$2.a();
      if (!$$0.B && $$3.a($$0, $$4) && $$3.b($$0)) {
         $$0.a($$4, $$1.a(c, Boolean.valueOf(true)), 4);
         $$0.a($$4, true, $$3);
      }
   }

   @Override
   public cmx a(ctr $$0, hx $$1, djg $$2) {
      return $$0.c_($$1) instanceof dhk $$3 ? $$3.w() : super.a($$0, $$1, $$2);
   }

   @Override
   public boolean d_(djg $$0) {
      return true;
   }

   @Override
   public int a(djg $$0, cto $$1, hx $$2) {
      return cia.a($$1.c_($$2));
   }
}
