import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;
import java.util.function.BiConsumer;

public abstract class eop {
   public static final Codec<eop> d = mh.W.q().dispatch(eop::a, eoq::a);
   protected final bty e;
   protected final eos f;
   protected final Optional<eom> g;

   protected static <P extends eop> P3<Mu<P>, bty, eos, Optional<eom>> a(Instance<P> $$0) {
      return $$0.group(
         bty.c.fieldOf("trunk_offset_y").forGetter($$0x -> $$0x.e),
         eos.a.fieldOf("root_provider").forGetter($$0x -> $$0x.f),
         eom.a.optionalFieldOf("above_root_placement").forGetter($$0x -> $$0x.g)
      );
   }

   public eop(bty $$0, eos $$1, Optional<eom> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract eoq<?> a();

   public abstract boolean a(dkf var1, BiConsumer<iw, ebg> var2, azz var3, iw var4, iw var5, enn var6);

   protected boolean a(dkf $$0, iw $$1) {
      return ely.d($$0, $$1);
   }

   protected void a(dkf $$0, BiConsumer<iw, ebg> $$1, azz $$2, iw $$3, enn $$4) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, this.a($$0, $$3, this.f.a($$2, $$3)));
         if (this.g.isPresent()) {
            eom $$5 = this.g.get();
            iw $$6 = $$3.d();
            if ($$2.i() < $$5.b() && $$0.a($$6, ebf.a::l)) {
               $$1.accept($$6, this.a($$0, $$6, $$5.a().a($$2, $$6)));
            }
         }
      }
   }

   protected ebg a(dkf $$0, iw $$1, ebg $$2) {
      if ($$2.b(ebw.I)) {
         boolean $$3 = $$0.b($$1, $$0x -> $$0x.a(axl.a));
         return $$2.b(ebw.I, Boolean.valueOf($$3));
      } else {
         return $$2;
      }
   }

   public iw a(iw $$0, azz $$1) {
      return $$0.b(this.e.a($$1));
   }
}
