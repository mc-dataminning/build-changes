import com.mojang.serialization.MapCodec;

public class dfm extends dcf {
   public static final MapCodec<dfm> b = b(dfm::new);
   public static final dns c = dnr.w;

   @Override
   public MapCodec<dfm> a() {
      return b;
   }

   public dfm(dna.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, ih.d).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(a, c);
   }

   @Override
   protected dnb a(dnb $$0, dgo $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dnb a(dnb $$0, dey $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dnb $$0, apf $$1, ib $$2, axd $$3) {
      if ($$0.c(c)) {
         $$1.a($$2, $$0.a(c, Boolean.valueOf(false)), 2);
      } else {
         $$1.a($$2, $$0.a(c, Boolean.valueOf(true)), 2);
         $$1.a($$2, this, 2);
      }

      this.a($$1, $$2, $$0);
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      if ($$0.c(a) == $$1 && !$$0.c(c)) {
         this.a($$3, $$4);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private void a(cxc $$0, ib $$1) {
      if (!$$0.x_() && !$$0.N().a($$1, this)) {
         $$0.a($$1, this, 2);
      }
   }

   protected void a(cxb $$0, ib $$1, dnb $$2) {
      ih $$3 = $$2.c(a);
      ib $$4 = $$1.a($$3.g());
      $$0.a($$4, this, $$1);
      $$0.a($$4, this, $$3);
   }

   @Override
   protected boolean f_(dnb $$0) {
      return true;
   }

   @Override
   protected int b(dnb $$0, cwh $$1, ib $$2, ih $$3) {
      return $$0.b($$1, $$2, $$3);
   }

   @Override
   protected int a(dnb $$0, cwh $$1, ib $$2, ih $$3) {
      return $$0.c(c) && $$0.c(a) == $$3 ? 15 : 0;
   }

   @Override
   protected void b(dnb $$0, cxb $$1, ib $$2, dnb $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (!$$1.x_() && $$0.c(c) && !$$1.N().a($$2, this)) {
            dnb $$5 = $$0.a(c, Boolean.valueOf(false));
            $$1.a($$2, $$5, 18);
            this.a($$1, $$2, $$5);
         }
      }
   }

   @Override
   protected void a(dnb $$0, cxb $$1, ib $$2, dnb $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (!$$1.B && $$0.c(c) && $$1.N().a($$2, this)) {
            this.a($$1, $$2, $$0.a(c, Boolean.valueOf(false)));
         }
      }
   }

   @Override
   public dnb a(csu $$0) {
      return this.o().a(a, $$0.d().g().g());
   }
}
