import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class eel extends efb {
   public static final Codec<eel> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dqo.a.g.fieldOf("heightmap").orElse(dqo.a.a).forGetter($$0x -> $$0x.b), Codec.INT.fieldOf("offset").orElse(0).forGetter($$0x -> $$0x.c))
            .apply($$0, eel::new)
   );
   private final dqo.a b;
   private final int c;

   public eel(dqo.a $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Nullable
   @Override
   public efe.c a(cvq $$0, hz $$1, hz $$2, efe.c $$3, efe.c $$4, efa $$5) {
      dqo.a $$6;
      if ($$0 instanceof aov) {
         if (this.b == dqo.a.a) {
            $$6 = dqo.a.b;
         } else if (this.b == dqo.a.c) {
            $$6 = dqo.a.d;
         } else {
            $$6 = this.b;
         }
      } else {
         $$6 = this.b;
      }

      hz $$10 = $$4.a();
      int $$11 = $$0.a($$6, $$10.u(), $$10.w()) + this.c;
      int $$12 = $$3.a().v();
      return new efe.c(new hz($$10.u(), $$11 + $$12, $$10.w()), $$4.b(), $$4.c());
   }

   @Override
   protected efd<?> a() {
      return efd.g;
   }
}
