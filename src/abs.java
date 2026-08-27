import com.mojang.brigadier.context.StringRange;
import com.mojang.brigadier.suggestion.Suggestion;
import com.mojang.brigadier.suggestion.Suggestions;
import java.util.List;
import java.util.Optional;

public record abs(int b, int c, int d, List<abs.a> e) implements yp<aba> {
   public static final yg<vt, abs> a = yg.a(ye.f, abs::e, ye.f, abs::f, ye.f, abs::g, abs.a.a.a(ye.a()), abs::h, abs::new);

   public abs(int $$0, Suggestions $$1) {
      this(
         $$0,
         $$1.getRange().getStart(),
         $$1.getRange().getLength(),
         $$1.getList().stream().map($$0x -> new abs.a($$0x.getText(), Optional.ofNullable($$0x.getTooltip()).map(wl::a))).toList()
      );
   }

   @Override
   public yr<abs> a() {
      return afl.r;
   }

   public void a(aba $$0) {
      $$0.a(this);
   }

   public Suggestions b() {
      StringRange $$0 = StringRange.between(this.c, this.c + this.d);
      return new Suggestions($$0, this.e.stream().map($$1 -> new Suggestion($$0, $$1.a(), $$1.b().orElse(null))).toList());
   }

   public int e() {
      return this.b;
   }

   public int f() {
      return this.c;
   }

   public int g() {
      return this.d;
   }

   public List<abs.a> h() {
      return this.e;
   }

   public static record a(String b, Optional<wi> c) {
      public static final yg<vt, abs.a> a = yg.a(ye.k, abs.a::a, wk.e, abs.a::b, abs.a::new);

      public String a() {
         return this.b;
      }

      public Optional<wi> b() {
         return this.c;
      }
   }
}
