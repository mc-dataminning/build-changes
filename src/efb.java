import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;
import java.util.function.BiConsumer;

public abstract class efb {
   public static final Codec<efb> d = lp.Y.q().dispatch(efb::a, efc::a);
   protected final bqa e;
   protected final efe f;
   protected final Optional<eey> g;

   protected static <P extends efb> P3<Mu<P>, bqa, efe, Optional<eey>> a(Instance<P> $$0) {
      return $$0.group(
         bqa.c.fieldOf("trunk_offset_y").forGetter($$0x -> $$0x.e),
         efe.a.fieldOf("root_provider").forGetter($$0x -> $$0x.f),
         eey.a.optionalFieldOf("above_root_placement").forGetter($$0x -> $$0x.g)
      );
   }

   public efb(bqa $$0, efe $$1, Optional<eey> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract efc<?> a();

   public abstract boolean a(dcf var1, BiConsumer<iz, dsd> var2, azh var3, iz var4, iz var5, edz var6);

   protected boolean a(dcf $$0, iz $$1) {
      return ecl.c($$0, $$1);
   }

   protected void a(dcf $$0, BiConsumer<iz, dsd> $$1, azh $$2, iz $$3, edz $$4) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, this.a($$0, $$3, this.f.a($$2, $$3)));
         if (this.g.isPresent()) {
            eey $$5 = this.g.get();
            iz $$6 = $$3.c();
            if ($$2.i() < $$5.b() && $$0.a($$6, dsc.a::i)) {
               $$1.accept($$6, this.a($$0, $$6, $$5.a().a($$2, $$6)));
            }
         }
      }
   }

   protected dsd a(dcf $$0, iz $$1, dsd $$2) {
      if ($$2.b(dst.C)) {
         boolean $$3 = $$0.b($$1, $$0x -> $$0x.a(awv.a));
         return $$2.a(dst.C, Boolean.valueOf($$3));
      } else {
         return $$2;
      }
   }

   public iz a(iz $$0, azh $$1) {
      return $$0.b(this.e.a($$1));
   }
}
