import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dhi extends dcq implements dck {
   public static final MapCodec<dhi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(aju.a(ku.az).fieldOf("feature").forGetter($$0x -> $$0x.d), u()).apply($$0, dhi::new)
   );
   protected static final float b = 3.0F;
   protected static final etc c = dch.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
   private final aju<dxr<?, ?>> d;

   @Override
   public MapCodec<dhi> a() {
      return a;
   }

   public dhi(aju<dxr<?, ?>> $$0, dph.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return c;
   }

   @Override
   protected void b(dpi $$0, apu $$1, id $$2, axt $$3) {
      if ($$3.a(25) == 0) {
         int $$4 = 5;
         int $$5 = 4;

         for (id $$6 : id.a($$2.b(-4, -1, -4), $$2.b(4, 1, 4))) {
            if ($$1.a_($$6).a(this)) {
               if (--$$4 <= 0) {
                  return;
               }
            }
         }

         id $$7 = $$2.b($$3.a(3) - 1, $$3.a(2) - $$3.a(2), $$3.a(3) - 1);

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
   protected boolean b(dpi $$0, cym $$1, id $$2) {
      return $$0.i($$1, $$2);
   }

   @Override
   protected boolean a(dpi $$0, czj $$1, id $$2) {
      id $$3 = $$2.d();
      dpi $$4 = $$1.a_($$3);
      return $$4.a(ave.ba) ? true : $$1.b($$2, 0) < 13 && this.b($$4, $$1, $$3);
   }

   public boolean a(apu $$0, id $$1, dpi $$2, axt $$3) {
      Optional<? extends in<dxr<?, ?>>> $$4 = $$0.H_().d(ku.az).b(this.d);
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
   public boolean b(czj $$0, id $$1, dpi $$2) {
      return true;
   }

   @Override
   public boolean a(czg $$0, axt $$1, id $$2, dpi $$3) {
      return (double)$$1.i() < 0.4;
   }

   @Override
   public void a(apu $$0, axt $$1, id $$2, dpi $$3) {
      this.a($$0, $$2, $$3, $$1);
   }
}
