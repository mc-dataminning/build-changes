import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.apache.commons.lang3.mutable.Mutable;
import org.apache.commons.lang3.mutable.MutableObject;

public class epj extends epl {
   public static final MapCodec<epj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("leaves_probability").forGetter($$0x -> $$0x.b),
               Codec.floatRange(0.0F, 1.0F).fieldOf("trunk_probability").forGetter($$0x -> $$0x.c),
               Codec.floatRange(0.0F, 1.0F).fieldOf("ground_probability").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, epj::new)
   );
   private final float b;
   private final float c;
   private final float d;

   @Override
   protected epm<?> a() {
      return epm.c;
   }

   public epj(float $$0, float $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public void a(epl.a $$0) {
      azx $$1 = $$0.b();
      dkw $$2 = (dkw)$$0.a();
      List<iv> $$3 = ag.a($$0.c(), $$1);
      if (!$$3.isEmpty()) {
         Mutable<iv> $$4 = new MutableObject($$3.getFirst());
         $$3.forEach($$1x -> {
            if ($$1x.v() < ((iv)$$4.getValue()).v()) {
               $$4.setValue($$1x);
            }
         });
         iv $$5 = (iv)$$4.getValue();
         if ($$1.i() < this.d) {
            $$2.J_().a(mh.aL).flatMap($$0x -> $$0x.a(ro.M)).ifPresent($$3x -> ((ejv)$$3x.a()).a($$2, $$2.a().m().g(), $$1, $$5.d()));
         }

         $$0.c().forEach($$2x -> {
            if ($$1.i() < this.c) {
               iv $$3x = $$2x.e();
               if ($$0.a($$3x)) {
                  a($$3x, $$0);
               }
            }
         });
         $$0.d().forEach($$2x -> {
            if ($$1.i() < this.b) {
               iv $$3x = $$2x.e();
               if ($$0.a($$3x)) {
                  a($$3x, $$0);
               }
            }
         });
      }
   }

   private static void a(iv $$0, epl.a $$1) {
      while ($$1.a($$0.e()) && !((double)$$1.b().i() < 0.5)) {
         $$1.a($$0, dne.ug.m().b(dqx.b, Boolean.valueOf(false)));
         $$0 = $$0.e();
      }

      $$1.a($$0, dne.ug.m().b(dqx.b, Boolean.valueOf(true)));
   }
}
