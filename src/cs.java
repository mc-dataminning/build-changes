import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cs(Optional<ju<cwh>> c) implements dz<cwg> {
   public static final Codec<cs> a = RecordCodecBuilder.create($$0 -> $$0.group(kf.a(lz.L).optionalFieldOf("song").forGetter(cs::c)).apply($$0, cs::new));

   @Override
   public kt<cwg> a() {
      return ku.ab;
   }

   public boolean a(cwb $$0, cwg $$1) {
      if (!this.c.isPresent()) {
         return true;
      } else {
         boolean $$2 = false;

         for (jq<cwh> $$3 : this.c.get()) {
            Optional<alh<cwh>> $$4 = $$3.e();
            if (!$$4.isEmpty() && $$4.get() == $$1.a().c()) {
               $$2 = true;
               break;
            }
         }

         return $$2;
      }
   }

   public static cs b() {
      return new cs(Optional.empty());
   }
}
