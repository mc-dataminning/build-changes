import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ekj(ekb b, List<ekj.a> c) {
   public static final Codec<ekj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ekb.a.fieldOf("fallback").forGetter(ekj::a), ekj.a.a.listOf().fieldOf("rules").forGetter(ekj::b)).apply($$0, ekj::new)
   );

   public static ekj a(ekb $$0) {
      return new ekj($$0, List.of());
   }

   public static ekj a(djk $$0) {
      return a(ekb.a($$0));
   }

   public dwv a(dhe $$0, azg $$1, ji $$2) {
      for (ekj.a $$3 : this.c) {
         if ($$3.a().test($$0, $$2)) {
            return $$3.b().a($$1, $$2);
         }
      }

      return this.b.a($$1, $$2);
   }

   public ekb a() {
      return this.b;
   }

   public List<ekj.a> b() {
      return this.c;
   }

   public static record a(edx b, ekb c) {
      public static final Codec<ekj.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(edx.b.fieldOf("if_true").forGetter(ekj.a::a), ekb.a.fieldOf("then").forGetter(ekj.a::b)).apply($$0, ekj.a::new)
      );

      public edx a() {
         return this.b;
      }

      public ekb b() {
         return this.c;
      }
   }
}
