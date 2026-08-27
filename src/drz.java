import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record drz(drr b, List<drz.a> c) {
   public static final Codec<drz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(drr.a.fieldOf("fallback").forGetter(drz::a), drz.a.a.listOf().fieldOf("rules").forGetter(drz::b)).apply($$0, drz::new)
   );

   public static drz a(drr $$0) {
      return new drz($$0, List.of());
   }

   public static drz a(csl $$0) {
      return a(drr.a($$0));
   }

   public dez a(cqf $$0, aru $$1, gu $$2) {
      for (drz.a $$3 : this.c) {
         if ($$3.a().test($$0, $$2)) {
            return $$3.b().a($$1, $$2);
         }
      }

      return this.b.a($$1, $$2);
   }

   public drr a() {
      return this.b;
   }

   public List<drz.a> b() {
      return this.c;
   }

   public static record a(dlp b, drr c) {
      public static final Codec<drz.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dlp.b.fieldOf("if_true").forGetter(drz.a::a), drr.a.fieldOf("then").forGetter(drz.a::b)).apply($$0, drz.a::new)
      );

      public dlp a() {
         return this.b;
      }

      public drr b() {
         return this.c;
      }
   }
}
