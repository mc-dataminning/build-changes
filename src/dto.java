import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dto implements dtw {
   public static final Codec<dto> a = RecordCodecBuilder.create($$0 -> $$0.group(ib.a.fieldOf("pos").forGetter($$0x -> $$0x.e)).apply($$0, dto::new));
   public static final ye<vr, dto> b = ye.a(ib.b, $$0 -> $$0.e, dto::new);
   private final ib e;

   public dto(ib $$0) {
      this.e = $$0;
   }

   @Override
   public Optional<esa> a(cyx $$0) {
      return Optional.of(esa.b(this.e));
   }

   @Override
   public dtx<dto> a() {
      return dtx.a;
   }

   public static class a implements dtx<dto> {
      @Override
      public Codec<dto> a() {
         return dto.a;
      }

      @Override
      public ye<vr, dto> b() {
         return dto.b;
      }
   }
}
