import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record edq(edi b, List<edq.a> c) {
   public static final Codec<edq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(edi.a.fieldOf("fallback").forGetter(edq::a), edq.a.a.listOf().fieldOf("rules").forGetter(edq::b)).apply($$0, edq::new)
   );

   public static edq a(edi $$0) {
      return new edq($$0, List.of());
   }

   public static edq a(dde $$0) {
      return a(edi.a($$0));
   }

   public dqh a(day $$0, ayg $$1, in $$2) {
      for (edq.a $$3 : this.c) {
         if ($$3.a().test($$0, $$2)) {
            return $$3.b().a($$1, $$2);
         }
      }

      return this.b.a($$1, $$2);
   }

   public edi a() {
      return this.b;
   }

   public List<edq.a> b() {
      return this.c;
   }

   public static record a(dxg b, edi c) {
      public static final Codec<edq.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dxg.b.fieldOf("if_true").forGetter(edq.a::a), edi.a.fieldOf("then").forGetter(edq.a::b)).apply($$0, edq.a::new)
      );

      public dxg a() {
         return this.b;
      }

      public edi b() {
         return this.c;
      }
   }
}
