import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dbz extends cxh implements cxb {
   public static final MapCodec<dbz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ahg.a(ke.aw).fieldOf("feature").forGetter($$0x -> $$0x.d), u()).apply($$0, dbz::new)
   );
   protected static final float b = 3.0F;
   protected static final emv c = cwy.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final ahg<drp<?, ?>> d;

   @Override
   public MapCodec<dbz> a() {
      return a;
   }

   public dbz(ahg<drp<?, ?>> $$0, djo.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return c;
   }

   @Override
   public void b(djp $$0, ane $$1, hx $$2, auw $$3) {
      if ($$3.a(25) == 0) {
         int $$4 = 5;
         int $$5 = 4;

         for (hx $$6 : hx.a($$2.b(-4, -1, -4), $$2.b(4, 1, 4))) {
            if ($$1.a_($$6).a(this)) {
               if (--$$4 <= 0) {
                  return;
               }
            }
         }

         hx $$7 = $$2.b($$3.a(3) - 1, $$3.a(2) - $$3.a(2), $$3.a(3) - 1);

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
   protected boolean b(djp $$0, ctd $$1, hx $$2) {
      return $$0.i($$1, $$2);
   }

   @Override
   public boolean a(djp $$0, cua $$1, hx $$2) {
      hx $$3 = $$2.d();
      djp $$4 = $$1.a_($$3);
      return $$4.a(asi.aZ) ? true : $$1.b($$2, 0) < 13 && this.b($$4, $$1, $$3);
   }

   public boolean a(ane $$0, hx $$1, djp $$2, auw $$3) {
      Optional<? extends ih<drp<?, ?>>> $$4 = $$0.I_().d(ke.aw).b(this.d);
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
   public boolean b(cua $$0, hx $$1, djp $$2) {
      return true;
   }

   @Override
   public boolean a(ctx $$0, auw $$1, hx $$2, djp $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(ane $$0, auw $$1, hx $$2, djp $$3) {
      this.a($$0, $$2, $$3, $$1);
   }
}
