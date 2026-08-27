import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dzh(dyz b, List<dzh.a> c) {
   public static final Codec<dzh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dyz.a.fieldOf("fallback").forGetter(dzh::a), dzh.a.a.listOf().fieldOf("rules").forGetter(dzh::b)).apply($$0, dzh::new)
   );

   public static dzh a(dyz $$0) {
      return new dzh($$0, List.of());
   }

   public static dzh a(czf $$0) {
      return a(dyz.a($$0));
   }

   public dme a(cwz $$0, awt $$1, ib $$2) {
      for (dzh.a $$3 : this.c) {
         if ($$3.a().test($$0, $$2)) {
            return $$3.b().a($$1, $$2);
         }
      }

      return this.b.a($$1, $$2);
   }

   public dyz a() {
      return this.b;
   }

   public List<dzh.a> b() {
      return this.c;
   }

   public static record a(dsx b, dyz c) {
      public static final Codec<dzh.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dsx.b.fieldOf("if_true").forGetter(dzh.a::a), dyz.a.fieldOf("then").forGetter(dzh.a::b)).apply($$0, dzh.a::new)
      );

      public dsx a() {
         return this.b;
      }

      public dyz b() {
         return this.c;
      }
   }
}
