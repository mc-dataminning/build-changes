import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;
import java.util.function.BiConsumer;

public abstract class dzu {
   public static final Codec<dzu> d = ki.Y.q().dispatch(dzu::a, dzv::a);
   protected final bmi e;
   protected final dzx f;
   protected final Optional<dzr> g;

   protected static <P extends dzu> P3<Mu<P>, bmi, dzx, Optional<dzr>> a(Instance<P> $$0) {
      return $$0.group(
         bmi.c.fieldOf("trunk_offset_y").forGetter($$0x -> $$0x.e),
         dzx.a.fieldOf("root_provider").forGetter($$0x -> $$0x.f),
         dzr.a.optionalFieldOf("above_root_placement").forGetter($$0x -> $$0x.g)
      );
   }

   public dzu(bmi $$0, dzx $$1, Optional<dzr> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract dzv<?> a();

   public abstract boolean a(cxh var1, BiConsumer<ib, dnb> var2, axd var3, ib var4, ib var5, dys var6);

   protected boolean a(cxh $$0, ib $$1) {
      return dxe.c($$0, $$1);
   }

   protected void a(cxh $$0, BiConsumer<ib, dnb> $$1, axd $$2, ib $$3, dys $$4) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, this.a($$0, $$3, this.f.a($$2, $$3)));
         if (this.g.isPresent()) {
            dzr $$5 = this.g.get();
            ib $$6 = $$3.c();
            if ($$2.i() < $$5.b() && $$0.a($$6, dna.a::i)) {
               $$1.accept($$6, this.a($$0, $$6, $$5.a().a($$2, $$6)));
            }
         }
      }
   }

   protected dnb a(cxh $$0, ib $$1, dnb $$2) {
      if ($$2.b(dnr.C)) {
         boolean $$3 = $$0.b($$1, $$0x -> $$0x.a(aus.a));
         return $$2.a(dnr.C, Boolean.valueOf($$3));
      } else {
         return $$2;
      }
   }

   public ib a(ib $$0, axd $$1) {
      return $$0.b(this.e.a($$1));
   }
}
