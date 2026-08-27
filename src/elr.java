import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record elr(elu b) implements elu {
   public static final Codec<elr> a = RecordCodecBuilder.create($$0 -> $$0.group(elw.a.fieldOf("term").forGetter(elr::c)).apply($$0, elr::new));

   @Override
   public elv b() {
      return elw.b;
   }

   public boolean a(eiv $$0) {
      return !this.b.test($$0);
   }

   @Override
   public Set<eld<?>> a() {
      return this.b.a();
   }

   @Override
   public void a(eje $$0) {
      elu.super.a($$0);
      this.b.a($$0);
   }

   public static elu.a a(elu.a $$0) {
      elr $$1 = new elr($$0.build());
      return () -> $$1;
   }

   public elu c() {
      return this.b;
   }
}
