import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class drj implements drr {
   public static final Codec<drj> a = RecordCodecBuilder.create($$0 -> $$0.group(ib.a.fieldOf("pos").forGetter($$0x -> $$0x.e)).apply($$0, drj::new));
   public static final xs<vf, drj> b = xs.a(ib.b, $$0 -> $$0.e, drj::new);
   private final ib e;

   public drj(ib $$0) {
      this.e = $$0;
   }

   @Override
   public Optional<epr> a(cwz $$0) {
      return Optional.of(epr.b(this.e));
   }

   @Override
   public drs<drj> a() {
      return drs.a;
   }

   public static class a implements drs<drj> {
      @Override
      public Codec<drj> a() {
         return drj.a;
      }

      @Override
      public xs<vf, drj> b() {
         return drj.b;
      }
   }
}
