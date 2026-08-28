import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dgv(ji<bwo<?>> d, boolean e) implements dgh {
   public static final MapCodec<dgv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(jt.a(mg.B).fieldOf("entity").forGetter(dgv::b), Codec.BOOL.optionalFieldOf("join_team", false).forGetter(dgv::c)).apply($$0, dgv::new)
   );

   @Override
   public void a(arq $$0, int $$1, dfp $$2, bwf $$3, feq $$4) {
      iu $$5 = iu.a((jo)$$4);
      if (dja.l($$5)) {
         Optional<je<bwo<?>>> $$6 = this.b().a($$0.C_());
         if (!$$6.isEmpty()) {
            bwf $$7 = $$6.get().a().a($$0, $$5, bwn.k);
            if ($$7 != null) {
               if ($$7 instanceof bxd $$8 && $$2.c() instanceof arr $$9) {
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
   public MapCodec<dgv> a() {
      return a;
   }

   public ji<bwo<?>> b() {
      return this.d;
   }

   public boolean c() {
      return this.e;
   }
}
