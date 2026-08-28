import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dec(jv<buq<?>> d, boolean e) implements ddo {
   public static final MapCodec<dec> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kg.a(mc.z).fieldOf("entity").forGetter(dec::b), Codec.BOOL.optionalFieldOf("join_team", false).forGetter(dec::c)).apply($$0, dec::new)
   );

   @Override
   public void a(arc $$0, int $$1, dcw $$2, buj $$3, fay $$4) {
      ji $$5 = ji.a((kb)$$4);
      if (dgg.l($$5)) {
         Optional<jr<buq<?>>> $$6 = this.b().a($$0.H_());
         if (!$$6.isEmpty()) {
            buj $$7 = $$6.get().a().a($$0, $$5, bup.k);
            if ($$7 != null) {
               if ($$7 instanceof bve $$8 && $$2.c() instanceof ard $$9) {
                  $$8.b($$9);
               }

               if (this.e && $$3.cr() != null) {
                  $$0.g().a($$7.cI(), $$3.cr());
               }

               $$7.b($$4.d, $$4.e, $$4.f, $$7.dM(), $$7.dO());
            }
         }
      }
   }

   @Override
   public MapCodec<dec> a() {
      return a;
   }

   public jv<buq<?>> b() {
      return this.d;
   }

   public boolean c() {
      return this.e;
   }
}
