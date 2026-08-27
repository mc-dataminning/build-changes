import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class efi extends efv {
   public static final Codec<efi> a = RecordCodecBuilder.create($$0 -> $$0.group(dxg.b.fieldOf("predicate").forGetter($$0x -> $$0x.c)).apply($$0, efi::new));
   private final dxg c;

   private efi(dxg $$0) {
      this.c = $$0;
   }

   public static efi a(dxg $$0) {
      return new efi($$0);
   }

   @Override
   protected boolean a(efu $$0, ayg $$1, in $$2) {
      return this.c.test($$0.d(), $$2);
   }

   @Override
   public efx<?> b() {
      return efx.a;
   }
}
