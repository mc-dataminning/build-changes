import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;
import java.util.function.BiConsumer;

public abstract class eka {
   public static final Codec<eka> d = mb.W.q().dispatch(eka::a, ekb::a);
   protected final bro e;
   protected final ekd f;
   protected final Optional<ejx> g;

   protected static <P extends eka> P3<Mu<P>, bro, ekd, Optional<ejx>> a(Instance<P> $$0) {
      return $$0.group(
         bro.c.fieldOf("trunk_offset_y").forGetter($$0x -> $$0x.e),
         ekd.a.fieldOf("root_provider").forGetter($$0x -> $$0x.f),
         ejx.a.optionalFieldOf("above_root_placement").forGetter($$0x -> $$0x.g)
      );
   }

   public eka(bro $$0, ekd $$1, Optional<ejx> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract ekb<?> a();

   public abstract boolean a(dgo var1, BiConsumer<ji, dwx> var2, azh var3, ji var4, ji var5, eiy var6);

   protected boolean a(dgo $$0, ji $$1) {
      return ehk.c($$0, $$1);
   }

   protected void a(dgo $$0, BiConsumer<ji, dwx> $$1, azh $$2, ji $$3, eiy $$4) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, this.a($$0, $$3, this.f.a($$2, $$3)));
         if (this.g.isPresent()) {
            ejx $$5 = this.g.get();
            ji $$6 = $$3.d();
            if ($$2.i() < $$5.b() && $$0.a($$6, dww.a::l)) {
               $$1.accept($$6, this.a($$0, $$6, $$5.a().a($$2, $$6)));
            }
         }
      }
   }

   protected dwx a(dgo $$0, ji $$1, dwx $$2) {
      if ($$2.b(dxn.J)) {
         boolean $$3 = $$0.b($$1, $$0x -> $$0x.a(awv.a));
         return $$2.b(dxn.J, Boolean.valueOf($$3));
      } else {
         return $$2;
      }
   }

   public ji a(ji $$0, azh $$1) {
      return $$0.b(this.e.a($$1));
   }
}
