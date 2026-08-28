import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;
import java.util.function.BiConsumer;

public abstract class eon {
   public static final Codec<eon> d = mg.W.q().dispatch(eon::a, eoo::a);
   protected final btw e;
   protected final eoq f;
   protected final Optional<eok> g;

   protected static <P extends eon> P3<Mu<P>, btw, eoq, Optional<eok>> a(Instance<P> $$0) {
      return $$0.group(
         btw.c.fieldOf("trunk_offset_y").forGetter($$0x -> $$0x.e),
         eoq.a.fieldOf("root_provider").forGetter($$0x -> $$0x.f),
         eok.a.optionalFieldOf("above_root_placement").forGetter($$0x -> $$0x.g)
      );
   }

   public eon(btw $$0, eoq $$1, Optional<eok> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract eoo<?> a();

   public abstract boolean a(dkd var1, BiConsumer<iv, ebe> var2, azx var3, iv var4, iv var5, enl var6);

   protected boolean a(dkd $$0, iv $$1) {
      return elw.d($$0, $$1);
   }

   protected void a(dkd $$0, BiConsumer<iv, ebe> $$1, azx $$2, iv $$3, enl $$4) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, this.a($$0, $$3, this.f.a($$2, $$3)));
         if (this.g.isPresent()) {
            eok $$5 = this.g.get();
            iv $$6 = $$3.d();
            if ($$2.i() < $$5.b() && $$0.a($$6, ebd.a::l)) {
               $$1.accept($$6, this.a($$0, $$6, $$5.a().a($$2, $$6)));
            }
         }
      }
   }

   protected ebe a(dkd $$0, iv $$1, ebe $$2) {
      if ($$2.b(ebu.I)) {
         boolean $$3 = $$0.b($$1, $$0x -> $$0x.a(axj.a));
         return $$2.b(ebu.I, Boolean.valueOf($$3));
      } else {
         return $$2;
      }
   }

   public iv a(iv $$0, azx $$1) {
      return $$0.b(this.e.a($$1));
   }
}
