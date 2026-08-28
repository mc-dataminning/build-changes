import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dfd(ju<bvq<?>> d, boolean e) implements dep {
   public static final MapCodec<dfd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kf.a(mb.z).fieldOf("entity").forGetter(dfd::b), Codec.BOOL.optionalFieldOf("join_team", false).forGetter(dfd::c)).apply($$0, dfd::new)
   );

   @Override
   public void a(ash $$0, int $$1, ddx $$2, bvj $$3, fbx $$4) {
      jh $$5 = jh.a((ka)$$4);
      if (dhh.l($$5)) {
         Optional<jq<bvq<?>>> $$6 = this.b().a($$0.H_());
         if (!$$6.isEmpty()) {
            bvj $$7 = $$6.get().a().a($$0, $$5, bvp.k);
            if ($$7 != null) {
               if ($$7 instanceof bwe $$8 && $$2.c() instanceof asi $$9) {
                  $$8.b($$9);
               }

               if (this.e && $$3.cr() != null) {
                  $$0.g().a($$7.cI(), $$3.cr());
               }

               $$7.b($$4.d, $$4.e, $$4.f, $$7.dM(), $$7.dO());
            }
         }
      }
   }

   @Override
   public MapCodec<dfd> a() {
      return a;
   }

   public ju<bvq<?>> b() {
      return this.d;
   }

   public boolean c() {
      return this.e;
   }
}
