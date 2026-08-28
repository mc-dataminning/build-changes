import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;
import java.util.function.BiConsumer;

public abstract class emv {
   public static final Codec<emv> d = mf.W.q().dispatch(emv::a, emw::a);
   protected final btd e;
   protected final emy f;
   protected final Optional<ems> g;

   protected static <P extends emv> P3<Mu<P>, btd, emy, Optional<ems>> a(Instance<P> $$0) {
      return $$0.group(
         btd.c.fieldOf("trunk_offset_y").forGetter($$0x -> $$0x.e),
         emy.a.fieldOf("root_provider").forGetter($$0x -> $$0x.f),
         ems.a.optionalFieldOf("above_root_placement").forGetter($$0x -> $$0x.g)
      );
   }

   public emv(btd $$0, emy $$1, Optional<ems> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract emw<?> a();

   public abstract boolean a(div var1, BiConsumer<iu, dzo> var2, azt var3, iu var4, iu var5, elt var6);

   protected boolean a(div $$0, iu $$1) {
      return ekf.d($$0, $$1);
   }

   protected void a(div $$0, BiConsumer<iu, dzo> $$1, azt $$2, iu $$3, elt $$4) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, this.a($$0, $$3, this.f.a($$2, $$3)));
         if (this.g.isPresent()) {
            ems $$5 = this.g.get();
            iu $$6 = $$3.d();
            if ($$2.i() < $$5.b() && $$0.a($$6, dzn.a::l)) {
               $$1.accept($$6, this.a($$0, $$6, $$5.a().a($$2, $$6)));
            }
         }
      }
   }

   protected dzo a(div $$0, iu $$1, dzo $$2) {
      if ($$2.b(eae.I)) {
         boolean $$3 = $$0.b($$1, $$0x -> $$0x.a(axf.a));
         return $$2.b(eae.I, Boolean.valueOf($$3));
      } else {
         return $$2;
      }
   }

   public iu a(iu $$0, azt $$1) {
      return $$0.b(this.e.a($$1));
   }
}
