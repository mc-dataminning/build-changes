import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dbe(jq<bsw<?>> d, boolean e) implements daq {
   public static final MapCodec<dbe> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kb.a(lu.z).fieldOf("entity").forGetter(dbe::b), Codec.BOOL.optionalFieldOf("join_team", false).forGetter(dbe::c)).apply($$0, dbe::new)
   );

   @Override
   public void a(aqt $$0, int $$1, czz $$2, bsq $$3, eww $$4) {
      jd $$5 = jd.a((jw)$$4);
      if (dcu.l($$5)) {
         Optional<jm<bsw<?>>> $$6 = this.b().a($$0.E_());
         if (!$$6.isEmpty()) {
            bsq $$7 = $$6.get().a().a($$0, $$5, btp.k);
            if ($$7 != null) {
               if ($$7 instanceof btk $$8 && $$2.c() instanceof aqu $$9) {
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
   public MapCodec<dbe> a() {
      return a;
   }

   public jq<bsw<?>> b() {
      return this.d;
   }

   public boolean c() {
      return this.e;
   }
}
