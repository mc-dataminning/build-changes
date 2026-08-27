import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dbe extends cwy implements ddy {
   public static final MapCodec<dbe> a = b(dbe::new);
   public static final dkg b = dkf.j;
   public static final dkg c = dkf.C;
   protected static final emv d = ems.a(cwy.a(5.0, 0.0, 5.0, 11.0, 7.0, 11.0), cwy.a(6.0, 7.0, 6.0, 10.0, 9.0, 10.0));
   protected static final emv e = ems.a(cwy.a(5.0, 1.0, 5.0, 11.0, 8.0, 11.0), cwy.a(6.0, 8.0, 6.0, 10.0, 10.0, 10.0));

   @Override
   public MapCodec<dbe> a() {
      return a;
   }

   public dbe(djo.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public djp a(cpp $$0) {
      eez $$1 = $$0.q().b_($$0.a());

      for (ic $$2 : $$0.f()) {
         if ($$2.o() == ic.a.b) {
            djp $$3 = this.o().a(b, Boolean.valueOf($$2 == ic.b));
            if ($$3.a((cua)$$0.q(), $$0.a())) {
               return $$3.a(c, Boolean.valueOf($$1.a() == efa.c));
            }
         }
      }

      return null;
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return $$0.c(b) ? e : d;
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(b, c);
   }

   @Override
   public boolean a(djp $$0, cua $$1, hx $$2) {
      ic $$3 = h($$0).g();
      return cwy.a($$1, $$2.a($$3), $$3.g());
   }

   protected static ic h(djp $$0) {
      return $$0.c(b) ? ic.a : ic.b;
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, efa.c, efa.c.a($$3));
      }

      return h($$0).g() == $$1 && !$$0.a($$3, $$4) ? cxa.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eez c_(djp $$0) {
      return $$0.c(c) ? efa.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(djp $$0, ctd $$1, hx $$2, efp $$3) {
      return false;
   }
}
