import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;
import java.util.function.BiConsumer;

public abstract class drt {
   public static final Codec<drt> d = jd.Z.q().dispatch(drt::a, dru::a);
   protected final bfy e;
   protected final drw f;
   protected final Optional<drq> g;

   protected static <P extends drt> P3<Mu<P>, bfy, drw, Optional<drq>> a(Instance<P> $$0) {
      return $$0.group(
         bfy.c.fieldOf("trunk_offset_y").forGetter($$0x -> $$0x.e),
         drw.a.fieldOf("root_provider").forGetter($$0x -> $$0x.f),
         drq.a.optionalFieldOf("above_root_placement").forGetter($$0x -> $$0x.g)
      );
   }

   public drt(bfy $$0, drw $$1, Optional<drq> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract dru<?> a();

   public abstract boolean a(cpw var1, BiConsumer<gw, dfe> var2, arx var3, gw var4, gw var5, dqr var6);

   protected boolean a(cpw $$0, gw $$1) {
      return dpd.c($$0, $$1);
   }

   protected void a(cpw $$0, BiConsumer<gw, dfe> $$1, arx $$2, gw $$3, dqr $$4) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, this.a($$0, $$3, this.f.a($$2, $$3)));
         if (this.g.isPresent()) {
            drq $$5 = this.g.get();
            gw $$6 = $$3.c();
            if ($$2.i() < $$5.b() && $$0.a($$6, dfd.a::i)) {
               $$1.accept($$6, this.a($$0, $$6, $$5.a().a($$2, $$6)));
            }
         }
      }
   }

   protected dfe a(cpw $$0, gw $$1, dfe $$2) {
      if ($$2.b(dfu.C)) {
         boolean $$3 = $$0.b($$1, $$0x -> $$0x.a(apt.a));
         return $$2.a(dfu.C, Boolean.valueOf($$3));
      } else {
         return $$2;
      }
   }

   public gw a(gw $$0, arx $$1) {
      return $$0.b(this.e.a($$1));
   }
}
