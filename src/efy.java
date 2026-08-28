import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record efy(efq b, List<efy.a> c) {
   public static final Codec<efy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(efq.a.fieldOf("fallback").forGetter(efy::a), efy.a.a.listOf().fieldOf("rules").forGetter(efy::b)).apply($$0, efy::new)
   );

   public static efy a(efq $$0) {
      return new efy($$0, List.of());
   }

   public static efy a(dfi $$0) {
      return a(efq.a($$0));
   }

   public dsl a(ddc $$0, ayo $$1, ja $$2) {
      for (efy.a $$3 : this.c) {
         if ($$3.a().test($$0, $$2)) {
            return $$3.b().a($$1, $$2);
         }
      }

      return this.b.a($$1, $$2);
   }

   public efq a() {
      return this.b;
   }

   public List<efy.a> b() {
      return this.c;
   }

   public static record a(dzn b, efq c) {
      public static final Codec<efy.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dzn.b.fieldOf("if_true").forGetter(efy.a::a), efq.a.fieldOf("then").forGetter(efy.a::b)).apply($$0, efy.a::new)
      );

      public dzn a() {
         return this.b;
      }

      public efq b() {
         return this.c;
      }
   }
}
