import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class elo extends elu {
   public static final MapCodec<elo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.b),
               Codec.intRange(0, 16).fieldOf("exclusion_radius_xz").forGetter($$0x -> $$0x.c),
               Codec.intRange(0, 16).fieldOf("exclusion_radius_y").forGetter($$0x -> $$0x.d),
               elb.a.fieldOf("block_provider").forGetter($$0x -> $$0x.e),
               Codec.intRange(1, 16).fieldOf("required_empty_blocks").forGetter($$0x -> $$0x.f),
               azn.a(jm.g.listOf()).fieldOf("directions").forGetter($$0x -> $$0x.g)
            )
            .apply($$0, elo::new)
   );
   protected final float b;
   protected final int c;
   protected final int d;
   protected final elb e;
   protected final int f;
   protected final List<jm> g;

   public elo(float $$0, int $$1, int $$2, elb $$3, int $$4, List<jm> $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }

   @Override
   public void a(elu.a $$0) {
      Set<jh> $$1 = new HashSet<>();
      bam $$2 = $$0.b();

      for (jh $$3 : ae.a($$0.d(), $$2)) {
         jm $$4 = ae.a(this.g, $$2);
         jh $$5 = $$3.a($$4);
         if (!$$1.contains($$5) && $$2.i() < this.b && this.a($$0, $$3, $$4)) {
            jh $$6 = $$5.b(-this.c, -this.d, -this.c);
            jh $$7 = $$5.b(this.c, this.d, this.c);

            for (jh $$8 : jh.c($$6, $$7)) {
               $$1.add($$8.j());
            }

            $$0.a($$5, this.e.a($$2, $$5));
         }
      }
   }

   private boolean a(elu.a $$0, jh $$1, jm $$2) {
      for (int $$3 = 1; $$3 <= this.f; $$3++) {
         jh $$4 = $$1.a($$2, $$3);
         if (!$$0.a($$4)) {
            return false;
         }
      }

      return true;
   }

   @Override
   protected elv<?> a() {
      return elv.h;
   }
}
