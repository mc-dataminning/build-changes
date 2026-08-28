import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ejc(eiu b, List<ejc.a> c) {
   public static final Codec<ejc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eiu.a.fieldOf("fallback").forGetter(ejc::a), ejc.a.a.listOf().fieldOf("rules").forGetter(ejc::b)).apply($$0, ejc::new)
   );

   public static ejc a(eiu $$0) {
      return new ejc($$0, List.of());
   }

   public static ejc a(dij $$0) {
      return a(eiu.a($$0));
   }

   public dvo a(dgd $$0, azv $$1, jh $$2) {
      for (ejc.a $$3 : this.c) {
         if ($$3.a().test($$0, $$2)) {
            return $$3.b().a($$1, $$2);
         }
      }

      return this.b.a($$1, $$2);
   }

   public eiu a() {
      return this.b;
   }

   public List<ejc.a> b() {
      return this.c;
   }

   public static record a(ecq b, eiu c) {
      public static final Codec<ejc.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ecq.b.fieldOf("if_true").forGetter(ejc.a::a), eiu.a.fieldOf("then").forGetter(ejc.a::b)).apply($$0, ejc.a::new)
      );

      public ecq a() {
         return this.b;
      }

      public eiu b() {
         return this.c;
      }
   }
}
