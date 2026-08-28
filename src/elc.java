import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record elc(eku b, List<elc.a> c) {
   public static final Codec<elc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eku.a.fieldOf("fallback").forGetter(elc::a), elc.a.a.listOf().fieldOf("rules").forGetter(elc::b)).apply($$0, elc::new)
   );

   public static elc a(eku $$0) {
      return new elc($$0, List.of());
   }

   public static elc a(dkd $$0) {
      return a(eku.a($$0));
   }

   public dxo a(dhx $$0, bac $$1, jh $$2) {
      for (elc.a $$3 : this.c) {
         if ($$3.a().test($$0, $$2)) {
            return $$3.b().a($$1, $$2);
         }
      }

      return this.b.a($$1, $$2);
   }

   public eku a() {
      return this.b;
   }

   public List<elc.a> b() {
      return this.c;
   }

   public static record a(eeq b, eku c) {
      public static final Codec<elc.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(eeq.b.fieldOf("if_true").forGetter(elc.a::a), eku.a.fieldOf("then").forGetter(elc.a::b)).apply($$0, elc.a::new)
      );

      public eeq a() {
         return this.b;
      }

      public eku b() {
         return this.c;
      }
   }
}
