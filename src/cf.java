import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record cf(ck.d b) {
   public static final Codec<cf> a = RecordCodecBuilder.create($$0 -> $$0.group(atg.a(ck.d.d, "light", ck.d.c).forGetter(cf::a)).apply($$0, cf::new));

   public boolean a(amp $$0, hv $$1) {
      return !$$0.o($$1) ? false : this.b.d($$0.z($$1));
   }

   public ck.d a() {
      return this.b;
   }

   public static class a {
      private ck.d a = ck.d.c;

      public static cf.a a() {
         return new cf.a();
      }

      public cf.a a(ck.d $$0) {
         this.a = $$0;
         return this;
      }

      public cf b() {
         return new cf(this.a);
      }
   }
}
