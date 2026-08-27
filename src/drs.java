import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;
import java.util.function.BiConsumer;

public abstract class drs {
   public static final Codec<drs> d = jb.Z.q().dispatch(drs::a, drt::a);
   protected final bgj e;
   protected final drv f;
   protected final Optional<drp> g;

   protected static <P extends drs> P3<Mu<P>, bgj, drv, Optional<drp>> a(Instance<P> $$0) {
      return $$0.group(
         bgj.c.fieldOf("trunk_offset_y").forGetter($$0x -> $$0x.e),
         drv.a.fieldOf("root_provider").forGetter($$0x -> $$0x.f),
         drp.a.optionalFieldOf("above_root_placement").forGetter($$0x -> $$0x.g)
      );
   }

   public drs(bgj $$0, drv $$1, Optional<drp> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract drt<?> a();

   public abstract boolean a(cqh var1, BiConsumer<gw, dfd> var2, ash var3, gw var4, gw var5, dqq var6);

   protected boolean a(cqh $$0, gw $$1) {
      return dpc.c($$0, $$1);
   }

   protected void a(cqh $$0, BiConsumer<gw, dfd> $$1, ash $$2, gw $$3, dqq $$4) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, this.a($$0, $$3, this.f.a($$2, $$3)));
         if (this.g.isPresent()) {
            drp $$5 = this.g.get();
            gw $$6 = $$3.c();
            if ($$2.i() < $$5.b() && $$0.a($$6, dfc.a::i)) {
               $$1.accept($$6, this.a($$0, $$6, $$5.a().a($$2, $$6)));
            }
         }
      }
   }

   protected dfd a(cqh $$0, gw $$1, dfd $$2) {
      if ($$2.b(dft.C)) {
         boolean $$3 = $$0.b($$1, $$0x -> $$0x.a(aqa.a));
         return $$2.a(dft.C, Boolean.valueOf($$3));
      } else {
         return $$2;
      }
   }

   public gw a(gw $$0, ash $$1) {
      return $$0.b(this.e.a($$1));
   }
}
