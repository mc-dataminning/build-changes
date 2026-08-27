import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class ees extends efi {
   public static final Codec<ees> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dqv.a.g.fieldOf("heightmap").orElse(dqv.a.a).forGetter($$0x -> $$0x.b), Codec.INT.fieldOf("offset").orElse(0).forGetter($$0x -> $$0x.c))
            .apply($$0, ees::new)
   );
   private final dqv.a b;
   private final int c;

   public ees(dqv.a $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Nullable
   @Override
   public efl.c a(cvu $$0, hz $$1, hz $$2, efl.c $$3, efl.c $$4, efh $$5) {
      dqv.a $$6;
      if ($$0 instanceof aow) {
         if (this.b == dqv.a.a) {
            $$6 = dqv.a.b;
         } else if (this.b == dqv.a.c) {
            $$6 = dqv.a.d;
         } else {
            $$6 = this.b;
         }
      } else {
         $$6 = this.b;
      }

      hz $$10 = $$4.a();
      int $$11 = $$0.a($$6, $$10.u(), $$10.w()) + this.c;
      int $$12 = $$3.a().v();
      return new efl.c(new hz($$10.u(), $$11 + $$12, $$10.w()), $$4.b(), $$4.c());
   }

   @Override
   protected efk<?> a() {
      return efk.g;
   }
}
