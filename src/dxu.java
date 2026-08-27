import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;
import java.util.function.BiConsumer;

public abstract class dxu {
   public static final Codec<dxu> d = kf.Y.q().dispatch(dxu::a, dxv::a);
   protected final bkz e;
   protected final dxx f;
   protected final Optional<dxr> g;

   protected static <P extends dxu> P3<Mu<P>, bkz, dxx, Optional<dxr>> a(Instance<P> $$0) {
      return $$0.group(
         bkz.c.fieldOf("trunk_offset_y").forGetter($$0x -> $$0x.e),
         dxx.a.fieldOf("root_provider").forGetter($$0x -> $$0x.f),
         dxr.a.optionalFieldOf("above_root_placement").forGetter($$0x -> $$0x.g)
      );
   }

   public dxu(bkz $$0, dxx $$1, Optional<dxr> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract dxv<?> a();

   public abstract boolean a(cvt var1, BiConsumer<hz, dlf> var2, awo var3, hz var4, hz var5, dws var6);

   protected boolean a(cvt $$0, hz $$1) {
      return dve.c($$0, $$1);
   }

   protected void a(cvt $$0, BiConsumer<hz, dlf> $$1, awo $$2, hz $$3, dws $$4) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, this.a($$0, $$3, this.f.a($$2, $$3)));
         if (this.g.isPresent()) {
            dxr $$5 = this.g.get();
            hz $$6 = $$3.c();
            if ($$2.i() < $$5.b() && $$0.a($$6, dle.a::i)) {
               $$1.accept($$6, this.a($$0, $$6, $$5.a().a($$2, $$6)));
            }
         }
      }
   }

   protected dlf a(cvt $$0, hz $$1, dlf $$2) {
      if ($$2.b(dlv.C)) {
         boolean $$3 = $$0.b($$1, $$0x -> $$0x.a(aue.a));
         return $$2.a(dlv.C, Boolean.valueOf($$3));
      } else {
         return $$2;
      }
   }

   public hz a(hz $$0, awo $$1) {
      return $$0.b(this.e.a($$1));
   }
}
