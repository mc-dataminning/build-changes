import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ct(Optional<jv<cwu>> c) implements ea<cwt> {
   public static final Codec<ct> a = RecordCodecBuilder.create($$0 -> $$0.group(kg.a(mc.L).optionalFieldOf("song").forGetter(ct::c)).apply($$0, ct::new));

   @Override
   public ku<cwt> a() {
      return kv.ab;
   }

   public boolean a(cwo $$0, cwt $$1) {
      if (!this.c.isPresent()) {
         return true;
      } else {
         boolean $$2 = false;

         for (jr<cwu> $$3 : this.c.get()) {
            Optional<aku<cwu>> $$4 = $$3.e();
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
