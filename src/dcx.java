import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dcx(ju<bul<?>> d, boolean e) implements dcj {
   public static final MapCodec<dcx> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kf.a(lz.z).fieldOf("entity").forGetter(dcx::b), Codec.BOOL.optionalFieldOf("join_team", false).forGetter(dcx::c)).apply($$0, dcx::new)
   );

   @Override
   public void a(arn $$0, int $$1, dbr $$2, bue $$3, ezn $$4) {
      jh $$5 = jh.a((ka)$$4);
      if (dfb.l($$5)) {
         Optional<jq<bul<?>>> $$6 = this.b().a($$0.E_());
         if (!$$6.isEmpty()) {
            bue $$7 = $$6.get().a().a($$0, $$5, buk.k);
            if ($$7 != null) {
               if ($$7 instanceof buz $$8 && $$2.c() instanceof aro $$9) {
                  $$8.b($$9);
               }

               if (this.e && $$3.cs() != null) {
                  $$0.f().a($$7.cJ(), $$3.cs());
               }

               $$7.b($$4.d, $$4.e, $$4.f, $$7.dN(), $$7.dP());
            }
         }
      }
   }

   @Override
   public MapCodec<dcx> a() {
      return a;
   }

   public ju<bul<?>> b() {
      return this.d;
   }

   public boolean c() {
      return this.e;
   }
}
