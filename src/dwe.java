import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;
import java.util.function.BiConsumer;

public abstract class dwe {
   public static final Codec<dwe> d = kd.Y.q().dispatch(dwe::a, dwf::a);
   protected final bjh e;
   protected final dwh f;
   protected final Optional<dwb> g;

   protected static <P extends dwe> P3<Mu<P>, bjh, dwh, Optional<dwb>> a(Instance<P> $$0) {
      return $$0.group(
         bjh.c.fieldOf("trunk_offset_y").forGetter($$0x -> $$0x.e),
         dwh.a.fieldOf("root_provider").forGetter($$0x -> $$0x.f),
         dwb.a.optionalFieldOf("above_root_placement").forGetter($$0x -> $$0x.g)
      );
   }

   public dwe(bjh $$0, dwh $$1, Optional<dwb> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract dwf<?> a();

   public abstract boolean a(cud var1, BiConsumer<hx, djp> var2, auw var3, hx var4, hx var5, dvc var6);

   protected boolean a(cud $$0, hx $$1) {
      return dto.c($$0, $$1);
   }

   protected void a(cud $$0, BiConsumer<hx, djp> $$1, auw $$2, hx $$3, dvc $$4) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, this.a($$0, $$3, this.f.a($$2, $$3)));
         if (this.g.isPresent()) {
            dwb $$5 = this.g.get();
            hx $$6 = $$3.c();
            if ($$2.i() < $$5.b() && $$0.a($$6, djo.a::i)) {
               $$1.accept($$6, this.a($$0, $$6, $$5.a().a($$2, $$6)));
            }
         }
      }
   }

   protected djp a(cud $$0, hx $$1, djp $$2) {
      if ($$2.b(dkf.C)) {
         boolean $$3 = $$0.b($$1, $$0x -> $$0x.a(asn.a));
         return $$2.a(dkf.C, Boolean.valueOf($$3));
      } else {
         return $$2;
      }
   }

   public hx a(hx $$0, auw $$1) {
      return $$0.b(this.e.a($$1));
   }
}
