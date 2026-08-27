import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record efd(efg b) implements efg {
   public static final Codec<efd> a = RecordCodecBuilder.create($$0 -> $$0.group(efi.a.fieldOf("term").forGetter(efd::c)).apply($$0, efd::new));

   @Override
   public efh b() {
      return efi.b;
   }

   public boolean a(ech $$0) {
      return !this.b.test($$0);
   }

   @Override
   public Set<eep<?>> a() {
      return this.b.a();
   }

   @Override
   public void a(ecq $$0) {
      efg.super.a($$0);
      this.b.a($$0);
   }

   public static efg.a a(efg.a $$0) {
      efd $$1 = new efd($$0.build());
      return () -> $$1;
   }

   public efg c() {
      return this.b;
   }
}
