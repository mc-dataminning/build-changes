import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class eib extends ehq {
   public static final Codec<eib> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and(asg.b(kc.D).fieldOf("options").forGetter($$0x -> $$0x.b)).apply($$0, eib::new)
   );
   private final asg<clz> b;

   private eib(List<ejd> $$0, asg<clz> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public ehs b() {
      return eht.A;
   }

   @Override
   public cmh a(cmh $$0, ege $$1) {
      cma.a($$0, this.b, $$1.b());
      return $$0;
   }

   public static ehq.a<?> a(asg<clz> $$0) {
      return a($$1 -> new eib($$1, $$0));
   }
}
