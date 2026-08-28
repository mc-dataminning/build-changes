import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record def(jv<but<?>> d, boolean e) implements ddr {
   public static final MapCodec<def> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kg.a(mc.z).fieldOf("entity").forGetter(def::b), Codec.BOOL.optionalFieldOf("join_team", false).forGetter(def::c)).apply($$0, def::new)
   );

   @Override
   public void a(ard $$0, int $$1, dcz $$2, bum $$3, fbb $$4) {
      ji $$5 = ji.a((kb)$$4);
      if (dgj.l($$5)) {
         Optional<jr<but<?>>> $$6 = this.b().a($$0.H_());
         if (!$$6.isEmpty()) {
            bum $$7 = $$6.get().a().a($$0, $$5, bus.k);
            if ($$7 != null) {
               if ($$7 instanceof bvh $$8 && $$2.c() instanceof are $$9) {
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
   public MapCodec<def> a() {
      return a;
   }

   public jv<but<?>> b() {
      return this.d;
   }

   public boolean c() {
      return this.e;
   }
}
