import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record eaf(dzx b, List<eaf.a> c) {
   public static final Codec<eaf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dzx.a.fieldOf("fallback").forGetter(eaf::a), eaf.a.a.listOf().fieldOf("rules").forGetter(eaf::b)).apply($$0, eaf::new)
   );

   public static eaf a(dzx $$0) {
      return new eaf($$0, List.of());
   }

   public static eaf a(dac $$0) {
      return a(dzx.a($$0));
   }

   public dnb a(cxw $$0, axd $$1, ib $$2) {
      for (eaf.a $$3 : this.c) {
         if ($$3.a().test($$0, $$2)) {
            return $$3.b().a($$1, $$2);
         }
      }

      return this.b.a($$1, $$2);
   }

   public dzx a() {
      return this.b;
   }

   public List<eaf.a> b() {
      return this.c;
   }

   public static record a(dtv b, dzx c) {
      public static final Codec<eaf.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dtv.b.fieldOf("if_true").forGetter(eaf.a::a), dzx.a.fieldOf("then").forGetter(eaf.a::b)).apply($$0, eaf.a::new)
      );

      public dtv a() {
         return this.b;
      }

      public dzx b() {
         return this.c;
      }
   }
}
