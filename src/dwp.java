import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dwp(dwh b, List<dwp.a> c) {
   public static final Codec<dwp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dwh.a.fieldOf("fallback").forGetter(dwp::a), dwp.a.a.listOf().fieldOf("rules").forGetter(dwp::b)).apply($$0, dwp::new)
   );

   public static dwp a(dwh $$0) {
      return new dwp($$0, List.of());
   }

   public static dwp a(cwy $$0) {
      return a(dwh.a($$0));
   }

   public djp a(cus $$0, auw $$1, hx $$2) {
      for (dwp.a $$3 : this.c) {
         if ($$3.a().test($$0, $$2)) {
            return $$3.b().a($$1, $$2);
         }
      }

      return this.b.a($$1, $$2);
   }

   public dwh a() {
      return this.b;
   }

   public List<dwp.a> b() {
      return this.c;
   }

   public static record a(dqf b, dwh c) {
      public static final Codec<dwp.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dqf.b.fieldOf("if_true").forGetter(dwp.a::a), dwh.a.fieldOf("then").forGetter(dwp.a::b)).apply($$0, dwp.a::new)
      );

      public dqf a() {
         return this.b;
      }

      public dwh b() {
         return this.c;
      }
   }
}
