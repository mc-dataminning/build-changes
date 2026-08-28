import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record efm(efe b, List<efm.a> c) {
   public static final Codec<efm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(efe.a.fieldOf("fallback").forGetter(efm::a), efm.a.a.listOf().fieldOf("rules").forGetter(efm::b)).apply($$0, efm::new)
   );

   public static efm a(efe $$0) {
      return new efm($$0, List.of());
   }

   public static efm a(dfa $$0) {
      return a(efe.a($$0));
   }

   public dsd a(dcu $$0, azh $$1, iz $$2) {
      for (efm.a $$3 : this.c) {
         if ($$3.a().test($$0, $$2)) {
            return $$3.b().a($$1, $$2);
         }
      }

      return this.b.a($$1, $$2);
   }

   public efe a() {
      return this.b;
   }

   public List<efm.a> b() {
      return this.c;
   }

   public static record a(dzc b, efe c) {
      public static final Codec<efm.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dzc.b.fieldOf("if_true").forGetter(efm.a::a), efe.a.fieldOf("then").forGetter(efm.a::b)).apply($$0, efm.a::new)
      );

      public dzc a() {
         return this.b;
      }

      public efe b() {
         return this.c;
      }
   }
}
