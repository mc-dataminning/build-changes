import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;
import java.util.function.BiConsumer;

public abstract class dve {
   public static final Codec<dve> d = kb.Y.q().dispatch(dve::a, dvf::a);
   protected final biq e;
   protected final dvh f;
   protected final Optional<dvb> g;

   protected static <P extends dve> P3<Mu<P>, biq, dvh, Optional<dvb>> a(Instance<P> $$0) {
      return $$0.group(
         biq.c.fieldOf("trunk_offset_y").forGetter($$0x -> $$0x.e),
         dvh.a.fieldOf("root_provider").forGetter($$0x -> $$0x.f),
         dvb.a.optionalFieldOf("above_root_placement").forGetter($$0x -> $$0x.g)
      );
   }

   public dve(biq $$0, dvh $$1, Optional<dvb> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract dvf<?> a();

   public abstract boolean a(cte var1, BiConsumer<hv, dip> var2, auf var3, hv var4, hv var5, duc var6);

   protected boolean a(cte $$0, hv $$1) {
      return dso.c($$0, $$1);
   }

   protected void a(cte $$0, BiConsumer<hv, dip> $$1, auf $$2, hv $$3, duc $$4) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, this.a($$0, $$3, this.f.a($$2, $$3)));
         if (this.g.isPresent()) {
            dvb $$5 = this.g.get();
            hv $$6 = $$3.c();
            if ($$2.i() < $$5.b() && $$0.a($$6, dio.a::i)) {
               $$1.accept($$6, this.a($$0, $$6, $$5.a().a($$2, $$6)));
            }
         }
      }
   }

   protected dip a(cte $$0, hv $$1, dip $$2) {
      if ($$2.b(djf.C)) {
         boolean $$3 = $$0.b($$1, $$0x -> $$0x.a(arw.a));
         return $$2.a(djf.C, Boolean.valueOf($$3));
      } else {
         return $$2;
      }
   }

   public hv a(hv $$0, auf $$1) {
      return $$0.b(this.e.a($$1));
   }
}
