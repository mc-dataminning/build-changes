import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;
import java.util.function.BiConsumer;

public abstract class ekr {
   public static final Codec<ekr> d = ma.W.q().dispatch(ekr::a, eks::a);
   protected final bsf e;
   protected final eku f;
   protected final Optional<eko> g;

   protected static <P extends ekr> P3<Mu<P>, bsf, eku, Optional<eko>> a(Instance<P> $$0) {
      return $$0.group(
         bsf.c.fieldOf("trunk_offset_y").forGetter($$0x -> $$0x.e),
         eku.a.fieldOf("root_provider").forGetter($$0x -> $$0x.f),
         eko.a.optionalFieldOf("above_root_placement").forGetter($$0x -> $$0x.g)
      );
   }

   public ekr(bsf $$0, eku $$1, Optional<eko> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract eks<?> a();

   public abstract boolean a(dhf var1, BiConsumer<jh, dxo> var2, bac var3, jh var4, jh var5, ejp var6);

   protected boolean a(dhf $$0, jh $$1) {
      return eib.c($$0, $$1);
   }

   protected void a(dhf $$0, BiConsumer<jh, dxo> $$1, bac $$2, jh $$3, ejp $$4) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, this.a($$0, $$3, this.f.a($$2, $$3)));
         if (this.g.isPresent()) {
            eko $$5 = this.g.get();
            jh $$6 = $$3.d();
            if ($$2.i() < $$5.b() && $$0.a($$6, dxn.a::l)) {
               $$1.accept($$6, this.a($$0, $$6, $$5.a().a($$2, $$6)));
            }
         }
      }
   }

   protected dxo a(dhf $$0, jh $$1, dxo $$2) {
      if ($$2.b(dye.J)) {
         boolean $$3 = $$0.b($$1, $$0x -> $$0x.a(axq.a));
         return $$2.b(dye.J, Boolean.valueOf($$3));
      } else {
         return $$2;
      }
   }

   public jh a(jh $$0, bac $$1) {
      return $$0.b(this.e.a($$1));
   }
}
