import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ddt extends czb implements cyv {
   public static final MapCodec<ddt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(aix.a(kg.aw).fieldOf("feature").forGetter($$0x -> $$0x.d), u()).apply($$0, ddt::new)
   );
   protected static final float b = 3.0F;
   protected static final eos c = cys.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final aix<dtm<?, ?>> d;

   @Override
   public MapCodec<ddt> a() {
      return a;
   }

   public ddt(aix<dtm<?, ?>> $$0, dli.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return c;
   }

   @Override
   protected void b(dlj $$0, aow $$1, hz $$2, awp $$3) {
      if ($$3.a(25) == 0) {
         int $$4 = 5;
         int $$5 = 4;

         for (hz $$6 : hz.a($$2.b(-4, -1, -4), $$2.b(4, 1, 4))) {
            if ($$1.a_($$6).a(this)) {
               if (--$$4 <= 0) {
                  return;
               }
            }
         }

         hz $$7 = $$2.b($$3.a(3) - 1, $$3.a(2) - $$3.a(2), $$3.a(3) - 1);

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
   protected boolean b(dlj $$0, cux $$1, hz $$2) {
      return $$0.i($$1, $$2);
   }

   @Override
   protected boolean a(dlj $$0, cvu $$1, hz $$2) {
      hz $$3 = $$2.d();
      dlj $$4 = $$1.a_($$3);
      return $$4.a(aua.aZ) ? true : $$1.b($$2, 0) < 13 && this.b($$4, $$1, $$3);
   }

   public boolean a(aow $$0, hz $$1, dlj $$2, awp $$3) {
      Optional<? extends ij<dtm<?, ?>>> $$4 = $$0.I_().d(kg.aw).b(this.d);
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
   public boolean b(cvu $$0, hz $$1, dlj $$2) {
      return true;
   }

   @Override
   public boolean a(cvr $$0, awp $$1, hz $$2, dlj $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(aow $$0, awp $$1, hz $$2, dlj $$3) {
      this.a($$0, $$2, $$3, $$1);
   }
}
