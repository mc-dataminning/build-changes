import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dag extends cvo implements cvi {
   public static final MapCodec<dag> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(agl.a(kd.au).fieldOf("feature").forGetter($$0x -> $$0x.d), u()).apply($$0, dag::new)
   );
   protected static final float b = 3.0F;
   protected static final eks c = cvf.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final agl<dpn<?, ?>> d;

   @Override
   public MapCodec<dag> a() {
      return a;
   }

   public dag(agl<dpn<?, ?>> $$0, dhm.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   public eks a(dhn $$0, crl $$1, hx $$2, eke $$3) {
      return c;
   }

   @Override
   public void b(dhn $$0, ami $$1, hx $$2, atw $$3) {
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
            if ($$1.t($$7) && $$0.a($$1, $$7)) {
               $$2 = $$7;
            }

            $$7 = $$2.b($$3.a(3) - 1, $$3.a(2) - $$3.a(2), $$3.a(3) - 1);
         }

         if ($$1.t($$7) && $$0.a($$1, $$7)) {
            $$1.a($$7, $$0, 2);
         }
      }
   }

   @Override
   protected boolean b(dhn $$0, crl $$1, hx $$2) {
      return $$0.i($$1, $$2);
   }

   @Override
   public boolean a(dhn $$0, csi $$1, hx $$2) {
      hx $$3 = $$2.d();
      dhn $$4 = $$1.a_($$3);
      return $$4.a(ark.aZ) ? true : $$1.b($$2, 0) < 13 && this.b($$4, $$1, $$3);
   }

   public boolean a(ami $$0, hx $$1, dhn $$2, atw $$3) {
      Optional<? extends ig<dpn<?, ?>>> $$4 = $$0.I_().d(kd.au).b(this.d);
      if ($$4.isEmpty()) {
         return false;
      } else {
         $$0.a($$1, false);
         if ($$4.get().a().a($$0, $$0.k().g(), $$3, $$1)) {
            return true;
         } else {
            $$0.a($$1, $$2, 3);
            return false;
         }
      }
   }

   @Override
   public boolean b(csi $$0, hx $$1, dhn $$2) {
      return true;
   }

   @Override
   public boolean a(csf $$0, atw $$1, hx $$2, dhn $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(ami $$0, atw $$1, hx $$2, dhn $$3) {
      this.a($$0, $$2, $$3, $$1);
   }
}
