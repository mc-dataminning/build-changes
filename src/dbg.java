import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dbg(jq<bsx<?>> d, boolean e) implements das {
   public static final MapCodec<dbg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(kb.a(lu.z).fieldOf("entity").forGetter(dbg::b), Codec.BOOL.optionalFieldOf("join_team", false).forGetter(dbg::c)).apply($$0, dbg::new)
   );

   @Override
   public void a(aqu $$0, int $$1, dab $$2, bsr $$3, exc $$4) {
      jd $$5 = jd.a((jw)$$4);
      if (dcw.l($$5)) {
         Optional<jm<bsx<?>>> $$6 = this.b().a($$0.E_());
         if (!$$6.isEmpty()) {
            bsr $$7 = $$6.get().a().a($$0, $$5, btr.k);
            if ($$7 != null) {
               if ($$7 instanceof btm $$8 && $$2.c() instanceof aqv $$9) {
                  $$8.b($$9);
               }

               if (this.e && $$3.ck() != null) {
                  $$0.f().a($$7.cB(), $$3.ck());
               }

               $$7.b($$4.c, $$4.d, $$4.e, $$7.dE(), $$7.dG());
            }
         }
      }
   }

   @Override
   public MapCodec<dbg> a() {
      return a;
   }

   public jq<bsx<?>> b() {
      return this.d;
   }

   public boolean c() {
      return this.e;
   }
}
