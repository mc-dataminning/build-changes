import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class dtg extends dtk {
   public static final Codec<dtg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.b),
               Codec.intRange(0, 16).fieldOf("exclusion_radius_xz").forGetter($$0x -> $$0x.c),
               Codec.intRange(0, 16).fieldOf("exclusion_radius_y").forGetter($$0x -> $$0x.d),
               dst.a.fieldOf("block_provider").forGetter($$0x -> $$0x.e),
               Codec.intRange(1, 16).fieldOf("required_empty_blocks").forGetter($$0x -> $$0x.f),
               asg.a(hx.g.listOf()).fieldOf("directions").forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dtg::new)
   );
   protected final float b;
   protected final int c;
   protected final int d;
   protected final dst e;
   protected final int f;
   protected final List<hx> g;

   public dtg(float $$0, int $$1, int $$2, dst $$3, int $$4, List<hx> $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }

   @Override
   public void a(dtk.a $$0) {
      Set<ht> $$1 = new HashSet<>();
      ate $$2 = $$0.b();

      for (ht $$3 : ac.a($$0.d(), $$2)) {
         hx $$4 = ac.a(this.g, $$2);
         ht $$5 = $$3.a($$4);
         if (!$$1.contains($$5) && $$2.i() < this.b && this.a($$0, $$3, $$4)) {
            ht $$6 = $$5.b(-this.c, -this.d, -this.c);
            ht $$7 = $$5.b(this.c, this.d, this.c);

            for (ht $$8 : ht.a($$6, $$7)) {
               $$1.add($$8.i());
            }

            $$0.a($$5, this.e.a($$2, $$5));
         }
      }
   }

   private boolean a(dtk.a $$0, ht $$1, hx $$2) {
      for (int $$3 = 1; $$3 <= this.f; $$3++) {
         ht $$4 = $$1.a($$2, $$3);
         if (!$$0.a($$4)) {
            return false;
         }
      }

      return true;
   }

   @Override
   protected dtl<?> a() {
      return dtl.f;
   }
}
