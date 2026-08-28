import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ejz extends ekm {
   public static final MapCodec<ejz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ebv.b.fieldOf("predicate").forGetter($$0x -> $$0x.c)).apply($$0, ejz::new)
   );
   private final ebv c;

   private ejz(ebv $$0) {
      this.c = $$0;
   }

   public static ejz a(ebv $$0) {
      return new ejz($$0);
   }

   @Override
   protected boolean a(ekl $$0, azn $$1, jf $$2) {
      return this.c.test($$0.d(), $$2);
   }

   @Override
   public eko<?> b() {
      return eko.a;
   }
}
