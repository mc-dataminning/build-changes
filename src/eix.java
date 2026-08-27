import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class eix extends ejn {
   public static final Codec<eix> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dva.a.g.fieldOf("heightmap").orElse(dva.a.a).forGetter($$0x -> $$0x.b), Codec.INT.fieldOf("offset").orElse(0).forGetter($$0x -> $$0x.c))
            .apply($$0, eix::new)
   );
   private final dva.a b;
   private final int c;

   public eix(dva.a $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Nullable
   @Override
   public ejq.c a(czj $$0, id $$1, id $$2, ejq.c $$3, ejq.c $$4, ejm $$5) {
      dva.a $$6;
      if ($$0 instanceof apu) {
         if (this.b == dva.a.a) {
            $$6 = dva.a.b;
         } else if (this.b == dva.a.c) {
            $$6 = dva.a.d;
         } else {
            $$6 = this.b;
         }
      } else {
         $$6 = this.b;
      }

      id $$10 = $$4.a();
      int $$11 = $$0.a($$6, $$10.u(), $$10.w()) + this.c;
      int $$12 = $$3.a().v();
      return new ejq.c(new id($$10.u(), $$11 + $$12, $$10.w()), $$4.b(), $$4.c());
   }

   @Override
   protected ejp<?> a() {
      return ejp.g;
   }
}
