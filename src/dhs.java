import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dhs(jk<bxe<?>> d, boolean e) implements dhe {
   public static final MapCodec<dhs> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(jv.a(mi.B).fieldOf("entity").forGetter(dhs::b), Codec.BOOL.optionalFieldOf("join_team", false).forGetter(dhs::c)).apply($$0, dhs::new)
   );

   @Override
   public void a(aru $$0, int $$1, dgm $$2, bwv $$3, ffs $$4) {
      iw $$5 = iw.a((jq)$$4);
      if (djz.l($$5)) {
         Optional<jg<bxe<?>>> $$6 = this.b().a($$0.G_());
         if (!$$6.isEmpty()) {
            bwv $$7 = $$6.get().a().a($$0, $$5, bxd.k);
            if ($$7 != null) {
               if ($$7 instanceof bxv $$8 && $$2.c() instanceof arv $$9) {
                  $$8.b($$9);
               }

               if (this.e && $$3.cq() != null) {
                  $$0.g().a($$7.cI(), $$3.cq());
               }

               $$7.b($$4.d, $$4.e, $$4.f, $$7.dL(), $$7.dN());
            }
         }
      }
   }

   @Override
   public MapCodec<dhs> a() {
      return a;
   }

   public jk<bxe<?>> b() {
      return this.d;
   }

   public boolean c() {
      return this.e;
   }
}
