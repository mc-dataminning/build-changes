import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dd(di.d b) {
   public static final Codec<dd> a = RecordCodecBuilder.create($$0 -> $$0.group(di.d.d.optionalFieldOf("light", di.d.c).forGetter(dd::a)).apply($$0, dd::new));

   public boolean a(arm $$0, jg $$1) {
      return !$$0.p($$1) ? false : this.b.d($$0.A($$1));
   }

   public di.d a() {
      return this.b;
   }

   public static class a {
      private di.d a = di.d.c;

      public static dd.a a() {
         return new dd.a();
      }

      public dd.a a(di.d $$0) {
         this.a = $$0;
         return this;
      }

      public dd b() {
         return new dd(this.a);
      }
   }
}
