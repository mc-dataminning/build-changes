import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;
import java.util.function.BiConsumer;

public abstract class drn {
   public static final Codec<drn> d = jc.Z.q().dispatch(drn::a, dro::a);
   protected final bft e;
   protected final drq f;
   protected final Optional<drk> g;

   protected static <P extends drn> P3<Mu<P>, bft, drq, Optional<drk>> a(Instance<P> $$0) {
      return $$0.group(
         bft.c.fieldOf("trunk_offset_y").forGetter($$0x -> $$0x.e),
         drq.a.fieldOf("root_provider").forGetter($$0x -> $$0x.f),
         drk.a.optionalFieldOf("above_root_placement").forGetter($$0x -> $$0x.g)
      );
   }

   public drn(bft $$0, drq $$1, Optional<drk> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract dro<?> a();

   public abstract boolean a(cpq var1, BiConsumer<gv, dey> var2, art var3, gv var4, gv var5, dql var6);

   protected boolean a(cpq $$0, gv $$1) {
      return dox.c($$0, $$1);
   }

   protected void a(cpq $$0, BiConsumer<gv, dey> $$1, art $$2, gv $$3, dql $$4) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, this.a($$0, $$3, this.f.a($$2, $$3)));
         if (this.g.isPresent()) {
            drk $$5 = this.g.get();
            gv $$6 = $$3.c();
            if ($$2.i() < $$5.b() && $$0.a($$6, dex.a::i)) {
               $$1.accept($$6, this.a($$0, $$6, $$5.a().a($$2, $$6)));
            }
         }
      }
   }

   protected dey a(cpq $$0, gv $$1, dey $$2) {
      if ($$2.b(dfo.C)) {
         boolean $$3 = $$0.b($$1, $$0x -> $$0x.a(apo.a));
         return $$2.a(dfo.C, Boolean.valueOf($$3));
      } else {
         return $$2;
      }
   }

   public gv a(gv $$0, art $$1) {
      return $$0.b(this.e.a($$1));
   }
}
