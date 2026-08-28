import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;
import java.util.function.BiConsumer;

public abstract class efa {
   public static final Codec<efa> d = lp.Y.q().dispatch(efa::a, efb::a);
   protected final bpz e;
   protected final efd f;
   protected final Optional<eex> g;

   protected static <P extends efa> P3<Mu<P>, bpz, efd, Optional<eex>> a(Instance<P> $$0) {
      return $$0.group(
         bpz.c.fieldOf("trunk_offset_y").forGetter($$0x -> $$0x.e),
         efd.a.fieldOf("root_provider").forGetter($$0x -> $$0x.f),
         eex.a.optionalFieldOf("above_root_placement").forGetter($$0x -> $$0x.g)
      );
   }

   public efa(bpz $$0, efd $$1, Optional<eex> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract efb<?> a();

   public abstract boolean a(dce var1, BiConsumer<iz, dsc> var2, azh var3, iz var4, iz var5, edy var6);

   protected boolean a(dce $$0, iz $$1) {
      return eck.c($$0, $$1);
   }

   protected void a(dce $$0, BiConsumer<iz, dsc> $$1, azh $$2, iz $$3, edy $$4) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, this.a($$0, $$3, this.f.a($$2, $$3)));
         if (this.g.isPresent()) {
            eex $$5 = this.g.get();
            iz $$6 = $$3.c();
            if ($$2.i() < $$5.b() && $$0.a($$6, dsb.a::i)) {
               $$1.accept($$6, this.a($$0, $$6, $$5.a().a($$2, $$6)));
            }
         }
      }
   }

   protected dsc a(dce $$0, iz $$1, dsc $$2) {
      if ($$2.b(dss.C)) {
         boolean $$3 = $$0.b($$1, $$0x -> $$0x.a(awv.a));
         return $$2.a(dss.C, Boolean.valueOf($$3));
      } else {
         return $$2;
      }
   }

   public iz a(iz $$0, azh $$1) {
      return $$0.b(this.e.a($$1));
   }
}
