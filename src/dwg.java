import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dwg(dvy b, List<dwg.a> c) {
   public static final Codec<dwg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dvy.a.fieldOf("fallback").forGetter(dwg::a), dwg.a.a.listOf().fieldOf("rules").forGetter(dwg::b)).apply($$0, dwg::new)
   );

   public static dwg a(dvy $$0) {
      return new dwg($$0, List.of());
   }

   public static dwg a(cwp $$0) {
      return a(dvy.a($$0));
   }

   public djg a(cuj $$0, auu $$1, hx $$2) {
      for (dwg.a $$3 : this.c) {
         if ($$3.a().test($$0, $$2)) {
            return $$3.b().a($$1, $$2);
         }
      }

      return this.b.a($$1, $$2);
   }

   public dvy a() {
      return this.b;
   }

   public List<dwg.a> b() {
      return this.c;
   }

   public static record a(dpw b, dvy c) {
      public static final Codec<dwg.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dpw.b.fieldOf("if_true").forGetter(dwg.a::a), dvy.a.fieldOf("then").forGetter(dwg.a::b)).apply($$0, dwg.a::new)
      );

      public dpw a() {
         return this.b;
      }

      public dvy b() {
         return this.c;
      }
   }
}
