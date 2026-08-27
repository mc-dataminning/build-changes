import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;
import java.util.function.BiConsumer;

public abstract class drp {
   public static final Codec<drp> d = jb.Z.q().dispatch(drp::a, drq::a);
   protected final bfv e;
   protected final drs f;
   protected final Optional<drm> g;

   protected static <P extends drp> P3<Mu<P>, bfv, drs, Optional<drm>> a(Instance<P> $$0) {
      return $$0.group(
         bfv.c.fieldOf("trunk_offset_y").forGetter($$0x -> $$0x.e),
         drs.a.fieldOf("root_provider").forGetter($$0x -> $$0x.f),
         drm.a.optionalFieldOf("above_root_placement").forGetter($$0x -> $$0x.g)
      );
   }

   public drp(bfv $$0, drs $$1, Optional<drm> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract drq<?> a();

   public abstract boolean a(cps var1, BiConsumer<gu, dfa> var2, aru var3, gu var4, gu var5, dqn var6);

   protected boolean a(cps $$0, gu $$1) {
      return doz.c($$0, $$1);
   }

   protected void a(cps $$0, BiConsumer<gu, dfa> $$1, aru $$2, gu $$3, dqn $$4) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, this.a($$0, $$3, this.f.a($$2, $$3)));
         if (this.g.isPresent()) {
            drm $$5 = this.g.get();
            gu $$6 = $$3.c();
            if ($$2.i() < $$5.b() && $$0.a($$6, dez.a::i)) {
               $$1.accept($$6, this.a($$0, $$6, $$5.a().a($$2, $$6)));
            }
         }
      }
   }

   protected dfa a(cps $$0, gu $$1, dfa $$2) {
      if ($$2.b(dfq.C)) {
         boolean $$3 = $$0.b($$1, $$0x -> $$0x.a(apq.a));
         return $$2.a(dfq.C, Boolean.valueOf($$3));
      } else {
         return $$2;
      }
   }

   public gu a(gu $$0, aru $$1) {
      return $$0.b(this.e.a($$1));
   }
}
