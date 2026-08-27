import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dym(dye b, List<dym.a> c) {
   public static final Codec<dym> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dye.a.fieldOf("fallback").forGetter(dym::a), dym.a.a.listOf().fieldOf("rules").forGetter(dym::b)).apply($$0, dym::new)
   );

   public static dym a(dye $$0) {
      return new dym($$0, List.of());
   }

   public static dym a(cys $$0) {
      return a(dye.a($$0));
   }

   public dlj a(cwm $$0, awp $$1, hz $$2) {
      for (dym.a $$3 : this.c) {
         if ($$3.a().test($$0, $$2)) {
            return $$3.b().a($$1, $$2);
         }
      }

      return this.b.a($$1, $$2);
   }

   public dye a() {
      return this.b;
   }

   public List<dym.a> b() {
      return this.c;
   }

   public static record a(dsc b, dye c) {
      public static final Codec<dym.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dsc.b.fieldOf("if_true").forGetter(dym.a::a), dye.a.fieldOf("then").forGetter(dym.a::b)).apply($$0, dym.a::new)
      );

      public dsc a() {
         return this.b;
      }

      public dye b() {
         return this.c;
      }
   }
}
