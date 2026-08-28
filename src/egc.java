import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;
import java.util.function.BiConsumer;

public abstract class egc {
   public static final Codec<egc> d = lt.W.r().dispatch(egc::a, egd::a);
   protected final bpv e;
   protected final egf f;
   protected final Optional<efz> g;

   protected static <P extends egc> P3<Mu<P>, bpv, egf, Optional<efz>> a(Instance<P> $$0) {
      return $$0.group(
         bpv.c.fieldOf("trunk_offset_y").forGetter($$0x -> $$0x.e),
         egf.a.fieldOf("root_provider").forGetter($$0x -> $$0x.f),
         efz.a.optionalFieldOf("above_root_placement").forGetter($$0x -> $$0x.g)
      );
   }

   public egc(bpv $$0, egf $$1, Optional<efz> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract egd<?> a();

   public abstract boolean a(dda var1, BiConsumer<jd, dta> var2, ayv var3, jd var4, jd var5, efa var6);

   protected boolean a(dda $$0, jd $$1) {
      return edm.c($$0, $$1);
   }

   protected void a(dda $$0, BiConsumer<jd, dta> $$1, ayv $$2, jd $$3, efa $$4) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, this.a($$0, $$3, this.f.a($$2, $$3)));
         if (this.g.isPresent()) {
            efz $$5 = this.g.get();
            jd $$6 = $$3.c();
            if ($$2.i() < $$5.b() && $$0.a($$6, dsz.a::i)) {
               $$1.accept($$6, this.a($$0, $$6, $$5.a().a($$2, $$6)));
            }
         }
      }
   }

   protected dta a(dda $$0, jd $$1, dta $$2) {
      if ($$2.b(dtq.C)) {
         boolean $$3 = $$0.b($$1, $$0x -> $$0x.a(awj.a));
         return $$2.a(dtq.C, Boolean.valueOf($$3));
      } else {
         return $$2;
      }
   }

   public jd a(jd $$0, ayv $$1) {
      return $$0.b(this.e.a($$1));
   }
}
