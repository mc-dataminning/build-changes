import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record eog(eny b, List<eog.a> c) {
   public static final Codec<eog> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eny.a.fieldOf("fallback").forGetter(eog::a), eog.a.a.listOf().fieldOf("rules").forGetter(eog::b)).apply($$0, eog::new)
   );

   public static eog a(eny $$0) {
      return new eog($$0, List.of());
   }

   public static eog a(dmm $$0) {
      return a(eny.a($$0));
   }

   public eao a(dkg $$0, azv $$1, iv $$2) {
      for (eog.a $$3 : this.c) {
         if ($$3.a().test($$0, $$2)) {
            return $$3.b().a($$1, $$2);
         }
      }

      return this.b.a($$1, $$2);
   }

   public eny a() {
      return this.b;
   }

   public List<eog.a> b() {
      return this.c;
   }

   public static record a(ehu b, eny c) {
      public static final Codec<eog.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ehu.b.fieldOf("if_true").forGetter(eog.a::a), eny.a.fieldOf("then").forGetter(eog.a::b)).apply($$0, eog.a::new)
      );

      public ehu a() {
         return this.b;
      }

      public eny b() {
         return this.c;
      }
   }
}
