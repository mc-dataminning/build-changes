import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;
import java.util.function.BiConsumer;

public abstract class eno {
   public static final Codec<eno> d = mf.W.q().dispatch(eno::a, enp::a);
   protected final bti e;
   protected final enr f;
   protected final Optional<enl> g;

   protected static <P extends eno> P3<Mu<P>, bti, enr, Optional<enl>> a(Instance<P> $$0) {
      return $$0.group(
         bti.c.fieldOf("trunk_offset_y").forGetter($$0x -> $$0x.e),
         enr.a.fieldOf("root_provider").forGetter($$0x -> $$0x.f),
         enl.a.optionalFieldOf("above_root_placement").forGetter($$0x -> $$0x.g)
      );
   }

   public eno(bti $$0, enr $$1, Optional<enl> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract enp<?> a();

   public abstract boolean a(djg var1, BiConsumer<iu, eah> var2, azv var3, iu var4, iu var5, emm var6);

   protected boolean a(djg $$0, iu $$1) {
      return eky.d($$0, $$1);
   }

   protected void a(djg $$0, BiConsumer<iu, eah> $$1, azv $$2, iu $$3, emm $$4) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, this.a($$0, $$3, this.f.a($$2, $$3)));
         if (this.g.isPresent()) {
            enl $$5 = this.g.get();
            iu $$6 = $$3.d();
            if ($$2.i() < $$5.b() && $$0.a($$6, eag.a::l)) {
               $$1.accept($$6, this.a($$0, $$6, $$5.a().a($$2, $$6)));
            }
         }
      }
   }

   protected eah a(djg $$0, iu $$1, eah $$2) {
      if ($$2.b(eax.I)) {
         boolean $$3 = $$0.b($$1, $$0x -> $$0x.a(axh.a));
         return $$2.b(eax.I, Boolean.valueOf($$3));
      } else {
         return $$2;
      }
   }

   public iu a(iu $$0, azv $$1) {
      return $$0.b(this.e.a($$1));
   }
}
