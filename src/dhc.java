import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dhc(jj<bwr<?>> d, boolean e) implements dgo {
   public static final MapCodec<dhc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ju.a(mh.B).fieldOf("entity").forGetter(dhc::b), Codec.BOOL.optionalFieldOf("join_team", false).forGetter(dhc::c)).apply($$0, dhc::new)
   );

   @Override
   public void a(arq $$0, int $$1, dfw $$2, bwi $$3, fex $$4) {
      iv $$5 = iv.a((jp)$$4);
      if (djh.l($$5)) {
         Optional<jf<bwr<?>>> $$6 = this.b().a($$0.C_());
         if (!$$6.isEmpty()) {
            bwi $$7 = $$6.get().a().a($$0, $$5, bwq.k);
            if ($$7 != null) {
               if ($$7 instanceof bxi $$8 && $$2.c() instanceof arr $$9) {
                  $$8.b($$9);
               }

               if (this.e && $$3.cp() != null) {
                  $$0.g().a($$7.cH(), $$3.cp());
               }

               $$7.b($$4.d, $$4.e, $$4.f, $$7.dK(), $$7.dM());
            }
         }
      }
   }

   @Override
   public MapCodec<dhc> a() {
      return a;
   }

   public jj<bwr<?>> b() {
      return this.d;
   }

   public boolean c() {
      return this.e;
   }
}
