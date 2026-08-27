import javax.annotation.Nullable;

public class czg extends crz implements czn {
   public static final dfr a = dfq.F;
   public static final dfr b = dfq.C;
   public static final dfr c = dfq.G;
   protected static final ehx d = csm.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final double e = d.c(ha.a.b);

   public czg(dez.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(a);
      $$0.a(b);
      $$0.a(c);
   }

   @Override
   public void a(cpm $$0, gu $$1, dfa $$2, bii $$3) {
      if ($$0 instanceof akk $$4) {
         akl $$5 = dds.a($$3);
         if ($$5 != null) {
            $$4.a($$1, dco.L).ifPresent($$2x -> $$2x.a($$4, $$5));
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, dfa $$3, boolean $$4) {
      if ($$1 instanceof akk $$5 && $$0.c(a) && !$$0.a($$3.b())) {
         $$5.a($$2, dco.L).ifPresent($$1x -> $$1x.a($$5));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(dfa $$0, akk $$1, gu $$2, aru $$3) {
      if ($$0.c(a)) {
         $$1.a($$2, $$0.a(a, Boolean.valueOf(false)), 3);
         $$1.a($$2, dco.L).ifPresent($$1x -> $$1x.a($$1));
      }
   }

   @Override
   public cyr b_(dfa $$0) {
      return cyr.c;
   }

   @Override
   public ehx c(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return d;
   }

   @Override
   public ehx f(dfa $$0, cos $$1, gu $$2) {
      return d;
   }

   @Override
   public boolean g_(dfa $$0) {
      return true;
   }

   @Nullable
   @Override
   public dcm a(gu $$0, dfa $$1) {
      return new dds($$0, $$1);
   }

   @Override
   public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
      if ($$0.c(b)) {
         $$3.a($$4, eae.c, eae.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dfa a(clg $$0) {
      return this.n().a(b, Boolean.valueOf($$0.q().b_($$0.a()).a() == eae.c));
   }

   @Override
   public ead c_(dfa $$0) {
      return $$0.c(b) ? eae.c.a(false) : super.c_($$0);
   }

   @Override
   public void a(dfa $$0, akk $$1, gu $$2, ciy $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bfs.a(5));
      }
   }

   @Nullable
   @Override
   public <T extends dcm> dcn<T> a(cpm $$0, dfa $$1, dco<T> $$2) {
      return !$$0.B ? crz.a($$2, dco.L, ($$0x, $$1x, $$2x, $$3) -> djt.c.a($$0x, $$3.gb(), $$3.gc())) : null;
   }
}
