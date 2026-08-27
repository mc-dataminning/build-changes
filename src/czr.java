import javax.annotation.Nullable;

public class czr extends csk implements czy {
   public static final dgc a = dgb.F;
   public static final dgc b = dgb.C;
   public static final dgc c = dgb.G;
   protected static final eii d = csx.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final double e = d.c(hc.a.b);

   public czr(dfk.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(a);
      $$0.a(b);
      $$0.a(c);
   }

   @Override
   public void a(cpx $$0, gw $$1, dfl $$2, bis $$3) {
      if ($$0 instanceof aks $$4) {
         akt $$5 = ded.a($$3);
         if ($$5 != null) {
            $$4.a($$1, dcz.L).ifPresent($$2x -> $$2x.a($$4, $$5));
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, dfl $$3, boolean $$4) {
      if ($$1 instanceof aks $$5 && $$0.c(a) && !$$0.a($$3.b())) {
         $$5.a($$2, dcz.L).ifPresent($$1x -> $$1x.a($$5));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(dfl $$0, aks $$1, gw $$2, ase $$3) {
      if ($$0.c(a)) {
         $$1.a($$2, $$0.a(a, Boolean.valueOf(false)), 3);
         $$1.a($$2, dcz.L).ifPresent($$1x -> $$1x.a($$1));
      }
   }

   @Override
   public czc b_(dfl $$0) {
      return czc.c;
   }

   @Override
   public eii c(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return d;
   }

   @Override
   public eii f(dfl $$0, cpd $$1, gw $$2) {
      return d;
   }

   @Override
   public boolean g_(dfl $$0) {
      return true;
   }

   @Nullable
   @Override
   public dcx a(gw $$0, dfl $$1) {
      return new ded($$0, $$1);
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, eap.c, eap.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dfl a(clp $$0) {
      return this.n().a(b, Boolean.valueOf($$0.q().b_($$0.a()).a() == eap.c));
   }

   @Override
   public eao c_(dfl $$0) {
      return $$0.c(b) ? eap.c.a(false) : super.c_($$0);
   }

   @Override
   public void a(dfl $$0, aks $$1, gw $$2, cjh $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bgc.a(5));
      }
   }

   @Nullable
   @Override
   public <T extends dcx> dcy<T> a(cpx $$0, dfl $$1, dcz<T> $$2) {
      return !$$0.B ? csk.a($$2, dcz.L, ($$0x, $$1x, $$2x, $$3) -> dke.c.a($$0x, $$3.gf(), $$3.gg())) : null;
   }
}
