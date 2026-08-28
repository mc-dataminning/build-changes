import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cq(Optional<jq<cut>> c) implements dw<cus> {
   public static final Codec<cq> a = RecordCodecBuilder.create($$0 -> $$0.group(kb.a(lu.L).optionalFieldOf("song").forGetter(cq::c)).apply($$0, cq::new));

   @Override
   public kp<cus> a() {
      return kq.R;
   }

   public boolean a(cuo $$0, cus $$1) {
      if (!this.c.isPresent()) {
         return true;
      } else {
         boolean $$2 = false;

         for (jm<cut> $$3 : this.c.get()) {
            Optional<akp<cut>> $$4 = $$3.e();
            if (!$$4.isEmpty() && $$4.get() == $$1.a().c()) {
               $$2 = true;
               break;
            }
         }

         return $$2;
      }
   }

   public static cq b() {
      return new cq(Optional.empty());
   }
}
