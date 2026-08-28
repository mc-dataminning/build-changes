import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Set;

public class eyr extends exu {
   static final MapCodec<eyr> a = RecordCodecBuilder.mapCodec($$0 -> a($$0).and(fap.a.fieldOf("amplifier").forGetter($$0x -> $$0x.b)).apply($$0, eyr::new));
   private final fao b;

   private eyr(List<ezs> $$0, fao $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public Set<eza<?>> a() {
      return this.b.a();
   }

   @Override
   public exw<eyr> b() {
      return exx.Q;
   }

   @Override
   public cxk a(cxk $$0, ewh $$1) {
      int $$2 = bae.a(this.b.a($$1), 0, 4);
      $$0.b(ku.aa, new dai($$2));
      return $$0;
   }

   public fao c() {
      return this.b;
   }

   public static exu.a<?> a(fao $$0) {
      return a($$1 -> new eyr($$1, $$0));
   }
}
