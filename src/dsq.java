import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class dsq extends dsu {
   public static final Codec<dsq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.b),
               Codec.intRange(0, 16).fieldOf("exclusion_radius_xz").forGetter($$0x -> $$0x.c),
               Codec.intRange(0, 16).fieldOf("exclusion_radius_y").forGetter($$0x -> $$0x.d),
               dsd.a.fieldOf("block_provider").forGetter($$0x -> $$0x.e),
               Codec.intRange(1, 16).fieldOf("required_empty_blocks").forGetter($$0x -> $$0x.f),
               arh.a(hc.g.listOf()).fieldOf("directions").forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dsq::new)
   );
   protected final float b;
   protected final int c;
   protected final int d;
   protected final dsd e;
   protected final int f;
   protected final List<hc> g;

   public dsq(float $$0, int $$1, int $$2, dsd $$3, int $$4, List<hc> $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }

   @Override
   public void a(dsu.a $$0) {
      Set<gw> $$1 = new HashSet<>();
      ase $$2 = $$0.b();

      for (gw $$3 : ac.a($$0.d(), $$2)) {
         hc $$4 = ac.a(this.g, $$2);
         gw $$5 = $$3.a($$4);
         if (!$$1.contains($$5) && $$2.i() < this.b && this.a($$0, $$3, $$4)) {
            gw $$6 = $$5.b(-this.c, -this.d, -this.c);
            gw $$7 = $$5.b(this.c, this.d, this.c);

            for (gw $$8 : gw.a($$6, $$7)) {
               $$1.add($$8.i());
            }

            $$0.a($$5, this.e.a($$2, $$5));
         }
      }
   }

   private boolean a(dsu.a $$0, gw $$1, hc $$2) {
      for (int $$3 = 1; $$3 <= this.f; $$3++) {
         gw $$4 = $$1.a($$2, $$3);
         if (!$$0.a($$4)) {
            return false;
         }
      }

      return true;
   }

   @Override
   protected dsv<?> a() {
      return dsv.f;
   }
}
