import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;
import java.util.function.BiConsumer;

public abstract class egi {
   public static final Codec<egi> d = lh.Y.q().dispatch(egi::a, egj::a);
   protected final bpf e;
   protected final egl f;
   protected final Optional<egf> g;

   protected static <P extends egi> P3<Mu<P>, bpf, egl, Optional<egf>> a(Instance<P> $$0) {
      return $$0.group(
         bpf.c.fieldOf("trunk_offset_y").forGetter($$0x -> $$0x.e),
         egl.a.fieldOf("root_provider").forGetter($$0x -> $$0x.f),
         egf.a.optionalFieldOf("above_root_placement").forGetter($$0x -> $$0x.g)
      );
   }

   public egi(bpf $$0, egl $$1, Optional<egf> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract egj<?> a();

   public abstract boolean a(dcg var1, BiConsumer<ir, dtc> var2, ayt var3, ir var4, ir var5, efg var6);

   protected boolean a(dcg $$0, ir $$1) {
      return edr.c($$0, $$1);
   }

   protected void a(dcg $$0, BiConsumer<ir, dtc> $$1, ayt $$2, ir $$3, efg $$4) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, this.a($$0, $$3, this.f.a($$2, $$3)));
         if (this.g.isPresent()) {
            egf $$5 = this.g.get();
            ir $$6 = $$3.c();
            if ($$2.i() < $$5.b() && $$0.a($$6, dtb.a::i)) {
               $$1.accept($$6, this.a($$0, $$6, $$5.a().a($$2, $$6)));
            }
         }
      }
   }

   protected dtc a(dcg $$0, ir $$1, dtc $$2) {
      if ($$2.b(dts.C)) {
         boolean $$3 = $$0.b($$1, $$0x -> $$0x.a(awj.a));
         return $$2.a(dts.C, Boolean.valueOf($$3));
      } else {
         return $$2;
      }
   }

   public ir a(ir $$0, ayt $$1) {
      return $$0.b(this.e.a($$1));
   }
}
