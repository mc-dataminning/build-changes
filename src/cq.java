import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cq(Optional<jr<cvq>> c) implements dw<cvp> {
   public static final Codec<cq> a = RecordCodecBuilder.create($$0 -> $$0.group(kc.a(lv.L).optionalFieldOf("song").forGetter(cq::c)).apply($$0, cq::new));

   @Override
   public kq<cvp> a() {
      return kr.T;
   }

   public boolean a(cvl $$0, cvp $$1) {
      if (!this.c.isPresent()) {
         return true;
      } else {
         boolean $$2 = false;

         for (jn<cvq> $$3 : this.c.get()) {
            Optional<ala<cvq>> $$4 = $$3.e();
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
