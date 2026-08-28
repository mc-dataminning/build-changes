import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dgq(ji<bwm<?>> d, boolean e) implements dgc {
   public static final MapCodec<dgq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(jt.a(mg.B).fieldOf("entity").forGetter(dgq::b), Codec.BOOL.optionalFieldOf("join_team", false).forGetter(dgq::c)).apply($$0, dgq::new)
   );

   @Override
   public void a(arq $$0, int $$1, dfk $$2, bwd $$3, fei $$4) {
      iu $$5 = iu.a((jo)$$4);
      if (div.l($$5)) {
         Optional<je<bwm<?>>> $$6 = this.b().a($$0.C_());
         if (!$$6.isEmpty()) {
            bwd $$7 = $$6.get().a().a($$0, $$5, bwl.k);
            if ($$7 != null) {
               if ($$7 instanceof bxb $$8 && $$2.c() instanceof arr $$9) {
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
   public MapCodec<dgq> a() {
      return a;
   }

   public ji<bwm<?>> b() {
      return this.d;
   }

   public boolean c() {
      return this.e;
   }
}
