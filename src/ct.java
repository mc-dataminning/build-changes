import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ct(Optional<jv<cxn>> c) implements ea<cxm> {
   public static final Codec<ct> a = RecordCodecBuilder.create($$0 -> $$0.group(kg.a(mc.L).optionalFieldOf("song").forGetter(ct::c)).apply($$0, ct::new));

   @Override
   public ku<cxm> a() {
      return kv.ad;
   }

   public boolean a(cxh $$0, cxm $$1) {
      if (!this.c.isPresent()) {
         return true;
      } else {
         boolean $$2 = false;

         for (jr<cxn> $$3 : this.c.get()) {
            Optional<akt<cxn>> $$4 = $$3.e();
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
