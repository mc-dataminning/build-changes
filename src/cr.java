import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cr(cw.d b) {
   public static final Codec<cr> a = RecordCodecBuilder.create($$0 -> $$0.group(cw.d.d.optionalFieldOf("light", cw.d.c).forGetter(cr::a)).apply($$0, cr::new));

   public boolean a(arq $$0, iv $$1) {
      return !$$0.p($$1) ? false : this.b.d($$0.B($$1));
   }

   public cw.d a() {
      return this.b;
   }

   public static class a {
      private cw.d a = cw.d.c;

      public static cr.a a() {
         return new cr.a();
      }

      public cr.a a(cw.d $$0) {
         this.a = $$0;
         return this;
      }

      public cr b() {
         return new cr(this.a);
      }
   }
}
