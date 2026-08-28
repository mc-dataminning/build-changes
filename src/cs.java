import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cs(cx.d b) {
   public static final Codec<cs> a = RecordCodecBuilder.create($$0 -> $$0.group(cx.d.d.optionalFieldOf("light", cx.d.c).forGetter(cs::a)).apply($$0, cs::new));

   public boolean a(asb $$0, iw $$1) {
      return !$$0.p($$1) ? false : this.b.d($$0.B($$1));
   }

   public cx.d a() {
      return this.b;
   }

   public static class a {
      private cx.d a = cx.d.c;

      public static cs.a a() {
         return new cs.a();
      }

      public cs.a a(cx.d $$0) {
         this.a = $$0;
         return this;
      }

      public cs b() {
         return new cs(this.a);
      }
   }
}
