import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record epa(eos b, List<epa.a> c) {
   public static final Codec<epa> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eos.a.fieldOf("fallback").forGetter(epa::a), epa.a.a.listOf().fieldOf("rules").forGetter(epa::b)).apply($$0, epa::new)
   );

   public static epa a(eos $$0) {
      return new epa($$0, List.of());
   }

   public static epa a(dne $$0) {
      return a(eos.a($$0));
   }

   public ebg a(dky $$0, azz $$1, iw $$2) {
      for (epa.a $$3 : this.c) {
         if ($$3.a().test($$0, $$2)) {
            return $$3.b().a($$1, $$2);
         }
      }

      return this.b.a($$1, $$2);
   }

   public eos a() {
      return this.b;
   }

   public List<epa.a> b() {
      return this.c;
   }

   public static record a(eim b, eos c) {
      public static final Codec<epa.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(eim.b.fieldOf("if_true").forGetter(epa.a::a), eos.a.fieldOf("then").forGetter(epa.a::b)).apply($$0, epa.a::new)
      );

      public eim a() {
         return this.b;
      }

      public eos b() {
         return this.c;
      }
   }
}
