import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;
import java.util.function.BiConsumer;

public abstract class ebx {
   public static final Codec<ebx> d = kr.Y.q().dispatch(ebx::a, eby::a);
   protected final bnf e;
   protected final eca f;
   protected final Optional<ebu> g;

   protected static <P extends ebx> P3<Mu<P>, bnf, eca, Optional<ebu>> a(Instance<P> $$0) {
      return $$0.group(
         bnf.c.fieldOf("trunk_offset_y").forGetter($$0x -> $$0x.e),
         eca.a.fieldOf("root_provider").forGetter($$0x -> $$0x.f),
         ebu.a.optionalFieldOf("above_root_placement").forGetter($$0x -> $$0x.g)
      );
   }

   public ebx(bnf $$0, eca $$1, Optional<ebu> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract eby<?> a();

   public abstract boolean a(czd var1, BiConsumer<ib, doz> var2, axr var3, ib var4, ib var5, eav var6);

   protected boolean a(czd $$0, ib $$1) {
      return dzh.c($$0, $$1);
   }

   protected void a(czd $$0, BiConsumer<ib, doz> $$1, axr $$2, ib $$3, eav $$4) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, this.a($$0, $$3, this.f.a($$2, $$3)));
         if (this.g.isPresent()) {
            ebu $$5 = this.g.get();
            ib $$6 = $$3.c();
            if ($$2.i() < $$5.b() && $$0.a($$6, doy.a::i)) {
               $$1.accept($$6, this.a($$0, $$6, $$5.a().a($$2, $$6)));
            }
         }
      }
   }

   protected doz a(czd $$0, ib $$1, doz $$2) {
      if ($$2.b(dpp.C)) {
         boolean $$3 = $$0.b($$1, $$0x -> $$0x.a(avh.a));
         return $$2.a(dpp.C, Boolean.valueOf($$3));
      } else {
         return $$2;
      }
   }

   public ib a(ib $$0, axr $$1) {
      return $$0.b(this.e.a($$1));
   }
}
