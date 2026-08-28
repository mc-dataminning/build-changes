import com.mojang.serialization.MapCodec;

public class dox extends djm implements djp {
   public static final MapCodec<dox> a = b(dox::new);

   @Override
   public MapCodec<dox> a() {
      return a;
   }

   public dox(dww.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(dgl $$0, ji $$1, dwx $$2) {
      if (!$$0.a_($$1.d()).f()) {
         return false;
      } else {
         for (ji $$3 : ji.c($$1.b(-1, -1, -1), $$1.b(1, 1, 1))) {
            if ($$0.a_($$3).a(awp.aO)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean a(dgi $$0, azh $$1, ji $$2, dwx $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dwx $$3) {
      boolean $$4 = false;
      boolean $$5 = false;

      for (ji $$6 : ji.c($$2.b(-1, -1, -1), $$2.b(1, 1, 1))) {
         dwx $$7 = $$0.a_($$6);
         if ($$7.a(djo.oP)) {
            $$5 = true;
         }

         if ($$7.a(djo.oY)) {
            $$4 = true;
         }

         if ($$5 && $$4) {
            break;
         }
      }

      if ($$5 && $$4) {
         $$0.a($$2, $$1.h() ? djo.oP.m() : djo.oY.m(), 3);
      } else if ($$5) {
         $$0.a($$2, djo.oP.m(), 3);
      } else if ($$4) {
         $$0.a($$2, djo.oY.m(), 3);
      }
   }

   @Override
   public djp.a aq_() {
      return djp.a.a;
   }
}
