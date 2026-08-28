import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dfm(jw<bwb<?>> d, boolean e) implements dey {
   public static final MapCodec<dfm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kh.a(me.z).fieldOf("entity").forGetter(dfm::b), Codec.BOOL.optionalFieldOf("join_team", false).forGetter(dfm::c)).apply($$0, dfm::new)
   );

   @Override
   public void a(arn $$0, int $$1, deg $$2, bvs $$3, fcu $$4) {
      jj $$5 = jj.a((kc)$$4);
      if (dhp.l($$5)) {
         Optional<js<bwb<?>>> $$6 = this.b().a($$0.C_());
         if (!$$6.isEmpty()) {
            bvs $$7 = $$6.get().a().a($$0, $$5, bwa.k);
            if ($$7 != null) {
               if ($$7 instanceof bwq $$8 && $$2.c() instanceof aro $$9) {
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
   public MapCodec<dfm> a() {
      return a;
   }

   public jw<bwb<?>> b() {
      return this.d;
   }

   public boolean c() {
      return this.e;
   }
}
