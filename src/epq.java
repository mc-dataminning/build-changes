import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class epq extends epx {
   public static final MapCodec<epq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.b),
               epc.a.fieldOf("block_provider").forGetter($$0x -> $$0x.c),
               azg.b(jc.g.listOf()).fieldOf("directions").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, epq::new)
   );
   private final float b;
   private final epc c;
   private final List<jc> d;

   public epq(float $$0, epc $$1, List<jc> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public void a(epx.a $$0) {
      bai $$1 = $$0.b();

      for (iw $$2 : ag.a($$0.c(), $$1)) {
         jc $$3 = ag.a(this.d, $$1);
         iw $$4 = $$2.a($$3);
         if ($$1.i() <= this.b && $$0.a($$4)) {
            $$0.a($$4, this.c.a($$1, $$4));
         }
      }
   }

   @Override
   protected epy<?> a() {
      return epy.j;
   }
}
