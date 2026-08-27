import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;
import java.util.function.BiConsumer;

public abstract class edf {
   public static final Codec<edf> d = ld.Y.q().dispatch(edf::a, edg::a);
   protected final bor e;
   protected final edi f;
   protected final Optional<edc> g;

   protected static <P extends edf> P3<Mu<P>, bor, edi, Optional<edc>> a(Instance<P> $$0) {
      return $$0.group(
         bor.c.fieldOf("trunk_offset_y").forGetter($$0x -> $$0x.e),
         edi.a.fieldOf("root_provider").forGetter($$0x -> $$0x.f),
         edc.a.optionalFieldOf("above_root_placement").forGetter($$0x -> $$0x.g)
      );
   }

   public edf(bor $$0, edi $$1, Optional<edc> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract edg<?> a();

   public abstract boolean a(daj var1, BiConsumer<in, dqh> var2, ayg var3, in var4, in var5, ecd var6);

   protected boolean a(daj $$0, in $$1) {
      return eap.c($$0, $$1);
   }

   protected void a(daj $$0, BiConsumer<in, dqh> $$1, ayg $$2, in $$3, ecd $$4) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, this.a($$0, $$3, this.f.a($$2, $$3)));
         if (this.g.isPresent()) {
            edc $$5 = this.g.get();
            in $$6 = $$3.c();
            if ($$2.i() < $$5.b() && $$0.a($$6, dqg.a::i)) {
               $$1.accept($$6, this.a($$0, $$6, $$5.a().a($$2, $$6)));
            }
         }
      }
   }

   protected dqh a(daj $$0, in $$1, dqh $$2) {
      if ($$2.b(dqx.C)) {
         boolean $$3 = $$0.b($$1, $$0x -> $$0x.a(avw.a));
         return $$2.a(dqx.C, Boolean.valueOf($$3));
      } else {
         return $$2;
      }
   }

   public in a(in $$0, ayg $$1) {
      return $$0.b(this.e.a($$1));
   }
}
