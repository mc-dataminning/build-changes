import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;
import java.util.function.BiConsumer;

public abstract class eky {
   public static final Codec<eky> d = ma.W.q().dispatch(eky::a, ekz::a);
   protected final bso e;
   protected final elb f;
   protected final Optional<ekv> g;

   protected static <P extends eky> P3<Mu<P>, bso, elb, Optional<ekv>> a(Instance<P> $$0) {
      return $$0.group(
         bso.c.fieldOf("trunk_offset_y").forGetter($$0x -> $$0x.e),
         elb.a.fieldOf("root_provider").forGetter($$0x -> $$0x.f),
         ekv.a.optionalFieldOf("above_root_placement").forGetter($$0x -> $$0x.g)
      );
   }

   public eky(bso $$0, elb $$1, Optional<ekv> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract ekz<?> a();

   public abstract boolean a(dho var1, BiConsumer<jh, dxv> var2, bam var3, jh var4, jh var5, ejw var6);

   protected boolean a(dho $$0, jh $$1) {
      return eii.c($$0, $$1);
   }

   protected void a(dho $$0, BiConsumer<jh, dxv> $$1, bam $$2, jh $$3, ejw $$4) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, this.a($$0, $$3, this.f.a($$2, $$3)));
         if (this.g.isPresent()) {
            ekv $$5 = this.g.get();
            jh $$6 = $$3.d();
            if ($$2.i() < $$5.b() && $$0.a($$6, dxu.a::l)) {
               $$1.accept($$6, this.a($$0, $$6, $$5.a().a($$2, $$6)));
            }
         }
      }
   }

   protected dxv a(dho $$0, jh $$1, dxv $$2) {
      if ($$2.b(dyl.D)) {
         boolean $$3 = $$0.b($$1, $$0x -> $$0x.a(aya.a));
         return $$2.b(dyl.D, Boolean.valueOf($$3));
      } else {
         return $$2;
      }
   }

   public jh a(jh $$0, bam $$1) {
      return $$0.b(this.e.a($$1));
   }
}
