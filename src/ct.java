import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ct(Optional<jv<cwt>> c) implements ea<cws> {
   public static final Codec<ct> a = RecordCodecBuilder.create($$0 -> $$0.group(kg.a(mc.L).optionalFieldOf("song").forGetter(ct::c)).apply($$0, ct::new));

   @Override
   public ku<cws> a() {
      return kv.ab;
   }

   public boolean a(cwn $$0, cws $$1) {
      if (!this.c.isPresent()) {
         return true;
      } else {
         boolean $$2 = false;

         for (jr<cwt> $$3 : this.c.get()) {
            Optional<akt<cwt>> $$4 = $$3.e();
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
