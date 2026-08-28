import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fcn(fcq b) implements fcq {
   public static final MapCodec<fcn> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(fcq.e.fieldOf("term").forGetter(fcn::c)).apply($$0, fcn::new));

   @Override
   public fcr b() {
      return fcs.a;
   }

   public boolean a(ezh $$0) {
      return !this.b.test($$0);
   }

   @Override
   public Set<bax<?>> a() {
      return this.b.a();
   }

   @Override
   public void a(ezn $$0) {
      fcq.super.a($$0);
      this.b.a($$0);
   }

   public static fcq.a a(fcq.a $$0) {
      fcn $$1 = new fcn($$0.build());
      return () -> $$1;
   }

   public fcq c() {
      return this.b;
   }
}
