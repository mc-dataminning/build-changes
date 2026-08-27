import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dsd(drv b, List<dsd.a> c) {
   public static final Codec<dsd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(drv.a.fieldOf("fallback").forGetter(dsd::a), dsd.a.a.listOf().fieldOf("rules").forGetter(dsd::b)).apply($$0, dsd::new)
   );

   public static dsd a(drv $$0) {
      return new dsd($$0, List.of());
   }

   public static dsd a(ctc $$0) {
      return a(drv.a($$0));
   }

   public dfd a(cqv $$0, ash $$1, gw $$2) {
      for (dsd.a $$3 : this.c) {
         if ($$3.a().test($$0, $$2)) {
            return $$3.b().a($$1, $$2);
         }
      }

      return this.b.a($$1, $$2);
   }

   public drv a() {
      return this.b;
   }

   public List<dsd.a> b() {
      return this.c;
   }

   public static record a(dlt b, drv c) {
      public static final Codec<dsd.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dlt.b.fieldOf("if_true").forGetter(dsd.a::a), drv.a.fieldOf("then").forGetter(dsd.a::b)).apply($$0, dsd.a::new)
      );

      public dlt a() {
         return this.b;
      }

      public drv b() {
         return this.c;
      }
   }
}
