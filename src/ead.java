import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ead(dzv b, List<ead.a> c) {
   public static final Codec<ead> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dzv.a.fieldOf("fallback").forGetter(ead::a), ead.a.a.listOf().fieldOf("rules").forGetter(ead::b)).apply($$0, ead::new)
   );

   public static ead a(dzv $$0) {
      return new ead($$0, List.of());
   }

   public static ead a(daa $$0) {
      return a(dzv.a($$0));
   }

   public dmz a(cxu $$0, axd $$1, ib $$2) {
      for (ead.a $$3 : this.c) {
         if ($$3.a().test($$0, $$2)) {
            return $$3.b().a($$1, $$2);
         }
      }

      return this.b.a($$1, $$2);
   }

   public dzv a() {
      return this.b;
   }

   public List<ead.a> b() {
      return this.c;
   }

   public static record a(dtt b, dzv c) {
      public static final Codec<ead.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dtt.b.fieldOf("if_true").forGetter(ead.a::a), dzv.a.fieldOf("then").forGetter(ead.a::b)).apply($$0, ead.a::new)
      );

      public dtt a() {
         return this.b;
      }

      public dzv b() {
         return this.c;
      }
   }
}
