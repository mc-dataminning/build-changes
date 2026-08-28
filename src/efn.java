import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record efn(eff b, List<efn.a> c) {
   public static final Codec<efn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eff.a.fieldOf("fallback").forGetter(efn::a), efn.a.a.listOf().fieldOf("rules").forGetter(efn::b)).apply($$0, efn::new)
   );

   public static efn a(eff $$0) {
      return new efn($$0, List.of());
   }

   public static efn a(dfb $$0) {
      return a(eff.a($$0));
   }

   public dse a(dcv $$0, azh $$1, iz $$2) {
      for (efn.a $$3 : this.c) {
         if ($$3.a().test($$0, $$2)) {
            return $$3.b().a($$1, $$2);
         }
      }

      return this.b.a($$1, $$2);
   }

   public eff a() {
      return this.b;
   }

   public List<efn.a> b() {
      return this.c;
   }

   public static record a(dzd b, eff c) {
      public static final Codec<efn.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dzd.b.fieldOf("if_true").forGetter(efn.a::a), eff.a.fieldOf("then").forGetter(efn.a::b)).apply($$0, efn.a::new)
      );

      public dzd a() {
         return this.b;
      }

      public eff b() {
         return this.c;
      }
   }
}
