import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record eol(eod b, List<eol.a> c) {
   public static final Codec<eol> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(eod.a.fieldOf("fallback").forGetter(eol::a), eol.a.a.listOf().fieldOf("rules").forGetter(eol::b)).apply($$0, eol::new)
   );

   public static eol a(eod $$0) {
      return new eol($$0, List.of());
   }

   public static eol a(dmr $$0) {
      return a(eod.a($$0));
   }

   public eat a(dkl $$0, azv $$1, iv $$2) {
      for (eol.a $$3 : this.c) {
         if ($$3.a().test($$0, $$2)) {
            return $$3.b().a($$1, $$2);
         }
      }

      return this.b.a($$1, $$2);
   }

   public eod a() {
      return this.b;
   }

   public List<eol.a> b() {
      return this.c;
   }

   public static record a(ehz b, eod c) {
      public static final Codec<eol.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(ehz.b.fieldOf("if_true").forGetter(eol.a::a), eod.a.fieldOf("then").forGetter(eol.a::b)).apply($$0, eol.a::new)
      );

      public ehz a() {
         return this.b;
      }

      public eod b() {
         return this.c;
      }
   }
}
