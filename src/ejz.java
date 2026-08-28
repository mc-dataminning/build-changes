import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;
import java.util.function.BiConsumer;

public abstract class ejz {
   public static final Codec<ejz> d = mb.W.q().dispatch(ejz::a, eka::a);
   protected final bro e;
   protected final ekc f;
   protected final Optional<ejw> g;

   protected static <P extends ejz> P3<Mu<P>, bro, ekc, Optional<ejw>> a(Instance<P> $$0) {
      return $$0.group(
         bro.c.fieldOf("trunk_offset_y").forGetter($$0x -> $$0x.e),
         ekc.a.fieldOf("root_provider").forGetter($$0x -> $$0x.f),
         ejw.a.optionalFieldOf("above_root_placement").forGetter($$0x -> $$0x.g)
      );
   }

   public ejz(bro $$0, ekc $$1, Optional<ejw> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract eka<?> a();

   public abstract boolean a(dgn var1, BiConsumer<ji, dww> var2, azh var3, ji var4, ji var5, eix var6);

   protected boolean a(dgn $$0, ji $$1) {
      return ehj.c($$0, $$1);
   }

   protected void a(dgn $$0, BiConsumer<ji, dww> $$1, azh $$2, ji $$3, eix $$4) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, this.a($$0, $$3, this.f.a($$2, $$3)));
         if (this.g.isPresent()) {
            ejw $$5 = this.g.get();
            ji $$6 = $$3.d();
            if ($$2.i() < $$5.b() && $$0.a($$6, dwv.a::l)) {
               $$1.accept($$6, this.a($$0, $$6, $$5.a().a($$2, $$6)));
            }
         }
      }
   }

   protected dww a(dgn $$0, ji $$1, dww $$2) {
      if ($$2.b(dxm.J)) {
         boolean $$3 = $$0.b($$1, $$0x -> $$0x.a(awv.a));
         return $$2.b(dxm.J, Boolean.valueOf($$3));
      } else {
         return $$2;
      }
   }

   public ji a(ji $$0, azh $$1) {
      return $$0.b(this.e.a($$1));
   }
}
