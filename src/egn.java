import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record egn(egf b, List<egn.a> c) {
   public static final Codec<egn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(egf.a.fieldOf("fallback").forGetter(egn::a), egn.a.a.listOf().fieldOf("rules").forGetter(egn::b)).apply($$0, egn::new)
   );

   public static egn a(egf $$0) {
      return new egn($$0, List.of());
   }

   public static egn a(dfw $$0) {
      return a(egf.a($$0));
   }

   public dta a(ddq $$0, ayv $$1, jd $$2) {
      for (egn.a $$3 : this.c) {
         if ($$3.a().test($$0, $$2)) {
            return $$3.b().a($$1, $$2);
         }
      }

      return this.b.a($$1, $$2);
   }

   public egf a() {
      return this.b;
   }

   public List<egn.a> b() {
      return this.c;
   }

   public static record a(eac b, egf c) {
      public static final Codec<egn.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(eac.b.fieldOf("if_true").forGetter(egn.a::a), egf.a.fieldOf("then").forGetter(egn.a::b)).apply($$0, egn.a::new)
      );

      public eac a() {
         return this.b;
      }

      public egf b() {
         return this.c;
      }
   }
}
