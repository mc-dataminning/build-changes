import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ecr(ecj b, List<ecr.a> c) {
   public static final Codec<ecr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ecj.a.fieldOf("fallback").forGetter(ecr::a), ecr.a.a.listOf().fieldOf("rules").forGetter(ecr::b)).apply($$0, ecr::new)
   );

   public static ecr a(ecj $$0) {
      return new ecr($$0, List.of());
   }

   public static ecr a(dch $$0) {
      return a(ecj.a($$0));
   }

   public dpi a(dab $$0, axt $$1, id $$2) {
      for (ecr.a $$3 : this.c) {
         if ($$3.a().test($$0, $$2)) {
            return $$3.b().a($$1, $$2);
         }
      }

      return this.b.a($$1, $$2);
   }

   public ecj a() {
      return this.b;
   }

   public List<ecr.a> b() {
      return this.c;
   }

   public static record a(dwh b, ecj c) {
      public static final Codec<ecr.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dwh.b.fieldOf("if_true").forGetter(ecr.a::a), ecj.a.fieldOf("then").forGetter(ecr.a::b)).apply($$0, ecr.a::new)
      );

      public dwh a() {
         return this.b;
      }

      public ecj b() {
         return this.c;
      }
   }
}
