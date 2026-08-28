import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;
import java.util.function.BiConsumer;

public abstract class efg {
   public static final Codec<efg> d = lq.W.r().dispatch(efg::a, efh::a);
   protected final bpi e;
   protected final efj f;
   protected final Optional<efd> g;

   protected static <P extends efg> P3<Mu<P>, bpi, efj, Optional<efd>> a(Instance<P> $$0) {
      return $$0.group(
         bpi.c.fieldOf("trunk_offset_y").forGetter($$0x -> $$0x.e),
         efj.a.fieldOf("root_provider").forGetter($$0x -> $$0x.f),
         efd.a.optionalFieldOf("above_root_placement").forGetter($$0x -> $$0x.g)
      );
   }

   public efg(bpi $$0, efj $$1, Optional<efd> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract efh<?> a();

   public abstract boolean a(dcj var1, BiConsumer<ja, dsh> var2, aym var3, ja var4, ja var5, eee var6);

   protected boolean a(dcj $$0, ja $$1) {
      return ecq.c($$0, $$1);
   }

   protected void a(dcj $$0, BiConsumer<ja, dsh> $$1, aym $$2, ja $$3, eee $$4) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, this.a($$0, $$3, this.f.a($$2, $$3)));
         if (this.g.isPresent()) {
            efd $$5 = this.g.get();
            ja $$6 = $$3.c();
            if ($$2.i() < $$5.b() && $$0.a($$6, dsg.a::i)) {
               $$1.accept($$6, this.a($$0, $$6, $$5.a().a($$2, $$6)));
            }
         }
      }
   }

   protected dsh a(dcj $$0, ja $$1, dsh $$2) {
      if ($$2.b(dsx.C)) {
         boolean $$3 = $$0.b($$1, $$0x -> $$0x.a(awa.a));
         return $$2.a(dsx.C, Boolean.valueOf($$3));
      } else {
         return $$2;
      }
   }

   public ja a(ja $$0, aym $$1) {
      return $$0.b(this.e.a($$1));
   }
}
