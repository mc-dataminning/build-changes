import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;
import java.util.function.BiConsumer;

public abstract class ekx {
   public static final Codec<ekx> d = ma.W.q().dispatch(ekx::a, eky::a);
   protected final bsn e;
   protected final ela f;
   protected final Optional<eku> g;

   protected static <P extends ekx> P3<Mu<P>, bsn, ela, Optional<eku>> a(Instance<P> $$0) {
      return $$0.group(
         bsn.c.fieldOf("trunk_offset_y").forGetter($$0x -> $$0x.e),
         ela.a.fieldOf("root_provider").forGetter($$0x -> $$0x.f),
         eku.a.optionalFieldOf("above_root_placement").forGetter($$0x -> $$0x.g)
      );
   }

   public ekx(bsn $$0, ela $$1, Optional<eku> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract eky<?> a();

   public abstract boolean a(dhn var1, BiConsumer<jh, dxu> var2, bam var3, jh var4, jh var5, ejv var6);

   protected boolean a(dhn $$0, jh $$1) {
      return eih.c($$0, $$1);
   }

   protected void a(dhn $$0, BiConsumer<jh, dxu> $$1, bam $$2, jh $$3, ejv $$4) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, this.a($$0, $$3, this.f.a($$2, $$3)));
         if (this.g.isPresent()) {
            eku $$5 = this.g.get();
            jh $$6 = $$3.d();
            if ($$2.i() < $$5.b() && $$0.a($$6, dxt.a::l)) {
               $$1.accept($$6, this.a($$0, $$6, $$5.a().a($$2, $$6)));
            }
         }
      }
   }

   protected dxu a(dhn $$0, jh $$1, dxu $$2) {
      if ($$2.b(dyk.D)) {
         boolean $$3 = $$0.b($$1, $$0x -> $$0x.a(aya.a));
         return $$2.b(dyk.D, Boolean.valueOf($$3));
      } else {
         return $$2;
      }
   }

   public jh a(jh $$0, bam $$1) {
      return $$0.b(this.e.a($$1));
   }
}
