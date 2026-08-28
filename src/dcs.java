import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dcs(js<bty<?>> d, boolean e) implements dce {
   public static final MapCodec<dcs> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kd.a(lw.z).fieldOf("entity").forGetter(dcs::b), Codec.BOOL.optionalFieldOf("join_team", false).forGetter(dcs::c)).apply($$0, dcs::new)
   );

   @Override
   public void a(arj $$0, int $$1, dbm $$2, btr $$3, eyw $$4) {
      jf $$5 = jf.a((jy)$$4);
      if (dej.l($$5)) {
         Optional<jo<bty<?>>> $$6 = this.b().a($$0.D_());
         if (!$$6.isEmpty()) {
            btr $$7 = $$6.get().a().a($$0, $$5, btx.k);
            if ($$7 != null) {
               if ($$7 instanceof bum $$8 && $$2.c() instanceof ark $$9) {
                  $$8.b($$9);
               }

               if (this.e && $$3.co() != null) {
                  $$0.f().a($$7.cF(), $$3.co());
               }

               $$7.b($$4.d, $$4.e, $$4.f, $$7.dI(), $$7.dK());
            }
         }
      }
   }

   @Override
   public MapCodec<dcs> a() {
      return a;
   }

   public js<bty<?>> b() {
      return this.d;
   }

   public boolean c() {
      return this.e;
   }
}
