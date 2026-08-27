import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dpk extends dpq {
   final asg<cvz> a;
   public static final Codec<dpk> e = RecordCodecBuilder.create($$0 -> a($$0).and(asg.a(kc.f).fieldOf("tag").forGetter($$0x -> $$0x.a)).apply($$0, dpk::new));

   protected dpk(iz $$0, asg<cvz> $$1) {
      super($$0);
      this.a = $$1;
   }

   @Override
   protected boolean a(dip $$0) {
      return $$0.a(this.a);
   }

   @Override
   public dpg<?> a() {
      return dpg.b;
   }
}
