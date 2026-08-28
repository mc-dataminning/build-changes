import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ct(Optional<jw<cye>> c) implements ea<cyd> {
   public static final Codec<ct> a = RecordCodecBuilder.create($$0 -> $$0.group(kh.a(me.L).optionalFieldOf("song").forGetter(ct::c)).apply($$0, ct::new));

   @Override
   public kw<cyd> a() {
      return kx.ad;
   }

   public boolean a(cxy $$0, cyd $$1) {
      if (!this.c.isPresent()) {
         return true;
      } else {
         boolean $$2 = false;

         for (js<cye> $$3 : this.c.get()) {
            Optional<alc<cye>> $$4 = $$3.e();
            if (!$$4.isEmpty() && $$4.get() == $$1.a().c()) {
               $$2 = true;
               break;
            }
         }

         return $$2;
      }
   }

   public static ct b() {
      return new ct(Optional.empty());
   }
}
