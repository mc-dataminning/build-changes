import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dba extends cwi implements cwc {
   public static final MapCodec<dba> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ags.a(kc.av).fieldOf("feature").forGetter($$0x -> $$0x.d), u()).apply($$0, dba::new)
   );
   protected static final float b = 3.0F;
   protected static final elu c = cvz.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final ags<dqp<?, ?>> d;

   @Override
   public MapCodec<dba> a() {
      return a;
   }

   public dba(ags<dqp<?, ?>> $$0, dio.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return c;
   }

   @Override
   public void b(dip $$0, amp $$1, hv $$2, auf $$3) {
      if ($$3.a(25) == 0) {
         int $$4 = 5;
         int $$5 = 4;

         for (hv $$6 : hv.a($$2.b(-4, -1, -4), $$2.b(4, 1, 4))) {
            if ($$1.a_($$6).a(this)) {
               if (--$$4 <= 0) {
                  return;
               }
            }
         }

         hv $$7 = $$2.b($$3.a(3) - 1, $$3.a(2) - $$3.a(2), $$3.a(3) - 1);

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
   protected boolean b(dip $$0, cse $$1, hv $$2) {
      return $$0.i($$1, $$2);
   }

   @Override
   public boolean a(dip $$0, ctb $$1, hv $$2) {
      hv $$3 = $$2.d();
      dip $$4 = $$1.a_($$3);
      return $$4.a(arr.aZ) ? true : $$1.b($$2, 0) < 13 && this.b($$4, $$1, $$3);
   }

   public boolean a(amp $$0, hv $$1, dip $$2, auf $$3) {
      Optional<? extends ie<dqp<?, ?>>> $$4 = $$0.I_().d(kc.av).b(this.d);
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
   public boolean b(ctb $$0, hv $$1, dip $$2) {
      return true;
   }

   @Override
   public boolean a(csy $$0, auf $$1, hv $$2, dip $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(amp $$0, auf $$1, hv $$2, dip $$3) {
      this.a($$0, $$2, $$3, $$1);
   }
}
