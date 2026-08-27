import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class efn extends egd {
   public static final Codec<efn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(drq.a.g.fieldOf("heightmap").orElse(drq.a.a).forGetter($$0x -> $$0x.b), Codec.INT.fieldOf("offset").orElse(0).forGetter($$0x -> $$0x.c))
            .apply($$0, efn::new)
   );
   private final drq.a b;
   private final int c;

   public efn(drq.a $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Nullable
   @Override
   public egg.c a(cwh $$0, ib $$1, ib $$2, egg.c $$3, egg.c $$4, egc $$5) {
      drq.a $$6;
      if ($$0 instanceof apa) {
         if (this.b == drq.a.a) {
            $$6 = drq.a.b;
         } else if (this.b == drq.a.c) {
            $$6 = drq.a.d;
         } else {
            $$6 = this.b;
         }
      } else {
         $$6 = this.b;
      }

      ib $$10 = $$4.a();
      int $$11 = $$0.a($$6, $$10.u(), $$10.w()) + this.c;
      int $$12 = $$3.a().v();
      return new egg.c(new ib($$10.u(), $$11 + $$12, $$10.w()), $$4.b(), $$4.c());
   }

   @Override
   protected egf<?> a() {
      return egf.g;
   }
}
