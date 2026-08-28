import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cq(Optional<jr<cvv>> c) implements dw<cvu> {
   public static final Codec<cq> a = RecordCodecBuilder.create($$0 -> $$0.group(kc.a(lv.L).optionalFieldOf("song").forGetter(cq::c)).apply($$0, cq::new));

   @Override
   public kq<cvu> a() {
      return kr.W;
   }

   public boolean a(cvp $$0, cvu $$1) {
      if (!this.c.isPresent()) {
         return true;
      } else {
         boolean $$2 = false;

         for (jn<cvv> $$3 : this.c.get()) {
            Optional<alb<cvv>> $$4 = $$3.e();
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
