import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;
import java.util.function.BiConsumer;

public abstract class efc {
   public static final Codec<efc> d = lp.Y.q().dispatch(efc::a, efd::a);
   protected final bqb e;
   protected final eff f;
   protected final Optional<eez> g;

   protected static <P extends efc> P3<Mu<P>, bqb, eff, Optional<eez>> a(Instance<P> $$0) {
      return $$0.group(
         bqb.c.fieldOf("trunk_offset_y").forGetter($$0x -> $$0x.e),
         eff.a.fieldOf("root_provider").forGetter($$0x -> $$0x.f),
         eez.a.optionalFieldOf("above_root_placement").forGetter($$0x -> $$0x.g)
      );
   }

   public efc(bqb $$0, eff $$1, Optional<eez> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract efd<?> a();

   public abstract boolean a(dcg var1, BiConsumer<iz, dse> var2, azh var3, iz var4, iz var5, eea var6);

   protected boolean a(dcg $$0, iz $$1) {
      return ecm.c($$0, $$1);
   }

   protected void a(dcg $$0, BiConsumer<iz, dse> $$1, azh $$2, iz $$3, eea $$4) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, this.a($$0, $$3, this.f.a($$2, $$3)));
         if (this.g.isPresent()) {
            eez $$5 = this.g.get();
            iz $$6 = $$3.c();
            if ($$2.i() < $$5.b() && $$0.a($$6, dsd.a::i)) {
               $$1.accept($$6, this.a($$0, $$6, $$5.a().a($$2, $$6)));
            }
         }
      }
   }

   protected dse a(dcg $$0, iz $$1, dse $$2) {
      if ($$2.b(dsu.C)) {
         boolean $$3 = $$0.b($$1, $$0x -> $$0x.a(awv.a));
         return $$2.a(dsu.C, Boolean.valueOf($$3));
      } else {
         return $$2;
      }
   }

   public iz a(iz $$0, azh $$1) {
      return $$0.b(this.e.a($$1));
   }
}
