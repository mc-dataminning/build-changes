import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dic(jk<bxn<?>> d, boolean e) implements dho {
   public static final MapCodec<dic> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(jv.a(mi.B).fieldOf("entity").forGetter(dic::b), Codec.BOOL.optionalFieldOf("join_team", false).forGetter(dic::c)).apply($$0, dic::new)
   );

   @Override
   public void a(asb $$0, int $$1, dgw $$2, bxe $$3, fgc $$4) {
      iw $$5 = iw.a((jq)$$4);
      if (dkj.l($$5)) {
         Optional<jg<bxn<?>>> $$6 = this.b().a($$0.G_());
         if (!$$6.isEmpty()) {
            bxe $$7 = $$6.get().a().a($$0, $$5, bxm.k);
            if ($$7 != null) {
               if ($$7 instanceof bye $$8 && $$2.c() instanceof asc $$9) {
                  $$8.b($$9);
               }

               if (this.e && $$3.cq() != null) {
                  $$0.g().a($$7.cI(), $$3.cq());
               }

               $$7.b($$4.d, $$4.e, $$4.f, $$7.dL(), $$7.dN());
            }
         }
      }
   }

   @Override
   public MapCodec<dic> a() {
      return a;
   }

   public jk<bxn<?>> b() {
      return this.d;
   }

   public boolean c() {
      return this.e;
   }
}
