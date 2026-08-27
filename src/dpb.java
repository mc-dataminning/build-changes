import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dpb(dot b, List<dpb.a> c) {
   public static final Codec<dpb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dot.a.fieldOf("fallback").forGetter(dpb::a), dpb.a.a.listOf().fieldOf("rules").forGetter(dpb::b)).apply($$0, dpb::new)
   );

   public static dpb a(dot $$0) {
      return new dpb($$0, List.of());
   }

   public static dpb a(cpn $$0) {
      return a(dot.a($$0));
   }

   public dcb a(cng $$0, apf $$1, gu $$2) {
      for (dpb.a $$3 : this.c) {
         if ($$3.a().test($$0, $$2)) {
            return $$3.b().a($$1, $$2);
         }
      }

      return this.b.a($$1, $$2);
   }

   public dot a() {
      return this.b;
   }

   public List<dpb.a> b() {
      return this.c;
   }

   public static record a(dir b, dot c) {
      public static final Codec<dpb.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dir.b.fieldOf("if_true").forGetter(dpb.a::a), dot.a.fieldOf("then").forGetter(dpb.a::b)).apply($$0, dpb.a::new)
      );

      public dir a() {
         return this.b;
      }

      public dot b() {
         return this.c;
      }
   }
}
