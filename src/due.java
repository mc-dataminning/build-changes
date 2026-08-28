import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class due extends dmf {
   public static final MapCodec<due> a = b(due::new);
   public static final int b = 6;
   public static final int c = 64;
   private static final ja[] d = ja.values();

   @Override
   public MapCodec<due> a() {
      return a;
   }

   protected due(eag.d $$0) {
      super($$0);
   }

   @Override
   protected void a(eah $$0, dja $$1, iu $$2, eah $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected void a(eah $$0, dja $$1, iu $$2, dmf $$3, @Nullable exw $$4, boolean $$5) {
      this.a($$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(dja $$0, iu $$1) {
      if (this.b($$0, $$1)) {
         $$0.a($$1, dmh.aW.m(), 2);
         $$0.a(null, $$1, awn.Aa, awo.e, 1.0F, 1.0F);
      }
   }

   private boolean b(dja $$0, iu $$1) {
      return iu.a($$1, 6, 65, ($$0x, $$1x) -> {
         for (ja $$2 : d) {
            $$1x.accept($$0x.a($$2));
         }
      }, $$2 -> {
         if ($$2.equals($$1)) {
            return iu.b.a;
         } else {
            eah $$3 = $$0.a_($$2);
            ewo $$4 = $$0.b_($$2);
            if (!$$4.a(axh.a)) {
               return iu.b.b;
            } else {
               if ($$3.b() instanceof dmn $$6 && !$$6.a(null, $$0, $$2, $$3).f()) {
                  return iu.b.a;
               }

               if ($$3.b() instanceof drb) {
                  $$0.a($$2, dmh.a.m(), 3);
               } else {
                  if (!$$3.a(dmh.mI) && !$$3.a(dmh.mJ) && !$$3.a(dmh.bG) && !$$3.a(dmh.bH)) {
                     return iu.b.b;
                  }

                  dxf $$7 = $$3.x() ? $$0.c_($$2) : null;
                  a($$3, $$0, $$2, $$7);
                  $$0.a($$2, dmh.a.m(), 3);
               }

               return iu.b.a;
            }
         }
      }) > 1;
   }
}
