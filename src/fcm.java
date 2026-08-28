import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fcm(ale b) implements fck {
   public static final MapCodec<fcm> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ale.a.fieldOf("source").forGetter(fcm::c)).apply($$0, fcm::new));

   @Override
   public fcj a() {
      return fcl.b;
   }

   @Override
   public uu a(eyn $$0) {
      return $$0.d().p().aK().a(this.b);
   }

   @Override
   public Set<bav<?>> b() {
      return Set.of();
   }

   public ale c() {
      return this.b;
   }
}
