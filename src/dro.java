import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;
import java.util.function.BiConsumer;

public abstract class dro {
   public static final Codec<dro> d = jb.Z.q().dispatch(dro::a, drp::a);
   protected final bfv e;
   protected final drr f;
   protected final Optional<drl> g;

   protected static <P extends dro> P3<Mu<P>, bfv, drr, Optional<drl>> a(Instance<P> $$0) {
      return $$0.group(
         bfv.c.fieldOf("trunk_offset_y").forGetter($$0x -> $$0x.e),
         drr.a.fieldOf("root_provider").forGetter($$0x -> $$0x.f),
         drl.a.optionalFieldOf("above_root_placement").forGetter($$0x -> $$0x.g)
      );
   }

   public dro(bfv $$0, drr $$1, Optional<drl> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract drp<?> a();

   public abstract boolean a(cpr var1, BiConsumer<gu, dez> var2, aru var3, gu var4, gu var5, dqm var6);

   protected boolean a(cpr $$0, gu $$1) {
      return doy.c($$0, $$1);
   }

   protected void a(cpr $$0, BiConsumer<gu, dez> $$1, aru $$2, gu $$3, dqm $$4) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, this.a($$0, $$3, this.f.a($$2, $$3)));
         if (this.g.isPresent()) {
            drl $$5 = this.g.get();
            gu $$6 = $$3.c();
            if ($$2.i() < $$5.b() && $$0.a($$6, dey.a::i)) {
               $$1.accept($$6, this.a($$0, $$6, $$5.a().a($$2, $$6)));
            }
         }
      }
   }

   protected dez a(cpr $$0, gu $$1, dez $$2) {
      if ($$2.b(dfp.C)) {
         boolean $$3 = $$0.b($$1, $$0x -> $$0x.a(apq.a));
         return $$2.a(dfp.C, Boolean.valueOf($$3));
      } else {
         return $$2;
      }
   }

   public gu a(gu $$0, aru $$1) {
      return $$0.b(this.e.a($$1));
   }
}
