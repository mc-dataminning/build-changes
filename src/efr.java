import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record efr(efj b, List<efr.a> c) {
   public static final Codec<efr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(efj.a.fieldOf("fallback").forGetter(efr::a), efr.a.a.listOf().fieldOf("rules").forGetter(efr::b)).apply($$0, efr::new)
   );

   public static efr a(efj $$0) {
      return new efr($$0, List.of());
   }

   public static efr a(dff $$0) {
      return a(efj.a($$0));
   }

   public dsh a(dcz $$0, aym $$1, ja $$2) {
      for (efr.a $$3 : this.c) {
         if ($$3.a().test($$0, $$2)) {
            return $$3.b().a($$1, $$2);
         }
      }

      return this.b.a($$1, $$2);
   }

   public efj a() {
      return this.b;
   }

   public List<efr.a> b() {
      return this.c;
   }

   public static record a(dzg b, efj c) {
      public static final Codec<efr.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dzg.b.fieldOf("if_true").forGetter(efr.a::a), efj.a.fieldOf("then").forGetter(efr.a::b)).apply($$0, efr.a::new)
      );

      public dzg a() {
         return this.b;
      }

      public efj b() {
         return this.c;
      }
   }
}
