import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cs(Optional<ju<cxv>> c) implements dz<cxu> {
   public static final Codec<cs> a = RecordCodecBuilder.create($$0 -> $$0.group(kf.a(mb.L).optionalFieldOf("song").forGetter(cs::c)).apply($$0, cs::new));

   @Override
   public kt<cxu> a() {
      return ku.ab;
   }

   public boolean a(cxp $$0, cxu $$1) {
      if (!this.c.isPresent()) {
         return true;
      } else {
         boolean $$2 = false;

         for (jq<cxv> $$3 : this.c.get()) {
            Optional<aly<cxv>> $$4 = $$3.e();
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
