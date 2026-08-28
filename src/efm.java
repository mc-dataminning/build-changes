import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;
import java.util.function.BiConsumer;

public abstract class efm {
   public static final Codec<efm> d = lq.W.r().dispatch(efm::a, efn::a);
   protected final bpl e;
   protected final efp f;
   protected final Optional<efj> g;

   protected static <P extends efm> P3<Mu<P>, bpl, efp, Optional<efj>> a(Instance<P> $$0) {
      return $$0.group(
         bpl.c.fieldOf("trunk_offset_y").forGetter($$0x -> $$0x.e),
         efp.a.fieldOf("root_provider").forGetter($$0x -> $$0x.f),
         efj.a.optionalFieldOf("above_root_placement").forGetter($$0x -> $$0x.g)
      );
   }

   public efm(bpl $$0, efp $$1, Optional<efj> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract efn<?> a();

   public abstract boolean a(dcl var1, BiConsumer<ja, dsk> var2, ayo var3, ja var4, ja var5, eek var6);

   protected boolean a(dcl $$0, ja $$1) {
      return ecw.c($$0, $$1);
   }

   protected void a(dcl $$0, BiConsumer<ja, dsk> $$1, ayo $$2, ja $$3, eek $$4) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, this.a($$0, $$3, this.f.a($$2, $$3)));
         if (this.g.isPresent()) {
            efj $$5 = this.g.get();
            ja $$6 = $$3.c();
            if ($$2.i() < $$5.b() && $$0.a($$6, dsj.a::i)) {
               $$1.accept($$6, this.a($$0, $$6, $$5.a().a($$2, $$6)));
            }
         }
      }
   }

   protected dsk a(dcl $$0, ja $$1, dsk $$2) {
      if ($$2.b(dta.C)) {
         boolean $$3 = $$0.b($$1, $$0x -> $$0x.a(awc.a));
         return $$2.a(dta.C, Boolean.valueOf($$3));
      } else {
         return $$2;
      }
   }

   public ja a(ja $$0, ayo $$1) {
      return $$0.b(this.e.a($$1));
   }
}
