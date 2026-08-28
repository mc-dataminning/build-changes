import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;
import java.util.function.BiConsumer;

public abstract class ekq {
   public static final Codec<ekq> d = ma.W.q().dispatch(ekq::a, ekr::a);
   protected final bsj e;
   protected final ekt f;
   protected final Optional<ekn> g;

   protected static <P extends ekq> P3<Mu<P>, bsj, ekt, Optional<ekn>> a(Instance<P> $$0) {
      return $$0.group(
         bsj.c.fieldOf("trunk_offset_y").forGetter($$0x -> $$0x.e),
         ekt.a.fieldOf("root_provider").forGetter($$0x -> $$0x.f),
         ekn.a.optionalFieldOf("above_root_placement").forGetter($$0x -> $$0x.g)
      );
   }

   public ekq(bsj $$0, ekt $$1, Optional<ekn> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract ekr<?> a();

   public abstract boolean a(dhg var1, BiConsumer<jh, dxn> var2, bam var3, jh var4, jh var5, ejo var6);

   protected boolean a(dhg $$0, jh $$1) {
      return eia.c($$0, $$1);
   }

   protected void a(dhg $$0, BiConsumer<jh, dxn> $$1, bam $$2, jh $$3, ejo $$4) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, this.a($$0, $$3, this.f.a($$2, $$3)));
         if (this.g.isPresent()) {
            ekn $$5 = this.g.get();
            jh $$6 = $$3.d();
            if ($$2.i() < $$5.b() && $$0.a($$6, dxm.a::l)) {
               $$1.accept($$6, this.a($$0, $$6, $$5.a().a($$2, $$6)));
            }
         }
      }
   }

   protected dxn a(dhg $$0, jh $$1, dxn $$2) {
      if ($$2.b(dyd.D)) {
         boolean $$3 = $$0.b($$1, $$0x -> $$0x.a(aya.a));
         return $$2.b(dyd.D, Boolean.valueOf($$3));
      } else {
         return $$2;
      }
   }

   public jh a(jh $$0, bam $$1) {
      return $$0.b(this.e.a($$1));
   }
}
