import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dcp(jr<btv<?>> d, boolean e) implements dcb {
   public static final MapCodec<dcp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kc.a(lv.z).fieldOf("entity").forGetter(dcp::b), Codec.BOOL.optionalFieldOf("join_team", false).forGetter(dcp::c)).apply($$0, dcp::new)
   );

   @Override
   public void a(arh $$0, int $$1, dbj $$2, bto $$3, eys $$4) {
      je $$5 = je.a((jx)$$4);
      if (deg.l($$5)) {
         Optional<jn<btv<?>>> $$6 = this.b().a($$0.C_());
         if (!$$6.isEmpty()) {
            bto $$7 = $$6.get().a().a($$0, $$5, btu.k);
            if ($$7 != null) {
               if ($$7 instanceof buj $$8 && $$2.c() instanceof ari $$9) {
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
   public MapCodec<dcp> a() {
      return a;
   }

   public jr<btv<?>> b() {
      return this.d;
   }

   public boolean c() {
      return this.e;
   }
}
