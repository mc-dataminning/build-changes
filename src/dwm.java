import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class dwm extends dwq {
   public static final Codec<dwm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("probability").forGetter($$0x -> $$0x.b),
               Codec.intRange(0, 16).fieldOf("exclusion_radius_xz").forGetter($$0x -> $$0x.c),
               Codec.intRange(0, 16).fieldOf("exclusion_radius_y").forGetter($$0x -> $$0x.d),
               dvz.a.fieldOf("block_provider").forGetter($$0x -> $$0x.e),
               Codec.intRange(1, 16).fieldOf("required_empty_blocks").forGetter($$0x -> $$0x.f),
               atw.a(ic.g.listOf()).fieldOf("directions").forGetter($$0x -> $$0x.g)
            )
            .apply($$0, dwm::new)
   );
   protected final float b;
   protected final int c;
   protected final int d;
   protected final dvz e;
   protected final int f;
   protected final List<ic> g;

   public dwm(float $$0, int $$1, int $$2, dvz $$3, int $$4, List<ic> $$5) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }

   @Override
   public void a(dwq.a $$0) {
      Set<hx> $$1 = new HashSet<>();
      auv $$2 = $$0.b();

      for (hx $$3 : ac.a($$0.d(), $$2)) {
         ic $$4 = ac.a(this.g, $$2);
         hx $$5 = $$3.a($$4);
         if (!$$1.contains($$5) && $$2.i() < this.b && this.a($$0, $$3, $$4)) {
            hx $$6 = $$5.b(-this.c, -this.d, -this.c);
            hx $$7 = $$5.b(this.c, this.d, this.c);

            for (hx $$8 : hx.a($$6, $$7)) {
               $$1.add($$8.i());
            }

            $$0.a($$5, this.e.a($$2, $$5));
         }
      }
   }

   private boolean a(dwq.a $$0, hx $$1, ic $$2) {
      for (int $$3 = 1; $$3 <= this.f; $$3++) {
         hx $$4 = $$1.a($$2, $$3);
         if (!$$0.a($$4)) {
            return false;
         }
      }

      return true;
   }

   @Override
   protected dwr<?> a() {
      return dwr.f;
   }
}
