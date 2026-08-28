import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cr(Optional<jt<cwd>> c) implements dy<cwc> {
   public static final Codec<cr> a = RecordCodecBuilder.create($$0 -> $$0.group(ke.a(ly.L).optionalFieldOf("song").forGetter(cr::c)).apply($$0, cr::new));

   @Override
   public ks<cwc> a() {
      return kt.aa;
   }

   public boolean a(cvx $$0, cwc $$1) {
      if (!this.c.isPresent()) {
         return true;
      } else {
         boolean $$2 = false;

         for (jp<cwd> $$3 : this.c.get()) {
            Optional<alg<cwd>> $$4 = $$3.e();
            if (!$$4.isEmpty() && $$4.get() == $$1.a().c()) {
               $$2 = true;
               break;
            }
         }

         return $$2;
      }
   }

   public static cr b() {
      return new cr(Optional.empty());
   }
}
