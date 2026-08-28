import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;
import java.util.function.BiConsumer;

public abstract class eng {
   public static final Codec<eng> d = mf.W.q().dispatch(eng::a, enh::a);
   protected final btg e;
   protected final enj f;
   protected final Optional<end> g;

   protected static <P extends eng> P3<Mu<P>, btg, enj, Optional<end>> a(Instance<P> $$0) {
      return $$0.group(
         btg.c.fieldOf("trunk_offset_y").forGetter($$0x -> $$0x.e),
         enj.a.fieldOf("root_provider").forGetter($$0x -> $$0x.f),
         end.a.optionalFieldOf("above_root_placement").forGetter($$0x -> $$0x.g)
      );
   }

   public eng(btg $$0, enj $$1, Optional<end> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract enh<?> a();

   public abstract boolean a(djb var1, BiConsumer<iu, dzz> var2, azv var3, iu var4, iu var5, eme var6);

   protected boolean a(djb $$0, iu $$1) {
      return ekq.d($$0, $$1);
   }

   protected void a(djb $$0, BiConsumer<iu, dzz> $$1, azv $$2, iu $$3, eme $$4) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, this.a($$0, $$3, this.f.a($$2, $$3)));
         if (this.g.isPresent()) {
            end $$5 = this.g.get();
            iu $$6 = $$3.d();
            if ($$2.i() < $$5.b() && $$0.a($$6, dzy.a::l)) {
               $$1.accept($$6, this.a($$0, $$6, $$5.a().a($$2, $$6)));
            }
         }
      }
   }

   protected dzz a(djb $$0, iu $$1, dzz $$2) {
      if ($$2.b(eap.I)) {
         boolean $$3 = $$0.b($$1, $$0x -> $$0x.a(axh.a));
         return $$2.b(eap.I, Boolean.valueOf($$3));
      } else {
         return $$2;
      }
   }

   public iu a(iu $$0, azv $$1) {
      return $$0.b(this.e.a($$1));
   }
}
