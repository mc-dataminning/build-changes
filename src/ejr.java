import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ejr(eju b) implements eju {
   public static final Codec<ejr> a = RecordCodecBuilder.create($$0 -> $$0.group(ejw.a.fieldOf("term").forGetter(ejr::c)).apply($$0, ejr::new));

   @Override
   public ejv b() {
      return ejw.b;
   }

   public boolean a(egv $$0) {
      return !this.b.test($$0);
   }

   @Override
   public Set<ejd<?>> a() {
      return this.b.a();
   }

   @Override
   public void a(ehe $$0) {
      eju.super.a($$0);
      this.b.a($$0);
   }

   public static eju.a a(eju.a $$0) {
      ejr $$1 = new ejr($$0.build());
      return () -> $$1;
   }

   public eju c() {
      return this.b;
   }
}
