import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;
import java.util.function.BiConsumer;

public abstract class ekb {
   public static final Codec<ekb> d = mb.W.q().dispatch(ekb::a, ekc::a);
   protected final brq e;
   protected final eke f;
   protected final Optional<ejy> g;

   protected static <P extends ekb> P3<Mu<P>, brq, eke, Optional<ejy>> a(Instance<P> $$0) {
      return $$0.group(
         brq.c.fieldOf("trunk_offset_y").forGetter($$0x -> $$0x.e),
         eke.a.fieldOf("root_provider").forGetter($$0x -> $$0x.f),
         ejy.a.optionalFieldOf("above_root_placement").forGetter($$0x -> $$0x.g)
      );
   }

   public ekb(brq $$0, eke $$1, Optional<ejy> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract ekc<?> a();

   public abstract boolean a(dgp var1, BiConsumer<ji, dwy> var2, azh var3, ji var4, ji var5, eiz var6);

   protected boolean a(dgp $$0, ji $$1) {
      return ehl.c($$0, $$1);
   }

   protected void a(dgp $$0, BiConsumer<ji, dwy> $$1, azh $$2, ji $$3, eiz $$4) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, this.a($$0, $$3, this.f.a($$2, $$3)));
         if (this.g.isPresent()) {
            ejy $$5 = this.g.get();
            ji $$6 = $$3.d();
            if ($$2.i() < $$5.b() && $$0.a($$6, dwx.a::l)) {
               $$1.accept($$6, this.a($$0, $$6, $$5.a().a($$2, $$6)));
            }
         }
      }
   }

   protected dwy a(dgp $$0, ji $$1, dwy $$2) {
      if ($$2.b(dxo.J)) {
         boolean $$3 = $$0.b($$1, $$0x -> $$0x.a(awv.a));
         return $$2.b(dxo.J, Boolean.valueOf($$3));
      } else {
         return $$2;
      }
   }

   public ji a(ji $$0, azh $$1) {
      return $$0.b(this.e.a($$1));
   }
}
