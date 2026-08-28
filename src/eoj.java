import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import org.apache.commons.lang3.mutable.Mutable;
import org.apache.commons.lang3.mutable.MutableObject;

public class eoj extends eol {
   public static final MapCodec<eoj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("leaves_probability").forGetter($$0x -> $$0x.b),
               Codec.floatRange(0.0F, 1.0F).fieldOf("trunk_probability").forGetter($$0x -> $$0x.c),
               Codec.floatRange(0.0F, 1.0F).fieldOf("ground_probability").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, eoj::new)
   );
   private final float b;
   private final float c;
   private final float d;

   @Override
   protected eom<?> a() {
      return eom.c;
   }

   public eoj(float $$0, float $$1, float $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public void a(eol.a $$0) {
      azv $$1 = $$0.b();
      djz $$2 = (djz)$$0.a();
      List<iu> $$3 = af.a($$0.c(), $$1);
      if (!$$3.isEmpty()) {
         Mutable<iu> $$4 = new MutableObject($$3.getFirst());
         $$3.forEach($$1x -> {
            if ($$1x.v() < ((iu)$$4.getValue()).v()) {
               $$4.setValue($$1x);
            }
         });
         iu $$5 = (iu)$$4.getValue();
         if ($$1.i() < this.d) {
            $$2.F_().a(mg.aL).flatMap($$0x -> $$0x.a(ro.O)).ifPresent($$3x -> ((eiy)$$3x.a()).a($$2, $$2.a().m().g(), $$1, $$5.d()));
         }

         $$0.c().forEach($$2x -> {
            if ($$1.i() < this.c) {
               iu $$3x = $$2x.e();
               if ($$0.a($$3x)) {
                  a($$3x, $$0);
               }
            }
         });
         $$0.d().forEach($$2x -> {
            if ($$1.i() < this.b) {
               iu $$3x = $$2x.e();
               if ($$0.a($$3x)) {
                  a($$3x, $$0);
               }
            }
         });
      }
   }

   private static void a(iu $$0, eol.a $$1) {
      while ($$1.a($$0.e()) && !((double)$$1.b().i() < 0.5)) {
         $$1.a($$0, dmh.ug.m().b(dqa.b, Boolean.valueOf(false)));
         $$0 = $$0.e();
      }

      $$1.a($$0, dmh.ug.m().b(dqa.b, Boolean.valueOf(true)));
   }
}
