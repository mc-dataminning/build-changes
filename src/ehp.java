import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ehp(ehh b, List<ehp.a> c) {
   public static final Codec<ehp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ehh.a.fieldOf("fallback").forGetter(ehp::a), ehp.a.a.listOf().fieldOf("rules").forGetter(ehp::b)).apply($$0, ehp::new)
   );

   public static ehp a(ehh $$0) {
      return new ehp($$0, List.of());
   }

   public static ehp a(dgv $$0) {
      return a(ehh.a($$0));
   }

   public dua a(dep $$0, azk $$1, je $$2) {
      for (ehp.a $$3 : this.c) {
         if ($$3.a().test($$0, $$2)) {
            return $$3.b().a($$1, $$2);
         }
      }

      return this.b.a($$1, $$2);
   }

   public ehh a() {
      return this.b;
   }

   public List<ehp.a> b() {
      return this.c;
   }

   public static record a(ebd b, ehh c) {
      public static final Codec<ehp.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ebd.b.fieldOf("if_true").forGetter(ehp.a::a), ehh.a.fieldOf("then").forGetter(ehp.a::b)).apply($$0, ehp.a::new)
      );

      public ebd a() {
         return this.b;
      }

      public ehh b() {
         return this.c;
      }
   }
}
