import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dky extends dgf implements dfz {
   public static final MapCodec<dky> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akp.a(lu.aI).fieldOf("feature").forGetter($$0x -> $$0x.d), u()).apply($$0, dky::new)
   );
   protected static final float b = 3.0F;
   protected static final exp c = dfw.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final akp<ebn<?, ?>> d;

   @Override
   public MapCodec<dky> a() {
      return a;
   }

   public dky(akp<ebn<?, ?>> $$0, dsz.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      return c;
   }

   @Override
   protected void b(dta $$0, aqt $$1, jd $$2, ayv $$3) {
      if ($$3.a(25) == 0) {
         int $$4 = 5;
         int $$5 = 4;

         for (jd $$6 : jd.c($$2.b(-4, -1, -4), $$2.b(4, 1, 4))) {
            if ($$1.a_($$6).a(this)) {
               if (--$$4 <= 0) {
                  return;
               }
            }
         }

         jd $$7 = $$2.b($$3.a(3) - 1, $$3.a(2) - $$3.a(2), $$3.a(3) - 1);

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
   protected boolean b(dta $$0, dca $$1, jd $$2) {
      return $$0.i($$1, $$2);
   }

   @Override
   protected boolean a(dta $$0, dcx $$1, jd $$2) {
      jd $$3 = $$2.d();
      dta $$4 = $$1.a_($$3);
      return $$4.a(awd.ba) ? true : $$1.b($$2, 0) < 13 && this.b($$4, $$1, $$3);
   }

   public boolean a(aqt $$0, jd $$1, dta $$2, ayv $$3) {
      Optional<? extends jm<ebn<?, ?>>> $$4 = $$0.H_().d(lu.aI).b(this.d);
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
   public boolean b(dcx $$0, jd $$1, dta $$2) {
      return true;
   }

   @Override
   public boolean a(dcu $$0, ayv $$1, jd $$2, dta $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(aqt $$0, ayv $$1, jd $$2, dta $$3) {
      this.a($$0, $$2, $$3, $$1);
   }
}
