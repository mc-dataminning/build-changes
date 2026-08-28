import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record dgk(ji<bwj<?>> d, boolean e) implements dfw {
   public static final MapCodec<dgk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(jt.a(mg.B).fieldOf("entity").forGetter(dgk::b), Codec.BOOL.optionalFieldOf("join_team", false).forGetter(dgk::c)).apply($$0, dgk::new)
   );

   @Override
   public void a(aro $$0, int $$1, dfe $$2, bwa $$3, fdw $$4) {
      iu $$5 = iu.a((jo)$$4);
      if (dip.l($$5)) {
         Optional<je<bwj<?>>> $$6 = this.b().a($$0.C_());
         if (!$$6.isEmpty()) {
            bwa $$7 = $$6.get().a().a($$0, $$5, bwi.k);
            if ($$7 != null) {
               if ($$7 instanceof bwy $$8 && $$2.c() instanceof arp $$9) {
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
   public MapCodec<dgk> a() {
      return a;
   }

   public ji<bwj<?>> b() {
      return this.d;
   }

   public boolean c() {
      return this.e;
   }
}
