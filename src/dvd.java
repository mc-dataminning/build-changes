import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dvd extends dne {
   public static final MapCodec<dvd> a = b(dvd::new);
   public static final int b = 6;
   public static final int c = 64;
   private static final jc[] d = jc.values();

   @Override
   public MapCodec<dvd> a() {
      return a;
   }

   protected dvd(ebf.d $$0) {
      super($$0);
   }

   @Override
   protected void a(ebg $$0, djz $$1, iw $$2, ebg $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected void a(ebg $$0, djz $$1, iw $$2, dne $$3, @Nullable eyy $$4, boolean $$5) {
      this.a($$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   protected void a(djz $$0, iw $$1) {
      if (this.b($$0, $$1)) {
         $$0.a($$1, dng.aW.m(), 2);
         $$0.a(null, $$1, awr.Aa, aws.e, 1.0F, 1.0F);
      }
   }

   private boolean b(djz $$0, iw $$1) {
      return iw.a($$1, 6, 65, ($$0x, $$1x) -> {
         for (jc $$2 : d) {
            $$1x.accept($$0x.a($$2));
         }
      }, $$2 -> {
         if ($$2.equals($$1)) {
            return iw.b.a;
         } else {
            ebg $$3 = $$0.a_($$2);
            exq $$4 = $$0.b_($$2);
            if (!$$4.a(axl.a)) {
               return iw.b.b;
            } else {
               if ($$3.b() instanceof dnm $$6 && !$$6.a(null, $$0, $$2, $$3).f()) {
                  return iw.b.a;
               }

               if ($$3.b() instanceof dsa) {
                  $$0.a($$2, dng.a.m(), 3);
               } else {
                  if (!$$3.a(dng.mI) && !$$3.a(dng.mJ) && !$$3.a(dng.bG) && !$$3.a(dng.bH)) {
                     return iw.b.b;
                  }

                  dye $$7 = $$3.x() ? $$0.c_($$2) : null;
                  a($$3, $$0, $$2, $$7);
                  $$0.a($$2, dng.a.m(), 3);
               }

               return iw.b.a;
            }
         }
      }) > 1;
   }
}
