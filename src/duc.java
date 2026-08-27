import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;
import java.util.function.BiConsumer;

public abstract class duc {
   public static final Codec<duc> d = kc.Z.q().dispatch(duc::a, dud::a);
   protected final big e;
   protected final duf f;
   protected final Optional<dtz> g;

   protected static <P extends duc> P3<Mu<P>, big, duf, Optional<dtz>> a(Instance<P> $$0) {
      return $$0.group(
         big.c.fieldOf("trunk_offset_y").forGetter($$0x -> $$0x.e),
         duf.a.fieldOf("root_provider").forGetter($$0x -> $$0x.f),
         dtz.a.optionalFieldOf("above_root_placement").forGetter($$0x -> $$0x.g)
      );
   }

   public duc(big $$0, duf $$1, Optional<dtz> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract dud<?> a();

   public abstract boolean a(csl var1, BiConsumer<hx, dhn> var2, atw var3, hx var4, hx var5, dta var6);

   protected boolean a(csl $$0, hx $$1) {
      return drm.c($$0, $$1);
   }

   protected void a(csl $$0, BiConsumer<hx, dhn> $$1, atw $$2, hx $$3, dta $$4) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, this.a($$0, $$3, this.f.a($$2, $$3)));
         if (this.g.isPresent()) {
            dtz $$5 = this.g.get();
            hx $$6 = $$3.c();
            if ($$2.i() < $$5.b() && $$0.a($$6, dhm.a::i)) {
               $$1.accept($$6, this.a($$0, $$6, $$5.a().a($$2, $$6)));
            }
         }
      }
   }

   protected dhn a(csl $$0, hx $$1, dhn $$2) {
      if ($$2.b(did.C)) {
         boolean $$3 = $$0.b($$1, $$0x -> $$0x.a(arp.a));
         return $$2.a(did.C, Boolean.valueOf($$3));
      } else {
         return $$2;
      }
   }

   public hx a(hx $$0, atw $$1) {
      return $$0.b(this.e.a($$1));
   }
}
