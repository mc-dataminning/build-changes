import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dfb extends daj implements dad {
   public static final MapCodec<dfb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ajg.a(kj.ax).fieldOf("feature").forGetter($$0x -> $$0x.d), u()).apply($$0, dfb::new)
   );
   protected static final float b = 3.0F;
   protected static final eqk c = daa.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final ajg<dvd<?, ?>> d;

   @Override
   public MapCodec<dfb> a() {
      return a;
   }

   public dfb(ajg<dvd<?, ?>> $$0, dmy.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return c;
   }

   @Override
   protected void b(dmz $$0, apf $$1, ib $$2, axd $$3) {
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
   protected boolean b(dmz $$0, cwf $$1, ib $$2) {
      return $$0.i($$1, $$2);
   }

   @Override
   protected boolean a(dmz $$0, cxc $$1, ib $$2) {
      ib $$3 = $$2.d();
      dmz $$4 = $$1.a_($$3);
      return $$4.a(aun.ba) ? true : $$1.b($$2, 0) < 13 && this.b($$4, $$1, $$3);
   }

   public boolean a(apf $$0, ib $$1, dmz $$2, axd $$3) {
      Optional<? extends il<dvd<?, ?>>> $$4 = $$0.H_().d(kj.ax).b(this.d);
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
   public boolean b(cxc $$0, ib $$1, dmz $$2) {
      return true;
   }

   @Override
   public boolean a(cwz $$0, axd $$1, ib $$2, dmz $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(apf $$0, axd $$1, ib $$2, dmz $$3) {
      this.a($$0, $$2, $$3, $$1);
   }
}
