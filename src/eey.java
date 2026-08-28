import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;
import java.util.function.BiConsumer;

public abstract class eey {
   public static final Codec<eey> d = lp.Y.q().dispatch(eey::a, eez::a);
   protected final bpx e;
   protected final efb f;
   protected final Optional<eev> g;

   protected static <P extends eey> P3<Mu<P>, bpx, efb, Optional<eev>> a(Instance<P> $$0) {
      return $$0.group(
         bpx.c.fieldOf("trunk_offset_y").forGetter($$0x -> $$0x.e),
         efb.a.fieldOf("root_provider").forGetter($$0x -> $$0x.f),
         eev.a.optionalFieldOf("above_root_placement").forGetter($$0x -> $$0x.g)
      );
   }

   public eey(bpx $$0, efb $$1, Optional<eev> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract eez<?> a();

   public abstract boolean a(dcc var1, BiConsumer<iz, dsa> var2, azf var3, iz var4, iz var5, edw var6);

   protected boolean a(dcc $$0, iz $$1) {
      return eci.c($$0, $$1);
   }

   protected void a(dcc $$0, BiConsumer<iz, dsa> $$1, azf $$2, iz $$3, edw $$4) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, this.a($$0, $$3, this.f.a($$2, $$3)));
         if (this.g.isPresent()) {
            eev $$5 = this.g.get();
            iz $$6 = $$3.c();
            if ($$2.i() < $$5.b() && $$0.a($$6, drz.a::i)) {
               $$1.accept($$6, this.a($$0, $$6, $$5.a().a($$2, $$6)));
            }
         }
      }
   }

   protected dsa a(dcc $$0, iz $$1, dsa $$2) {
      if ($$2.b(dsq.C)) {
         boolean $$3 = $$0.b($$1, $$0x -> $$0x.a(awu.a));
         return $$2.a(dsq.C, Boolean.valueOf($$3));
      } else {
         return $$2;
      }
   }

   public iz a(iz $$0, azf $$1) {
      return $$0.b(this.e.a($$1));
   }
}
