import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record enr(enj b, List<enr.a> c) {
   public static final Codec<enr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(enj.a.fieldOf("fallback").forGetter(enr::a), enr.a.a.listOf().fieldOf("rules").forGetter(enr::b)).apply($$0, enr::new)
   );

   public static enr a(enj $$0) {
      return new enr($$0, List.of());
   }

   public static enr a(dma $$0) {
      return a(enj.a($$0));
   }

   public dzz a(dju $$0, azv $$1, iu $$2) {
      for (enr.a $$3 : this.c) {
         if ($$3.a().test($$0, $$2)) {
            return $$3.b().a($$1, $$2);
         }
      }

      return this.b.a($$1, $$2);
   }

   public enj a() {
      return this.b;
   }

   public List<enr.a> b() {
      return this.c;
   }

   public static record a(ehf b, enj c) {
      public static final Codec<enr.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ehf.b.fieldOf("if_true").forGetter(enr.a::a), enj.a.fieldOf("then").forGetter(enr.a::b)).apply($$0, enr.a::new)
      );

      public ehf a() {
         return this.b;
      }

      public enj b() {
         return this.c;
      }
   }
}
