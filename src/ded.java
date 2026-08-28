import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ded(jv<bur<?>> d, boolean e) implements ddp {
   public static final MapCodec<ded> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kg.a(mc.z).fieldOf("entity").forGetter(ded::b), Codec.BOOL.optionalFieldOf("join_team", false).forGetter(ded::c)).apply($$0, ded::new)
   );

   @Override
   public void a(ard $$0, int $$1, dcx $$2, buk $$3, faz $$4) {
      ji $$5 = ji.a((kb)$$4);
      if (dgh.l($$5)) {
         Optional<jr<bur<?>>> $$6 = this.b().a($$0.H_());
         if (!$$6.isEmpty()) {
            buk $$7 = $$6.get().a().a($$0, $$5, buq.k);
            if ($$7 != null) {
               if ($$7 instanceof bvf $$8 && $$2.c() instanceof are $$9) {
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
   public MapCodec<ded> a() {
      return a;
   }

   public jv<bur<?>> b() {
      return this.d;
   }

   public boolean c() {
      return this.e;
   }
}
