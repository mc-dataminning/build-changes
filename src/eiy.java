import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;
import java.util.function.BiConsumer;

public abstract class eiy {
   public static final Codec<eiy> d = lz.W.q().dispatch(eiy::a, eiz::a);
   protected final brp e;
   protected final ejb f;
   protected final Optional<eiv> g;

   protected static <P extends eiy> P3<Mu<P>, brp, ejb, Optional<eiv>> a(Instance<P> $$0) {
      return $$0.group(
         brp.c.fieldOf("trunk_offset_y").forGetter($$0x -> $$0x.e),
         ejb.a.fieldOf("root_provider").forGetter($$0x -> $$0x.f),
         eiv.a.optionalFieldOf("above_root_placement").forGetter($$0x -> $$0x.g)
      );
   }

   public eiy(brp $$0, ejb $$1, Optional<eiv> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract eiz<?> a();

   public abstract boolean a(dfs var1, BiConsumer<jh, dvv> var2, azu var3, jh var4, jh var5, ehw var6);

   protected boolean a(dfs $$0, jh $$1) {
      return egi.c($$0, $$1);
   }

   protected void a(dfs $$0, BiConsumer<jh, dvv> $$1, azu $$2, jh $$3, ehw $$4) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, this.a($$0, $$3, this.f.a($$2, $$3)));
         if (this.g.isPresent()) {
            eiv $$5 = this.g.get();
            jh $$6 = $$3.d();
            if ($$2.i() < $$5.b() && $$0.a($$6, dvu.a::l)) {
               $$1.accept($$6, this.a($$0, $$6, $$5.a().a($$2, $$6)));
            }
         }
      }
   }

   protected dvv a(dfs $$0, jh $$1, dvv $$2) {
      if ($$2.b(dwl.C)) {
         boolean $$3 = $$0.b($$1, $$0x -> $$0x.a(axi.a));
         return $$2.b(dwl.C, Boolean.valueOf($$3));
      } else {
         return $$2;
      }
   }

   public jh a(jh $$0, azu $$1) {
      return $$0.b(this.e.a($$1));
   }
}
