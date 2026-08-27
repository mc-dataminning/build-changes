import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record dtw(dto b, List<dtw.a> c) {
   public static final Codec<dtw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dto.a.fieldOf("fallback").forGetter(dtw::a), dtw.a.a.listOf().fieldOf("rules").forGetter(dtw::b)).apply($$0, dtw::new)
   );

   public static dtw a(dto $$0) {
      return new dtw($$0, List.of());
   }

   public static dtw a(cut $$0) {
      return a(dto.a($$0));
   }

   public dgw a(csm $$0, ato $$1, ht $$2) {
      for (dtw.a $$3 : this.c) {
         if ($$3.a().test($$0, $$2)) {
            return $$3.b().a($$1, $$2);
         }
      }

      return this.b.a($$1, $$2);
   }

   public dto a() {
      return this.b;
   }

   public List<dtw.a> b() {
      return this.c;
   }

   public static record a(dnm b, dto c) {
      public static final Codec<dtw.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(dnm.b.fieldOf("if_true").forGetter(dtw.a::a), dto.a.fieldOf("then").forGetter(dtw.a::b)).apply($$0, dtw.a::new)
      );

      public dnm a() {
         return this.b;
      }

      public dto b() {
         return this.c;
      }
   }
}
