import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record eoy(eoq b, List<eoy.a> c) {
   public static final Codec<eoy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eoq.a.fieldOf("fallback").forGetter(eoy::a), eoy.a.a.listOf().fieldOf("rules").forGetter(eoy::b)).apply($$0, eoy::new)
   );

   public static eoy a(eoq $$0) {
      return new eoy($$0, List.of());
   }

   public static eoy a(dnc $$0) {
      return a(eoq.a($$0));
   }

   public ebe a(dkw $$0, azx $$1, iv $$2) {
      for (eoy.a $$3 : this.c) {
         if ($$3.a().test($$0, $$2)) {
            return $$3.b().a($$1, $$2);
         }
      }

      return this.b.a($$1, $$2);
   }

   public eoq a() {
      return this.b;
   }

   public List<eoy.a> b() {
      return this.c;
   }

   public static record a(eik b, eoq c) {
      public static final Codec<eoy.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(eik.b.fieldOf("if_true").forGetter(eoy.a::a), eoq.a.fieldOf("then").forGetter(eoy.a::b)).apply($$0, eoy.a::new)
      );

      public eik a() {
         return this.b;
      }

      public eoq b() {
         return this.c;
      }
   }
}
