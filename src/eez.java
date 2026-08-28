import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;
import java.util.function.BiConsumer;

public abstract class eez {
   public static final Codec<eez> d = lp.Y.q().dispatch(eez::a, efa::a);
   protected final bpy e;
   protected final efc f;
   protected final Optional<eew> g;

   protected static <P extends eez> P3<Mu<P>, bpy, efc, Optional<eew>> a(Instance<P> $$0) {
      return $$0.group(
         bpy.c.fieldOf("trunk_offset_y").forGetter($$0x -> $$0x.e),
         efc.a.fieldOf("root_provider").forGetter($$0x -> $$0x.f),
         eew.a.optionalFieldOf("above_root_placement").forGetter($$0x -> $$0x.g)
      );
   }

   public eez(bpy $$0, efc $$1, Optional<eew> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract efa<?> a();

   public abstract boolean a(dcd var1, BiConsumer<iz, dsb> var2, azg var3, iz var4, iz var5, edx var6);

   protected boolean a(dcd $$0, iz $$1) {
      return ecj.c($$0, $$1);
   }

   protected void a(dcd $$0, BiConsumer<iz, dsb> $$1, azg $$2, iz $$3, edx $$4) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, this.a($$0, $$3, this.f.a($$2, $$3)));
         if (this.g.isPresent()) {
            eew $$5 = this.g.get();
            iz $$6 = $$3.c();
            if ($$2.i() < $$5.b() && $$0.a($$6, dsa.a::i)) {
               $$1.accept($$6, this.a($$0, $$6, $$5.a().a($$2, $$6)));
            }
         }
      }
   }

   protected dsb a(dcd $$0, iz $$1, dsb $$2) {
      if ($$2.b(dsr.C)) {
         boolean $$3 = $$0.b($$1, $$0x -> $$0x.a(awu.a));
         return $$2.a(dsr.C, Boolean.valueOf($$3));
      } else {
         return $$2;
      }
   }

   public iz a(iz $$0, azg $$1) {
      return $$0.b(this.e.a($$1));
   }
}
