import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;
import java.util.function.BiConsumer;

public abstract class dvv {
   public static final Codec<dvv> d = kd.Y.q().dispatch(dvv::a, dvw::a);
   protected final bjf e;
   protected final dvy f;
   protected final Optional<dvs> g;

   protected static <P extends dvv> P3<Mu<P>, bjf, dvy, Optional<dvs>> a(Instance<P> $$0) {
      return $$0.group(
         bjf.c.fieldOf("trunk_offset_y").forGetter($$0x -> $$0x.e),
         dvy.a.fieldOf("root_provider").forGetter($$0x -> $$0x.f),
         dvs.a.optionalFieldOf("above_root_placement").forGetter($$0x -> $$0x.g)
      );
   }

   public dvv(bjf $$0, dvy $$1, Optional<dvs> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract dvw<?> a();

   public abstract boolean a(ctu var1, BiConsumer<hx, djg> var2, auu var3, hx var4, hx var5, dut var6);

   protected boolean a(ctu $$0, hx $$1) {
      return dtf.c($$0, $$1);
   }

   protected void a(ctu $$0, BiConsumer<hx, djg> $$1, auu $$2, hx $$3, dut $$4) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, this.a($$0, $$3, this.f.a($$2, $$3)));
         if (this.g.isPresent()) {
            dvs $$5 = this.g.get();
            hx $$6 = $$3.c();
            if ($$2.i() < $$5.b() && $$0.a($$6, djf.a::i)) {
               $$1.accept($$6, this.a($$0, $$6, $$5.a().a($$2, $$6)));
            }
         }
      }
   }

   protected djg a(ctu $$0, hx $$1, djg $$2) {
      if ($$2.b(djw.C)) {
         boolean $$3 = $$0.b($$1, $$0x -> $$0x.a(asl.a));
         return $$2.a(djw.C, Boolean.valueOf($$3));
      } else {
         return $$2;
      }
   }

   public hx a(hx $$0, auu $$1) {
      return $$0.b(this.e.a($$1));
   }
}
