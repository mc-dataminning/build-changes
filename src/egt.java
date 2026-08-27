import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record egt(egl b, List<egt.a> c) {
   public static final Codec<egt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(egl.a.fieldOf("fallback").forGetter(egt::a), egt.a.a.listOf().fieldOf("rules").forGetter(egt::b)).apply($$0, egt::new)
   );

   public static egt a(egl $$0) {
      return new egt($$0, List.of());
   }

   public static egt a(dfc $$0) {
      return a(egl.a($$0));
   }

   public dtc a(dcv $$0, ayt $$1, ir $$2) {
      for (egt.a $$3 : this.c) {
         if ($$3.a().test($$0, $$2)) {
            return $$3.b().a($$1, $$2);
         }
      }

      return this.b.a($$1, $$2);
   }

   public egl a() {
      return this.b;
   }

   public List<egt.a> b() {
      return this.c;
   }

   public static record a(eab b, egl c) {
      public static final Codec<egt.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(eab.b.fieldOf("if_true").forGetter(egt.a::a), egl.a.fieldOf("then").forGetter(egt.a::b)).apply($$0, egt.a::new)
      );

      public eab a() {
         return this.b;
      }

      public egl b() {
         return this.c;
      }
   }
}
