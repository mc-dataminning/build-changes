import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;
import java.util.function.BiConsumer;

public abstract class dvp {
   public static final Codec<dvp> d = kd.Y.q().dispatch(dvp::a, dvq::a);
   protected final bja e;
   protected final dvs f;
   protected final Optional<dvm> g;

   protected static <P extends dvp> P3<Mu<P>, bja, dvs, Optional<dvm>> a(Instance<P> $$0) {
      return $$0.group(
         bja.c.fieldOf("trunk_offset_y").forGetter($$0x -> $$0x.e),
         dvs.a.fieldOf("root_provider").forGetter($$0x -> $$0x.f),
         dvm.a.optionalFieldOf("above_root_placement").forGetter($$0x -> $$0x.g)
      );
   }

   public dvp(bja $$0, dvs $$1, Optional<dvm> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract dvq<?> a();

   public abstract boolean a(cto var1, BiConsumer<hx, dja> var2, aup var3, hx var4, hx var5, dun var6);

   protected boolean a(cto $$0, hx $$1) {
      return dsz.c($$0, $$1);
   }

   protected void a(cto $$0, BiConsumer<hx, dja> $$1, aup $$2, hx $$3, dun $$4) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, this.a($$0, $$3, this.f.a($$2, $$3)));
         if (this.g.isPresent()) {
            dvm $$5 = this.g.get();
            hx $$6 = $$3.c();
            if ($$2.i() < $$5.b() && $$0.a($$6, diz.a::i)) {
               $$1.accept($$6, this.a($$0, $$6, $$5.a().a($$2, $$6)));
            }
         }
      }
   }

   protected dja a(cto $$0, hx $$1, dja $$2) {
      if ($$2.b(djq.C)) {
         boolean $$3 = $$0.b($$1, $$0x -> $$0x.a(asg.a));
         return $$2.a(djq.C, Boolean.valueOf($$3));
      } else {
         return $$2;
      }
   }

   public hx a(hx $$0, aup $$1) {
      return $$0.b(this.e.a($$1));
   }
}
