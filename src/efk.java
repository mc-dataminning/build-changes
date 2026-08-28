import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record efk(efc b, List<efk.a> c) {
   public static final Codec<efk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(efc.a.fieldOf("fallback").forGetter(efk::a), efk.a.a.listOf().fieldOf("rules").forGetter(efk::b)).apply($$0, efk::new)
   );

   public static efk a(efc $$0) {
      return new efk($$0, List.of());
   }

   public static efk a(dey $$0) {
      return a(efc.a($$0));
   }

   public dsb a(dcs $$0, azg $$1, iz $$2) {
      for (efk.a $$3 : this.c) {
         if ($$3.a().test($$0, $$2)) {
            return $$3.b().a($$1, $$2);
         }
      }

      return this.b.a($$1, $$2);
   }

   public efc a() {
      return this.b;
   }

   public List<efk.a> b() {
      return this.c;
   }

   public static record a(dza b, efc c) {
      public static final Codec<efk.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dza.b.fieldOf("if_true").forGetter(efk.a::a), efc.a.fieldOf("then").forGetter(efk.a::b)).apply($$0, efk.a::new)
      );

      public dza a() {
         return this.b;
      }

      public efc b() {
         return this.c;
      }
   }
}
