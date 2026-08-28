import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record eis(eik b, List<eis.a> c) {
   public static final Codec<eis> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eik.a.fieldOf("fallback").forGetter(eis::a), eis.a.a.listOf().fieldOf("rules").forGetter(eis::b)).apply($$0, eis::new)
   );

   public static eis a(eik $$0) {
      return new eis($$0, List.of());
   }

   public static eis a(dhy $$0) {
      return a(eik.a($$0));
   }

   public dvd a(dfs $$0, azr $$1, jg $$2) {
      for (eis.a $$3 : this.c) {
         if ($$3.a().test($$0, $$2)) {
            return $$3.b().a($$1, $$2);
         }
      }

      return this.b.a($$1, $$2);
   }

   public eik a() {
      return this.b;
   }

   public List<eis.a> b() {
      return this.c;
   }

   public static record a(ecg b, eik c) {
      public static final Codec<eis.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ecg.b.fieldOf("if_true").forGetter(eis.a::a), eik.a.fieldOf("then").forGetter(eis.a::b)).apply($$0, eis.a::new)
      );

      public ecg a() {
         return this.b;
      }

      public eik b() {
         return this.c;
      }
   }
}
