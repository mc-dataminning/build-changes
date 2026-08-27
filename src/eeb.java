import com.mojang.datafixers.Products.P3;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Optional;
import java.util.function.BiConsumer;

public abstract class eeb {
   public static final Codec<eeb> d = le.Y.q().dispatch(eeb::a, eec::a);
   protected final bpb e;
   protected final eee f;
   protected final Optional<edy> g;

   protected static <P extends eeb> P3<Mu<P>, bpb, eee, Optional<edy>> a(Instance<P> $$0) {
      return $$0.group(
         bpb.c.fieldOf("trunk_offset_y").forGetter($$0x -> $$0x.e),
         eee.a.fieldOf("root_provider").forGetter($$0x -> $$0x.f),
         edy.a.optionalFieldOf("above_root_placement").forGetter($$0x -> $$0x.g)
      );
   }

   public eeb(bpb $$0, eee $$1, Optional<edy> $$2) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
   }

   protected abstract eec<?> a();

   public abstract boolean a(dbf var1, BiConsumer<io, drd> var2, aym var3, io var4, io var5, ecz var6);

   protected boolean a(dbf $$0, io $$1) {
      return ebl.c($$0, $$1);
   }

   protected void a(dbf $$0, BiConsumer<io, drd> $$1, aym $$2, io $$3, ecz $$4) {
      if (this.a($$0, $$3)) {
         $$1.accept($$3, this.a($$0, $$3, this.f.a($$2, $$3)));
         if (this.g.isPresent()) {
            edy $$5 = this.g.get();
            io $$6 = $$3.c();
            if ($$2.i() < $$5.b() && $$0.a($$6, drc.a::i)) {
               $$1.accept($$6, this.a($$0, $$6, $$5.a().a($$2, $$6)));
            }
         }
      }
   }

   protected drd a(dbf $$0, io $$1, drd $$2) {
      if ($$2.b(drt.C)) {
         boolean $$3 = $$0.b($$1, $$0x -> $$0x.a(awc.a));
         return $$2.a(drt.C, Boolean.valueOf($$3));
      } else {
         return $$2;
      }
   }

   public io a(io $$0, aym $$1) {
      return $$0.b(this.e.a($$1));
   }
}
