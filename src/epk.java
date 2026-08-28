import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record epk(epc b, List<epk.a> c) {
   public static final Codec<epk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(epc.a.fieldOf("fallback").forGetter(epk::a), epk.a.a.listOf().fieldOf("rules").forGetter(epk::b)).apply($$0, epk::new)
   );

   public static epk a(epc $$0) {
      return new epk($$0, List.of());
   }

   public static epk a(dno $$0) {
      return a(epc.a($$0));
   }

   public ebq a(dli $$0, bai $$1, iw $$2) {
      for (epk.a $$3 : this.c) {
         if ($$3.a().test($$0, $$2)) {
            return $$3.b().a($$1, $$2);
         }
      }

      return this.b.a($$1, $$2);
   }

   public epc a() {
      return this.b;
   }

   public List<epk.a> b() {
      return this.c;
   }

   public static record a(eiw b, epc c) {
      public static final Codec<epk.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(eiw.b.fieldOf("if_true").forGetter(epk.a::a), epc.a.fieldOf("then").forGetter(epk.a::b)).apply($$0, epk.a::new)
      );

      public eiw a() {
         return this.b;
      }

      public epc b() {
         return this.c;
      }
   }
}
