import com.mojang.serialization.MapCodec;

public class dat extends czf {
   public static final MapCodec<dat> a = b(dat::new);
   public static final dmv b = dmu.w;
   public static final dmv c = dmu.r;

   @Override
   protected MapCodec<? extends dat> a() {
      return a;
   }

   public dat(dmd.d $$0) {
      super($$0);
      this.k(this.o().a(c, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)));
   }

   @Override
   protected void b(dme $$0, cwe $$1, ib $$2, dme $$3, boolean $$4) {
      if ($$3.b() != $$0.b() && $$1 instanceof apa $$5) {
         this.a($$0, $$5, $$2);
      }
   }

   @Override
   protected void a(dme $$0, cwe $$1, ib $$2, czf $$3, ib $$4, boolean $$5) {
      if ($$1 instanceof apa $$6) {
         this.a($$0, $$6, $$2);
      }
   }

   public void a(dme $$0, apa $$1, ib $$2) {
      boolean $$3 = $$1.C($$2);
      if ($$3 != $$0.c(b)) {
         dme $$4 = $$0;
         if (!$$0.c(b)) {
            $$4 = $$0.a(c);
            $$1.a(null, $$2, $$4.c(c) ? atp.ft : atp.fu, atq.e);
         }

         $$1.a($$2, $$4.a(b, Boolean.valueOf($$3)), 3);
      }
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(c, b);
   }

   @Override
   protected boolean d_(dme $$0) {
      return true;
   }

   @Override
   protected int a(dme $$0, cwe $$1, ib $$2) {
      return $$1.a_($$2).c(c) ? 15 : 0;
   }
}
