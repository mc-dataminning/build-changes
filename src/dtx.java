import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dtx implements duf {
   public static final Codec<dtx> a = RecordCodecBuilder.create($$0 -> $$0.group(id.a.fieldOf("pos").forGetter($$0x -> $$0x.e)).apply($$0, dtx::new));
   public static final yg<vt, dtx> b = yg.a(id.b, $$0 -> $$0.e, dtx::new);
   private final id e;

   public dtx(id $$0) {
      this.e = $$0;
   }

   @Override
   public Optional<esj> a(czg $$0) {
      return Optional.of(esj.b(this.e));
   }

   @Override
   public dug<dtx> a() {
      return dug.a;
   }

   public static class a implements dug<dtx> {
      @Override
      public Codec<dtx> a() {
         return dtx.a;
      }

      @Override
      public yg<vt, dtx> b() {
         return dtx.b;
      }
   }
}
