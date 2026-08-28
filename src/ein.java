import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;
import java.util.function.BiConsumer;

public abstract class ein {
   public static final Codec<ein> d = ly.W.q().dispatch(ein::a, eio::a);
   protected final bri e;
   protected final eiq f;
   protected final Optional<eik> g;

   protected static <P extends ein> P3<Mu<P>, bri, eiq, Optional<eik>> a(Instance<P> $$0) {
      return $$0.group(
         bri.c.fieldOf("trunk_offset_y").forGetter($$0x -> $$0x.e),
         eiq.a.fieldOf("root_provider").forGetter($$0x -> $$0x.f),
         eik.a.optionalFieldOf("above_root_placement").forGetter($$0x -> $$0x.g)
      );
   }

   public ein(bri $$0, eiq $$1, Optional<eik> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract eio<?> a();

   public abstract boolean a(dfh var1, BiConsumer<jh, dvj> var2, azs var3, jh var4, jh var5, ehl var6);

   protected boolean a(dfh $$0, jh $$1) {
      return efx.c($$0, $$1);
   }

   protected void a(dfh $$0, BiConsumer<jh, dvj> $$1, azs $$2, jh $$3, ehl $$4) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, this.a($$0, $$3, this.f.a($$2, $$3)));
         if (this.g.isPresent()) {
            eik $$5 = this.g.get();
            jh $$6 = $$3.d();
            if ($$2.i() < $$5.b() && $$0.a($$6, dvi.a::l)) {
               $$1.accept($$6, this.a($$0, $$6, $$5.a().a($$2, $$6)));
            }
         }
      }
   }

   protected dvj a(dfh $$0, jh $$1, dvj $$2) {
      if ($$2.b(dvz.C)) {
         boolean $$3 = $$0.b($$1, $$0x -> $$0x.a(axg.a));
         return $$2.b(dvz.C, Boolean.valueOf($$3));
      } else {
         return $$2;
      }
   }

   public jh a(jh $$0, azs $$1) {
      return $$0.b(this.e.a($$1));
   }
}
