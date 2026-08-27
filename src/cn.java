import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cn(cs.d b) {
   public static final Codec<cn> a = RecordCodecBuilder.create($$0 -> $$0.group(axe.a(cs.d.d, "light", cs.d.c).forGetter(cn::a)).apply($$0, cn::new));

   public boolean a(aqe $$0, im $$1) {
      return !$$0.p($$1) ? false : this.b.d($$0.A($$1));
   }

   public cs.d a() {
      return this.b;
   }

   public static class a {
      private cs.d a = cs.d.c;

      public static cn.a a() {
         return new cn.a();
      }

      public cn.a a(cs.d $$0) {
         this.a = $$0;
         return this;
      }

      public cn b() {
         return new cn(this.a);
      }
   }
}
