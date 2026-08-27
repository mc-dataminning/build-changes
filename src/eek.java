import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record eek(eec b, List<eek.a> c) {
   public static final Codec<eek> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eec.a.fieldOf("fallback").forGetter(eek::a), eek.a.a.listOf().fieldOf("rules").forGetter(eek::b)).apply($$0, eek::new)
   );

   public static eek a(eec $$0) {
      return new eek($$0, List.of());
   }

   public static eek a(ddy $$0) {
      return a(eec.a($$0));
   }

   public drb a(dbs $$0, ayk $$1, io $$2) {
      for (eek.a $$3 : this.c) {
         if ($$3.a().test($$0, $$2)) {
            return $$3.b().a($$1, $$2);
         }
      }

      return this.b.a($$1, $$2);
   }

   public eec a() {
      return this.b;
   }

   public List<eek.a> b() {
      return this.c;
   }

   public static record a(dya b, eec c) {
      public static final Codec<eek.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dya.b.fieldOf("if_true").forGetter(eek.a::a), eec.a.fieldOf("then").forGetter(eek.a::b)).apply($$0, eek.a::new)
      );

      public dya a() {
         return this.b;
      }

      public eec b() {
         return this.c;
      }
   }
}
