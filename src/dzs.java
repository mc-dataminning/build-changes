import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;
import java.util.function.BiConsumer;

public abstract class dzs {
   public static final Codec<dzs> d = ki.Y.q().dispatch(dzs::a, dzt::a);
   protected final bmh e;
   protected final dzv f;
   protected final Optional<dzp> g;

   protected static <P extends dzs> P3<Mu<P>, bmh, dzv, Optional<dzp>> a(Instance<P> $$0) {
      return $$0.group(
         bmh.c.fieldOf("trunk_offset_y").forGetter($$0x -> $$0x.e),
         dzv.a.fieldOf("root_provider").forGetter($$0x -> $$0x.f),
         dzp.a.optionalFieldOf("above_root_placement").forGetter($$0x -> $$0x.g)
      );
   }

   public dzs(bmh $$0, dzv $$1, Optional<dzp> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract dzt<?> a();

   public abstract boolean a(cxf var1, BiConsumer<ib, dmz> var2, axd var3, ib var4, ib var5, dyq var6);

   protected boolean a(cxf $$0, ib $$1) {
      return dxc.c($$0, $$1);
   }

   protected void a(cxf $$0, BiConsumer<ib, dmz> $$1, axd $$2, ib $$3, dyq $$4) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, this.a($$0, $$3, this.f.a($$2, $$3)));
         if (this.g.isPresent()) {
            dzp $$5 = this.g.get();
            ib $$6 = $$3.c();
            if ($$2.i() < $$5.b() && $$0.a($$6, dmy.a::i)) {
               $$1.accept($$6, this.a($$0, $$6, $$5.a().a($$2, $$6)));
            }
         }
      }
   }

   protected dmz a(cxf $$0, ib $$1, dmz $$2) {
      if ($$2.b(dnp.C)) {
         boolean $$3 = $$0.b($$1, $$0x -> $$0x.a(aus.a));
         return $$2.a(dnp.C, Boolean.valueOf($$3));
      } else {
         return $$2;
      }
   }

   public ib a(ib $$0, axd $$1) {
      return $$0.b(this.e.a($$1));
   }
}
