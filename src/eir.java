import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;
import java.util.function.BiConsumer;

public abstract class eir {
   public static final Codec<eir> d = lz.W.q().dispatch(eir::a, eis::a);
   protected final brm e;
   protected final eiu f;
   protected final Optional<eio> g;

   protected static <P extends eir> P3<Mu<P>, brm, eiu, Optional<eio>> a(Instance<P> $$0) {
      return $$0.group(
         brm.c.fieldOf("trunk_offset_y").forGetter($$0x -> $$0x.e),
         eiu.a.fieldOf("root_provider").forGetter($$0x -> $$0x.f),
         eio.a.optionalFieldOf("above_root_placement").forGetter($$0x -> $$0x.g)
      );
   }

   public eir(brm $$0, eiu $$1, Optional<eio> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract eis<?> a();

   public abstract boolean a(dfl var1, BiConsumer<jh, dvo> var2, azv var3, jh var4, jh var5, ehp var6);

   protected boolean a(dfl $$0, jh $$1) {
      return egb.c($$0, $$1);
   }

   protected void a(dfl $$0, BiConsumer<jh, dvo> $$1, azv $$2, jh $$3, ehp $$4) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, this.a($$0, $$3, this.f.a($$2, $$3)));
         if (this.g.isPresent()) {
            eio $$5 = this.g.get();
            jh $$6 = $$3.d();
            if ($$2.i() < $$5.b() && $$0.a($$6, dvn.a::l)) {
               $$1.accept($$6, this.a($$0, $$6, $$5.a().a($$2, $$6)));
            }
         }
      }
   }

   protected dvo a(dfl $$0, jh $$1, dvo $$2) {
      if ($$2.b(dwe.C)) {
         boolean $$3 = $$0.b($$1, $$0x -> $$0x.a(axj.a));
         return $$2.b(dwe.C, Boolean.valueOf($$3));
      } else {
         return $$2;
      }
   }

   public jh a(jh $$0, azv $$1) {
      return $$0.b(this.e.a($$1));
   }
}
