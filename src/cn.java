import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Predicate;

public record cn(Optional<jk<czw>> b, cx.d c, bo d) implements Predicate<daa> {
   public static final Codec<cn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jv.a(mi.K).optionalFieldOf("items").forGetter(cn::a), cx.d.d.optionalFieldOf("count", cx.d.c).forGetter(cn::b), bo.b.forGetter(cn::c))
            .apply($$0, cn::new)
   );

   public boolean a(daa $$0) {
      if (this.b.isPresent() && !$$0.a(this.b.get())) {
         return false;
      } else {
         return !this.c.d($$0.M()) ? false : this.d.a($$0);
      }
   }

   public Optional<jk<czw>> a() {
      return this.b;
   }

   public cx.d b() {
      return this.c;
   }

   public bo c() {
      return this.d;
   }

   public static class a {
      private Optional<jk<czw>> a = Optional.empty();
      private cx.d b = cx.d.c;
      private bo c = bo.a;

      public static cn.a a() {
         return new cn.a();
      }

      public cn.a a(jh<czw> $$0, djy... $$1) {
         this.a = Optional.of(jk.a($$0x -> $$0x.h().e(), $$1));
         return this;
      }

      public cn.a a(jh<czw> $$0, axv<czw> $$1) {
         this.a = Optional.of($$0.b($$1));
         return this;
      }

      public cn.a a(cx.d $$0) {
         this.b = $$0;
         return this;
      }

      public cn.a a(bo $$0) {
         this.c = $$0;
         return this;
      }

      public cn b() {
         return new cn(this.a, this.b, this.c);
      }
   }
}
