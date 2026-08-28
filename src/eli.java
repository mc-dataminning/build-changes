import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record eli(ela b, List<eli.a> c) {
   public static final Codec<eli> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ela.a.fieldOf("fallback").forGetter(eli::a), eli.a.a.listOf().fieldOf("rules").forGetter(eli::b)).apply($$0, eli::new)
   );

   public static eli a(ela $$0) {
      return new eli($$0, List.of());
   }

   public static eli a(dkl $$0) {
      return a(ela.a($$0));
   }

   public dxu a(dif $$0, bam $$1, jh $$2) {
      for (eli.a $$3 : this.c) {
         if ($$3.a().test($$0, $$2)) {
            return $$3.b().a($$1, $$2);
         }
      }

      return this.b.a($$1, $$2);
   }

   public ela a() {
      return this.b;
   }

   public List<eli.a> b() {
      return this.c;
   }

   public static record a(eew b, ela c) {
      public static final Codec<eli.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(eew.b.fieldOf("if_true").forGetter(eli.a::a), ela.a.fieldOf("then").forGetter(eli.a::b)).apply($$0, eli.a::new)
      );

      public eew a() {
         return this.b;
      }

      public ela b() {
         return this.c;
      }
   }
}
