import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ehy(eib b) implements eib {
   public static final Codec<ehy> a = RecordCodecBuilder.create($$0 -> $$0.group(eid.a.fieldOf("term").forGetter(ehy::c)).apply($$0, ehy::new));

   @Override
   public eic b() {
      return eid.b;
   }

   public boolean a(efc $$0) {
      return !this.b.test($$0);
   }

   @Override
   public Set<ehk<?>> a() {
      return this.b.a();
   }

   @Override
   public void a(efl $$0) {
      eib.super.a($$0);
      this.b.a($$0);
   }

   public static eib.a a(eib.a $$0) {
      ehy $$1 = new ehy($$0.build());
      return () -> $$1;
   }

   public eib c() {
      return this.b;
   }
}
