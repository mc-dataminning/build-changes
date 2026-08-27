import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eja(ejd b) implements ejd {
   public static final Codec<eja> a = RecordCodecBuilder.create($$0 -> $$0.group(ejf.a.fieldOf("term").forGetter(eja::c)).apply($$0, eja::new));

   @Override
   public eje b() {
      return ejf.b;
   }

   public boolean a(ege $$0) {
      return !this.b.test($$0);
   }

   @Override
   public Set<eim<?>> a() {
      return this.b.a();
   }

   @Override
   public void a(egn $$0) {
      ejd.super.a($$0);
      this.b.a($$0);
   }

   public static ejd.a a(ejd.a $$0) {
      eja $$1 = new eja($$0.build());
      return () -> $$1;
   }

   public ejd c() {
      return this.b;
   }
}
