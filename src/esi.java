import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record esi(esl b) implements esl {
   public static final MapCodec<esi> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(esn.a.fieldOf("term").forGetter(esi::c)).apply($$0, esi::new));

   @Override
   public esm b() {
      return esn.c;
   }

   public boolean a(epf $$0) {
      return !this.b.test($$0);
   }

   @Override
   public Set<eru<?>> a() {
      return this.b.a();
   }

   @Override
   public void a(epl $$0) {
      esl.super.a($$0);
      this.b.a($$0);
   }

   public static esl.a a(esl.a $$0) {
      esi $$1 = new esi($$0.build());
      return () -> $$1;
   }

   public esl c() {
      return this.b;
   }
}
