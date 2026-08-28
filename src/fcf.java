import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fcf(fci b) implements fci {
   public static final MapCodec<fcf> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(fci.e.fieldOf("term").forGetter(fcf::c)).apply($$0, fcf::new));

   @Override
   public fcj b() {
      return fck.a;
   }

   public boolean a(eyz $$0) {
      return !this.b.test($$0);
   }

   @Override
   public Set<bax<?>> a() {
      return this.b.a();
   }

   @Override
   public void a(ezf $$0) {
      fci.super.a($$0);
      this.b.a($$0);
   }

   public static fci.a a(fci.a $$0) {
      fcf $$1 = new fcf($$0.build());
      return () -> $$1;
   }

   public fci c() {
      return this.b;
   }
}
