import com.mojang.serialization.Codec;

public class edk extends eef<egq> {
   public edk(Codec<egq> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eeh<egq> $$0) {
      jg $$1 = $$0.e();
      dfs $$2 = $$0.b();
      azr $$3 = $$0.d();
      if ($$2.u($$1) && !$$2.u($$1.d())) {
         jg.a $$4 = $$1.k();
         jg.a $$5 = $$1.k();
         boolean $$6 = true;
         boolean $$7 = true;
         boolean $$8 = true;
         boolean $$9 = true;

         while ($$2.u($$4)) {
            if ($$2.s($$4)) {
               return true;
            }

            $$2.a($$4, dia.dY.m(), 2);
            $$6 = $$6 && this.b($$2, $$3, $$5.a($$4, jl.c));
            $$7 = $$7 && this.b($$2, $$3, $$5.a($$4, jl.d));
            $$8 = $$8 && this.b($$2, $$3, $$5.a($$4, jl.e));
            $$9 = $$9 && this.b($$2, $$3, $$5.a($$4, jl.f));
            $$4.c(jl.a);
         }

         $$4.c(jl.b);
         this.a($$2, $$3, $$5.a($$4, jl.c));
         this.a($$2, $$3, $$5.a($$4, jl.d));
         this.a($$2, $$3, $$5.a($$4, jl.e));
         this.a($$2, $$3, $$5.a($$4, jl.f));
         $$4.c(jl.a);
         jg.a $$10 = new jg.a();

         for (int $$11 = -3; $$11 < 4; $$11++) {
            for (int $$12 = -3; $$12 < 4; $$12++) {
               int $$13 = azj.a($$11) * azj.a($$12);
               if ($$3.a(10) < 10 - $$13) {
                  $$10.g($$4.b($$11, 0, $$12));
                  int $$14 = 3;

                  while ($$2.u($$5.a($$10, jl.a))) {
                     $$10.c(jl.a);
                     if (--$$14 <= 0) {
                        break;
                     }
                  }

                  if (!$$2.u($$5.a($$10, jl.a))) {
                     $$2.a($$10, dia.dY.m(), 2);
                  }
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private void a(dew $$0, azr $$1, jg $$2) {
      if ($$1.h()) {
         $$0.a($$2, dia.dY.m(), 2);
      }
   }

   private boolean b(dew $$0, azr $$1, jg $$2) {
      if ($$1.a(10) != 0) {
         $$0.a($$2, dia.dY.m(), 2);
         return true;
      } else {
         return false;
      }
   }
}
