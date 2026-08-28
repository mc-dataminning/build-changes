import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record etw(etz b) implements etz {
   public static final MapCodec<etw> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(etz.e.fieldOf("term").forGetter(etw::c)).apply($$0, etw::new));

   @Override
   public eua b() {
      return eub.a;
   }

   public boolean a(eqo $$0) {
      return !this.b.test($$0);
   }

   @Override
   public Set<eth<?>> a() {
      return this.b.a();
   }

   @Override
   public void a(equ $$0) {
      etz.super.a($$0);
      this.b.a($$0);
   }

   public static etz.a a(etz.a $$0) {
      etw $$1 = new etw($$0.build());
      return () -> $$1;
   }

   public etz c() {
      return this.b;
   }
}
