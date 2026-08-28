import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dew(jv<bvi<?>> d, boolean e) implements dei {
   public static final MapCodec<dew> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kg.a(mc.z).fieldOf("entity").forGetter(dew::b), Codec.BOOL.optionalFieldOf("join_team", false).forGetter(dew::c)).apply($$0, dew::new)
   );

   @Override
   public void a(ard $$0, int $$1, ddq $$2, bva $$3, fbx $$4) {
      ji $$5 = ji.a((kb)$$4);
      if (dgz.l($$5)) {
         Optional<jr<bvi<?>>> $$6 = this.b().a($$0.C_());
         if (!$$6.isEmpty()) {
            bva $$7 = $$6.get().a().a($$0, $$5, bvh.k);
            if ($$7 != null) {
               if ($$7 instanceof bvx $$8 && $$2.c() instanceof are $$9) {
                  $$8.b($$9);
               }

               if (this.e && $$3.cq() != null) {
                  $$0.g().a($$7.cH(), $$3.cq());
               }

               $$7.b($$4.d, $$4.e, $$4.f, $$7.dK(), $$7.dM());
            }
         }
      }
   }

   @Override
   public MapCodec<dew> a() {
      return a;
   }

   public jv<bvi<?>> b() {
      return this.d;
   }

   public boolean c() {
      return this.e;
   }
}
