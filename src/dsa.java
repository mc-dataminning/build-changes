import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;
import java.util.function.BiConsumer;

public abstract class dsa {
   public static final Codec<dsa> d = jd.Z.q().dispatch(dsa::a, dsb::a);
   protected final bgf e;
   protected final dsd f;
   protected final Optional<drx> g;

   protected static <P extends dsa> P3<Mu<P>, bgf, dsd, Optional<drx>> a(Instance<P> $$0) {
      return $$0.group(
         bgf.c.fieldOf("trunk_offset_y").forGetter($$0x -> $$0x.e),
         dsd.a.fieldOf("root_provider").forGetter($$0x -> $$0x.f),
         drx.a.optionalFieldOf("above_root_placement").forGetter($$0x -> $$0x.g)
      );
   }

   public dsa(bgf $$0, dsd $$1, Optional<drx> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract dsb<?> a();

   public abstract boolean a(cqd var1, BiConsumer<gw, dfl> var2, ase var3, gw var4, gw var5, dqy var6);

   protected boolean a(cqd $$0, gw $$1) {
      return dpk.c($$0, $$1);
   }

   protected void a(cqd $$0, BiConsumer<gw, dfl> $$1, ase $$2, gw $$3, dqy $$4) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, this.a($$0, $$3, this.f.a($$2, $$3)));
         if (this.g.isPresent()) {
            drx $$5 = this.g.get();
            gw $$6 = $$3.c();
            if ($$2.i() < $$5.b() && $$0.a($$6, dfk.a::i)) {
               $$1.accept($$6, this.a($$0, $$6, $$5.a().a($$2, $$6)));
            }
         }
      }
   }

   protected dfl a(cqd $$0, gw $$1, dfl $$2) {
      if ($$2.b(dgb.C)) {
         boolean $$3 = $$0.b($$1, $$0x -> $$0x.a(apz.a));
         return $$2.a(dgb.C, Boolean.valueOf($$3));
      } else {
         return $$2;
      }
   }

   public gw a(gw $$0, ase $$1) {
      return $$0.b(this.e.a($$1));
   }
}
