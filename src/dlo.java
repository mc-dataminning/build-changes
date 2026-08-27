import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dlo implements dlw {
   public static final Codec<dlo> a = RecordCodecBuilder.create($$0 -> $$0.group(ht.a.fieldOf("pos").forGetter($$0x -> $$0x.c)).apply($$0, dlo::new));
   final ht c;

   public dlo(ht $$0) {
      this.c = $$0;
   }

   @Override
   public Optional<eju> a(csa $$0) {
      return Optional.of(eju.b(this.c));
   }

   @Override
   public dlx<?> a() {
      return dlx.a;
   }

   public static class a implements dlx<dlo> {
      public dlo a(tu $$0) {
         return new dlo($$0.e());
      }

      public void a(tu $$0, dlo $$1) {
         $$0.a($$1.c);
      }

      @Override
      public Codec<dlo> a() {
         return dlo.a;
      }
   }
}
