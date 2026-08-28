import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record efj(efb b, List<efj.a> c) {
   public static final Codec<efj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(efb.a.fieldOf("fallback").forGetter(efj::a), efj.a.a.listOf().fieldOf("rules").forGetter(efj::b)).apply($$0, efj::new)
   );

   public static efj a(efb $$0) {
      return new efj($$0, List.of());
   }

   public static efj a(dex $$0) {
      return a(efb.a($$0));
   }

   public dsa a(dcr $$0, azf $$1, iz $$2) {
      for (efj.a $$3 : this.c) {
         if ($$3.a().test($$0, $$2)) {
            return $$3.b().a($$1, $$2);
         }
      }

      return this.b.a($$1, $$2);
   }

   public efb a() {
      return this.b;
   }

   public List<efj.a> b() {
      return this.c;
   }

   public static record a(dyz b, efb c) {
      public static final Codec<efj.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dyz.b.fieldOf("if_true").forGetter(efj.a::a), efb.a.fieldOf("then").forGetter(efj.a::b)).apply($$0, efj.a::new)
      );

      public dyz a() {
         return this.b;
      }

      public efb b() {
         return this.c;
      }
   }
}
