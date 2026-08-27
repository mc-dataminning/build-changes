import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;
import java.util.function.BiConsumer;

public abstract class ecw {
   public static final Codec<ecw> d = lc.Y.q().dispatch(ecw::a, ecx::a);
   protected final bnv e;
   protected final ecz f;
   protected final Optional<ect> g;

   protected static <P extends ecw> P3<Mu<P>, bnv, ecz, Optional<ect>> a(Instance<P> $$0) {
      return $$0.group(
         bnv.c.fieldOf("trunk_offset_y").forGetter($$0x -> $$0x.e),
         ecz.a.fieldOf("root_provider").forGetter($$0x -> $$0x.f),
         ect.a.optionalFieldOf("above_root_placement").forGetter($$0x -> $$0x.g)
      );
   }

   public ecw(bnv $$0, ecz $$1, Optional<ect> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract ecx<?> a();

   public abstract boolean a(daa var1, BiConsumer<im, dpy> var2, ayd var3, im var4, im var5, ebu var6);

   protected boolean a(daa $$0, im $$1) {
      return eag.c($$0, $$1);
   }

   protected void a(daa $$0, BiConsumer<im, dpy> $$1, ayd $$2, im $$3, ebu $$4) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, this.a($$0, $$3, this.f.a($$2, $$3)));
         if (this.g.isPresent()) {
            ect $$5 = this.g.get();
            im $$6 = $$3.c();
            if ($$2.i() < $$5.b() && $$0.a($$6, dpx.a::i)) {
               $$1.accept($$6, this.a($$0, $$6, $$5.a().a($$2, $$6)));
            }
         }
      }
   }

   protected dpy a(daa $$0, im $$1, dpy $$2) {
      if ($$2.b(dqo.C)) {
         boolean $$3 = $$0.b($$1, $$0x -> $$0x.a(avt.a));
         return $$2.a(dqo.C, Boolean.valueOf($$3));
      } else {
         return $$2;
      }
   }

   public im a(im $$0, ayd $$1) {
      return $$0.b(this.e.a($$1));
   }
}
