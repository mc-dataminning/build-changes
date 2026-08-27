import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;
import java.util.function.BiConsumer;

public abstract class dyw {
   public static final Codec<dyw> d = kh.Y.q().dispatch(dyw::a, dyx::a);
   protected final blq e;
   protected final dyz f;
   protected final Optional<dyt> g;

   protected static <P extends dyw> P3<Mu<P>, blq, dyz, Optional<dyt>> a(Instance<P> $$0) {
      return $$0.group(
         blq.c.fieldOf("trunk_offset_y").forGetter($$0x -> $$0x.e),
         dyz.a.fieldOf("root_provider").forGetter($$0x -> $$0x.f),
         dyt.a.optionalFieldOf("above_root_placement").forGetter($$0x -> $$0x.g)
      );
   }

   public dyw(blq $$0, dyz $$1, Optional<dyt> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract dyx<?> a();

   public abstract boolean a(cwk var1, BiConsumer<ib, dme> var2, awt var3, ib var4, ib var5, dxu var6);

   protected boolean a(cwk $$0, ib $$1) {
      return dwg.c($$0, $$1);
   }

   protected void a(cwk $$0, BiConsumer<ib, dme> $$1, awt $$2, ib $$3, dxu $$4) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, this.a($$0, $$3, this.f.a($$2, $$3)));
         if (this.g.isPresent()) {
            dyt $$5 = this.g.get();
            ib $$6 = $$3.c();
            if ($$2.i() < $$5.b() && $$0.a($$6, dmd.a::i)) {
               $$1.accept($$6, this.a($$0, $$6, $$5.a().a($$2, $$6)));
            }
         }
      }
   }

   protected dme a(cwk $$0, ib $$1, dme $$2) {
      if ($$2.b(dmu.C)) {
         boolean $$3 = $$0.b($$1, $$0x -> $$0x.a(auj.a));
         return $$2.a(dmu.C, Boolean.valueOf($$3));
      } else {
         return $$2;
      }
   }

   public ib a(ib $$0, awt $$1) {
      return $$0.b(this.e.a($$1));
   }
}
