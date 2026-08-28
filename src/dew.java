import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dew(ju<bvm<?>> d, boolean e) implements dei {
   public static final MapCodec<dew> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kf.a(mb.z).fieldOf("entity").forGetter(dew::b), Codec.BOOL.optionalFieldOf("join_team", false).forGetter(dew::c)).apply($$0, dew::new)
   );

   @Override
   public void a(ash $$0, int $$1, ddq $$2, bvf $$3, fbs $$4) {
      jh $$5 = jh.a((ka)$$4);
      if (dha.l($$5)) {
         Optional<jq<bvm<?>>> $$6 = this.b().a($$0.H_());
         if (!$$6.isEmpty()) {
            bvf $$7 = $$6.get().a().a($$0, $$5, bvl.k);
            if ($$7 != null) {
               if ($$7 instanceof bwa $$8 && $$2.c() instanceof asi $$9) {
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
   public MapCodec<dew> a() {
      return a;
   }

   public ju<bvm<?>> b() {
      return this.d;
   }

   public boolean c() {
      return this.e;
   }
}
