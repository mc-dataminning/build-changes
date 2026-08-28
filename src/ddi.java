import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ddi(ju<bus<?>> d, boolean e) implements dcu {
   public static final MapCodec<ddi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kf.a(ma.z).fieldOf("entity").forGetter(ddi::b), Codec.BOOL.optionalFieldOf("join_team", false).forGetter(ddi::c)).apply($$0, ddi::new)
   );

   @Override
   public void a(arp $$0, int $$1, dcc $$2, bul $$3, ezy $$4) {
      jh $$5 = jh.a((ka)$$4);
      if (dfm.l($$5)) {
         Optional<jq<bus<?>>> $$6 = this.b().a($$0.G_());
         if (!$$6.isEmpty()) {
            bul $$7 = $$6.get().a().a($$0, $$5, bur.k);
            if ($$7 != null) {
               if ($$7 instanceof bvg $$8 && $$2.c() instanceof arq $$9) {
                  $$8.b($$9);
               }

               if (this.e && $$3.cr() != null) {
                  $$0.g().a($$7.cI(), $$3.cr());
               }

               $$7.b($$4.d, $$4.e, $$4.f, $$7.dL(), $$7.dN());
            }
         }
      }
   }

   @Override
   public MapCodec<ddi> a() {
      return a;
   }

   public ju<bus<?>> b() {
      return this.d;
   }

   public boolean c() {
      return this.e;
   }
}
