import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dsx extends dxa implements dnr {
   public static final MapCodec<dsx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alq.a(mi.aL).fieldOf("feature").forGetter($$0x -> $$0x.c), t()).apply($$0, dsx::new)
   );
   private static final fgw b = dno.b(6.0, 0.0, 6.0);
   private final alq<ekh<?, ?>> c;

   @Override
   public MapCodec<dsx> a() {
      return a;
   }

   public dsx(alq<ekh<?, ?>> $$0, ebp.d $$1) {
      super($$1);
      this.c = $$0;
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return b;
   }

   @Override
   protected void b(ebq $$0, asb $$1, iw $$2, bai $$3) {
      if ($$3.a(25) == 0) {
         int $$4 = 5;
         int $$5 = 4;

         for (iw $$6 : iw.c($$2.b(-4, -1, -4), $$2.b(4, 1, 4))) {
            if ($$1.a_($$6).a(this)) {
               if (--$$4 <= 0) {
                  return;
               }
            }
         }

         iw $$7 = $$2.b($$3.a(3) - 1, $$3.a(2) - $$3.a(2), $$3.a(3) - 1);

         for (int $$8 = 0; $$8 < 4; $$8++) {
            if ($$1.v($$7) && $$0.a($$1, $$7)) {
               $$2 = $$7;
            }

            $$7 = $$2.b($$3.a(3) - 1, $$3.a(2) - $$3.a(2), $$3.a(3) - 1);
         }

         if ($$1.v($$7) && $$0.a($$1, $$7)) {
            $$1.a($$7, $$0, 2);
         }
      }
   }

   @Override
   protected boolean b(ebq $$0, djn $$1, iw $$2) {
      return $$0.s();
   }

   @Override
   protected boolean a(ebq $$0, dkm $$1, iw $$2) {
      iw $$3 = $$2.e();
      ebq $$4 = $$1.a_($$3);
      return $$4.a(axn.bc) ? true : $$1.b($$2, 0) < 13 && this.b($$4, $$1, $$3);
   }

   public boolean a(asb $$0, iw $$1, ebq $$2, bai $$3) {
      Optional<? extends jg<ekh<?, ?>>> $$4 = $$0.J_().f(mi.aL).a(this.c);
      if ($$4.isEmpty()) {
         return false;
      } else {
         $$0.a($$1, false);
         if ($$4.get().a().a($$0, $$0.m().g(), $$3, $$1)) {
            return true;
         } else {
            $$0.a($$1, $$2, 3);
            return false;
         }
      }
   }

   @Override
   public boolean a(dkm $$0, iw $$1, ebq $$2) {
      return true;
   }

   @Override
   public boolean a(dkj $$0, bai $$1, iw $$2, ebq $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(asb $$0, bai $$1, iw $$2, ebq $$3) {
      this.a($$0, $$2, $$3, $$1);
   }
}
