import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.apache.commons.lang3.mutable.Mutable;
import org.apache.commons.lang3.mutable.MutableObject;

public class elm extends eln {
   public static final MapCodec<elm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("leaves_probability").forGetter($$0x -> $$0x.b),
               Codec.floatRange(0.0F, 1.0F).fieldOf("trunk_probability").forGetter($$0x -> $$0x.c),
               Codec.floatRange(0.0F, 1.0F).fieldOf("ground_probability").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, elm::new)
   );
   private final float b;
   private final float c;
   private final float d;

   @Override
   protected elo<?> a() {
      return elo.c;
   }

   public elm(float $$0, float $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public void a(eln.a $$0) {
      bac $$1 = $$0.b();
      dhx $$2 = (dhx)$$0.a();
      List<jh> $$3 = ae.a($$0.c(), $$1);
      if (!$$3.isEmpty()) {
         Mutable<jh> $$4 = new MutableObject($$3.getFirst());
         $$3.forEach($$1x -> {
            if ($$1x.v() < ((jh)$$4.getValue()).v()) {
               $$4.setValue($$1x);
            }
         });
         jh $$5 = (jh)$$4.getValue();
         if ($$1.i() < this.d) {
            $$2.K_().a(mb.aL).flatMap($$0x -> $$0x.a(sh.F)).ifPresent($$3x -> ((egb)$$3x.a()).a($$2, $$2.a().m().g(), $$1, $$5.d()));
         }

         $$0.c().forEach($$2x -> {
            if ($$1.i() < this.c) {
               jh $$3x = $$2x.e();
               if ($$0.a($$3x)) {
                  a($$3x, $$0);
               }
            }
         });
         $$0.d().forEach($$2x -> {
            if ($$1.i() < this.b) {
               jh $$3x = $$2x.e();
               if ($$0.a($$3x)) {
                  a($$3x, $$0);
               }
            }
         });
      }
   }

   private static void a(jh $$0, eln.a $$1) {
      while ($$1.a($$0.e()) && !((double)$$1.b().i() < 0.5)) {
         $$1.a($$0, dkf.tY.m().b(dnv.b, Boolean.valueOf(false)));
         $$0 = $$0.e();
      }

      $$1.a($$0, dkf.tY.m().b(dnv.b, Boolean.valueOf(true)));
   }
}
