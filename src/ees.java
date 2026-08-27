import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class ees extends eec {
   public static final Codec<ees> a = RecordCodecBuilder.create($$0 -> a($$0).and(rr.i.fieldOf("tag").forGetter($$0x -> $$0x.b)).apply($$0, ees::new));
   private final qw b;

   private ees(List<efp> $$0, qw $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eee b() {
      return eef.g;
   }

   @Override
   public cjf a(cjf $$0, ecq $$1) {
      $$0.w().a(this.b);
      return $$0;
   }

   @Deprecated
   public static eec.a<?> a(qw $$0) {
      return a($$1 -> new ees($$1, $$0));
   }
}
