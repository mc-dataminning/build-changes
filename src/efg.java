import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record efg(eey b, List<efg.a> c) {
   public static final Codec<efg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eey.a.fieldOf("fallback").forGetter(efg::a), efg.a.a.listOf().fieldOf("rules").forGetter(efg::b)).apply($$0, efg::new)
   );

   public static efg a(eey $$0) {
      return new efg($$0, List.of());
   }

   public static efg a(deu $$0) {
      return a(eey.a($$0));
   }

   public drx a(dco $$0, azc $$1, iz $$2) {
      for (efg.a $$3 : this.c) {
         if ($$3.a().test($$0, $$2)) {
            return $$3.b().a($$1, $$2);
         }
      }

      return this.b.a($$1, $$2);
   }

   public eey a() {
      return this.b;
   }

   public List<efg.a> b() {
      return this.c;
   }

   public static record a(dyw b, eey c) {
      public static final Codec<efg.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dyw.b.fieldOf("if_true").forGetter(efg.a::a), eey.a.fieldOf("then").forGetter(efg.a::b)).apply($$0, efg.a::new)
      );

      public dyw a() {
         return this.b;
      }

      public eey b() {
         return this.c;
      }
   }
}
