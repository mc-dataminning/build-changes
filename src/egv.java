import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class egv extends egz {
   public static final MapCodec<egv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.b),
               Codec.intRange(0, 16).fieldOf("exclusion_radius_xz").forGetter($$0x -> $$0x.c),
               Codec.intRange(0, 16).fieldOf("exclusion_radius_y").forGetter($$0x -> $$0x.d),
               egi.a.fieldOf("block_provider").forGetter($$0x -> $$0x.e),
               Codec.intRange(1, 16).fieldOf("required_empty_blocks").forGetter($$0x -> $$0x.f),
               axw.a(ji.g.listOf()).fieldOf("directions").forGetter($$0x -> $$0x.g)
            )
            .apply($$0, egv::new)
   );
   protected final float b;
   protected final int c;
   protected final int d;
   protected final egi e;
   protected final int f;
   protected final List<ji> g;

   public egv(float $$0, int $$1, int $$2, egi $$3, int $$4, List<ji> $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }

   @Override
   public void a(egz.a $$0) {
      Set<jd> $$1 = new HashSet<>();
      ayw $$2 = $$0.b();

      for (jd $$3 : ad.a($$0.d(), $$2)) {
         ji $$4 = ad.a(this.g, $$2);
         jd $$5 = $$3.a($$4);
         if (!$$1.contains($$5) && $$2.i() < this.b && this.a($$0, $$3, $$4)) {
            jd $$6 = $$5.b(-this.c, -this.d, -this.c);
            jd $$7 = $$5.b(this.c, this.d, this.c);

            for (jd $$8 : jd.c($$6, $$7)) {
               $$1.add($$8.j());
            }

            $$0.a($$5, this.e.a($$2, $$5));
         }
      }
   }

   private boolean a(egz.a $$0, jd $$1, ji $$2) {
      for (int $$3 = 1; $$3 <= this.f; $$3++) {
         jd $$4 = $$1.a($$2, $$3);
         if (!$$0.a($$4)) {
            return false;
         }
      }

      return true;
   }

   @Override
   protected eha<?> a() {
      return eha.f;
   }
}
