import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dqn implements dqv {
   public static final Codec<dqn> a = RecordCodecBuilder.create($$0 -> $$0.group(ib.a.fieldOf("pos").forGetter($$0x -> $$0x.e)).apply($$0, dqn::new));
   public static final xq<vd, dqn> b = xq.a(ib.b, $$0 -> $$0.e, dqn::new);
   private final ib e;

   public dqn(ib $$0) {
      this.e = $$0;
   }

   @Override
   public Optional<eov> a(cwe $$0) {
      return Optional.of(eov.b(this.e));
   }

   @Override
   public dqw<dqn> a() {
      return dqw.a;
   }

   public static class a implements dqw<dqn> {
      @Override
      public Codec<dqn> a() {
         return dqn.a;
      }

      @Override
      public xq<vd, dqn> b() {
         return dqn.b;
      }
   }
}
