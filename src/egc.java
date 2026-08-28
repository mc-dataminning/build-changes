import com.mojang.serialization.Codec;

public class egc extends eew<ehk> {
   public egc(Codec<ehk> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eey<ehk> $$0) {
      boolean $$1 = false;
      azu $$2 = $$0.d();
      dgk $$3 = $$0.b();
      jh $$4 = $$0.e();
      ehk $$5 = $$0.f();
      int $$6 = $$2.a(8) - $$2.a(8);
      int $$7 = $$2.a(8) - $$2.a(8);
      int $$8 = $$3.a(ebq.a.d, $$4.u() + $$6, $$4.w() + $$7);
      jh $$9 = new jh($$4.u() + $$6, $$8, $$4.w() + $$7);
      if ($$3.a_($$9).a(dis.G)) {
         boolean $$10 = $$2.j() < (double)$$5.l;
         dvv $$11 = $$10 ? dis.bx.m() : dis.bw.m();
         if ($$11.a($$3, $$9)) {
            if ($$10) {
               dvv $$12 = $$11.b(dqw.d, dwq.a);
               jh $$13 = $$9.d();
               if ($$3.a_($$13).a(dis.G)) {
                  $$3.a($$9, $$11, 2);
                  $$3.a($$13, $$12, 2);
               }
            } else {
               $$3.a($$9, $$11, 2);
            }

            $$1 = true;
         }
      }

      return $$1;
   }
}
