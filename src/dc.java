import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dc(dh.d b) {
   public static final Codec<dc> a = RecordCodecBuilder.create($$0 -> $$0.group(dh.d.d.optionalFieldOf("light", dh.d.c).forGetter(dc::a)).apply($$0, dc::new));

   public boolean a(arj $$0, jf $$1) {
      return !$$0.p($$1) ? false : this.b.d($$0.A($$1));
   }

   public dh.d a() {
      return this.b;
   }

   public static class a {
      private dh.d a = dh.d.c;

      public static dc.a a() {
         return new dc.a();
      }

      public dc.a a(dh.d $$0) {
         this.a = $$0;
         return this;
      }

      public dc b() {
         return new dc(this.a);
      }
   }
}
