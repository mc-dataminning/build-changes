import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dsj(dsb b, List<dsj.a> c) {
   public static final Codec<dsj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dsb.a.fieldOf("fallback").forGetter(dsj::a), dsj.a.a.listOf().fieldOf("rules").forGetter(dsj::b)).apply($$0, dsj::new)
   );

   public static dsj a(dsb $$0) {
      return new dsj($$0, List.of());
   }

   public static dsj a(csv $$0) {
      return a(dsb.a($$0));
   }

   public dfj a(cqp $$0, asc $$1, gw $$2) {
      for (dsj.a $$3 : this.c) {
         if ($$3.a().test($$0, $$2)) {
            return $$3.b().a($$1, $$2);
         }
      }

      return this.b.a($$1, $$2);
   }

   public dsb a() {
      return this.b;
   }

   public List<dsj.a> b() {
      return this.c;
   }

   public static record a(dlz b, dsb c) {
      public static final Codec<dsj.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dlz.b.fieldOf("if_true").forGetter(dsj.a::a), dsb.a.fieldOf("then").forGetter(dsj.a::b)).apply($$0, dsj.a::new)
      );

      public dlz a() {
         return this.b;
      }

      public dsb b() {
         return this.c;
      }
   }
}
