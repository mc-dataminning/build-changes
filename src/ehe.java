import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;
import java.util.function.BiConsumer;

public abstract class ehe {
   public static final Codec<ehe> d = lu.W.q().dispatch(ehe::a, ehf::a);
   protected final bqp e;
   protected final ehh f;
   protected final Optional<ehb> g;

   protected static <P extends ehe> P3<Mu<P>, bqp, ehh, Optional<ehb>> a(Instance<P> $$0) {
      return $$0.group(
         bqp.c.fieldOf("trunk_offset_y").forGetter($$0x -> $$0x.e),
         ehh.a.fieldOf("root_provider").forGetter($$0x -> $$0x.f),
         ehb.a.optionalFieldOf("above_root_placement").forGetter($$0x -> $$0x.g)
      );
   }

   public ehe(bqp $$0, ehh $$1, Optional<ehb> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract ehf<?> a();

   public abstract boolean a(ddy var1, BiConsumer<je, dua> var2, azk var3, je var4, je var5, egc var6);

   protected boolean a(ddy $$0, je $$1) {
      return eeo.c($$0, $$1);
   }

   protected void a(ddy $$0, BiConsumer<je, dua> $$1, azk $$2, je $$3, egc $$4) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, this.a($$0, $$3, this.f.a($$2, $$3)));
         if (this.g.isPresent()) {
            ehb $$5 = this.g.get();
            je $$6 = $$3.d();
            if ($$2.i() < $$5.b() && $$0.a($$6, dtz.a::l)) {
               $$1.accept($$6, this.a($$0, $$6, $$5.a().a($$2, $$6)));
            }
         }
      }
   }

   protected dua a(ddy $$0, je $$1, dua $$2) {
      if ($$2.b(duq.C)) {
         boolean $$3 = $$0.b($$1, $$0x -> $$0x.a(awy.a));
         return $$2.b(duq.C, Boolean.valueOf($$3));
      } else {
         return $$2;
      }
   }

   public je a(je $$0, azk $$1) {
      return $$0.b(this.e.a($$1));
   }
}
