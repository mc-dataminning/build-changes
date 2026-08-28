import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ezo(ezr b) implements ezr {
   public static final MapCodec<ezo> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ezr.e.fieldOf("term").forGetter(ezo::c)).apply($$0, ezo::new));

   @Override
   public ezs b() {
      return ezt.a;
   }

   public boolean a(ewi $$0) {
      return !this.b.test($$0);
   }

   @Override
   public Set<bbd<?>> a() {
      return this.b.a();
   }

   @Override
   public void a(ewo $$0) {
      ezr.super.a($$0);
      this.b.a($$0);
   }

   public static ezr.a a(ezr.a $$0) {
      ezo $$1 = new ezo($$0.build());
      return () -> $$1;
   }

   public ezr c() {
      return this.b;
   }
}
