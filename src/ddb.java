import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ddb(ju<bup<?>> d, boolean e) implements dcn {
   public static final MapCodec<ddb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kf.a(ma.z).fieldOf("entity").forGetter(ddb::b), Codec.BOOL.optionalFieldOf("join_team", false).forGetter(ddb::c)).apply($$0, ddb::new)
   );

   @Override
   public void a(arq $$0, int $$1, dbv $$2, bui $$3, ezr $$4) {
      jh $$5 = jh.a((ka)$$4);
      if (dff.l($$5)) {
         Optional<jq<bup<?>>> $$6 = this.b().a($$0.E_());
         if (!$$6.isEmpty()) {
            bui $$7 = $$6.get().a().a($$0, $$5, buo.k);
            if ($$7 != null) {
               if ($$7 instanceof bvd $$8 && $$2.c() instanceof arr $$9) {
                  $$8.b($$9);
               }

               if (this.e && $$3.ct() != null) {
                  $$0.f().a($$7.cK(), $$3.ct());
               }

               $$7.b($$4.d, $$4.e, $$4.f, $$7.dO(), $$7.dQ());
            }
         }
      }
   }

   @Override
   public MapCodec<ddb> a() {
      return a;
   }

   public ju<bup<?>> b() {
      return this.d;
   }

   public boolean c() {
      return this.e;
   }
}
