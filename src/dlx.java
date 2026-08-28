import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dlx extends dhe implements dgy {
   public static final MapCodec<dlx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ala.a(lv.aI).fieldOf("feature").forGetter($$0x -> $$0x.d), u()).apply($$0, dlx::new)
   );
   protected static final float b = 3.0F;
   protected static final eyx c = dgv.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final ala<eco<?, ?>> d;

   @Override
   public MapCodec<dlx> a() {
      return a;
   }

   public dlx(ala<eco<?, ?>> $$0, dtz.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return c;
   }

   @Override
   protected void b(dua $$0, arg $$1, je $$2, azk $$3) {
      if ($$3.a(25) == 0) {
         int $$4 = 5;
         int $$5 = 4;

         for (je $$6 : je.c($$2.b(-4, -1, -4), $$2.b(4, 1, 4))) {
            if ($$1.a_($$6).a(this)) {
               if (--$$4 <= 0) {
                  return;
               }
            }
         }

         je $$7 = $$2.b($$3.a(3) - 1, $$3.a(2) - $$3.a(2), $$3.a(3) - 1);

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
   protected boolean b(dua $$0, dcx $$1, je $$2) {
      return $$0.s();
   }

   @Override
   protected boolean a(dua $$0, ddv $$1, je $$2) {
      je $$3 = $$2.e();
      dua $$4 = $$1.a_($$3);
      return $$4.a(aws.bb) ? true : $$1.b($$2, 0) < 13 && this.b($$4, $$1, $$3);
   }

   public boolean a(arg $$0, je $$1, dua $$2, azk $$3) {
      Optional<? extends jn<eco<?, ?>>> $$4 = $$0.F_().d(lv.aI).b(this.d);
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
   public boolean b(ddv $$0, je $$1, dua $$2) {
      return true;
   }

   @Override
   public boolean a(dds $$0, azk $$1, je $$2, dua $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(arg $$0, azk $$1, je $$2, dua $$3) {
      this.a($$0, $$2, $$3, $$1);
   }
}
