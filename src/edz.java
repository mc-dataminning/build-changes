import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;
import java.util.function.BiConsumer;

public abstract class edz {
   public static final Codec<edz> d = le.Y.q().dispatch(edz::a, eea::a);
   protected final boz e;
   protected final eec f;
   protected final Optional<edw> g;

   protected static <P extends edz> P3<Mu<P>, boz, eec, Optional<edw>> a(Instance<P> $$0) {
      return $$0.group(
         boz.c.fieldOf("trunk_offset_y").forGetter($$0x -> $$0x.e),
         eec.a.fieldOf("root_provider").forGetter($$0x -> $$0x.f),
         edw.a.optionalFieldOf("above_root_placement").forGetter($$0x -> $$0x.g)
      );
   }

   public edz(boz $$0, eec $$1, Optional<edw> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract eea<?> a();

   public abstract boolean a(dbd var1, BiConsumer<io, drb> var2, ayk var3, io var4, io var5, ecx var6);

   protected boolean a(dbd $$0, io $$1) {
      return ebj.c($$0, $$1);
   }

   protected void a(dbd $$0, BiConsumer<io, drb> $$1, ayk $$2, io $$3, ecx $$4) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, this.a($$0, $$3, this.f.a($$2, $$3)));
         if (this.g.isPresent()) {
            edw $$5 = this.g.get();
            io $$6 = $$3.c();
            if ($$2.i() < $$5.b() && $$0.a($$6, dra.a::i)) {
               $$1.accept($$6, this.a($$0, $$6, $$5.a().a($$2, $$6)));
            }
         }
      }
   }

   protected drb a(dbd $$0, io $$1, drb $$2) {
      if ($$2.b(drr.C)) {
         boolean $$3 = $$0.b($$1, $$0x -> $$0x.a(awb.a));
         return $$2.a(drr.C, Boolean.valueOf($$3));
      } else {
         return $$2;
      }
   }

   public io a(io $$0, ayk $$1) {
      return $$0.b(this.e.a($$1));
   }
}
