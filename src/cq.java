import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cq(Optional<js<cvy>> c) implements dx<cvx> {
   public static final Codec<cq> a = RecordCodecBuilder.create($$0 -> $$0.group(kd.a(lw.L).optionalFieldOf("song").forGetter(cq::c)).apply($$0, cq::new));

   @Override
   public kr<cvx> a() {
      return ks.W;
   }

   public boolean a(cvs $$0, cvx $$1) {
      if (!this.c.isPresent()) {
         return true;
      } else {
         boolean $$2 = false;

         for (jo<cvy> $$3 : this.c.get()) {
            Optional<ald<cvy>> $$4 = $$3.e();
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
