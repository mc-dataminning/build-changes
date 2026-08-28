import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record etp(ets b) implements ets {
   public static final MapCodec<etp> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(etu.a.fieldOf("term").forGetter(etp::c)).apply($$0, etp::new));

   @Override
   public ett b() {
      return etu.c;
   }

   public boolean a(eqi $$0) {
      return !this.b.test($$0);
   }

   @Override
   public Set<etb<?>> a() {
      return this.b.a();
   }

   @Override
   public void a(eqo $$0) {
      ets.super.a($$0);
      this.b.a($$0);
   }

   public static ets.a a(ets.a $$0) {
      etp $$1 = new etp($$0.build());
      return () -> $$1;
   }

   public ets c() {
      return this.b;
   }
}
