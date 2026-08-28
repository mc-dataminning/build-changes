import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dcr(jt<bug<?>> d, boolean e) implements dcd {
   public static final MapCodec<dcr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ke.a(ly.z).fieldOf("entity").forGetter(dcr::b), Codec.BOOL.optionalFieldOf("join_team", false).forGetter(dcr::c)).apply($$0, dcr::new)
   );

   @Override
   public void a(arm $$0, int $$1, dbl $$2, btz $$3, ezh $$4) {
      jg $$5 = jg.a((jz)$$4);
      if (dev.l($$5)) {
         Optional<jp<bug<?>>> $$6 = this.b().a($$0.E_());
         if (!$$6.isEmpty()) {
            btz $$7 = $$6.get().a().a($$0, $$5, buf.k);
            if ($$7 != null) {
               if ($$7 instanceof buu $$8 && $$2.c() instanceof arn $$9) {
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
   public MapCodec<dcr> a() {
      return a;
   }

   public jt<bug<?>> b() {
      return this.d;
   }

   public boolean c() {
      return this.e;
   }
}
