import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bqc {
   public static final Codec<bqc> a = RecordCodecBuilder.create($$0 -> $$0.group(dxw.b.fieldOf("source").forGetter($$0x -> $$0x.b)).apply($$0, bqc::new));
   private final dxw b;

   public bqc(dxw $$0) {
      this.b = $$0;
   }

   public bqc(long $$0, akn $$1) {
      this(a($$0, Optional.of($$1)));
   }

   public bqc(long $$0, Optional<akn> $$1) {
      this(a($$0, $$1));
   }

   private static dxw a(long $$0, Optional<akn> $$1) {
      dxk.a $$2 = dxk.b($$0);
      if ($$1.isPresent()) {
         $$2 = $$2.a(a($$1.get()));
      }

      return new dxw($$2.a());
   }

   public static dxk.a a(akn $$0) {
      return dxk.a($$0.toString());
   }

   public aym a() {
      return this.b;
   }
}
