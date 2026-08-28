import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record eid(ehv b, List<eid.a> c) {
   public static final Codec<eid> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ehv.a.fieldOf("fallback").forGetter(eid::a), eid.a.a.listOf().fieldOf("rules").forGetter(eid::b)).apply($$0, eid::new)
   );

   public static eid a(ehv $$0) {
      return new eid($$0, List.of());
   }

   public static eid a(dhj $$0) {
      return a(ehv.a($$0));
   }

   public duo a(dfd $$0, azl $$1, je $$2) {
      for (eid.a $$3 : this.c) {
         if ($$3.a().test($$0, $$2)) {
            return $$3.b().a($$1, $$2);
         }
      }

      return this.b.a($$1, $$2);
   }

   public ehv a() {
      return this.b;
   }

   public List<eid.a> b() {
      return this.c;
   }

   public static record a(ebr b, ehv c) {
      public static final Codec<eid.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ebr.b.fieldOf("if_true").forGetter(eid.a::a), ehv.a.fieldOf("then").forGetter(eid.a::b)).apply($$0, eid.a::new)
      );

      public ebr a() {
         return this.b;
      }

      public ehv b() {
         return this.c;
      }
   }
}
