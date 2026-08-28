import com.mojang.serialization.Codec;

public record by(jq<bsx<?>> b) {
   public static final Codec<by> a = kb.a(lu.z).xmap(by::new, by::a);

   public static by a(bsx<?> $$0) {
      return new by(jq.a($$0.r()));
   }

   public static by a(awu<bsx<?>> $$0) {
      return new by(lt.f.a($$0));
   }

   public boolean b(bsx<?> $$0) {
      return $$0.a(this.b);
   }

   public jq<bsx<?>> a() {
      return this.b;
   }
}
