import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;
import java.util.function.BiConsumer;

public abstract class dtx {
   public static final Codec<dtx> d = jy.Z.q().dispatch(dtx::a, dty::a);
   protected final bic e;
   protected final dua f;
   protected final Optional<dtu> g;

   protected static <P extends dtx> P3<Mu<P>, bic, dua, Optional<dtu>> a(Instance<P> $$0) {
      return $$0.group(
         bic.c.fieldOf("trunk_offset_y").forGetter($$0x -> $$0x.e),
         dua.a.fieldOf("root_provider").forGetter($$0x -> $$0x.f),
         dtu.a.optionalFieldOf("above_root_placement").forGetter($$0x -> $$0x.g)
      );
   }

   public dtx(bic $$0, dua $$1, Optional<dtu> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract dty<?> a();

   public abstract boolean a(csg var1, BiConsumer<ht, dhi> var2, ats var3, ht var4, ht var5, dsv var6);

   protected boolean a(csg $$0, ht $$1) {
      return drh.c($$0, $$1);
   }

   protected void a(csg $$0, BiConsumer<ht, dhi> $$1, ats $$2, ht $$3, dsv $$4) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, this.a($$0, $$3, this.f.a($$2, $$3)));
         if (this.g.isPresent()) {
            dtu $$5 = this.g.get();
            ht $$6 = $$3.c();
            if ($$2.i() < $$5.b() && $$0.a($$6, dhh.a::i)) {
               $$1.accept($$6, this.a($$0, $$6, $$5.a().a($$2, $$6)));
            }
         }
      }
   }

   protected dhi a(csg $$0, ht $$1, dhi $$2) {
      if ($$2.b(dhy.C)) {
         boolean $$3 = $$0.b($$1, $$0x -> $$0x.a(arl.a));
         return $$2.a(dhy.C, Boolean.valueOf($$3));
      } else {
         return $$2;
      }
   }

   public ht a(ht $$0, ats $$1) {
      return $$0.b(this.e.a($$1));
   }
}
