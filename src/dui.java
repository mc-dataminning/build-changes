import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dui(dua b, List<dui.a> c) {
   public static final Codec<dui> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dua.a.fieldOf("fallback").forGetter(dui::a), dui.a.a.listOf().fieldOf("rules").forGetter(dui::b)).apply($$0, dui::new)
   );

   public static dui a(dua $$0) {
      return new dui($$0, List.of());
   }

   public static dui a(cva $$0) {
      return a(dua.a($$0));
   }

   public dhi a(csu $$0, ats $$1, ht $$2) {
      for (dui.a $$3 : this.c) {
         if ($$3.a().test($$0, $$2)) {
            return $$3.b().a($$1, $$2);
         }
      }

      return this.b.a($$1, $$2);
   }

   public dua a() {
      return this.b;
   }

   public List<dui.a> b() {
      return this.c;
   }

   public static record a(dny b, dua c) {
      public static final Codec<dui.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dny.b.fieldOf("if_true").forGetter(dui.a::a), dua.a.fieldOf("then").forGetter(dui.a::b)).apply($$0, dui.a::new)
      );

      public dny a() {
         return this.b;
      }

      public dua b() {
         return this.c;
      }
   }
}
