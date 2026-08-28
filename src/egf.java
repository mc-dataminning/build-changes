import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;
import java.util.function.BiConsumer;

public abstract class egf {
   public static final Codec<egf> d = lt.W.r().dispatch(egf::a, egg::a);
   protected final bpw e;
   protected final egi f;
   protected final Optional<egc> g;

   protected static <P extends egf> P3<Mu<P>, bpw, egi, Optional<egc>> a(Instance<P> $$0) {
      return $$0.group(
         bpw.c.fieldOf("trunk_offset_y").forGetter($$0x -> $$0x.e),
         egi.a.fieldOf("root_provider").forGetter($$0x -> $$0x.f),
         egc.a.optionalFieldOf("above_root_placement").forGetter($$0x -> $$0x.g)
      );
   }

   public egf(bpw $$0, egi $$1, Optional<egc> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract egg<?> a();

   public abstract boolean a(ddc var1, BiConsumer<jd, dtc> var2, ayw var3, jd var4, jd var5, efd var6);

   protected boolean a(ddc $$0, jd $$1) {
      return edp.c($$0, $$1);
   }

   protected void a(ddc $$0, BiConsumer<jd, dtc> $$1, ayw $$2, jd $$3, efd $$4) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, this.a($$0, $$3, this.f.a($$2, $$3)));
         if (this.g.isPresent()) {
            egc $$5 = this.g.get();
            jd $$6 = $$3.d();
            if ($$2.i() < $$5.b() && $$0.a($$6, dtb.a::i)) {
               $$1.accept($$6, this.a($$0, $$6, $$5.a().a($$2, $$6)));
            }
         }
      }
   }

   protected dtc a(ddc $$0, jd $$1, dtc $$2) {
      if ($$2.b(dts.C)) {
         boolean $$3 = $$0.b($$1, $$0x -> $$0x.a(awk.a));
         return $$2.a(dts.C, Boolean.valueOf($$3));
      } else {
         return $$2;
      }
   }

   public jd a(jd $$0, ayw $$1) {
      return $$0.b(this.e.a($$1));
   }
}
