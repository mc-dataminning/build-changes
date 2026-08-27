import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;
import java.util.function.BiConsumer;

public abstract class dyb {
   public static final Codec<dyb> d = kf.Y.q().dispatch(dyb::a, dyc::a);
   protected final blb e;
   protected final dye f;
   protected final Optional<dxy> g;

   protected static <P extends dyb> P3<Mu<P>, blb, dye, Optional<dxy>> a(Instance<P> $$0) {
      return $$0.group(
         blb.c.fieldOf("trunk_offset_y").forGetter($$0x -> $$0x.e),
         dye.a.fieldOf("root_provider").forGetter($$0x -> $$0x.f),
         dxy.a.optionalFieldOf("above_root_placement").forGetter($$0x -> $$0x.g)
      );
   }

   public dyb(blb $$0, dye $$1, Optional<dxy> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract dyc<?> a();

   public abstract boolean a(cvx var1, BiConsumer<hz, dlj> var2, awp var3, hz var4, hz var5, dwz var6);

   protected boolean a(cvx $$0, hz $$1) {
      return dvl.c($$0, $$1);
   }

   protected void a(cvx $$0, BiConsumer<hz, dlj> $$1, awp $$2, hz $$3, dwz $$4) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, this.a($$0, $$3, this.f.a($$2, $$3)));
         if (this.g.isPresent()) {
            dxy $$5 = this.g.get();
            hz $$6 = $$3.c();
            if ($$2.i() < $$5.b() && $$0.a($$6, dli.a::i)) {
               $$1.accept($$6, this.a($$0, $$6, $$5.a().a($$2, $$6)));
            }
         }
      }
   }

   protected dlj a(cvx $$0, hz $$1, dlj $$2) {
      if ($$2.b(dlz.C)) {
         boolean $$3 = $$0.b($$1, $$0x -> $$0x.a(auf.a));
         return $$2.a(dlz.C, Boolean.valueOf($$3));
      } else {
         return $$2;
      }
   }

   public hz a(hz $$0, awp $$1) {
      return $$0.b(this.e.a($$1));
   }
}
