import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;
import java.util.function.BiConsumer;

public abstract class eoz {
   public static final Codec<eoz> d = mh.W.q().dispatch(eoz::a, epa::a);
   protected final buh e;
   protected final epc f;
   protected final Optional<eow> g;

   protected static <P extends eoz> P3<Mu<P>, buh, epc, Optional<eow>> a(Instance<P> $$0) {
      return $$0.group(
         buh.c.fieldOf("trunk_offset_y").forGetter($$0x -> $$0x.e),
         epc.a.fieldOf("root_provider").forGetter($$0x -> $$0x.f),
         eow.a.optionalFieldOf("above_root_placement").forGetter($$0x -> $$0x.g)
      );
   }

   public eoz(buh $$0, epc $$1, Optional<eow> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract epa<?> a();

   public abstract boolean a(dkp var1, BiConsumer<iw, ebq> var2, bai var3, iw var4, iw var5, enx var6);

   protected boolean a(dkp $$0, iw $$1) {
      return emi.d($$0, $$1);
   }

   protected void a(dkp $$0, BiConsumer<iw, ebq> $$1, bai $$2, iw $$3, enx $$4) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, this.a($$0, $$3, this.f.a($$2, $$3)));
         if (this.g.isPresent()) {
            eow $$5 = this.g.get();
            iw $$6 = $$3.d();
            if ($$2.i() < $$5.b() && $$0.a($$6, ebp.a::l)) {
               $$1.accept($$6, this.a($$0, $$6, $$5.a().a($$2, $$6)));
            }
         }
      }
   }

   protected ebq a(dkp $$0, iw $$1, ebq $$2) {
      if ($$2.b(ecg.I)) {
         boolean $$3 = $$0.b($$1, $$0x -> $$0x.a(axs.a));
         return $$2.b(ecg.I, Boolean.valueOf($$3));
      } else {
         return $$2;
      }
   }

   public iw a(iw $$0, bai $$1) {
      return $$0.b(this.e.a($$1));
   }
}
