import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class epg extends epn {
   public static final MapCodec<epg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.b),
               eos.a.fieldOf("block_provider").forGetter($$0x -> $$0x.c),
               ayy.b(jc.g.listOf()).fieldOf("directions").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, epg::new)
   );
   private final float b;
   private final eos c;
   private final List<jc> d;

   public epg(float $$0, eos $$1, List<jc> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public void a(epn.a $$0) {
      azz $$1 = $$0.b();

      for (iw $$2 : ag.a($$0.c(), $$1)) {
         jc $$3 = ag.a(this.d, $$1);
         iw $$4 = $$2.a($$3);
         if ($$1.i() <= this.b && $$0.a($$4)) {
            $$0.a($$4, this.c.a($$1, $$4));
         }
      }
   }

   @Override
   protected epo<?> a() {
      return epo.j;
   }
}
