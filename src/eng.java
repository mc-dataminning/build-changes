import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record eng(emy b, List<eng.a> c) {
   public static final Codec<eng> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(emy.a.fieldOf("fallback").forGetter(eng::a), eng.a.a.listOf().fieldOf("rules").forGetter(eng::b)).apply($$0, eng::new)
   );

   public static eng a(emy $$0) {
      return new eng($$0, List.of());
   }

   public static eng a(dlu $$0) {
      return a(emy.a($$0));
   }

   public dzo a(djo $$0, azt $$1, iu $$2) {
      for (eng.a $$3 : this.c) {
         if ($$3.a().test($$0, $$2)) {
            return $$3.b().a($$1, $$2);
         }
      }

      return this.b.a($$1, $$2);
   }

   public emy a() {
      return this.b;
   }

   public List<eng.a> b() {
      return this.c;
   }

   public static record a(egu b, emy c) {
      public static final Codec<eng.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(egu.b.fieldOf("if_true").forGetter(eng.a::a), emy.a.fieldOf("then").forGetter(eng.a::b)).apply($$0, eng.a::new)
      );

      public egu a() {
         return this.b;
      }

      public emy b() {
         return this.c;
      }
   }
}
