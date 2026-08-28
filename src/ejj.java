import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ejj(ejb b, List<ejj.a> c) {
   public static final Codec<ejj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ejb.a.fieldOf("fallback").forGetter(ejj::a), ejj.a.a.listOf().fieldOf("rules").forGetter(ejj::b)).apply($$0, ejj::new)
   );

   public static ejj a(ejb $$0) {
      return new ejj($$0, List.of());
   }

   public static ejj a(diq $$0) {
      return a(ejb.a($$0));
   }

   public dvv a(dgk $$0, azu $$1, jh $$2) {
      for (ejj.a $$3 : this.c) {
         if ($$3.a().test($$0, $$2)) {
            return $$3.b().a($$1, $$2);
         }
      }

      return this.b.a($$1, $$2);
   }

   public ejb a() {
      return this.b;
   }

   public List<ejj.a> b() {
      return this.c;
   }

   public static record a(ecx b, ejb c) {
      public static final Codec<ejj.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ecx.b.fieldOf("if_true").forGetter(ejj.a::a), ejb.a.fieldOf("then").forGetter(ejj.a::b)).apply($$0, ejj.a::new)
      );

      public ecx a() {
         return this.b;
      }

      public ejb b() {
         return this.c;
      }
   }
}
