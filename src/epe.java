import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class epe extends epl {
   public static final MapCodec<epe> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.b),
               eoq.a.fieldOf("block_provider").forGetter($$0x -> $$0x.c),
               ayw.b(jb.g.listOf()).fieldOf("directions").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, epe::new)
   );
   private final float b;
   private final eoq c;
   private final List<jb> d;

   public epe(float $$0, eoq $$1, List<jb> $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public void a(epl.a $$0) {
      azx $$1 = $$0.b();

      for (iv $$2 : ag.a($$0.c(), $$1)) {
         jb $$3 = ag.a(this.d, $$1);
         iv $$4 = $$2.a($$3);
         if ($$1.i() <= this.b && $$0.a($$4)) {
            $$0.a($$4, this.c.a($$1, $$4));
         }
      }
   }

   @Override
   protected epm<?> a() {
      return epm.j;
   }
}
