import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dmo extends dhv implements dhp {
   public static final MapCodec<dmo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ald.a(lw.aK).fieldOf("feature").forGetter($$0x -> $$0x.d), t()).apply($$0, dmo::new)
   );
   protected static final float b = 3.0F;
   protected static final ezq c = dhm.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final ald<edg<?, ?>> d;

   @Override
   public MapCodec<dmo> a() {
      return a;
   }

   public dmo(ald<edg<?, ?>> $$0, dur.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return c;
   }

   @Override
   protected void b(dus $$0, arj $$1, jf $$2, azn $$3) {
      if ($$3.a(25) == 0) {
         int $$4 = 5;
         int $$5 = 4;

         for (jf $$6 : jf.c($$2.b(-4, -1, -4), $$2.b(4, 1, 4))) {
            if ($$1.a_($$6).a(this)) {
               if (--$$4 <= 0) {
                  return;
               }
            }
         }

         jf $$7 = $$2.b($$3.a(3) - 1, $$3.a(2) - $$3.a(2), $$3.a(3) - 1);

         for (int $$8 = 0; $$8 < 4; $$8++) {
            if ($$1.u($$7) && $$0.a($$1, $$7)) {
               $$2 = $$7;
            }

            $$7 = $$2.b($$3.a(3) - 1, $$3.a(2) - $$3.a(2), $$3.a(3) - 1);
         }

         if ($$1.u($$7) && $$0.a($$1, $$7)) {
            $$1.a($$7, $$0, 2);
         }
      }
   }

   @Override
   protected boolean b(dus $$0, ddo $$1, jf $$2) {
      return $$0.s();
   }

   @Override
   protected boolean a(dus $$0, dem $$1, jf $$2) {
      jf $$3 = $$2.e();
      dus $$4 = $$1.a_($$3);
      return $$4.a(awv.bb) ? true : $$1.b($$2, 0) < 13 && this.b($$4, $$1, $$3);
   }

   public boolean a(arj $$0, jf $$1, dus $$2, azn $$3) {
      Optional<? extends jo<edg<?, ?>>> $$4 = $$0.G_().e(lw.aK).a(this.d);
      if ($$4.isEmpty()) {
         return false;
      } else {
         $$0.a($$1, false);
         if ($$4.get().a().a($$0, $$0.l().g(), $$3, $$1)) {
            return true;
         } else {
            $$0.a($$1, $$2, 3);
            return false;
         }
      }
   }

   @Override
   public boolean b(dem $$0, jf $$1, dus $$2) {
      return true;
   }

   @Override
   public boolean a(dej $$0, azn $$1, jf $$2, dus $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(arj $$0, azn $$1, jf $$2, dus $$3) {
      this.a($$0, $$2, $$3, $$1);
   }
}
