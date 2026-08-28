import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record daq(jn<bsn<?>> d, boolean e) implements dac {
   public static final MapCodec<daq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(jy.a(lr.z).fieldOf("entity").forGetter(daq::b), Codec.BOOL.optionalFieldOf("join_team", false).forGetter(daq::c)).apply($$0, daq::new)
   );

   @Override
   public void a(aqm $$0, int $$1, czl $$2, bsh $$3, ewh $$4) {
      ja $$5 = ja.a($$4);
      if (dcg.l($$5)) {
         Optional<jj<bsn<?>>> $$6 = this.b().a($$0.E_());
         if (!$$6.isEmpty()) {
            bsh $$7 = $$6.get().a().a($$0, $$5, btg.k);
            if ($$7 != null) {
               if ($$7 instanceof btb $$8 && $$2.c() instanceof aqn $$9) {
                  $$8.b($$9);
               }

               if (this.e && $$3.cl() != null) {
                  $$0.f().a($$7.cD(), $$3.cl());
               }

               $$7.b($$4.c, $$4.d, $$4.e, $$7.dH(), $$7.dJ());
            }
         }
      }
   }

   @Override
   public MapCodec<daq> a() {
      return a;
   }

   public jn<bsn<?>> b() {
      return this.d;
   }

   public boolean c() {
      return this.e;
   }
}
