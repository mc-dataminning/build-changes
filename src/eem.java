import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record eem(eee b, List<eem.a> c) {
   public static final Codec<eem> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eee.a.fieldOf("fallback").forGetter(eem::a), eem.a.a.listOf().fieldOf("rules").forGetter(eem::b)).apply($$0, eem::new)
   );

   public static eem a(eee $$0) {
      return new eem($$0, List.of());
   }

   public static eem a(dea $$0) {
      return a(eee.a($$0));
   }

   public drd a(dbu $$0, aym $$1, io $$2) {
      for (eem.a $$3 : this.c) {
         if ($$3.a().test($$0, $$2)) {
            return $$3.b().a($$1, $$2);
         }
      }

      return this.b.a($$1, $$2);
   }

   public eee a() {
      return this.b;
   }

   public List<eem.a> b() {
      return this.c;
   }

   public static record a(dyc b, eee c) {
      public static final Codec<eem.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dyc.b.fieldOf("if_true").forGetter(eem.a::a), eee.a.fieldOf("then").forGetter(eem.a::b)).apply($$0, eem.a::new)
      );

      public dyc a() {
         return this.b;
      }

      public eee b() {
         return this.c;
      }
   }
}
