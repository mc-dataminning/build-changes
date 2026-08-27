import com.mojang.serialization.MapCodec;

public abstract class dcb extends czf implements dca {
   public dcb(dmd.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dcb> a();

   @Override
   protected void b(dme $$0, cwe $$1, ib $$2, dme $$3, boolean $$4) {
      $$1.a($$2, this, this.b());
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      $$3.a($$4, this, this.b());
      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dme $$0, apa $$1, ib $$2, awt $$3) {
      if (m($$1.a_($$2.d())) && $$2.v() >= $$1.J_()) {
         cek $$4 = cek.a($$1, $$2, $$0);
         this.a($$4);
      }
   }

   protected void a(cek $$0) {
   }

   protected int b() {
      return 2;
   }

   public static boolean m(dme $$0) {
      return $$0.i() || $$0.a(aue.aJ) || $$0.k() || $$0.r();
   }

   @Override
   public void a(dme $$0, cwe $$1, ib $$2, awt $$3) {
      if ($$3.a(16) == 0) {
         ib $$4 = $$2.d();
         if (m($$1.a_($$4))) {
            awp.a($$1, $$2, $$3, new jt(kb.B, $$0));
         }
      }
   }

   public int b(dme $$0, cvk $$1, ib $$2) {
      return -16777216;
   }
}
