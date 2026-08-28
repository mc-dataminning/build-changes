import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dol extends dgv {
   public static final MapCodec<dol> a = b(dol::new);
   public static final int b = 6;
   public static final int c = 64;
   private static final jj[] d = jj.values();

   @Override
   public MapCodec<dol> a() {
      return a;
   }

   protected dol(dtz.d $$0) {
      super($$0);
   }

   @Override
   protected void b(dua $$0, dds $$1, je $$2, dua $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected void a(dua $$0, dds $$1, je $$2, dgv $$3, @Nullable erj $$4, boolean $$5) {
      this.a($$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(dds $$0, je $$1) {
      if (this.b($$0, $$1)) {
         $$0.a($$1, dgx.aP.o(), 2);
         $$0.a(null, $$1, awd.zc, awe.e, 1.0F, 1.0F);
      }
   }

   private boolean b(dds $$0, je $$1) {
      return je.a($$1, 6, 65, ($$0x, $$1x) -> {
         for (jj $$2 : d) {
            $$1x.accept($$0x.a($$2));
         }
      }, $$2 -> {
         if ($$2.equals($$1)) {
            return true;
         } else {
            dua $$3 = $$0.a_($$2);
            eqb $$4 = $$0.b_($$2);
            if (!$$4.a(awy.a)) {
               return false;
            } else {
               if ($$3.b() instanceof dhc $$6 && !$$6.a(null, $$0, $$2, $$3).f()) {
                  return true;
               }

               if ($$3.b() instanceof dll) {
                  $$0.a($$2, dgx.a.o(), 3);
               } else {
                  if (!$$3.a(dgx.mc) && !$$3.a(dgx.md) && !$$3.a(dgx.bw) && !$$3.a(dgx.bx)) {
                     return false;
                  }

                  dre $$7 = $$3.x() ? $$0.c_($$2) : null;
                  a($$3, $$0, $$2, $$7);
                  $$0.a($$2, dgx.a.o(), 3);
               }

               return true;
            }
         }
      }) > 1;
   }
}
