import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record efl(efd b, List<efl.a> c) {
   public static final Codec<efl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(efd.a.fieldOf("fallback").forGetter(efl::a), efl.a.a.listOf().fieldOf("rules").forGetter(efl::b)).apply($$0, efl::new)
   );

   public static efl a(efd $$0) {
      return new efl($$0, List.of());
   }

   public static efl a(dez $$0) {
      return a(efd.a($$0));
   }

   public dsc a(dct $$0, azh $$1, iz $$2) {
      for (efl.a $$3 : this.c) {
         if ($$3.a().test($$0, $$2)) {
            return $$3.b().a($$1, $$2);
         }
      }

      return this.b.a($$1, $$2);
   }

   public efd a() {
      return this.b;
   }

   public List<efl.a> b() {
      return this.c;
   }

   public static record a(dzb b, efd c) {
      public static final Codec<efl.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dzb.b.fieldOf("if_true").forGetter(efl.a::a), efd.a.fieldOf("then").forGetter(efl.a::b)).apply($$0, efl.a::new)
      );

      public dzb a() {
         return this.b;
      }

      public efd b() {
         return this.c;
      }
   }
}
