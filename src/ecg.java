import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;
import java.util.function.BiConsumer;

public abstract class ecg {
   public static final Codec<ecg> d = kt.Y.q().dispatch(ecg::a, ech::a);
   protected final bnk e;
   protected final ecj f;
   protected final Optional<ecd> g;

   protected static <P extends ecg> P3<Mu<P>, bnk, ecj, Optional<ecd>> a(Instance<P> $$0) {
      return $$0.group(
         bnk.c.fieldOf("trunk_offset_y").forGetter($$0x -> $$0x.e),
         ecj.a.fieldOf("root_provider").forGetter($$0x -> $$0x.f),
         ecd.a.optionalFieldOf("above_root_placement").forGetter($$0x -> $$0x.g)
      );
   }

   public ecg(bnk $$0, ecj $$1, Optional<ecd> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract ech<?> a();

   public abstract boolean a(czm var1, BiConsumer<id, dpi> var2, axt var3, id var4, id var5, ebe var6);

   protected boolean a(czm $$0, id $$1) {
      return dzq.c($$0, $$1);
   }

   protected void a(czm $$0, BiConsumer<id, dpi> $$1, axt $$2, id $$3, ebe $$4) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, this.a($$0, $$3, this.f.a($$2, $$3)));
         if (this.g.isPresent()) {
            ecd $$5 = this.g.get();
            id $$6 = $$3.c();
            if ($$2.i() < $$5.b() && $$0.a($$6, dph.a::i)) {
               $$1.accept($$6, this.a($$0, $$6, $$5.a().a($$2, $$6)));
            }
         }
      }
   }

   protected dpi a(czm $$0, id $$1, dpi $$2) {
      if ($$2.b(dpy.C)) {
         boolean $$3 = $$0.b($$1, $$0x -> $$0x.a(avj.a));
         return $$2.a(dpy.C, Boolean.valueOf($$3));
      } else {
         return $$2;
      }
   }

   public id a(id $$0, axt $$1) {
      return $$0.b(this.e.a($$1));
   }
}
