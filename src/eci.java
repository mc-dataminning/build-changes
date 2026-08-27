import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record eci(eca b, List<eci.a> c) {
   public static final Codec<eci> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eca.a.fieldOf("fallback").forGetter(eci::a), eci.a.a.listOf().fieldOf("rules").forGetter(eci::b)).apply($$0, eci::new)
   );

   public static eci a(eca $$0) {
      return new eci($$0, List.of());
   }

   public static eci a(dby $$0) {
      return a(eca.a($$0));
   }

   public doz a(czs $$0, axr $$1, ib $$2) {
      for (eci.a $$3 : this.c) {
         if ($$3.a().test($$0, $$2)) {
            return $$3.b().a($$1, $$2);
         }
      }

      return this.b.a($$1, $$2);
   }

   public eca a() {
      return this.b;
   }

   public List<eci.a> b() {
      return this.c;
   }

   public static record a(dvy b, eca c) {
      public static final Codec<eci.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dvy.b.fieldOf("if_true").forGetter(eci.a::a), eca.a.fieldOf("then").forGetter(eci.a::b)).apply($$0, eci.a::new)
      );

      public dvy a() {
         return this.b;
      }

      public eca b() {
         return this.c;
      }
   }
}
