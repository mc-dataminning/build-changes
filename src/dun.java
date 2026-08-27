import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dun implements duv {
   public static final Codec<dun> a = RecordCodecBuilder.create($$0 -> $$0.group(im.a.fieldOf("pos").forGetter($$0x -> $$0x.e)).apply($$0, dun::new));
   public static final yq<wd, dun> b = yq.a(im.b, $$0 -> $$0.e, dun::new);
   private final im e;

   public dun(im $$0) {
      this.e = $$0;
   }

   @Override
   public Optional<etf> a(czu $$0) {
      return Optional.of(etf.b(this.e));
   }

   @Override
   public duw<dun> a() {
      return duw.a;
   }

   public static class a implements duw<dun> {
      @Override
      public Codec<dun> a() {
         return dun.a;
      }

      @Override
      public yq<wd, dun> b() {
         return dun.b;
      }
   }
}
