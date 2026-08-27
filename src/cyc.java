import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class cyc extends ctl implements ctf {
   public static final MapCodec<cyc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(aey.a(jc.at).fieldOf("feature").forGetter($$0x -> $$0x.d), t()).apply($$0, cyc::new)
   );
   protected static final float b = 3.0F;
   protected static final eia c = ctc.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final aey<dnd<?, ?>> d;

   @Override
   public MapCodec<cyc> a() {
      return a;
   }

   public cyc(aey<dnd<?, ?>> $$0, dfc.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return c;
   }

   @Override
   public void b(dfd $$0, akt $$1, gw $$2, ash $$3) {
      if ($$3.a(25) == 0) {
         int $$4 = 5;
         int $$5 = 4;

         for (gw $$6 : gw.a($$2.b(-4, -1, -4), $$2.b(4, 1, 4))) {
            if ($$1.a_($$6).a(this)) {
               if (--$$4 <= 0) {
                  return;
               }
            }
         }

         gw $$7 = $$2.b($$3.a(3) - 1, $$3.a(2) - $$3.a(2), $$3.a(3) - 1);

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
   protected boolean d(dfd $$0, cph $$1, gw $$2) {
      return $$0.i($$1, $$2);
   }

   @Override
   public boolean a(dfd $$0, cqe $$1, gw $$2) {
      gw $$3 = $$2.d();
      dfd $$4 = $$1.a_($$3);
      return $$4.a(apv.aZ) ? true : $$1.b($$2, 0) < 13 && this.d($$4, $$1, $$3);
   }

   public boolean a(akt $$0, gw $$1, dfd $$2, ash $$3) {
      Optional<? extends he<dnd<?, ?>>> $$4 = $$0.G_().d(jc.at).b(this.d);
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
   public boolean b(cqe $$0, gw $$1, dfd $$2) {
      return true;
   }

   @Override
   public boolean a(cqb $$0, ash $$1, gw $$2, dfd $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(akt $$0, ash $$1, gw $$2, dfd $$3) {
      this.a($$0, $$2, $$3, $$1);
   }
}
