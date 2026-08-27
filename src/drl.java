import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class drl implements drt {
   public static final Codec<drl> a = RecordCodecBuilder.create($$0 -> $$0.group(ib.a.fieldOf("pos").forGetter($$0x -> $$0x.e)).apply($$0, drl::new));
   public static final xs<vf, drl> b = xs.a(ib.b, $$0 -> $$0.e, drl::new);
   private final ib e;

   public drl(ib $$0) {
      this.e = $$0;
   }

   @Override
   public Optional<ept> a(cxb $$0) {
      return Optional.of(ept.b(this.e));
   }

   @Override
   public dru<drl> a() {
      return dru.a;
   }

   public static class a implements dru<drl> {
      @Override
      public Codec<drl> a() {
         return drl.a;
      }

      @Override
      public xs<vf, drl> b() {
         return drl.b;
      }
   }
}
