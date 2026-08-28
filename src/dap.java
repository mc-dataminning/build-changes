import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dap(jn<bsm<?>> d, boolean e) implements dab {
   public static final MapCodec<dap> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(jy.a(lr.z).fieldOf("entity").forGetter(dap::b), Codec.BOOL.optionalFieldOf("join_team", false).forGetter(dap::c)).apply($$0, dap::new)
   );

   @Override
   public void a(aqm $$0, int $$1, czk $$2, bsg $$3, ewf $$4) {
      ja $$5 = ja.a($$4);
      if (dcf.l($$5)) {
         Optional<jj<bsm<?>>> $$6 = this.b().a($$0.E_());
         if (!$$6.isEmpty()) {
            bsg $$7 = $$6.get().a().a($$0, $$5, btf.k);
            if ($$7 != null) {
               if ($$7 instanceof bta $$8 && $$3 instanceof aqn $$9) {
                  $$8.b($$9);
               }

               if (this.e && $$3.ck() != null) {
                  $$0.f().a($$7.cC(), $$3.ck());
               }

               $$7.b($$4.c, $$4.d, $$4.e, $$7.dG(), $$7.dI());
            }
         }
      }
   }

   @Override
   public MapCodec<dap> a() {
      return a;
   }

   public jn<bsm<?>> b() {
      return this.d;
   }

   public boolean c() {
      return this.e;
   }
}
