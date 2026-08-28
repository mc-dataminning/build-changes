import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record eme(elw b, List<eme.a> c) {
   public static final Codec<eme> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(elw.a.fieldOf("fallback").forGetter(eme::a), eme.a.a.listOf().fieldOf("rules").forGetter(eme::b)).apply($$0, eme::new)
   );

   public static eme a(elw $$0) {
      return new eme($$0, List.of());
   }

   public static eme a(dku $$0) {
      return a(elw.a($$0));
   }

   public dym a(dio $$0, azs $$1, jj $$2) {
      for (eme.a $$3 : this.c) {
         if ($$3.a().test($$0, $$2)) {
            return $$3.b().a($$1, $$2);
         }
      }

      return this.b.a($$1, $$2);
   }

   public elw a() {
      return this.b;
   }

   public List<eme.a> b() {
      return this.c;
   }

   public static record a(efs b, elw c) {
      public static final Codec<eme.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(efs.b.fieldOf("if_true").forGetter(eme.a::a), elw.a.fieldOf("then").forGetter(eme.a::b)).apply($$0, eme.a::new)
      );

      public efs a() {
         return this.b;
      }

      public elw b() {
         return this.c;
      }
   }
}
