import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;
import java.util.function.BiConsumer;

public abstract class dtl {
   public static final Codec<dtl> d = jy.Z.q().dispatch(dtl::a, dtm::a);
   protected final bhv e;
   protected final dto f;
   protected final Optional<dti> g;

   protected static <P extends dtl> P3<Mu<P>, bhv, dto, Optional<dti>> a(Instance<P> $$0) {
      return $$0.group(
         bhv.c.fieldOf("trunk_offset_y").forGetter($$0x -> $$0x.e),
         dto.a.fieldOf("root_provider").forGetter($$0x -> $$0x.f),
         dti.a.optionalFieldOf("above_root_placement").forGetter($$0x -> $$0x.g)
      );
   }

   public dtl(bhv $$0, dto $$1, Optional<dti> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract dtm<?> a();

   public abstract boolean a(cry var1, BiConsumer<ht, dgw> var2, ato var3, ht var4, ht var5, dsj var6);

   protected boolean a(cry $$0, ht $$1) {
      return dqv.c($$0, $$1);
   }

   protected void a(cry $$0, BiConsumer<ht, dgw> $$1, ato $$2, ht $$3, dsj $$4) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, this.a($$0, $$3, this.f.a($$2, $$3)));
         if (this.g.isPresent()) {
            dti $$5 = this.g.get();
            ht $$6 = $$3.c();
            if ($$2.i() < $$5.b() && $$0.a($$6, dgv.a::i)) {
               $$1.accept($$6, this.a($$0, $$6, $$5.a().a($$2, $$6)));
            }
         }
      }
   }

   protected dgw a(cry $$0, ht $$1, dgw $$2) {
      if ($$2.b(dhm.C)) {
         boolean $$3 = $$0.b($$1, $$0x -> $$0x.a(arh.a));
         return $$2.a(dhm.C, Boolean.valueOf($$3));
      } else {
         return $$2;
      }
   }

   public ht a(ht $$0, ato $$1) {
      return $$0.b(this.e.a($$1));
   }
}
