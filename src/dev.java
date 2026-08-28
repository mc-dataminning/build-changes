import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dev(ju<bvi<?>> d, boolean e) implements deh {
   public static final MapCodec<dev> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kf.a(mb.z).fieldOf("entity").forGetter(dev::b), Codec.BOOL.optionalFieldOf("join_team", false).forGetter(dev::c)).apply($$0, dev::new)
   );

   @Override
   public void a(arx $$0, int $$1, ddp $$2, bvb $$3, fbr $$4) {
      jh $$5 = jh.a((ka)$$4);
      if (dgz.l($$5)) {
         Optional<jq<bvi<?>>> $$6 = this.b().a($$0.H_());
         if (!$$6.isEmpty()) {
            bvb $$7 = $$6.get().a().a($$0, $$5, bvh.k);
            if ($$7 != null) {
               if ($$7 instanceof bvw $$8 && $$2.c() instanceof ary $$9) {
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
   public MapCodec<dev> a() {
      return a;
   }

   public ju<bvi<?>> b() {
      return this.d;
   }

   public boolean c() {
      return this.e;
   }
}
