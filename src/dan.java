import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dan(jn<bsj<?>> d, boolean e) implements czz {
   public static final MapCodec<dan> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(jy.a(lr.z).fieldOf("entity").forGetter(dan::b), Codec.BOOL.optionalFieldOf("join_team", false).forGetter(dan::c)).apply($$0, dan::new)
   );

   @Override
   public void a(aqk $$0, int $$1, czi $$2, bsd $$3, evz $$4) {
      ja $$5 = ja.a($$4);
      if (dcd.l($$5)) {
         Optional<jj<bsj<?>>> $$6 = this.b().a($$0.E_());
         if (!$$6.isEmpty()) {
            bsd $$7 = $$6.get().a().a($$0, $$5, btc.k);
            if ($$7 != null) {
               if ($$7 instanceof bsx $$8 && $$3 instanceof aql $$9) {
                  $$8.b($$9);
               }

               if (this.e && $$3.cj() != null) {
                  $$0.f().a($$7.cB(), $$3.cj());
               }

               $$7.b($$4.c, $$4.d, $$4.e, $$7.dF(), $$7.dH());
            }
         }
      }
   }

   @Override
   public MapCodec<dan> a() {
      return a;
   }

   public jn<bsj<?>> b() {
      return this.d;
   }

   public boolean c() {
      return this.e;
   }
}
