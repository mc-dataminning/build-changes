import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cs(Optional<ju<cws>> c) implements dz<cwr> {
   public static final Codec<cs> a = RecordCodecBuilder.create($$0 -> $$0.group(kf.a(ma.L).optionalFieldOf("song").forGetter(cs::c)).apply($$0, cs::new));

   @Override
   public kt<cwr> a() {
      return ku.ab;
   }

   public boolean a(cwm $$0, cwr $$1) {
      if (!this.c.isPresent()) {
         return true;
      } else {
         boolean $$2 = false;

         for (jq<cws> $$3 : this.c.get()) {
            Optional<ali<cws>> $$4 = $$3.e();
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
