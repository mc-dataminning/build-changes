import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record eih(ehz b, List<eih.a> c) {
   public static final Codec<eih> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ehz.a.fieldOf("fallback").forGetter(eih::a), eih.a.a.listOf().fieldOf("rules").forGetter(eih::b)).apply($$0, eih::new)
   );

   public static eih a(ehz $$0) {
      return new eih($$0, List.of());
   }

   public static eih a(dhm $$0) {
      return a(ehz.a($$0));
   }

   public dus a(dfg $$0, azn $$1, jf $$2) {
      for (eih.a $$3 : this.c) {
         if ($$3.a().test($$0, $$2)) {
            return $$3.b().a($$1, $$2);
         }
      }

      return this.b.a($$1, $$2);
   }

   public ehz a() {
      return this.b;
   }

   public List<eih.a> b() {
      return this.c;
   }

   public static record a(ebv b, ehz c) {
      public static final Codec<eih.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ebv.b.fieldOf("if_true").forGetter(eih.a::a), ehz.a.fieldOf("then").forGetter(eih.a::b)).apply($$0, eih.a::new)
      );

      public ebv a() {
         return this.b;
      }

      public ehz b() {
         return this.c;
      }
   }
}
