import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dsl(dsd b, List<dsl.a> c) {
   public static final Codec<dsl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dsd.a.fieldOf("fallback").forGetter(dsl::a), dsl.a.a.listOf().fieldOf("rules").forGetter(dsl::b)).apply($$0, dsl::new)
   );

   public static dsl a(dsd $$0) {
      return new dsl($$0, List.of());
   }

   public static dsl a(csx $$0) {
      return a(dsd.a($$0));
   }

   public dfl a(cqr $$0, ase $$1, gw $$2) {
      for (dsl.a $$3 : this.c) {
         if ($$3.a().test($$0, $$2)) {
            return $$3.b().a($$1, $$2);
         }
      }

      return this.b.a($$1, $$2);
   }

   public dsd a() {
      return this.b;
   }

   public List<dsl.a> b() {
      return this.c;
   }

   public static record a(dmb b, dsd c) {
      public static final Codec<dsl.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dmb.b.fieldOf("if_true").forGetter(dsl.a::a), dsd.a.fieldOf("then").forGetter(dsl.a::b)).apply($$0, dsl.a::new)
      );

      public dmb a() {
         return this.b;
      }

      public dsd b() {
         return this.c;
      }
   }
}
