import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record ekl(ekd b, List<ekl.a> c) {
   public static final Codec<ekl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ekd.a.fieldOf("fallback").forGetter(ekl::a), ekl.a.a.listOf().fieldOf("rules").forGetter(ekl::b)).apply($$0, ekl::new)
   );

   public static ekl a(ekd $$0) {
      return new ekl($$0, List.of());
   }

   public static ekl a(djm $$0) {
      return a(ekd.a($$0));
   }

   public dwx a(dhg $$0, azh $$1, ji $$2) {
      for (ekl.a $$3 : this.c) {
         if ($$3.a().test($$0, $$2)) {
            return $$3.b().a($$1, $$2);
         }
      }

      return this.b.a($$1, $$2);
   }

   public ekd a() {
      return this.b;
   }

   public List<ekl.a> b() {
      return this.c;
   }

   public static record a(edz b, ekd c) {
      public static final Codec<ekl.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(edz.b.fieldOf("if_true").forGetter(ekl.a::a), ekd.a.fieldOf("then").forGetter(ekl.a::b)).apply($$0, ekl.a::new)
      );

      public edz a() {
         return this.b;
      }

      public ekd b() {
         return this.c;
      }
   }
}
