import com.mojang.serialization.Codec;

public record by(jq<bsw<?>> b) {
   public static final Codec<by> a = kb.a(lu.z).xmap(by::new, by::a);

   public static by a(bsw<?> $$0) {
      return new by(jq.a($$0.r()));
   }

   public static by a(awt<bsw<?>> $$0) {
      return new by(lt.f.a($$0));
   }

   public boolean b(bsw<?> $$0) {
      return $$0.a(this.b);
   }

   public jq<bsw<?>> a() {
      return this.b;
   }
}
