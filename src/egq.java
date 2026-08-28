import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record egq(egi b, List<egq.a> c) {
   public static final Codec<egq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(egi.a.fieldOf("fallback").forGetter(egq::a), egq.a.a.listOf().fieldOf("rules").forGetter(egq::b)).apply($$0, egq::new)
   );

   public static egq a(egi $$0) {
      return new egq($$0, List.of());
   }

   public static egq a(dfy $$0) {
      return a(egi.a($$0));
   }

   public dtc a(dds $$0, ayw $$1, jd $$2) {
      for (egq.a $$3 : this.c) {
         if ($$3.a().test($$0, $$2)) {
            return $$3.b().a($$1, $$2);
         }
      }

      return this.b.a($$1, $$2);
   }

   public egi a() {
      return this.b;
   }

   public List<egq.a> b() {
      return this.c;
   }

   public static record a(eaf b, egi c) {
      public static final Codec<egq.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(eaf.b.fieldOf("if_true").forGetter(egq.a::a), egi.a.fieldOf("then").forGetter(egq.a::b)).apply($$0, egq.a::new)
      );

      public eaf a() {
         return this.b;
      }

      public egi b() {
         return this.c;
      }
   }
}
