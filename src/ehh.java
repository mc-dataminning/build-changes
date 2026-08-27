import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ehh(ehk b) implements ehk {
   public static final Codec<ehh> a = RecordCodecBuilder.create($$0 -> $$0.group(ehm.a.fieldOf("term").forGetter(ehh::c)).apply($$0, ehh::new));

   @Override
   public ehl b() {
      return ehm.b;
   }

   public boolean a(eel $$0) {
      return !this.b.test($$0);
   }

   @Override
   public Set<egt<?>> a() {
      return this.b.a();
   }

   @Override
   public void a(eeu $$0) {
      ehk.super.a($$0);
      this.b.a($$0);
   }

   public static ehk.a a(ehk.a $$0) {
      ehh $$1 = new ehh($$0.build());
      return () -> $$1;
   }

   public ehk c() {
      return this.b;
   }
}
