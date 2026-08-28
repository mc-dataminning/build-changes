import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dfe(ju<bvr<?>> d, boolean e) implements deq {
   public static final MapCodec<dfe> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kf.a(mb.z).fieldOf("entity").forGetter(dfe::b), Codec.BOOL.optionalFieldOf("join_team", false).forGetter(dfe::c)).apply($$0, dfe::new)
   );

   @Override
   public void a(ash $$0, int $$1, ddy $$2, bvk $$3, fby $$4) {
      jh $$5 = jh.a((ka)$$4);
      if (dhi.l($$5)) {
         Optional<jq<bvr<?>>> $$6 = this.b().a($$0.H_());
         if (!$$6.isEmpty()) {
            bvk $$7 = $$6.get().a().a($$0, $$5, bvq.k);
            if ($$7 != null) {
               if ($$7 instanceof bwf $$8 && $$2.c() instanceof asi $$9) {
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
   public MapCodec<dfe> a() {
      return a;
   }

   public ju<bvr<?>> b() {
      return this.d;
   }

   public boolean c() {
      return this.e;
   }
}
