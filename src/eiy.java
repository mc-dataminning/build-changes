import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record eiy(eiq b, List<eiy.a> c) {
   public static final Codec<eiy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eiq.a.fieldOf("fallback").forGetter(eiy::a), eiy.a.a.listOf().fieldOf("rules").forGetter(eiy::b)).apply($$0, eiy::new)
   );

   public static eiy a(eiq $$0) {
      return new eiy($$0, List.of());
   }

   public static eiy a(die $$0) {
      return a(eiq.a($$0));
   }

   public dvj a(dfy $$0, azs $$1, jh $$2) {
      for (eiy.a $$3 : this.c) {
         if ($$3.a().test($$0, $$2)) {
            return $$3.b().a($$1, $$2);
         }
      }

      return this.b.a($$1, $$2);
   }

   public eiq a() {
      return this.b;
   }

   public List<eiy.a> b() {
      return this.c;
   }

   public static record a(ecm b, eiq c) {
      public static final Codec<eiy.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ecm.b.fieldOf("if_true").forGetter(eiy.a::a), eiq.a.fieldOf("then").forGetter(eiy.a::b)).apply($$0, eiy.a::new)
      );

      public ecm a() {
         return this.b;
      }

      public eiq b() {
         return this.c;
      }
   }
}
