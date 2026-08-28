import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;
import java.util.function.BiConsumer;

public abstract class eoa {
   public static final Codec<eoa> d = mg.W.q().dispatch(eoa::a, eob::a);
   protected final btl e;
   protected final eod f;
   protected final Optional<enx> g;

   protected static <P extends eoa> P3<Mu<P>, btl, eod, Optional<enx>> a(Instance<P> $$0) {
      return $$0.group(
         btl.c.fieldOf("trunk_offset_y").forGetter($$0x -> $$0x.e),
         eod.a.fieldOf("root_provider").forGetter($$0x -> $$0x.f),
         enx.a.optionalFieldOf("above_root_placement").forGetter($$0x -> $$0x.g)
      );
   }

   public eoa(btl $$0, eod $$1, Optional<enx> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract eob<?> a();

   public abstract boolean a(djs var1, BiConsumer<iv, eat> var2, azv var3, iv var4, iv var5, emy var6);

   protected boolean a(djs $$0, iv $$1) {
      return elk.d($$0, $$1);
   }

   protected void a(djs $$0, BiConsumer<iv, eat> $$1, azv $$2, iv $$3, emy $$4) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, this.a($$0, $$3, this.f.a($$2, $$3)));
         if (this.g.isPresent()) {
            enx $$5 = this.g.get();
            iv $$6 = $$3.d();
            if ($$2.i() < $$5.b() && $$0.a($$6, eas.a::l)) {
               $$1.accept($$6, this.a($$0, $$6, $$5.a().a($$2, $$6)));
            }
         }
      }
   }

   protected eat a(djs $$0, iv $$1, eat $$2) {
      if ($$2.b(ebj.I)) {
         boolean $$3 = $$0.b($$1, $$0x -> $$0x.a(axh.a));
         return $$2.b(ebj.I, Boolean.valueOf($$3));
      } else {
         return $$2;
      }
   }

   public iv a(iv $$0, azv $$1) {
      return $$0.b(this.e.a($$1));
   }
}
