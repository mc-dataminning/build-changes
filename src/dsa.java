import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dsa(drs b, List<dsa.a> c) {
   public static final Codec<dsa> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(drs.a.fieldOf("fallback").forGetter(dsa::a), dsa.a.a.listOf().fieldOf("rules").forGetter(dsa::b)).apply($$0, dsa::new)
   );

   public static dsa a(drs $$0) {
      return new dsa($$0, List.of());
   }

   public static dsa a(csm $$0) {
      return a(drs.a($$0));
   }

   public dfa a(cqg $$0, aru $$1, gu $$2) {
      for (dsa.a $$3 : this.c) {
         if ($$3.a().test($$0, $$2)) {
            return $$3.b().a($$1, $$2);
         }
      }

      return this.b.a($$1, $$2);
   }

   public drs a() {
      return this.b;
   }

   public List<dsa.a> b() {
      return this.c;
   }

   public static record a(dlq b, drs c) {
      public static final Codec<dsa.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dlq.b.fieldOf("if_true").forGetter(dsa.a::a), drs.a.fieldOf("then").forGetter(dsa.a::b)).apply($$0, dsa.a::new)
      );

      public dlq a() {
         return this.b;
      }

      public drs b() {
         return this.c;
      }
   }
}
