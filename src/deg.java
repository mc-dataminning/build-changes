import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class deg extends czo implements czi {
   public static final MapCodec<deg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ajb.a(ki.ax).fieldOf("feature").forGetter($$0x -> $$0x.d), u()).apply($$0, deg::new)
   );
   protected static final float b = 3.0F;
   protected static final epo c = czf.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final ajb<duh<?, ?>> d;

   @Override
   public MapCodec<deg> a() {
      return a;
   }

   public deg(ajb<duh<?, ?>> $$0, dmd.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return c;
   }

   @Override
   protected void b(dme $$0, apa $$1, ib $$2, awt $$3) {
      if ($$3.a(25) == 0) {
         int $$4 = 5;
         int $$5 = 4;

         for (ib $$6 : ib.a($$2.b(-4, -1, -4), $$2.b(4, 1, 4))) {
            if ($$1.a_($$6).a(this)) {
               if (--$$4 <= 0) {
                  return;
               }
            }
         }

         ib $$7 = $$2.b($$3.a(3) - 1, $$3.a(2) - $$3.a(2), $$3.a(3) - 1);

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
   protected boolean b(dme $$0, cvk $$1, ib $$2) {
      return $$0.i($$1, $$2);
   }

   @Override
   protected boolean a(dme $$0, cwh $$1, ib $$2) {
      ib $$3 = $$2.d();
      dme $$4 = $$1.a_($$3);
      return $$4.a(aue.aZ) ? true : $$1.b($$2, 0) < 13 && this.b($$4, $$1, $$3);
   }

   public boolean a(apa $$0, ib $$1, dme $$2, awt $$3) {
      Optional<? extends il<duh<?, ?>>> $$4 = $$0.I_().d(ki.ax).b(this.d);
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
   public boolean b(cwh $$0, ib $$1, dme $$2) {
      return true;
   }

   @Override
   public boolean a(cwe $$0, awt $$1, ib $$2, dme $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(apa $$0, awt $$1, ib $$2, dme $$3) {
      this.a($$0, $$2, $$3, $$1);
   }
}
