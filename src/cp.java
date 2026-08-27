import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cp(cu.d b) {
   public static final Codec<cp> a = RecordCodecBuilder.create($$0 -> $$0.group(axu.a(cu.d.d, "light", cu.d.c).forGetter(cp::a)).apply($$0, cp::new));

   public boolean a(aqt $$0, ir $$1) {
      return !$$0.p($$1) ? false : this.b.d($$0.A($$1));
   }

   public cu.d a() {
      return this.b;
   }

   public static class a {
      private cu.d a = cu.d.c;

      public static cp.a a() {
         return new cp.a();
      }

      public cp.a a(cu.d $$0) {
         this.a = $$0;
         return this;
      }

      public cp b() {
         return new cp(this.a);
      }
   }
}
