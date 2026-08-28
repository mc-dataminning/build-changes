import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cq(cv.d b) {
   public static final Codec<cq> a = RecordCodecBuilder.create($$0 -> $$0.group(cv.d.d.optionalFieldOf("light", cv.d.c).forGetter(cq::a)).apply($$0, cq::new));

   public boolean a(aro $$0, iu $$1) {
      return !$$0.p($$1) ? false : this.b.d($$0.B($$1));
   }

   public cv.d a() {
      return this.b;
   }

   public static class a {
      private cv.d a = cv.d.c;

      public static cq.a a() {
         return new cq.a();
      }

      public cq.a a(cv.d $$0) {
         this.a = $$0;
         return this;
      }

      public cq b() {
         return new cq(this.a);
      }
   }
}
