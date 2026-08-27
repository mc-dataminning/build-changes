import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class cyy extends cwk implements ddy {
   public static final MapCodec<cyy> a = b(cyy::new);
   public static final ahh b = new ahh("sherds");
   private static final emv d = cwy.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
   private static final dkj e = dkf.R;
   public static final dkg c = dkf.bw;
   private static final dkg f = dkf.C;

   @Override
   public MapCodec<cyy> a() {
      return a;
   }

   protected cyy(djo.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, ic.c).a(f, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      if ($$0.c(f)) {
         $$3.a($$4, efa.c, efa.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public djp a(cpp $$0) {
      eez $$1 = $$0.q().b_($$0.a());
      return this.o().a(e, $$0.g()).a(f, Boolean.valueOf($$1.a() == efa.c)).a(c, Boolean.valueOf(false));
   }

   @Override
   public bke a(cng $$0, djp $$1, ctx $$2, hx $$3, cfq $$4, bkb $$5, ely $$6) {
      if ($$2.c_($$3) instanceof dht $$7) {
         if ($$2.B) {
            return bke.b;
         } else {
            cng $$9 = $$7.x();
            if (!$$0.b() && ($$9.b() || cng.c($$9, $$0) && $$9.L() < $$9.g())) {
               $$7.a(dht.b.a);
               $$4.b(asd.c.b($$0.d()));
               cng $$10 = $$4.f() ? $$0.c(1) : $$0.a(1);
               float $$11;
               if ($$7.aj_()) {
                  $$7.b($$10);
                  $$11 = (float)$$10.L() / (float)$$10.g();
               } else {
                  $$9.g(1);
                  $$11 = (float)$$9.L() / (float)$$9.g();
               }

               $$2.a(null, $$3, art.gk, aru.e, 1.0F, 0.7F + 0.5F * $$11);
               if ($$2 instanceof ane $$13) {
                  $$13.a(jx.aU, (double)$$3.u() + 0.5, (double)$$3.v() + 1.2, (double)$$3.w() + 0.5, 7, 0.0, 0.0, 0.0, 0.0);
               }

               $$7.e();
               $$2.a($$4, dnz.c, $$3);
               return bke.e;
            } else {
               return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
            }
         }
      } else {
         return bke.e;
      }
   }

   @Override
   public bkc a(djp $$0, ctx $$1, hx $$2, cfq $$3, ely $$4) {
      if ($$1.c_($$2) instanceof dht $$5) {
         $$1.a(null, $$2, art.gl, aru.e, 1.0F, 1.0F);
         $$5.a(dht.b.b);
         $$1.a($$3, dnz.c, $$2);
         return bkc.a;
      } else {
         return bkc.d;
      }
   }

   @Override
   public void a(ctx $$0, hx $$1, djp $$2, @Nullable bmo $$3, cng $$4) {
      if ($$0.B) {
         $$0.a($$1, dhf.O).ifPresent($$1x -> $$1x.a($$4));
      }
   }

   @Override
   public boolean a(djp $$0, ctd $$1, hx $$2, efp $$3) {
      return false;
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return d;
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(e, f, c);
   }

   @Nullable
   @Override
   public dhd a(hx $$0, djp $$1) {
      return new dht($$0, $$1);
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, djp $$3, boolean $$4) {
      bjy.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public List<cng> a(djp $$0, ehl.a $$1) {
      dhd $$2 = $$1.b(ejq.h);
      if ($$2 instanceof dht $$3) {
         $$1.a(b, $$1x -> $$3.m().a().map(cnb::ao_).forEach($$1x));
      }

      return super.a($$0, $$1);
   }

   @Override
   public djp a(ctx $$0, hx $$1, djp $$2, cfq $$3) {
      cng $$4 = $$3.eT();
      djp $$5 = $$2;
      if ($$4.a(asq.aT) && !crt.f($$4)) {
         $$5 = $$2.a(c, Boolean.valueOf(true));
         $$0.a($$1, $$5, 4);
      }

      return super.a($$0, $$1, $$5, $$3);
   }

   @Override
   public eez c_(djp $$0) {
      return $$0.c(f) ? efa.c.a(false) : super.c_($$0);
   }

   @Override
   public dek m(djp $$0) {
      return $$0.c(c) ? dek.bc : dek.bb;
   }

   @Override
   public void a(cng $$0, @Nullable ctd $$1, List<vg> $$2, coy $$3) {
      super.a($$0, $$1, $$2, $$3);
      dht.a $$4 = dht.a.b(cla.a($$0));
      if (!$$4.equals(dht.a.a)) {
         $$2.add(vf.a);
         Stream.of($$4.e(), $$4.c(), $$4.d(), $$4.b()).forEach($$1x -> $$2.add(new cng($$1x, 1).y().e().a(n.h)));
      }
   }

   @Override
   public void a(ctx $$0, djp $$1, ely $$2, cgi $$3) {
      hx $$4 = $$2.a();
      if (!$$0.B && $$3.a($$0, $$4) && $$3.b($$0)) {
         $$0.a($$4, $$1.a(c, Boolean.valueOf(true)), 4);
         $$0.a($$4, true, $$3);
      }
   }

   @Override
   public cng a(cua $$0, hx $$1, djp $$2) {
      return $$0.c_($$1) instanceof dht $$3 ? $$3.w() : super.a($$0, $$1, $$2);
   }

   @Override
   public boolean d_(djp $$0) {
      return true;
   }

   @Override
   public int a(djp $$0, ctx $$1, hx $$2) {
      return cij.a($$1.c_($$2));
   }
}
