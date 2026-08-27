import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ens(env b) implements env {
   public static final Codec<ens> a = RecordCodecBuilder.create($$0 -> $$0.group(enx.a.fieldOf("term").forGetter(ens::c)).apply($$0, ens::new));

   @Override
   public enw b() {
      return enx.b;
   }

   public boolean a(ekw $$0) {
      return !this.b.test($$0);
   }

   @Override
   public Set<ene<?>> a() {
      return this.b.a();
   }

   @Override
   public void a(elf $$0) {
      env.super.a($$0);
      this.b.a($$0);
   }

   public static env.a a(env.a $$0) {
      ens $$1 = new ens($$0.build());
      return () -> $$1;
   }

   public env c() {
      return this.b;
   }
}
