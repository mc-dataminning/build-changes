import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;
import java.util.function.BiConsumer;

public abstract class doq {
   public static final Codec<doq> d = jb.Z.q().dispatch(doq::a, dor::a);
   protected final bdc e;
   protected final dot f;
   protected final Optional<don> g;

   protected static <P extends doq> P3<Mu<P>, bdc, dot, Optional<don>> a(Instance<P> $$0) {
      return $$0.group(
         bdc.c.fieldOf("trunk_offset_y").forGetter($$0x -> $$0x.e),
         dot.a.fieldOf("root_provider").forGetter($$0x -> $$0x.f),
         don.a.optionalFieldOf("above_root_placement").forGetter($$0x -> $$0x.g)
      );
   }

   public doq(bdc $$0, dot $$1, Optional<don> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract dor<?> a();

   public abstract boolean a(cms var1, BiConsumer<gu, dcb> var2, apf var3, gu var4, gu var5, dno var6);

   protected boolean a(cms $$0, gu $$1) {
      return dma.c($$0, $$1);
   }

   protected void a(cms $$0, BiConsumer<gu, dcb> $$1, apf $$2, gu $$3, dno $$4) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, this.a($$0, $$3, this.f.a($$2, $$3)));
         if (this.g.isPresent()) {
            don $$5 = this.g.get();
            gu $$6 = $$3.c();
            if ($$2.i() < $$5.b() && $$0.a($$6, dca.a::i)) {
               $$1.accept($$6, this.a($$0, $$6, $$5.a().a($$2, $$6)));
            }
         }
      }
   }

   protected dcb a(cms $$0, gu $$1, dcb $$2) {
      if ($$2.b(dcr.C)) {
         boolean $$3 = $$0.b($$1, $$0x -> $$0x.a(anb.a));
         return $$2.a(dcr.C, Boolean.valueOf($$3));
      } else {
         return $$2;
      }
   }

   public gu a(gu $$0, apf $$1) {
      return $$0.b(this.e.a($$1));
   }
}
