import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ekk(ekc b, List<ekk.a> c) {
   public static final Codec<ekk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ekc.a.fieldOf("fallback").forGetter(ekk::a), ekk.a.a.listOf().fieldOf("rules").forGetter(ekk::b)).apply($$0, ekk::new)
   );

   public static ekk a(ekc $$0) {
      return new ekk($$0, List.of());
   }

   public static ekk a(djl $$0) {
      return a(ekc.a($$0));
   }

   public dww a(dhf $$0, azh $$1, ji $$2) {
      for (ekk.a $$3 : this.c) {
         if ($$3.a().test($$0, $$2)) {
            return $$3.b().a($$1, $$2);
         }
      }

      return this.b.a($$1, $$2);
   }

   public ekc a() {
      return this.b;
   }

   public List<ekk.a> b() {
      return this.c;
   }

   public static record a(edy b, ekc c) {
      public static final Codec<ekk.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(edy.b.fieldOf("if_true").forGetter(ekk.a::a), ekc.a.fieldOf("then").forGetter(ekk.a::b)).apply($$0, ekk.a::new)
      );

      public edy a() {
         return this.b;
      }

      public ekc b() {
         return this.c;
      }
   }
}
