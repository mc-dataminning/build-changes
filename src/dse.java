import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dse(drw b, List<dse.a> c) {
   public static final Codec<dse> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(drw.a.fieldOf("fallback").forGetter(dse::a), dse.a.a.listOf().fieldOf("rules").forGetter(dse::b)).apply($$0, dse::new)
   );

   public static dse a(drw $$0) {
      return new dse($$0, List.of());
   }

   public static dse a(csq $$0) {
      return a(drw.a($$0));
   }

   public dfe a(cqk $$0, arx $$1, gw $$2) {
      for (dse.a $$3 : this.c) {
         if ($$3.a().test($$0, $$2)) {
            return $$3.b().a($$1, $$2);
         }
      }

      return this.b.a($$1, $$2);
   }

   public drw a() {
      return this.b;
   }

   public List<dse.a> b() {
      return this.c;
   }

   public static record a(dlu b, drw c) {
      public static final Codec<dse.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dlu.b.fieldOf("if_true").forGetter(dse.a::a), drw.a.fieldOf("then").forGetter(dse.a::b)).apply($$0, dse.a::new)
      );

      public dlu a() {
         return this.b;
      }

      public drw b() {
         return this.c;
      }
   }
}
