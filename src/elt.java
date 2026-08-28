import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;
import java.util.function.BiConsumer;

public abstract class elt {
   public static final Codec<elt> d = md.W.q().dispatch(elt::a, elu::a);
   protected final bsv e;
   protected final elw f;
   protected final Optional<elq> g;

   protected static <P extends elt> P3<Mu<P>, bsv, elw, Optional<elq>> a(Instance<P> $$0) {
      return $$0.group(
         bsv.c.fieldOf("trunk_offset_y").forGetter($$0x -> $$0x.e),
         elw.a.fieldOf("root_provider").forGetter($$0x -> $$0x.f),
         elq.a.optionalFieldOf("above_root_placement").forGetter($$0x -> $$0x.g)
      );
   }

   public elt(bsv $$0, elw $$1, Optional<elq> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract elu<?> a();

   public abstract boolean a(dhv var1, BiConsumer<jj, dym> var2, azs var3, jj var4, jj var5, ekr var6);

   protected boolean a(dhv $$0, jj $$1) {
      return ejd.d($$0, $$1);
   }

   protected void a(dhv $$0, BiConsumer<jj, dym> $$1, azs $$2, jj $$3, ekr $$4) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, this.a($$0, $$3, this.f.a($$2, $$3)));
         if (this.g.isPresent()) {
            elq $$5 = this.g.get();
            jj $$6 = $$3.d();
            if ($$2.i() < $$5.b() && $$0.a($$6, dyl.a::l)) {
               $$1.accept($$6, this.a($$0, $$6, $$5.a().a($$2, $$6)));
            }
         }
      }
   }

   protected dym a(dhv $$0, jj $$1, dym $$2) {
      if ($$2.b(dzc.I)) {
         boolean $$3 = $$0.b($$1, $$0x -> $$0x.a(axf.a));
         return $$2.b(dzc.I, Boolean.valueOf($$3));
      } else {
         return $$2;
      }
   }

   public jj a(jj $$0, azs $$1) {
      return $$0.b(this.e.a($$1));
   }
}
