import javax.annotation.Nullable;

public class czf extends cry implements czm {
   public static final dfq a = dfp.F;
   public static final dfq b = dfp.C;
   public static final dfq c = dfp.G;
   protected static final ehw d = csl.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final double e = d.c(ha.a.b);

   public czf(dey.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(a);
      $$0.a(b);
      $$0.a(c);
   }

   @Override
   public void a(cpl $$0, gu $$1, dez $$2, bii $$3) {
      if ($$0 instanceof akk $$4) {
         akl $$5 = ddr.a($$3);
         if ($$5 != null) {
            $$4.a($$1, dcn.L).ifPresent($$2x -> $$2x.a($$4, $$5));
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, dez $$3, boolean $$4) {
      if ($$1 instanceof akk $$5 && $$0.c(a) && !$$0.a($$3.b())) {
         $$5.a($$2, dcn.L).ifPresent($$1x -> $$1x.a($$5));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(dez $$0, akk $$1, gu $$2, aru $$3) {
      if ($$0.c(a)) {
         $$1.a($$2, $$0.a(a, Boolean.valueOf(false)), 3);
         $$1.a($$2, dcn.L).ifPresent($$1x -> $$1x.a($$1));
      }
   }

   @Override
   public cyq b_(dez $$0) {
      return cyq.c;
   }

   @Override
   public ehw c(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return d;
   }

   @Override
   public ehw f(dez $$0, cor $$1, gu $$2) {
      return d;
   }

   @Override
   public boolean g_(dez $$0) {
      return true;
   }

   @Nullable
   @Override
   public dcl a(gu $$0, dez $$1) {
      return new ddr($$0, $$1);
   }

   @Override
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, ead.c, ead.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dez a(clf $$0) {
      return this.n().a(b, Boolean.valueOf($$0.q().b_($$0.a()).a() == ead.c));
   }

   @Override
   public eac c_(dez $$0) {
      return $$0.c(b) ? ead.c.a(false) : super.c_($$0);
   }

   @Override
   public void a(dez $$0, akk $$1, gu $$2, cix $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bfs.a(5));
      }
   }

   @Nullable
   @Override
   public <T extends dcl> dcm<T> a(cpl $$0, dez $$1, dcn<T> $$2) {
      return !$$0.B ? cry.a($$2, dcn.L, ($$0x, $$1x, $$2x, $$3) -> djs.c.a($$0x, $$3.gc(), $$3.gd())) : null;
   }
}
