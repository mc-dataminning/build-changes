import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dkh implements dkp {
   public static final Codec<dkh> a = RecordCodecBuilder.create($$0 -> $$0.group(ht.a.fieldOf("pos").forGetter($$0x -> $$0x.c)).apply($$0, dkh::new));
   final ht c;

   public dkh(ht $$0) {
      this.c = $$0;
   }

   @Override
   public Optional<eif> a(cqz $$0) {
      return Optional.of(eif.b(this.c));
   }

   @Override
   public dkq<?> a() {
      return dkq.a;
   }

   public static class a implements dkq<dkh> {
      public dkh a(tl $$0) {
         return new dkh($$0.e());
      }

      public void a(tl $$0, dkh $$1) {
         $$0.a($$1.c);
      }

      @Override
      public Codec<dkh> a() {
         return dkh.a;
      }
   }
}
