import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dvp(dvh b, List<dvp.a> c) {
   public static final Codec<dvp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dvh.a.fieldOf("fallback").forGetter(dvp::a), dvp.a.a.listOf().fieldOf("rules").forGetter(dvp::b)).apply($$0, dvp::new)
   );

   public static dvp a(dvh $$0) {
      return new dvp($$0, List.of());
   }

   public static dvp a(cvz $$0) {
      return a(dvh.a($$0));
   }

   public dip a(ctt $$0, auf $$1, hv $$2) {
      for (dvp.a $$3 : this.c) {
         if ($$3.a().test($$0, $$2)) {
            return $$3.b().a($$1, $$2);
         }
      }

      return this.b.a($$1, $$2);
   }

   public dvh a() {
      return this.b;
   }

   public List<dvp.a> b() {
      return this.c;
   }

   public static record a(dpf b, dvh c) {
      public static final Codec<dvp.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dpf.b.fieldOf("if_true").forGetter(dvp.a::a), dvh.a.fieldOf("then").forGetter(dvp.a::b)).apply($$0, dvp.a::new)
      );

      public dpf a() {
         return this.b;
      }

      public dvh b() {
         return this.c;
      }
   }
}
