import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dry(drq b, List<dry.a> c) {
   public static final Codec<dry> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(drq.a.fieldOf("fallback").forGetter(dry::a), dry.a.a.listOf().fieldOf("rules").forGetter(dry::b)).apply($$0, dry::new)
   );

   public static dry a(drq $$0) {
      return new dry($$0, List.of());
   }

   public static dry a(csk $$0) {
      return a(drq.a($$0));
   }

   public dey a(cqe $$0, art $$1, gv $$2) {
      for (dry.a $$3 : this.c) {
         if ($$3.a().test($$0, $$2)) {
            return $$3.b().a($$1, $$2);
         }
      }

      return this.b.a($$1, $$2);
   }

   public drq a() {
      return this.b;
   }

   public List<dry.a> b() {
      return this.c;
   }

   public static record a(dlo b, drq c) {
      public static final Codec<dry.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dlo.b.fieldOf("if_true").forGetter(dry.a::a), drq.a.fieldOf("then").forGetter(dry.a::b)).apply($$0, dry.a::new)
      );

      public dlo a() {
         return this.b;
      }

      public drq b() {
         return this.c;
      }
   }
}
