import com.mojang.serialization.MapCodec;

public class deo extends czf implements czi {
   public static final MapCodec<deo> a = b(deo::new);

   @Override
   public MapCodec<deo> a() {
      return a;
   }

   protected deo(dmd.d $$0) {
      super($$0);
   }

   private static boolean b(dme $$0, cwh $$1, ib $$2) {
      ib $$3 = $$2.c();
      dme $$4 = $$1.a_($$3);
      int $$5 = ehi.a($$1, $$0, $$2, $$4, $$3, ih.b, $$4.b($$1, $$3));
      return $$5 < $$1.O();
   }

   @Override
   protected void b(dme $$0, apa $$1, ib $$2, awt $$3) {
      if (!b($$0, $$1, $$2)) {
         $$1.b($$2, czh.dV.o());
      }
   }

   @Override
   public boolean b(cwh $$0, ib $$1, dme $$2) {
      return $$0.a_($$1.c()).i();
   }

   @Override
   public boolean a(cwe $$0, awt $$1, ib $$2, dme $$3) {
      return true;
   }

   @Override
   public void a(apa $$0, awt $$1, ib $$2, dme $$3) {
      dme $$4 = $$0.a_($$2);
      ib $$5 = $$2.c();
      dob $$6 = $$0.l().g();
      ix<duh<?, ?>> $$7 = $$0.I_().d(ki.ax);
      if ($$4.a(czh.ow)) {
         this.a($$7, qq.h, $$0, $$6, $$1, $$5);
      } else if ($$4.a(czh.on)) {
         this.a($$7, qq.j, $$0, $$6, $$1, $$5);
         this.a($$7, qq.l, $$0, $$6, $$1, $$5);
         if ($$1.a(8) == 0) {
            this.a($$7, qq.n, $$0, $$6, $$1, $$5);
         }
      }
   }

   private void a(ix<duh<?, ?>> $$0, ajb<duh<?, ?>> $$1, apa $$2, dob $$3, awt $$4, ib $$5) {
      $$0.b($$1).ifPresent($$4x -> ((duh)$$4x.a()).a($$2, $$3, $$4, $$5));
   }

   @Override
   public czi.a au_() {
      return czi.a.a;
   }
}
