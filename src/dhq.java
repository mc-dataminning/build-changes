import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dhq(jj<bxc<?>> d, boolean e) implements dhc {
   public static final MapCodec<dhq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ju.a(mh.B).fieldOf("entity").forGetter(dhq::b), Codec.BOOL.optionalFieldOf("join_team", false).forGetter(dhq::c)).apply($$0, dhq::new)
   );

   @Override
   public void a(ars $$0, int $$1, dgk $$2, bwt $$3, ffq $$4) {
      iv $$5 = iv.a((jp)$$4);
      if (djx.l($$5)) {
         Optional<jf<bxc<?>>> $$6 = this.b().a($$0.G_());
         if (!$$6.isEmpty()) {
            bwt $$7 = $$6.get().a().a($$0, $$5, bxb.k);
            if ($$7 != null) {
               if ($$7 instanceof bxt $$8 && $$2.c() instanceof art $$9) {
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
   public MapCodec<dhq> a() {
      return a;
   }

   public jj<bxc<?>> b() {
      return this.d;
   }

   public boolean c() {
      return this.e;
   }
}
