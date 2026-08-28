import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;
import java.util.function.BiConsumer;

public abstract class eih {
   public static final Codec<eih> d = lx.W.q().dispatch(eih::a, eii::a);
   protected final brd e;
   protected final eik f;
   protected final Optional<eie> g;

   protected static <P extends eih> P3<Mu<P>, brd, eik, Optional<eie>> a(Instance<P> $$0) {
      return $$0.group(
         brd.c.fieldOf("trunk_offset_y").forGetter($$0x -> $$0x.e),
         eik.a.fieldOf("root_provider").forGetter($$0x -> $$0x.f),
         eie.a.optionalFieldOf("above_root_placement").forGetter($$0x -> $$0x.g)
      );
   }

   public eih(brd $$0, eik $$1, Optional<eie> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract eii<?> a();

   public abstract boolean a(dfb var1, BiConsumer<jg, dvd> var2, azr var3, jg var4, jg var5, ehf var6);

   protected boolean a(dfb $$0, jg $$1) {
      return efr.c($$0, $$1);
   }

   protected void a(dfb $$0, BiConsumer<jg, dvd> $$1, azr $$2, jg $$3, ehf $$4) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, this.a($$0, $$3, this.f.a($$2, $$3)));
         if (this.g.isPresent()) {
            eie $$5 = this.g.get();
            jg $$6 = $$3.d();
            if ($$2.i() < $$5.b() && $$0.a($$6, dvc.a::l)) {
               $$1.accept($$6, this.a($$0, $$6, $$5.a().a($$2, $$6)));
            }
         }
      }
   }

   protected dvd a(dfb $$0, jg $$1, dvd $$2) {
      if ($$2.b(dvt.C)) {
         boolean $$3 = $$0.b($$1, $$0x -> $$0x.a(axf.a));
         return $$2.b(dvt.C, Boolean.valueOf($$3));
      } else {
         return $$2;
      }
   }

   public jg a(jg $$0, azr $$1) {
      return $$0.b(this.e.a($$1));
   }
}
