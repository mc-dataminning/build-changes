import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;
import java.util.function.BiConsumer;

public abstract class ehs {
   public static final Codec<ehs> d = lu.W.q().dispatch(ehs::a, eht::a);
   protected final bqu e;
   protected final ehv f;
   protected final Optional<ehp> g;

   protected static <P extends ehs> P3<Mu<P>, bqu, ehv, Optional<ehp>> a(Instance<P> $$0) {
      return $$0.group(
         bqu.c.fieldOf("trunk_offset_y").forGetter($$0x -> $$0x.e),
         ehv.a.fieldOf("root_provider").forGetter($$0x -> $$0x.f),
         ehp.a.optionalFieldOf("above_root_placement").forGetter($$0x -> $$0x.g)
      );
   }

   public ehs(bqu $$0, ehv $$1, Optional<ehp> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract eht<?> a();

   public abstract boolean a(dem var1, BiConsumer<je, duo> var2, azl var3, je var4, je var5, egq var6);

   protected boolean a(dem $$0, je $$1) {
      return efc.c($$0, $$1);
   }

   protected void a(dem $$0, BiConsumer<je, duo> $$1, azl $$2, je $$3, egq $$4) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, this.a($$0, $$3, this.f.a($$2, $$3)));
         if (this.g.isPresent()) {
            ehp $$5 = this.g.get();
            je $$6 = $$3.d();
            if ($$2.i() < $$5.b() && $$0.a($$6, dun.a::l)) {
               $$1.accept($$6, this.a($$0, $$6, $$5.a().a($$2, $$6)));
            }
         }
      }
   }

   protected duo a(dem $$0, je $$1, duo $$2) {
      if ($$2.b(dve.C)) {
         boolean $$3 = $$0.b($$1, $$0x -> $$0x.a(awz.a));
         return $$2.b(dve.C, Boolean.valueOf($$3));
      } else {
         return $$2;
      }
   }

   public je a(je $$0, azl $$1) {
      return $$0.b(this.e.a($$1));
   }
}
