import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;
import java.util.function.BiConsumer;

public abstract class eev {
   public static final Codec<eev> d = lp.Y.q().dispatch(eev::a, eew::a);
   protected final bpu e;
   protected final eey f;
   protected final Optional<ees> g;

   protected static <P extends eev> P3<Mu<P>, bpu, eey, Optional<ees>> a(Instance<P> $$0) {
      return $$0.group(
         bpu.c.fieldOf("trunk_offset_y").forGetter($$0x -> $$0x.e),
         eey.a.fieldOf("root_provider").forGetter($$0x -> $$0x.f),
         ees.a.optionalFieldOf("above_root_placement").forGetter($$0x -> $$0x.g)
      );
   }

   public eev(bpu $$0, eey $$1, Optional<ees> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract eew<?> a();

   public abstract boolean a(dbz var1, BiConsumer<iz, drx> var2, azc var3, iz var4, iz var5, edt var6);

   protected boolean a(dbz $$0, iz $$1) {
      return ecf.c($$0, $$1);
   }

   protected void a(dbz $$0, BiConsumer<iz, drx> $$1, azc $$2, iz $$3, edt $$4) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, this.a($$0, $$3, this.f.a($$2, $$3)));
         if (this.g.isPresent()) {
            ees $$5 = this.g.get();
            iz $$6 = $$3.c();
            if ($$2.i() < $$5.b() && $$0.a($$6, drw.a::i)) {
               $$1.accept($$6, this.a($$0, $$6, $$5.a().a($$2, $$6)));
            }
         }
      }
   }

   protected drx a(dbz $$0, iz $$1, drx $$2) {
      if ($$2.b(dsn.C)) {
         boolean $$3 = $$0.b($$1, $$0x -> $$0x.a(awr.a));
         return $$2.a(dsn.C, Boolean.valueOf($$3));
      } else {
         return $$2;
      }
   }

   public iz a(iz $$0, azc $$1) {
      return $$0.b(this.e.a($$1));
   }
}
