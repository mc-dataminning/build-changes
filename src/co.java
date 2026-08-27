import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record co(ct.d b) {
   public static final Codec<co> a = RecordCodecBuilder.create($$0 -> $$0.group(ct.d.d.optionalFieldOf("light", ct.d.c).forGetter(co::a)).apply($$0, co::new));

   public boolean a(aqm $$0, io $$1) {
      return !$$0.p($$1) ? false : this.b.d($$0.A($$1));
   }

   public ct.d a() {
      return this.b;
   }

   public static class a {
      private ct.d a = ct.d.c;

      public static co.a a() {
         return new co.a();
      }

      public co.a a(ct.d $$0) {
         this.a = $$0;
         return this;
      }

      public co b() {
         return new co(this.a);
      }
   }
}
