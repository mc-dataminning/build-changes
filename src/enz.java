import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record enz(enr b, List<enz.a> c) {
   public static final Codec<enz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(enr.a.fieldOf("fallback").forGetter(enz::a), enz.a.a.listOf().fieldOf("rules").forGetter(enz::b)).apply($$0, enz::new)
   );

   public static enz a(enr $$0) {
      return new enz($$0, List.of());
   }

   public static enz a(dmf $$0) {
      return a(enr.a($$0));
   }

   public eah a(djz $$0, azv $$1, iu $$2) {
      for (enz.a $$3 : this.c) {
         if ($$3.a().test($$0, $$2)) {
            return $$3.b().a($$1, $$2);
         }
      }

      return this.b.a($$1, $$2);
   }

   public enr a() {
      return this.b;
   }

   public List<enz.a> b() {
      return this.c;
   }

   public static record a(ehn b, enr c) {
      public static final Codec<enz.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ehn.b.fieldOf("if_true").forGetter(enz.a::a), enr.a.fieldOf("then").forGetter(enz.a::b)).apply($$0, enz.a::new)
      );

      public ehn a() {
         return this.b;
      }

      public enr b() {
         return this.c;
      }
   }
}
