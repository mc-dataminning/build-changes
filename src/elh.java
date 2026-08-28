import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record elh(ekz b, List<elh.a> c) {
   public static final Codec<elh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ekz.a.fieldOf("fallback").forGetter(elh::a), elh.a.a.listOf().fieldOf("rules").forGetter(elh::b)).apply($$0, elh::new)
   );

   public static elh a(ekz $$0) {
      return new elh($$0, List.of());
   }

   public static elh a(dke $$0) {
      return a(ekz.a($$0));
   }

   public dxq a(dhy $$0, azh $$1, ji $$2) {
      for (elh.a $$3 : this.c) {
         if ($$3.a().test($$0, $$2)) {
            return $$3.b().a($$1, $$2);
         }
      }

      return this.b.a($$1, $$2);
   }

   public ekz a() {
      return this.b;
   }

   public List<elh.a> b() {
      return this.c;
   }

   public static record a(eev b, ekz c) {
      public static final Codec<elh.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(eev.b.fieldOf("if_true").forGetter(elh.a::a), ekz.a.fieldOf("then").forGetter(elh.a::b)).apply($$0, elh.a::new)
      );

      public eev a() {
         return this.b;
      }

      public ekz b() {
         return this.c;
      }
   }
}
