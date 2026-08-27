import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class duw implements dve {
   public static final Codec<duw> a = RecordCodecBuilder.create($$0 -> $$0.group(in.a.fieldOf("pos").forGetter($$0x -> $$0x.e)).apply($$0, duw::new));
   public static final ys<wf, duw> b = ys.a(in.b, $$0 -> $$0.e, duw::new);
   private final in e;

   public duw(in $$0) {
      this.e = $$0;
   }

   @Override
   public Optional<etp> a(dad $$0) {
      return Optional.of(etp.b(this.e));
   }

   @Override
   public dvf<duw> a() {
      return dvf.a;
   }

   public static class a implements dvf<duw> {
      @Override
      public Codec<duw> a() {
         return duw.a;
      }

      @Override
      public ys<wf, duw> b() {
         return duw.b;
      }
   }
}
