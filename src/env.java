import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;
import java.util.function.BiConsumer;

public abstract class env {
   public static final Codec<env> d = mg.W.q().dispatch(env::a, enw::a);
   protected final btl e;
   protected final eny f;
   protected final Optional<ens> g;

   protected static <P extends env> P3<Mu<P>, btl, eny, Optional<ens>> a(Instance<P> $$0) {
      return $$0.group(
         btl.c.fieldOf("trunk_offset_y").forGetter($$0x -> $$0x.e),
         eny.a.fieldOf("root_provider").forGetter($$0x -> $$0x.f),
         ens.a.optionalFieldOf("above_root_placement").forGetter($$0x -> $$0x.g)
      );
   }

   public env(btl $$0, eny $$1, Optional<ens> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract enw<?> a();

   public abstract boolean a(djn var1, BiConsumer<iv, eao> var2, azv var3, iv var4, iv var5, emt var6);

   protected boolean a(djn $$0, iv $$1) {
      return elf.d($$0, $$1);
   }

   protected void a(djn $$0, BiConsumer<iv, eao> $$1, azv $$2, iv $$3, emt $$4) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, this.a($$0, $$3, this.f.a($$2, $$3)));
         if (this.g.isPresent()) {
            ens $$5 = this.g.get();
            iv $$6 = $$3.d();
            if ($$2.i() < $$5.b() && $$0.a($$6, ean.a::l)) {
               $$1.accept($$6, this.a($$0, $$6, $$5.a().a($$2, $$6)));
            }
         }
      }
   }

   protected eao a(djn $$0, iv $$1, eao $$2) {
      if ($$2.b(ebe.I)) {
         boolean $$3 = $$0.b($$1, $$0x -> $$0x.a(axh.a));
         return $$2.b(ebe.I, Boolean.valueOf($$3));
      } else {
         return $$2;
      }
   }

   public iv a(iv $$0, azv $$1) {
      return $$0.b(this.e.a($$1));
   }
}
