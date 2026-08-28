import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record egr(egj b, List<egr.a> c) {
   public static final Codec<egr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(egj.a.fieldOf("fallback").forGetter(egr::a), egr.a.a.listOf().fieldOf("rules").forGetter(egr::b)).apply($$0, egr::new)
   );

   public static egr a(egj $$0) {
      return new egr($$0, List.of());
   }

   public static egr a(dfy $$0) {
      return a(egj.a($$0));
   }

   public dtc a(dds $$0, ayw $$1, jd $$2) {
      for (egr.a $$3 : this.c) {
         if ($$3.a().test($$0, $$2)) {
            return $$3.b().a($$1, $$2);
         }
      }

      return this.b.a($$1, $$2);
   }

   public egj a() {
      return this.b;
   }

   public List<egr.a> b() {
      return this.c;
   }

   public static record a(eaf b, egj c) {
      public static final Codec<egr.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(eaf.b.fieldOf("if_true").forGetter(egr.a::a), egj.a.fieldOf("then").forGetter(egr.a::b)).apply($$0, egr.a::new)
      );

      public eaf a() {
         return this.b;
      }

      public egj b() {
         return this.c;
      }
   }
}
