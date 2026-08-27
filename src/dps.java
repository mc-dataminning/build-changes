import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dps implements dqa {
   public static final Codec<dps> a = RecordCodecBuilder.create($$0 -> $$0.group(hz.a.fieldOf("pos").forGetter($$0x -> $$0x.e)).apply($$0, dps::new));
   public static final xo<vb, dps> b = xo.a(hz.b, $$0 -> $$0.e, dps::new);
   private final hz e;

   public dps(hz $$0) {
      this.e = $$0;
   }

   @Override
   public Optional<enz> a(cvr $$0) {
      return Optional.of(enz.b(this.e));
   }

   @Override
   public dqb<dps> a() {
      return dqb.a;
   }

   public static class a implements dqb<dps> {
      @Override
      public Codec<dps> a() {
         return dps.a;
      }

      @Override
      public xo<vb, dps> b() {
         return dps.b;
      }
   }
}
