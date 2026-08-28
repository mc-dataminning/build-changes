import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dcb(jr<btq<?>> d, boolean e) implements dbn {
   public static final MapCodec<dcb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kc.a(lv.z).fieldOf("entity").forGetter(dcb::b), Codec.BOOL.optionalFieldOf("join_team", false).forGetter(dcb::c)).apply($$0, dcb::new)
   );

   @Override
   public void a(arg $$0, int $$1, dav $$2, btj $$3, eye $$4) {
      je $$5 = je.a((jx)$$4);
      if (dds.l($$5)) {
         Optional<jn<btq<?>>> $$6 = this.b().a($$0.C_());
         if (!$$6.isEmpty()) {
            btj $$7 = $$6.get().a().a($$0, $$5, btp.k);
            if ($$7 != null) {
               if ($$7 instanceof bue $$8 && $$2.c() instanceof arh $$9) {
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
   public MapCodec<dcb> a() {
      return a;
   }

   public jr<btq<?>> b() {
      return this.d;
   }

   public boolean c() {
      return this.e;
   }
}
