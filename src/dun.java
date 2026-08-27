import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dun(duf b, List<dun.a> c) {
   public static final Codec<dun> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(duf.a.fieldOf("fallback").forGetter(dun::a), dun.a.a.listOf().fieldOf("rules").forGetter(dun::b)).apply($$0, dun::new)
   );

   public static dun a(duf $$0) {
      return new dun($$0, List.of());
   }

   public static dun a(cvf $$0) {
      return a(duf.a($$0));
   }

   public dhn a(csz $$0, atw $$1, hx $$2) {
      for (dun.a $$3 : this.c) {
         if ($$3.a().test($$0, $$2)) {
            return $$3.b().a($$1, $$2);
         }
      }

      return this.b.a($$1, $$2);
   }

   public duf a() {
      return this.b;
   }

   public List<dun.a> b() {
      return this.c;
   }

   public static record a(dod b, duf c) {
      public static final Codec<dun.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dod.b.fieldOf("if_true").forGetter(dun.a::a), duf.a.fieldOf("then").forGetter(dun.a::b)).apply($$0, dun.a::new)
      );

      public dod a() {
         return this.b;
      }

      public duf b() {
         return this.c;
      }
   }
}
