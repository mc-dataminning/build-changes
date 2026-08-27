import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;
import java.util.function.BiConsumer;

public abstract class dvw {
   public static final Codec<dvw> d = kd.Y.q().dispatch(dvw::a, dvx::a);
   protected final bjg e;
   protected final dvz f;
   protected final Optional<dvt> g;

   protected static <P extends dvw> P3<Mu<P>, bjg, dvz, Optional<dvt>> a(Instance<P> $$0) {
      return $$0.group(
         bjg.c.fieldOf("trunk_offset_y").forGetter($$0x -> $$0x.e),
         dvz.a.fieldOf("root_provider").forGetter($$0x -> $$0x.f),
         dvt.a.optionalFieldOf("above_root_placement").forGetter($$0x -> $$0x.g)
      );
   }

   public dvw(bjg $$0, dvz $$1, Optional<dvt> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract dvx<?> a();

   public abstract boolean a(ctv var1, BiConsumer<hx, djh> var2, auv var3, hx var4, hx var5, duu var6);

   protected boolean a(ctv $$0, hx $$1) {
      return dtg.c($$0, $$1);
   }

   protected void a(ctv $$0, BiConsumer<hx, djh> $$1, auv $$2, hx $$3, duu $$4) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, this.a($$0, $$3, this.f.a($$2, $$3)));
         if (this.g.isPresent()) {
            dvt $$5 = this.g.get();
            hx $$6 = $$3.c();
            if ($$2.i() < $$5.b() && $$0.a($$6, djg.a::i)) {
               $$1.accept($$6, this.a($$0, $$6, $$5.a().a($$2, $$6)));
            }
         }
      }
   }

   protected djh a(ctv $$0, hx $$1, djh $$2) {
      if ($$2.b(djx.C)) {
         boolean $$3 = $$0.b($$1, $$0x -> $$0x.a(asm.a));
         return $$2.a(djx.C, Boolean.valueOf($$3));
      } else {
         return $$2;
      }
   }

   public hx a(hx $$0, auv $$1) {
      return $$0.b(this.e.a($$1));
   }
}
