import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record epz(eqc b) implements eqc {
   public static final Codec<epz> a = RecordCodecBuilder.create($$0 -> $$0.group(eqe.a.fieldOf("term").forGetter(epz::c)).apply($$0, epz::new));

   @Override
   public eqd b() {
      return eqe.b;
   }

   public boolean a(enb $$0) {
      return !this.b.test($$0);
   }

   @Override
   public Set<epl<?>> a() {
      return this.b.a();
   }

   @Override
   public void a(enk $$0) {
      eqc.super.a($$0);
      this.b.a($$0);
   }

   public static eqc.a a(eqc.a $$0) {
      epz $$1 = new epz($$0.build());
      return () -> $$1;
   }

   public eqc c() {
      return this.b;
   }
}
