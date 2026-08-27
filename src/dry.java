import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;
import java.util.function.BiConsumer;

public abstract class dry {
   public static final Codec<dry> d = jd.Z.q().dispatch(dry::a, drz::a);
   protected final bgd e;
   protected final dsb f;
   protected final Optional<drv> g;

   protected static <P extends dry> P3<Mu<P>, bgd, dsb, Optional<drv>> a(Instance<P> $$0) {
      return $$0.group(
         bgd.c.fieldOf("trunk_offset_y").forGetter($$0x -> $$0x.e),
         dsb.a.fieldOf("root_provider").forGetter($$0x -> $$0x.f),
         drv.a.optionalFieldOf("above_root_placement").forGetter($$0x -> $$0x.g)
      );
   }

   public dry(bgd $$0, dsb $$1, Optional<drv> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract drz<?> a();

   public abstract boolean a(cqb var1, BiConsumer<gw, dfj> var2, asc var3, gw var4, gw var5, dqw var6);

   protected boolean a(cqb $$0, gw $$1) {
      return dpi.c($$0, $$1);
   }

   protected void a(cqb $$0, BiConsumer<gw, dfj> $$1, asc $$2, gw $$3, dqw $$4) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, this.a($$0, $$3, this.f.a($$2, $$3)));
         if (this.g.isPresent()) {
            drv $$5 = this.g.get();
            gw $$6 = $$3.c();
            if ($$2.i() < $$5.b() && $$0.a($$6, dfi.a::i)) {
               $$1.accept($$6, this.a($$0, $$6, $$5.a().a($$2, $$6)));
            }
         }
      }
   }

   protected dfj a(cqb $$0, gw $$1, dfj $$2) {
      if ($$2.b(dfz.C)) {
         boolean $$3 = $$0.b($$1, $$0x -> $$0x.a(apy.a));
         return $$2.a(dfz.C, Boolean.valueOf($$3));
      } else {
         return $$2;
      }
   }

   public gw a(gw $$0, asc $$1) {
      return $$0.b(this.e.a($$1));
   }
}
