import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;
import java.util.function.BiConsumer;

public abstract class ekw {
   public static final Codec<ekw> d = mb.W.q().dispatch(ekw::a, ekx::a);
   protected final bsd e;
   protected final ekz f;
   protected final Optional<ekt> g;

   protected static <P extends ekw> P3<Mu<P>, bsd, ekz, Optional<ekt>> a(Instance<P> $$0) {
      return $$0.group(
         bsd.c.fieldOf("trunk_offset_y").forGetter($$0x -> $$0x.e),
         ekz.a.fieldOf("root_provider").forGetter($$0x -> $$0x.f),
         ekt.a.optionalFieldOf("above_root_placement").forGetter($$0x -> $$0x.g)
      );
   }

   public ekw(bsd $$0, ekz $$1, Optional<ekt> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract ekx<?> a();

   public abstract boolean a(dhf var1, BiConsumer<ji, dxq> var2, azh var3, ji var4, ji var5, eju var6);

   protected boolean a(dhf $$0, ji $$1) {
      return eig.d($$0, $$1);
   }

   protected void a(dhf $$0, BiConsumer<ji, dxq> $$1, azh $$2, ji $$3, eju $$4) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, this.a($$0, $$3, this.f.a($$2, $$3)));
         if (this.g.isPresent()) {
            ekt $$5 = this.g.get();
            ji $$6 = $$3.d();
            if ($$2.i() < $$5.b() && $$0.a($$6, dxp.a::l)) {
               $$1.accept($$6, this.a($$0, $$6, $$5.a().a($$2, $$6)));
            }
         }
      }
   }

   protected dxq a(dhf $$0, ji $$1, dxq $$2) {
      if ($$2.b(dyg.I)) {
         boolean $$3 = $$0.b($$1, $$0x -> $$0x.a(awv.a));
         return $$2.b(dyg.I, Boolean.valueOf($$3));
      } else {
         return $$2;
      }
   }

   public ji a(ji $$0, azh $$1) {
      return $$0.b(this.e.a($$1));
   }
}
