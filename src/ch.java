import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ch(cm.d b) {
   public static final Codec<ch> a = RecordCodecBuilder.create($$0 -> $$0.group(awu.a(cm.d.d, "light", cm.d.c).forGetter(ch::a)).apply($$0, ch::new));

   public boolean a(apu $$0, id $$1) {
      return !$$0.p($$1) ? false : this.b.d($$0.A($$1));
   }

   public cm.d a() {
      return this.b;
   }

   public static class a {
      private cm.d a = cm.d.c;

      public static ch.a a() {
         return new ch.a();
      }

      public ch.a a(cm.d $$0) {
         this.a = $$0;
         return this;
      }

      public ch b() {
         return new ch(this.a);
      }
   }
}
