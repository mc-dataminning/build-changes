import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;
import java.util.function.BiConsumer;

public abstract class efn {
   public static final Codec<efn> d = lq.W.r().dispatch(efn::a, efo::a);
   protected final bpm e;
   protected final efq f;
   protected final Optional<efk> g;

   protected static <P extends efn> P3<Mu<P>, bpm, efq, Optional<efk>> a(Instance<P> $$0) {
      return $$0.group(
         bpm.c.fieldOf("trunk_offset_y").forGetter($$0x -> $$0x.e),
         efq.a.fieldOf("root_provider").forGetter($$0x -> $$0x.f),
         efk.a.optionalFieldOf("above_root_placement").forGetter($$0x -> $$0x.g)
      );
   }

   public efn(bpm $$0, efq $$1, Optional<efk> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract efo<?> a();

   public abstract boolean a(dcm var1, BiConsumer<ja, dsl> var2, ayo var3, ja var4, ja var5, eel var6);

   protected boolean a(dcm $$0, ja $$1) {
      return ecx.c($$0, $$1);
   }

   protected void a(dcm $$0, BiConsumer<ja, dsl> $$1, ayo $$2, ja $$3, eel $$4) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, this.a($$0, $$3, this.f.a($$2, $$3)));
         if (this.g.isPresent()) {
            efk $$5 = this.g.get();
            ja $$6 = $$3.c();
            if ($$2.i() < $$5.b() && $$0.a($$6, dsk.a::i)) {
               $$1.accept($$6, this.a($$0, $$6, $$5.a().a($$2, $$6)));
            }
         }
      }
   }

   protected dsl a(dcm $$0, ja $$1, dsl $$2) {
      if ($$2.b(dtb.C)) {
         boolean $$3 = $$0.b($$1, $$0x -> $$0x.a(awc.a));
         return $$2.a(dtb.C, Boolean.valueOf($$3));
      } else {
         return $$2;
      }
   }

   public ja a(ja $$0, ayo $$1) {
      return $$0.b(this.e.a($$1));
   }
}
