import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;
import java.util.function.BiConsumer;

public abstract class ehw {
   public static final Codec<ehw> d = lv.W.q().dispatch(ehw::a, ehx::a);
   protected final bqx e;
   protected final ehz f;
   protected final Optional<eht> g;

   protected static <P extends ehw> P3<Mu<P>, bqx, ehz, Optional<eht>> a(Instance<P> $$0) {
      return $$0.group(
         bqx.c.fieldOf("trunk_offset_y").forGetter($$0x -> $$0x.e),
         ehz.a.fieldOf("root_provider").forGetter($$0x -> $$0x.f),
         eht.a.optionalFieldOf("above_root_placement").forGetter($$0x -> $$0x.g)
      );
   }

   public ehw(bqx $$0, ehz $$1, Optional<eht> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract ehx<?> a();

   public abstract boolean a(dep var1, BiConsumer<jf, dus> var2, azn var3, jf var4, jf var5, egu var6);

   protected boolean a(dep $$0, jf $$1) {
      return efg.c($$0, $$1);
   }

   protected void a(dep $$0, BiConsumer<jf, dus> $$1, azn $$2, jf $$3, egu $$4) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, this.a($$0, $$3, this.f.a($$2, $$3)));
         if (this.g.isPresent()) {
            eht $$5 = this.g.get();
            jf $$6 = $$3.d();
            if ($$2.i() < $$5.b() && $$0.a($$6, dur.a::l)) {
               $$1.accept($$6, this.a($$0, $$6, $$5.a().a($$2, $$6)));
            }
         }
      }
   }

   protected dus a(dep $$0, jf $$1, dus $$2) {
      if ($$2.b(dvi.C)) {
         boolean $$3 = $$0.b($$1, $$0x -> $$0x.a(axb.a));
         return $$2.b(dvi.C, Boolean.valueOf($$3));
      } else {
         return $$2;
      }
   }

   public jf a(jf $$0, azn $$1) {
      return $$0.b(this.e.a($$1));
   }
}
