import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dwh(dvz b, List<dwh.a> c) {
   public static final Codec<dwh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dvz.a.fieldOf("fallback").forGetter(dwh::a), dwh.a.a.listOf().fieldOf("rules").forGetter(dwh::b)).apply($$0, dwh::new)
   );

   public static dwh a(dvz $$0) {
      return new dwh($$0, List.of());
   }

   public static dwh a(cwq $$0) {
      return a(dvz.a($$0));
   }

   public djh a(cuk $$0, auv $$1, hx $$2) {
      for (dwh.a $$3 : this.c) {
         if ($$3.a().test($$0, $$2)) {
            return $$3.b().a($$1, $$2);
         }
      }

      return this.b.a($$1, $$2);
   }

   public dvz a() {
      return this.b;
   }

   public List<dwh.a> b() {
      return this.c;
   }

   public static record a(dpx b, dvz c) {
      public static final Codec<dwh.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dpx.b.fieldOf("if_true").forGetter(dwh.a::a), dvz.a.fieldOf("then").forGetter(dwh.a::b)).apply($$0, dwh.a::new)
      );

      public dpx a() {
         return this.b;
      }

      public dvz b() {
         return this.c;
      }
   }
}
