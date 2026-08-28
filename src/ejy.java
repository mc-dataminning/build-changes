import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;
import java.util.function.BiConsumer;

public abstract class ejy {
   public static final Codec<ejy> d = mb.W.q().dispatch(ejy::a, ejz::a);
   protected final brn e;
   protected final ekb f;
   protected final Optional<ejv> g;

   protected static <P extends ejy> P3<Mu<P>, brn, ekb, Optional<ejv>> a(Instance<P> $$0) {
      return $$0.group(
         brn.c.fieldOf("trunk_offset_y").forGetter($$0x -> $$0x.e),
         ekb.a.fieldOf("root_provider").forGetter($$0x -> $$0x.f),
         ejv.a.optionalFieldOf("above_root_placement").forGetter($$0x -> $$0x.g)
      );
   }

   public ejy(brn $$0, ekb $$1, Optional<ejv> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract ejz<?> a();

   public abstract boolean a(dgm var1, BiConsumer<ji, dwv> var2, azg var3, ji var4, ji var5, eiw var6);

   protected boolean a(dgm $$0, ji $$1) {
      return ehi.c($$0, $$1);
   }

   protected void a(dgm $$0, BiConsumer<ji, dwv> $$1, azg $$2, ji $$3, eiw $$4) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, this.a($$0, $$3, this.f.a($$2, $$3)));
         if (this.g.isPresent()) {
            ejv $$5 = this.g.get();
            ji $$6 = $$3.d();
            if ($$2.i() < $$5.b() && $$0.a($$6, dwu.a::l)) {
               $$1.accept($$6, this.a($$0, $$6, $$5.a().a($$2, $$6)));
            }
         }
      }
   }

   protected dwv a(dgm $$0, ji $$1, dwv $$2) {
      if ($$2.b(dxl.J)) {
         boolean $$3 = $$0.b($$1, $$0x -> $$0x.a(awu.a));
         return $$2.b(dxl.J, Boolean.valueOf($$3));
      } else {
         return $$2;
      }
   }

   public ji a(ji $$0, azg $$1) {
      return $$0.b(this.e.a($$1));
   }
}
