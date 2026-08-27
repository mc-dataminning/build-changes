import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;
import java.util.function.BiConsumer;

public abstract class dsq {
   public static final Codec<dsq> d = jy.Z.q().dispatch(dsq::a, dsr::a);
   protected final bhg e;
   protected final dst f;
   protected final Optional<dsn> g;

   protected static <P extends dsq> P3<Mu<P>, bhg, dst, Optional<dsn>> a(Instance<P> $$0) {
      return $$0.group(
         bhg.c.fieldOf("trunk_offset_y").forGetter($$0x -> $$0x.e),
         dst.a.fieldOf("root_provider").forGetter($$0x -> $$0x.f),
         dsn.a.optionalFieldOf("above_root_placement").forGetter($$0x -> $$0x.g)
      );
   }

   public dsq(bhg $$0, dst $$1, Optional<dsn> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract dsr<?> a();

   public abstract boolean a(crf var1, BiConsumer<ht, dgb> var2, ate var3, ht var4, ht var5, dro var6);

   protected boolean a(crf $$0, ht $$1) {
      return dqa.c($$0, $$1);
   }

   protected void a(crf $$0, BiConsumer<ht, dgb> $$1, ate $$2, ht $$3, dro $$4) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, this.a($$0, $$3, this.f.a($$2, $$3)));
         if (this.g.isPresent()) {
            dsn $$5 = this.g.get();
            ht $$6 = $$3.c();
            if ($$2.i() < $$5.b() && $$0.a($$6, dga.a::i)) {
               $$1.accept($$6, this.a($$0, $$6, $$5.a().a($$2, $$6)));
            }
         }
      }
   }

   protected dgb a(crf $$0, ht $$1, dgb $$2) {
      if ($$2.b(dgr.C)) {
         boolean $$3 = $$0.b($$1, $$0x -> $$0x.a(aqx.a));
         return $$2.a(dgr.C, Boolean.valueOf($$3));
      } else {
         return $$2;
      }
   }

   public ht a(ht $$0, ate $$1) {
      return $$0.b(this.e.a($$1));
   }
}
