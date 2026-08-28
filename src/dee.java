import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dee(jv<bus<?>> d, boolean e) implements ddq {
   public static final MapCodec<dee> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kg.a(mc.z).fieldOf("entity").forGetter(dee::b), Codec.BOOL.optionalFieldOf("join_team", false).forGetter(dee::c)).apply($$0, dee::new)
   );

   @Override
   public void a(ard $$0, int $$1, dcy $$2, bul $$3, fba $$4) {
      ji $$5 = ji.a((kb)$$4);
      if (dgi.l($$5)) {
         Optional<jr<bus<?>>> $$6 = this.b().a($$0.H_());
         if (!$$6.isEmpty()) {
            bul $$7 = $$6.get().a().a($$0, $$5, bur.k);
            if ($$7 != null) {
               if ($$7 instanceof bvg $$8 && $$2.c() instanceof are $$9) {
                  $$8.b($$9);
               }

               if (this.e && $$3.cr() != null) {
                  $$0.g().a($$7.cI(), $$3.cr());
               }

               $$7.b($$4.d, $$4.e, $$4.f, $$7.dL(), $$7.dN());
            }
         }
      }
   }

   @Override
   public MapCodec<dee> a() {
      return a;
   }

   public jv<bus<?>> b() {
      return this.d;
   }

   public boolean c() {
      return this.e;
   }
}
