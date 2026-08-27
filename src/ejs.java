import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ejs(ejv b) implements ejv {
   public static final Codec<ejs> a = RecordCodecBuilder.create($$0 -> $$0.group(ejx.a.fieldOf("term").forGetter(ejs::c)).apply($$0, ejs::new));

   @Override
   public ejw b() {
      return ejx.b;
   }

   public boolean a(egw $$0) {
      return !this.b.test($$0);
   }

   @Override
   public Set<eje<?>> a() {
      return this.b.a();
   }

   @Override
   public void a(ehf $$0) {
      ejv.super.a($$0);
      this.b.a($$0);
   }

   public static ejv.a a(ejv.a $$0) {
      ejs $$1 = new ejs($$0.build());
      return () -> $$1;
   }

   public ejv c() {
      return this.b;
   }
}
