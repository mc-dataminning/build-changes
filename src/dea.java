import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dea extends cwy implements ddy {
   public static final MapCodec<dea> a = b(dea::new);
   public static final dkn<dkx> b = dkf.bh;
   public static final dkg c = dkf.C;
   protected static final emv d = cwy.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   protected static final emv e = cwy.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0);

   @Override
   public MapCodec<? extends dea> a() {
      return a;
   }

   public dea(djo.d $$0) {
      super($$0);
      this.k(this.o().a(b, dkx.b).a(c, Boolean.valueOf(false)));
   }

   @Override
   public boolean g_(djp $$0) {
      return $$0.c(b) != dkx.c;
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(b, c);
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      dkx $$4 = $$0.c(b);
      switch ($$4) {
         case c:
            return ems.b();
         case a:
            return e;
         default:
            return d;
      }
   }

   @Nullable
   @Override
   public djp a(cpp $$0) {
      hx $$1 = $$0.a();
      djp $$2 = $$0.q().a_($$1);
      if ($$2.a(this)) {
         return $$2.a(b, dkx.c).a(c, Boolean.valueOf(false));
      } else {
         eez $$3 = $$0.q().b_($$1);
         djp $$4 = this.o().a(b, dkx.b).a(c, Boolean.valueOf($$3.a() == efa.c));
         ic $$5 = $$0.k();
         return $$5 != ic.a && ($$5 == ic.b || !($$0.l().d - (double)$$1.v() > 0.5)) ? $$4 : $$4.a(b, dkx.a);
      }
   }

   @Override
   public boolean a(djp $$0, cpp $$1) {
      cng $$2 = $$1.n();
      dkx $$3 = $$0.c(b);
      if ($$3 == dkx.c || !$$2.a(this.j())) {
         return false;
      } else if ($$1.c()) {
         boolean $$4 = $$1.l().d - (double)$$1.a().v() > 0.5;
         ic $$5 = $$1.k();
         return $$3 == dkx.b ? $$5 == ic.b || $$4 && $$5.o().d() : $$5 == ic.a || !$$4 && $$5.o().d();
      } else {
         return true;
      }
   }

   @Override
   public eez c_(djp $$0) {
      return $$0.c(c) ? efa.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(cty $$0, hx $$1, djp $$2, eez $$3) {
      return $$2.c(b) != dkx.c ? ddy.super.a($$0, $$1, $$2, $$3) : false;
   }

   @Override
   public boolean a(@Nullable cfq $$0, ctd $$1, hx $$2, djp $$3, eey $$4) {
      return $$3.c(b) != dkx.c ? ddy.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, efa.c, efa.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(djp $$0, ctd $$1, hx $$2, efp $$3) {
      switch ($$3) {
         case a:
            return false;
         case b:
            return $$1.b_($$2).a(asn.a);
         case c:
            return false;
         default:
            return false;
      }
   }
}
