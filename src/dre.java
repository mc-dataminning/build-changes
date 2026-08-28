import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dre extends djk {
   public static final MapCodec<dre> a = b(dre::new);
   public static final int b = 6;
   public static final int c = 64;
   private static final jn[] d = jn.values();

   @Override
   public MapCodec<dre> a() {
      return a;
   }

   protected dre(dwu.d $$0) {
      super($$0);
   }

   @Override
   protected void b(dwv $$0, dgg $$1, ji $$2, dwv $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected void a(dwv $$0, dgg $$1, ji $$2, djk $$3, @Nullable euf $$4, boolean $$5) {
      this.a($$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(dgg $$0, ji $$1) {
      if (this.b($$0, $$1)) {
         $$0.a($$1, djm.aW.m(), 2);
         $$0.a(null, $$1, avz.zK, awa.e, 1.0F, 1.0F);
      }
   }

   private boolean b(dgg $$0, ji $$1) {
      return ji.a($$1, 6, 65, ($$0x, $$1x) -> {
         for (jn $$2 : d) {
            $$1x.accept($$0x.a($$2));
         }
      }, $$2 -> {
         if ($$2.equals($$1)) {
            return ji.b.a;
         } else {
            dwv $$3 = $$0.a_($$2);
            esx $$4 = $$0.b_($$2);
            if (!$$4.a(awu.a)) {
               return ji.b.b;
            } else {
               if ($$3.b() instanceof djs $$6 && !$$6.a(null, $$0, $$2, $$3).f()) {
                  return ji.b.a;
               }

               if ($$3.b() instanceof doc) {
                  $$0.a($$2, djm.a.m(), 3);
               } else {
                  if (!$$3.a(djm.mE) && !$$3.a(djm.mF) && !$$3.a(djm.bD) && !$$3.a(djm.bE)) {
                     return ji.b.b;
                  }

                  dtx $$7 = $$3.x() ? $$0.c_($$2) : null;
                  a($$3, $$0, $$2, $$7);
                  $$0.a($$2, djm.a.m(), 3);
               }

               return ji.b.a;
            }
         }
      }) > 1;
   }
}
